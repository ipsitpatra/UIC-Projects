/*
 * COSMain.h
 *
 *  Created on: Apr 26, 2014
 *      Author: Ipsit
 */

#ifndef COSMAIN_H_
#define COSMAIN_H_
#include <vector>
#include "FoodItem.h"
using namespace std;
class COSMain {
public:
	COSMain();
	virtual ~COSMain();
	int validPatronNumber();
	bool deleteMenu(vector<FoodItem*> menu);
	void display(vector<FoodItem*> menu);
	vector<FoodItem*> menu(vector<FoodItem*> menu);
	vector<FoodItem*> copy(vector<FoodItem*> menu);

protected:

};



#endif /* COSMAIN_H_ */
