//
//  BTOperations.m
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import "BTOperations.h"
#import "BTree.h"


@implementation BTOperations

@synthesize root;
@synthesize pointer;
@synthesize parent;

- (BOOL) isEmpty: (BTree *) leaf;
{
    if(leaf==nil)
        return true;
    else
        return false;
}
- (BTree *) add: (int) aValue;
{
    bool val;
    val = [self isEmpty:(BTree *) root];
    if (val==true)
        root=pointer=[[BTree alloc]initNode:aValue];
    else{
        if(aValue < pointer.key_value)
        {
            if(pointer.left==nil)
                pointer.left=[[BTree alloc]initNode:aValue];
            else{
                pointer=pointer.left;
                [self add: aValue];
                pointer=root;
                return root;
            }
        }
        else if(aValue==pointer.key_value)
        {
            return root;
        }
        else if(pointer.right==nil)
            pointer.right=[[BTree alloc]initNode:aValue];
        else
        {
            pointer=pointer.right;
            [self add: aValue];
            pointer=root;
            return root;
        }
    }
    return root;
}
- (NSString *) inOrder;
{
    BTree * value= root;
    return [self print: value];
}
- (NSString *) print: (BTree *) leaf;
{
    if(leaf==nil){
        return @"";
    }
    
    else if(leaf.left==nil)
    {
        if(leaf.right==nil){
            return [NSString stringWithFormat:@"%i",leaf.key_value];
        }
        else{
            return [NSString stringWithFormat:@"%i%@%@",leaf.key_value,[NSString stringWithFormat:@" "],[self print:leaf.right]];
        }
    }
    else{
        if(leaf.right==nil){
            return [NSString stringWithFormat:@"%@%@%i",[self print:leaf.left],[NSString stringWithFormat:@" "],leaf.key_value];
        }
        else{
            return [NSString stringWithFormat:@"%@%@%i%@%@",[self print:leaf.left],[NSString stringWithFormat:@" "],leaf.key_value,[NSString stringWithFormat:@" "],[self print:leaf.right]];
        }
        
    }

}

@end
