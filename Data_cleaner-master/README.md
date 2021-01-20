## Data Cleaner
This program extracts mobile numbers and E-mail Id's from a .txt file. The file can have alphanumerical data.

### Mobile Number format-
* Must start with a number between 7 and 9
* Can have 10 digits in raw form
* Can have 11 digits if preceeded by a 0
* Can have 12 digits if preceeded by 91


## Email format -
* The first character can be lowercase or uppercase alphabet or it can contain any digit from 0 to 9.
* The rest character after the first character and until reaching @, the characters can be lowercase or uppercase alphabet or it can contain any digit from 0 to 9 or special symbol ‘_’ and ‘.’.
* After the above two criteria, the string contain symbol ‘@’.After that string should contain any lowercase or uppercase alphabet or it can contain any digit from 0 to 9.
* After containing ‘@’ symbol, the string should contain ‘.’ symbol and after that the string should contain any lowercase or uppercase alphabet.For this criteria, regular expression [.][a-zA-Z]

## Sample Input
* ![Sample](Media/input_s.png)

## Output -
* ![Sample](Media/output_s.png)

## Build Instruction
* __$ javac Test.java__
* __$ java Test input.txt mobile.txt email.txt__

## Buit using
* Java Development Kit (JDK) 11.0.7 
* java Runtime Environment (JRE) 11.0.7
