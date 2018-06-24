import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testregex {

	public static void main(String[] args) {
		String codePostal = "24p69";

		Pattern p = Pattern.compile("[0-9]{5}");
		Matcher m = p.matcher(codePostal);
		if (m.find())
			System.out.println("Correct!");
		else
			System.out.println("boubou !");

	}

}
