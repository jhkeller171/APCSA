public class Runner
{
    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        System.out.println(duck1);
        
        Duck duck2 = new Duck("yellow", "orange");
        System.out.println(duck2);
        
        Duck duck3 = new Duck(true, "Orange");
        System.out.println(duck3);
        
        duck1.printName();
        duck2.printName();
        duck3.printName();
        
        Duck duckTest = new Duck();
        
        System.out.println(duckTest.test);
        
        
    }
}