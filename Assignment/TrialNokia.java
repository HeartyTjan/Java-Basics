import java.util.Scanner;

public class TrialNokia{

	public static void main(String... tijani){

	boolean valid = true;
	

	Scanner keyboardInto = new Scanner(System.in);

	while ( valid = true) {

	String functionMenu = """
		
		Welcome to Nokia Phone 3310
	
		Please select the options below to proceed:
		..........................................

		1 --> Phone book
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
		0 --> For exit
		
		................................. ........

		""";
		
		System.out.print (functionMenu);

		System.out.print("Enter preferred option : ");
		int userOption = keyboardInto.nextInt();
		
	
		switch (userOption) {
		
			
	
		    case 1 : while ( valid = true){ String phoneBookMenu =  """

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
					9 --> Speed dials
					10 --> Voice tags
					0 --> Back to Main menu
				.............................
					""";
			 	System.out.print(phoneBookMenu); valid = false;
				

				
			   System.out.print("Enter preferred option : ");
			   int phoneBook = keyboardInto.nextInt();

				
			   switch (phoneBook) {

				case 1 : System.out.print("Search");  break;
				case 2 : System.out.print("Service Nos.");  break;
				case 3 : System.out.print("Add name");  break;
				case 4 : System.out.print("Erase");  break;
				case 5 : System.out.print("Edit");  break;
				case 6 : System.out.print("Assign tone");  break;
				case 7 : System.out.print("Send b'card"); break;
				case 8 : while ( valid = true) {System.out.print("""

							Options
					...................................
						1 --> Type of view
						2 --> Memory status
						3 --> Back to previous menu
					...................................
					    """
				); 
					
						System.out.print("Enter preferred option : ");
						int options = keyboardInto.nextInt();
							while ( valid = true){
						 switch (options) {

							case 1 : System.out.print("Type of view"); break;
							case 2 : System.out.print("Memory Status"); break;
							case 3 : System.out.print(phoneBookMenu); break; 

								 
						}break;
							
					}break; 
						//if (options == 3){break;}
					}break;
				case 9 : System.out.print("Speed dials");  break;
				case 10 : System.out.print("Voice tags"); break;

				case 0 : System.out.print(functionMenu); valid = true; break;
	} break;
		} break;
					
		case 2 : String messageMenu =  """

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
					0 --> Back to Main menu

				
				.............................
					""";
				System.out.print (messageMenu);

				System.out.print("Enter preferred option : ");
				int messages = keyboardInto.nextInt();

				switch (messages) {

					case 1 : System.out.print("Write Messaage");break;
					case 2 : System.out.print("Inbox.");break;
					case 3 : System.out.print("Outbox");break;
					case 4 : System.out.print("Picture Message");break;
					case 5 : System.out.print("Template");break;
					case 6 : System.out.print("Smileys");break;
					case 7 : String MessageSettingMenu = """

							Message Settings
						...................................
							1 --> Set 1
							2 --> Common
							3 --> Back to previous Menu
						...................................
							""";
						   System.out.print(MessageSettingMenu);  
           
                                   		System.out.print("Enter preferred option : ");
						int set = keyboardInto.nextInt();

						switch (set) { 

							case 1 : System.out.print("""

								     Set 1
							..................................
							  	1 --> Message Centre number								
								2 --> Messages sent as
							  	3 --> Message validity
								4 --> Back to previous Menu 
							...................................
							     	"""
						);

							System.out.print("Enter preferred option : ");
							int setOption = keyboardInto.nextInt();
						
							switch (setOption) {

						    		case 1 : System.out.print("Message Centre number");break;
						    		case 2 : System.out.print("Message Sent As");break;
						    		case 3 : System.out.print("Message Validity");break;
								case 4 : System.out.print(MessageSettingMenu);break;

						}break;
				

						
							case 2 : System.out.print("""

								    	Common
								..................................
							   	1 --> Delivery reports
							  	2 --> Reply via same centre		
							   	3 --> Character support	
								4 --> Back to the previous Menu		
								..................................
							   	"""
						    );
							System.out.print("Enter preferred option : ");
							int common = keyboardInto.nextInt();
						
							switch (common) {

						    		case 1 : System.out.print("Delivery reports");break;
						    		case 2 : System.out.print("Reply via same centre");break;
						    		case 3 : System.out.print("Character support");break;
								case 4 : System.out.print(MessageSettingMenu);break;

							}break;
							
							case 3 : System.out.print(messageMenu);break;
												
		                      } break;
							


					case 8 : System.out.print("Info Service");break;
					case 9 : System.out.print("Voice Mailbox Number");break;
					case 10 : System.out.print("Service Command Editor");break;
					case 0 : System.out.print(functionMenu); break;


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
					0 --> Back to Main menu

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

							case 7 : String callCostSettingsMenu = """

									Call cost settings
								....................................
									1 --> Call cost limit	
									2 --> Show costs in
									3 --> Back to previous menu	
								....................................
						   		   """;
							System.out.print(callCostSettingsMenu);

							System.out.print("Enter preferred option : ");
							int callCostSettings = keyboardInto.nextInt();

							switch (callCostSettings) {

								case 1 : System.out.print("Call Cost Limit");break;
								case 2 : System.out.print("Show Cost in");break;
								case 3 : System.out.print(callCostSettingsMenu);break;

						} break;
								
							case 8 : System.out.print("Prepaid credit");break;
							case 0 : System.out.print(functionMenu); break;
	
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
					0 --> Back to Main menu

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
					case 0 : System.out.print(functionMenu); break;


			}break;

		case 6 :  String settingMenu = """

					 Settings
			  ............................................
				 	
				1 --> Call settings
				2 --> Phone settings
				3 --> Security settings
				4 --> Restore factory settings
				0 --> Back to Main menu

			  .............................................
			    """;
				System.out.print(settingMenu);
			
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
						7 --> Back to previous menu

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
					case 7 : System.out.print(settingMenu);  break;

				} break; 

						
					case 2 : String phoneSettingMenu = """

							Phone Settings
					..........................................
						1 --> Language
						2 --> Cell info display
						3 --> Welcome note
						4 --> Network selection
						5 --> Lights 
						6 --> Confirm sim service actions
						7 --> Back to previous menu
					...........................................
					  """;
				   	System.out.print(phoneSettingMenu);
					
					System.out.print("Enter preferred option : ");
					int phoneSettings = keyboardInto.nextInt();

					switch (phoneSettings) {

					case 1 : System.out.printf("Language %n");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int language = keyboardInto.nextInt();
						  if ( language == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;

					case 2 : System.out.printf("Cell info display%n");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int cellInfo = keyboardInto.nextInt();
						  if ( cellInfo == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;

					case 3 : System.out.printf("Welcome note%n");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int welcome = keyboardInto.nextInt();
						  if ( welcome == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;

					case 4 : System.out.printf("Network selection%n");
						 System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int networkSelect = keyboardInto.nextInt();
						  if ( networkSelect == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;
	
					case 5 : System.out.printf("Lights%n");
						 System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int light = keyboardInto.nextInt();
						  if ( light == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;

					case 6 : System.out.printf("Confirm sim service actions%n");
						 System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int simService = keyboardInto.nextInt();
						  if (simService == 1) {System.out.printf("%n%s",phoneSettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;
	
		
					case 7 : System.out.print(settingMenu);  break;

				} break; 


					case 3 : String securitySettingMenu = """

						Security Settings
					..................................
						1 --> Pin code request
						2 --> Call barring service
						3 --> Fixed dialing
						4 --> Closed user group
						5 --> Phone security 
						6 --> Change access codes
						7 --> Back to previous menu

					..................................
					  """;
				    System.out.print(securitySettingMenu); 
					
					System.out.print("Enter preferred option : ");
					int securitySettings = keyboardInto.nextInt();

					switch (securitySettings) {

					case 1 : System.out.printf("Pin code request%n");						  
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int pinCode = keyboardInto.nextInt();
						  if ( pinCode == 1) {System.out.printf("%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;

					case 2 : System.out.print("Call barring service");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int callBarring = keyboardInto.nextInt();
						  if ( callBarring == 1) {System.out.printf("%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;


					case 3 : System.out.print("Fixed dialing");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int fixedDailing = keyboardInto.nextInt();
						  if ( fixedDailing == 1) {System.out.printf("%n%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 4 : System.out.print("Closed user group");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int userGroup = keyboardInto.nextInt();
						  if ( userGroup == 1) {System.out.printf("%n%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 5 : System.out.print("Phone security");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int phoneSecurity = keyboardInto.nextInt();
						  if ( phoneSecurity == 1) {System.out.printf("%n%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 6 : System.out.print("Change access codes");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int acessCode = keyboardInto.nextInt();
						  if ( acessCode == 1) {System.out.printf("%n%n%s", securitySettingMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 7 : System.out.print(settingMenu);  break;

				} break; 
	
					case 4 : System.out.printf("Restore factory settings %n");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int restoreFactory = keyboardInto.nextInt();
						  if ( restoreFactory == 1) {System.out.printf("%n%s",settingMenu);}
						  else{System.out.printf("%n%s", functionMenu);}break;
						  
						  
					case 0 : System.out.print(functionMenu);  break;

					
		  }break;

		case 7 :  System.out.print("Call divert"); 
			  System.out.printf("%nEnter 0 for Main menu : ");
			   int callDivert = keyboardInto.nextInt();
			   if ( callDivert == 0) {System.out.printf("%n%s", functionMenu);}break;
				
		case 8 :  System.out.print("Games"); 
			  System.out.printf("%nEnter 0 for Main menu : ");
			   int games = keyboardInto.nextInt();
			   if ( games == 0) {System.out.printf("%n%s", functionMenu);}break;

		case 9 :  System.out.print("Calculator"); 
			  System.out.printf("%nEnter 0 for Main menu : ");
			   int calculator = keyboardInto.nextInt();
			   if ( calculator == 0) {System.out.printf("%n%s", functionMenu);}break;

		case 10 :  System.out.print("Reminder"); 
			  System.out.printf("%nEnter 0 for Main menu : ");
			   int reminder = keyboardInto.nextInt();
			   if ( reminder == 0) {System.out.printf("%n%s", functionMenu);}break;

		case 11 :  String clockMenu = """
					  
					 	Clock	
				...........................................
					1 --> Alarm clock
					2 --> Clock settings
					3 --> Date setting
					4 --> Stopwatch
					5 --> Countdown timer
					6 --> Auto update of date and time
					0 --> For main menu
				............................................
					  """;
				System.out.print(clockMenu); 

				System.out.print("Enter preferred option : ");
				int clock = keyboardInto.nextInt();

				switch (clock) {

					case 1 : System.out.print("Alarm clock");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int alarm = keyboardInto.nextInt();
						  if ( alarm == 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 2 : System.out.print("Clock settings");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int clockSetting = keyboardInto.nextInt();
						  if ( clockSetting== 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 3 : System.out.print("Date setting");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int dateSetting = keyboardInto.nextInt();
						  if ( dateSetting == 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;

					case 4 : System.out.print("Stopwatch");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int stopWatch = keyboardInto.nextInt();
						  if ( stopWatch == 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;	
		
					case 5 : System.out.print("Countdown timer");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int timer = keyboardInto.nextInt();
						  if ( timer == 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;	
		
					case 6 : System.out.print("Auto update of date and time");
						  System.out.printf("%nEnter 0 for Main menu or 1 for Previous Menu  : ");
						  int dateUpdate = keyboardInto.nextInt();
						  if ( dateUpdate == 1) {System.out.printf("%n%n%s", clockMenu);}
						  else{System.out.printf("%n%n%s", functionMenu);}break;
	
					case 0 : System.out.print(functionMenu);  break;
	
		
					} break; 

		case 12 :  System.out.print("Profile"); 
			  System.out.printf("%nEnter 0 for Main menu : ");
			   int profile = keyboardInto.nextInt();
			   if ( profile == 0) {System.out.printf("%n%s", functionMenu);}break;

		case 13 :  System.out.printf("Sim services%n"); 
			    System.out.printf("%nEnter 0 for Main menu : ");
			   int simService = keyboardInto.nextInt();
			   if ( simService == 0) {System.out.printf("%n%s", functionMenu);}break;
	
		case 0 :  break;
		
		default :  System.out.print("Invalid input, Enter preferred number: "); break;

 			} 
			if (userOption == 0){break;}		
		}		
	 
	}

}


