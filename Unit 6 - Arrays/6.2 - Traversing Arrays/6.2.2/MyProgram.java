public class MyProgram
{
	public static double[] timesTen(double[] arr)
	{
		for (int i=0;i<arr.length;i++){
		    arr[i] = arr[i]*10;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
	    double[] arr = {10.5,20.0,30.5,40.2,50.1,60.0,65.3,70.2,70.6,80.6};
        System.out.print("Original Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        double[] modArr = timesTen(arr);
        System.out.print("Modified Array: ");
        for (int i=0;i<modArr.length;i++){
            System.out.print(modArr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Modified Array, Even Indices");
        for (int i=0;i<modArr.length;i+=2){
            System.out.print(modArr[i]+" ");
        }
        
	}
}
