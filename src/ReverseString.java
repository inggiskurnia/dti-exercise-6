public class ReverseString {
    public StringBuilder run(String word) {
        StringBuilder reversedWord = new StringBuilder();

        for(int i=word.length(); i>0; i--){
            reversedWord.append(word.charAt(i-1));
        }
        return reversedWord;
    }
}
