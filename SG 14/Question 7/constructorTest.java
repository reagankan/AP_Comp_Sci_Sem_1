import java.util.*;
import java.lang.*;
public class constructorTest
{
	 public static void main(String[]args)
	 {
		testThis obj = new testThis("Reagan");
		
		System.out.println("Name: " + obj.name);
	 }
	 
	 public static class testThis
	 {
		 private String name;
		 public testThis(String str)
		 {
			 name = str;
			 this.name = name + str;
			 setName(name + this.name);
			 this.setName(name + this.getName());
		 }
		 private void setName(String newName)
		 {
			 name = newName;
		 }
		 private String getName()
		 {
			 return name;
		 }
	 }
}