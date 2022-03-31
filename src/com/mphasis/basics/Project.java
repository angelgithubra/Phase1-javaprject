

package com.mphasis.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	//create File ....
	public static void genaretFile(String fileName) throws IOException 
	{
		String filePath="D:\\simplilearn\\";
		ArrayList<String> aList=new ArrayList<String>();
		
		System.out.println("enter the file name to create");
		String finalname=filePath+fileName;
		
		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) 
		{
			System.out.println("the file not created");
		}
		else 
		{
			aList.add(fileName);
			System.out.println("file created");
		}
		
		System.out.println("Your list is .... "+aList);
	}
	
	//Delete Function
	
	public static void deleteFile(String fileName) {
		String path="D:\\simplilearn\\";

		String finalfile=path+fileName;
		File file=new File(finalfile);
		file.delete();
		System.out.println("file deleted");
		
	}
	//Searching Function
	
	public static void serchFile(String serchingFileName) {
		String path="D:\\simplilearn\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		int count=0;
		for(File ff:filename) {
			
			if(ff.getName().equals(serchingFileName))
			{
				count++;
				break;
			}else {
				count=0;
			}
		}
		if (count!=0) {
			System.out.println("You have "+serchingFileName+" File :)");
			
		}else {
			System.out.println("File is not found");
		}
	}
	
	//Display File List...
	
	public  static void displayFile() {
		String path="D:\\simplilearn\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		System.out.println("Your File List.......");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
	
	
	
	//Main Method Start....
	
	public static void main(String[] args) throws IOException {
		Scanner scanner =new Scanner(System.in);
		boolean b=true;									//for stop Main menu;
		while(b) {
			System.out.println("What You Want?");
			System.out.println();
			System.out.println("If you want to Create File : Press 1");
			System.out.println("If you want to Delete File : Press 2");
			System.out.println("If you want to Search File : Press 3");
			System.out.println("If you want to Diaplay File : Press 4");
			System.out.println("If you want to stop System Press 5");
			System.out.println();
			int i=scanner.nextInt();
			
			if(i<=0 || i>=6) {									//If No is not range the,,,,It working
				
				System.out.println("wo ho you not enter valid number....  ");
				System.out.println();
		
			}else{
			
				switch (i) {
					case 1:
						System.out.println("Enter the File Name for Create");
						String  FileForCreate=scanner.next();
						genaretFile(FileForCreate);
						System.out.println();
						break;
					case 2:
						System.out.println("Enter the File Name for Delete");
						String FileForDelete=scanner.next();
						deleteFile(FileForDelete);
						System.out.println();
						break;
					case 3:
						System.out.println("Enter the File Name for Serching");
						String FileForSerching=scanner.next();
						serchFile(FileForSerching);
						System.out.println();
						break;
					case 4:
						
						System.out.println("File Displaying.........");
						displayFile();
						System.out.println();
						break;
					case 5:
						System.out.println("System Close....");
						b=false;
		
					default:
						break;
					}
			}
		}
		
	}

}
