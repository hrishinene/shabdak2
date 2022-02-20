package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Kalpat {
	List<Kalmala> keyRows = new ArrayList<Kalmala>();

	public Kalpat() {
		// row1
		keyRows.add(new Kalmala('अ','आ','इ','ई','उ')); // a aa i
		keyRows.add(new Kalmala('ऊ','ए','ऐ','ओ','औ')); // a aa i
		
		// row2
		keyRows.add(new Kalmala('क','ख','ग','घ','ङ')); // ka kha
		keyRows.add(new Kalmala('च','छ','ज','झ','ञ')); // cha chha

		// row3
		keyRows.add(new Kalmala('ट','ठ','ड','ढ','ण')); // Ta Tha
		keyRows.add(new Kalmala('त','थ','द','ध','न')); // ta tha
		
		// row4
		keyRows.add(new Kalmala('प','फ','ब','भ','म')); // pa pha
		keyRows.add(new Kalmala('य','र','ल','व','श')); // ya ra
		
		// row5
		keyRows.add(new Kalmala('ष','स','ह','ळ')); // sha sa
	}
	
	public void update(SanketShodhak shodhak) {
		for (Kalmala kalmala : keyRows) {
			kalmala.update(shodhak);
		}
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(keyRows.get(0)).append(Sthiranka.PADDING8).append(keyRows.get(1)).append("\n");
		buf.append(keyRows.get(2)).append(Sthiranka.PADDING8).append(keyRows.get(3)).append("\n");
		buf.append(keyRows.get(4)).append(Sthiranka.PADDING8).append(keyRows.get(5)).append("\n");
		buf.append(keyRows.get(6)).append(Sthiranka.PADDING8).append(keyRows.get(7)).append("\n");
		buf.append(Sthiranka.PADDING8).append(Sthiranka.PADDING5).append(keyRows.get(8));
		
		return buf.toString();
	}
	
	
}
