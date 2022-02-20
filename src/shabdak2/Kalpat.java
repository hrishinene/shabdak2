package shabdak2;

import java.util.List;

public class Kalpat {
	List<Kalmala> keyRows;

	public void update(SanketShodhak shodhak) {
		for (Kalmala kalmala : keyRows) {
			kalmala.update(shodhak);
		}
	}
}
