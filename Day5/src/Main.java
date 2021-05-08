import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		boolean result = Pattern.matches("foobar@gmail.com","\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher("foobar@gmail.com");
		 var deneme = matcher.matches();
       System.out.println(deneme);
	}

}
