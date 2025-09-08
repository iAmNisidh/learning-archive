<iostream > its a header file 
iostream stands for input output stream 
we have included <iostream> as we are going to use cout which is declared in iostream

when ever we start c++ programming with a # this is known a s pre processor directive 

pre processor: when we compile our programm the compilation process involves the first process as pre processor , pre pprocessor genrates another cpp code 

std  contains std librararies 

main fn is the fn whre execution of code starts from main fn 

*********************************************************************************************************************************************************************************

cpp usees sream for input and output . usin stream swe can read and write data in in the process 
i stream is a class and cin is its methods  
o stream is a class and cout is its methods  

cerr & clog are the obj of ostream used for error and log streams

<< : this is an intertion operator . this inserts data into the output 
>> : this is an extraction operator 

cin  can take values two values at ones like cin >> x >> y ;

getline is used to store strings with spaces getline(cin name) in normal cin it doesnt accepts spaces 

we can do iomanupulation bor boolean like cout<< std::boolalpha; after this line of code if we print the boolean value it will give false for 0 and true for 1 if we use no bool apha it will print oand one aonly after that 

eg in folder basic with the name io manupulation 

*********************************************************************************************************************************************************************************

we can do iomanupulation bor boolean like cout<< std::boolalpha; after this line of code if we print the boolean value it will give false for 0 and true for 1 if we use no bool apha it will print oand one aonly after that 

eg in folder basic with the name io manupulatio

manipulators
They change the way numbers are displayed when you print them using cout. They don’t produce output themselves — they tell cout to behave differently when printing the next value.

*************************************************************************************************************************************************************
functions 

A linker error happens when your code compiles just fine—meaning the syntax is correct—but the compiler can’t figure out how to connect the dots between different parts of your program during the linking stage.
Here’s what’s going on under the hood:
- When you declare a function or variable (say, in a header file), the compiler expects to find its definition somewhere—either in the same file or another one you’re linking.
- If the linker can’t find that definition, it throws an error like:
undefined reference to 'myFunction'

all the default argument must appear at the end 
if i give defautl arg in the middle or first  not at the last then we will get compiler error 

Inline function ek aisa function hota hai jismein hum compiler ko suggest karte hain ki:

"Jab bhi is function ko call karein, us jagah par function ka code directly chipka do."

Inline Function
👉 Inline sirf ek suggestion hota hai compiler ke liye.

👉 Modern compilers khud hi kisi function ko inline bana sakte hain chahe hum inline na bhi likhein.

👉 Agar hum inline ka zyada use karte hain, toh binary file ka size badh sakta hai.

👉 Jab hum kisi class ke andar method define karte hain, toh wo automatically inline suggestion mana jata hai compiler ke liye.
















*********************************************************************************************************************************************************************************
scope of a varoable 
any thing under curly braces {} are known as scope any thing geclared inside scope  is availavle to that {} only 
if any thing is declare inside the {} and can be usead outside is knowna s scope spilling 
any thing declared globally is available at all the places inside or outsided the {}

                                 or

- Scope of a Variable: The scope of a variable defines where it can be accessed in a program. The curly braces {} represent a block scope in languages like C++, Java, and Python.
- Block Scope: Variables declared inside {} are local to that block. They cannot be accessed outside unless explicitly returned or referenced in some way.
- Scope "Spilling": This term isn't commonly used. The correct term is variable shadowing or leakage in some contexts. If a variable inside {} is somehow accessible outside, it's usually due to global scope interference or improper declaration, like using a global/static keyword.
- Global Scope: Variables declared globally (outside all functions and blocks) can be accessed from anywhere in the program.

- auto is a data type 
- in lambda expression auto (data type) x=  holds the deination of the function

- class ke andar jitne bhi variavle hote hai unhe attributes bote hai 

in cpp when we go index out of bound like other lsnguages we dont get error we get some value which are stored in heap memeory not necessery heap  extra values that came is garbage value 

constructoe is a method whose name is exactly same as class name 

- pointer memory ke addres ko store karne ka 1 datatype hai 
