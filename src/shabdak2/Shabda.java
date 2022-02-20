package shabdak2;

import java.util.List;

public class Shabda {
	public Shabda(String str) {
		// Iterate over chars, and prepare akshar and swaransh
		Aksharavatar aksharavatar = null;
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			if (Akshar.isAkshar(c)) {
				aksharavatar = new Aksharavatar(new Akshar(c));
				akshare.add(aksharavatar);
			} else if (Swaransh.isSwaransh(c)) {
				aksharavatar.addSwaransh(new Swaransh(c));
			} else {
				throw new RuntimeException("Invalid Character: " + c);
			}
		}
		// TODO Auto-generated constructor stub
	}

	List<Aksharavatar> akshare;
}
