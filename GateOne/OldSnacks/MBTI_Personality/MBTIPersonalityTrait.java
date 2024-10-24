import java.util.Scanner;
public class MBTIPersonalityTrait{

		int [] [] firstRowResponses = new int [5] [2];
		int [] [] secondRowResponses = new int [5] [2];
		int [] [] thirdRowResponses = new int [5] [2];
		int [] [] fourthRowResponses = new int [5] [2];
	
	static Scanner receiver = new Scanner(System.in);

	public void displayQuestion(String name){

	
		String [] [] entrovertVsiNtrovert = { {"A. Do you feel more energized by spending time with others ?", " B. By spending time alone ? "},
				      	 	   {"A. In a lively, busy environment?", "B. In a quiet, calm environment?"},
						   {"A. do you prefer to talk things out ?", "B. Think things through quietly first ?"},
						   {"A. Do you enjoy being the center of attention ?" , "B. prefer to stay behind the scenes ?"},
						   {"A. Do you prefer engaging in group activities ?" , "B. solo activities ?"}};


		String [][] sensingVsIntitution = {{"A. Focus on the concrete facts? ", "B. Think about the big picture and future possibilities?"},
						{"A. Do you trust information that comes from your direct experience ?" , "B. Insights and hunches? "},		
						{"A. Focus on specific details and accuracy ? ", "B. Use abstract ideas and interpretations?"},
						{"A. Prefer learning practical, real-world applications?" , "B. Theoretical concepts and new ideas?"},
						{"A. When recalling past experiences, do you remember the exact facts and details?"  ,"B. Focus on the general feeling or idea?"}};
					

		String [][] thinkingVsFeeling = {{"A. Logical reasoning and objectivity?" , "B. How the decision will affect others emotionally?"},
					        {"A. In conflicts, do you focus on the issue and finding the solution?" , "B. on maintaining harmony and considering everyone's feelings?"},
						{"A. Do you evaluate success by achieving specific goals and results?", "B. Building good relationships and cooperation?"},
						{"A. Would you describe yourself as more firm and direct when discussing issues? ", "B. More empathetic and considerate of others' emotions?"},
						{"A. Do you prefer to tackle problems with a focus on efficiency?" , "B. To make sure everyone is comfortable and involved?"}};

		String [][] judgingVsPerceptive = {{"A. Having a clear plan and schedule?", "B. Being spontaneous and flexible with your time?"},
						 { "A. Do you, Like to finish it ahead of time?", "B. Work better under pressure closer to the deadline?"},
						  {"A. Do you feel more comfortable, when things are decided and set in stone?", "B. When you can leave options open for later decisions?"},
						  {"A. Do you, prefer organization, structure, and routine?", " B. Like flexibility, adapting to new things as they come?"},
						  {"A. You stick to a plan and meet all deadlines?", "B. adjust and make progress as needed without strict guidelines?"}};

		
		char responses = 0;
		
		
		System.out.println("Kindly Choose A or B to respond to this following questions");
		int questionCounter = 1;
		for(int count = 0; count < entrovertVsiNtrovert.length; count++){
				
				do {

					System.out.printf("%n%d: %s or %s: ", questionCounter, entrovertVsiNtrovert[count][0], entrovertVsiNtrovert[count][1]);

					responses = receiver.next().toLowerCase().charAt(0);

					if(responses != 'a' && responses != 'b'){

						System.out.print("Enter a valid response. Choose A or B");
					}

				} while(responses != 'a' && responses != 'b');
				
				if (responses == 'a') firstRowResponses[count][0] += 1;
				
				else firstRowResponses[count][1] += 1;
		
				questionCounter++;
			
			
		}
		
		
		for(int count = 0; count < sensingVsIntitution.length; count++){

				do{
					System.out.printf("%n%d: %s or %s : ", questionCounter,sensingVsIntitution[count][0],sensingVsIntitution[count][1]);
					//System.out.print(sensingVsIntitution[count][counter]);

					responses = receiver.next().toLowerCase().charAt(0);

					if(responses != 'a' && responses != 'b') System.out.print("Enter a valid response. Choose A or B");
				
				}while(responses != 'a' && responses != 'b');


				if (responses == 'a')secondRowResponses[count][0]++;
				else secondRowResponses[count][1]++;
				
				questionCounter++;
			
			
		}

		for(int count = 0; count < thinkingVsFeeling.length; count++){

			

				do{
			
					System.out.printf("%n%d: %s or %s: ", questionCounter,thinkingVsFeeling[count][0], thinkingVsFeeling[count][1]);
					
					responses = receiver.next().toLowerCase().charAt(0);

					if(responses != 'a' && responses != 'b')System.out.print("Enter a valid response. Choose A or B");

				} while(responses != 'a' && responses != 'b');
	
				if (responses == 'a') thirdRowResponses[count][0]++;
				else thirdRowResponses[count][1]++;

				questionCounter++;
		
			
		}

		for(int count = 0; count < judgingVsPerceptive.length; count++){
		
	
				do{
					System.out.printf("%n%d: %s or %s : ", questionCounter, judgingVsPerceptive[count][0],judgingVsPerceptive[count][1]);
					
					responses = receiver.next().toLowerCase().charAt(0);

					if(responses != 'a' && responses != 'b')System.out.print("Enter a valid response. Choose A or B");

				} while(responses != 'a' && responses != 'b');
	
				if (responses == 'a') fourthRowResponses[count][0]++;
				else fourthRowResponses[count][1]++;

				questionCounter++;
		
			
		}

		System.out.printf("%nHello %s you selected%n%n%n", name);

		output(entrovertVsiNtrovert,sensingVsIntitution,thinkingVsFeeling,judgingVsPerceptive);

		displayPersonalityDetails();
		
	}

	public void output(String [][] entrovertVsiNtrovert, String [][] sensingVsIntitution,String [][] thinkingVsFeeling,String [][] judgingVsPerceptive){
		

		
		String personality = "";
		int firstCountA = 0, firstCountB = 0, secondCountA = 0,  secondCountB = 0, thirdCountA = 0,  thirdCountB = 0, fourthCountA = 0,  fourthCountB = 0;

		for(int count = 0; count < entrovertVsiNtrovert.length; count++){

			if (firstRowResponses[count][0] == 1 && firstRowResponses[count][1] == 0)System.out.printf("%s%n%n", entrovertVsiNtrovert[count][0]);
			else System.out.printf("%s%n%n", entrovertVsiNtrovert[count][1]);

		}

		for(int count = 0; count < firstRowResponses.length; count++){

			
			firstCountA += firstRowResponses[count][0];
			firstCountB += firstRowResponses[count][1];

		}

		System.out.printf("%nNumbers of A selected : %d%n", firstCountA);
		System.out.printf("%nNumbers of B selected : %d%n%n", firstCountB);

		if (firstCountA > firstCountB)personality += "E";
		else personality += "I";

		for(int count = 0; count < sensingVsIntitution.length; count++){

			if (secondRowResponses[count][0] == 1 && secondRowResponses[count][1] == 0)System.out.printf("%n%s%n%n", sensingVsIntitution[count][0]);
			else System.out.printf("%n%s%n%n", sensingVsIntitution[count][1]);


		}

		for(int count = 0; count < secondRowResponses.length; count++){

			
			secondCountA += secondRowResponses[count][0];
			secondCountB += secondRowResponses[count][1];

		}

		
		System.out.printf("%nNumbers of A selected : %d%n", secondCountA);
		System.out.printf("%nNumbers of B selected : %d%n%n",secondCountB);

		if (secondCountA > secondCountB)personality += "S";
		else personality += "N";

		for(int count = 0; count < thinkingVsFeeling.length; count++){

			if (thirdRowResponses[count][0] == 1 && thirdRowResponses[count][1] == 0)System.out.printf("%n%s%n", thinkingVsFeeling[count][0]);
			else System.out.printf("%n%s%n", thinkingVsFeeling[count][1]);


		}
		
		for(int count = 0; count < thirdRowResponses.length; count++){

			
			thirdCountA += thirdRowResponses[count][0];
			thirdCountB += thirdRowResponses[count][1];

		}

		
		System.out.printf("%nNumbers of A selected : %d%n", thirdCountA);
		System.out.printf("%nNumbers of B selected : %d%n%n", thirdCountB);

		if (thirdCountA > thirdCountB)personality += "T";
		else personality += "F";

		for(int count = 0; count < judgingVsPerceptive.length; count++){

			if (fourthRowResponses[count][0] == 1 && fourthRowResponses[count][1] == 0)System.out.printf("%n%s%n", judgingVsPerceptive[count][0]);
			else System.out.printf("%n%s%n", judgingVsPerceptive[count][1]);


		}

		for(int count = 0; count < fourthRowResponses.length; count++){

			
			fourthCountA += fourthRowResponses[count][0];
			fourthCountA += fourthRowResponses[count][1];

		}
			
		System.out.printf("%nNumbers of A selected : %d%n", fourthCountA);
		System.out.printf("%nNumbers of B selected : %d%n", fourthCountB);
		if (fourthCountA > fourthCountB)personality += "J";
		else personality += "P";

		System.out.printf("%nYour personality trait is : %s %n%n", personality);
		

	}

	public void displayPersonalityDetails(){


		System.out.print("""

			  The questions asked above was based on this criteria below:
		       ================================================================================================

			1. Extraversion (E) or Introversion (I) : How do you focus your energy?

			2. Sensing (S) or Intuition (N) : How do you process information?

			3. Thinking (T) or Feeling (F) : How do you make decisions?

			4. Judging (J) or Perceiving (P) : How do you approach the outside world?

			Each personality type consists of a combination of these preferences, resulting in 16 distinct types.
		     ==========================================================================================================

		""");

		System.out.print("""

			Now that you are aware of your personality trait.
			Choose your personality type and know more about your self.

			========================================
			
				
				1 --> ESTP (The Entrepreneur)
				2 --> ESFP (The Performer)
				3 --> ENFP (The Campaigner)
				4 --> ENTP (The Debater)
				5 --> ESTJ (The Executive)
				6 --> ESFJ (The Consul)
				7 --> ENFJ (The Protagonist)
				8 --> ENTJ (The Commander)
				9 --> INTP (The Thinker)
				10 --> INFP (The Mediator)
				11 --> ISFP (The Artist)
				12 --> ISTP (The Virtuoso)
				13 --> INTJ (The Architect)
				14 --> INFJ (The Advocate)
				15 --> ISFJ (The Protector)
				16 --> ISTJ (The Inspector)
				0 --> Quit

			============================================					
		""");
		
		int option = 1;

	    try{

		do{
			System.out.print("Pick a your personality type:");
			option = receiver.nextInt();
		
			
	
		     switch(option){


			    case 1 : System.out.print("""

							ESTP (The Entrepreneur)

					Traits: Energetic, outgoing, spontaneous, and action-oriented.

					Strengths: Great in fast-paced environments, love problem-solving, confident decision-makers.

					Weaknesses: May act impulsively, avoid structure, can be risk-prone.
			
					Famous Examples: Donald Trump, Madonna.
				

				""");break;

			case 2 : System.out.print("""

							ESFP (The Performer)

					Traits: Enthusiastic, spontaneous, and playful.

					Strengths: Great at bringing people together, love life and new experiences, charismatic.

					Weaknesses: Can struggle with long-term planning, avoid serious situations, easily bored.

					Famous Examples: Elvis Presley, Marilyn Monroe.
				

				""");break;


			case 3 : System.out.print("""

							 ENFP (The Campaigner)

					Traits: Curious, enthusiastic, and imaginative.

					Strengths: Strong communication skills, great at inspiring others, open-minded and passionate.

					Weaknesses: Can be scattered, struggle with focus, may overcommit.

					Famous Examples: Robin Williams, Walt Disneye.
				

				""");break;

			case 4 : System.out.print("""

							ENTP (The Debater)

					Traits: Witty, charismatic, and loves intellectual challenges.

					Strengths: Quick thinkers, love exploring new ideas, innovative and energetic.

					Weaknesses: Can be argumentative, easily bored with routine, may lack follow-through.

					Famous Examples: Thomas Edison, Mark Twain.
				

				""");break;

			case 5 : System.out.print("""


							ESTJ (The Executive)

					Traits: Organized, practical, and strong leaders.

					Strengths: Natural leaders, value efficiency, excellent at managing people and resources.

					Weaknesses: Can be rigid, overly focused on rules, may seem inflexible in disagreements.

					Famous Examples: Michelle Obama, Margaret Thatcher.
				

				""");break;

			case 6 : System.out.print("""

							ESFJ (The Consul)

					Traits: Warm, caring, sociable, and responsible.

					Strengths: Great at building strong relationships, dependable, love helping others.

					Weaknesses: Can be people-pleasers, struggle with conflict, can be overly sensitive to criticism.

					Famous Examples: Taylor Swift, Bill Clinton.
				

				""");break;


			case 7 : System.out.print("""

							 ENFJ (The Protagonist)

					Traits: Charismatic, empathetic, and natural leaders.

					Strengths: Strong communicators, inspiring, organized, and great at bringing out the best in others.

					Weaknesses: Can be overly idealistic, may take on too much, prone to burnout.

					Famous Examples: Oprah Winfrey, Barack Obama.
					
				

				""");break;

			case 8 : System.out.print("""

							ENTJ (The Commander)

					Traits: Confident, determined, and strategic leaders.

					Strengths: Great at leading organizations, visionary, excellent at planning and decision-making.

					Weaknesses: Can be overly dominant, impatient, and struggle with emotions.

					Famous Examples: Steve Jobs, Franklin D. Roosevelt.
					
				

				""");break;

			case 9 : System.out.print("""

							INTP (The Thinker)

					Traits: Analytical, original, philosophical, and highly intellectual.

					Strengths: Great at analyzing abstract concepts, independent thinkers, logical problem solvers.

					Weaknesses: Can be socially reserved, struggle with practical matters, may seem detached.	

					Famous Examples: Albert Einstein, Isaac Newton.
				

				""");break;

			case 10 : System.out.print("""

							INFP (The Mediator)

					Traits: Idealistic, empathetic, and introspective.

					Strengths: Strong moral compass, highly creative, value authenticity, strong empathy.

					Weaknesses:Can be overly idealistic, indecisive, prone to overthinking.

					Famous Examples: William Shakespeare, J.K. Rowling.
					
				

				""");break;


			case 11 : System.out.print("""

							
							ISFP (The Artist)

					Traits: Sensitive, spontaneous, quiet, and artistic.

					Strengths: Live in the moment, value harmony, love aesthetics and creative expression.

					Weaknesses: May be overly sensitive to criticism, can avoid long-term planning.

					Famous Examples: Bob Dylan, Marilyn Monroe.
				

				""");break;

			case 12 : System.out.print("""

							ISTP (The Virtuoso)

					Traits: Adventurous, practical, and curious with a love for hands-on work.

					Strengths: Good at solving problems on the fly, love learning by doing, calm under pressure.

					Weaknesses: May be risk-takers, struggle with planning, and avoid emotional conversations.

					Famous Examples:Steve Jobs, Bruce Lee.
					
				

				""");break;

			case 13 : System.out.print("""

							INTJ (The Architect)

					Traits: Strategic, logical, independent, and highly analytical.

					Strengths: Visionary, excellent problem solvers, innovative, strong-willed.

					Weaknesses: Can be overly critical, emotionally distant, may struggle with teamwork.

					Famous Examples: Elon Musk, Friedrich Nietzsche.
					
				

				""");break;
	
			case 14 : System.out.print("""

							INFJ (The Advocate)

					Traits: Idealistic, insightful, principled, and creative.

					Strengths: Deep sense of purpose, good at understanding people, strong values.

					Weaknesses: Perfectionistic, can burn out from over-commitment, may struggle to express feelings.

					Famous Examples: Martin Luther King Jr., Nelson Mandela.
				

				""");break;

			case 15 : System.out.print("""

							ISFJ (The Protector)

					Traits: Loyal, kind, meticulous, and nurturing.

					Strengths: Compassionate, excellent memory, focus on others' needs, committed.

					Weaknesses: Can be overly selfless, avoid conflict, may be resistant to change.

					Famous Examples: Mother Teresa, Queen Elizabeth II.
				

				""");break;

			case 16 : System.out.print("""

							ISTJ (The Inspector)

					Traits: Responsible, organized, practical, and dependable.

					Strengths: Excellent planners, value tradition, focus on facts, great at following procedures.

					Weaknesses: Can be rigid, struggle with change, and may not easily express emotions.

					Famous Examples: Angela Merkel, George Washington.
				

				""");break;

			default : System.out.println("Enter a valid option");break;

			case 0 : break;

		
	
			
		 }

	    }while(option >= 1 && option <= 16 != true);

	} catch(Exception e){

		System.out.print("Expected a digit value. Try again");
	}	

	}

} 