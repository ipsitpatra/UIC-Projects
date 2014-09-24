//
//  BTree.m
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import "BTree.h"

@implementation BTree


-(BTree *) initNode: (int) num;
{
    
    BTree * tmp;
    tmp= [[BTree alloc]init];
    tmp.key_value=num;
    return tmp;
    
}

//Setter for key_value

- (void) setKey_value: (int) val;
{
     key_value= val;
}

//Getter for key_value
- (int) key_value;
{
    return key_value;
}

//Setter for left
- (void) setLeft: (BTree *) leftChild;
{
    left = leftChild;
}

//Getter for left
- (BTree *) left;
{
    return left;
}

// Setter for Right
- (void) setRight: (BTree *) rightChild;
{
    right = rightChild;
}
//Getter for Right
- (BTree *) right;
{
    return right;
}


@end
