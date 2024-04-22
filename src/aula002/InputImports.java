package aula002;

import java.nio.file.Files;
import java.nio.file.Paths;

//import java.nio.*; // (Vai dar erro, wildcard only matches class names not files or packages)
//import java.*.*; // you can only have one wildcard, and it must be at the end.
//import java.nio.files.Paths.*; // you can only import classes not methods.

public class InputImports {

	public void read(Files files) {
		Paths.get("name"); // java.nio.file
	}
	
}
