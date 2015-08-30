//
//  BTree.h
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BTree : NSObject
{
    int key_value;
    BTree *left;
    BTree *right;
}

- (void) setKey_value: (int) val;
- (int) key_value;
- (void) setLeft: (BTree *) leftChild;
- (BTree *) left;
- (void) setRight: (BTree *) rightChild;
- (BTree *) right;
-(BTree *) initNode: (int) num;


@end
