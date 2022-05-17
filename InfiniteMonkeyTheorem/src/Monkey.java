import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Monkey extends Thread {
	String monkeyName;
	char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };
	int currentLength;

	public Monkey(String n_monkeyName) {
		this.monkeyName = n_monkeyName;
	}

	public void run() {
		System.out.println(monkeyName + " the monkey is active.");
		boolean wordFound = false;
		//ArrayList<String> wordsFound = new ArrayList<String>();

		while (wordFound != true) {
			String currentString = "";
			Random rand = new Random();
			boolean wordFound2 = false;
			currentString = currentString + Character.toString(alphabet[rand.nextInt(alphabet.length)]);
			String filePath = filePathString(currentString);
			File myFile = new File(filePath);
			Scanner mySc;
			try {
				mySc = new Scanner(myFile);
				ArrayList<String> dictionaryWords = new ArrayList<String>();
				while (mySc.hasNextLine()) {
					dictionaryWords.add(mySc.nextLine());
				}
				// System.out.println(a);
				for (int y = 0; y < 45; y++) // Loops iteratively and adds a new letter. Length is 45 as that is length
												// of longest word.
				{
					boolean wordAlreadyFound = false;
					currentString = currentString + Character.toString(alphabet[rand.nextInt(alphabet.length)]);
					//System.out.println(currentString);
					String tempWord;
					tempWord = currentString + " ";
					//System.out.println(currentString);
					for (int x = 0; x < dictionaryWords.size(); x++) {
						
						
						if (tempWord.equalsIgnoreCase(dictionaryWords.get(x))) {
							
							if (MonkeyLab.wordsFound.size() == 0) 
							{
								
								MonkeyLab.wordsFound.add(tempWord);
								//System.out.println(wordsFound.size() + " Size 0 ");
								System.out.println(monkeyName + " has found the word: " + currentString);
								//wordFound = true;
								break;
							} else {
								
								for (int z = 0; z < MonkeyLab.wordsFound.size(); z++) {
									//System.out.println(z);
									//System.out.println(wordsFound.size() + " Size 1");
									if (tempWord.equalsIgnoreCase(MonkeyLab.wordsFound.get(z))) {
										//System.out.println("Word already Found");
										wordAlreadyFound = true;
										break;
									} 
									else if(!tempWord.equalsIgnoreCase(MonkeyLab.wordsFound.get(z)))
									{
										//wordsFound.add(tempWord);
										
										//wordFound = true;
										//break;
									}
									
									
								}
								
								if (wordAlreadyFound != true) {
									MonkeyLab.wordsFound.add(tempWord);
									//System.out.println(wordsFound.size() + " Size 2");
									System.out.println(monkeyName + " has found the word: " + currentString);
									//wordFound = true;
								}
							}
							
						}
					}
					
				}
				//System.out.println("New Word");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*System.out.println(wordsFound.size());
			for(int i = 0; i < wordsFound.size(); i++)
			{
				System.out.println(wordsFound.get(i));
			}*/
		}
	}

	private String filePathString(String firstChar) {
		String filePath = "";
		if (firstChar.length() > 1) {
			System.out.println("Error Occurred: String passed exceeds 1 character length limit.");
			return null;
		} else {
			switch (firstChar) {
			case "a":
				filePath = "Aword.csv";
				currentLength = 3677;
				break;
			case "b":
				filePath = "Bword.csv";
				currentLength = 9877;
				break;
			case "c":
				filePath = "Cword.csv";
				currentLength = 16736;
				break;
			case "d":
				filePath = "Dword.csv";
				currentLength = 7335;
				break;
			case "e":
				filePath = "Eword.csv";
				currentLength = 7520;
				break;
			case "f":
				filePath = "Fword.csv";
				currentLength = 7419;
				break;
			case "g":
				filePath = "Gword.csv";
				currentLength = 5417;
				break;
			case "h":
				filePath = "Hword.csv";
				currentLength = 6268;
				break;
			case "i":
				filePath = "Iword.csv";
				currentLength = 7783;
				break;
			case "j":
				filePath = "Jword.csv";
				currentLength = 1338;
				break;
			case "k":
				filePath = "Kword.csv";
				currentLength = 1283;
				break;
			case "l":
				filePath = "Lword.csv";
				currentLength = 5814;
				break;
			case "m":
				filePath = "Mword.csv";
				currentLength = 8846;
				break;
			case "n":
				filePath = "Nword.csv";
				currentLength = 3034;
				break;
			case "o":
				filePath = "Oword.csv";
				currentLength = 4461;
				break;
			case "p":
				filePath = "Pword.csv";
				currentLength = 15429;
				break;
			case "q":
				filePath = "Qword.csv";
				currentLength = 1043;
				break;
			case "r":
				filePath = "Rword.csv";
				currentLength = 1043;
				break;
			case "s":
				filePath = "Sword.csv";
				currentLength = 21504;
				break;
			case "t":
				filePath = "Tword.csv";
				currentLength = 9285;
				break;
			case "u":
				filePath = "Uword.csv";
				currentLength = 3358;
				break;
			case "v":
				filePath = "Vword.csv";
				currentLength = 2796;
				break;
			case "w":
				filePath = "Wword.csv";
				currentLength = 4457;
				break;
			case "x":
				filePath = "Xword.csv";
				currentLength = 147;
				break;
			case "y":
				filePath = "Yword.csv";
				currentLength = 486;
				break;
			case "z":
				filePath = "Zword.csv";
				currentLength = 415;
				break;
			}

		}

		return filePath;
	}
}
