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
<body>New Namespace for the project
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
<body>BTree Operation holder
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
<body>Console for the BTree
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
<body>Binary Tree Node
</comment>

<methods>
<class-id>MyBTree.BTreeConsole class</class-id> <category>interface specs</category>

<body package="CS474" selector="windowSpec">windowSpec
</methods>


<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>aspects</category>

<body package="CS474" selector="output3">output3

<body package="CS474" selector="input">input

<body package="CS474" selector="output1">output1

<body package="CS474" selector="output2">output2
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>accessing</category>

<body package="CS474" selector="bTree1">bTree1

<body package="CS474" selector="bTree1:">bTree1: anObject

<body package="CS474" selector="output3:">output3: anObject

<body package="CS474" selector="input:">input: anObject

<body package="CS474" selector="input1">input1

<body package="CS474" selector="bTree2:">bTree2: anObject

<body package="CS474" selector="output21">output21

<body package="CS474" selector="bTree2">bTree2

<body package="CS474" selector="tmp">tmp

<body package="CS474" selector="output2:">output2: anObject

<body package="CS474" selector="tmp:">tmp: anObject

<body package="CS474" selector="output1:">output1: anObject

<body package="CS474" selector="output11">output11
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>actions</category>

<body package="CS474" selector="union">union

<body package="CS474" selector="add">add

<body package="CS474" selector="remove">remove

<body package="CS474" selector="clear">clear

<body package="CS474" selector="swap">swap

<body package="CS474" selector="display">display

<body package="CS474" selector="intersect">intersect

<body package="CS474" selector="save">save

<body package="CS474" selector="transform">transform
</methods>

<methods>
<class-id>MyBTree.BTreeConsole</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize
</methods>


<methods>
<class-id>MyBTree.BTreeNode class</class-id> <category>instance creation</category>

<body package="CS474" selector="new:">new: newElement

<body package="CS474" selector="new">new
</methods>


<methods>
<class-id>MyBTree.BTreeNode</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize
</methods>

<methods>
<class-id>MyBTree.BTreeNode</class-id> <category>accessing</category>

<body package="CS474" selector="right:">right: anObject

<body package="CS474" selector="value:">value: anObject

<body package="CS474" selector="left:">left: anObject

<body package="CS474" selector="value">value

<body package="CS474" selector="right">right

<body package="CS474" selector="left">left
</methods>


<methods>
<class-id>MyBTree.BTree class</class-id> <category>instance creation</category>

<body package="CS474" selector="new">new
</methods>


<methods>
<class-id>MyBTree.BTree</class-id> <category>btree operations</category>

<body package="CS474" selector="clearTree">clearTree

<body package="CS474" selector="findBTNode:at:">findBTNode: x at: nodeValue

<body package="CS474" selector="findBTNodeAddressOf:at:">findBTNodeAddressOf: x at: nodeValue

<body package="CS474" selector="findBTNode:">findBTNode: x

<body package="CS474" selector="printBTree">printBTree

<body package="CS474" selector="findMinNode:">findMinNode: nodePointer

<body package="CS474" selector="delete:value:">delete: nodePointer value: x

<body package="CS474" selector="isRootEmpty">isRootEmpty

<body package="CS474" selector="addNode:">addNode: x

<body package="CS474" selector="printTree:">printTree: nodePointer

<body package="CS474" selector="removeTreeNode:">removeTreeNode: x
</methods>

<methods>
<class-id>MyBTree.BTree</class-id> <category>accessing</category>

<body package="CS474" selector="pointer">pointer

<body package="CS474" selector="parent:">parent: anObject

<body package="CS474" selector="root">root

<body package="CS474" selector="pointer:">pointer: anObject

<body package="CS474" selector="root:">root: anObject

<body package="CS474" selector="parent">parent
</methods>

<methods>
<class-id>MyBTree.BTree</class-id> <category>initialize-release</category>

<body package="CS474" selector="initialize">initialize
</methods>



</st-source>