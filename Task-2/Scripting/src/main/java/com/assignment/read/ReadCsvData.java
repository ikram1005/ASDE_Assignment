package com.assignment.read;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCsvData{
	
	public static void main(String[] args)throws IOException, CsvValidationException {
		
     // File paths for the CSV files
	 String departments="CSVDataFiles\\Departments.csv";
	 String employees="CSVDataFiles\\Employees.csv";
	 String salaries="CSVDataFiles\\Salaries.csv";
	
	 
	 // Create a CSVReader object to read the CSV files
	 CSVReader reader=new CSVReader(new FileReader(departments));

	 String data[];
	 // Read each line of the file until null (end of file) is reached
	 while((data=reader.readNext())!=null){
		 // Iterate through the elements in the current line
		 for(int i=0;i<data.length;i++) {
			// Print each element separated by a space
			 System.out.print(data[i]+" ");
		 }
		 // Move to the next line
		 System.out.println(" ");
	 }
	 
	}
	
}
