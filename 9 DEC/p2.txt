Given two Integer ArrayList, add their elements to a new ArrayList by satisfying following conditions 

1. Addition should be done starting from 0th index of both ArrayList.
2. Split the sum if it is a not a single digit number and store the digits in adjacent locations
3. Output ArrayList should accommodate any remaining digits of larger input ArrayList.
4.Assume the input contains only positive numbers

Examples:
First line contains the size of first ArrayList followed by first ArrayList elements followed by second ArrayList size followed by 
second ArrayList elements 


input =
6
9 2 3 7 9 6
8
3 1 4 7 8 7 6 9
output =
1 2 3 7 1 4 1 7 1 3 6 9

input = 
6
9343 2 3 7 9 6
8
34 11 4 7 8 7 6 99
output =
9 3 7 7 1 3 7 1 4 1 7 1 3 6 9 9

input = 
3
345 124 54
5
123 221 325 4234 5167
output = 
4 6 8 3 4 5 3 7 9 4 2 3 4 5 1 6 7
