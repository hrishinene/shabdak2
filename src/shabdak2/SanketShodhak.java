package shabdak2;

import java.util.HashMap;
import java.util.Map;

public class SanketShodhak {
	Shabda moolShabda;
	Map<Akshar, SanketAkshar> aksharSanketMap = new HashMap<Akshar, SanketAkshar>();
	
	public SanketShodhak(Shabda shabda) {
		this.moolShabda = shabda;
	}

	public void doChikitsa(Shabda tarka) {
		int indx = 0;
		for (Aksharavatar mooLAvatar : moolShabda.akshare) {
			SanketAkshar sanketakshar = tarka.match(mooLAvatar, indx++);
			
			if (sanketakshar != null)
				aksharSanketMap.put(sanketakshar.getAkshar(), sanketakshar);
		}
		
		// Add the missing letters from the Tarka
		for (Aksharavatar tarkakshar : tarka.akshare) {
			Akshar mooLakshar = tarkakshar.moolAkshar;
			if (aksharSanketMap.containsKey(mooLakshar))
					continue;
			
			aksharSanketMap.put(mooLakshar, new SanketAkshar(new Aksharavatar(mooLakshar), Sanket.SanketPrakar.Chook));
		}
	}

	public SanketAkshar shodh(Akshar akshar) {
		return aksharSanketMap.get(akshar);
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (Akshar akshar : aksharSanketMap.keySet()) {
			buf.append(akshar).append(" --> ").append(aksharSanketMap.get(akshar).sanket).append(",");
			
		}
		return buf.toString();
	}

	
}
