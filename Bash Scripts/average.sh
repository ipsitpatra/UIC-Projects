#!/bin/bash
read x
sum=0
for (( c=1; c<=$x; c++ ))
do
   read a
   sum=$((sum+a))
done

 printf "%.3f" $(echo "scale=4;$sum/$x" | bc -l)