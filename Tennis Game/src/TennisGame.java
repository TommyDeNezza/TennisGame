import java.util.ArrayList;
import java.util.Scanner;
public class TennisGame
	{
	static Scanner sInput = new Scanner(System.in);
	static Scanner iInput = new Scanner (System.in);
	static int P0;
	static int P1;
	static int P2;
	static int P3;
	static int P4;
	static int p = 1;
	static int x = 17;
	static int P1Score;
	static int P2Score;
	static int totalScore;
	static int dP;
	static boolean pointScoring = true;
	static boolean pointPlaying = true;
	static boolean rallying = true;
	static boolean ballFlow1 = true;
	static boolean ballFlow2 = true;
	static int serveGo;
	static int returnerA;
	static int returnerB;
	static 	double returnChance = (double)(Math.random()*100)+1;
	public static void main(String[] args)
		{
		logo();
		playersImage();
		intro();
		rules();
		boolean playing = true;
		while(playing)
			{
			continueScreen();
			PlayerDataBase.playerLoad();
			showPlayerOptions();
			chooseYourPlayer();
			P1Chooser();
			chooseYourPlayer();
			P2Chooser();
			setScore();
			playGame();
			while(pointScoring)
				{
				pointPlaying = true;
				rallying = true;
				while(pointPlaying)
					{
					dP = 1;
					alternateServer();
					serveReturn();
					rallyBall1();
						{
						while(rallying)
							{
							rallyBallFlow();
							dP = dP + 1;
							}
						}
					}
				}
			}
		}
	public static void logo()
		{
		System.out.println("  ______                     __  __               __  _          ______                 _     \r\n" + 
				" /_  __/___  ____  __  __   / / / /___ __      __/ /_( )_____   /_  __/__  ____  ____  (_)____\r\n" + 
				"  / / / __ \\/ __ \\/ / / /  / /_/ / __ `/ | /| / / //_/// ___/    / / / _ \\/ __ \\/ __ \\/ / ___/\r\n" + 
				" / / / /_/ / / / / /_/ /  / __  / /_/ /| |/ |/ / ,<   (__  )    / / /  __/ / / / / / / (__  ) \r\n" + 
				"/_/  \\____/_/ /_/\\__, /  /_/ /_/\\__,_/ |__/|__/_/|_| /____/    /_/  \\___/_/ /_/_/ /_/_/____/  \r\n" + 
				"                /____/                                                                        ");
		}
	public static void playersImage()
		{
		System.out.println("                                        .\r\n" + 
				"                                        |\\\r\n" + 
				"                         \\_O            |X\\\r\n" + 
				"                          /\\_==(#)       XX\\         _    O_/\r\n" + 
				"                         /\\               XX\\       (#)==_/\\\r\n" + 
				"                        /  \\               XX\\             /\\/\r\n" + 
				"                                            XX\\           /\r\n" + 
				"                                             XX\\.\r\n" + 
				"                                              XX|\r\n" + 
				"                                               X|");
		}
	public static void playerOneImage()
		{
		System.out.println("                                        .\r\n" + 
				"                                        |\\\r\n" + 
				"                         \\_O            |X\\\r\n" + 
				"                          /\\_==(#) o     XX\\         _    O_/\r\n" + 
				"                         /\\               XX\\       (#)==_/\\\r\n" + 
				"                        /  \\               XX\\             /\\/\r\n" + 
				"                                            XX\\           /\r\n" + 
				"                                             XX\\.\r\n" + 
				"                                              XX|\r\n" + 
				"                                               X|\r\n" +
				"                          P1                                  P2");
		}
	public static void playerTwoImage()
		{
		System.out.println("                                        .\r\n" + 
				"                                        |\\\r\n" + 
				"                         \\_O            |X\\\r\n" + 
				"                          /\\_==(#)       XX\\         _    O_/\r\n" + 
				"                         /\\               XX\\    o  (#)==_/\\\r\n" + 
				"                        /  \\               XX\\             /\\/\r\n" + 
				"                                            XX\\           /\r\n" + 
				"                                             XX\\.\r\n" + 
				"                                              XX|\r\n" + 
				"                                               X|\r\n"+ 
				"                          P1                                  P2");
		}
	public static void intro()
		{
		System.out.println(" ");
		System.out.println("                                  CLICK ENTER TO START");
		String Garbage = sInput.nextLine();		
		}
	public static void continueScreen()
		{
		System.out.println(" ");
		System.out.println("                                 CLICK ENTER TO CONTINUE");
		String Garbage = sInput.nextLine();		
		}
	public static void rules()
		{
		System.out.println("    Welcome back to the Hawk Man's game center, today we got a lil bit of tennis going on");
		System.out.println("here. Here's how it works:");
		System.out.println("1. This game is a two player turnbased game based on probability and player statistics.");
		System.out.println("2. Each player chooses their character from an assortment of stars of the game.");
		System.out.println("3. The game is played as a 10 point tie break in which serving alternate every two times.");
		System.out.println("4. The players will get the opportnity to hit different types of shots, these shots will");
		System.out.println("give certain advantages and disadvantages to both the hitting player and opponent");
		System.out.println("5. Good luck and have fun!");
		}
	public static void showPlayerOptions()
		{
		System.out.println("                                    Choose your player!");
		for(int i = 0; i < PlayerDataBase.playerInfo.size() - 1; i++)
			{
			System.out.println("Option "+(i+1)+": "+PlayerDataBase.playerInfo.get(i).getName());
			System.out.println("Description: "+PlayerDataBase.playerInfo.get(i).getDescription());
			System.out.println(" ");
			}
		}
	public static void P1Chooser()
		{
		P1 = P0;
		p = 2;
		}
	public static void P2Chooser()
		{
		P2=P0;
		}
	public static void chooseYourPlayer()
		{
		boolean choosing = true;
		while (choosing)
			{
			System.out.println("                  P"+p+": TYPE THE NUMBER FOR THE PLAYER YOU WOULD LIKE TO USE");
			int playerChoice = iInput.nextInt();
			if(playerChoice == 1)
				{
				P0 = 0;
				choosing = false;
				}
			else if(playerChoice == 2)
				{
				P0 = 1;
				choosing = false;
				}
			else if(playerChoice == 3)
				{
				P0 = 2;
				choosing = false;
				}
			else if(playerChoice == 4)
				{
				P0 = 3;
				choosing = false;
				}
			else if(playerChoice == 5)
				{
				P0 = 4;
				choosing = false;
				}
			else if(playerChoice == x)
				{
				P0 =5;
				choosing = false;
				}
			else
				{
				System.out.println("Cmon, that's not a valid character!");
				System.out.println(" ");
				}
			}
		System.out.println("You have chosen: "+PlayerDataBase.playerInfo.get(P0).getName());
		System.out.println("Description: "+PlayerDataBase.playerInfo.get(P0).getDescription());
		}
	public static void setScore()
		{
		P1Score = 0;
		P2Score = 0;
		totalScore = 0;
		pointScoring = true;
		pointPlaying = true;
		P3 = P1;
		P4 = P2;
		}	
	public static void playGame()
		{
		System.out.println("   Let's get this game started! P2, you'll serve first.");
		}	
	public static void serveReturn()
		{
		serveGo = 0;
		System.out.println("Here comes the serve! Press enter to get ready...");
		String garbage = sInput.nextLine();
		if(returnChance <= PlayerDataBase.playerInfo.get(P4).getSreturn() + PlayerDataBase.playerInfo.get(P3).getServe())
			{
			System.out.println("Clean Return by "+ PlayerDataBase.playerInfo.get(P4).getName()+"!");
			serveGo = 1;
			}
		else
			{
			System.out.println("Tough Serve by "+ PlayerDataBase.playerInfo.get(P3).getName()+". They receive the point.");
			addScoreP3();
			}
		}
	public static void rallyBall1()
		{
		if(serveGo == 1)
			{
			System.out.println(PlayerDataBase.playerInfo.get(P3).getName()+" how would you like to return?");
			System.out.println("          Option 1: Groundstroke                                 Option 2: Slice");
			System.out.println("                TYPE THE NUMBER CORRESPONDING TO THE SHOT YOU WOULD LIKE");
			int io = 0;
			boolean shotChoosing = true;
			while(shotChoosing)
				{
				int shotChoice = iInput.nextInt();
				if (shotChoice == 1)
					{
					io = 1;
					shotChoosing = false;
					}
				else if(shotChoice == 2)
					{
					io = 2;
					shotChoosing = false;
					}
				else
					{
					System.out.println("                     INPUT ERROR: UNVALID OPTION");
					}
				}
			if(io == 1)
				{
				P3SliceReturnGroundstroke();
				}
			else if(io == 2) 
				{
				if(returnChance <= PlayerDataBase.playerInfo.get(P3).getLreturn() + PlayerDataBase.playerInfo.get(P4).getSlice() + PlayerDataBase.playerInfo.get(P3).getBreakPoint())
					{
					System.out.println("Beautiful slice sent by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
					returnerA = 2;
					}
				else
					{
					System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much loft on that slice.");
					addScoreP4();
					ballFlow1 = false;
					ballFlow2 = false;
					}
				}
			}
		else
			{
			ballFlow1 = false;
			ballFlow2 = false;
			}
		}
	public static void rallyBallFlow()
		{
		while(ballFlow1)
			{
			System.out.println(PlayerDataBase.playerInfo.get(P3).getName()+" how would you like to return?");
			System.out.println("Option 1: Groundstroke                                             Option 2: Slice");
			System.out.println("                TYPE THE NUMBER CORRESPONDING TO THE SHOT YOU WOULD LIKE");
			int io = 0;
			boolean shotChoosing = true;
			while(shotChoosing)
				{
				int shotChoice = iInput.nextInt();
				if (shotChoice == 1)
					{
					io = 1;
					shotChoosing = false;
					}
				else if(shotChoice == 2)
					{
					io = 2;
					shotChoosing = false;
					}
				else
					{
					System.out.println("                     INPUT ERROR: UNVALID OPTION");
					}
				}
			if(returnerA == 1)
				{
				if(io == 1)
					{
					if(returnChance <= PlayerDataBase.playerInfo.get(P4).getGreturn() + PlayerDataBase.playerInfo.get(P3).getGroundstroke() + PlayerDataBase.playerInfo.get(P4).getBreakPoint()*dP)
						{
						System.out.println("Beautiful groundstroke in response by "+ PlayerDataBase.playerInfo.get(P4).getName()+"!");
						ballFlow1 = false;
						}
					else
						{
						System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P4).getName()+" put a little too much on that one.");
						addScoreP4();
						ballFlow1 = false;
						ballFlow2 = false;
						}
					}
				else if(io == 2) 
					{
					if(returnChance <= PlayerDataBase.playerInfo.get(P4).getGreturn() + PlayerDataBase.playerInfo.get(P3).getSlice() + PlayerDataBase.playerInfo.get(P4).getBreakPoint()*dP)
						{
						System.out.println("Beautiful slice sent by "+ PlayerDataBase.playerInfo.get(P4).getName()+"!");
						ballFlow1 = false;
						}
					else
						{
						System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P4).getName()+" put a little too much loft on that slice.");
						addScoreP4();
						ballFlow1 = false;
						ballFlow2 = false;
						}
					}
				}		
			else if(returnerA == 2)
				{
				if(io == 1)
					{
					if(returnChance <= PlayerDataBase.playerInfo.get(P4).getLreturn() + PlayerDataBase.playerInfo.get(P3).getGroundstroke() + PlayerDataBase.playerInfo.get(P4).getBreakPoint()*dP)
						{
						System.out.println("Beautiful groundstroke in response by "+ PlayerDataBase.playerInfo.get(P4).getName()+"!");
						returnerB = 1;
						ballFlow1 = false;
						}
					else
						{
						System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P4).getName()+" put a little too much on that one.");
						addScoreP4();
						ballFlow1 = false;
						ballFlow2 = false;
						}
					}
				else if(io == 2) 
					{
					if(returnChance <= PlayerDataBase.playerInfo.get(P4).getLreturn() + PlayerDataBase.playerInfo.get(P3).getSlice() + PlayerDataBase.playerInfo.get(P4).getBreakPoint()*dP)
						{
						System.out.println("Beautiful slice sent by "+ PlayerDataBase.playerInfo.get(P4).getName()+"!");
						returnerB = 2;
						ballFlow1 = false;
						}
					else
						{
						System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P4).getName()+" put a little too much loft on that slice.");
						addScoreP4();
						ballFlow1 = false;
						ballFlow2 = false;
						}
					}
				}		
			}
		while(ballFlow2)
			{
			if(returnerB == 1)
				{
				System.out.println(PlayerDataBase.playerInfo.get(P4).getName()+" how would you like to return?");
				System.out.println("Option 1: Groundstroke                                             Option 2: Slice");
				System.out.println("                TYPE THE NUMBER CORRESPONDING TO THE SHOT YOU WOULD LIKE");
				int io = 0;
				boolean shotChoosing = true;
				while(shotChoosing)
					{
					int shotChoice = iInput.nextInt();
					if (shotChoice == 1)
						{
						io = 1;
						shotChoosing = false;
						}
					else if(shotChoice == 2)
						{
						io = 2;
						shotChoosing = false;
						}
					else
						{
						System.out.println("                     INPUT ERROR: UNVALID OPTION");
						}
					}
				if(io == 1)
					{
					
					}
				if(io == 2) 
					{
					
					}
				}
			else if(returnerB == 2)
				{
				System.out.println(PlayerDataBase.playerInfo.get(P4).getName()+" how would you like to return?");
				System.out.println("Option 1: Groundstroke                                             Option 2: Slice");
				System.out.println("                TYPE THE NUMBER CORRESPONDING TO THE SHOT YOU WOULD LIKE");
				int io = 0;
				boolean shotChoosing = true;
				while(shotChoosing)
					{
					int shotChoice = iInput.nextInt();
					if (shotChoice == 1)
						{
						io = 1;
						shotChoosing = false;
						}
					else if(shotChoice == 2)
						{
						io = 2;
						shotChoosing = false;
						}
					else
						{
						System.out.println("                     INPUT ERROR: UNVALID OPTION");
						}
					}
				if(io == 1)
					{
					
					}
				if(io == 2) 
					{
					
					}
				}
			}
		ballFlow1 = true;
		ballFlow2 = true;
		}
	public static void addScoreP3()
		{
		if(P3 == P1)
			{
			P1Score = P1Score + 1;
			}
		else
			{
			P2Score = P2Score + 1;
			}
		}
	public static void addScoreP4()
		{
		if(P4 == P1)
			{
			P1Score = P1Score + 1;
			}
		else
			{
			P2Score = P2Score + 1;
			}
		}
	public static void alternateServer()
		{
		if(P3 == P1)
			{
			P4 = P1;
			P3 = P2;
			}
		else if(P3 == P2)
			{
			P4 = P2;
			P3 = P1;
			}
		}
	public static void P3SliceReturnGroundstroke()
	{
		{
		if(returnChance <= PlayerDataBase.playerInfo.get(P3).getLreturn() + PlayerDataBase.playerInfo.get(P4).getGroundstroke() + PlayerDataBase.playerInfo.get(P3).getBreakPoint()*dP)
			{
			System.out.println("Beautiful groundstroke in response by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
			returnerA = 1;
			}
		else
			{
			System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much on that one.");
			addScoreP4();
			ballFlow1 = false;
			ballFlow2 = false;
			}
		}
	}
	public static void P3SliceReturnSlice()
	{
	if(returnChance <= PlayerDataBase.playerInfo.get(P3).getLreturn() + PlayerDataBase.playerInfo.get(P4).getSlice() + PlayerDataBase.playerInfo.get(P3).getBreakPoint()*dP)
		{
		System.out.println("Beautiful slice sent by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
		returnerA = 2;
		}
	else
		{
		System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much loft on that slice.");
		addScoreP4();
		ballFlow1 = false;
		ballFlow2 = false;
		}
	}
	public static void P3GroundstrokeReturnSlice()
	{
	if(returnChance <= PlayerDataBase.playerInfo.get(P3).getGreturn() + PlayerDataBase.playerInfo.get(P4).getGroundstroke() + PlayerDataBase.playerInfo.get(P3).getBreakPoint()*dP)
		{
		System.out.println("Beautiful groundstroke in response by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
		returnerA = 1;
		}
	else
		{
		System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much on that one.");
		addScoreP4();
		ballFlow1 = false;
		ballFlow2 = false;
		}
	}
	public static void P3GroundStrokeReturnGroundStroke()
	{
	if(returnChance <= PlayerDataBase.playerInfo.get(P3).getLreturn() + PlayerDataBase.playerInfo.get(P4).getSlice() + PlayerDataBase.playerInfo.get(P3).getBreakPoint()*dP)
		{
		System.out.println("Beautiful slice sent by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
		returnerA = 2;
		}
	else
		{
		System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much loft on that slice.");
		addScoreP4();
		ballFlow1 = false;
		ballFlow2 = false;
		}
	}
	public static void P4SliceReturnGroundstroke()
	{
	
	}
	public static void P4SliceReturnSlice()
	{
	
	}
	public static void P4GroundstrokeReturnSlice()
	{
	
	}
	public static void P4GroundStrokeReturnGroundStroke()
	{
	
	}
		{
		if(returnChance <= PlayerDataBase.playerInfo.get(P4).getLreturn() + PlayerDataBase.playerInfo.get(P3).getGroundstroke() + PlayerDataBase.playerInfo.get(P4).getBreakPoint())
			{
			System.out.println("Beautiful groundstroke in response by "+ PlayerDataBase.playerInfo.get(P3).getName()+"!");
			returnerA = 1;
			}
		else
			{
			System.out.println("Ooooh, it looks like "+PlayerDataBase.playerInfo.get(P3).getName()+" put a little too much on that one.");
			addScoreP4();
			ballFlow1 = false;
			ballFlow2 = false;
			}
		}
	}
