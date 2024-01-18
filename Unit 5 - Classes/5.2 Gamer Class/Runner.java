//DO NOT SUBMIT this program until we have added some additional methods together

//add a multi-line comment with Programmer, date, description for this program

public class Runner {

    public static void main(String[] args) {
       
       //create 2 gamer objects - one using each constructor
       Gamer Andrew = new Gamer("Andrew", 10);
       Gamer Will = new Gamer("Will");

       //print both objects - add text Object 1 or 2: in front
       System.out.println("Object 1: " + Andrew.toString());
       System.out.println("Object 2: " + Will.toString());

       //print object1's points using getter method - Object1's points: 14
       System.out.println("Object 1's Points: " + Andrew.getPoints());

       //print object2's name using getter method - Object2's name: LaserBeam
       System.out.println("Object 2's Name: " + Will.getName());

       //call the setter method that will set the points for Object2
       Will.setPoints(25);

       //call the setter method that will change the name for Object1
       Andrew.setName("Jandrew Speller");

       //print object2's points using getter method - Object2's points: 6
       System.out.println("Object 2's Points: " + Will.getPoints());

       //print object1's name using getter method - Object1's name: FlashGordan
       System.out.println("Object 1's Name: " + Andrew.getName());

       //call the mutator method that will add a random number of points between 0 - 7 on both objects
       Andrew.addPoints();
       Will.addPoints();
       
       //print both objects again - add text Object 1 or 2: in front
       System.out.println("Object 1: " + Andrew.toString());
       System.out.println("Object 2: " + Will.toString());

    }

}
