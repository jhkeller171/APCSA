public class WordGames {
    //Variables
    private String word;
    
    public WordGames(String userWord){
        word = userWord;
    }
    
    public String whisper(){
        return word.toLowerCase();
    }
    
    public String toString(){
        return "["+word+"]";
    }
    
    public String yell(){
        return word.toUpperCase();
    }
    
    public void setText(String newWord){
        word = newWord;
    }
    
    public String scramble(){
        return word.substring((word.length()/2), word.length()) + word.substring(0,(word.length()/2));
    }
    
    public String bananaSplit(int insertIdx, String insertText){
        return word.substring(0,insertIdx) + insertText.toUpperCase() + word.substring((insertIdx+1));
    }
    
    public String bananaSplit(String insertChar, String insertText){
        return word.substring(0,word.indexOf(insertChar)) + insertText.toUpperCase() + word.substring(word.indexOf(insertChar));
    }
}
