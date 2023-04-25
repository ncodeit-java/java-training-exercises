package com.ncodeit.files.delete;

import java.io.File;

public class TestFileDelete {

	public static void main(String[] args) {
		File file = new File("input.txt");
		boolean value = file.delete();
		if (value) {
			System.out.println("The File is deleted.");
		} else {
			System.out.println("The File is not deleted.");
		}
	}

}
