import java.util.ArrayList;
import java.util.List;

public class FindAndReplace {

  public String runFindAndReplace(String input, String targetWord, String replaceWord) {
    String[] phraseArray = input.split(" ");
    String phrase = "";
    for ( String word : phraseArray ){
      if ( word.equals(targetWord)){
        word = replaceWord;
        //return targetWord;
      }
      phrase += word + " ";
    }
    return phrase;
  }

}
