/*
  EX NO :8		PROGRAM FOR DISPLAYING FILE INFORMATION 

AIM
    To write a java program that reads a file name from the user, displays 
    information about whether the file exists, whether the file is readable, 
    or writable, the type of file and the length of the file in bytes. 

PROCEDURE
    1.  Create a class filedemo. Get the file name from the user .
    2.  Use the file functions and display the information about the file.
    3.  getName() displays the name of the file.
    4.  getPath() diplays the path name of the file.
    5.  getParent() -This method returns the pathname string of this abstract 
        pathname’s parent, or null if this pathname does not name a parent directory.
    6.  exists() – Checks whether the file exists or not.
    7.  canRead()-This method is basically a check if the file can be read.
    8.  canWrite()-verifies whether the application can write to the file.
    9.  isDirectory() – displays whether it is a directory or not.
    10. isFile() – displays whether it is a file or not.
    11. lastmodified() – displays the last modified information.
    12. length()- displays the size of the file.
    13. delete() – deletes the file
    14. Invoke the predefined functions and display the information about the file.

PROGRAM
*/
import java.io.*;
import java.util.*;
class filedemo
{
    public static void main(String args[])
    {
        String filename;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        filename = s.nextLine();
        File f1 = new File(filename);
        System.out.println("***********************");
        System.out.println("   FILE INFORMATION    ");
        System.out.println("***********************");
        System.out.println("FILE NAME : "+f1.getName());
        System.out.println("FILE PATH : "+f1.getPath());
        System.out.println("PARENT    : "+f1.getParent());
        
        if(f1.exists())
        {
            System.out.println("    THE FILE EXISTS    ");
            
            System.out.println("READABLE FILE : "+f1.canRead());
            
            System.out.println("WRITABLE FILE : "+f1.canWrite());
            
            System.out.println("DIRECTORY     : "+f1.isDirectory());
            
            System.out.println("IT IS A FILE  : "+f1.isFile());
        
            Date lastmodified = new Date(f1.lastModified());

            System.out.println("LAST MODIFIED : "+lastmodified );

            System.out.println("FILE LENGTH   : "+f1.length());
 
            System.out.println("FILE DELETED  : "+f1.delete());
        }    
        else
            System.out.println("THE FILE DOES NOT EXISTS ");
    }
}