package shabdak2;

import java.util.ArrayList;
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
				throw new AvaidhShabdaException("Invalid Character: " + c + "(" + (int) c + ")");
			}
		}
	}

	List<Aksharavatar> akshare = new ArrayList<Aksharavatar>();

	@Override
	public String toString() {
		StringBuffer retval = new StringBuffer();
		for (Aksharavatar aksharavatar : akshare) {
			retval.append("[").append(aksharavatar.toString()).append("]");
		}
		return retval.toString();
	}

	/**
	 * Where magic happens
	 * @param mooLAvatar
	 * @param i
	 * @return
	 */
	public SanketAkshar match(Aksharavatar mooLAvatar, int i) {
		// Check for exact match first
		Aksharavatar tarkAksharavatar = akshare.get(i);
		if (tarkAksharavatar.getAkshar().equals(mooLAvatar.getAkshar()))
			return new SanketAkshar(mooLAvatar, Sanket.SanketPrakar.Achook);
		
		// Loop through all and check for Approximate
		for (int j = 0; j < akshare.size(); j++) {
			if (i == j)
				continue;
			
			Aksharavatar tarkAkshar = akshare.get(j);
			if (tarkAkshar.getAkshar().equals(mooLAvatar.getAkshar()))
				return new SanketAkshar(mooLAvatar, Sanket.SanketPrakar.Javalpaas);
		}
		
		return null;
	}

	/**
	 * Validate on the basis of 2 things
	 * Word length
	 * Repeatition of characters
	 */
	public void validate() {
		// Check Repeatition
		for (int i = 0; i < akshare.size(); i++) {
			for (int j = i + 1; j < akshare.size(); j++) {
				if (akshare.get(i).moolAkshar.equals(akshare.get(j).moolAkshar))
					throw new AvaidhShabdaException("शब्द " + this + "मधे अक्षरांची पुनरावृत्ती आहे!");
			}
		}
		
		// Check Size
		if (akshare.size() != Khel.WordLength)
			throw new AvaidhShabdaException("शब्द " + Khel.WordLength + "अक्षरी असावा!");

	}
}
