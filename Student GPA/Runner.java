public class Runner
{
    public static void main(String[] args)
    {
        /*  (1)
        Name: James Keller
        Date: 10/18/23
        Decription: This program helpes create students and discovers their percent grades in the cl
        */
        
        //CREATE STUDENT OBJECTS (2)
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student("Andrew Spencer", "AP Computer Science A", 10);
        Student student4 = new Student("William Coyne", "English", 11);
        
        //PRINTING STUDENT OBEJECTS (3)
        
        System.out.println("INITIAL CONTENT OF OBJECTS");
        
        System.out.println("");
        
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Course: " + student1.getCourse());
        System.out.println("Student Grade: "+ student1.getGrade());
        System.out.println("Number of Scores/Total Points: " + student1.getNumScores()+"/"+student1.getPoints());
        
        System.out.println("");
        
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Course: " + student2.getCourse());
        System.out.println("Student Grade: "+ student2.getGrade());
        System.out.println("Number of Scores/Total Points: " + student2.getNumScores()+"/"+student2.getPoints());
        
        System.out.println("");
        
        System.out.println("Student Name: " + student3.getName());
        System.out.println("Student Course: " + student3.getCourse());
        System.out.println("Student Grade: "+ student3.getGrade());
        System.out.println("Number of Scores/Total Points: " + student3.getNumScores()+"/"+student3.getPoints());
        
        System.out.println("");
        
        System.out.println("Student Name: " + student4.getName());
        System.out.println("Student Course: " + student4.getCourse());
        System.out.println("Student Grade: "+ student4.getGrade());
        System.out.println("Number of Scores/Total Points: " + student4.getNumScores()+"/"+student4.getPoints());
        
        //NAMING DEFAULT STUDENTS (4)
        
        student1.setName("Aidan Holman");
        student1.setCourse("Ignatian Honors English 11");
        student1.setGrade(11);
        student2.setName("Michael Litrenta");
        student2.setCourse("Cyber Science Honors");
        student2.setGrade(12);
        
        // GIVE THE STUDENTS NEW SCORES (5)
        
        //(a)
        student1.addScore(100);
        student1.addScore(100);
        
        //(b)
        student2.addScore(85);
        student2.addScore(80);
        student2.addScore((int)(Math.random()*31)+70);
        student2.addScore((int)(Math.random()*31)+70);
        
        //(c)
        student3.addScore(75);
        student3.addScore(75);
        student3.addScore(75);
        student3.addScore((int)(Math.random()*61)+40);
        student3.addScore((int)(Math.random()*61)+40);
        student3.addScore((int)(Math.random()*61)+40);
        
        //(d)
        student4.addScore(30);
        student4.addScore(31);
        student4.addScore(32);
        student4.addScore((int)(Math.random()*100)+1);
        student4.addScore((int)(Math.random()*100)+1);
        student4.addScore((int)(Math.random()*100)+1);
        
        //PRINT OUT NEW OBJECT VALUES (6)
        
        System.out.println("");
        System.out.println("ALTERED CONTENT OF OBJECTS");
        
        System.out.println("");
        
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Course: " + student1.getCourse());
        System.out.println("Student Grade: "+ student1.getGrade());
        System.out.println("Student has "+student1.getPoints()+ " total points from "+student1.getNumScores()+ " scores for a GPA of " + (double)(student1.getPoints()/student1.getNumScores()));
    
        System.out.println("");
    
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Course: " + student2.getCourse());
        System.out.println("Student Grade: "+ student2.getGrade());
        System.out.println("Student has "+student2.getPoints()+ " total points from "+student2.getNumScores()+ " scores for a GPA of " + (double)(student2.getPoints()/student2.getNumScores()));
        
        System.out.println("");
        
        System.out.println("Student Name: " + student3.getName());
        System.out.println("Student Course: " + student3.getCourse());
        System.out.println("Student Grade: "+ student3.getGrade());
        System.out.println("Student has "+student3.getPoints()+ " total points from "+student3.getNumScores()+ " scores for a GPA of " + (double)(student3.getPoints()/student3.getNumScores()));
        
        System.out.println("");
        
        System.out.println("Student Name: " + student4.getName());
        System.out.println("Student Course: " + student4.getCourse());
        System.out.println("Student Grade: "+ student4.getGrade());
        System.out.println("Student has "+student4.getPoints()+ " total points from "+student4.getNumScores()+ " scores for a GPA of " +(double)(student4.getPoints()/student4.getNumScores()));
        
    }
}
