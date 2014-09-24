<?xml version="1.0"?>

<st-source>
<time-stamp>From VisualWorks® Personal Use Edition, 7.10 of July 10, 2013 on March 20, 2014 at 8:42:17 PM</time-stamp>


<component-created>
<name>EROS</name> <type>package</type>
</component-created><!-- Package EROS* -->


<component-property>
<name>EROS</name> <type>package</type>
<property>comment</property> <value>'  
Name: Ipsit Patra (673438945)
CS 474 Project 2- Electronic Restaurant Order System (EROS)
'</value>
</component-property>

<name-space>
<name>EROSSpace</name>
<environment>Smalltalk</environment>
<private>false</private>
<imports>
			private Smalltalk.*
			</imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</name-space>

<comment>
<name-space-id>EROSSpace</name-space-id>
<body>Namespace for the project
</comment>

<class>
<name>Item</name>
<environment>EROSSpace</environment>
<super>Core.Object</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>name price calories </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Item</class-id>
<body>Abstract class for the foo and beverages
</comment>

<class>
<name>Beverage</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Item</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars></inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Beverage</class-id>
<body>Beverage class
</comment>

<class>
<name>Soda</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Beverage</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars></inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Soda</class-id>
<body>Soda class
</comment>

<class>
<name>LongDrink</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Beverage</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>ingredient </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.LongDrink</class-id>
<body>LongDrink class
</comment>

<class>
<name>Food</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Item</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>ingredients </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Food</class-id>
<body>class for the food items 
</comment>

<class>
<name>MainDish</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Food</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>sideDish </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.MainDish</class-id>
<body>MainDish class
</comment>

<class>
<name>Dessert</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Food</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars></inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Dessert</class-id>
<body>Dessert class
</comment>

<class>
<name>EROSApplication</name>
<environment>EROSSpace</environment>
<super>UI.ApplicationModel</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>tabs storage listSoda listAppetizers listMainDish listLongList nameOfItem listDesserts description price sideDish ingredients caloryCount menuItem priceOfItem selectedItem listLongDrink itemName itemCalory itemSideDish itemDescription itemIngredient itemPrice billTable billList totalPrice totalColories statusEROS </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.EROSApplication</class-id>
<body>Main Appplication 
</comment>

<class>
<name>Appetizer</name>
<environment>EROSSpace</environment>
<super>EROSSpace.Food</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>description </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Appetizer</class-id>
<body>Appetizer class
</comment>

<class>
<name>Storage</name>
<environment>EROSSpace</environment>
<super>Core.Object</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>listMainDish listDessert listAppetizer listSoda listLongDrink aListMainDish aListDessert aListAppetizer aListSoda aListLongDrink aListBill </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>EROS</package>
</attributes>
</class>

<comment>
<class-id>EROSSpace.Storage</class-id>
<body>Storage is the holder for the dictionary and ordered collection
</comment>

<methods>
<class-id>EROSSpace.Item class</class-id> <category>instance creation</category>

<body package="EROS" selector="new">new
</methods>


<methods>
<class-id>EROSSpace.Item</class-id> <category>accessing</category>

<body package="EROS" selector="name">name

<body package="EROS" selector="calories:">calories: anObject

<body package="EROS" selector="price:">price: anObject

<body package="EROS" selector="calories">calories

<body package="EROS" selector="price">price

<body package="EROS" selector="name:">name: anObject
</methods>

<methods>
<class-id>EROSSpace.Item</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.Beverage</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.LongDrink</class-id> <category>accessing</category>

<body package="EROS" selector="ingredient">ingredient

<body package="EROS" selector="ingredient:">ingredient: anObject
</methods>

<methods>
<class-id>EROSSpace.LongDrink</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.Soda</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.Food</class-id> <category>accessing</category>

<body package="EROS" selector="ingredients:">ingredients: anObject

<body package="EROS" selector="ingredients">ingredients
</methods>

<methods>
<class-id>EROSSpace.Food</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.MainDish</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>

<methods>
<class-id>EROSSpace.MainDish</class-id> <category>accessing</category>

<body package="EROS" selector="sideDish:">sideDish: anObject

<body package="EROS" selector="sideDish">sideDish
</methods>


<methods>
<class-id>EROSSpace.Dessert</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.EROSApplication class</class-id> <category>interface specs</category>

<body package="EROS" selector="adminSpec">adminSpec

<body package="EROS" selector="menuSpec">menuSpec

<body package="EROS" selector="windowSpec">windowSpec
</methods>


<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>accessing</category>

<body package="EROS" selector="tabs:">tabs: anObject

<body package="EROS" selector="storage:">storage: anObject

<body package="EROS" selector="tabs1">tabs1

<body package="EROS" selector="storage">storage
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>changing</category>

<body package="EROS" selector="tabsChanged">tabsChanged
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>private</category>

<body package="EROS" selector="labelArray">labelArray

<body package="EROS" selector="specArray">specArray
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>actions</category>

<body package="EROS" selector="clearMenu">clearMenu

<body package="EROS" selector="deleteSode">deleteSode

<body package="EROS" selector="appetizerInfo">appetizerInfo

<body package="EROS" selector="clearBill">clearBill

<body package="EROS" selector="deleteMainDish">deleteMainDish

<body package="EROS" selector="refreshLists">refreshLists

<body package="EROS" selector="suggestFullMeal">suggestFullMeal

<body package="EROS" selector="addItem">addItem

<body package="EROS" selector="billMainDish">billMainDish

<body package="EROS" selector="dessertInfo">dessertInfo

<body package="EROS" selector="deleteLongDrink">deleteLongDrink

<body package="EROS" selector="editAppetizer">editAppetizer

<body package="EROS" selector="sodaInfo">sodaInfo

<body package="EROS" selector="menuImport">menuImport

<body package="EROS" selector="makePayment">makePayment

<body package="EROS" selector="mainDishInfo">mainDishInfo

<body package="EROS" selector="billLongDrink">billLongDrink

<body package="EROS" selector="deleteAppetizers">deleteAppetizers

<body package="EROS" selector="billAppetizer">billAppetizer

<body package="EROS" selector="menuClear">menuClear

<body package="EROS" selector="deleteItemKey">deleteItemKey

<body package="EROS" selector="deleteDessert">deleteDessert

<body package="EROS" selector="editMainDish">editMainDish

<body package="EROS" selector="longDrinkInfo">longDrinkInfo

<body package="EROS" selector="billDessert">billDessert

<body package="EROS" selector="editLongDrink">editLongDrink

<body package="EROS" selector="exitEROS">exitEROS

<body package="EROS" selector="menuExport">menuExport

<body package="EROS" selector="refreshForm">refreshForm

<body package="EROS" selector="billSoda">billSoda

<body package="EROS" selector="suggestLightMeal">suggestLightMeal

<body package="EROS" selector="editDessert">editDessert

<body package="EROS" selector="editSoda">editSoda
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>interface opening</category>

<body package="EROS" selector="postOpenWith:">postOpenWith: aBuilder
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>aspects</category>

<body package="EROS" selector="itemSideDish">itemSideDish

<body package="EROS" selector="billTable">billTable

<body package="EROS" selector="itemPrice">itemPrice

<body package="EROS" selector="sideDish">sideDish

<body package="EROS" selector="listSoda">listSoda

<body package="EROS" selector="price">price

<body package="EROS" selector="itemCalory">itemCalory

<body package="EROS" selector="billList">billList

<body package="EROS" selector="listLongDrink">listLongDrink

<body package="EROS" selector="totalPrice">totalPrice

<body package="EROS" selector="totalColories">totalColories

<body package="EROS" selector="nameOfItem">nameOfItem

<body package="EROS" selector="itemName">itemName

<body package="EROS" selector="description">description

<body package="EROS" selector="appStatus">appStatus

<body package="EROS" selector="selectedItem">selectedItem

<body package="EROS" selector="caloryCount">caloryCount

<body package="EROS" selector="ingredients">ingredients

<body package="EROS" selector="listAppetizers">listAppetizers

<body package="EROS" selector="priceOfItem">priceOfItem

<body package="EROS" selector="tabs">tabs

<body package="EROS" selector="itemDescription">itemDescription

<body package="EROS" selector="menuItem">menuItem

<body package="EROS" selector="listMainDish">listMainDish

<body package="EROS" selector="itemIngredient">itemIngredient

<body package="EROS" selector="listDesserts">listDesserts

<body package="EROS" selector="statusEROS">statusEROS

<body package="EROS" selector="listLongList">listLongList
</methods>


<methods>
<class-id>EROSSpace.Appetizer</class-id> <category>accessing</category>

<body package="EROS" selector="description:">description: anObject

<body package="EROS" selector="description">description
</methods>

<methods>
<class-id>EROSSpace.Appetizer</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>


<methods>
<class-id>EROSSpace.Storage class</class-id> <category>instance creation</category>

<body package="EROS" selector="new">new
</methods>


<methods>
<class-id>EROSSpace.Storage</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize
</methods>

<methods>
<class-id>EROSSpace.Storage</class-id> <category>accessing</category>

<body package="EROS" selector="listMainDish:">listMainDish: anObject

<body package="EROS" selector="aListLongDrink">aListLongDrink

<body package="EROS" selector="aListLongDrink:">aListLongDrink: anObject

<body package="EROS" selector="listDessert:">listDessert: anObject

<body package="EROS" selector="aListSoda">aListSoda

<body package="EROS" selector="aListSoda:">aListSoda: anObject

<body package="EROS" selector="listAppetizer">listAppetizer

<body package="EROS" selector="listLongDrink">listLongDrink

<body package="EROS" selector="aListDessert">aListDessert

<body package="EROS" selector="aListBill">aListBill

<body package="EROS" selector="aListBill:">aListBill: anObject

<body package="EROS" selector="aListMainDish">aListMainDish

<body package="EROS" selector="listAppetizer:">listAppetizer: anObject

<body package="EROS" selector="aListDessert:">aListDessert: anObject

<body package="EROS" selector="listLongDrink:">listLongDrink: anObject

<body package="EROS" selector="listSoda">listSoda

<body package="EROS" selector="aListMainDish:">aListMainDish: anObject

<body package="EROS" selector="listSoda:">listSoda: anObject

<body package="EROS" selector="aListAppetizer">aListAppetizer

<body package="EROS" selector="aListAppetizer:">aListAppetizer: anObject

<body package="EROS" selector="listMainDish">listMainDish

<body package="EROS" selector="listDessert">listDessert
</methods>

<methods>
<class-id>EROSSpace.Storage</class-id> <category>list-operation</category>

<body package="EROS" selector="addMainDish:">addMainDish: item

<body package="EROS" selector="removeSoda:">removeSoda: item

<body package="EROS" selector="addLongDrink:">addLongDrink: item

<body package="EROS" selector="addAppetizer:">addAppetizer: item

<body package="EROS" selector="removeMainDish:">removeMainDish: item

<body package="EROS" selector="addSoda:">addSoda: item

<body package="EROS" selector="removeAppetizer:">removeAppetizer: item

<body package="EROS" selector="removeDessert:">removeDessert: item

<body package="EROS" selector="removeLongDrink:">removeLongDrink: item

<body package="EROS" selector="addDessert:">addDessert: item
</methods>

<methods>
<class-id>EROSSpace.Storage</class-id> <category>menu-generation</category>

<body package="EROS" selector="listMainDishHolder">listMainDishHolder</body>

<body package="EROS" selector="listAppetizerHolder">listAppetizerHolder</body>

<body package="EROS" selector="listLongDrinkHolder">listLongDrinkHolder</body>

<body package="EROS" selector="clearStorage">clearStorage</body>

<body package="EROS" selector="listDessertHolder">listDessertHolder</body>

<body package="EROS" selector="listSodaHolder">listSodaHolder</body>
</methods>



</st-source>