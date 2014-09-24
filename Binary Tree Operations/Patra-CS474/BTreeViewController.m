//
//  BTreeViewController.m
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import "BTreeViewController.h"
#import "BTOperations.h"
@interface BTreeViewController ()


@end

@implementation BTreeViewController
@synthesize btree1;
@synthesize btree2;
@synthesize tmp;

- (void)viewDidLoad
{
    [super viewDidLoad];
	
    btree1= [[BTOperations alloc]init];
    btree2= [[BTOperations alloc]init];
    tmp= [[BTOperations alloc]init];

}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)addElement:(id)sender {
    
    
    int inputElement;
    inputElement=[_input.text integerValue];
    
    if(inputElement==nil)
    {
        UIAlertView *alert = [[UIAlertView alloc] initWithTitle:@"Alert" message:@"Element required to insert element into S1" delegate:self cancelButtonTitle:@"Cancel" otherButtonTitles:@"OK", nil];
        [alert show];
        _input.text = nil;
    } else
        [btree1 add:inputElement];
        _input.text = nil;
    }

    
    
    

- (void)displaySet{
    _output.text = [NSString stringWithFormat:@"%@%@%@%@%@",[NSString stringWithFormat:@"Set1 : "], [btree1 inOrder], [NSString stringWithFormat:@"    "], [NSString stringWithFormat:@"Set2 : "], [btree2 inOrder]];
    
}
- (IBAction)displaySet:(id)sender {
    [self displaySet];

    
}
- (IBAction)clear:(id)sender {
    btree1 =[[BTOperations alloc]init];
    _output.text = nil;
    
    
}
- (IBAction)save:(id)sender {
    int element;
    id arrayElem;
    btree2 = [[BTOperations alloc]init];
    NSString *set1String = [btree1 inOrder];
    NSArray *set1Array = [set1String componentsSeparatedByString:@" "];
    for( element=0 ; element< [set1Array count]; element++)
    {
        arrayElem = [set1Array objectAtIndex:element];
        if ([arrayElem  isEqual: @""]) {
            
        } else {
            [btree2 add:[arrayElem integerValue]];
        }
        
    }
    _output2.text = [btree2 inOrder];
    
}
- (IBAction)union:(id)sender {
    int element;
    id arrayElem;
    NSString *set2String = _output2.text;
    NSArray *set2Array = [set2String componentsSeparatedByString:@" "];
    for( element=0 ; element< [set2Array count]; element++)
    {
        arrayElem = [set2Array objectAtIndex:element];
        [btree1 add:[arrayElem integerValue]];
        
    }
    [self displaySet];
}
- (IBAction)switchSet:(id)sender {
    tmp = btree1;
    btree1 = btree2;
    btree2 = tmp;
    [self displaySet];
    _output2.text = [btree2 inOrder];
}

@end
