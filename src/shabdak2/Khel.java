package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Khel {
	// To be taken as input to main.
	public static final int MaxAttempts = 8;
	public static final String Title = "शब्दक - २";
	
	Shabda shabda;
	Kalpat keyboard = new Kalpat();
	
	// Attempts so far
	List<Prayatna> prayatna = new ArrayList<Prayatna>();
	
	public Khel(String str) {
		shabda = new Shabda(str);
	}
	
	private void play() {
		SanketShodhak shodhak = new SanketShodhak();
		while(prayatna.size() < MaxAttempts) {
			renderScreen();
			Shabda tarka = new Shabda(ShabdakRenderer.takeInput("काय आहे तुमचा तर्क?"));
			shodhak.doChikitsa(shabda, tarka);
			prayatna.add(Prayatna.createAttempt(tarka, shodhak));
			keyboard.update(shodhak);
		}
		
		System.out.println("क्षमस्व! शब्द चुकला!!\nशब्द होता:  " + shabda.toString() + "\nपुढील प्रयत्नासाठी शुभेच्छा !");
	}
	
	private void renderScreen() {
		// Clear Screen
		ShabdakRenderer.clearScreen();
		
		// Title
		ShabdakRenderer.displayTitle(Title);
		
		// Attempts
		for (int i = 0; i < MaxAttempts; i++) {
			ShabdakRenderer.displayPrayatna(prayatna, i);
		}
		
		// Keyboard
		ShabdakRenderer.renderKeyboard(keyboard);
	}

	// ----------- Static methods
	/**
	 * Play the game with given word
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please input the word to be used for guess!");
			return;
		}
		
		String str = args[0];
		System.out.println("Selected word = " + str);

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
	

