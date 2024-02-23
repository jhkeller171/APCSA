//add your information, date, and description here

public class MyProgram {

    public static void main(String[] args) {
        //Create a 2D array called matrix that is 5 x 5 
        int[][] matrix = new int[5][5];
        //Fill the 2D array with random numbers 1 - 15
        for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[0].length;c++){
                matrix[r][c] = (int)(Math.random()*15)+1;
            }
        }
        

        System.out.println("Original Matrix");
        //Write a print2dArray method after the main section that will traverse 
        //the entire array and print each row on separate lines

        //call the print2dArray method to print the original matrix
        print2dArray(matrix);
        System.out.println();
       //1. Write a code segment that prints the sum of each row using For loops
       for (int r=0;r<matrix.length;r++){
           System.out.print("The sum of Row "+r+" is: ");
           int sum = 0;
           for (int c=0;c<matrix.length;c++){
               sum+=matrix[r][c];
           }
           System.out.println(sum);
       }
            


        System.out.println();
       
        //2. Write a code segment that prints the sum of each column using For loops
        for (int c=0;c<matrix[0].length;c++){
           System.out.print("The Sum of Column "+c+" is: ");
           int sum = 0; 
           for (int r=0;r<matrix.length;r++){
               sum+=matrix[r][c];
           }
           System.out.println(sum);
        }



        System.out.println();
       
       //3.  Write a code segment that adds & displays the total sum of all the integer
       //    elements AROUND THE BORDER of a 2D array using For loops
       
       // This is a foolish, brute force attempt!
       // sum = matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3] + ... 
       int sum = 0;
       for (int r=0;r<matrix.length;r++){
           for (int c=0;c<matrix[r].length;c++){
               if (r==0||r==matrix.length-1||c==0||c==matrix[matrix.length-1].length-1){
                   sum+=matrix[r][c];
               }
           }
       }
       System.out.println("Around the border sum is "+sum);

            
            

        //print specified output for part 3 as shown in example      
              
       // 4. Write a code segment that adds & prints the sum of the elements
        // INSIDE THE BORDER of a 2D array using For loops
        sum = 0;
       for (int r=1;r<matrix.length-1;r++){
           for (int c=1;c<matrix[r].length-1;c++){

                   sum+=matrix[r][c];
           }
       }
       System.out.println("The sum of the inside elements is "+sum);
        
        

	  //print specified output for part 4 as shown in example      

        // 5. Write a code segment that adds & prints the sum of the elements 
        // that are even numbers.
        sum = 0;
        for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[r].length;c++){
                if (matrix[r][c]%2==0){
                    sum+=matrix[r][c];
                }
            }
        }
        System.out.println("The Sum of the even elements is "+sum);
        


	  //print specified output for part 5 as shown in example      

        
        // 6. Write a code segment that adds & prints the sum of the elements that
        // are found in rows with even indices (i.e. rows 0, 2, 4, etc.) or columns with 
        // odd indices (i.e. columns 1, 3, 5, etc.)
        sum = 0;
        for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[r].length;c++){
                if (r%2==0||c%2!=0){
                    sum+=matrix[r][c];
                }
            }
        }
        System.out.println("The sum of the elements whose row is even or column is odd is: "+sum);

	  //print specified output for part 6 as shown in example      

        System.out.println();

        // 7. Swap the values of column 1 and column 3 using For Loops
        int[] temp = new int[matrix[1].length];
        for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[r].length;c++){
                if (c==1){
                    temp[r] = matrix[r][c];
                    //Sets temp to the contents of column 1
                }
            }
        }
        for (int r=0;r<matrix.length;r++){
            int c = 3;
            matrix[r][1] = matrix[r][c];
            //sets column 1 to column 3
        }
        for (int r=0;r<matrix.length;r++){
            int c = 1;
            matrix[r][3] = temp[r];
            //sets column 3 to temp
        }
        System.out.println("Swapped columns 1 and 3:");
        print2dArray(matrix);



	
	  //print using the print2dArray method      

        System.out.println();



       // 8. Search the matrix for a random number 1 - 15 and assign it to variable num, 
       // count then print the number of occurrences of num that are in the matrix. 
       int search = (int)(Math.random()*15)+1;
       sum = 0;
       for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[r].length;c++){
                if (matrix[r][c]==search){
                    sum++;
                }
            }
        }
        System.out.println("Number of occurences of the number "+search+ " is: "+sum);



	
	  //print specified output for part 8 as shown in example      

    }// end of main method
    
    // Write method to print a 2D array as rows and columns
    // add a tab between each element using  + "\t" inside the print statement
    public static void print2dArray(int[][] array)
    {

	//your code goes here
	for (int r=0;r<array.length;r++){
	    for (int c=0;c<array[r].length;c++){
	        System.out.print(array[r][c] + "\t");
	    }
	    System.out.println();
	}

    }// end of print2dArray method
    
}// end of Main class
