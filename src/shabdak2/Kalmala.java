package shabdak2;

import java.util.List;

public class Kalmala {
	List<Kal> keys;

	public void update(SanketShodhak shodhak) {
		for (Kal kal : keys) {
			kal.update(shodhak);
		}
	}
}
