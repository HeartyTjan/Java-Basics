def display_question():

    print("""

			  Myer-Briggs Personality Test
		  =============================================
	""")

    name = input("Enter your name : ")
		
    entrovert_vs_introvert = [["A. Do you feel more energized by spending time with others ?", " B. By spending time alone ? ",''],
				  ["A. In a lively, busy environment?", "B. In a quiet, calm environment?",''],
				  ["A. do you prefer to talk things out ?", "B. Think things through quietly first ?",''],
			          ["A. Do you enjoy being the center of attention ?" , "B. prefer to stay behind the scenes ?",''],
				  ["A. Do you prefer engaging in group activities ?" , "B. solo activities ?",'']]


    sensing_vs_intitution = [["A. Focus on the concrete facts? ", "B. Think about the big picture and future possibilities?",''],
			       ["A. Do you trust information that comes from your direct experience ?" , "B. Insights and hunches? ",''],		
			       ["A. Focus on specific details and accuracy ? ", "B. Use abstract ideas and interpretations?",''],
			       ["A. Prefer learning practical, real-world applications?" , "B. Theoretical concepts and new ideas?",''],
			       ["A. When recalling past experiences, do you remember the exact facts and details?"  ,"B. Focus on the general feeling or idea?",'']]


    thinking_vs_feeling = [["A. Logical reasoning and objectivity?" , "B. How the decision will affect others emotionally?",''],
			     ["A. In conflicts, do you focus on the issue and finding the solution?" , "B. on maintaining harmony and considering everyone's feelings?",''],
			     ["A. Do you evaluate success by achieving specific goals and results?", "B. Building good relationships and cooperation?",''],
			     ["A. Would you describe yourself as more firm and direct when discussing issues? ", "B. More empathetic and considerate of others' emotions?",''],
			     ["A. Do you prefer to tackle problems with a focus on efficiency?" , "B. To make sure everyone is comfortable and involved?",'']]

    judging_vs_perceptive = [["A. Having a clear plan and schedule?", "B. Being spontaneous and flexible with your time?",''],
			       [ "A. Do you, Like to finish it ahead of time?", "B. Work better under pressure closer to the deadline?",''],
			       ["A. Do you feel more comfortable, when things are decided and set in stone?", "B. When you can leave options open for later decisions?",''],
			       ["A. Do you, prefer organization, structure, and routine?", " B. Like flexibility, adapting to new things as they come?",''],
			       ["A. You stick to a plan and meet all deadlines?", "B. adjust and make progress as needed without strict guidelines?",'']]

	
    response = 0
    print("Kindly Choose A or B to respond to this following questions")

    try:
        
        for index in range(len(entrovert_vs_introvert)):

            while True:
        
                response = input(f"\n{index + 1}) {entrovert_vs_introvert[index][0]} or {entrovert_vs_introvert[index][1]}: ").lower().strip()
                response = response[0]

                if response != 'a' and response != 'b':
                    print("Enter a valid response. Choose A or B")
                else : 
                    
                    if response == 'a':
                        entrovert_vs_introvert[index][2] += 'a'	
                        break
                                
                    elif response == 'b':
                        entrovert_vs_introvert[index][2] += 'b'
                        break
            
        for index in range(len(sensing_vs_intitution)):

            while True:
        
                response = input(f"\n{index + 6}) {sensing_vs_intitution[index][0]} or {sensing_vs_intitution[index][1]}: ").lower().strip()

                response = response[0]

                if response != 'a' and response != 'b':
                    print("Enter a valid response. Choose A or B")
                else : 
                    
                    if response == 'a':
                        sensing_vs_intitution[index][2] += 'a'	
                        break
                                
                    elif response == 'b':
                        sensing_vs_intitution[index][2] += 'b'
                        break
            
        for index in range(len(thinking_vs_feeling)):

            while True:
        
                response = input(f"{index + 11}) {thinking_vs_feeling[index][0]} or {thinking_vs_feeling[index][1]}: ").lower().strip()

                response = response[0]

                if response != 'a' and response != 'b':
                    print("Enter a valid response. Choose A or B")
                else : 
                    
                    if response == 'a':
                        thinking_vs_feeling[index][2] += 'a'	
                        break
                                
                    elif response == 'b':
                        thinking_vs_feeling[index][2] += 'b'
                        break

        for index in range(len(judging_vs_perceptive)):

            while True:
        
                response = input(f"{index + 16}) {judging_vs_perceptive[index][0]} or {judging_vs_perceptive[index][1]}: ").lower().strip()

                response = response[0]

                if response != 'a' and response != 'b':
                    print("Enter a valid response. Choose A or B")
                else : 
                    
                    if response == 'a':
                        judging_vs_perceptive[index][2] += 'a'	
                        break
                                
                    elif response == 'b':
                        judging_vs_perceptive[index][2] += 'b'
                        break

        print(f"\nHello {name}, you selected this responses below\n")

        display_responses(entrovert_vs_introvert,sensing_vs_intitution,thinking_vs_feeling,judging_vs_perceptive)
        
    except:
        raise ValueError("Invalid Input")

def display_responses(entrovert_vs_introvert,sensing_vs_intitution,thinking_vs_feeling,judging_vs_perceptive):
	personality = ""
	acount = bcount = 0

	for index in range(5):
		
		if entrovert_vs_introvert[index][2] == 'a':
			print(entrovert_vs_introvert[index][0])
			acount +=1
			print()
			
		else:
			print(entrovert_vs_introvert[index][1])
			bcount +=1
			print()
		
	if acount > bcount :
		personality += 'E'

	else :
		personality += 'I'
 
	print(f"Number of A is : {acount}")
	print(f"Number of B is : {bcount}\n")

	acount = bcount = 0	
	for index in range(5):

		if sensing_vs_intitution[index][2] == 'a':
			print(sensing_vs_intitution[index][0])
			acount += 1
			print()
		else:
			print(sensing_vs_intitution[index][1])
			bcount += 1
			print()

			
	if acount > bcount :
		personality += 'S'

	else :
		personality += 'N'

	print(f"Number of A is : {acount}")
	print(f"Number of B is : {bcount}\n")

	acount = bcount = 0	
	for index in range(5):

		if thinking_vs_feeling[index][2] == 'a':
			print(thinking_vs_feeling[index][0])
			acount += 1
			print()
		else:
			print(thinking_vs_feeling[index][1])
			bcount += 1
			print()

			
	if acount > bcount :
		personality += 'T'

	else :
		personality += 'F'

	print(f"Number of A is : {acount}")
	print(f"Number of B is : {bcount}\n")

	acount = bcount = 0	
	for index in range(5):

		if judging_vs_perceptive[index][2] == 'a':
			print(judging_vs_perceptive[index][0])
			acount += 1
			print()
		else:
			print(judging_vs_perceptive[index][1])
			bcount += 1
			print()
			
	if acount > bcount :
		personality += 'J'

	else :
		personality += 'P'

	print(f"Number of A is : {acount}")
	print(f"Number of B is : {bcount}\n")


	print(f"Your personality Trait is : {personality}")
	personality_details()
	
			
def personality_details():

	print("""

		           The questions asked above was based on this criteria below:
	     ============================================================================================

			1. Extraversion (E) or Introversion (I) : How do you focus your energy?

			2. Sensing (S) or Intuition (N) : How do you process information?

			3. Thinking (T) or Feeling (F) : How do you make decisions?

			4. Judging (J) or Perceiving (P) : How do you approach the outside world?

	      Each personality type consists of a combination of these preferences, resulting in 16 distinct types.
	    ==========================================================================================================

		""")

	print("""
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

	""")

	option = 1
	while(option != 0):
        
		option = int(input("Pick your personality trait: "))

		match (option):

			


            		case 1 : print("""

                            ESTP (The Entrepreneur)

                    Traits: Energetic, outgoing, spontaneous, and action-oriented.

                    Strengths: Great in fast-paced environments, love problem-solving, confident decision-makers.

                    Weaknesses: May act impulsively, avoid structure, can be risk-prone.
            
                    Famous Examples: Donald Trump, Madonna.
                        

                    """)

            		case 2 : print("""

                            ESFP (The Performer)

                    Traits: Enthusiastic, spontaneous, and playful.

                    Strengths: Great at bringing people together, love life and new experiences, charismatic.

                    Weaknesses: Can struggle with long-term planning, avoid serious situations, easily bored.

                    Famous Examples: Elvis Presley, Marilyn Monroe.
                    

                    """)


            		case 3 : print("""

                             ENFP (The Campaigner)

                    Traits: Curious, enthusiastic, and imaginative.

                    Strengths: Strong communication skills, great at inspiring others, open-minded and passionate.

                    Weaknesses: Can be scattered, struggle with focus, may overcommit.

                    Famous Examples: Robin Williams, Walt Disneye.
                

                    """)

            		case 4 : print("""

                            ENTP (The Debater)

                    Traits: Witty, charismatic, and loves intellectual challenges.

                    Strengths: Quick thinkers, love exploring new ideas, innovative and energetic.

                    Weaknesses: Can be argumentative, easily bored with routine, may lack follow-through.

                    Famous Examples: Thomas Edison, Mark Twain.
                    

                    """)

            		case 5 : print("""


                            ESTJ (The Executive)

                    Traits: Organized, practical, and strong leaders.

                    Strengths: Natural leaders, value efficiency, excellent at managing people and resources.

                    Weaknesses: Can be rigid, overly focused on rules, may seem inflexible in disagreements.

                    Famous Examples: Michelle Obama, Margaret Thatcher.
                    

                    """)

            		case 6 : print("""

                            ESFJ (The Consul)

                    Traits: Warm, caring, sociable, and responsible.

                    Strengths: Great at building strong relationships, dependable, love helping others.

                    Weaknesses: Can be people-pleasers, struggle with conflict, can be overly sensitive to criticism.

                    Famous Examples: Taylor Swift, Bill Clinton.
                    

                    """)


            		case 7 : print("""

                             ENFJ (The Protagonist)

                    Traits: Charismatic, empathetic, and natural leaders.

                    Strengths: Strong communicators, inspiring, organized, and great at bringing out the best in others.

                    Weaknesses: Can be overly idealistic, may take on too much, prone to burnout.

                    Famous Examples: Oprah Winfrey, Barack Obama.
                        
                    

                    """)

            		case 8 : print("""

                            ENTJ (The Commander)

                    Traits: Confident, determined, and strategic leaders.

                    Strengths: Great at leading organizations, visionary, excellent at planning and decision-making.

                    Weaknesses: Can be overly dominant, impatient, and struggle with emotions.

                    Famous Examples: Steve Jobs, Franklin D. Roosevelt.
                        
                    

                    """)

            		case 9 : print("""

                            INTP (The Thinker)

                    Traits: Analytical, original, philosophical, and highly intellectual.

                    Strengths: Great at analyzing abstract concepts, independent thinkers, logical problem solvers.

                    Weaknesses: Can be socially reserved, struggle with practical matters, may seem detached.	

                    Famous Examples: Albert Einstein, Isaac Newton.
                    

                    """)

            		case 10 : print("""

                            INFP (The Mediator)

                    Traits: Idealistic, empathetic, and introspective.

                    Strengths: Strong moral compass, highly creative, value authenticity, strong empathy.

                    Weaknesses:Can be overly idealistic, indecisive, prone to overthinking.

                    Famous Examples: William Shakespeare, J.K. Rowling.
                        
                    

                    """)


            		case 11 : print("""

                                
                            ISFP (The Artist)

                    Traits: Sensitive, spontaneous, quiet, and artistic.

                    Strengths: Live in the moment, value harmony, love aesthetics and creative expression.

                    Weaknesses: May be overly sensitive to criticism, can avoid long-term planning.

                    Famous Examples: Bob Dylan, Marilyn Monroe.
                    

                    """)

            		case 12 : print("""

                            ISTP (The Virtuoso)

                    Traits: Adventurous, practical, and curious with a love for hands-on work.

                    Strengths: Good at solving problems on the fly, love learning by doing, calm under pressure.

                    Weaknesses: May be risk-takers, struggle with planning, and avoid emotional conversations.

                    Famous Examples:Steve Jobs, Bruce Lee.
                        
                    

                    """)

            		case 13 : print("""

                            INTJ (The Architect)

                    Traits: Strategic, logical, independent, and highly analytical.

                    Strengths: Visionary, excellent problem solvers, innovative, strong-willed.

                    Weaknesses: Can be overly critical, emotionally distant, may struggle with teamwork.

                    Famous Examples: Elon Musk, Friedrich Nietzsche.
                        
                    

                    """)

            		case 14 : print("""

                            INFJ (The Advocate)

                    Traits: Idealistic, insightful, principled, and creative.

                    Strengths: Deep sense of purpose, good at understanding people, strong values.

                    Weaknesses: Perfectionistic, can burn out from over-commitment, may struggle to express feelings.

                    Famous Examples: Martin Luther King Jr., Nelson Mandela.
                    

                    """)

            		case 15 : print("""

                            ISFJ (The Protector)

                    Traits: Loyal, kind, meticulous, and nurturing.

                    Strengths: Compassionate, excellent memory, focus on others' needs, committed.

                    Weaknesses: Can be overly selfless, avoid conflict, may be resistant to change.

                    Famous Examples: Mother Teresa, Queen Elizabeth II.
                    

                    """)

            		case 16 : print("""

                            ISTJ (The Inspector)

                    Traits: Responsible, organized, practical, and dependable.

                    Strengths: Excellent planners, value tradition, focus on facts, great at following procedures.

                    Weaknesses: Can be rigid, struggle with change, and may not easily express emotions.

                    Famous Examples: Angela Merkel, George Washington.
                    

                    """)
	
            		case _ : print("Enter a valid option")

		

		
	




	
display_question()