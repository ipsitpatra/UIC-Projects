#!/bin/bash
# print odd number
z=1
y=0
while [ $z -le 99 ]
do
if [ $((z%2)) != $y ]; then 	
	echo $z
fi
	z=$((z+1))
done
