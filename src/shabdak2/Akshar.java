package shabdak2;

import java.util.ArrayList;
import java.util.List;

//https://unicode-table.com/en/blocks/devanagari/
/**
 * MooL akshar.
 * @author Hrishi
 *
 */
public class Akshar extends Unicode {
	public static List<Akshar> Akshars = toAksharList('क','ख','ग','घ','ङ','च','छ','ज','झ','ञ','ट','ठ','ड','ढ','ण','त','थ','द','ध','न','प','फ','ब','भ','म','य','र','ल','व','श','ष','स','ह','क़','ख़','ग़','ज़','ड़','ढ़','फ़','य़');

	public Akshar(char c) {
		super(c);
	}

	private static List<Akshar> toAksharList(char ... chars) {
		List<Akshar> retval = new ArrayList<Akshar>();
		for (char c : chars) {
			retval.add(new Akshar(c));
		}

		return retval;
	}

	public static boolean isAkshar(char c) {
		return Akshars.contains(new Akshar(c));
	}
}
