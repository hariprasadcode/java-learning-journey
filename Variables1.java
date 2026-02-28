class Variables1
{
  public static void main(String[] args)
  {
//Variable Declaration
    byte num1;                  // 1 byte that is 8 bits
    short num2;               //2byte that is 16 bits
    int num3;                  // 4bytes that is 32 bits
    long num4;               //8 bytes thates 64 bits
    
    float dec1;               //4 bytes that is 32 bits
    double dec2;           //8 bytes that is 64 bits

    Boolean check;      // only 1 bit
    char c;                   // 2 bytes that is 16 bits
    String name;         //  Memory Limit Is Expandable in String And  String is a PRE-DEFINED CLASS .

//Variable Initialization                           NOTE: Declaration and Initialization can be done together also.
    num1=10;
    num2=100;
    num3=10000;
    num4=1000000;

    dec1=99.9f;                     // f at the end i required for float
    dec2=999.999d;               // d at the end is required for double
   
    check=true;
    c='#';
    name="Hari Prasad";

// PRINTING 

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
System.out.println(dec1);
System.out.println(dec2);
System.out.println(check);
System.out.println(c);
System.out.println(name);

  }



}