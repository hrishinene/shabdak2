package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Swaransh extends Unicode {

	public static List<Swaransh> Swaranshes = toSwaranshList(0x093e, 0x093f, 0x0940, 0x0941, 0x0942, 0x0943, 0x0945, 0x0946, 0x09407, 0x0948, 0x0949,0x094a, 0x094b, 0x094c, 0x094d, 0x094f);

	private static List<Swaransh> toSwaranshList(int ... codes) {
		List<Swaransh> retval = new ArrayList<Swaransh>();
		for (int i : codes) {
			retval.add(new Swaransh(i));
		}

		return retval;
	}

	public Swaransh(int unicode) {
		super(unicode);
	}

	public static boolean isSwaransh(char c) {
		return Swaranshes.contains(new Swaransh(c));
	}
}
