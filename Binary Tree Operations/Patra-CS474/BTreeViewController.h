//
//  BTreeViewController.h
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "BTOperations.h"

@interface BTreeViewController : UIViewController
@property (weak, nonatomic) IBOutlet UITextField *input;
@property (weak, nonatomic) IBOutlet UITextField *output;
@property (weak, nonatomic) IBOutlet UITextField *output2;
@property(nonatomic,copy) BTOperations * btree1;
@property(nonatomic,copy) BTOperations * btree2;
@property(nonatomic,copy) BTOperations * tmp;
@end
