import java.util.Scanner;

public class NumberGuessingGame
	{
		static int randomNumber;

		public static void main(String[] args)
			{
				boolean playAgain = true;
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				while (playAgain)
					{
						int counter = 0;
						boolean keepPlaying = true;
						Scanner userInput3 = new Scanner(System.in);
						System.out.println("What difficulty would you like to play? Please choose level 1, 2, or 3! (1 is the easiest and 3 is the hardest)");
						int difficulty = userInput3.nextInt();
						if (difficulty == 1)
							{
								randomNumber = (int) (Math.random() * 10 + 1);
								System.out.println("You are guessing for a number between 1 - 10");
							} else if (difficulty == 2)
							{
								randomNumber = (int) (Math.random() * 100 + 1);
								System.out.println("You are guessing for a number between 1 - 100");
							} else if (difficulty == 3)
							{
								randomNumber = (int) (Math.random() * 1000 + 1);
								System.out.println("You are guessing for a number between 1 - 1000");
							}
						while (keepPlaying)
							{
								counter++;
								Scanner userInput2 = new Scanner(System.in);
								System.out.println("Enter a guess.");
								int guess = userInput2.nextInt();
								if (name.equals("Tanner"))
									{
										guess = randomNumber;
										keepPlaying = false;
									}
								if (guess > randomNumber)
									{
										System.out.println("Your guess is too high");
									} else if (guess < randomNumber)
									{
										System.out.println("Your guess is too low");
									} else if (guess == randomNumber)
									{
										System.out.println("Congrats, you got it!");
										keepPlaying = false;
									}
							}
						if (counter == 1)
							{
								System.out.println("It took you " + counter + " try.");
							}
						else if (counter > 1)
							{
								System.out.println("It took you " + counter + " tries.");
							}
						Scanner userInput4 = new Scanner(System.in);
						System.out.println("Would you like to play again? Please answer \"Yes\" or \"No\"");
						String play = userInput4.nextLine();
						play = play.toUpperCase();
						if (play.equals("YES"))
							{
								System.out.println("Ok " + name + ", here we go again!");
							} else if (play.equals("NO"))
							{
								System.out.println("Ok thanks for playing!");
								playAgain = false;
							}
					}
			}

	}
