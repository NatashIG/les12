package by.epam.readfile;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {

	public static void main(String[] args) throws Exception {

		try {
			File myFile = new File("LibraryList.txt");
			FileReader fileReader = new FileReader(myFile);

			BufferedReader reader = new BufferedReader(fileReader);

			ArrayList<String> list = new ArrayList<>();

			String line = null;

			while ((line = reader.readLine()) != null) {
				list.add(line);
				System.out.println(line);
			}
			reader.close();
			System.out.println(list);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
