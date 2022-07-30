# LuhnAlgorithm
Summary

The Luhn Algorithm is used to validate identification numbers against accidental errors with its digits.
This program validates a full number including its check digit, or generates a check digit for a number.

Design

To validate a number, the algorithm starts at the rightmost digit (the check digit) and moves left once. From this position just left of the check digit, 
double every second digit. Should a doubled digit exceed one digit, sum its digits.
Example: digit 6, when doubled, is 12. To sum its digits, 12 becomes 1 + 2 = 3.
Add all doubled digits and skipped digits into a total. If this total divides by 10 without remainder, it is validated.

To generate a check digit, start at the rightmost digit and move left, doubling every second digit. Should a doubled digit exceed one digit, sum its digits.
Add all doubled digits and skipped digits into a total. If this total divides 10 without remainder, the generated number is 0. Otherwise, find the digit
required to divide 10 without remainder by using the formula (10 - total % 10).
Example: A total sum for an identification number 7992739871 is 67, so (10 - 67 % 10) = (10 - 7) = 3.
