package shabdak2;

import java.util.HashMap;
import java.util.Map;

public class SanketShodhak {
	Shabda moolShabda;
	Map<Akshar, SanketAkshar> aksharSanketMap = new HashMap<>();
	
	public SanketShodhak(Shabda shabda) {
		this.moolShabda = shabda;
	}

	public void doChikitsa(Shabda tarka) {
		// TODO Auto-generated method stub
		
	}

	public SanketAkshar shodh(Akshar akshar) {
		return aksharSanketMap.get(akshar);
	}

}
