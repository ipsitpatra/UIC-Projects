/*
 * FoodItem.cpp
 *
 *  Created on: Apr 26, 2014
 *      Author: Ipsit
 */
#include "FoodItem.h"
#include <vector>
#include <cstring>
#include <iostream>
using namespace std;

FoodItem :: FoodItem() {
	calorieCount=0;
	nameItem=0;
	price=0;
}

FoodItem :: FoodItem(char* nameItem, double price, int calories){
	this->calorieCount=calories;
	this->nameItem= new char[256];
	strcpy(this->nameItem,nameItem);
	this->price=price;
}

FoodItem :: FoodItem(const FoodItem& f){
	this->calorieCount=f.calorieCount;
	this->nameItem= new char[256];
	strcpy(this->nameItem,f.nameItem);
	this->price=f.price;
}


FoodItem :: ~FoodItem() {
	delete nameItem;
}

Salmon :: Salmon() {
	calorieCount=0;
	cookedValue= rare;
	nameItem=0;
	price=0;
	sideDish=0;
}

Salmon :: Salmon(char* nameItem, double price, int calories, char* sideDish, Cooked cookedValue) : FoodItem(nameItem,price,calories){
	this->sideDish= new char[256];
	strcpy(this->sideDish,sideDish);
	this->cookedValue = cookedValue;

}

Salmon* Salmon :: copy(){
	Salmon* result = new Salmon(*this) ;  // This statement implicitly invokes the copy constructor
	return result ;
}

Salmon::Salmon(const Salmon& s):FoodItem(s) {

	this->sideDish= new char[256];
	strcpy(this->sideDish,s.sideDish);
	this->cookedValue = s.cookedValue;

}

EggplantCasserole :: EggplantCasserole(const EggplantCasserole &eggplantCasserole):FoodItem(eggplantCasserole){

	this->sideDish= new char[256];
	strcpy(this->sideDish,eggplantCasserole.sideDish);
	this->ounces = eggplantCasserole.ounces;
}

TurkeySandwich :: TurkeySandwich(const TurkeySandwich &turkeySandwich):FoodItem(turkeySandwich){
	this->breadValue=turkeySandwich.breadValue;
	vector<char*> vec=turkeySandwich.condiments;
	for (vector<char*>::iterator pObj = vec.begin( );pObj != vec.end( ); ++pObj) {
		char* tmp = new char[256];
		char* tmp1 = *pObj;
		strcpy(tmp,tmp1);
		this->condiments.push_back(tmp);
	}
	printCondiments();
}

Salmon :: ~Salmon() {
	delete sideDish;
}

void Salmon :: print(){
	cout <<endl<<"========================="<<endl;
	cout <<"NameItem : "<< getNameItem()<<endl<<"Price : " << getPrice() <<endl<< "Calories : " << getCalorieCount()<<endl<<"SideDish : " << getSideDish() <<endl<<"Cooked : ";
	if(cookedValue==rare)
		cout<<"Rare";
	else if (cookedValue==medium)
		cout<<"Medium";
	else
		cout<<"Well Done";
	cout <<endl<<"=========================";
	cout <<endl;
}

char* Salmon :: getSideDish(){
	return sideDish;
}
void Salmon :: setSideDish(char* sideDish){
	this->sideDish=sideDish;
}

TurkeySandwich :: TurkeySandwich() {
	calorieCount=0;
	nameItem=0;
	price=0;
	breadValue=white;
}

TurkeySandwich* TurkeySandwich :: copy(){
	TurkeySandwich* result = new TurkeySandwich(*this) ;  // This statement implicitly invokes the copy constructor
	return result ;
}


TurkeySandwich :: TurkeySandwich(char* nameItem, double price, int calories, vector<char*> condiments, Bread breadValue) : FoodItem(nameItem,price,calories){
	this->condiments = condiments;
	this->breadValue = breadValue;

}


TurkeySandwich :: ~TurkeySandwich() {
	for (vector<char*>::iterator pObj = getCondiments().begin( );pObj != getCondiments().end( ); ++pObj) {
		delete *pObj;
	}
	condiments.clear();
}

void TurkeySandwich :: print(){
	cout <<endl<<"========================="<<endl;
	cout <<"NameItem : "<< getNameItem()<<endl<<"Price : " << getPrice() <<endl<< "Calories : " << getCalorieCount()<<endl<<"Condiments :";
	printCondiments();
	cout<<endl<<"Bread :";
	if(breadValue==white)
		cout<<"White";
	else if (breadValue==rye)
		cout<<"Rye";
	else if (breadValue==wholewheat)
			cout<<"Whole Wheat";
	else
		cout<<"Garlic";
	cout <<endl<<"=========================";
	cout <<endl;
}

void TurkeySandwich :: printCondiments(){
	vector<char*> vec=getCondiments();
	for (vector<char*>::iterator pObj = vec.begin( );pObj != vec.end( ); ++pObj) {
		char* tmp = *pObj;
		cout<<endl<<"  "<<tmp;
	}
}

vector<char*> TurkeySandwich :: getCondiments(){
	return condiments;
}

void TurkeySandwich :: setCondiments(vector<char*> condiments){
	this->condiments=condiments;
}


EggplantCasserole :: EggplantCasserole() {
	calorieCount=0;
	nameItem=0;
	price=0;
	ounces=0;
	sideDish=0;
}

EggplantCasserole :: EggplantCasserole(char* nameItem, double price, int calories, char* sideDish, int ounces) : FoodItem(nameItem,price,calories){
	this->sideDish = sideDish;
	this->ounces = ounces;

}

EggplantCasserole :: ~EggplantCasserole() {
	delete sideDish;
}

EggplantCasserole* EggplantCasserole :: copy(){
	EggplantCasserole* result = new EggplantCasserole(*this) ;  // This statement implicitly invokes the copy constructor
	return result ;
}

void EggplantCasserole :: print(){
	cout <<endl<<"========================="<<endl;
	cout <<"NameItem : "<< getNameItem()<<endl<<"Price : " << getPrice() <<endl<< "Calories : " << getCalorieCount()<<endl<<"SideDish : " << getSideDish() <<endl<<"Weight : " << getOunces();
	cout <<endl<<"=========================";
	cout <<endl;
}

char* EggplantCasserole :: getSideDish(){
	return sideDish;
}

void EggplantCasserole :: setSideDish(char* sideDish){
	this->sideDish=sideDish;
}

int EggplantCasserole :: getOunces(){
	return ounces;
}

void EggplantCasserole :: setOunces(int ounces){
	this->ounces=ounces;
}
