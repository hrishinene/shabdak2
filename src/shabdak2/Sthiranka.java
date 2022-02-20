package shabdak2;

import java.util.Random;

public class Sthiranka {
	public static final String PADDING5 = "     ";
	public static final String PADDING8 = "        ";
	public static final char[] Moolakshare = { 'अ', 'आ', 'इ', 'ई', 'उ', 'ऊ', 'ए', 'ऐ', 'ओ', 'औ', 'क', 'ख', 'ग', 'घ',
			'ङ', 'च', 'छ', 'ज', 'झ', 'ञ', 'ट', 'ठ', 'ड', 'ढ', 'ण', 'त', 'थ', 'द', 'ध', 'न', 'प', 'फ', 'ब', 'भ', 'म',
			'य', 'र', 'ल', 'व', 'श', 'ष', 'स', 'ह', 'ळ', 'क़', 'ख़', 'ग़', 'ज़', 'ड़', 'ढ़', 'फ़', 'य़' };
	
	public static final int[] Swaransh = { 0x0902, 0x093e, 0x093f, 0x0940, 0x0941, 0x0942, 0x0943, 0x0945, 0x0946, 0x0947,
			0x0948, 0x0949, 0x094a, 0x094b, 0x094c, 0x094d, 0x094f, 0x0971};

	// Small subset of 3 and 4 letters
	public static final String[] WordList = { "समूळ", "जठर", "कुलूप", "पंचम", "निषेध", "सुखरूप", "संकेत", "रंगीत",
			"कुटुंब", "तांडव", "माधुकरी", "गंमत" };

	public static final String RANDOM = "Random";

	public static String getRandomShabda() {
		Random r = new Random();
		int seed = r.nextInt(50000);

		int index = seed % WordList.length;

		return WordList[index];
	}

}
