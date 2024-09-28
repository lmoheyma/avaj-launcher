import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File file = new File("scenario.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				String[] splitedData = data.split(" ");
				if (splitedData.length != 5) {
					System.err.println("File Format Error!"); // Exception
					return;
				}
				Coordinates coordinate = new Coordinates(Integer.valueOf(splitedData[2]), Integer.valueOf(splitedData[3]), Integer.valueOf(splitedData[4]));
				AFlyable instance = new newAircraft(splitedData[0], splitedData[1], coordinate);
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("An error occured!");
			e.printStackTrace();
		}
	}
}