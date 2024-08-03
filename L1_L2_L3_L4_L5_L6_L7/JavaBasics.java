package DSA.L1_L2_L3_L4_L5_L6_L7;
import java.util.*;

public class JavaBasics {
   public static void main(String[] args) {
    // taking input using scanner object.
    Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // int intNum = sc.nextInt();
    // float floatNum = sc.nextFloat();
    // byte byteNum = sc.nextByte();
    // double doubleNum = sc.nextDouble();
    // boolean boolNum = sc.nextBoolean();
    // short shortNum = sc.nextShort();
    // long longNum = sc.nextLong();
    
    // System.out.println(name);
    // System.out.println(intNum);
    // System.out.println(floatNum);
    // System.out.println(byteNum);
    // System.out.println(doubleNum);
    // System.out.println(boolNum);
    // System.out.println(shortNum);
    // System.out.println(longNum);
    //OP =>
// pavan
// 2
// 2.88
// 4
// 393.32983284
// false
// 9
// 43986589043432

//  **************** Type Conversion (Widening /implicit conversion) ********************
// Possible when 1) type compatible & 2) destination type > source type
//Possbile conversions : byte -> short -> int -> long -> float -> double : reverse is not posssible

// int rad = 4;
// float area = 3.14f * ((rad*rad)) ;
// System.out.println(area); //50.24
// float b = rad;
// System.out.println(b); //4

//  **************** Type Casting (narrowing /explicit conversion) ********************
// float a =  3.234f;
// int b = (int) a; 
// System.out.println(a); //3.234
// System.out.println(b); //3

//  ***************************** Type Promotion in Expressions  ******************************

/*
 1) Java auto promotes byte, short, char to int in an expression
 2) if operend are long, float, double whole expression is promoted to the later one which ever is present.
 */

//  char a='a';
//  char b='b';
//  System.out.println((int)a); //97
//  System.out.println((int)b); //98
//  System.out.println(b-a); //1

//  byte ranges from -128 to 127.
//  129 in int (32 bits): 00000000 00000000 00000000 10000001
//  Lower 8 bits: 10000001 (binary for -127)
// short p = 5;
// byte q = 25;
// char r = 'c';  // ASCII value of 'c' is 99
// byte bt = (byte) (p + q + r);  // 129 is cast to byte, resulting in -127
// System.out.println(bt);  // Output: -127

// int a=11;
// float b= 324.435f;
// long c= 22;
// double d = 0;
// int ans = (int) (a+b+c+d);
// System.out.println(ans); //357

//  ***************************** How Java code runs  ******************************
/*
JDK: Used by developers to write and compile Java code.
JRE: Needed to run Java applications; contains the JVM.
JVM: Executes the compiled bytecode, manages memory, and ensures the security and portability of Java applications.
Source code(.java) --> JDK (compilation & converts source code to byte code, errors notified  -->
byte code (.class) --> JVM (converts byte code to native code according to OS ) --> Native code

JVM + libraries = JRE
JRE + Development tools = JDK

Java:

Portability: High
Compilation: Java programs are compiled into platform-independent bytecode.
Execution: Bytecode runs on any system with a compatible Java Virtual Machine (JVM).
Advantage: "Write once, run anywhere" – the same compiled Java program can run on different hardware and operating systems without modification.
C++:

Portability: Lower
Compilation: C++ programs are compiled into platform-specific machine code.
Execution: Executable files are tailored to specific hardware and operating systems.
Limitation: To run on different systems, C++ programs typically need recompilation considering system-specific architecture and OS dependencies.
 */ 

 //  ***************************** OPERATORS  ******************************

 /* *BARAL*
  Bitwise    - &, |, ^(XOR), ~, <<, >>, >>>
  Arithmetic - Binary + - * % /, Unary ++ --
  Relational - == , != , >= , <= , < , >
  Assignment - = , += , -= , *= , /=
  Logical    - && || !
  */













sc.close();
   }
}
