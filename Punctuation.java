//Avnish Shukla
//Period 6
//12/11/24
//Punctuation That Code Need to Recognize: . , ; : ! ? ' ' ( ) -
/*PsuedoCode:
 * String txt is saved to the prompt given
 * 
 * main method:
 * calls  searchIt()
 * 
 * searchIt() method:
 * calls getPunctuationWords()
 * calls printWords()
 * 
 * getPunctuationWords() method:
 * calls checkforPunctuation()
 * 
 * checkforPunctuation method:
 * trims the txt variable
 * creates a substring using start and end points of all words with all punctuation
 * (how this works is explained in the comments of the loop that does this (in checkforPunctuation()))
 * (also, uses different loops for different punctuation)
 * adds all the leftover text and sets it to the txt variable
 * 
 * printWords() method:
 * prints out txt 
 * */

public class Punctuation //Punctuation Class
{
	//txt variable is below
	private static String txt = "Blood, Sweat, and Tears by Winston Churchill " +
	"May 13, 1940" +
	"Mr. Speaker:" +
	"On Friday evening last I received His Majesty’s commission to " +
	"form a new " +
	"Administration. It was the evident wish and will of Parliament " +
	"and the " +
	"nation that this should be conceived on the broadest possible " +
	"basis and that it should " + 
	"include all parties, both those who supported the late "  +
	"Government and also the parties " +
	"of the Opposition. " +
	"I have completed the most important part of this task. " +
	"A War Cabinet has " +
	"been formed of five Members, representing, with the Liberal " +
	"Opposition, the unity of the " +
	"nation. The three party Leaders have agreed to serve, " +
	"either in the War Cabinet or in " +
	"high executive office. The three Fighting Services have been " + 
	"filled. It was necessary " +
	"that this should be done in one single day, on account of the " +
	"extreme urgency and " +
	"rigour of events. A number of other key positions were filled " +
	"yesterday, and I am " +
	"submitting a further list to His Majesty tonight. I hope to " +
	"complete the appointment of the" +
	"principal Ministers during tomorrow. The appointment of the " +
	"other Ministers usually " +
	"takes a little longer, but I trust that, when Parliament meets " +
	"again, this part of my task " + 
	"will be completed, and that the Administration will be complete " +
	"in all respects. " +
	"Sir, I considered it in the public interest to suggest that the " +
	"House should " + 
	"be summoned to meet today. Mr. Speaker agreed and took the " + 
	"necessary steps, in " + 
	"accordance with the powers conferred upon him by the Resolution " + 
	"of the House. At the " +
	"end of the proceedings today, the Adjournment of the House will " + 
	"be proposed until " +
	"Tuesday, the 21st May, with, of course, provision for earlier " + 
	"meeting, if need be. The " +
	"business to be considered during that week will be notified to " +
	"Members at the earliest " +
	"opportunity. I now invite the House, by the Resolution which " +
	"stands in my name, to" +
	"record its approval of the steps taken and to declare its " + 
	"confidence in the new " +
	"Government. " +
	"Sir, to form an Administration of this scale and complexity is " +
	"a serious " +
	"undertaking in itself, but it must be remembered that we are in " + 
	"the preliminary stage of " +
	"one of the greatest battles in history, that we are in action " +
	"at many points in Norway and " +
	"in Holland, that we have to be prepared in the Mediterranean, " +
	"that the air battle is " + 
	"continuous and that many preparations have to be made here at " +
	"home. In this crisis I " +
	"hope I may be pardoned if I do not address the House at any " +
	"length today. I hope that " +
	"any of my friends and colleagues, or former colleagues, who are " +
	"affected by the political" +
	"reconstruction, will make all allowances for any lack of " +
	"ceremony with which it has been " +
	"necessary to act. I would say to the House, as I said to those " +
	"who’ve joined this " + 
	"government: \"I have nothing to offer but blood, toil, tears" +
	"and sweat.\"" +
	"We have before us an ordeal of the most grievous kind. We have " +
	"before " +
	"us many, many long months of struggle and of suffering. You " +
	"ask, what is our policy? I " +
	"will say: It is to wage war, by sea, land and air, with all our " +
	"might and with all the " + 
	"strength that God can give us; to wage war against a monstrous " +
	"tyranny, never " +
	"surpassed in the dark and lamentable catalogue of human crime. " +
	"That is our policy. You " + 
	"ask, what is our aim? I can answer in one word: victory. " +
	"Victory at all costs, victory in " +
	"spite of all terror, victory, however long and hard the road " +
	"may be; for without victory, " +
	"there is no survival. Let that be realised; no survival for the " +
	"British Empire, no survival" +
	"for all that the British Empire has stood for, no survival for " +
	"the urge and impulse of the " +
	"ages, that mankind will move forward towards its goal. " +
	"But I take up my task with buoyancy and hope. I feel sure that " +
	"our cause " +
	"will not be suffered to fail among men. At this time I feel " +
	"entitled to claim the aid of all, " +
	"and I say, \"Come then, let us go forward together with our " +
	"united strength.\"";
	public static void main(String[] args) //main method
	{
		Punctuation pc = new Punctuation(); //creates a new instance of Punctuation called pc
		pc.searchIt(); //calls searchIt();
	}
	
	public void searchIt() //searchIt() method
	{
		getPunctuationWords(); //calls getPunctuationWords()
		printWords(); //calls printWords();
	}
	
	public void getPunctuationWords() //getPunctuationWords() method
	{	
		checkForPunctuation(); //calls checkForPunctuation();
	}
	
	public void checkForPunctuation() //checkForPunctuation() method
	{
		String newTxt = txt.trim(); //trims txt and ssaves it to newTxt
		String newTxtPeriod = ""; //D&I's newTxtPeriod
		String newTxtComma = ""; //D&I's newTxtComma
		String newTxtSemicolon = ""; //D&I's newTxtSemicolon
		String newTxtColon = ""; //D&I's newTxtColon
		String newTxtExclamationMark = ""; //D&I's newTxtExclamationMArk
		String newTxtQuestionMark = ""; //D&I's newTxtQuestionMark
		String newTxtApostrophe = ""; //D&I's newTxtApostrophe
		String newTxtParenthesesStart = ""; //D&I's newTxtParenthesesStart
		String newTxtParenthesesEnd = ""; //D&I's newTxtParentheseEnd
		String newTxtHyphen = ""; //D&I's newTxtHyphen
		int period = 0; //D&I's period
		int period2 = 0; //D*I's period2
		while(period2 >= 0) //checks if period2 is greater than or equal to 0
		{
			period2 = newTxt.indexOf(".", period2 + 1); //sets period2 to the first period
			if(period2 >= 0) //checks if period 2 is greater than or equal to 0
			{
			newTxtPeriod = " " + newTxt.substring(period,period2); //creates a substring with the word and saves it to newTxtPeriod
			period2 = period2 + 1; //makes period2 moves on to next word
			period = newTxt.lastIndexOf(" ",period2); //makes period find the space break for the start of word
			} 
		}
		int comma = 0; //D&I's comma
		int comma2 = 0; //D*I's comma2
		while(comma2 >= 0) //checks if comma2 is greater than or equal to 0
		{
			comma2 = newTxt.indexOf(",", comma2 + 1); //sets comma2 to the first comma
			if(comma2 >= 0) //checks if comma2 is greater than or equal to 0
			{
			newTxtComma = " " + newTxt.substring(comma, comma2+1); //creates a substring with the word and saves it to newTxtComma
			comma2 = comma2 + 1; //makes comma2 moves on to next word
			comma = newTxt.lastIndexOf(" ",comma2); //makes comma find the space break for the start of word
			}
		}
		int semicolon = 0; //D&I's semicolon
		int semicolon2 = 0; //D&I's semicolon2
		while(semicolon2 >= 0) //checks if semicolon2 is greater than or equal to 0
		{
			semicolon2 = newTxt.indexOf(";", semicolon2 + 1); //sets semicolon2 to the first semicolon
			if(semicolon2 >= 0) //checks if semicolon2 is greater than or equal to 0
			{
			newTxtSemicolon = " " + newTxt.substring(semicolon, semicolon2+1); //creates a substring with the word and saves it to newTxtSemicolon
			semicolon2 = semicolon2 + 1; //makes semicolon2 moves on to next word
			semicolon = newTxt.lastIndexOf(" ",semicolon2); //makes semicolon find the space break for the start of word
			}
		}
		int colon = 0; //D&I's colon
		int colon2 = 0; //D&I's colon2
		while(colon2 >= 0) //checks if colon2 is greater than or equal to 0
		{
			colon2 = newTxt.indexOf(":", colon2 + 1); //sets colon2 to the first colon
			if(colon2 >= 0) //checks if colon2 is greater than or equal to 0
			{
			newTxtColon = " " + newTxt.substring(colon, colon2+1); //creates a substring with the word and saves it to newTxtColon
			colon2 = colon2 + 1; //makes colon2 moves on to next word
			colon = newTxt.lastIndexOf(" ",colon2); //makes colon find the space break for the start of word
			}
		}
		int exclamationMark = 0; //D&I's exclamationMark
		int exclamationMark2 = 0; //D&I's exclamationMark2
		while(exclamationMark2 >= 0) //checks if exclamationMark2 is greater than or equal to 0
		{
			exclamationMark2 = newTxt.indexOf("!", exclamationMark2 + 1); //sets exclamationMark2 to the first exclamation mark
			if(exclamationMark2 >= 0) //checks if exclamationMark2 is greater than or equal to 0
			{
			newTxtExclamationMark = " " + newTxt.substring(exclamationMark, exclamationMark2+1); //creates a substring with the word and saves it to newTxtExclamationMark
			exclamationMark2 = exclamationMark2 + 1; //makes exclamationMark2 moves on to next word
			exclamationMark = newTxt.lastIndexOf(" ",exclamationMark2); //makes exclamationMark find the space break for the start of word
			}
		}
		int questionMark = 0; //D&I's questionMark
		int questionMark2 = 0; //D&I's questionMark2
		while(questionMark2 >= 0) //checks if questionMark2 is greater than or equal to 0
		{
			questionMark2 = newTxt.indexOf("?", questionMark2 + 1); //sets questionMark2 to the first exclamation mark
			if(questionMark2 >= 0) //checks if questionMark2 is greater than or equal to 0
			{
			newTxtQuestionMark = " " + newTxt.substring(questionMark, questionMark2+1); //creates a substring with the word and saves it to newTxtQuestionMark
			questionMark2 = questionMark2 + 1; //makes questionMark2 moves on to next word
			questionMark = newTxt.lastIndexOf(" ",questionMark2); //makes questionMark find the space break for the start of word
			}
		}
		int apostrophe = 0; //D&I's apostrophe
		int apostrophe2 = 0; //D&I's apostrophe2
		while(apostrophe2 >= 0) //checks if apostrophe2 is greater than or equal to 0
		{
			apostrophe2 = newTxt.indexOf("'", apostrophe2 + 1); //sets apostrophe2 to the first apostrophe 
			if(apostrophe2 >= 0) //checks if apostrophe2 is greater than or equal to 0
			{
			newTxtApostrophe = " " + newTxt.substring(apostrophe, apostrophe2+1); //creates a substring with the word and saves it to newTxtApostrophe
			apostrophe2 = apostrophe2 + 1; //makes apostrophe2 moves on to next word
			apostrophe = newTxt.lastIndexOf(" ",apostrophe2); //makes apostrophe find the space break for the start of word
			}
		}
		int parenthesesStart = 0; //D&I's parethensesStart
		int parenthesesStart2 = 0; //D&I's parethensesStart2
		while(parenthesesStart2 >= 0) //checks if parenthesesStart2 is greater than or equal to 0
		{
			parenthesesStart2 = newTxt.indexOf("(", parenthesesStart2 + 1); //sets parethesesStart2 to the first paretheses start
			if(parenthesesStart2 >= 0) //checks if parenthesesStart2 is greater than or equal to 0
			{
			newTxtParenthesesStart = " " + newTxt.substring(parenthesesStart, parenthesesStart2+1); //creates a substring with the word and saves it to newTxtParenthesesStart
			parenthesesStart2 = parenthesesStart2 + 1; //makes parenthesesStart2 moves on to next word
			parenthesesStart = newTxt.lastIndexOf(" ",parenthesesStart2); //makes parenthesesStart find the space break for the start of word
			}
		}
		int parenthesesEnd = 0; //D&I's parenthesesEnd
		int parenthesesEnd2 = 0; //D&I's parenthesesEnd2
		while(parenthesesEnd2 >= 0) //checks if parenthesesEnd2 is greater than or equal to 0
		{
			parenthesesEnd2 = newTxt.indexOf(")", parenthesesEnd2 + 1); //sets parenthesesEnd2 to the first paretheses end
			if(parenthesesEnd2 >= 0) //checks if parenthesesEnd2 is greater than or equal to 0
			{
			newTxtParenthesesEnd = " " + newTxt.substring(parenthesesEnd, parenthesesEnd2+1); //creates a substring with the word and saves it to newTxtParenthesesEnd
			parenthesesEnd2 = parenthesesEnd2 + 1; //makes parenthesesEnd2 moves on to next word
			parenthesesEnd = newTxt.lastIndexOf(" ",parenthesesEnd2); //makes parenthesesEnd find the space break for the start of word
			}
		}
		int hyphen = 0; //D&I's hyphen
		int hyphen2 = 0; //D&I's hyphen2
		while(hyphen2 >= 0) //checks if hyphen2 is greater than or equal to 0
		{
			hyphen2 = newTxt.indexOf("-", hyphen2 + 1); //sets hyphen2 to the first hyphen
			if(hyphen2 >= 0) //checks if hyphen2 is greater than or equal to 0
			{
			newTxtHyphen = " " + newTxt.substring(hyphen, hyphen2+1); //creates a substring with the word and saves it to newTxtHyphen
			hyphen2 = hyphen2 + 1; //makes hyphen2 moves on to next word
			hyphen = newTxt.lastIndexOf(" ",hyphen2); //makes hyphen find the space break for the start of word
			}
		}
		txt = newTxtApostrophe + newTxtColon + newTxtComma + newTxtExclamationMark + newTxtHyphen + newTxtParenthesesEnd+ newTxtParenthesesStart + newTxtPeriod + newTxtQuestionMark + newTxtSemicolon;
		//saves txt to all the words that have a punctuation mark
	}

	public void printWords() //printWords() method
	{
		System.out.print(txt); //prints out txt
	}
}
