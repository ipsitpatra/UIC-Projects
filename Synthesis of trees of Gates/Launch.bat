@echo off
cls
::Project 1 CS 401 Algorithm
::Update the Windows path for the JDK to set the path to current path.
set path=%path%;C:\Program Files\Java\jdk1.7.0_51\bin
::Compiling the java files
javac Launch.java
::Executing the java class files with arguements. java Launch Format - <pin-file> {<library-file>}
java Launch Input.txt Library.txt
pause