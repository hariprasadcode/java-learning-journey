
/*just a practice to learn methods .

1st declared a non-static variables then created a methods  named  property1 , property2 . then created a main method inside that i created an object to call a method property1 . and i created asecond object to call the method property2 . and reintialized the valued for second object. 

Heare i got to know we can create a multible methods and we can call which ever we wants */


class Bus
{
      //non static variables.
      String number="KA17E2001";
      String brand="Tata Motors";
      String model="Starbus EV";
      String color="White";
      double price=2500000.95d;

      public void property1()
       {
            System.out.println("Public Transport");

       }
       public void property2()
       {
              System.out.println("Private Transport");
       }

    // main method

        public static void main(String[] args)
         {
              Bus b1=new Bus();
              b1.property1();
              System.out.println("number : "+b1.number);
              System.out.println("Brand: "+b1.brand);
              System.out.println("Model : "+b1.model);
              System.out.println("color : "+b1.color);
              System.out.println("price : "+b1.price);
              
               System.out.println("   ");


              // Creating second object
              Bus b2=new Bus();

              b2.property2();
              
              //reinitializing only for second object
              b2.number="KA17E2002";
              b2.color="Black";
              b2.price=2200000.95d;

              System.out.println("number : "+b2.number);
              System.out.println("Brand: "+b2.brand);
              System.out.println("Model : "+b2.model);
              System.out.println("color : "+b2.color);
              System.out.println("price : "+b2.price);
              
            
         }

}