import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// What is text?
// What is text editor?
// WHat is terminal?
// What is nano?
// WHat is text editor app?
public class Editor {

	static String fileName = "";

	public static void main(String[] args) {
		if (args.length > 0) {
			fileName = args[0];
			// has a file name with or without content
			// read state
			// edit state

			// read and show the text
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			// cursor should be at the first character and should be moveable
			Scanner scanner = new Scanner(System.in);
			while (scanner.hasNext()) {

			}

			return;
		}
		// open without a filename usually empty state
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			// user either insert or deletes the characters
			// each character must be stored or removed from the data structure
			// if user exists after adding text, show save or quit option
			// if user exists without entering text, no file is made
		}

	}
}
