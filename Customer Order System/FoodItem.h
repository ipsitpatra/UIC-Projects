/*
 * FoodItem.h
 *
 *  Created on: Apr 26, 2014
 *      Author: Ipsit
 */

#ifndef FOODITEM_H_
#define FOODITEM_H_
#include <vector>

using namespace std;
enum Cooked {rare,medium,welldone};
enum Bread {white, wholewheat,rye, garlic};
class FoodItem{

public:
	FoodItem();
	FoodItem(const FoodItem& c);
	FoodItem(char* nameItem, double price, int calories);
	virtual ~FoodItem();
	virtual void print() =0;
	virtual FoodItem* copy() =0;

	int getCalorieCount() const{
		return calorieCount;
	}

	void setCalorieCount(int calorieCount) {
		this->calorieCount = calorieCount;
	}

	char* getNameItem() const {
		return nameItem;
	}

	void setNameItem(char* nameItem) {
		this->nameItem = nameItem;
	}

	double getPrice() const {
		return price;
	}

	void setPrice(double price) {
		this->price = price;
	}

protected:
	//int partonNumber;		//seat number for the item ordered
	char* nameItem;			//name of the item in c style string
	double price;			//price of the item
	int calorieCount;		//calorie count of the item
};

class Salmon: public FoodItem{

public:
	Salmon();
	Salmon(char* nameItem, double price, int calories, char* sideDish, Cooked cookedValue);// : FoodItem(nameItem,price,calories);
	Salmon(const Salmon &salmon);
	~Salmon();
	void print();
	Salmon* copy();
	Cooked cookedValue;			//describes how it should be cooked (i.e., rare,medium, well-done
	char* getSideDish();
	void setSideDish(char* sideDish);

protected:
	char* sideDish;				//holds the name of the side dish
};

class TurkeySandwich: public FoodItem{
public:
	TurkeySandwich();
	TurkeySandwich(char* nameItem, double price, int calories, vector<char*> condiments, Bread breadValue);
	TurkeySandwich(const TurkeySandwich &turkeySandwich);
	~TurkeySandwich();
	void print();
	TurkeySandwich* copy();
	void printCondiments();
	Bread breadValue; 			//holds the value of type of bread
	vector<char*> getCondiments();
	void setCondiments(vector<char*> condiments);
protected:
	vector<char*> condiments;			//need to convert to a list of condiments <= Link List maybe
};

class EggplantCasserole: public FoodItem{
public:
	EggplantCasserole();
	EggplantCasserole(char* nameItem, double price, int calories, char* sideDish, int ounces);
	EggplantCasserole(const EggplantCasserole &eggplantCasserole);
	~EggplantCasserole();
	void print();
	EggplantCasserole* copy();
	int getOunces();
	void setOunces(int ounces);
	char* getSideDish();
	void setSideDish(char* sideDish);
protected:
	int ounces; 			//holds the weight of the Casserole
	char* sideDish; 		//holds the name of the side dish
};

#endif /* FOODITEM_H_ */
