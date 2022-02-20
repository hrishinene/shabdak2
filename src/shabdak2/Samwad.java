package shabdak2;

public class Samwad {
	public static final String Sheershak = "शब्दक - २";
	public static final String TarkaVicharana = "काय आहे तुमचा तर्क?";
	
	public static String protsahan(Shabda word) {
		return "क्षमस्व! शब्द चुकला!!\nशब्द होता:  " +Sthiranka.Colors.ANSI_RED_BACKGROUND + word + Sthiranka.Colors.ANSI_RESET + "\nपुढील प्रयत्नासाठी शुभेच्छा !";

	}

	public static String shabasaki(Shabda shabda) {
		return "\n\n\n---\nबहुत खूब!! भले शाब्बास!!\nअगदी बरोबर!\nशब्द होता: " +Sthiranka.Colors.ANSI_GREEN_BACKGROUND +  shabda + Sthiranka.Colors.ANSI_RESET + "\n\nपुढील प्रयत्नासाठी खूप खूप  शुभेच्छा !\n\n";
	}
}
