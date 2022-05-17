import java.util.Random;

public class MonkeyCreator {
	static String[] names = {"Steve","John","Bill","Cait","Roisin","Adam","Josh","Jack","Madie","Calum","Daniel","Banana","Erin","Zoe","Alfie","Emily","Ben","Concrete","Bonkey","Donkey","Bonky","Bussy","Chonky","Lonky"};
	
	public static Monkey createMonkey()
	{
		Random rand = new Random();
		Monkey newMonkey = new Monkey(names[rand.nextInt(names.length)]);
		return newMonkey;
	}
	
}
