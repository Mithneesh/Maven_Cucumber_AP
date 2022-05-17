package com.Properties;

public class File_Reader_Manager {
	

	public File_Reader_Manager() {
	}
	
	
	
	public static File_Reader_Manager getFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	
	public Config_Reader getCR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;
	}
	
	
}
