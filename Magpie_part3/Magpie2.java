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
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
		  response = transformIWantToStatement(statement);
		}
		else 
		{
		  // Look for a two word (you <something> me)
		  // pattern
		  int psn = findKeyword(statement, "you", 0);

		  if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
		  {
			 response = transformYouMeStatement(statement);
		  }
		  else
		  {
			 response = getRandomResponse();
		  }
		  
		  // Look for a two word (I <something> you)
		  // pattern
		  psn = findKeyword(statement, "I", 0);

		  if (psn >= 0 && findKeyword(statement, "you", psn) >= 0)
		  {
			 response = transformIYouStatement(statement);
		  }
		  else
		  {
			 response = getRandomResponse();
		  }
		}
		return response;
	}
	/**
	* Take a statement with "I want to <something>." and transform it into
	* "What would it mean to <something>?"
	* @param statement the user statement, assumed to contain "I want to"
	* @return the transformed statement
	*/
	private String transformIWantToStatement(String statement)
	{
	  /**
	   * trim the statement
	   * variable lastChar = last character in statement
	   * if lastChar is a period...
	   *        remove the last character from statement
	   */
	   statement = statement.trim();
	   char lastChar = statement.charAt(statement.length()-1);
	   if(lastChar == '.'){statement = statement.substring(0,statement.length()-1);}
	   /* 
	   Set new int psn to the result from...
	   *        findKeyword() method @param statement, goal is "I want to "*/
	   String goal = "I want to";
	   int psn = findKeyword(statement,goal);
	   //System.out.println("psn: " + psn);
	   /*
	   * Set new String restOfStatement to the rest of statement after the
	   * "I want to ".
	   */
	   String restOfStatement = statement.substring(psn+goal.length(), statement.length());
	   //System.out.println(restOfStatement);

	   return "What would it mean to" + restOfStatement + "?";
	}
	public void test_transformIWantToStatement()
	{
		String str = "I feel like I want to eat pizza right now.";
		String ret = transformIWantToStatement(str);
		System.out.println(ret);
	}

	 /**
	* Take a statement with "you <something> me" and transform it into
	* "What makes you think that I <something> you?"
	* @param statement the user statement, assumed to contain "you" followed by "me"
	* @return the transformed statement
	*/
	private String transformYouMeStatement(String statement)
	{
	  /**
	   * trim the statement
	   * Set new String lastChar to the last character in statement
	   * if lastChar is a period...
	   *        remove the period*/
	   statement = statement.trim();
	   char lastChar = statement.charAt(statement.length()-1);
	   if(lastChar == '.'){statement = statement.substring(0,statement.length()-1);}
	   /*
	   * Set new int psnOfYou to the result of findKeyword
	   *        @param statement and "you"
	   * Set new int psnOfMe to the result of findKeyword
	   *      @param statement, "me", and psnOfYou + 3
	   * Set new String restOfStatement to the rest of statement after "You" + 3,
	   * and before "me".*/
	   String you = "you";
	   int psnOfYou = findKeyword(statement,you);
	   String me = "me";
	   int psnOfMe = findKeyword(statement,me, psnOfYou+3);
	   String restOfStatement = statement.substring(psnOfYou+3,psnOfMe);
	   return "What makes you think that I" + restOfStatement + "you?";
	}
	public void test_transformYouMeStatement()
	{
		String str = "I feel like you should give that to me";
		String ret = transformYouMeStatement(str);
		System.out.println(ret);
	}
	
	private String transformIYouStatement(String statement)
	{
	   statement = statement.trim();
	   char lastChar = statement.charAt(statement.length()-1);
	   if(lastChar == '.'){statement = statement.substring(0,statement.length()-1);}
	   
	   String I = "I";
	   int psnOfI = findKeyword(statement,I);
	   
	   String you = "you";
	   int psnOfYou = findKeyword(statement,you, psnOfI+1);
	   String restOfStatement = statement.substring(psnOfI+2,psnOfYou);
	   return "Why do you " + restOfStatement + "me?";
	}
	public void test_transformIYouStatement()
	{
		String str = "I like you";
		String ret = transformIYouStatement(str);
		System.out.println(ret);
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
			}
			/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */
			if(psn + goal.length() < phrase.length())
			{
				after = Character.toString(phrase.charAt(psn + goal.length()));
			}
			/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn

				Otherwise, search for goal in phrase from psn + 1 forward */
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
