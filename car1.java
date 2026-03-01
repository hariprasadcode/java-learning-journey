class car1
{
  
   int price=2000000;
   String model="S501i";
   String brand="BMW";
   String color="White";

//creating an object inside a class
      public static void main(String[] args)
      {

           car1 c1=new car1();

           System.out.println(c1.price);
           System.out.println(c1.model);
           System.out.println(c1.brand);
           System.out.println(c1.color);

      }
}