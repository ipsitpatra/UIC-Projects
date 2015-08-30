//
//  BTreeViewController.h
//  CS474 iOS
//
//  Created by Ipsit on 4/6/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "BTree.h"
#import "BTOperations.h"
@interface BTreeViewController : UIViewController
@property (weak, nonatomic) IBOutlet UITextField *input;
@property (weak, nonatomic) IBOutlet UITextField *output1;
@property (weak, nonatomic) IBOutlet UITextField *output2;
@property(nonatomic,copy) BTOperations * btree1;
@property(nonatomic,copy) BTOperations * btree2;
@property(nonatomic,copy) BTOperations * tmp;
@end
