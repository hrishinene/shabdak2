package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Khel {
	// To be taken as input to main.
	public static final int MaxAttempts = 8;
	
	Shabda shabda;
	Kalpat keyboard = new Kalpat();
	
	// Attempts so far
	List<Prayatna> prayatna = new ArrayList<Prayatna>();
	
	public Khel(String str) {
		shabda = new Shabda(str);
	}
	
	private void play() {
		SanketShodhak shodhak = new SanketShodhak(shabda);
		while(prayatna.size() < MaxAttempts) {
			renderScreen();
			
			Shabda tarka = new Shabda(ShabdakRenderer.takeInput(Samwad.TarkaVicharana));

			ShabdakRenderer.debugLog("Tarka = " + tarka);
			
			shodhak.doChikitsa(tarka);
			ShabdakRenderer.debugLog("Shodhak: " + shodhak);
			
			Prayatna navaPrayatna = Prayatna.createAttempt(tarka, shodhak);
			prayatna.add(navaPrayatna);
			keyboard.update(shodhak);

			if (navaPrayatna.isSuccess()) {
				renderScreen();
				System.out.println(Samwad.shabasaki());
				return;
			}
			
		}
		
		System.out.println(Samwad.protsahan(shabda.toString()));
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
		String str = args.length == 0 ? "कुलूप" : args[0];
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
	

