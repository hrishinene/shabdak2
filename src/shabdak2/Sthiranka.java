package shabdak2;

import java.util.Random;

public class Sthiranka {
	public static final String PADDING5 = "     ";
	public static final String PADDING8 = "        ";
	public static final char[] Moolakshare = { 'अ', 'आ', 'इ', 'ई', 'उ', 'ऊ', 'ए', 'ऐ', 'ओ', 'औ', 'क', 'ख', 'ग', 'घ',
			'ङ', 'च', 'छ', 'ज', 'झ', 'ञ', 'ट', 'ठ', 'ड', 'ढ', 'ण', 'त', 'थ', 'द', 'ध', 'न', 'प', 'फ', 'ब', 'भ', 'म',
			'य', 'र', 'ल', 'व', 'श', 'ष', 'स', 'ह', 'ळ', 'क़', 'ख़', 'ग़', 'ज़', 'ड़', 'ढ़', 'फ़', 'य़' };

	public static final int[] Swaransh = { 0x0902, 0x093e, 0x093f, 0x0940, 0x0941, 0x0942, 0x0943, 0x0945, 0x0946,
			0x0947, 0x0948, 0x0949, 0x094a, 0x094b, 0x094c, 0x094d, 0x094f, 0x0971 };

	// Small subset of 3 and 4 letters
	public static final String[] WordList = { 
			"समूळ", 
			"जठर",
			"कुलूप", 
			"पंचम",
			"निषेध", 
			"सुखरूप", 
			"संकेत", 
			"रंगीत",
			"कुटुंब", 
			"तांडव", 
			"माधुकरी",
			"पाहूणा",
			"खादाड",
			"अपार",
			"निवास",
			"उतावीळ",
			"विभाग",
			"उपवास",
			"दूषण",
			"निराकार",
			"मोकाट",
			"परंपरा",
			"संकट",
			"अडाणी",
			"मोकाट",
			"कबुली",
			"संमती",
			"करूणा",
			"अनुभूती",
			"दुजोरा",
			"पाठिंबा",
			"संयोग",
			"आधार",
			"संबंध",
			"चौकशी",
			"मानहानी",
			"विकलांग",
			"संशोधन",
			"खटला",
			"आरोप",
			"गंमत" };

	public static final String RANDOM = "Random";

	public static String getRandomShabda() {
		Random r = new Random();
		int seed = r.nextInt(50000);

		int index = seed % WordList.length;

		return WordList[index];
	}

	public static class Colors {
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";

		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	}
}
