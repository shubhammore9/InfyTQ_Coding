/*Input a matrix. Check if do we get the same number consecutively at least 4 times in any fashion 
(Vertical, Horizontal, Diagonal). Record those sets.
    If we get such multiple sets then print the number which is the least one
    If we get such a single set then print the same number
    If we get such no set then print -1
Example1
Input m x n. Let’s take

1 3 3 3 3 9

1 6 9 2 3 9

1 2 2 5 4 9

2 2 4 5 7 9

2 4 5 6 7 2

Sets we get here [3 3 3 3] horizontally in the first line, [9 9 9 9] vertically in the last column,[2 2 2 2] diagonally. Hence, we’ll print min(3,9,2) = 2 here.

Example2

Input m x n. Let’s take

1 2 3 7

4 5 5 8

6 6 6 6

9 1 3 4

Sets we get here [6 6 6 6] only horizontally in 3rd row. Hence, we’ll print 6 here.

Example3

Input m x n. Let’s take

1 2 3 4

5 6 7 8

9 1 2 3

3 2 1 4

So we get NO set here. Hence, we’ll print -1 here.*/