import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ClassA 
{
	public static void main(String[] args)
	{
		ArrayList<String> sentencePrompt = new ArrayList<String>();//The ArrayList of random prompts
		sentencePrompt.add("Describing your favorate fruits.");
		sentencePrompt.add("BANNANNAAAAAAAAAAAA!!!!!");
		sentencePrompt.add("Describe the first place that comes to your mind.");
		sentencePrompt.add("Describe five vegetables");
		sentencePrompt.add("Write the plot of an opera.");
		sentencePrompt.add("Write about table cloths");
		sentencePrompt.add("List five things you hate about outer space");
		sentencePrompt.add("wAt' r thee typoe's en Thiz s3ntince   ?");
		sentencePrompt.add("Name five recipes with potatoes that are not fries or hashbrowns.");
		sentencePrompt.add("Create a Disney character.");
		sentencePrompt.add("Describe what you might wear when masquerading as a hobo to a party.");
		sentencePrompt.add("Write a fictional conversation you had with Abraham Lincoln.");
		//sentencePrompt.remove(sentencePrompt.get(2));
		
		
		ArrayList<String> goodResponse = new ArrayList<String>();//The ArrayList of random nice responses
		goodResponse.add("Good job!");
		goodResponse.add("Excellantly measured written report.");
		goodResponse.add(":)");
		goodResponse.add("BANNANNAAAAAAAAAAAA!!!!");
		goodResponse.add("Good job!");
		goodResponse.add("Good job!");
		goodResponse.add("Good job?");
		goodResponse.add("Good job...");
		goodResponse.add("Cool!");
		goodResponse.add("A thrilling and adventurous read!");
		goodResponse.add("*ENCOURAGING_REMARK*");
		
		
		
		ArrayList<String> yellingResponse = new ArrayList<String>();//The ArrayList of random yelled responses
		yellingResponse.add("BANNANNAAAAAAAAAAAA!!!!!!");
		yellingResponse.add("IZ TOOO LOOOOOOOOOOOOOOOOOOONG!!!");
		yellingResponse.add("...zzzzzzZZZzzzzz... *wuh, you done yet?");
		yellingResponse.add("HA! I just trademarked your input and now you owe me a copy right fine!");
		yellingResponse.add("I am sorry to inform you of this embarresing fact, but your sentence is much too long.");
		yellingResponse.add("WHY ME! WHY IS IT ALWAYS MEEEEEEEEEEE !!!(who gets the long sentences)");
		yellingResponse.add("*DISCOURAGING_REMARK*");
		yellingResponse.add("Your sentence is too long.");
		yellingResponse.add("Your sentence is too long.");
		yellingResponse.add("Your sentence is too LOOOOOOOOONG!");
		yellingResponse.add("Your sentence is too LOOOOOOOOOONG?");
		yellingResponse.add("Your sentence is too long...");
		
		
		System.out.println("Hello peeps, sup.");//The beginning text
		System.out.println("");
		System.out.println("Would you like to play a game?");
		System.out.println("(yes/no)");
		System.out.println("");
		
		boolean quit = false;
		while(!quit)//The loop that keeps the game going
		{
			Scanner yesNo = new Scanner(System.in);//Scanner to determine whether they want to keep playing or play more
			String answer = yesNo.nextLine();
			String capsAnswer = answer.toUpperCase();
			
			if(capsAnswer.equals("YES") || capsAnswer.equals("YEAH") || capsAnswer.equals("YES.") 
				|| capsAnswer.equals("Y") || capsAnswer.equals("SURE") || capsAnswer.equals("YES?"))    //OK responses
			{
				System.out.println("Great!");
			}
			else
			{
				System.out.println("OK, seeya later.");
				yesNo.close();
				break;
			}
			
			
			Random randomInt = new Random();//The random number used in determining prompts and responses
			
			int sentencePromptInt = randomInt.nextInt(sentencePrompt.size());
			System.out.println(sentencePrompt.get(sentencePromptInt));
			
			
			Scanner inputSentence = new Scanner(System.in);//The sentence scanner
			String input = new String(inputSentence.nextLine());
			int sentenceLength = input.length();
			
			String allCaps = input.toUpperCase();//Used to compare text to values
			
			if(allCaps.equals("QUIT"))
			{
				System.out.println("OK, seeya later.");
				inputSentence.close();
				quit = true;
				break;
			}
			else if(sentenceLength <= 75)//tests too see if the sentence is too long
			{
				int goodResponseInt = randomInt.nextInt(goodResponse.size());
				System.out.println(goodResponse.get(goodResponseInt));
			}
			else
			{
				int yellingResponseInt = randomInt.nextInt(yellingResponse.size());
				System.out.println(yellingResponse.get(yellingResponseInt));
			}
			
			System.out.println("Would you like to do it again?");//A question
		}
		
	}
}
