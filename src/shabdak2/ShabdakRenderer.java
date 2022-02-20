package shabdak2;

import java.io.Console;
import java.util.List;

public class ShabdakRenderer {

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void displayPrayatna(List<Prayatna> prayatna, int totalRows) {
		for (int j = 0; j < totalRows; j++) {
			if (j < prayatna.size()) {
				System.out.println(prayatna.get(j).toString());
			} else {
				System.out.println("[ ] [ ] [ ]");
			}		
		}
	}

	public static void displayTitle(String title) {
		System.out.println("\n---------------------");
		System.out.println(title); // use padding render
		System.out.println("---------------------\n");
	}

	public static void renderKeyboard(Kalpat keyboard) {
		System.out.println("\n---------------------");
//		System.out.println("कळपाट" ); // use padding render
//		System.out.println("---------------------");

		System.out.println(keyboard.toString());

	}

	public static String takeInput(String prompt) {
		System.out.println("\n---------------------");
		System.out.println(prompt);

		Console cnsl = System.console();
		return cnsl.readLine();
	}

}
