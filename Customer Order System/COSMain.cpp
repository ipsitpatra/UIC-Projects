/*
 * COSMain.cpp
 *
 *  Created on: Apr 26, 2014
 *      Author: Ipsit
 */

#include "COSMain.h"

#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include "FoodItem.h"

using namespace std;

COSMain :: COSMain() {

}

COSMain :: ~COSMain() {

}

bool COSMain :: deleteMenu(vector<FoodItem*> menu){
	for (vector<FoodItem*>::iterator pObj = menu.begin( );pObj != menu.end( ); ++pObj) {
		delete *pObj;
	}
	menu.clear();
	return true;
}


vector<FoodItem*> COSMain :: copy(vector<FoodItem*> menu){
	vector<FoodItem*> vec1;
	for (vector<FoodItem*>::iterator pObj = menu.begin( );pObj != menu.end( ); ++pObj) {
		FoodItem* tmp = *pObj;
		vec1.push_back(tmp->copy());
	}
	return vec1;
}

void COSMain :: display(vector<FoodItem*> menu){
	vector<FoodItem*> vec1;
	if(menu.empty())
		cout<<endl<<"List empty"<<endl;
	else
		for (vector<FoodItem*>::iterator pObj = menu.begin( );pObj != menu.end( ); ++pObj) {
			FoodItem* tmp = *pObj;
			tmp->print();
		}
}


vector<FoodItem*> COSMain :: menu(vector<FoodItem*> menu){
	char choice;
	char* name= new char[256];
	char* sideDish=new char[256];
	double price;
	int calories,ounce;
	Cooked cooked;
	Bread bread;
	vector<char*> condiments;
	char* condiment;
	Salmon *s1;
	EggplantCasserole *e1;
	TurkeySandwich *t1;
	while(true){
		cout<<endl<<"====>Menu<===="<<endl;
		cout<<"s-Salmon"<<endl;
		cout<<"t-Turkey Sandwich"<<endl;
		cout<<"e-Eggplant Casserole"<<endl;
		cout<<"x-Exit Menu"<<endl;
		cout<<"============"<<endl;
		cout<<"Enter your choice: ";cin>>choice;
		cin.ignore(1,'\n'); //fix getline skips first input
		switch(choice){
		/*===============================================*/
		case 's':
			cout<<endl<<"==>Salmon Menu<==";
			name="Salmon";
			price=13.25;
			calories=180;
			//			cout<<endl<<"Enter Name of the Salmon dish: ";cin>>name;
			//			cout<<"Enter Price of the Salmon dish: ";cin>>price;
			//			cout<<"Enter Calorie Count of the Salmon dish: ";cin>>calories;
			cout<<endl<<"Side Dish for the Salmon dish: ";cin>>sideDish;
			cout<<"Select how the Salmon has to be cooked:";
			cout<<endl<<"1-Rare(default)";
			cout<<endl<<"2-Medium";
			cout<<endl<<"3-Well Done";
			cout<<endl<<"Option: ";cin>>choice;
			cin.ignore(1,'\n'); //fix getline skips first input
			switch(choice){
			case '1':
				cooked= rare;
				break;
			case '2':
				cooked= medium;
				break;
			case '3':
				cooked= welldone;
				break;
			default:
				cout<<endl<<"Wrong selection, Rare is selected by default.";
				break;
			}
			s1=new Salmon(name,price,calories,sideDish,cooked);
			menu.push_back(s1);
			//			menu.push_back(new Salmon(name,price,calories,sideDish,cooked));
			cout<<endl<<"Salmon Dish added to the Menu Order List."<<endl;

			break;
			/*===============================================*/
			case 't':
				cout<<endl<<"==>Turkey Sandwich Menu<==";
				//				cout<<endl<<"Enter Name of the Turkey Sandwich: ";cin>>name;
				name="Turkey Sandwich";
				price=9.25;
				calories=130;
				//				cout<<"Enter Price of the Turkey Sandwich: ";cin>>price;
				//				cout<<"Enter Calorie Count of the Turkey Sandwich: ";cin>>calories;
				cout<<endl<<"Select the Bread for the sandwich:";
				cout<<endl<<"1-White(default)";
				cout<<endl<<"2-Whole Wheat";
				cout<<endl<<"3-Rye";
				cout<<endl<<"4-Garlic";
				cout<<endl<<"Option: ";cin>>choice;
				cin.ignore(1,'\n'); //fix getline skips first input
				switch(choice){
				case '1':
					bread=white;
					break;
				case '2':
					bread=wholewheat;
					break;
				case '3':
					bread=rye;
					break;
				case '4':bread=garlic;
				break;
				default:
					cout<<endl<<"Wrong selection, White bread is selected by default.";
					bread=white;
					break;
				}
				char ans;
				//List implementation here !!!!
				do
				{	condiment = new char[256];
				cout<<"Enter the Condiments  for the sandwich :";
				cin>>condiment;
				condiments.push_back(condiment);
				cout<< "Do you want to add more Condiments (Y/N)? :";
				cin >> ans;
				}
				while(ans =='Y'||ans =='y');
				t1 = new TurkeySandwich(name,price,calories,condiments,bread);
				//				menu.push_back(new TurkeySandwich(name,price,calories,condiments,bread));
				menu.push_back(t1);
				cout<<endl<<"Turkey Sandwich added to the Menu Order List."<<endl;
				break;
				/*===============================================*/
				case 'e':
					cout<<endl<<"==>Eggplant Casserole Menu<==";
					name="Eggplant Casserole";
					//					price=3.25;
					calories=250;
					//					cout<<endl<<"Enter Name of the Eggplant Casserole: ";cin>>name;
					cout<<endl<<"Enter Price of the Eggplant Casserole: ";cin>>price;
					//					cout<<"Enter Calorie Count of the Eggplant Casserole: ";cin>>calories;
					cout<<"Side Dish for the Eggplant Casserole: ";cin>>sideDish;
					cout<<"Enter Weight of the Eggplant Casserole: ";cin>>ounce;
					e1=new EggplantCasserole(name,price,calories,sideDish,ounce);
					menu.push_back(e1);
					//					menu.push_back(new EggplantCasserole(name,price,calories,sideDish,ounce));
					cout<<endl<<"Eggplant Casserole added to the Menu Order List."<<endl;
					break;
				case 'x':
					cout<<endl<<"==>Existing Menu<=="<<endl;
					return menu;
				default:
					cout<<endl<<"Please enter a valid menu command";
					break;
		}
	}
	return menu;
}

int COSMain :: validPatronNumber(){
	/*To make sure a valid seat number is entered for function invocation*/
	string buffer="";
	int seat=0;
	do{
		while (true) {
			cout << "Please choose a valid Patron Number (1-10) : ";
			getline(cin, buffer);
			stringstream patron(buffer);
			if (patron >> seat)
				break;
		}
	}while((seat < 1) || (seat >10));
	return seat;
}

int main(void){
	cout<<       "======================================================"<<endl;
	cout<<       "<=====> Welcome to Customer Order System (COS) <=====>"<<endl;
	cout<<       "======================================================"<<endl;


	char input;
	int seat1=0,seat2=0;
	vector<FoodItem*> map[10];
	COSMain* util = new COSMain();
	while(true){

		cout<< endl<< "=====================Main Menu========================"<<endl;
		cout<<endl<<"Enter your choice to execute the function:";
		cout<<endl<<endl;
		cout<<"n — New List"<<endl;
		cout<<"a — Add List Entry"<<endl;
		cout<<"c — Copy List"<<endl;
		cout<<"d — Delete List"<<endl;
		cout<<"l — List patron"<<endl;
		cout<<"s — Swap orders"<<endl;
		cout<<"q — Quit"<<endl;
		cout<<       "======================================================"<<endl;
		cout<<"Option : ";cin>>input;
		cin.ignore(1,'\n'); //fix getline skips first input

		switch (input) {
		/*===============================================*/
		case 'n':
			cout<<endl<<"<===>New List<===>"<<endl;
			seat1=util->validPatronNumber();
			cout<<"Patron Number: "<<seat1<<endl;
			if(map[seat1-1].empty())
			{
				map[seat1-1]=util->menu(map[seat1-1]);
			}
			else
				cout<<endl<<"Table already occupied.";
			//Check is the seat is empty
			//if empty add the new list
			//else return error => break

			break;
			/*===============================================*/
		case 'a':
			cout<<endl<<"<===>Add List<===>"<<endl;
			seat1=util->validPatronNumber();
			cout <<endl<<"Patron Number: "<<seat1;
			if(map[seat1-1].size()!=0)
			{
				map[seat1-1]=util->menu(map[seat1-1]);
			}
			else{
				cout<<endl<<"Table empty not occupied. Please create a new Order";
				/**/
			}

			util->display(map[seat1-1]);
			//Check is the seat is empty
			//if NOT empty open the  list and display the menu7
			//else return error => break
			break;
			/*===============================================*/
		case 'c':
			cout<<endl<<"<===>Copy the food list<===> \n";
			seat1=util->validPatronNumber();
			//			cout <<endl<<"Source Patron Number: "<<seat1;
			//display the original menu
			seat2=util->validPatronNumber();
			cout<<"Copying from Source Patron Number: "<<seat1<< " and Destination Patron Number: "<<seat2;
			//display the original menu
			//deep copy
			//			cout<<endl<<"Clearing "<<seat1;
			//			util->deleteMenu(map[seat2-1]);
			//			cout<<endl<<"Copy :";
			//						map[seat1-1]=util->copy(map[seat2-1]);

			for (vector<FoodItem*>::iterator pObj = map[seat1-1].begin( );pObj != map[seat1-1].end( ); ++pObj) {
				FoodItem* tmp = *pObj;
				map[seat2-1].push_back(tmp->copy());
			}

			/*for(int tmp=0;tmp<map[seat1-1].size();tmp++)
				map[seat2-1].push_back(map[seat1-1].at(tmp)->copy());
			 */
			cout<<"\nOrder at the Source: "<<seat1<<"\n";
			util->display(map[seat1-1]);
			cout<<"\nOrder at the Copy: "<<seat2<<"\n";
			util->display(map[seat2-1]);

			break;
			/*===============================================*/
		case 'd':
			cout<<endl<<"<===>Clear the Bill<===>"<<endl;
			seat1=util->validPatronNumber();
			cout <<"Patron Number cleared: "<<seat1<<endl;
			util->deleteMenu(map[seat1-1]);//Empty the Class pointers
			map[seat1-1].clear();//vector clear
			break;
			/*===============================================*/
		case 'l':
			cout<<endl<<"Display Content for the Patron ";
			seat1=util->validPatronNumber();
			//			cout <<endl<<"Patron Number for display: "<<seat1;
			if(!map[seat1-1].empty())
				util->display(map[seat1-1]);
			else
				cout<<endl<<"~~No Order for Seat "<<seat1<<"~~"<<endl;
			//Check is the seat is empty
			//if NOT empty open the  list and display the items in details
			//else return error msg

			break;
			/*===============================================*/
		case 's':
			cout<<endl<<"<===>Swap the food list for the Patrons<===>"<<endl;
			seat1=util->validPatronNumber();
			//			cout <<endl<<"First Patron Number: "<<seat1;
			seat2=util->validPatronNumber();
			//			cout<< "Second Patron Number: "<<seat1;
			cout<<"Swapping:  Patron Number: "<<seat1<< " and Patron Number: "<<seat2;
			map[seat1-1].swap(map[seat2-1]);


			cout<<"\nOrder at: "<<seat1<<"\n";
			util->display(map[seat1-1]);
			cout<<"\nOrder at: "<<seat2<<"\n";
			util->display(map[seat2-1]);

			//display the original menu
			//swap
			break;
			/*===============================================*/
		case 'q':
			cout <<endl<< "~~Thank You for using Customer Order System (COS)!~~";
			return 0;
			/*===============================================*/
		default:
			cout << "You have entered an Invalid command, please enter a valid entry!"<<endl;
			break;
			/*===============================================*/
		}
	}
	return 0;
}

