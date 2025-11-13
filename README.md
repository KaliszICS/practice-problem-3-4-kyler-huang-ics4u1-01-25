[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21643231)
# Instructions  

Create a function called recaman(int n) which returns an array of the first n integers of the following sequence.

Examples:

Input : n = 6
Output : 1, 3, 6, 2, 7, 13

Input : n = 17
Output : 1, 3, 6, 2, 7, 13, 20, 12, 21,
11, 22, 10, 23, 9, 24, 8, 25

The rule states the following:

a(0) = 0 </br>
if a(n) > 0 and a(n) is not already included in the sequence, where a(n) = a(n - 1) - n, add it to the sequence</br>
otherwise, a(n) = a(n-1) + n.

Use Recursion to solve.

If 0 or a negative number is given, return an empty array.
