package dbrown_regex;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	   public static void main(String[] args) throws FileNotFoundException {
	        ReadFishFile fishFile = new ReadFishFile("Fish.html");

	        Pattern regex = Pattern.compile("((https?):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)", Pattern.CASE_INSENSITIVE);
	        Matcher search = regex.matcher(fishFile.getFileText());
	        int count = 0;
	        while (search.find()) {
	            Fish fish = new Fish(++count, search.group(), search.start());
	            FishUrl fishUrl = new FishUrl(search.group());
	            System.out.println(fishUrl);
	            
	        }
	    }

}
