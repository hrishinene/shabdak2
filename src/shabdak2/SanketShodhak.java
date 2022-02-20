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
			
			aksharSanketMap.put(sanketakshar.getAkshar(), sanketakshar);
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
