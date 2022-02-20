package shabdak2;

import java.util.ArrayList;
import java.util.List;

public class Aksharavatar {
	Akshar moolAkshar;
	List<Swaransh> swaransh = new ArrayList<Swaransh>();
	
	public Aksharavatar(Akshar akshar) {
		this.moolAkshar = akshar;		
	}

	public Aksharavatar(char c) {
		this(new Akshar(c));
	}

	public Aksharavatar(String unicode) {
		for (int i = 0; i < unicode.length(); i++) {
			char c = unicode.charAt(i);
			if (Akshar.isAkshar(c))
				moolAkshar = new Akshar(c);
			else if (Swaransh.isSwaransh(c))
				addSwaransh(new Swaransh(c));
			else
				throw new RuntimeException("Invalid Character: " + c);
		}
		
	}

	public void addSwaransh(Swaransh c) {
		swaransh.add(c);
		
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(moolAkshar);
		for (Swaransh sw : swaransh) {
			str.append(sw);
		}
		
		return str.toString();
	}

	
	
}
