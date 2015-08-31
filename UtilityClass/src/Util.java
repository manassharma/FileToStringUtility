import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Author: Manas Sharma
 * Description: Utility class that returns the contents of a text file as a String Object
 */
public final class Util {

	/*
	 * I am a big proponent of using Java nomenclature for variables, for
	 * instance upper-case names for constants
	 */
	private final static String PATH = "src/Inbound.txt";

	/*
	 * Egyptian brackets for scopes, I would appreciate if students follow
	 * similar conformity
	 */
	public static String obtainDefaultString() throws IOException {

		/*
		 * I believe that fewer lines a piece of code has, more maintainable it
		 * becomes, herein I am using 'try with resources' rather than the
		 * traditional 'finally' block because the BufferedReader class
		 * implements the Closable interface, I would appreciate if students to
		 * write maintainable code
		 */
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
				PATH))) {
			/*
			 * I emphasize on the nomenclature of variables to comply with
			 * industry standards such as the camel casing used in this snippet
			 */
			StringBuilder stringBuilder = new StringBuilder();
			String individualLine = bufferedReader.readLine();
			while (individualLine != null) {
				stringBuilder.append(individualLine);
				stringBuilder.append("\n");
				individualLine = bufferedReader.readLine();
			}
			return stringBuilder.toString();
		}

	}

	public static String obtainSpecificString(String inputPath)
			throws IOException {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
				inputPath))) {
			StringBuilder stringBuilder = new StringBuilder();
			String individualLine = bufferedReader.readLine();
			while (individualLine != null) {
				stringBuilder.append(individualLine);
				stringBuilder.append("\n");
				individualLine = bufferedReader.readLine();
			}
			return stringBuilder.toString();
		}
	}
}
