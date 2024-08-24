
import java.util.Scanner;

public class NokiaMenu {

        private static int userChoice;
        private static Scanner keyboardInto = new Scanner(System.in);

        public static void main(String... args){

            displayMainMenu();

        }

        public static void displayMainMenu(){

        	System.out.printf("%7sWelcome to Nokia 3310%n"," ");
            	System.out.println("Please select the options below to proceed:");
            	System.out.println(".............................................");
            	System.out.println("1 --> Phone Book");
            	System.out.println("2 --> Message ");
            	System.out.println("3 --> Chat");
            	System.out.println("4 --> Call Register ");
            	System.out.println("5 --> Tones	");
           	System.out.println("6 --> Settings");
            	System.out.println("7 --> Call Divert");
            	System.out.println("8 --> Games");
            	System.out.println("9 --> Calculator");
            	System.out.println("10 --> Reminders ");
            	System.out.println("11 --> Clock");
            	System.out.println("12 --> Profiles");
            	System.out.println("13 --> Sim Services");
            	System.out.println("0 --> Quit");
            	System.out.println("...........................................");

            	System.out.print("Enter preferred option : ");
            	userChoice = keyboardInto.nextInt();

            	switch (userChoice) {
		
			case 0 :    break;
               	 	case 1 :    displayPhoneBookMenu();break;
			case 2 :    displayMessageMenu();break;
			case 3 :    System.out.print ("Chat"); break; 
			case 4 :    displayCallRegisterMenu();break;
			case 5 :    displayTonesMenu();break;
			case 6 :    displaySettingMenu();break;
			case 7 :    System.out.print("Call divert"); break;
			case 8 :    System.out.print("Games"); break;
			case 9 :    System.out.print("Calculator"); break;
			case 10 :   System.out.print("Reminder"); break;
			case 11 :   displayClockMenu();break;
			case 12 :   System.out.print("Profile"); break;
			case 13 :   System.out.printf("Sim services%n"); break;
			default :   System.out.println("Invalid option!!. Try again"); 
				     displayMainMenu(); break;


           	}    
    
        }

        public static void displayPhoneBookMenu(){

        	System.out.print ( """

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
				11 --> Main Menu
				
			.............................
			"""
            	); 
		
		System.out.print("Enter preferred option : ");
                int phoneBookMenu = keyboardInto.nextInt();

                switch (phoneBookMenu) {

                	case 1 : System.out.print("Search");  break;
                        case 2 : System.out.print("Service Nos.");  break;
                        case 3 : System.out.print("Add name");  break;
                        case 4 : System.out.print("Erase");  break;
                        case 5 : System.out.print("Edit");  break;
                        case 6 : System.out.print("Assign tone");  break;
                        case 7 : System.out.print("Send b'card"); break;
                        case 8 : displayOptionsMenu();break;
                        case 9 : System.out.print("Speed dials");  break;
                        case 10 : System.out.print("Voice tags"); break;
                        case 11 : displayMainMenu();
			default :   System.out.println("Invalid option!!. Try again");
				    displayPhoneBookMenu(); break;



                }
        }

        public static void displayOptionsMenu(){

        	System.out.print("""
	
					Options
			...................................
				1 --> Type of view
				2 --> Memory status
				3 --> Back to previous menu
			...................................
		 	"""
            	);

		System.out.print("Enter preferred option : ");
                int optionMenu = keyboardInto.nextInt();

                 switch(optionMenu){
                 	case 1 :    System.out.print("Type of view"); break;
                        case 2 :    System.out.print("Memory Status"); break;
                        case 3 :    displayPhoneBookMenu();
			default :   System.out.println("Invalid option!!. Try again");
				    displayOptionsMenu(); break;

		 }
  
	}

	public static void displayMessageMenu(){
		
		System.out.print("""
	
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
				"""
		);
	
		System.out.print("Enter preferred option : ");
		int messageMenu = keyboardInto.nextInt();

		switch (messageMenu) {

			case 1 : System.out.print("Write Messaage");break;
			case 2 : System.out.print("Inbox.");break;
			case 3 : System.out.print("Outbox");break;
			case 4 : System.out.print("Picture Message");break;
			case 5 : System.out.print("Template");break;
			case 6 : System.out.print("Smileys");break;
			case 7 : displayMessageSetting(); break;
			case 8 : System.out.print("Info Service");break;
			case 9 : System.out.print("Voice Mailbox Number");break;
			case 10 : System.out.print("Service Command Editor");break;
			case 0 : displayMainMenu(); break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayMessageMenu(); break;

		}

	}	

	public static void displayMessageSetting(){
		
		System.out.print("""

				Message Settings
			...................................
				1 --> Set 1
				2 --> Common
				3 --> Back to previous Menu
			...................................
			"""
		);
		
		System.out.print("Enter preferred option : ");
		int messageSettingMenu = keyboardInto.nextInt();

		switch (messageSettingMenu) {

			case 1 : displaySet1Menu();break;
			case 2 : displayCommonMenu();break;
			case 3 : displayMessageMenu();break;
			default :   System.out.println("Invalid option!!. Try again");
				   displayMessageSetting(); break;
		
		}	
	
	}
	
	public static void displaySet1Menu(){
		
		System.out.print("""

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
		int Set1Menu = keyboardInto.nextInt();

		switch (Set1Menu) {

			case 1 : System.out.print("Message Centre number");break;
			case 2 : System.out.print("Message Sent As");break;
			case 3 : System.out.print("Message Validity");break;
			case 4 : displayMessageSetting(); break; 	
			default :   System.out.println("Invalid option!!. Try again");
				    displaySet1Menu(); break;

		}	

	
	}

	public static void displayCommonMenu(){
		
		System.out.print("""

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
		int CommonMenu = keyboardInto.nextInt();

		switch (CommonMenu) {

			case 1 : System.out.print("Delivery reports");break;
			case 2 : System.out.print("Reply via same centre");break;
			case 3 : System.out.print("Character support");break;
			case 4 : displayMessageSetting(); break; 
			default :   System.out.println("Invalid option!!. Try again");
				    displayCommonMenu(); break;


		}		
	}

	public static void displayCallRegisterMenu(){

		System.out.print ( """

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
		int callRegisterMenu = keyboardInto.nextInt();

		switch (callRegisterMenu) {

			case 1 : System.out.print("Missed Calls");break;
			case 2 : System.out.print("Received calls");break;
			case 3 : System.out.print("Dailed calls");break;
			case 4 : System.out.print("Erase recent call lists");break;
			case 5 : System.out.print("Clear timers");break;
			case 6 : displayShowCallCostMenu();break;
			case 7 : displayCallCostSettingMenu();break;
			case 8 : System.out.print("Prepaid credit");break;
			case 0 : displayMainMenu(); break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayCallRegisterMenu(); break;

		
		}

	}

	public static void displayShowCallCostMenu(){

		System.out.print("""

				Show call cost
			..................................
				1 --> Last call cost	
				2 --> All call cost	
				3 --> Clear Counters
				4 --> Back to Previous Menu
			..................................
				"""
		);
		
		System.out.print("Enter preferred option : ");
		int showCallCostMenu = keyboardInto.nextInt();

		switch (showCallCostMenu) {

			case 1 : System.out.print("Last Call Cost");break;
			case 2 : System.out.print("All Call Cost");break;
			case 3 : System.out.print("Clear Counter");
			case 4 : displayCallRegisterMenu();break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayShowCallCostMenu(); break;

	
		} 
	}

	public static void displayCallCostSettingMenu(){

		System.out.print("""
									
				Call cost settings
			....................................
				1 --> Call cost limit	
				2 --> Show costs in
				3 --> Back to previous menu	
			....................................
			  """
		);

		System.out.print("Enter preferred option : ");
		int callCostSettingMenu = keyboardInto.nextInt();

		switch (callCostSettingMenu) {

			case 1 : System.out.print("Call Cost Limit");break;
			case 2 : System.out.print("Show Cost in");break;
			case 3 : displayCallRegisterMenu();break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayCallCostSettingMenu(); break;

		} 

	}
	
	public static void displayTonesMenu(){

		System.out.print("""

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
		int tonesMenu = keyboardInto.nextInt();

		switch (tonesMenu) {

			case 1 : System.out.print("Ringing tone");break;
			case 2 : System.out.print("Ringing Volume");break;
			case 3 : System.out.print("Incoming call alert");break;
			case 4 : System.out.print("Composer");break;
			case 5 : System.out.print("Message alert tone");break;
			case 6 : System.out.print("Keypad tones");break;
			case 7 : System.out.print("Warning and game tones");break;
			case 8 : System.out.print("Vibrating alert");break;
			case 9 : System.out.print("Screen saver");break;
			case 0 : displayMainMenu(); break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayTonesMenu(); break;




		}


	}

	public static void displaySettingMenu(){

		System.out.print("""

					 Settings
			  ............................................
				 	
				1 --> Call settings
				2 --> Phone settings
				3 --> Security settings
				4 --> Restore factory settings
				0 --> Back to Main menu

			  .............................................
			    """
		);

		System.out.print("Enter preferred option : ");
		int settingMenu = keyboardInto.nextInt();

		switch (settingMenu) {

			case 1 : displayCallSettingMenu();
			case 2 : displayPhoneSettingMenu();
			case 3 : displaySecuritySettingMenu();
			case 4 : System.out.printf("Restore factory settings %n"); break;
			case 0 : displayMainMenu(); break;
			default :   System.out.println("Invalid option!!. Try again");
				    displaySettingMenu(); break;

		}

	}

	public static void displayCallSettingMenu(){

		System.out.print("""
					
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
		int callSettingMenu = keyboardInto.nextInt();

		switch (callSettingMenu) {

			case 1 : System.out.print("Automatic redial");break;
			case 2 : System.out.print("Speed dialing");break;
			case 3 : System.out.print("Call waiting options");
			case 4 : System.out.print("Own number sending");break;
			case 5 : System.out.print("Phone line in use ");break;
			case 6 : System.out.print("Automatic answer");break;
			case 7 : displaySettingMenu();  break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayCallSettingMenu(); break;


		}  
	
	}
	
	public static void displayPhoneSettingMenu(){
	
		System.out.print("""

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
				"""
		);
					
		System.out.print("Enter preferred option : ");
		int phoneSettings = keyboardInto.nextInt();

		switch (phoneSettings) {

			case 1 : System.out.printf("Language %n"); break;
			case 2 : System.out.printf("Cell info display%n"); break;
			case 3 : System.out.printf("Welcome note%n"); break;
			case 4 : System.out.printf("Network selection%n"); break;
			case 5 : System.out.printf("Lights%n"); break;
			case 6 : System.out.printf("Confirm sim service actions%n"); break;
			case 7 : displaySettingMenu();break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayPhoneSettingMenu(); break;

		}
	}

	public static void displaySecuritySettingMenu(){

		System.out.print("""

				Security S ettings
			..................................
				1 --> Pin code request
				2 --> Call barring service
				3 --> Fixed dialing
				4 --> Closed user group
				5 --> Phone security 
				6 --> Change access codes
				7 --> Back to previous menu

			..................................
			  """
		);
		
		System.out.print("Enter preferred option : ");
		int securitySettingMenu = keyboardInto.nextInt();

		switch (securitySettingMenu) {

			case 1 : System.out.printf("Pin code request%n"); break;						  
			case 2 : System.out.print("Call barring service"); break;
			case 3 : System.out.print("Fixed dialing"); break;
			case 4 : System.out.print("Closed user group"); break;	  
			case 5 : System.out.print("Phone security");break;
			case 6 : System.out.print("Change access codes");break;
			case 7 : displaySettingMenu(); break;
			default :   System.out.println("Invalid option!!. Try again");
				   displaySecuritySettingMenu(); break;


		} 

	}
	
	public static void displayClockMenu(){

		System.out.print("""
					  
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
				"""
		);
		
		System.out.print("Enter preferred option : ");
		int clock = keyboardInto.nextInt();

		switch (clock) {

			case 1 : System.out.print("Alarm clock");break;
			case 2 : System.out.print("Clock settings");break;
			case 3 : System.out.print("Date setting");break;
			case 4 : System.out.print("Stopwatch");break;	
			case 5 : System.out.print("Countdown timer");break;	
			case 6 : System.out.print("Auto update of date and time");break;
			case 0 : displayMainMenu();  break;
			default :   System.out.println("Invalid option!!. Try again");
				    displayClockMenu(); break;

		
		}

	}


}