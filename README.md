> # JAVA + DSA

> ## Language Fundamentals

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
>

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
