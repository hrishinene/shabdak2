package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Khel {
	// To be taken as input to main.
	public static int MaxAttempts = 8;
	public static int WordLength = 3;
	
	Shabda shabda;
	Kalpat keyboard = new Kalpat();
	
	// Attempts so far
	List<Prayatna> prayatna = new ArrayList<Prayatna>();
	
	public Khel(String str) {
		shabda = new Shabda(str);
		WordLength = shabda.akshare.size();
		shabda.validate();
		ShabdakRenderer.debugLog("Word Length = " + WordLength);

	}
	
	private Shabda readTarka() {
		try {
			Shabda tarka = new Shabda(ShabdakRenderer.takeInput(Samwad.TarkaVicharana));
			tarka.validate();
			return tarka;
		} catch (AvaidhShabdaException e) {
			System.out.println("अवैध शब्द - " + e.getMessage() + "\nपुन्हा प्रयत्न करा");
			return readTarka();
		}

	}
	
	private void play() {
		SanketShodhak shodhak = new SanketShodhak(shabda);
		while(prayatna.size() < MaxAttempts) {
			renderScreen();
			
			Shabda tarka = readTarka();
			
			ShabdakRenderer.debugLog("Tarka = " + tarka);
			
			shodhak.doChikitsa(tarka);
			ShabdakRenderer.debugLog("Shodhak: " + shodhak);
			
			Prayatna navaPrayatna = Prayatna.createAttempt(tarka, shodhak);
			prayatna.add(navaPrayatna);
			keyboard.update(shodhak);

			if (navaPrayatna.isSuccess()) {
				renderScreen();
				System.out.println(Samwad.shabasaki(shabda));
				return;
			}
			
		}
		
		System.out.println(Samwad.protsahan(shabda));
	}
	
	private void renderScreen() {
		// Clear Screen
		ShabdakRenderer.clearScreen();
		
		// Title
		ShabdakRenderer.displayTitle(Samwad.Sheershak);
		
		// Attempts
		ShabdakRenderer.displayPrayatna(prayatna, MaxAttempts);
		
		// Keyboard
		ShabdakRenderer.renderKeyboard(keyboard);
	}

	// ----------- Static methods
	/**
	 * Play the game with given word
	 * @param args
	 */
	public static void main(String[] args) {
		// Validate input
		
		String str = args.length < 1 ? Sthiranka.getRandomShabda() : args[0]; // pick random 3 letter		
		MaxAttempts = args.length < 2 ? 8 : Integer.parseInt(args[1]);
	
		if (str.equalsIgnoreCase(Sthiranka.RANDOM))
			str = Sthiranka.getRandomShabda();
		
		WordLength = str.length();
		
		ShabdakRenderer.debugLog("Selected word = " + str);
		ShabdakRenderer.debugLog("MaxAttempts = " + MaxAttempts);


		Khel khel = new Khel(str);
		khel.play();
	}


	static void prayog(String str) {
		
		System.out.println("Akshare:");
		for (int j = 0; j < str.length(); j++) {
			Character ch = str.charAt(j);
			System.out.println((j+1) + " ==> " + ch + ", Unicode = " + String.format("0x%08X",(int) ch));	
		}
		
		String combined = String.valueOf(new char[] {str.charAt(0), str.charAt(1), str.charAt(2)});
		System.out.println("Combined = " + combined);
	}
}
	

