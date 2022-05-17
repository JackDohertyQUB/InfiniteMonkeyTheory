import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonkeyLab {

	public static ArrayList<String> wordsFound = new ArrayList<String>();
	public static void main(String[] args) {
		/*String word = "alew";
		File myFile = new File("Aword.csv");
		int currentLength = 3677;
		ArrayList<String> dictionaryWords = new ArrayList<String>();
		try {
			Scanner mySc = new Scanner(myFile);
			while(mySc.hasNextLine())
			{
				dictionaryWords.add(mySc.nextLine());
			}
			for(int y = 0; y < dictionaryWords.size(); y++)
			{
				//StringBuffer sb = new StringBuffer(dictionaryWords.get(y));
				//sb.deleteCharAt(sb.length() - 1);
				String tempWord;
				tempWord = word + " ";
				if(tempWord.equalsIgnoreCase((dictionaryWords.get(y))))
				{
					System.out.println("This worked");
				} else {
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//testing branches
		
		for(int i = 0; i < 20; i++)
		{
			
			Monkey newMonkey = MonkeyCreator.createMonkey();
			newMonkey.start();
		}
		

	}

}
