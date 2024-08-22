import java.util.Scanner;

public class NokiaMenu{

	public static void main(String... tijani){

	Scanner keyboardInto = new Scanner(System.in);


	String functions = """
		
		Welcome to Nokia Phone 3310
	
		Please select the options below to proceed:
		..........................................

		1 --> Phone Book
		2 --> Message
		3 --> Chat
		4 --> Call Register 
		5 --> Tones	
		6 --> Settings
		7 --> Call Divert
		8 --> Games
		9 --> Calculator
		10 --> Reminders
		11 --> Clock
		12 --> Profiles
		13 --> Sim Services
		
		...........................................

		""";

		System.out.print (functions);

		System.out.print("Enter preferred option : ");
		int userOption = keyboardInto.nextInt();
	
		switch (userOption) {
	
		    case 1 : System.out.print ( """

					Phone Book
				.............................
				 	
					1 --> Search 
					2 --> Service Nos.
					3 --> Add name
					4 --> Erase
					5 --> Edit	
					6 --> Assign tone
					7 --> Send b'card
					8 --> Options 
				
				.............................
					"""
		);

			System.out.print("Enter preferred option : ");
			int phoneBook = keyboardInto.nextInt();

			switch (phoneBook) {

				case 1 : System.out.print("Search");break;
				case 2 : System.out.print("Service Nos.");break;
				case 3 : System.out.print("Add name");break;
				case 4 : System.out.print("Erase");break;
				case 5 : System.out.print("Edit");break;
				case 6 : System.out.print("Assign tone");break;
				case 7 : System.out.print("Send b'card");break;
				case 8 : System.out.print("""

							Options
					...................................
						1 --> Type of view
						2 --> Memory status
					...................................
					    """
				); 

					System.out.print("Enter preferred option : ");
					int options = keyboardInto.nextInt();
						
					 switch (options) {

						case 1 : System.out.print("Type of view"); break;
						case 2 : System.out.print("Memory Status"); break;
					}break;


				default : System.out.print("Unknown Type !! - Try again");break;
		   } break;
	
		case 2 : System.out.print ( """

					Messages
				.............................
				 	
					1 --> Write messages
					2 --> inbox
					3 --> Outbox
					4 --> Picture messages
					5 --> Templates	
					6 --> Smileys
					7 --> Message settings
					8 --> Info service
					9 --> Voice mailbox number
					10 --> Service command editor

				
				.............................
					"""
			);
				System.out.print("Enter preferred option : ");
				int messages = keyboardInto.nextInt();

				switch (messages) {

					case 1 : System.out.print("Write Messaage");break;
					case 2 : System.out.print("Inbox.");break;
					case 3 : System.out.print("Outbox");break;
					case 4 : System.out.print("Picture Message");break;
					case 5 : System.out.print("Template");break;
					case 6 : System.out.print("Smileys");break;
					case 7 : System.out.print("""

							Message Settings
						...................................
							1 --> Set 1
							2 --> Common 
						...................................
							"""
					);                  
                                   		System.out.print("Enter preferred option : ");
						int set = keyboardInto.nextInt();

						switch (set) { 

							case 1 : System.out.print("""

								     Set 1
							..................................
							  	1 --> Message Centre number								
								2 --> Messages sent as
							  	3 --> Message validity
							...................................
							     	"""
						);

							System.out.print("Enter preferred option : ");
							int setOption = keyboardInto.nextInt();
						
							switch (setOption) {

						    		case 1 : System.out.print("Message Centre number");break;
						    		case 2 : System.out.print("Message Sent As");break;
						    		case 3 : System.out.print("Message Validity");break;
						}break;
				

						
							case 2 : System.out.print("""

								    	Common
								..................................
							   	1 --> Delivery reports
							  	2 --> Reply via same centre		
							   	3 --> Character support			
								..................................
							   	"""
						    );
							System.out.print("Enter preferred option : ");
							int common = keyboardInto.nextInt();
						
							switch (common) {

						    		case 1 : System.out.print("Delivery reports");break;
						    		case 2 : System.out.print("Reply via same centre");break;
						    		case 3 : System.out.print("Character support");break;
							}break;

												
		                      } break;

					case 8 : System.out.print("Info Service");break;
					case 9 : System.out.print("Voice Mailbox Number");break;
					case 10 : System.out.print("Service Command Editor");break;

					} break;

		case 3 : System.out.print ("Chat"); break;
				
		case 4 : System.out.print ( """

					   Call register 
				.............................
				 	
					1 --> Missed calls
					2 --> Received calls
					3 --> Dailed calls
					4 --> Erase recent call lists
					5 --> Show call durations	
					6 --> Show call costs
					7 --> Call cost settings
					8 --> Prepaid credit 
				
				.............................
				   """
			);
				System.out.print("Enter preferred option : ");
				int callRegister = keyboardInto.nextInt();

				switch (callRegister) {

					case 1 : System.out.print("Missed Calls");break;
					case 2 : System.out.print("Received calls");break;
					case 3 : System.out.print("Dailed calls");break;
					case 4 : System.out.print("Erase recent call lists");break;
					case 5 : System.out.print("""
							
							Show Call Duration
						..................................
							1 --> Last call duration
							2 --> All calls duration	
							3 --> Received calls duration
							4 --> Dailed calls duration	
							5 --> Clear timers
						..................................
						   	"""
					);
						System.out.print("Enter preferred option : ");
						int callDuration = keyboardInto.nextInt();

						switch (callDuration) {

							case 1 : System.out.print("Last call duration");break;
							case 2 : System.out.print("All calls duration");break;
							case 3 : System.out.print("Receivedcallsduration");break;
							case 4 : System.out.print("Dailed calls duration");break;
							case 5 : System.out.print("Clear timers");break;
							case 6 : System.out.print("""

									Show call cost
								..................................
									1 --> Last call cost	
									2 --> All call cost								
									3 --> Clear Counters
								..................................
						   			"""
						);
							System.out.print("Enter preferred option : ");
							int showCallCost = keyboardInto.nextInt();

							switch (showCallCost) {

								case 1 : System.out.print("Last Call Cost");break;
								case 2 : System.out.print("All Call Cost");break;
								case 3 : System.out.print("Clear Counter");
				
							} break; 
						}

							case 7 : System.out.print("""

									Call cost settings
								..................................
									1 --> Call cost limit	
									2 --> Show costs in	
								..................................
						   			"""
						);

							System.out.print("Enter preferred option : ");
							int callCostSettings = keyboardInto.nextInt();

							switch (callCostSettings) {

								case 1 : System.out.print("Call Cost Limit");break;
								case 2 : System.out.print("Show Cost in");break;
						} break;
								
							case 8 : System.out.print("Prepaid credit ");break;	
						}

		case 5 :  System.out.print("""

					   Tones
				.............................
				 	
					1 --> Ringing tone
					2 --> Ringing Volume
					3 --> Incoming call alert
					4 --> Composer
					5 --> Message alert tone	
					6 --> Keypad tones
					7 --> Warning and game tones
					8 --> Vibrating alert
					9 --> Screen saver
				..............................
				  """
			);
				System.out.print("Enter preferred option : ");
				int tones = keyboardInto.nextInt();

				switch (tones) {

					case 1 : System.out.print("Ringing tone");break;
					case 2 : System.out.print("Ringing Volume");break;
					case 3 : System.out.print("Incoming call alert");break;
					case 4 : System.out.print("Composer");break;
					case 5 : System.out.print("Message alert tone");break;
					case 6 : System.out.print("Keypad tones");break;
					case 7 : System.out.print("Warning and game tones");break;
					case 8 : System.out.print("Vibrating alert");break;
					case 9 : System.out.print("Screen saver");break;

			}break;

		case 6 :  System.out.print("""

					 Settings
			  ............................................
				 	
				1 --> Call settings
				2 --> Phone settings
				3 --> Security settings
				4 --> Restore factory settings
			  .............................................
			    """
			);
				System.out.print("Enter preferred option : ");
				int settings = keyboardInto.nextInt();

				switch (settings) {

					case 1 : System.out.print("""
					
						Call Settings
					..................................
						1 --> Automatic redial
						2 --> Speed dialing
						3 --> Call waiting options
						4 --> Own number sending
						5 --> Phone line in use 
						6 --> Automatic answer
					..................................
					  """
				);

					System.out.print("Enter preferred option : ");
					int callSettings = keyboardInto.nextInt();

					switch (callSettings) {

					case 1 : System.out.print("Automatic redial");break;
					case 2 : System.out.print("Speed dialing");break;
					case 3 : System.out.print("Call waiting options");
					case 4 : System.out.print("Own number sending");break;
					case 5 : System.out.print("Phone line in use ");break;
					case 6 : System.out.print("Automatic answer");break;

				} break; 

						
					case 2 : System.out.print("""

							Phone Settings
					..........................................
						1 --> Language
						2 --> Cell info display
						3 --> Welcome note
						4 --> Network selection
						5 --> Lights 
						6 --> Confirm sim service actions
					...........................................
					  """
				   );
					
					System.out.print("Enter preferred option : ");
					int phoneSettings = keyboardInto.nextInt();

					switch (phoneSettings) {

					case 1 : System.out.print("Language");break;
					case 2 : System.out.print("Cell info display");break;
					case 3 : System.out.print("Welcome note");
					case 4 : System.out.print("Network selection");break;
					case 5 : System.out.print("Lights");break;
					case 6 : System.out.print("Confirm sim service actions");break;

				} break; 


					case 3 : System.out.print("""

						Security Settings
					..................................
						1 --> Pin code request
						2 --> Call barring service
						3 --> Fixed dialing
						4 --> Closed user group
						5 --> Phone security 
						6 --> Change access codes
					..................................
					  """
				   ); 
					
					System.out.print("Enter preferred option : ");
					int securitySettings = keyboardInto.nextInt();

					switch (securitySettings) {

					case 1 : System.out.print("Pin code request");break;
					case 2 : System.out.print("Call barring service");break;
					case 3 : System.out.print("Fixed dialing");
					case 4 : System.out.print("Closed user group");break;
					case 5 : System.out.print("Phone security");break;
					case 6 : System.out.print("Change access codes");break;

				} break; 
	
					case 4 : System.out.print("Restore factory settings");break;
					
		  }break;

		case 7 :  System.out.print("Call divert"); break;
		case 8 :  System.out.print("Games"); break;
		case 9 :  System.out.print("Calculator"); break;
		case 10 :  System.out.print("Reminder"); break;
		case 11 :  System.out.print("""
					  
					 	Clock	
				...........................................
					1 --> Alarm clock
					2 --> Clock settings
					3 --> Date setting
					4 --> Stopwatch
					5 --> Countdown timer
					6 --> Auto update of date and time
				............................................
					  """
			); 
				System.out.print("Enter preferred option : ");s
				int clock = keyboardInto.nextInt();

				switch (clock) {

					case 1 : System.out.print("Alarm clock");break;
					case 2 : System.out.print("Clock settings");break;
					case 3 : System.out.print("Date setting");
					case 4 : System.out.print("Stopwatch");break;
					case 5 : System.out.print("Countdown timer");break;
					case 6 : System.out.print("Auto update of date and time");break;

				} break; 

		case 12 :  System.out.print("Profile"); break;
		case 13 :  System.out.print("Sim services"); break;
				
		}		
	 
	}

}


