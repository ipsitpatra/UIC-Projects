<?xml version="1.0"?>

<st-source>
<time-stamp>From VisualWorks® Personal Use Edition, 7.10 of July 10, 2013 on February 23, 2014 at 12:07:22 PM</time-stamp>


<component-created>
<name>CS474</name> <type>package</type>
</component-created><!-- Package CS474* -->


<component-property>
<name>CS474</name> <type>package</type>
<property>comment</property> <value>' 
Name: Ipsit Patra (673438945)
CS 474 Project 1- Set Calculator SmallTalk

'</value>
</component-property>

<name-space>
<name>MyBTree</name>
<environment>Smalltalk</environment>
<private>false</private>
<imports>
			private Smalltalk.*
			</imports>
<category></category>
<attributes>
<package>CS474</package>
</attributes>
</name-space>

<comment>
<name-space-id>MyBTree</name-space-id>
<body>New Namespace for the project==========================Author Name: Ipsit Patra (673438945)CS 474 Project 1-SmallTalk</body>
</comment>

<class>
<name>BTree</name>
<environment>MyBTree</environment>
<super>Core.Object</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>root pointer parent </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>CS474</package>
</attributes>
</class>

<comment>
<class-id>MyBTree.BTree</class-id>
<body>BTree Operation holder==========================Author Name: Ipsit Patra (673438945)CS 474 Project 1-SmallTalk</body>
</comment>

<class>
<name>BTreeConsole</name>
<environment>MyBTree</environment>
<super>UI.ApplicationModel</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>input output1 output2 tmp bTree1 bTree2 output3 </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>CS474</package>
</attributes>
</class>

<comment>
<class-id>MyBTree.BTreeConsole</class-id>
<body>Console for the BTree==========================Author Name: Ipsit Patra (673438945)CS 474 Project 1-SmallTalk</body>
</comment>

<class>
<name>BTreeNode</name>
<environment>MyBTree</environment>
<super>Core.Object</super>
<private>false</private>
<indexed-type>none</indexed-type>
<inst-vars>left right value </inst-vars>
<class-inst-vars></class-inst-vars>
<imports></imports>
<category></category>
<attributes>
<package>CS474</package>
</attributes>
</class>

<comment>
<class-id>MyBTree.BTreeNode</class-id>
<body>Binary Tree Node==========================Author Name: Ipsit Patra (673438945)CS 474 Project 1-SmallTalk</body>
</comment>

<methods>
<class-id>MyBTree.BTreeConsole class</class-id> <category>interface specs</category>

<body package="CS474" selector="windowSpec">windowSpec	"Tools.UIPainter new openOnClass: self andSelector: #windowSpec"	&lt;resource: #canvas&gt;	^#(#{UI.FullSpec} 		#window: 		#(#{UI.WindowSpec} 			#label: 'Project 1 : Set Calculator' 			#bounds: #(#{Graphics.Rectangle} 471 231 1003 507 ) ) 		#component: 		#(#{UI.SpecCollection} 			#collection: #(				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 107 26 408 48 ) 					#name: #InputField1 					#model: #input ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 104 110 407 131 ) 					#name: #InputField2 					#model: #output1 					#tabable: false 					#isReadOnly: true ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 104 143 408 163 ) 					#name: #InputField3 					#model: #output2 					#tabable: false 					#isReadOnly: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 104 75 185 98 ) 					#name: #ActionButton1 					#model: #add 					#label: 'Add Element(s)' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 204 75 302 99 ) 					#name: #ActionButton2 					#model: #remove 					#label: 'Remove Element(s)' 					#defaultable: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 123 47 ) 					#name: #Label1 					#label: 'Input can be number(s) for S1 or one-arguement block' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 81 108 ) 					#name: #Label2 					#label: 'S1 :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 81 142 ) 					#name: #Label3 					#label: 'S2 :' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 38 25 ) 					#name: #Label4 					#label: 'Input' ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 34 127 ) 					#name: #Label5 					#label: 'Output' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 411 109 501 132 ) 					#name: #ActionButton4 					#model: #clear 					#label: 'Clear S1' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 213 177 273 202 ) 					#name: #ActionButton5 					#model: #save 					#label: 'Save S1' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 412 141 502 165 ) 					#name: #ActionButton6 					#model: #swap 					#label: 'Swap S1 and S2' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 292 178 410 201 ) 					#name: #ActionButton7 					#model: #intersect 					#label: 'Intersection S1 and S2' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 105 177 191 201 ) 					#name: #ActionButton3 					#model: #union 					#label: 'Union S1 and S2' 					#defaultable: true ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 406 75 501 99 ) 					#name: #ActionButton8 					#model: #display 					#label: 'Display S1 and S2' 					#defaultable: true ) 				#(#{UI.InputFieldSpec} 					#layout: #(#{Graphics.Rectangle} 111 221 413 240 ) 					#name: #InputField4 					#flags: 0 					#model: #output3 					#tabable: false 					#helpText: '' 					#alignment: #center 					#isReadOnly: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 35 219 ) 					#name: #Label6 					#label: 'Status :' ) 				#(#{UI.ActionButtonSpec} 					#layout: #(#{Graphics.Rectangle} 323 75 394 99 ) 					#name: #ActionButton9 					#model: #transform 					#label: 'Transform S1' 					#defaultable: true ) 				#(#{UI.LabelSpec} 					#layout: #(#{Core.Point} 506 258 ) 					#name: #Label7 					#label: 'Ipsit' ) ) ) )</body>
</methods>


<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>aspects</category>

<body package="CS474" selector="output3">output3	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^output3 isNil		ifTrue:			[output3 := String new asValue]		ifFalse:			[output3]</body>

<body package="CS474" selector="input">input	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^input isNil		ifTrue:			[input := String new asValue]		ifFalse:			[input]</body>

<body package="CS474" selector="output1">output1	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^output1 isNil		ifTrue:			[output1 := String new asValue]		ifFalse:			[output1]</body>

<body package="CS474" selector="output2">output2	"This method was generated by UIDefiner.  Any edits made here	may be lost whenever methods are automatically defined.  The	initialization provided below may have been preempted by an	initialize method."	^output2 isNil		ifTrue:			[output2 := String new asValue]		ifFalse:			[output2]</body>
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>accessing</category>

<body package="CS474" selector="bTree1">bTree1	^bTree1</body>

<body package="CS474" selector="bTree1:">bTree1: anObject	bTree1 := anObject</body>

<body package="CS474" selector="output3:">output3: anObject	output3 := anObject</body>

<body package="CS474" selector="input:">input: anObject	^input := anObject</body>

<body package="CS474" selector="input1">input1	^input</body>

<body package="CS474" selector="bTree2:">bTree2: anObject	bTree2 := anObject</body>

<body package="CS474" selector="output21">output21	^output2</body>

<body package="CS474" selector="bTree2">bTree2	^bTree2</body>

<body package="CS474" selector="tmp">tmp	^tmp</body>

<body package="CS474" selector="output2:">output2: anObject	^output2 := anObject</body>

<body package="CS474" selector="tmp:">tmp: anObject	tmp := anObject</body>

<body package="CS474" selector="output1:">output1: anObject	^output1 := anObject</body>

<body package="CS474" selector="output11">output11	^output1</body>
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>actions</category>

<body package="CS474" selector="union">union"Union method for BTree S1 AND S2"	| temp x flag |	output2 value: bTree2 printBTree. "taking S2 as reference"	temp := output2 value readStream.	[temp atEnd] whileFalse: "loop to tokenize the string"			[flag := nil.			x := temp upTo: Character space.			flag := bTree2 findBTNode: x asNumber at: bTree2 root. "flag to make sure that blank is not considered as an existing element. Returns boolean value"			flag ifTrue: [bTree1 addNode: x asNumber]].	output1 value: bTree1 printBTree.	output3 value: 'Union of S1 and S2 at S1'.	^self</body>

<body package="CS474" selector="add">add"Method to invoke the add method in the BTree class""Used to get multiple inputs"	| inputValues x |	inputValues := input value readStream.	[inputValues atEnd] whileFalse:  "Loop through the incoming string and extract element after every blank"			[x := inputValues upTo: Character space.			bTree1 addNode: x asNumber].	input value: ''.	"Letting the user know number are added to the tree"	output1 value: bTree1 printBTree. "Printing the new tree on to the console"	output3 value: 'Element(s) added to S1'</body>

<body package="CS474" selector="remove">remove"removed one or multiple elements from the tree S1. Similar to add method"	| inputValues x |	inputValues := input value readStream.	"Get a token as a number and add it to S1.loop it till reading stream gets completed"	[inputValues atEnd] whileFalse: 			[x := inputValues upTo: Character space.			bTree1 removeTreeNode: x asNumber].	output1 value: bTree1 printBTree.	output3 value: 'Element(s) removed to S1' "updating the status of the tree"</body>

<body package="CS474" selector="clear">clear"Clear the S1 tree. Setting the root of the tree to nil"	bTree1 clearTree.	output1 value: ''.	output3 value: 'S1 Cleared'.	^self</body>

<body package="CS474" selector="swap">swap	"swap algorithm"	tmp := bTree1 dcopy. "storing the S1 to tmp"	bTree1 := bTree2 dcopy. "S2 to S1"	bTree2 := tmp dcopy. "tmp to S2"	tmp clearTree. "clear tmp for reuse"	output1 value: bTree1 printBTree.	output2 value: bTree2 printBTree.	output3 value: 'S1 and S2 are swapped'. "update status"	^self</body>

<body package="CS474" selector="display">display		"S1 is printed in In-order form followed by S2's In-order form"	output1 value: bTree1 printBTree.	output2 value: bTree2 printBTree.	output3 value: 'S1 and S2 Displayed'</body>

<body package="CS474" selector="intersect">intersect"Intersection method for BTree S1 AND S2"	| btValues bTreeValue flag |	output2 value: bTree2 printBTree. "Taking the existing S2 tree as string"	btValues := output2 value readStream.	[btValues atEnd] whileFalse: 			[bTreeValue := btValues upTo: Character space."S2 String is tokenized by blanks and passed individually to S1 to check if it exists there"			flag := bTree2 findBTNode: bTreeValue asNumber at: bTree2 root. "flag to make sure that blank is not considered as an existing element"			flag				ifTrue: 					[flag := bTree1 findBTNode: bTreeValue asNumber at: bTree1 root. 					flag ifTrue: [tmp addNode: bTreeValue asNumber]]]."Adding the element that passed the check to the tmp tree"	bTree1 clearTree.	bTree1 := tmp dcopy. "deep copy the tmp tree to S1"	tmp clearTree.	output1 value: bTree1 printBTree.	output3 value: 'Intersection of S1 and S2 at S1'. "Update console"	^self</body>

<body package="CS474" selector="save">save	"Deep copy of S1 to S2"	bTree2 := bTree1 dcopy.	output1 value: bTree1 printBTree.	output3 value: 'S1 saved to S2'.	output2 value: bTree2 printBTree.	^self</body>

<body package="CS474" selector="transform">transform"method one-arguement block to update the value of S1 elements""It uses try catch finally to first check the viability of the incoming input"		[	[| temp block s1 x flag |	temp := input value.	block := BlockClosure readFromString: temp. "create blockClosure object from the incoming msg"	output1 value: bTree1 printBTree. "get S1 for transform"	s1 := output1 value readStream.	[s1 atEnd] whileFalse: "loop to tokenize the string"			[flag := nil.			x := s1 upTo: Character space.			flag := bTree1 findBTNode: x asNumber at: bTree1 root. "flag to remove blank elements from the tokanization ie blank asNumber returns 0"			flag ifTrue: [tmp addNode: (block value: x asNumber)]]. "block value executes block with the number"	bTree1 clearTree.	bTree1 := tmp dcopy.	tmp clearTree.	output1 value: bTree1 printBTree.	output3 value: 'One-arguement block executed successfully on S1']			on: Error "Catch block of the try"			do: [:ex | output3 value: 'Error: Incorrect BlockClosure Format. S1 retained.']]			ensure: []. "finally block, currently empty"	^self</body>
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize"initializes the three trees are the start of the console"	tmp := BTree new.	bTree1 := BTree new.	bTree2 := BTree new.</body>
</methods>


<methods>
<class-id>MyBTree.BTreeNode class</class-id> <category>instance creation</category>

<body package="CS474" selector="new:">new: newElement	"This is a parameterised class method which the binarytree class will call with a value to initialize the node "	| temp |	temp := BTreeNode new. "Calling the default new"	temp value: newElement.	^temp</body>

<body package="CS474" selector="new">new	"Answer a newly created and initialized instance."	^super new initialize</body>
</methods>


<methods>
<class-id>MyBTree.BTreeNode</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	left := nil.	right := nil.	value := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>

<methods>
<class-id>MyBTree.BTreeNode</class-id> <category>accessing</category>

<body package="CS474" selector="right:">right: anObject	right := anObject</body>

<body package="CS474" selector="value:">value: anObject	value := anObject</body>

<body package="CS474" selector="left:">left: anObject	left := anObject</body>

<body package="CS474" selector="value">value	^value</body>

<body package="CS474" selector="right">right	^right</body>

<body package="CS474" selector="left">left	^left</body>
</methods>


<methods>
<class-id>MyBTree.BTree class</class-id> <category>instance creation</category>

<body package="CS474" selector="new">new	"Answer a newly created and initialized instance."	^super new initialize</body>
</methods>


<methods>
<class-id>MyBTree.BTree</class-id> <category>btree operations</category>

<body package="CS474" selector="clearTree">clearTree"method to empty the tree. Set the root of the Btree to nil to dereference it."	root := nil.</body>

<body package="CS474" selector="findBTNode:at:">findBTNode: x at: nodeValue"Recursive waay of searching element in an existing BTree"	nodeValue isNil ifTrue: [^false]. "Return false when search fails"	nodeValue value == x		ifTrue: [^true] "True if successful"		ifFalse: 			[x &lt; nodeValue value				ifTrue: [^self findBTNode: x at: nodeValue left] "Recursion to the left"				ifFalse: [^self findBTNode: x at: nodeValue right]] "Recursion to the right "</body>

<body package="CS474" selector="findBTNodeAddressOf:at:">findBTNodeAddressOf: x at: nodeValue"method to find the address of the node and the parent node. It is used by the delete method to find the location of the node to be deleted"	nodeValue isNil ifTrue: [^nil].	nodeValue value == x		ifTrue: [^nodeValue]		ifFalse: 			[x &lt; nodeValue value				ifTrue: 					[parent := nodeValue. "keep track of the parent node. Before recursion"					^self findBTNodeAddressOf: x at: nodeValue left]				ifFalse: 					[parent := nodeValue. "keep track of the parent node."					^self findBTNodeAddressOf: x at: nodeValue right]]</body>

<body package="CS474" selector="findBTNode:">findBTNode: x"method to search element in a Btree. It is the modified add method"	self isRootEmpty		ifTrue: [^nil.]		ifFalse: 			["if the tree is not empty"			x &gt; pointer value				ifTrue: 					[pointer right == nil						ifTrue: [^nil.]						ifFalse: 							[pointer := pointer right.							self addNode: x.							pointer := root.							^self]]				ifFalse: 					[x == pointer value						ifTrue: [^self]						ifFalse: 							[pointer left == nil								ifTrue: [^nil]								ifFalse: 									[pointer := pointer left.									self addNode: x.									pointer := root.									^self]]]].	^self</body>

<body package="CS474" selector="printBTree">printBTree"Invoke the in-order print method"	^self printTree: root</body>

<body package="CS474" selector="findMinNode:">findMinNode: nodePointer"the method used by the delete method to find the minimum valued node to the left most postion to the right of the node. Once the node is located, parent and node address are recorded for further operations"	nodePointer isNil ifTrue: [^nil].	nodePointer left isNil ifTrue: [^nodePointer].	parent := nodePointer.	^self findMinNode: nodePointer left. "recurse to left till the end"</body>

<body package="CS474" selector="delete:value:">delete: nodePointer value: x"method to delete elements from the Btree"	parent := root.	nodePointer isNil ifTrue: [^nil].	pointer := self findBTNodeAddressOf: x at: nodePointer. "finding the address of the node and parent node"	pointer == root &amp; pointer right isNil &amp; pointer left isNil "deleting the root"		ifTrue: [root := nil].	pointer isNil		ifTrue: [^self]		ifFalse: 			[pointer right isNil &amp; pointer left isNil "deleting the root element"				ifTrue: 					[x &lt; parent value						ifTrue: 							[parent left: nil.							^self]						ifFalse: 							[parent right: nil.							^self]]				ifFalse: 					[pointer right isNil "delete operation when right is nil."						ifTrue: 							[parent == root								ifTrue: 									[root := parent left.									^self].							x &lt; parent value								ifTrue: 									[parent left: pointer left.									^self]								ifFalse: 									[parent right: pointer left.									^self]]						ifFalse: 							[pointer left isNil "delete operation when left is nil."								ifTrue: 									[pointer == root										ifTrue: 											[root := parent right.											^self].									x &lt; parent value										ifTrue: 											[parent left: pointer right.											^self]										ifFalse: 											[parent right: pointer right.											^self]]								ifFalse: "delete operation when both leaves are present."									[pointer right left isNil 										ifTrue: 											[pointer value: (pointer right) value.											pointer right: (pointer right) right]										ifFalse: 											[pointer value: (self findMinNode: pointer right) value. "finding the minimum element to the right left most postion of the tree"											parent left: (self findMinNode: pointer right) right]]]]].	^self</body>

<body package="CS474" selector="isRootEmpty">isRootEmpty"This checks if the tree is empty or not"	^root isNil</body>

<body package="CS474" selector="addNode:">addNode: x"method to add new elements into the tree. x is the arguement that will be passed"self isRootEmpty		ifTrue: [root := pointer := BTreeNode new: x] "If the tree is empty"		ifFalse: 			["if the tree is not empty"			x &gt; pointer value				ifTrue: 					[pointer right == nil						ifTrue: [pointer right: (BTreeNode new: x)] "adding new element to the right of the existing tree"						ifFalse: 							[pointer := pointer right.							self addNode: x. "recursion to the right"							pointer := root. "Setting the pointer back to the root once operation is complete"							^self]]				ifFalse: 					[x == pointer value						ifTrue: [^self]						ifFalse: 							[pointer left == nil								ifTrue: [pointer left: (BTreeNode new: x)] "adding new element to the left of the existing tree"								ifFalse: 									[pointer := pointer left.									self addNode: x. "recursion to left"									pointer := root.  "Setting the pointer back to the root once operation is complete"									^self]]]].	^self</body>

<body package="CS474" selector="printTree:">printTree: nodePointer	"In-Order printing method for the console use"	| blank left middle right |	nodePointer isNil		ifTrue: [^'']		ifFalse: 			[blank := String with: Character space.	"it will be used to place blank in between each element while printing the elements of the tree"			left := self printTree: nodePointer left. "recurse the left"			middle := nodePointer value printString. "print root" "while emptying the stack it prints"			right := self printTree: nodePointer right. "recurse the right"			^left , blank , middle , blank , right]</body>

<body package="CS474" selector="removeTreeNode:">removeTreeNode: x"Method to invoke the delete method with the appropiate address of the root"	"self isRootEmpty		ifTrue: [Dialog warn: 'Tree empty'. ^self]"	^self delete: root value: x</body>
</methods>

<methods>
<class-id>MyBTree.BTree</class-id> <category>accessing</category>

<body package="CS474" selector="pointer">pointer	^pointer</body>

<body package="CS474" selector="parent:">parent: anObject	parent := anObject</body>

<body package="CS474" selector="root">root	^root</body>

<body package="CS474" selector="pointer:">pointer: anObject	pointer := anObject</body>

<body package="CS474" selector="root:">root: anObject	root := anObject</body>

<body package="CS474" selector="parent">parent	^parent</body>
</methods>

<methods>
<class-id>MyBTree.BTree</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize	"Initialize a newly created instance. This method must answer the receiver."	super initialize.	" *** Edit the following to properly initialize instance variables ***"	root := nil.	pointer := nil.	parent := nil.	" *** And replace this comment with additional initialization code *** "	^self</body>
</methods>



</st-source>
