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
				System.out.println(drawEmpty());
			}		
		}
	}

	private static String drawEmpty() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < Khel.WordLength; i++) {
			if (i > 0)
				buf.append(" ");
			
			buf.append("[  ]");
		}

		return buf.toString();
	}

	public static void displayTitle(String title) {
//		System.out.println("\n---------------------");
		System.out.println("\n" + Sanket.ANSI_RED_BACKGROUND + title + Sanket.ANSI_RESET + "\n"); // use padding render
//		System.out.println("---------------------\n");
	}

	public static void renderKeyboard(Kalpat keyboard) {
//		System.out.println("\n---------------------");
		System.out.println("\n" + Sanket.ANSI_CYAN_BACKGROUND + "कळपाट" + Sanket.ANSI_RESET + "\n"); // use padding render
//		System.out.println("---------------------\n");

		System.out.println(keyboard.toString());

	}

	public static String takeInput(String prompt) {
		System.out.println("\n---------------------");
		System.out.println(Sanket.ANSI_BLACK_BACKGROUND + prompt + Sanket.ANSI_RESET);

		String retval = "समूळ";
		Console cnsl = System.console();
		if (cnsl != null)
			retval = cnsl.readLine();
		
		return retval == null ? "समूळ" : retval;
	}

	public static void debugLog(String logStmt) {
		System.out.println("[DEBUG] - " + logStmt);
	}

}
