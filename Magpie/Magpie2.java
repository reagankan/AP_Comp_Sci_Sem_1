public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
		if(statement.length() == 0)
		{
			response = "Say something, please.";
		}

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		
		if(findKeyword(statement, "no") >= 0 || findKeyword(statement, "No") >= 0 || findKeyword(statement, "NO") >= 0 || findKeyword(statement, "nO") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("Robinette") >= 0
				|| statement.indexOf("Richard") >= 0
				|| statement.indexOf("robinette") >= 0
				|| statement.indexOf("richard") >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("turtle") >= 0)
		{
			response = "Tell me more about your pet";
		}
//
		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String before = "", after = "";
		
		
		/* New String variable phrase = a more searchable version of statement.
		 	-Use a combination of trim() and toLowerCase() modify statement.*/
		String phrase = statement.trim();  phrase.toLowerCase();
		
		/*   New int variable psn = the location of goal in phrase after
		   startPos*/
		//System.out.printf("goal: %s\t", goal);
		int psn = phrase.indexOf(goal, startPos);
		//System.out.println("psn: " + psn);
			/*-->Refinement: Make sure we find goal by itself, and not part
			of another word ("no" vs no in "know"). if you find an occurrence
			of goal, make sure before and after aren't letters.

			As long as psn >= 0...*/
		
		while(psn >= 0)
		{
				/*Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

				//====>code here
		
			if(psn > 0)
			{
				before = Character.toString(phrase.charAt(psn-1));
				//System.out.println("before: " + before);
				//cout("justBefore",phrase, goal, before, after);
			}
		
				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

				//=====> code here
			if(psn + goal.length() < phrase.length())
			{
				after = Character.toString(phrase.charAt(psn + goal.length()));
				//cout("with after",phrase, goal, before, after);
			}

				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn

				Otherwise, search for goal in phrase from psn + 1 forward */
			//System.out.println("before: " + before + "\tafter: " + after);
			//if(before.compareTo("a") == -6 || before.compareTo("a") == -31 || after.compareTo("z") == -6 || after.compareTo("z") == -31)
			if((before.compareTo("") == 0 || before.compareTo(" ") == 0) && (after.compareTo("") == 0 || after.compareTo(" ") == 0))
			{
				return psn;
			}
			else
			{
				//System.out.println("Recursion");
				return findKeyword(phrase, goal, psn+1);
			}
		}
		return psn;
	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}
	
	private void cout(String description, String phrase, String goal, String before, String after)
	{
		System.out.println(description);
		System.out.println("phrase: " + phrase);
		System.out.println("goal: " + goal);
		System.out.println("before: " + before);
		System.out.println("after: " + after + "\n");
	}
	
	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
