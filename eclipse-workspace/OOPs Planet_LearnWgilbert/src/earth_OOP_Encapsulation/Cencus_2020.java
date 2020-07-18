package earth_OOP_Encapsulation;

// ## Create main mmethod first
//1. Lets create object for the Adam_family class.
//2. So that we can use the name age and gender which are in the private mode..
public class Cencus_2020 {
    public static void main(String[] args) {

        Adam_Family person1 = new Adam_Family();
        Adam_Family person2 = new Adam_Family();
        Adam_Family person3 = new Adam_Family();
        Adam_Family person4 = new Adam_Family();

        person1.setName("Adam Mamu");
        person1.setAge(65);
        person1.setGender("Male");
        System.out.println("Name of the first person is " + person1.getName());
        System.out.println("Age of the first person is " + person1.getAge());
        System.out.println("Gender of the first person is " + person1.getGender());
        System.out.println("***********************************\n");


        person2.setName("Eve Khala");
        person2.setAge(45);
        person2.setGender("Female");
        System.out.println("Name of the first person is " + person2.getName());
        System.out.println("Age of the first person is " + person2.getAge());
        System.out.println("Gender of the first person is " + person2.getGender());
        System.out.println("***********************************\n");

        person3.setName("Tom Cruse");
        person3.setAge(15);
        person3.setGender("Male");
        System.out.println("Name of the first person is " + person3.getName());
        System.out.println("Age of the first person is " + person3.getAge());
        System.out.println("Gender of the first person is " + person3.getGender());
        System.out.println("***********************************\n");

        person4.setName("Ishika Kapur");
        person4.setAge(12);
        person4.setGender("Female");
        System.out.println("Name of the first person is " + person4.getName());
        System.out.println("Age of the first person is " + person4.getAge());
        System.out.println("Gender of the first person is " + person4.getGender());
        System.out.println("***********************************\n");
    }


}
