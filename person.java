public class Person
{
  //atributes--AKA variables
  private String name;
  private String email;
  private String phoneNumber;

  //this method will print out the values
  public void print()
  {
    System.out.println("name = " + name);
    System.out.println("email =" + email);
    System.out.println("Phone Number = " + phoneNumber);
  }

  //constructor-- assign values to my private variables
  public Person(String anotherName, String anotherEmail, String anotherNumber)
  {
  name = anotherName;
  email = anotherEmail;
  phoneNumber = anotherNumber;
  }
}