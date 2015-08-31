import java.io.IOException;

public class Driver {

	public static void main(String args[])throws IOException {
		String printable = null;
		System.out.println("Printing the contents of the file stored in the default package--->");
		try {
			printable = Util.obtainDefaultString();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(printable);

	}
}
