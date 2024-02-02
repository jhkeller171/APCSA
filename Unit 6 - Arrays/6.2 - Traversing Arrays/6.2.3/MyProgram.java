public class MyProgram
{
    
    public static String[] combineNames(String[] f, String[] l){
        String[] combo = new String[4];
        for (int i=0;i<4;i++){
            combo[i] = f[i] + " " + l[i];
        }
        return combo;
    }
    
    public static void main(String[] args)
    {
        String[] firstNames ={"Andrew","William","Michael","James"}; 
        String[] lastNames = {"Spencer","Coyne","Litrenta","Keller"};
        
        String[] comboArr = combineNames(firstNames, lastNames);
        
        for (int i=0;i<comboArr.length;i++){
            System.out.print(comboArr[i] + ", ");
        }
    }
}
