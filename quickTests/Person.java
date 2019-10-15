public class Person {
  public String firstName;
  public String lastName;
  public String fullName;
  public int age;

  public Person() { }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = firstName;
    this.fullName = firstName + " " + lastName;
  }

  public void showFullName() {
    System.out.println("Hi, my name is " + fullName + "!");
  }
}