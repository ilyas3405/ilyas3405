import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		// Below is a static factory method. It returns an object of the same time
		Pattern p = Pattern.compile("[^a-z]");

		Matcher m = p.matcher("aba1 bbab@a zA3 C");

	
		while (m.find()) {
			count++;
			System.out.println(m.start() + "..." + m.end() + "..." + m.group());
		}
		System.out.println("Number of times :: " + count);
	}

}
