package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Kalmala {
	List<Kal> keys = new ArrayList<Kal>();

	public Kalmala(char ... chars) {
		for (char c : chars) {
			keys.add(new Kal(c));
		}
	}

	public void update(SanketShodhak shodhak) {
		for (Kal kal : keys) {
			kal.update(shodhak);
		}
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (Kal kal : keys) {
			buf.append(kal.toString());
		}
		
		return buf.toString();
	}
	
	
}
