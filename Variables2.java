//Here we have done initialization and declaration together and also done Reinitialization
class Variables2
{
  public static void main(String[] args)
  {
//initialization and declaration together
    String firstName="Rohith";
    String lastName="sharma";
    int age=38;
    int salary=100000;
    String mailId=" rohithsharma45@gmail.com";

//Reinitializaton    
    firstName="Virat";
    lastName="Kohli";
    age=37;
    salary=100000;
    mailId=" virat18@gmail.com";

//printing
    System.out.println("First Name : "+firstName);
    System.out.println("Last Name : "+lastName);
    System.out.println("Age : "+age);
    System.out.println("Salary : "+salary);
    System.out.println("Mail Id : "+mailId);

}
}