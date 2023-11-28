public class dice {

        private int value;
        
        public dice(){
            value = 0;
        }
        
        public int roll(){
            value = (int)(Math.random()*6)+1;
            if (value == 2 || value == 5){
                return 0;
            } else {
                return value;
            }
        }
}
