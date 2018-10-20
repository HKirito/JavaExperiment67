package Experiment6.T1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String newFristName, String newLastName,int newAge){
        firstName = newFristName;
        lastName = newLastName;
        age = newAge;
    }
    public Person(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Person p2){
         if (p2.firstName.equals(this.firstName)){
            if (p2.lastName.equals(this.lastName)){
                if (p2.age==this.age)
                    return true;
            }
        }
        return false;
    }
}
