package aula002;

//import java.util.*;
//import java.sql.*; // Does not compile

//import java.util.Date;
//import java.sql.*; // specific imports take precendence over wildcards

import java.util.Date;
//import java.sql.Date;

public class Conflicts {
	//Date class
	
	Date date; // this Date belongs to the util package
	java.sql.Date sqlDate; // fully qualified Class name
}
