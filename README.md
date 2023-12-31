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

Examples:

1. String
2. List
3. Scanner
4. Math
5. Runnable
6. Exception
7. String
> ### 2. Literals:

    Literal is a constant assigned to the variables


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

> # Session 07 Data Type :

    (i)Numeric Data Types
        (i)Integral Data Types                      (ii)Floating Pont Data Types
            (i)Byte(ii)Short(iii)int(iv)long            (i)double(ii)float
    (ii)Char
    (iii)Boolean

> ### Note: Except Boolean and char all remaining data types are considered as signed data types because we can represent both "+ve" and"-ve" numbers.

### Primitive Data Type :

    Integral data types:
        byte: 8-bit 1 Byte Range: -128 to 127.
        short: 16-bit 2 Byte Range: -32,768 to 32,767.
        int: 32-bit 4 Byte Range: -2^31 to 2^31 - 1.
        long: 64-bit 8 Byte Range: -2^63 to 2^63 - 1.

    First bit represents the sign...If 0 then positive and 1 then negative...

## Byte :

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

> ### Note : byte data type is best suitable if we are handling data in terms of streams either from the file or from the network.

    Example:

```java
    byte b=10;
    byte b2=130;//C.E:possible loss of precision
    byte b=10.5;//C.E:possible loss of precision
    byte b=true;//C.E:incompatible types
    byte b="ashwani";//C.E:incompatible types
```

```java
class ByteProg
{
    public static void main(String[] args)
    {
        byte b = 10;
        //byte b2 = 130;
        byte b3 = 127;
        byte b4 = -128;
        //byte b5 = true;
        //byte b6 = "Hridoy";
        System.out.println(b);
        //System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}
```

## Short :

<mark>The most rarely used data type in java is short.</mark>

    Size: 2 bytes
    Range: -32768 to 32767(-215 to 215-1)
    Example:

```java
    short s=130;
    short s1=32788;//C.E:possible loss of precision
    short s2=true;//C.E:incompatible types
```

## Int :

<mmark>This is most commonly used data type in java.</mmark>

    Size: 4 bytes
    Example:

```java
    int i=123;
    int j=9.6;//C.E:possible loss of precision
    int k=true;//C.E:incompatible types
    int l=false;//C.E:incompatible types
```

## Long : 8 Bytes

<mark>Why log required if have int data type?</mark>

    Whenever int is not enough to hold big values then we should go for long data type.
    Example:

```java
int smallNumber = 1000;// Suitable for small to medium-sized values
long bigNumber = 100000000000L; // Used for larger values
```

## Floating Point Data types:

<mark>Types of Floating-Point Data:</mark>

### Float :

    Uses Size: 4 bytes to store a floating-point number.

<mark>Suitable If we want to 5 to 6 decimal places of accuracy then we should go for float.</mark>

    Example:

```java
float pi = 3.14159f;
```

### Double :

    Uses Size: 8 bytes to store a floating-point number.

<mark>Suitable If we want to 14 to 15 decimal places of accuracy then we should go for double.</mark>

    Generally preferred for most applications unless memory efficiency is crucial.

    Example:

```java
    double distance = 299792458.0;
    //Integer er Default value 0
        int i1 = 1/3;
        System.out.println(i1);
    //Floating point er Default value 0.0----> sese f na dile integer vabe tai default ase..ar f na dite chaile .0 add kore dibo...
        float f = 1/3;
        System.out.println(f);

        float f1 = 1/3f;
        System.out.println(f1);

    //Double er Default value
        double d = 1/3;
        System.out.println(d);

        double d1 = 1/3f;
        System.out.println(d1);
```

## what is precision?

    Precision refers to the level of detail or accuracy in representing numbers, especially decimal numbers. In the context of floating-point numbers, precision determines how many significant digits can be reliably stored and manipulated.

<mark>For example, let's consider the decimal number 1/3, which is a repeating fraction in
decimal form: 0.333333...</mark>

### Single-Precision (float):

    If we store 1/3 as a float, the limited precision of 32 bits means that only a certain number of decimal places can be accurately represented. The result might be something like.

```java
float oneThird = 0.33333334f;
```

    Here, the precision is limited due to the available bits, and the value is rounded after a certain number of decimal places.

### Double-Precision (double):

    Using a double, with its 64-bit precision, allows for more accurate representation:

```java
double oneThird = 0.3333333333333333;
```

<mark>In this case, the greater precision of the double allows more decimal places to be
stored accurately.</mark>

## Boolean dat type :

<mark>Size: Not applicable...
Range: Not applicable but allowed values are true or false.</mark>

    Example :

```java
    boolean b=true;
    boolean b1= false;
//Invalid :
    //boolean b=True;
    //boolean b="True";
    //boolean b=0;
```

## Char :

<mark>Size: 2 bytes
Range: 0 to 65535</mark>

```java
char ch = 'a';
System.out.println(ch);//a

char ch1 = 97;
System.out.println(ch1);//a
```

    Note:
    In old languages like C & C++ are ASCII code based the no.Of ASCII code characters are < 256 to represent these 256 characters 8 - bits enough hence char size in old languages 1 byte. In java we are allowed to use any worldwide alphabets character and java is Unicode based and no.Of unicode characters are > 256 and <= 65536 to represent all these characters one byte is not enough compulsory we should go for 2 bytes.

## <mark> Control Flow : </mark>

    Decision/choice making.

```java
/*
                             Control Statements
------------------------------------------------------------------------
    (i)Selection Statements ||(ii)Iterative Statements ||(iii)Jump Statements
    ---------------------------------------------------------------------
        (1)Simple if       |        (1)While            |      (1)break
        (2)if-else         |        (2)do-while         |      (2)continue
        (3)nested-if       |        (3)for              |      (3)return
        (4)if-else-if      |        (4)for-each
    _________________________________________________________________________
*/
```

### if-else Statements: Making Choices

    Syntax:

```java
    if (condition)
    {
        // Code to execute if condition is true
    }
    else
    {
        // Code to execute if condition is false
    }
```

> ### Note1: The argument to the if statement should be Boolean by mistake if we are providing any other type we will get "compile time error".

```java
    int a = 10;
        //Condition inside if should be boolean
        //We can use if with-out else
        //If we are having multiple statements then we have to use {} otherwise no need;
        if(a<=10)
            System.out.println("Hello");
        System.out.println("Hridoy");
```

## Even Odd Program :

```java
        int x=30;

        if(x%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        int a = 10;
        if(a == 10)
        System.out.println("Yes");
        if(a%2 == 0)
        System.out.println("even");
        if(a>100)
        System.out.println("Yes less than 100");
        else
        System.out.println("No");
```

### ELSE - IF :

```java
int a = 90;
        if (a>=100)
        {
            System.out.println("Excellent");
        }
        else if (a>=70)
        {
            System.out.println("Good Job");
        }
        else if (a>=50)
        {
            System.out.println("Keep Learning...");
        }
        else
        {
            System.out.println("Need Improvement");
        }
```

### NESTED IF-ELSE:

```java
int a = 10;
        //NESTED IF ELSE :
        if (a==10)
        {
            System.out.println("a==10");
            if(a<100)
            {
                System.out.println("Yes less than 100");
                if (a%2==0)
                {
                    System.out.println("even");
                    if(a>10)
                    {
                        System.out.println("No");
                    }
                    else
                    {
                        System.out.println("Yes");
                        if(a>2)
                        {
                            System.out.println("Yes a is greater than 2");
                            if(a%2!=0)
                            {
                                System.out.println("Odd");
                            }
                            else
                            {
                                System.out.println("Yes");
                                if (a==10)
                                {
                                    System.out.println("THE END");
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("a is greater than 100");
            }
        }
```

```java
int a = 90;
        if (a>=100)
        {
            System.out.println("Excellent");
        }
        else if (a>=70)
        {
            System.out.println("Good Job");
            if(a==90)
            {
                System.out.println("Yes 90");
                if(a>100)
                {
                    System.out.println("Greater than 100");
                }
                else if (a>120)
                {
                    System.out.println("Greater than 120");
                }
                else if (a<10)
                {
                    System.out.println("Less than 10");
                }
                else if(a==90)
                {
                    System.out.println("Yes a == 90");
                }
                else
                {
                    System.out.println("Not found");
                }
            }
        }
        else if (a>=50)
        {
            System.out.println("Keep Learning...");
        }
        else
        {
            System.out.println("Need Improvement");
        }
```

### ControlFLowSwitch.Switch :

```java
//ControlFLowSwitch.Switch e case must dia lagbe...
        //Case Cant't be duplicate..
        //Case value must be constant...
        //Break dia must...

        int x = 10;
        switch(x)
        {
            case 10:
                System.out.println("Yes x = 10");
                break;
            // case 10:
            //     System.out.println("Dulicate");

            case 9:
                System.out.println("Yes x = 90");
                break;

            default:
                System.out.println("This is default");
        }
```

> ## <mark>Taking Input From User : </mark>

```java
//Taking user input :
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
```

### Write a program to convert integer number to roman number from 1 to 10 using switch case.

```java
//Taking user input :
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String result=null;//Local variable k initialize kora lage tai null use korsi....

        if(x>10)
            System.out.println("Invalid Input!");

        else
        {
            switch (x)
            {
                case 1:
                    result = "|";
                    break;
                case 2:
                    result = "||";
                    break;
                case 3:
                    result = "|||";
                    break;
                case 4:
                    result = "|V";
                    break;
                case 5:
                    result = "V";
                    break;
                case 6:
                    result = "V|";
                    break;
                case 7:
                    result = "V||";
                    break;
                case 8:
                    result = "V|||";
                    break;
                case 9:
                    result = "|X";
                    break;
                case 10:
                    result = "X";
                    break;

                default:
                    result = "Invalid Input";
            }
        System.out.println("Your Result for input = "+x +" is = "+ result);
    }
```

> ## OOP:

```
Piller of OOP:
    1.Encapsulation = Data Hiding + Abstruction.  : Ensures security.
    2.Inheritance : Reusability.
    3.Polymorphism : Flexibility
```

```java
public class Person{

    public static void main(String[] args) {
        //Property/Variable
        int x = 10;
        //Action class er
        read();
    }

    public static void read() {
        System.out.println("This is another method!");
    }
}
```

## What is a class?

    A class is a collection of objects.

<mark>Classes don’t consume any space in the memory.</mark>

    It is a user defined data type that act as a template for creating objects of the identical type.

    A large number of objects can be created using the same class. Therefore, Class is considered as the blueprint for the object.

## What is an object?

    An object is a real-world entity which have properties and functionalities.

<mark>Object is also called an instance of class. Objects take some space in memory.</mark>

    For eg:
    • Fruit is class and its object s are mango, apple, banana
    • Furniture is class and its objects are table, chair, desk

### What is the difference between a class and an object?
#### <mark> Class:</mark>

    1. It is a collection of objects.
    2. It doesn't take up space in memory.
    3. Classes are declared just once.

#### <mark> Object:</mark>

    1. It is an instance of a class.
    2. It takes space in memory.
    3. Objects can be declared as and when required.

>### What is the difference between a class and a structure?
    1.Class is a collection of objects.
    Structure is a collection of variables of different data types under a single unit

    2.Class is used to combine data and methods together.
    Structure is used to grouping data.

    3.Class's objects are created on the heap memory.
    Structure's objects are created on the stack memory.

    4.A class can inherit another class.
    A structure can't inherit another structure.

    5.A class has all members private by default
    A structure has all members public by default

    6.Classes are ideal for larger or complex objects
    Structures are ideal for small and isolated model objects

```java
//Creating New Objects :
Balance b = new Balance();
```
### Simple Code for Data Hiding : 

```java
public class DataHiding {
    public static void main(String[] args) {

        Balance b = new Balance();
        int balance = b.getX();
        System.out.println(balance);
    }
}

class Balance
{
    private int x = 10000;

    public int getX() {
        //Validation
        //Authorization
        return x;
    }

}
```

```java
public class Account {

    public static void main(String[] args) {
        BalanceN b = new BalanceN();
        int bal = b.getX();
        System.out.println(bal);

        b.setX(2525);
        int bel1 = b.getX();
        System.out.println(bel1);
    }
}

class BalanceN
{
    private int x = 10000;

    public int getX() {
        //Validation
        return x;
    }

    public void setX(int x) {
        //Validation
        this.x = x;
    }
    
}
```

### Tightly Encapsulated Class :
    All data members must be private.


> ### NOte : if the parent class in not TEC then no child class is TEC...


## What are Methods in Java?

    • Methods are blocks of code that perform specific tasks.
    • A method can take input (parameters), process it, and optionally return a result

### Method Structure:

```java
returnType methodName(parameters) 
{
 // Method body
 return returnValue; // (if applicable)
}
```

>### NOTE :Return Type: The data type of the value the method returns. Use void if the method doesn't return anything.

```java
public class TestMethod {
    public static void main(String[] args) {
        dua();//Direct Calling
    }

//Example print ALLAH HU AKBER
//Non static method k static method call korte pare nah

    public static void dua() {
        System.out.println("ALLAH HU AKBER");
    }
}
```


```java
public class TestMethod {
    public static void main(String[] args) {
        dua();//Direct calling

        //Create object :
        iman i1 = new iman();
        i1.printIman();
    }

    //Example print ALLAH HU AKBER
//Non static method k static method call korte pare nah
    public static void dua() {
        System.out.println("ALLAH HU AKBER");
    }
}

//When we have methods in different class or package then we call the method
// using objects..
class iman{

    public void printIman()
    {
        System.out.println("Iman is the 1st piller");
    }
}
```

```java
public class TestMethod01 {

    public static void main(String[] args) {
        TestMethod01 t = new TestMethod01();
        t.iman();
        //if we don't iman() as static then this work otherwise doesn't work.
        // ..then we have to use onyu iman() without creating object of the 
        // class.
    }

    public void iman()
    {
        System.out.println("Iman is the 1st pillar of Islam");
    }
}

```

### Adding Two Numbers : 
```java
public class AddNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result = addNumbers(x,y);
        System.out.println(result);
    }

    public static int addNumbers(int a, int b)
    {
        return  a+b;
    }
}
```

>## Functions with Modifiers in Java:
    Access Modifiers:

    Access modifiers determine the visibility of methods in different parts of your program.

>## <mark>Important: </mark>

```java
public: 
Methods with this modifier are accessible from anywhere.

private:
Methods are accessible only within the same class.

protected: 
Methods are accessible within the same package and subclasses, even if they are in different packages.

default (no modifier): 
Methods are accessible within the same package.
```
># <mark> Public : </mark>

```java
//PUBLIC: 

public class AddNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result = addNumbers(x,y);
        System.out.println(result);
//Using publicly decleared method from different place : 
        iman i = new iman();
        i.printIman();
    }

    public static int addNumbers(int a, int b)
    {
        return  a+b;
    }
}
```
># <mark> Private : </mark>
```java
// PRIVATE : Same class sara same package ba onno kono jaigai accessible nah..

//In Different package :
public class AddNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result = addNumbers(x,y);
        System.out.println(result);
//Using publicly decleared method from different place :
        //Public method call:
        iman i = new iman();
        i.printIman();

        //Private method call:
        ModifiersTest m = new ModifiersTest();
        //m.printHello(); kaj korbe nah...
    }

    public static int addNumbers(int a, int b)
    {
        return  a+b;
    }
}

```


```java
//In same package : 
public class ModifiersTest {
    public static void main(String[] args) {
        printHello();
    }
    private static void printHello()
    {
        System.out.println("Hello from private");
    }
}

class TestModi{

    public void callHello()
    {
        ModifiersTest m = new ModifiersTest();
        //m.printHello(); Not possible
    }
}
```
># <mark> Protected : </mark>
```java
package methods;

import testMethod.DemoPro;

public class TestProtected {
    public static void main(String[] args) {

        TestPro t = new TestPro();//Parent class object
        t.printPro();

        TestProAgain t1 = new TestProAgain();//Child Class object
        t1.printPro();

        DemoPro dempPro = new DemoPro();//Different package class object
        dempPro.printPro();
    }
}
```

```java
package methods;

public class TestPro {

    protected void printPro()
    {
        System.out.println("Hello Pro vi...");
    }
}

class TestProAgain extends TestPro
{

}
```

```java

package testMethod;

import methods.TestPro;

public class DemoPro extends TestPro {

}

```

># <mark> Default : </mark>
```java
package methods;

public class DefaultMethod {

    public static void main(String[] args) {
        DefaultMethodTest defaultMethodTest = new DefaultMethodTest();
        defaultMethodTest.defaultTest();
    }
}

```

```java
package methods;

public class DefaultMethodTest {
    void defaultTest()
    {
        System.out.println("Iman is the 1st pillar of Islam...");
    }
}
```

### Examples : 
```java
public class ExampleModifiers1 {

    public void printDog()
    {
        //This method accessible from anywhere.
    }

    private void printCat()
    {
        //This method accessible from within class.
    }

    protected void printCar()
    {
        //This method accessible from package + subclass.
    }

    void printHuman()
    {
        //This method accessible from same package.
    }
}
```

># <mark> Loops in Java : </mark>

    Loops are control structures that allow you to execute a block of code repeatedly based on a condition. 

    Types of loops:
    • for
    • while
    • do while
    • foreach

## for loop syntax:

<mark>The for loop is used when you know how many times you want to execute a
code block.</mark>

```java
for (initialization; condition; update) {
 // Code to be executed repeatedly
}
```

```java
for (int i = 1; i <= 10; i++)
{
    System.out.println(i);
}
```

## Important: 
    
    Jekono program e 1st e thake Package then import then other code...


```java
//Write a program to find the sum of natural numbers from 1 to 1000.
public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        int number = 1000;
        for (int i = 1; i <= number; i++) {
            //sum = sum + i;
            sum+=i;
        }
        System.out.println("The sum is  : " +sum);
    }
}
```

> # For, while ,do while same as c and c++...

># Abstraction : 
```java

abstract class  AbstractionTest
{
    //Abstract method holo tara jader implementation child e thake...
    //kono class k abstract korar mane holo at least 1ta method abstract hobe...
    //concreate method o thakte pare...
    abstract int sum();
}

class Test extends AbstractionTest
{
    @Override
    int sum() {
        System.out.println("Hello Sum");
        return 10;
    }
    //eta create korar stahe stahei bolbe method implement korte but na korle
    // etakeo abstract class banate hobe...
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Test t = new Test();
        int res = t.sum();
        System.out.println(res);
    }
}
```

># Inheritance : 
    (i)Parent child relationship e kaj kore
    (ii) Is - A realtionship
    (iii) Code reusability
    (iv)Child parent er implemention dite pare...

    Java doesn't support multiple inheritance...

```java
class Dhani//Parent
{
    //Final use korle change kora jai nah pore...orthat override hoi nah...
   // final int a = 10;
    int a = 10;
    public void house()
    {
        System.out.println("Parents Normal House");
    }
}
//Child
class DhaniKaBeta extends Dhani
{
    public void house()
    {
        System.out.println("Modified Child House");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Dhani dhani = new Dhani();
        dhani.house();

        DhaniKaBeta dhaniKaBeta = new DhaniKaBeta();
        dhaniKaBeta.house();
        System.out.println(dhaniKaBeta.a);
        dhaniKaBeta.a = 20;
        System.out.println(dhaniKaBeta.a);

    }
}
```

> ### Method Signature : method name + parameter...

    Function overloading compile time e hoi...

># Polymorphism : 
```java
class OverRiding{

    //Also possible overriding but if private doesn't work...
    /*protected void printDone()
    {
        System.out.println("Done");
    }*/
    public void printDone()
    {
        System.out.println("Done");
    }
}

class OverRidingTest extends OverRiding{
    public void printDone()
    {
        System.out.println("This is done + done from child ");
    }
}

public class OverRidingDemo {

    public static void main(String[] args) {
        //Complite Time Poly:
        OverRiding overRiding = new OverRiding();
        overRiding.printDone();

        //Runtime Poly:
        OverRidingTest overRidingTest = new OverRidingTest();
        overRidingTest.printDone();

        OverRiding p = new OverRidingTest();
        p.printDone();

    }
}
```

>### Static function ke class name diyeo call kora jai..
```java
class Test
{
    public static void m1()
    {
    
    }

    public static void main(String[] args)
    {
        Test.m1();
    }
}
```

># Types of Variables : 
    (i)Instance Variable : 
<mark>Jara Class er moddhe but method er baire thake...Er seperate copy create hoi for each object...Created at time of object creation and distructed at time of object distruction....Heap memory te jaiga pai...Access kora hoi object reference diiye...Scope will be whole class....This is not able to use in static area...</mark>

    (ii)Static Variable:
<maark>jesob variable er samne static likha thake tara static... static variable er value class er vitore ebong method er  assign kora hoi...Single copy create hoi object to object vary kore nah...Jokhn class load hoi tokhn create hoi ar jokhn unload kora hoi tokhn distructed hoi...
Static variable can be used in instance area</maark>

    (iii)Local Variable : 
<mark>Local Variable Stack memory te create hoi...Created in a block / method...Scope oi block / method er moddhei...</mark>


>## Instance Variable : 
```java
package Variables;

class  VariableTest
{
    int a = 10;//Instance variable
    public void Iman()
    {
        System.out.println("Iman is the 1st piller");
        System.out.println(a);
    }

//Instance variable are not able to use in static area...
    // public static void print()
    // {
    //     //Not possible.....
    //     System.out.println(a);
    // }

    //sout kokhono method er baire use kora jai nah...
    //System.out.println(a);
}

public class VariableDemo {
    public static void main(String[] args) {
        VariableTest variableTest1 = new VariableTest();
        variableTest1.Iman();
        variableTest1.a = 2000;
        variableTest1.Iman();

        VariableTest variableTest2 = new VariableTest();
        variableTest2.Iman();
    }
}

```

>## Static Variable : 
```java
package Variables;

class StaticTest
{
    static int b = 2121;
    public void Demo()
    {
        System.out.println(b);
    }
    public static void Print()
    {
        System.out.println(b);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        s1.Demo();
        //Static variable k object diyeo access kora jai but eta best
        // practice nah...
        //s1.b = 20;
        StaticTest.b = 2000;
        StaticTest.Print();

        StaticTest s2 = new StaticTest();
        StaticTest.Print();
        s2.Demo();
    }
}
```


>## Local Variable : 

```java
package Variables;

class LocalTest
{
    public void printLocal()
    {
        String s = "DSA With Java";//Local variable ...
        System.out.println(s);
    }
}

public class LocalVariableDemo {

    public static void main(String[] args) {
        LocalTest l1 = new LocalTest();
        l1.printLocal();
    }
}
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


```java
public class ArrayProg1 {

    public static void main(String[] args) {
        //int type array
        //declare
        //initialization

        int arr[];
        //int []arr; Same...

        //int arr[] = {10, 11, 12, 13}//Not Recommended...
        arr = new int [5];//Sobgula 0 dara initialize hobe...
        //Fetch :
        System.out.println(arr[3]);//O(1)
        //Insert:
        arr[3] = 99;//O(1)
        System.out.println(arr[3]);

        System.out.println(arr.length);

        System.out.println(arr);
    }
}
```

```java
//Array User Input And Print : 

public class ArrayProg2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number for the index = "+i);
            int data = scan.nextInt();
            arr[i] = data;
        }

        display(arr);
    }

    public static void display(int arr[])
    {
        //for each loop:
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
}
```


>## NOTE : for each loop only forward no backward and so it is bidirectional...So, Reverse of array using for each is impossible..