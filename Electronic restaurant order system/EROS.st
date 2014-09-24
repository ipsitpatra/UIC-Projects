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
<body>Namespace for the project  Name: Ipsit Patra (673438945)CS 474 Project 2- Electronic Restaurant Order System (EROS)</body>
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
<body>Abstract class for the foo and beverages</body>
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
<body>Beverage class </body>
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
<body>Soda class</body>
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
<body>LongDrink class Instance Variables	ingredient	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of ingredient</body>
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
<body>class for the food items </body>
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
<body>MainDish classInstance Variables	sideDish	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of sideDish</body>
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
<body>Dessert class </body>
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
<body>Main Appplication   Name: Ipsit Patra (673438945)CS 474 Project 2- Electronic Restaurant Order System (EROS)</body>
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
<body>Appetizer class </body>
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
<body>Storage is the holder for the dictionary and ordered collectionInstance Variables	aListAppetizer	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of aListAppetizer	aListDessert	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of aListDessert	aListLongDrink	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of aListLongDrink	aListMainDish	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of aListMainDish	aListSoda	&lt;MessageForwarder | Object | ProtoObject | ProtoObject&gt;	description of aListSoda	listAppetizer	&lt;Dictionary&gt;	description of listAppetizer	listDessert	&lt;Dictionary&gt;	description of listDessert	listLongDrink	&lt;Dictionary&gt;	description of listLongDrink	listMainDish	&lt;Dictionary&gt;	description of listMainDish	listSoda	&lt;Dictionary&gt;	description of listSoda</body>
</comment>

<methods>
<class-id>EROSSpace.Item class</class-id> <category>instance creation</category>

<body package="EROS" selector="new">new	"Answer a newly created and initialized instance."	^super new initialize</body>
</methods>


<methods>
<class-id>EROSSpace.Item</class-id> <category>accessing</category>

<body package="EROS" selector="name">name	^name</body>

<body package="EROS" selector="calories:">calories: anObject	calories := anObject</body>

<body package="EROS" selector="price:">price: anObject	price := anObject</body>

<body package="EROS" selector="calories">calories	^calories</body>

<body package="EROS" selector="price">price	^price</body>

<body package="EROS" selector="name:">name: anObject	name := anObject</body>
</methods>

<methods>
<class-id>EROSSpace.Item</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	name := nil.	price := nil.	calories := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.Beverage</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Replace this comment with the appropriate initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.LongDrink</class-id> <category>accessing</category>

<body package="EROS" selector="ingredient">ingredient	^ingredient</body>

<body package="EROS" selector="ingredient:">ingredient: anObject	ingredient := anObject</body>
</methods>

<methods>
<class-id>EROSSpace.LongDrink</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	ingredient := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.Soda</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Replace this comment with the appropriate initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.Food</class-id> <category>accessing</category>

<body package="EROS" selector="ingredients:">ingredients: anObject	ingredients := anObject</body>

<body package="EROS" selector="ingredients">ingredients	^ingredients</body>
</methods>

<methods>
<class-id>EROSSpace.Food</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	ingredients := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.MainDish</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	sideDish := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>

<methods>
<class-id>EROSSpace.MainDish</class-id> <category>accessing</category>

<body package="EROS" selector="sideDish:">sideDish: anObject	sideDish := anObject</body>

<body package="EROS" selector="sideDish">sideDish	^sideDish</body>
</methods>


<methods>
<class-id>EROSSpace.Dessert</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Replace this comment with the appropriate initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.EROSApplication class</class-id> <category>interface specs</category>

<body package="EROS" selector="adminSpec">adminSpec	"Tools.UIPainter new openOnClass: self andSelector: #adminSpec"	&lt;resource: #canvas&gt;	^#(#{UI.FullSpec} 		#window: 		#(#{UI.WindowSpec} 			#label: 'Unlabeled Canvas' 			#min: #(#{Core.Point} 20 20 ) 			#max: #(#{Core.Point} 0 0 ) 			#bounds: #(#{Graphics.Rectangle} 58 44 1308 694 ) ) 		#component: 		#(#{UI.SpecCollection} 			#collection: #(				#(#{UI.MenuButtonSpec} 					#layout: #(#{Graphics.Rectangle} 428 87 528 110 ) 					#name: #MenuButton1 					#model: #selectedItem 					#menu: #menuItem ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 144 43 376 67 ) 					#name: #InputField1 					#model: #nameOfItem ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 145 86 201 114 ) 					#name: #InputField2 					#model: #priceOfItem 					#type: #number 					#formatString: '0.00' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 313 88 373 111 ) 					#name: #InputField3 					#model: #caloryCount 					#type: #number 					#formatString: '0' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 167 205 400 229 ) 					#name: #InputField4 					#model: #description ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 169 266 401 292 ) 					#name: #InputField5 					#model: #sideDish ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 144 138 529 164 ) 					#name: #InputField6 					#model: #ingredients ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 432 182 540 245 ) 					#name: #ActionButton1 					#model: #addItem 					#label: 'Add/Edit' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1077 278 1158 301 ) 					#name: #ActionButton3 					#model: #deleteMainDish 					#label: 'Delete' 					#defaultable: true ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 723 48 1043 200 ) 					#name: #List1 					#model: #listAppetizers 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 729 219 1046 379 ) 					#name: #List2 					#model: #listMainDish 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 43 43 ) 					#name: #Label1 					#label: 'Name of the item*' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 221 91 ) 					#name: #Label2 					#label: 'Calory Count' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 44 89 ) 					#name: #Label3 					#label: 'Price of the item ($)' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 56 139 ) 					#name: #Label4 					#label: 'Ingredients' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 55 202 ) 					#name: #Label5 					#label: 'Description' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 61 262 ) 					#name: #Label6 					#label: 'Side Dish' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 633 51 ) 					#name: #Label7 					#label: 'Appetizers' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 331 381 ) 					#name: #Label8 					#label: 'Sode' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 26 375 ) 					#name: #Label9 					#label: 'Long Drink' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 641 235 ) 					#name: #Label10 					#label: 'Main Dish' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 648 410 ) 					#name: #Label11 					#label: 'Desserts' ) 				#(#{UI.DividerSpec} 					#layout: #(#{Graphics.Rectangle} 9 314 572 318 ) 					#name: #Divider1 ) 				#(#{UI.DividerSpec} 					#layout: #(#{Graphics.Rectangle} 581 7 585 643 ) 					#name: #Divider2 					#orientation: #vertical ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 443 67 ) 					#name: #Label12 					#label: 'Type of Item' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1072 104 1153 127 ) 					#name: #ActionButton5 					#model: #deleteAppetizers 					#label: 'Delete' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 463 536 544 559 ) 					#name: #ActionButton6 					#model: #deleteSode 					#label: 'Delete' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 175 534 256 557 ) 					#name: #ActionButton7 					#model: #deleteLongDrink 					#label: 'Delete' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1081 472 1162 495 ) 					#name: #ActionButton8 					#model: #deleteDessert 					#label: 'Delete' 					#defaultable: true ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 732 397 1047 549 ) 					#name: #List4 					#model: #listDesserts 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 81 377 259 527 ) 					#name: #List6 					#model: #listLongDrink 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 366 377 543 529 ) 					#name: #List3 					#model: #listSoda 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 11 9 ) 					#name: #Label14 					#label: 'ADD OR EDIT OR DELETE ITEM' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 600 9 ) 					#name: #Label15 					#label: 'REMOVE ITEMS' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 432 261 541 284 ) 					#name: #ActionButton10 					#model: #deleteItemKey 					#label: 'Delete Item' 					#defaultable: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 15 273 ) 					#name: #Label13 					#label: '(Required only for Main Dish)' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 15 221 ) 					#name: #Label16 					#label: '(Required only for Appetizers)' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1070 69 1151 92 ) 					#name: #ActionButton2 					#model: #editAppetizer 					#label: 'Edit Appetizer' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1076 244 1157 267 ) 					#name: #ActionButton4 					#model: #editMainDish 					#label: 'Edit Main Dish' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1080 436 1161 459 ) 					#name: #ActionButton9 					#model: #editDessert 					#label: 'Edit Dessert' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 86 533 167 556 ) 					#name: #ActionButton11 					#model: #editLongDrink 					#label: 'Edit Long Drink' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 375 536 456 559 ) 					#name: #ActionButton12 					#model: #editSoda 					#label: 'Edit Soda' 					#defaultable: true ) ) ) )</body>

<body package="EROS" selector="menuSpec">menuSpec	"Tools.UIPainter new openOnClass: self andSelector: #menuSpec"	&lt;resource: #canvas&gt;	^#(#{UI.FullSpec} 		#window: 		#(#{UI.WindowSpec} 			#label: 'Unlabeled Canvas' 			#min: #(#{Core.Point} 20 20 ) 			#max: #(#{Core.Point} 0 0 ) 			#bounds: #(#{Graphics.Rectangle} 58 44 1308 694 ) ) 		#component: 		#(#{UI.SpecCollection} 			#collection: #(				#(#{UI.DividerSpec} 					#layout: #(#{Graphics.Rectangle} 724 2 728 607 ) 					#name: #Divider1 					#orientation: #vertical ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 31 54 228 173 ) 					#name: #List1 					#model: #listAppetizers 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 254 55 451 174 ) 					#name: #List2 					#model: #listMainDish 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 484 54 681 173 ) 					#name: #List3 					#model: #listDesserts 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 146 238 343 357 ) 					#name: #List4 					#model: #listSoda 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 390 236 587 355 ) 					#name: #List5 					#model: #listLongDrink 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 130 177 211 200 ) 					#name: #ActionButton1 					#model: #billAppetizer 					#label: 'Add Appetizer' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 350 181 431 204 ) 					#name: #ActionButton2 					#model: #billMainDish 					#label: 'Add Main Dish' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 583 179 664 202 ) 					#name: #ActionButton3 					#model: #billDessert 					#label: 'Add Dessert' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 248 361 329 384 ) 					#name: #ActionButton4 					#model: #billSoda 					#label: 'Add Soda' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 486 359 567 382 ) 					#name: #ActionButton5 					#model: #billLongDrink 					#label: 'Add Long Drink' 					#defaultable: true ) 				#(#{UI.DividerSpec} 					#layout: #(#{Graphics.Rectangle} 4 399 724 403 ) 					#name: #Divider2 ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 111 443 333 468 ) 					#name: #InputField1 					#flags: 0 					#model: #itemName ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 110 491 666 518 ) 					#name: #InputField2 					#flags: 0 					#model: #itemIngredient ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 109 543 331 568 ) 					#name: #InputField3 					#flags: 0 					#model: #itemSideDish ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 441 444 495 469 ) 					#name: #InputField4 					#flags: 0 					#model: #itemPrice 					#type: #number 					#formatString: '0.00' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 603 446 665 474 ) 					#name: #InputField5 					#flags: 0 					#model: #itemCalory 					#type: #number 					#formatString: '0' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 441 541 663 566 ) 					#name: #InputField6 					#flags: 0 					#model: #itemDescription ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 1027 438 1127 459 ) 					#name: #InputField7 					#model: #totalPrice 					#type: #number 					#formatString: '0.00' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 1026 477 1126 498 ) 					#name: #InputField8 					#model: #totalColories 					#type: #number 					#formatString: '0' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 968 528 1131 576 ) 					#name: #ActionButton6 					#model: #makePayment 					#label: 'Make Payment' 					#defaultable: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 92 31 ) 					#name: #Label1 					#label: 'Appetizer' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 327 33 ) 					#name: #Label2 					#label: 'Main Dish' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 567 32 ) 					#name: #Label3 					#label: 'Dessert' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 227 215 ) 					#name: #Label4 					#label: 'Soda' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 474 212 ) 					#name: #Label5 					#label: 'Long Drink' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 48 443 ) 					#name: #Label6 					#label: 'Name :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 30 493 ) 					#name: #Label7 					#label: 'Ingredients :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 38 547 ) 					#name: #Label8 					#label: 'Side Dish :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 385 447 ) 					#name: #Label9 					#label: 'Price ($) :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 551 449 ) 					#name: #Label10 					#label: 'Calories :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 373 541 ) 					#name: #Label11 					#label: 'Description :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 951 436 ) 					#name: #Label12 					#label: 'Total Price ($)' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 952 477 ) 					#name: #Label13 					#label: 'Total Calories' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 746 7 ) 					#name: #Label14 					#label: 'BILLING' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 7 409 ) 					#name: #Label15 					#label: 'ITEM DETAILS' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 9 4 ) 					#name: #Label16 					#label: 'MENU' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 781 443 888 478 ) 					#name: #ActionButton7 					#model: #suggestFullMeal 					#label: 'Suggest Full Meal' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 783 508 889 542 ) 					#name: #ActionButton8 					#model: #suggestLightMeal 					#label: 'Suggest Light Meal' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 938 380 1019 403 ) 					#name: #ActionButton9 					#model: #clearBill 					#label: 'Clear' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 498 179 579 202 ) 					#name: #ActionButton11 					#model: #dessertInfo 					#label: 'Display Details' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 264 181 345 204 ) 					#name: #ActionButton12 					#model: #mainDishInfo 					#label: 'Display Details' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 43 178 124 201 ) 					#name: #ActionButton13 					#model: #appetizerInfo 					#label: 'Display Details' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 157 361 238 384 ) 					#name: #ActionButton14 					#model: #sodaInfo 					#label: 'Display Details' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 400 359 481 382 ) 					#name: #ActionButton15 					#model: #longDrinkInfo 					#label: 'Display Details' 					#defaultable: true ) 				#(#{UI.SequenceViewSpec} 					#layout: #(#{Graphics.Rectangle} 809 63 1160 372 ) 					#name: #List6 					#model: #billList 					#useModifierKeys: true 					#selectionType: #highlight ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 932 37 ) 					#name: #Label17 					#label: 'Item | Calories | Price' ) ) ) )</body>

<body package="EROS" selector="windowSpec">windowSpec	"Tools.UIPainter new openOnClass: self andSelector: #windowSpec"	&lt;resource: #canvas&gt;	^#(#{UI.FullSpec} 		#window: 		#(#{UI.WindowSpec} 			#properties: #(#{UI.PropertyListDictionary} #sizeType #specifiedSize #positionType #screenCenter #openType #advanced ) 			#label: 'EROS' 			#min: #(#{Core.Point} 20 20 ) 			#max: #(#{Core.Point} 0 0 ) 			#bounds: #(#{Graphics.Rectangle} 33 31 1333 731 ) ) 		#component: 		#(#{UI.SpecCollection} 			#collection: #(				#(#{UI.TabControlSpec} 					#layout: #(#{Graphics.LayoutFrame} 6 0 6 0 -7 1 -51 1 ) 					#name: #tabbing 					#model: #tabs 					#labels: #() ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 25 661 ) 					#name: #Label1 					#label: 'OTHER OPTIONS' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 133 661 214 684 ) 					#name: #ActionButton1 					#model: #menuClear 					#label: 'Clear Menu' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 227 661 308 684 ) 					#name: #ActionButton2 					#model: #menuImport 					#label: 'Retrieve List' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 323 661 404 684 ) 					#name: #ActionButton3 					#model: #menuExport 					#label: 'Save List' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 1210 663 1291 686 ) 					#name: #ActionButton4 					#model: #exitEROS 					#label: 'Quit EROS' 					#defaultable: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 433 663 ) 					#name: #Label2 					#label: 'STATUS:' ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 480 664 1173 685 ) 					#name: #InputField1 					#flags: 0 					#model: #statusEROS ) ) ) )</body>
</methods>


<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>accessing</category>

<body package="EROS" selector="tabs:">tabs: anObject	^tabs := anObject</body>

<body package="EROS" selector="storage:">storage: anObject	storage := anObject</body>

<body package="EROS" selector="tabs1">tabs1	^tabs</body>

<body package="EROS" selector="storage">storage	^storage</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>changing</category>

<body package="EROS" selector="tabsChanged">tabsChanged	"Every time, a tab is changed, a new sub canvas gets installed."	| index |	index := self tabs selectionIndex.	(self builder componentAt: #tabbing) widget client: self spec: (self specArray at: index)</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>private</category>

<body package="EROS" selector="labelArray">labelArray	"Private - The list of tab names (and/or icons). See also #specArray."	"creates the labels for the tabs"	^Array with: 'Menu and Billing' with: 'Adminstration'</body>

<body package="EROS" selector="specArray">specArray	"Private - The list of associated sub canvaes. See also #labelArray."	"sub canvas creater"	^#(#menuSpec #adminSpec)</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>actions</category>

<body package="EROS" selector="clearMenu">clearMenu"clean all the menu entries"storage := nil.storage := Storage new.statusEROS value: 'Menu Cleared...'.self refreshLists.</body>

<body package="EROS" selector="deleteSode">deleteSode"delete from the dictionary"	| keyValue aList |	aList := SelectionInList new.	aList list: listSoda.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to delete'.			^self]		ifFalse: 			[storage removeSoda: keyValue.			storage aListSoda remove: keyValue.			statusEROS value: 'Soda Removed from the Dictionary'.			self refreshForm]</body>

<body package="EROS" selector="appetizerInfo">appetizerInfo	"Appetizer information"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listAppetizers.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Appetizer item to display details'.			^self]		ifFalse: 			[			classValues := storage listAppetizer at: keyValue.			itemName value: classValues name.			itemPrice value: classValues price.			itemCalory value: classValues calories.			itemIngredient value: classValues ingredients.			itemDescription value: classValues description.			statusEROS value: 'Appetizer Displayed']</body>

<body package="EROS" selector="clearBill">clearBill	"clear the list"	storage aListBill: nil.	storage aListBill: OrderedCollection new.	totalColories value: 0.	totalPrice value: 0.00.	self refreshLists.	statusEROS value: 'Bill cleared and List refreshed....'.	^self</body>

<body package="EROS" selector="deleteMainDish">deleteMainDish"delete from the dictionary"	| keyValue aList |	aList := SelectionInList new.	aList list: listMainDish.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to delete'.			^self]		ifFalse: 			[storage removeMainDish: keyValue.			storage aListMainDish remove: keyValue.			statusEROS value: 'Main Dish Removed from the Dictionary'.			self refreshForm]</body>

<body package="EROS" selector="refreshLists">refreshLists"reset all the lists and dictionary"listMainDish list: storage aListMainDish.listDesserts list: storage aListDessert. listAppetizers list: storage aListAppetizer. listSoda list: storage aListSoda. listLongDrink list: storage aListLongDrink.billList list: storage aListBill.</body>

<body package="EROS" selector="suggestFullMeal">suggestFullMeal"creates four lists and loops around all of them, checking if the combination meets the requirement of the price and calories"	| appetizersListSize mainDishListSize dessertListSize sodaListSize longDrinkListSize tempSize1 tempSize2 tempSize3 tempSize4 tempSize5 tempKey1 tempKey2 tempKey3 tempKey4 tempKey5 md app sod ld des priceT caloriesT tmpList |	self clearBill.	priceT := (Dialog request: 'Enter Price Limit' initialAnswer: '0')				asNumber.	caloriesT := (Dialog request: 'Enter Calories amount required'				initialAnswer: '0') asNumber.	statusEROS value: 'Suggesting Full Meal...'.	tempSize1 := tempSize2 := tempSize3 := tempSize4 := tempSize5 := 1.	appetizersListSize := storage aListAppetizer size.	mainDishListSize := storage aListMainDish size.	dessertListSize := storage aListDessert size.	sodaListSize := storage aListSoda size.	longDrinkListSize := storage aListLongDrink size.	[tempSize1 &gt; mainDishListSize] whileFalse: 			[tempKey1 := storage aListMainDish at: tempSize1.			[tempSize2 &gt; appetizersListSize] whileFalse: 					[tempKey2 := storage aListAppetizer at: tempSize2.					[tempSize3 &gt; sodaListSize] whileFalse: 							[tempKey3 := storage aListSoda at: tempSize3.							[tempSize4 &gt; longDrinkListSize] whileFalse: 									[tempKey4 := storage aListLongDrink at: tempSize4.									[tempSize5 &gt; dessertListSize] whileFalse: 											[tempKey5 := storage aListDessert at: tempSize5.											md := storage listMainDish at: tempKey1.											app := storage listAppetizer at: tempKey2.											sod := storage listSoda at: tempKey3.											ld := storage listLongDrink at: tempKey4.											des := storage listDessert at: tempKey5.											md price + app price + sod price + ld price &lt;= priceT												&amp; (md calories + app calories + sod calories + ld calories &lt;= caloriesT)													ifTrue: 														[tmpList := 'Recommended Menu : '.														storage aListBill add: tmpList.														tmpList := 'Appetizer: ' , app name , ' | ' , app calories printString																	, ' | ' , app price printString.														storage aListBill add: tmpList.														tmpList := 'Main Dish: ' , md name , ' | ' , md calories printString																	, ' | ' , md price printString.														storage aListBill add: tmpList.														tmpList := 'Soda: ' , sod name , ' | ' , sod calories printString , ' | '																	, sod price printString.														storage aListBill add: tmpList.														tmpList := 'Long Drink: ' , ld name , ' | ' , ld calories printString																	, ' | ' , ld price printString.														storage aListBill add: tmpList.														totalColories value: 0.														totalPrice value: 0.00.														totalPrice value: ld price + app price + md price + sod price.														totalColories															value: ld calories + sod calories + md calories + app calories.														self refreshLists.														^self]													ifFalse: "desert instead of the appetizer"														[md price + des price + sod price + ld price &lt;= priceT															&amp; (md calories + des calories + sod calories + ld calories &lt;= caloriesT)																ifTrue: 																	[tmpList := 'Recommended Menu : '.																	storage aListBill add: tmpList.																	tmpList := 'Main Dish: ' , md name , ' | ' , md calories printString																				, ' | ' , md price printString.																	storage aListBill add: tmpList.																	tmpList := 'Dessert: ' , des name , ' | ' , des calories printString																				, ' | ' , des price printString.																	storage aListBill add: tmpList.																	tmpList := 'Soda: ' , sod name , ' | ' , sod calories printString , ' | '																				, sod price printString.																	storage aListBill add: tmpList.																	tmpList := 'Long Drink: ' , ld name , ' | ' , ld calories printString																				, ' | ' , ld price printString.																	storage aListBill add: tmpList.																	totalColories value: 0.																	totalPrice value: 0.00.																	totalPrice value: ld price + des price + md price + sod price.																	totalColories																		value: ld calories + sod calories + md calories + des calories.																	self refreshLists.																	^self]																ifFalse: [tempSize5 := tempSize5 + 1]]].									tempSize4 := tempSize4 + 1].							tempSize3 := tempSize3 + 1].					tempSize2 := tempSize2 + 1].			tempSize1 := tempSize1 + 1]."incase there are no valid combination"	Dialog warn: 'Cannot recommend meal for the give price or calories range'.	^self</body>

<body package="EROS" selector="addItem">addItem"Adding item into the dictionary"	| tmp |	(nameOfItem isNil | nameOfItem value) = ''		ifTrue: 			[Dialog warn: 'Please enter the name of the Item to be added'.			^self].	selectedItem value = '1'		ifTrue: 			[tmp := Appetizer new.			tmp name: nameOfItem value.			tmp price: priceOfItem value.			tmp calories: caloryCount value.			tmp ingredients: ingredients value.			tmp description: description value.			storage addAppetizer: tmp.			storage aListAppetizer add: nameOfItem value.			self refreshForm.			statusEROS value: 'Appetizer Added to the Menu'.			^self].	selectedItem value = '2'		ifTrue: 			[tmp := MainDish new.			tmp name: nameOfItem value.			tmp price: priceOfItem value.			tmp calories: caloryCount value.			tmp ingredients: ingredients value.			tmp sideDish: sideDish value.			storage addMainDish: tmp.			storage aListMainDish add: nameOfItem value.			self refreshForm.			statusEROS value: 'Main Dish Added to the Menu'.			^self].	selectedItem value = '3'		ifTrue: 			[tmp := Dessert new.			tmp name: nameOfItem value.			tmp price: priceOfItem value.			tmp ingredients: ingredients value.			tmp calories: caloryCount value.			storage addDessert: tmp.			storage aListDessert add: nameOfItem value.			self refreshForm.			statusEROS value: 'Dessert Added to the Menu'.			^self].	selectedItem value = '4'		ifTrue: 			[tmp := Soda new.			tmp name: nameOfItem value.			tmp price: priceOfItem value.			tmp calories: caloryCount value.			storage aListSoda add: nameOfItem value.			storage addSoda: tmp.			self refreshForm.			statusEROS value: 'Soda Added to the Menu'.			^self].	selectedItem value = '5'		ifTrue: 			[tmp := LongDrink new.			tmp name: nameOfItem value.			tmp price: priceOfItem value.			tmp calories: caloryCount value.			tmp ingredient: ingredients value.			storage addLongDrink: tmp.			storage aListLongDrink add: nameOfItem value.			self refreshForm.			statusEROS value: 'Long Drink Added to the Menu'.			^self].	Dialog warn: 'Invalid Item Selection'</body>

<body package="EROS" selector="billMainDish">billMainDish	"billing operation"	| keyValue aList classValues tmpList |	aList := SelectionInList new.	aList list: listMainDish.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Main Dish item to bill'.			^self]		ifFalse: 			[classValues := storage listMainDish at: keyValue.			tmpList := 'Main Dish: ' , classValues name , ' | '						, classValues calories printString , ' | '						, classValues price printString.			storage aListBill add: tmpList.			totalColories value: totalColories value + classValues price.			totalPrice value: totalColories value + classValues calories.			statusEROS value: 'Bill List refreshed....'.			self refreshLists]</body>

<body package="EROS" selector="dessertInfo">dessertInfo"desert info on the console"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listDesserts.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Dessert to display details'.			^self]		ifFalse: 			[			classValues := storage listDessert at: keyValue.			itemName value: classValues name.			itemPrice value: classValues price.			itemCalory value: classValues calories.			itemIngredient value: classValues ingredients.			statusEROS value: 'Dessert Displayed']</body>

<body package="EROS" selector="deleteLongDrink">deleteLongDrink"delete from the dictionary"	| keyValue aList |	aList := SelectionInList new.	aList list: listLongDrink.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to delete'.			^self]		ifFalse: 			[storage removeLongDrink: keyValue.			storage aListLongDrink remove: keyValue.			statusEROS value: 'Long Drink Removed from the Dictionary'.			self refreshForm]</body>

<body package="EROS" selector="editAppetizer">editAppetizer"edit item"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listAppetizers.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Appetizer item to display details'.			^self]		ifFalse: 			[self refreshForm.			classValues := storage listAppetizer at: keyValue.			nameOfItem value: classValues name.			priceOfItem value: classValues price.			caloryCount value: classValues calories.			ingredients value: classValues ingredients.			description value: classValues description.			statusEROS value: 'Appetizer ready to be editted']</body>

<body package="EROS" selector="sodaInfo">sodaInfo"info about the soda"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listSoda.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Soda Item to display details'.			^self]		ifFalse: 			[			classValues := storage listSoda at: keyValue.			itemName value: classValues name.			itemPrice value: classValues price.			itemCalory value: classValues calories.			statusEROS value: 'Soda Displayed']</body>

<body package="EROS" selector="menuImport">menuImport"import menu by bos"	| file boss backup tmp |		[	[backup := storage.	file := Dialog requestFileName: 'Enter file name'.	boss := BinaryObjectStorage onOld: (Filename named: file) readStream.	tmp := boss next.	boss close.	storage := tmp.	self refreshLists.	statusEROS value: 'File Import Successful !']			on: Error			do: 				[:ex |				Dialog warn: 'File Import Unsuccessful, reverting back the changes !'.				storage := backup.				self refreshLists]]			ensure: []</body>

<body package="EROS" selector="makePayment">makePayment	Dialog warn:'Payment gateway not currently implemented'.	^self</body>

<body package="EROS" selector="mainDishInfo">mainDishInfo"main dish information"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listMainDish.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to display details'.			^self]		ifFalse: 			[			classValues := storage listMainDish at: keyValue.			itemName value: classValues name.			itemPrice value: classValues price.			itemCalory value: classValues calories.			itemIngredient value: classValues ingredients.			itemSideDish value: classValues sideDish.			statusEROS value: 'Main Dish Displayed']</body>

<body package="EROS" selector="billLongDrink">billLongDrink"billing operation"	| keyValue aList classValues tmpList |	aList := SelectionInList new.	aList list: listLongDrink.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Long Drink item to bill'.			^self]		ifFalse: 			[classValues := storage listLongDrink at: keyValue.			tmpList := 'Long Drink: ' , classValues name , ' | '						, classValues calories printString , ' | '						, classValues price printString.			storage aListBill add: tmpList.			totalColories value: totalColories value + classValues price.			totalPrice value: totalColories value + classValues calories.			statusEROS value: 'Bill List refreshed....'.			self refreshLists]</body>

<body package="EROS" selector="deleteAppetizers">deleteAppetizers"delete from the dictionary"	| keyValue aList |	aList := SelectionInList new.	aList list: listAppetizers.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to delete'.			^self]		ifFalse: 			[storage removeAppetizer: keyValue.			storage aListAppetizer remove: keyValue.			statusEROS value: 'Appetizer Removed from the Dictionary'.			self refreshForm]</body>

<body package="EROS" selector="billAppetizer">billAppetizer	"billing operation"	| keyValue aList classValues tmpList |	aList := SelectionInList new.	aList list: listAppetizers.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Appetizer item to bill'.			^self]		ifFalse: 			[classValues := storage listAppetizer at: keyValue.			tmpList := 'Appetizer: ' , classValues name , ' | '						, classValues calories printString , ' | '						, classValues price printString.			storage aListBill add: tmpList.			totalColories value: totalColories value + classValues price.			totalPrice value: totalColories value + classValues calories.			statusEROS value: 'Bill List refreshed....'.			self refreshLists]</body>

<body package="EROS" selector="menuClear">menuClear	"clear all the dictionary"	storage := nil.	storage := Storage new.	statusEROS value: 'Menu Cleared and lists refreshed !'.	self refreshLists</body>

<body package="EROS" selector="deleteItemKey">deleteItemKey"delete from the dictionary using name"	statusEROS value: 'Delete by Name initiated...'.	(nameOfItem isNil | nameOfItem value) = ''		ifTrue: 			[Dialog warn: 'Please enter the name of the Item to perform delete'.			^self].	selectedItem value = '1'		ifTrue: 			[			storage removeAppetizer: nameOfItem value.			storage aListAppetizer remove: nameOfItem value.			self refreshForm.			^self].	selectedItem value = '2'		ifTrue: 			[			storage removeMainDish: nameOfItem value.			storage aListMainDish remove: nameOfItem value.			self refreshForm.			^self].	selectedItem value = '3'		ifTrue: 			[storage removeDessert: nameOfItem value.			storage aListDessert remove: nameOfItem value.			self refreshForm.			^self].	selectedItem value = '4'		ifTrue: 			[			storage aListSoda remove: nameOfItem value.			storage removeSoda: nameOfItem value.			self refreshForm.			^self].	selectedItem value = '5'		ifTrue: 			[			storage removeLongDrink: nameOfItem value.			storage aListLongDrink remove: nameOfItem value.			self refreshForm.			^self].	Dialog warn: 'Invalid Item Selection'.	statusEROS value: 'Delete by Name failed...'.</body>

<body package="EROS" selector="deleteDessert">deleteDessert"delete from the dictionary"	| keyValue aList |	aList := SelectionInList new.	aList list: listDesserts.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an item to delete'.			^self]		ifFalse: 			[storage removeDessert: keyValue.			storage aListDessert remove: keyValue.			statusEROS value: 'Dessert Removed from the Dictionary'.			self refreshForm]</body>

<body package="EROS" selector="editMainDish">editMainDish"edit item"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listMainDish.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Main Dish item to display details'.			^self]		ifFalse: 			[self refreshForm.			classValues := storage listMainDish at: keyValue.			nameOfItem value: classValues name.			priceOfItem value: classValues price.			caloryCount value: classValues calories.			ingredients value: classValues ingredients.			sideDish value: classValues sideDish.			statusEROS value: 'Main Dish ready to be editted']</body>

<body package="EROS" selector="longDrinkInfo">longDrinkInfo"item information"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listLongDrink.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Long Drink item to display details'.			^self]		ifFalse: 			[			classValues := storage listLongDrink at: keyValue.			itemName value: classValues name.			itemPrice value: classValues price.			itemCalory value: classValues calories.			itemIngredient value: classValues ingredient.			statusEROS value: 'Long Drink Displayed']</body>

<body package="EROS" selector="billDessert">billDessert	"billing operation"	| keyValue aList classValues tmpList |	aList := SelectionInList new.	aList list: listDesserts.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Dessert item to bill'.			^self]		ifFalse: 			[classValues := storage listDessert at: keyValue.			tmpList := 'Dessert: ' , classValues name , ' | '						, classValues calories printString , ' | '						, classValues price printString.			storage aListBill add: tmpList.			totalColories value: totalColories value + classValues price.			totalPrice value: totalColories value + classValues calories.			statusEROS value: 'Bill List refreshed....'.			self refreshLists]</body>

<body package="EROS" selector="editLongDrink">editLongDrink"edit item"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listLongDrink.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Long Drink item to display details'.			^self]		ifFalse: 			[self refreshForm.			classValues := storage listLongDrink at: keyValue.			nameOfItem value: classValues name.			priceOfItem value: classValues price.			caloryCount value: classValues calories.			ingredients value: classValues ingredient.			statusEROS value: 'Long Drink ready to be editted']</body>

<body package="EROS" selector="exitEROS">exitEROS"eXIT EROS, after confirmation"	(Dialog confirm: 'Do you want to Quit EROS ?')		ifTrue: 			[(Dialog confirm: 'Do you want to save the menu before quiting ?')				ifTrue: 					[| file boss |										[					[statusEROS value: 'Exit EROS was initiated'.					file := Dialog requestFileName: 'Enter file name'.					boss := BinaryObjectStorage onNew: (Filename named: file) writeStream.					boss nextPut: storage.					boss close.					Dialog warn: 'File Export Successful, hope to see you again !'.					self closeRequest]							on: Error							do: [:ex | Dialog warn: 'File Export Unsuccessful, please try again !']]							ensure: []]				ifFalse: 					[Dialog warn: 'Have a Great Day !'.					self closeRequest]]		ifFalse: []</body>

<body package="EROS" selector="menuExport">menuExport	"export menu using bos"	| file boss |		[	[file := Dialog requestFileName: 'Enter file name'.	boss := BinaryObjectStorage onNew: (Filename named: file) writeStream.	boss nextPut: storage.	boss close.	statusEROS value: 'File Export Successful !']			on: Error			do: [:ex | Dialog warn: 'File Export Unsuccessful !']]			ensure: []</body>

<body package="EROS" selector="refreshForm">refreshForm"refrest console after each operation"	nameOfItem value: ''.	priceOfItem value: 0.00.	caloryCount value: 0.	ingredients value: ''.	description value: ''.	sideDish value: ''.	itemName value: ''.	itemPrice value: 0.00.	itemCalory value: 0.	itemIngredient value: ''.	itemDescription value: ''.	itemSideDish value: ''.	self refreshLists</body>

<body package="EROS" selector="billSoda">billSoda	"billing operation"	| keyValue aList classValues tmpList |	aList := SelectionInList new.	aList list: listSoda.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select an Soda item to bill'.			^self]		ifFalse: 			[classValues := storage listSoda at: keyValue.			tmpList := 'Soda: ' , classValues name , ' | '						, classValues calories printString , ' | '						, classValues price printString.			storage aListBill add: tmpList.			totalColories value: totalColories value + classValues price.			totalPrice value: totalColories value + classValues calories.			statusEROS value: 'Bill List refreshed....'.			self refreshLists]</body>

<body package="EROS" selector="suggestLightMeal">suggestLightMeal"Light meal generator. Creates three lists and for all the combination and checks if it meets the criteria"	| appetizersListSize dessertListSize sodaListSize tempSize1 tempSize2 tempSize3 tempKey1 tempKey2 tempKey3 app sod des priceT caloriesT tmpList |	self clearBill."clear the billing list"	priceT := (Dialog request: 'Enter Price Limit' initialAnswer: '0')				asNumber.	caloriesT := (Dialog request: 'Enter Calories amount required'				initialAnswer: '0') asNumber.	statusEROS value: 'Suggesting Light meal...'.	tempSize1 := tempSize2 := tempSize3 := 1.	appetizersListSize := storage aListAppetizer size.	dessertListSize := storage aListDessert size.	sodaListSize := storage aListSoda size.	[tempSize1 &gt; appetizersListSize] whileFalse: 			[tempKey1 := storage aListAppetizer at: tempSize1.			[tempSize2 &gt; sodaListSize] whileFalse: 					[tempKey2 := storage aListSoda at: tempSize2.					[tempSize3 &gt; dessertListSize] whileFalse: 							[tempKey3 := storage aListDessert at: tempSize3.							app := storage listAppetizer at: tempKey1.							sod := storage listSoda at: tempKey2.							des := storage listDessert at: tempKey3.							app price + sod price + des price &lt;= priceT								&amp; (app calories + sod calories + des calories &lt;= caloriesT)									ifTrue: 										[tmpList := 'Recommended Light Menu : '.										storage aListBill add: tmpList.										tmpList := 'Appetizer: ' , app name , ' | ' , app calories printString													, ' | ' , app price printString.										storage aListBill add: tmpList.										tmpList := 'Soda: ' , sod name , ' | ' , sod calories printString , ' | '													, sod price printString.										storage aListBill add: tmpList.										tmpList := 'Desserts: ' , des name , ' | ' , des calories printString													, ' | ' , des price printString.										storage aListBill add: tmpList.										totalColories value: 0.										totalPrice value: 0.00.										totalPrice value: app price + des price + sod price.										totalColories value: sod calories + des calories + app calories.										self refreshLists.										^self].							tempSize3 := tempSize3 + 1].					tempSize2 := tempSize2 + 1].			tempSize1 := tempSize1 + 1]."incase there are no valid combination"	Dialog		warn: 'Cannot recommend light meal for the give price or calories range'.	^self</body>

<body package="EROS" selector="editDessert">editDessert"edit item"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listDesserts.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Dessert to display details'.			^self]		ifFalse: 			[self refreshForm.			classValues := storage listDessert at: keyValue.			nameOfItem value: classValues name.			priceOfItem value: classValues price.			caloryCount value: classValues calories.			ingredients value: classValues ingredients.						statusEROS value: 'Dessert ready to be editted']</body>

<body package="EROS" selector="editSoda">editSoda	"edit item"	| keyValue aList classValues |	aList := SelectionInList new.	aList list: listSoda.	keyValue := aList list selection.	keyValue isNil		ifTrue: 			[Dialog warn: 'Select a Soda item to display details'.			^self]		ifFalse: 			[self refreshForm.			classValues := storage listSoda at: keyValue.			nameOfItem value: classValues name.			priceOfItem value: classValues price.			caloryCount value: classValues calories.			statusEROS value: 'Soda ready to be editted']</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>interface opening</category>

<body package="EROS" selector="postOpenWith:">postOpenWith: aBuilder	super postOpenWith: aBuilder.	self tabsChanged</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	| md |	super initialize.	storage := Storage new. "initializes all the dictionary and the collection list for the application"	md := MenuBuilder new."creates the drop down menu for the addition of the food items"	md add: 'Appetizer' -&gt; '1'.	md add: 'Main Dish' -&gt; '2'.	md add: 'Desserts' -&gt; '3'.	md add: 'Soda' -&gt; '4'.	md add: 'Long Drink' -&gt; '5'.	menuItem := md menu asValue.</body>
</methods>

<methods>
<class-id>EROSSpace.EROSApplication</class-id> <category>aspects</category>

<body package="EROS" selector="itemSideDish">itemSideDish	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemSideDish isNil		ifTrue:			[itemSideDish := String new asValue]		ifFalse:			[itemSideDish]</body>

<body package="EROS" selector="billTable">billTable	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^billTable isNil		ifTrue:			[billTable := TableInterface new selectionInTable: SelectionInTable new]		ifFalse:			[billTable]</body>

<body package="EROS" selector="itemPrice">itemPrice	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemPrice isNil		ifTrue:			[itemPrice := 0 asValue]		ifFalse:			[itemPrice]</body>

<body package="EROS" selector="sideDish">sideDish	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^sideDish isNil		ifTrue:			[sideDish := String new asValue]		ifFalse:			[sideDish]</body>

<body package="EROS" selector="listSoda">listSoda	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listSoda isNil		ifTrue:			[listSoda := SelectionInList new]		ifFalse:			[listSoda]</body>

<body package="EROS" selector="price">price	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^price isNil		ifTrue:			[price := nil asValue]		ifFalse:			[price]</body>

<body package="EROS" selector="itemCalory">itemCalory	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemCalory isNil		ifTrue:			[itemCalory := 0 asValue]		ifFalse:			[itemCalory]</body>

<body package="EROS" selector="billList">billList	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^billList isNil		ifTrue:			[billList := SelectionInList new]		ifFalse:			[billList]</body>

<body package="EROS" selector="listLongDrink">listLongDrink	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listLongDrink isNil		ifTrue:			[listLongDrink := SelectionInList new]		ifFalse:			[listLongDrink]</body>

<body package="EROS" selector="totalPrice">totalPrice	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^totalPrice isNil		ifTrue:			[totalPrice := 0 asValue]		ifFalse:			[totalPrice]</body>

<body package="EROS" selector="totalColories">totalColories	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^totalColories isNil		ifTrue:			[totalColories := 0 asValue]		ifFalse:			[totalColories]</body>

<body package="EROS" selector="nameOfItem">nameOfItem	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^nameOfItem isNil		ifTrue:			[nameOfItem := String new asValue]		ifFalse:			[nameOfItem]</body>

<body package="EROS" selector="itemName">itemName	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemName isNil		ifTrue:			[itemName := String new asValue]		ifFalse:			[itemName]</body>

<body package="EROS" selector="description">description	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^description isNil		ifTrue:			[description := String new asValue]		ifFalse:			[description]</body>

<body package="EROS" selector="appStatus">appStatus	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^appStatus isNil		ifTrue:			[appStatus := String new asValue]		ifFalse:			[appStatus]</body>

<body package="EROS" selector="selectedItem">selectedItem	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^selectedItem isNil		ifTrue:			[selectedItem := nil asValue]		ifFalse:			[selectedItem]</body>

<body package="EROS" selector="caloryCount">caloryCount	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^caloryCount isNil		ifTrue:			[caloryCount := 0 asValue]		ifFalse:			[caloryCount]</body>

<body package="EROS" selector="ingredients">ingredients	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^ingredients isNil		ifTrue:			[ingredients := String new asValue]		ifFalse:			[ingredients]</body>

<body package="EROS" selector="listAppetizers">listAppetizers	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listAppetizers isNil		ifTrue:			[listAppetizers := SelectionInList new]		ifFalse:			[listAppetizers]</body>

<body package="EROS" selector="priceOfItem">priceOfItem	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^priceOfItem isNil		ifTrue:			[priceOfItem := 0 asValue]		ifFalse:			[priceOfItem]</body>

<body package="EROS" selector="tabs">tabs	tabs isNil		ifTrue:			[(tabs := SelectionInList with: self labelArray) selectionIndex: 1.			tabs selectionIndexHolder onChangeSend: #tabsChanged to: self].	^tabs</body>

<body package="EROS" selector="itemDescription">itemDescription	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemDescription isNil		ifTrue:			[itemDescription := String new asValue]		ifFalse:			[itemDescription]</body>

<body package="EROS" selector="menuItem">menuItem	^menuItem.</body>

<body package="EROS" selector="listMainDish">listMainDish	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listMainDish isNil		ifTrue:			[listMainDish := SelectionInList new]		ifFalse:			[listMainDish]</body>

<body package="EROS" selector="itemIngredient">itemIngredient	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^itemIngredient isNil		ifTrue:			[itemIngredient := String new asValue]		ifFalse:			[itemIngredient]</body>

<body package="EROS" selector="listDesserts">listDesserts	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listDesserts isNil		ifTrue:			[listDesserts := SelectionInList new]		ifFalse:			[listDesserts]</body>

<body package="EROS" selector="statusEROS">statusEROS	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^statusEROS isNil		ifTrue:			[statusEROS := String new asValue]		ifFalse:			[statusEROS]</body>

<body package="EROS" selector="listLongList">listLongList	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^listLongList isNil		ifTrue:			[listLongList := SelectionInList new]		ifFalse:			[listLongList]</body>
</methods>


<methods>
<class-id>EROSSpace.Appetizer</class-id> <category>accessing</category>

<body package="EROS" selector="description:">description: anObject	description := anObject</body>

<body package="EROS" selector="description">description	^description</body>
</methods>

<methods>
<class-id>EROSSpace.Appetizer</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	description := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>


<methods>
<class-id>EROSSpace.Storage class</class-id> <category>instance creation</category>

<body package="EROS" selector="new">new	"Answer a newly created and initialized instance."	^super new initialize</body>
</methods>


<methods>
<class-id>EROSSpace.Storage</class-id> <category>initialize-release</category>

<body package="EROS" selector="initialize">initialize	super initialize.	listMainDish := Dictionary new.	listDessert := Dictionary new.	listAppetizer := Dictionary new.	listSoda := Dictionary new.	listLongDrink := Dictionary new.	aListMainDish := OrderedCollection new.	aListDessert := OrderedCollection new.	aListAppetizer := OrderedCollection new.	aListSoda := OrderedCollection new.	aListLongDrink := OrderedCollection new.	aListBill := OrderedCollection new</body>
</methods>

<methods>
<class-id>EROSSpace.Storage</class-id> <category>accessing</category>

<body package="EROS" selector="listMainDish:">listMainDish: anObject	listMainDish := anObject</body>

<body package="EROS" selector="aListLongDrink">aListLongDrink	^aListLongDrink</body>

<body package="EROS" selector="aListLongDrink:">aListLongDrink: anObject	aListLongDrink := anObject</body>

<body package="EROS" selector="listDessert:">listDessert: anObject	listDessert := anObject</body>

<body package="EROS" selector="aListSoda">aListSoda	^aListSoda</body>

<body package="EROS" selector="aListSoda:">aListSoda: anObject	aListSoda := anObject</body>

<body package="EROS" selector="listAppetizer">listAppetizer	^listAppetizer</body>

<body package="EROS" selector="listLongDrink">listLongDrink	^listLongDrink</body>

<body package="EROS" selector="aListDessert">aListDessert	^aListDessert</body>

<body package="EROS" selector="aListBill">aListBill	^aListBill</body>

<body package="EROS" selector="aListBill:">aListBill: anObject	aListBill := anObject</body>

<body package="EROS" selector="aListMainDish">aListMainDish	^aListMainDish</body>

<body package="EROS" selector="listAppetizer:">listAppetizer: anObject	listAppetizer := anObject</body>

<body package="EROS" selector="aListDessert:">aListDessert: anObject	aListDessert := anObject</body>

<body package="EROS" selector="listLongDrink:">listLongDrink: anObject	listLongDrink := anObject</body>

<body package="EROS" selector="listSoda">listSoda	^listSoda</body>

<body package="EROS" selector="aListMainDish:">aListMainDish: anObject	aListMainDish := anObject</body>

<body package="EROS" selector="listSoda:">listSoda: anObject	listSoda := anObject</body>

<body package="EROS" selector="aListAppetizer">aListAppetizer	^aListAppetizer</body>

<body package="EROS" selector="aListAppetizer:">aListAppetizer: anObject	aListAppetizer := anObject</body>

<body package="EROS" selector="listMainDish">listMainDish	^listMainDish</body>

<body package="EROS" selector="listDessert">listDessert	^listDessert</body>
</methods>

<methods>
<class-id>EROSSpace.Storage</class-id> <category>list-operation</category>

<body package="EROS" selector="addMainDish:">addMainDish: item	listMainDish add: item name -&gt; item</body>

<body package="EROS" selector="removeSoda:">removeSoda: itemlistSoda removeKey: item.</body>

<body package="EROS" selector="addLongDrink:">addLongDrink: item	listLongDrink add: item name -&gt; item</body>

<body package="EROS" selector="addAppetizer:">addAppetizer: item	listAppetizer add: item name -&gt; item</body>

<body package="EROS" selector="removeMainDish:">removeMainDish: itemlistMainDish removeKey: item.</body>

<body package="EROS" selector="addSoda:">addSoda: item	listSoda add: item name -&gt; item</body>

<body package="EROS" selector="removeAppetizer:">removeAppetizer: itemlistAppetizer removeKey: item.</body>

<body package="EROS" selector="removeDessert:">removeDessert: itemlistDessert removeKey: item.</body>

<body package="EROS" selector="removeLongDrink:">removeLongDrink: itemlistLongDrink removeKey: item.</body>

<body package="EROS" selector="addDessert:">addDessert: item	listDessert add: item name -&gt; item</body>
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
