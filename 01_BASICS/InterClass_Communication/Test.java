class Test
{
  public static void main(String[] args)
  {

      // Creating first object of Employee class
      // This object will access default values of non-static variables
     Employee E1=new Employee();

          // Printing default values assigned in Employee class
          System.out.println(E1.id);
          System.out.println(E1.firstName);
          System.out.println(E1.lastName);
          System.out.println(E1.email);
          System.out.println(E1.salary);
          System.out.println(E1.designation);
          System.out.println();

     //creating Second object for Employee class 
      Employee E2=new Employee();
              
              //reinitializing only for second object
              E2.id=102;
              E2.firstName="Surya";
              E2.lastName="Kumar";
              E2.email="sky@gmail.com";
              E2.salary=250000d; 
    

          System.out.println(E2.id);
          System.out.println(E2.firstName);
          System.out.println(E2.lastName);
          System.out.println(E2.email);
          System.out.println(E2.salary);
          System.out.println(E2.designation);    // Will print default value if not modified
          System.out.println();

     //creating Third object for Employee class 
     Employee E3=new Employee();
   
         //reinitializing only for Third object
        E3.id=103;
        E3.firstName="Sanju";
        E3.lastName="Samson";
        E3.email="sanjusamson103@gmail.com";
        E3.salary=210000;

           //reinitializing only for Third object
          System.out.println(E3.id);
          System.out.println(E3.firstName);
          System.out.println(E3.lastName);
          System.out.println(E3.email);
          System.out.println(E3.salary);
          System.out.println(E3.designation);
  }
}
