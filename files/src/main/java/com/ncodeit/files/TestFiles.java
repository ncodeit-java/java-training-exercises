package com.ncodeit.files;

import java.io.File;

public class TestFiles {

	public static void main(String[] args) {

		System.out.println("Creating a file Object using path: ");
		File file = new File("ncodeit.txt");
		try {
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The new file named ncodeit is created.");
				System.out.println("Path the new file created is inside project TestFiles");
			} else {
				System.out.println("The file already exists.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		System.out.println("Creating another 2 new file Objects using path to show renaming: ");
		File newFile = new File("ncodeit_hyd.txt");
		File newRenameFile = new File("ncodeit_india.txt");

		boolean flag = newFile.renameTo(newRenameFile);

		if (flag == true) {
			System.out.println("File Successfully Renamed");
		} else {
			System.out.println("Operation Failed");
		}

	}

}
