import java.util.Scanner;

public class Lab_03_01
{
	public static void main(String[]args)
	{
		//set up user intput
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Lab 3 Part 1: Insults\n\n");
		
		String name, age, hobby, music, siblings, profession, gender = "", sister = "sister", brother = "brother";
		boolean cond = true; 
		int num_sib = 0;
		
		
		
		System.out.println("What is your name?");
		System.out.print(">> ");
		
		name = cin.nextLine();
		
		System.out.print(name);
		System.out.print("??? That sounds dumb\n\n");
		
		
		
		System.out.println("What is your age?");
		System.out.print(">> ");
		
		age = cin.nextLine();
		
		System.out.print(age);
		System.out.print(" is getting up there!\n\n");
		
		
		
		System.out.println("What is one of your hobbies?");
		System.out.print(">> ");
		
		hobby = cin.nextLine();
		
		System.out.print(hobby);
		System.out.print("?? I though only nerds like to do that\n\n");
		
		
		
		System.out.println("What is your favorite music?");
		System.out.print(">> ");
		
		music = cin.nextLine();
		
		System.out.print("No one listens to ");
		System.out.println(music);
		
		
		System.out.println("\n\nHow many siblings do you have?");
		System.out.print(">> ");
		
		siblings = cin.nextLine();
		num_sib = Integer.parseInt(siblings);
		if(num_sib == 0)
		{
			System.out.print("Only child huh? Sucks to be you.\n\n");
		}
		else if(num_sib == 1)
		{
			while(cond)
			{
				System.out.println("Is it a sister or brother?");
				System.out.print(">>");
			
				gender = cin.nextLine();
				
				if(gender.equals(sister))
				{
					System.out.print("I bet she is more successful than you\n\n");
					cond = false;
				}
				else if(gender.equals(brother))
				{
					System.out.print("I bet he is more successful than you\n\n");
					cond = false;
				}
				else// incorrect input
				{
					System.out.println("Please only enter 'sister' or 'brother'");
				}
			}	
		}
		else// num_sib > 1
		{
			System.out.print("I bet all ");
			System.out.print(siblings);
			System.out.print(" of them are more successful than you\n\n");
		}
		
		
		System.out.println("What is your dream job?");
		System.out.print(">> ");
		
		profession = cin.nextLine();
		
		System.out.print(profession);
		System.out.print("??? I think you'd do better as a janitor\n\n");
		
		
		System.out.print("So ");
		System.out.print(name);
		System.out.print(", you're ");
		System.out.print(age);
		System.out.print("...\n");
		System.out.print("You like ");
		System.out.print(hobby);
		System.out.print(" and listening to ");
		System.out.print(music);
		System.out.print("...\n");
		System.out.print("Good luck becoming a ");
		System.out.print(profession);
		System.out.print("\nJust kiddin' ");
		System.out.print(name);
		System.out.print(".\n");
		
		
		
		
		
		
		
	

	}	
}