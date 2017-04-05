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
		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement,"Robinette") >= 0
				|| findKeyword(statement,"Richard") >= 0
				|| findKeyword(statement,"robinette") >= 0
				|| findKeyword(statement,"richard") >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}
		else if (findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"fish") >= 0
				|| findKeyword(statement,"turtle") >= 0)
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
		
		String phrase = statement.trim();  phrase.toLowerCase();
		goal.toLowerCase();
	
		int psn = phrase.indexOf(goal, startPos);
	while(psn >= 0)
		{
			if(psn > 0)
			{
				before = Character.toString(phrase.charAt(psn-1));
			}
			if(psn + goal.length() < phrase.length())
			{
				after = Character.toString(phrase.charAt(psn + goal.length()));
			}
			if((before.compareTo("") == 0 || before.compareTo(" ") == 0) && (after.compareTo("") == 0 || after.compareTo(" ") == 0))
			{
				return psn;
			}
			else
			{
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
