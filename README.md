> # JAVA + DSA

> # Session 01 - 06 Language Fundamentals

    1.Identifiers
    2.Literals/Constants
    3.Keywords/Reserved words
    4.Operators

### 1. Identifiers :

    Identifier is a name assigned to the programming elements like variables, methods, classes, abstract classes, interfaces.

```java
int apple = 5;
//Here apple is an identifier...
```

```java
class Identifiers
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a);
    }
}
```

## Rules and regulations For Identifiers:

    • Identifiers should not be started with any number
    • identifiers may be started with an alphabet, '_' symbol, '$'symbol

```java
class Identifiers
{
    public static void main(String[] args)
    {
        int _a = 99;
        int $sal = 100000;
        //int 8input = 23; wrong
        System.out.println(_a);
        System.out.println($sal);
    }
}
```

### Valid Identifiers:

1. userName
2. calculateSum
3. \_counter
4. $totalAmount
5. StudentInfo
6. MAX_VALUE
7. isPrime
8. userInput
9. PI
10. Book

### Invalid Identifiers:

11. 123numbers (starts with a digit)
12. my-variable (contains a hyphen)
13. illegal@char (contains special characters)
14. class (a reserved keyword)
15. 3DArray (starts with a digit)
16. my space (contains whitespace)
17. void (a reserved keyword)
18. if (a reserved keyword)
19. @symbol (starts with a special character)
20. return (a reserved keyword)

> ### NOTE 1: Identifiers are not allowing all operators and all special symbols except '\_' and '$' symbols

#### More Examples:

int stdNo=111; ========= valid

int std+No=111;=========Invalid

String std\*Name="Ashwani";===== Invalid

String #stdAddr="Delhi";====Invalid

String std@id="123";===Invalid

float std.Fee=50000.0f;=====Invalid

String std-Addr="Hyd";======Invalid

String std_Addr="Hyd";======Valid

> ### Note 2: Identifiers should not be duplicated with in the same scope, identifiers may be duplicated in two different scopes.
>
> ### Note 3: In java applications, we can use all predefined class names and interface names as identifiers.

> ### 2. Literals:

    Literal is a constant assigned to the variables

Examples:

1. String
2. List
3. Scanner
4. Math
5. Runnable
6. Exception
7. String

Example:

int a=10;

int ----> data types

a ------> variables/ identifier

= ------> Operator

10 -----> constant [Literal].

; ------> Special symbol.

### Numeric Literals:

    integers and floating-point numbers.

Decimal: Default base. Example: 123

Binary: Prefixed with 0b or 0B.

Example: 0b1010 represents 10.

Octal: Prefixed with 0. Example: 075 represents 61.

Hexadecimal: Prefixed with 0x or 0X.

Example: 0x1A represents 26.

Examples:

int decimal = 123;

int binary = 0b1010;

int octal = 075;

int hexadecimal = 0x1A;

```java
class binary
{
    public static void main(String[] args)
    {
        int bin = 0b1010;
        System.out.println(bin);
    }
}
```

### Floating-Point Numbers:

```java
    double normal = 3.14;
    float small = 2.0f;
```

### Character and String Literals

    Character literals represent single characters enclosed in single   quotes ' '.

### Examples:

```java
    char letterA = 'A';
    char digit5 = '5';
```

### String Literals

    String literals represent sequences of characters enclosed in double
    quotes " ".

### Examples:

```java
    String message = "Hello, World!";
    String empty = "";
```

### Boolean Literals:

    Boolean literals represent the two truth values: true and false.

### Examples:

```java
boolean isRaining = true;
boolean hasCoffee = false;
```

### Escape Sequences

    Escape sequences are used to represent special characters within
    character and string literals. They are written as a backslash \ followed
    by a character.

### Common escape sequences include:

    \' for single quote
    \" for double quote
    \\ for backslash
    \n for newline
    \t for tab
    \r for carriage return
    \b for backspace

```java
class Escape
{
    public static void main(String[] args)
    {
        char singleQuote = '\'';
        String quoteExample = "She said,\"Hello!\"";
        String newLine = "First line.\nSecond line."

        System.out.println(singleQuote);
        System.out.println(qouteExample);
    }
}
```

### Null Literal

    The null literal represents the absence of a value. It is often used to
    indicate that a reference does not refer to any object.

### Example:

```java
String name = null;
```

## Java Keywords (Reserved Words):

    Data Types:
    1. byte: Represents a small integer data type.
    2. short: Represents a short integer data type.
    3. int: Represents an integer data type.
    4. long: Represents a long integer data type.
    5. float: Represents a floating-point number data type.
    6. double: Represents a double-precision floating-point number
    data type.
    7. char: Represents a character data type.
    8. boolean: Represents a boolean data type.

>

    Control Flow:
    1. if: Used for conditional branching in decision-making.
    2. else: Part of the conditional branching for alternative paths.
    3. switch: Enables multiway selection based on different values.
    4. case: Specifies different cases within a switch statement.
    5. default: Provides a default case within a switch statement.
    6. while: Creates a loop that executes while a condition is true.
    7. do: Starts a loop that executes at least once and then checks
    the condition.
    8. for: Initiates a loop with initialization, condition, and
    increment/decrement.
    9. break: Terminates the current loop or switch statement.
    10.continue: Skips the rest of the loop iteration and starts the next
    one.

    Classes and Objects:
    1. class: Declares a class.
    2. new: Creates a new instance of a class.
    3. this: Refers to the current instance of a class.
    4. super: Refers to the parent class of a subclass.
    5. instanceof: Checks if an object is an instance of a particular
    class.

    Methods:
    1. void: Specifies that a method does not return any value.
    2. return: Exits a method and returns a value to the caller.
    3. static: Declares a method or variable as static (belonging to the
    class rather than instances).
    4. public: Specifies the accessibility of a class, method, or variable
    as public (accessible from anywhere).
    5. private: Specifies the accessibility of a class, method, or
    variable as private (accessible only within the same class).
    6. protected: Specifies the accessibility of a class, method, or
    variable as protected (accessible within the same package and
    subclasses).

    Exception Handling:
    1. try: Defines a block of code to be tested for exceptions.
    2. catch: Catches an exception and specifies how to handle it.
    3. finally: Defines a block of code to be executed after try or catch,
    regardless of whether an exception occurred.

    Miscellaneous
    1. package: Declares a package (a collection of related classes).
    2. import: Imports classes from other packages for use in the
    current program.
    3. interface: Declares an interface (a contract for classes to
    implement).
    4. extends: Indicates inheritance, where a class inherits from
    another class.
    5. implements: Specifies that a class implements an interface.
    6. throws: Specifies that a method may throw a specific type of
    exception.

> ## <mark>Java Operators</mark>
>
> Operator is a symbol;
> it will perform a particular operation over the
> provided operands

```java
class Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 2;
        int sum = a + b;
        int min = a - b;
        int div = a/b;
        int mod = a%b;
        //String er sathe sudhu ans append hosse karon string er por + jog noi append hisebe kaj kore :
        System.out.println("a+b : "+ sum);
        System.out.println("a-b : "+ min);
        System.out.println("a/b : "+ div);
        System.out.println("a%b : "+ mod);
        //Concatenation hobe :
        System.out.println("a+b : "+ a+b);
        System.out.println("SRHridoy"+0+0+7);
        //String er age int ace tai jog thik thakbe
        System.out.println((a+b+ " = a+b"));
    }
}
```

## Increment & Decrement Operator :

```java
class IncDec
{
    public static void main(String[] args)
    {
        //Increment :
        int a = 10;
        System.out.println(a);//10
        System.out.println(a++);//Post-increment//10
        System.out.println(++a);//Pre-increment//12
        System.out.println(a--);//Post-decrement//12
        System.out.println(--a);//Pre-decrement//10

        int b = 5;
        System.out.println((++b-++b));//-1(Age operand ready hobe then operator er kaj hobe...)

        //BODMAS applied :
        int c = 5;
        System.out.println((--c+--c)*(++c-c--)+(c+++--c)*(++c+c--));
    }
}
```

## Assignment Operatar :

```java
class assignment
{
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println("________________+=________________");
        System.out.println(num+=5);
        System.out.println(num=num+5);
        System.out.println(num-=3);

        System.out.println("________________-=________________");
        int s=10;
        System.out.println(s);
        System.out.println(s-=5);

        System.out.println("________________*=________________");
        int p=5;
        System.out.println(p);
        System.out.println(p*=5);

        System.out.println("________________/=________________");
        int d = 54;
        System.out.println(d/=54);

        System.out.println("________________%=________________");
        int m = 44;
        System.out.println(m%m);

    }
}
```

## Comparision Operators :

```java
class Comp {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("____________==__________");
        System.out.println(10 == 0);
        System.out.println(a == b);

        System.out.println("____________!=__________");
        System.out.println(10 != 11);
        System.out.println(9 != 10);

        System.out.println("____________>__________");
        System.out.println(100 > 10);
        System.out.println(9 > 10);

        System.out.println("____________<__________");
        System.out.println(100 > 10);
        System.out.println(9 > 10);

        System.out.println("____________<=__________");
        System.out.println(100 <= 10);
        System.out.println(9 <= 10);

        System.out.println("____________>=__________");
        System.out.println(33 >= 32);
        System.out.println(33 >= 33);

    }
}
```

## Logical Operator :

```java
class Booleanlogical
{
    public static void main(String[] args)
    {
        boolean s1 = true;
        boolean s2 = false;

        System.out.println("______________Logical AND Operator_______________");
        //Sob gula true hole true...
        System.out.println(s1&s2);
        System.out.println(s1&s1);
        System.out.println(s2&s2);
        System.out.println(s2&s1);

        //Jekono ekta true hole true
        System.out.println("______________Logical OR Operator_______________");
        System.out.println(s1|s2);
        System.out.println(s1|s1);
        System.out.println(s2|s2);
        System.out.println(s2|s1);

        //2 tai same hole false ...
        System.out.println("______________Logical XOR Operator_______________");
        System.out.println(s1^s2);
        System.out.println(s1^s1);
        System.out.println(s2^s2);
        System.out.println(s2^s1);
    }

}
```

## Bitwise Logical Operators :

```java
class bitwise_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        //Bit by bit calculate korte hobe :
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        //frist er 0 gula sese asbe koita  asbe joto b songkhok...evabe 8 bit pojonto thik hobe ...
        //Shortcut: a*(2^b);
        System.out.println(a<<b);
        //seser gula bad dite hobe totobar joto bar b ace ar samne 0 dibo totota...
        //Shortcut : a/(2^b);
        System.out.println(a>>b);

        //Left to Right jabe:
         //The difference in parentheses doesn't affect the order of operations or the result.
         //The key point to understand here is the operator precedence. In Java, the + operator has higher precedence than the << and >> operators. So, 2 + a is calculated first, and then the left shift (<<) and right shift (>>) operations are applied to the result.
        int c = 2;
        int d = c << 2 + c >> 1;
        //same:
        //int d = c << (2 + c) >> 1;

        System.out.println(b);
    }
}
```

## Short Circuit Operators : Efficient than bitwise:

```java
class short_circuit_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //Ekhane 2 tai compare hobe ...1st ta flase holeo ...2nd tao dekhbe
        if(a<6 & b>1)
        {
            System.out.println("True");
        }
        //Ekhane 1st ta false dekhlei ar porer ta dekhbe nah
        if(a<6 && b>1)
        {
            System.out.println("True");
        }
//Bitwise or:
        int m = 30, n = 20;
        if(++m>30|++n>20)
        {
            m++;
        }
        else
        {
            n++;
        }
        System.out.println(m+"  "+n);// 32 21

//Shortcircuit or:
        int p = 30, q = 20;
        if(++p>30||++q>20)
        {
            p++;
        }
        else
        {
            q++;
        }
        System.out.println(p+"  "+q);// 32 20

        int x = 30, y = 20;
//first e if e dhuke ++x er jonne 31 then eta 30 er theke choto nah tai && er jonne ++y>20 check e hobe nah direct else e jabe o y++ kore 21 korbe...
        if(++x<30 && ++y>20)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+ " " +y);//31 21

//But in this case :hudai check kore & porer ta tai eta time consuming...
        if(++x<30 & ++y>20)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+ " " +y);//32 23
    }
}

```

## Ternary Operator :

```java
condition? expression1:expression2;
```

    true hole expression1
    false hole expression2

```java
class ternary {
    public static void main(String[] args) {
    
        System.out.println("------------------");
        int x = 10;
        int y = 2;
        int max = (x>y)? x:y;
        System.out.println(max);

        System.out.println("------------------");
        int m = 10,n = 5;
        String s = (m>n) ? "hello" : "Java";
        System.out.println(s);

        System.out.println("------------------");
        int a = 5, b = 10, c = 15;
        int res = (a>b) ?(c>b)? c:b:(c>a)?c:a;
        System.out.println(res);

        System.out.println("------------------");
        int p = 7, q = 3, r = 5;
        int result = p < q? p > r? p : r : q;// p > q false tai p > r execute e hobe nah ans hobe q = 3; orthat p > q er jonne if holo(p > r? p : r) ar else holo (q) tai jehutu false tai q hobe...
        System.out.println(result);

        System.out.println("------------------");
        int f = 35, g = 6, h = 34;
        int rr = (f > g) ? (h > b)?h:g:(h>f)?h:f;
        System.out.println(rr);
        // ekahne (f > g) er jonne
                           // if holo (h > b)?h:g
                           //else holo (h>f)?h:f


    }
}
```

### Some Practice : 
```java
class Practice
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = ++a * 2 + a++  + --a - a--;
        // 7 * 2 = 14 + 7 = 21(a = 8) + 7 = 28 - 7 = 21...
        System.out.println(b);
        
        int x = 6;
        int y = x-- + --x + x++ - ++x;
        //6 + 4 + 4 - 6 = 8
        System.out.println(y);

        int q = 3;
        int q1 = q-- + q++ - --q * ++q + q--;
        //3 + 2 - 2 * 3 + 3 = 2
        // age jog biyog gun vag na kore only post ar pre calc kore then precedency onujai agaite hobe
        System.out.println(q1);

        int l = 10;
        int l1 = l-- * --l * l++ - l-- * l++;
        //10 * 8 * 8 - 9 * 8 = 640 - 72 = 568
        System.out.println(l1);

        int g = 4;
        int g1 = g-- / ++g * --g + g++ * g-- - --g / g++;
        //4 / 4 * 3 + 3 * 4 - 2 / 2 = 3 + 12 - 1 = 14
        System.out.println(g1);

    }
}
```

># Session  07 Data Type : 

    (i)Numeric Data Types
        (i)Integral Data Types                      (ii)Floating Pont Data Types 
            (i)Byte(ii)Short(iii)int(iv)long            (i)double(ii)float
    (ii)Char
    (iii)Boolean

>### Note: Except Boolean and char all remaining data types are considered as signed data types because we can represent both "+ve" and"-ve" numbers.


### Primitive Data Type : 
    Integral data types:
        byte: 8-bit 1 Byte Range: -128 to 127.
        short: 16-bit 2 Byte Range: -32,768 to 32,767.
        int: 32-bit 4 Byte Range: -2^31 to 2^31 - 1.
        long: 64-bit 8 Byte Range: -2^63 to 2^63 - 1.

    First bit represents the sign...If 0 then positive and 1 then negative...

#### Why -128 to 127 for byte if it takes 8 bit?

    A byte in Java is an 8-bit data type. This means it uses 8 binary digits (bits) to
    represent values. In binary, each bit can have a value of either 0 or 1. Using 8 bits,
    we have a total of 2^8 = 256 possible combinations.

    +ve er jonne 0  1   1   1   1   1   1   1 = 0*2^7 + 1*2^6 + 1*2^5 + 1*2^4 + 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0 = 127

    -ve er jonne jodi 2's complement chinta kori then 1 0   0   0   0   0   0   1   = 2^7 + 2^0 = 129 - 1  = 128 cause 1st bit represents sign...

    jodi 1's complement chinta kori then 1  0   0   0   0   0   0   0   = 2^7 = 128... 

### Two's Complement Representation:
    In computers, negative integers are often represented using a scheme called two's complement. In this scheme,
<mark>the leftmost bit (the most significant bit) represents the sign of the number. If it's 0, the number is positive; if it's 1, the number is negative.</mark>

<mark>The remaining bits represent the magnitude of the number's absolute value in binary form.</mark>

    For byte, since we have 8 bits, one bit is used for the sign, leaving 7 bits for the magnitude.

### <mark>Positive Numbers:</mark>

    For positive numbers, the sign bit is 0, indicating positivity.

    With 7 bits, you can represent values from 0000000 (binary for 0) to 1111111 (binary
    for 127). This covers a range of 0 to 127.

    Negative Numbers:
    For negative numbers, the sign bit is 1, indicating negativity.

    To represent negative numbers using two's complement, you invert the bits of the positive counter part (flipping 0s to 1s and 1s to 0s) and add 1 to the result.
    In the case of byte, the two's complement of 0000000 (binary for 0) is 10000000,
    which represents -128.
    Putting it all together:
    Positive values use 7 bits to represent the range from 0 to 127.
    Negative values use 7 bits to represent the range from -1 to -128.

>### Note : byte data type is best suitable if we are handling data in terms of streams either from the file or from the network.

    Example:
    byte b=10;
    byte b2=130;//C.E:possible loss of precision
    byte b=10.5;//C.E:possible loss of precision
    byte b=true;//C.E:incompatible types
    byte b="ashwani";//C.E:incompatible types

> ## OOP:

```
Piller of OOP:
    1.Encapsulation = Data Hiding + Abstruction.  : Ensures security.
    2.Inheritance : Reusability.
    3.Polymorphism : Flexibility
```

> # Session 15 : Array

## Array:

    (i)This container is fixed sized.
    (ii)Size is known in advance.
    (iii)Represent same set of values(Homogenous).
    (iv) 0 indexed.

To overcome the problems / limitations of array Java has `Collections`.

Creating an object of student class :

```java
Student s = new Student();
```

>

    here, new is a keyword to create objects. s is a reference variable and L.H.S  = Student s and R.H.S = new Student(). if we can break any statement as L.H.S and R.H.S then we can write them seperately. Like :

```java
Student s = null;
s = new Student();
```

## Array Creation :

    (i)Declearation.
    (ii)Initialization.

```java
int arr[] = new int[size];
```

here we can apply L.H.S and R.H.S :

```java
int arr[];
arr = new int[size];
```

> > ### Note:
