

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="I am a string. Yes, I am.";
		System.out.println(string);
		
		String yourString = string.replaceAll("I", "You");
		System.out.println(yourString);
		
		
		String alphanumeric = "afbcDeef1234hdhd99z1234";
		System.out.println(alphanumeric.replaceAll(".", "Y"));
		
		System.out.println(alphanumeric.replaceAll("^abcDeef","YYY"));
		
		
		String secondString = "abcDeef1234hdhd99abcDeefz1234";
		System.out.println(secondString.replaceAll("^abcDee", "YYY"));
		
		
		System.out.println(alphanumeric.matches("^abcDeef"));
		System.out.println(alphanumeric.matches("^abcDeef1234hdhd99z1234"));
		
		
		System.out.println(alphanumeric.replaceAll("1234$", "THE END"));
		
		System.out.println(alphanumeric.replaceAll("[aei]", "X"));
		
		System.out.println(alphanumeric.replaceAll("[ae9][fz]", "X"));
		
		System.out.println("fatima".replaceAll("[Ff]", "Fatima"));
		
		String newalphanumeric = "afbcDeef1234hdhd99z1234";
		
		System.out.println(newalphanumeric.replaceAll("[^ef]", "X"));
		
		System.out.println(newalphanumeric.replaceAll("[0-9]", "X"));
		
		System.out.println(newalphanumeric.replaceAll("\\D", "X"));
		
		
		String hasWhitespace = "I have blank spaces and \ta tab and also a new line\n";
		
		
		System.out.println(hasWhitespace.replaceAll("\\s", ""));
		
		String hasnewlines ="My name is Fatima\nMy fathers name is Ilyas\nMy sisters name is Marym\nEnd-of-my-family";
		System.out.println(hasnewlines.replaceAll("[\\n]", ""));
		
		
		String hascarriagereturn ="My name is Fatima\nMy fathers name is Ilyas\nMy sisters name is Marym\nEnd-of-my-family";
		System.out.println(hascarriagereturn);
		
		System.out.println(hascarriagereturn.replaceAll("\\W", ""));
		
		System.out.println(hascarriagereturn.replaceAll("\\b", "<>"));
		
		
		StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1");
		htmlText.append("<h2>Sub-heading</h2>");
		htmlText.append("<p>this is paragraph about something</p>");
		htmlText.append("<p>This is another paragram about something else</p>");
		htmlText.append("<h2>Summary</h2>");
		htmlText.append("<p>Here is the summary.</p>");
		
		
 
		//String h2Parttern = "(<h2>.*?</h2>)"; 
		String h2Parttern = "(<h2>)(.+?)(</h2>)"; 
		Pattern pattern = Pattern.compile(h2Parttern);
		Matcher matcher = pattern.matcher(htmlText);
		
		System.out.println(matcher.matches());


		int count = 0;
		matcher.reset();
		while(matcher.find()) {
			count++;
			//System.out.println("Occurance " + count + " : " + matcher.start() +" to " + matcher.end());
			System.out.println("Occurance " + matcher.group(2));
		}
		

		//"abc" "a" and "b" and "c"
		// [Hh]arry
		System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
		System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
		

		//[^abc]
		String tvTest = "tstvtkt";
		//String tNotVRegExp = "t[^v]";
		String tNotVRegExp = "t(?!v)";
		
		Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
		Matcher tNotvMatcher = tNotVPattern.matcher(tvTest);
		
		count = 0;
				
		while(tNotvMatcher.find()) {
			count++;
			System.out.println("Occurance " + count + " : " + tNotvMatcher.start() + " to " + tNotvMatcher.end());
	
		}
	}

}
