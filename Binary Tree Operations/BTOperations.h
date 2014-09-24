//
//  BTOperations.h
//  Patra-CS474
//
//  Created by Ipsit on 4/5/14.
//  Copyright (c) 2014 UIC. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "BTree.h"

@interface BTOperations : NSObject

@property(nonatomic,copy) BTree * root;
@property(nonatomic, copy) BTree * pointer;
@property(nonatomic,copy) BTree * parent;

- (BOOL) isEmpty: (BTree *) leaf;
- (BTree *) add: (int) aValue;
- (NSString *) inOrder;
- (NSString *) print: (BTree *) leaf;

@end