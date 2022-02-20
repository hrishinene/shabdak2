package shabdak2;

import java.util.ArrayList;
import java.util.List;

/**
 * Unicode Manipulations
 * @author Hrishi
 *
 */
public class UnicodeHelper {
	char toChar(int unicode) {
		return (char) unicode;
	}
	
	List<Integer> toUnicodes(String input) {
		List<Integer> retVal = new ArrayList<Integer>();
		
		for (int j = 0; j < input.length(); j++) {
			int unicode = input.charAt(j);
			retVal.add(unicode);
		}
		
		return retVal;
	}
	
	String toUnicodeString(int unicode) {
	    return("\\u" + Integer.toHexString(unicode | 0x10000).substring(1));
	}
	
	String toString(List<Integer> unicodes) {
		StringBuffer buff = new StringBuffer();
		for (Integer unicode : unicodes) {
			buff.append(toUnicodeString(unicode));
		}
		
		return buff.toString();
	}
	
	
}
