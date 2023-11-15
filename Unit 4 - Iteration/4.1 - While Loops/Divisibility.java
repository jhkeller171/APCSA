public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while (num > 0) {
            int d = num / 10; //Sets D = 2983872
            int k = num - d * 10; //Sets k = 29838724 - (2983872 * 10) or in other words 29838724-2983872=4
            num = d;
            System.out.println(k);
        }
        /*String number = Integer.toString(num);
        for (int i=number.length()-1;i>-1;i--){
        System.out.println(number.charAt(i));*/
        }
    }
