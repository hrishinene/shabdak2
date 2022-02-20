package shabdak2;

import java.util.HashMap;
import java.util.Map;

public class SanketShodhak {

	Map<Akshar, SanketAkshar> aksharSanketMap = new HashMap<>();
	
	public void doChikitsa(Shabda shabda, Shabda tarka) {
		// TODO Auto-generated method stub
		
	}

	public SanketAkshar shodh(Akshar akshar) {
		return aksharSanketMap.get(akshar);
	}

}
