package earth_OOP_Inheritance;

// first here create object for Female class for test after extends
public class Human {

    public static void main(String[] args) {

        Male male = new Male(); // creating object
// Assign value to the object male.
        male.Name = "Adam";
        male.age = 28;
        System.out.println("# # #  # # # # # # # # # # # # \n");
        System.out.println("# # # God's OOPs Theory # # # \n");
        Female female = new Female();
        female.Name = "Eve";
        female.age = 23;

        //call method by object name
        male.LoveCalculator();
        female.LoveCalculator();
//call another method by object name

        female.kids();
// These are all about inheritacne
// , method overriding and using of super keywords.
    }
}
