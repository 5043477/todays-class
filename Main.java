class Main {
  public static void main(String[] args) {
    //objects have attributes (properties) and methods (behaviors)
    //objects created from classes
    //classes serve as blueprints for our objects

     Person p1 = new Person("laur", "laura.gaber@patelhs.org", "234-556-7788");
     Person p2 = new Person("sammy", "sammy@patelhs.org", "567-667-8899");

//calling the print method through both objects
p1.print();
p2.print();

  }
}