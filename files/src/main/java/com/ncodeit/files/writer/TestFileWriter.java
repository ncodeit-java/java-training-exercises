package com.ncodeit.files.writer;

import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) {

		String data = "Welcome to Ncodeit";
		try {
			FileWriter output = new FileWriter("output.txt");

			output.write(data);
			System.out.println("Data is written to the file.");

			output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
