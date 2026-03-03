// creating 2 different objects inside a same class and reinitializing the values only for 2nd object
class Workers
{
      int id=101;
      String designation="painter";
      long salary=30000;

            public static void main(String[] args)
                 {
                        Workers w1=new Workers();
 
                        System.out.println("Id : "+w1.id);
                        System.out.println("Designation: "+w1.designation);
                        System.out.println("Salary : "+w1.salary);

                        Workers w2=new Worker();
                         
                         w2.id=102;
                         w2.designation="carpenter";
                         w2.salary=40000;

                        System.out.println("Id : "+w2.id);
                        System.out.println("Designation: "+w2.designation);
                        System.out.println("Salary : "+w2.salary);


 

 
                 }

}
