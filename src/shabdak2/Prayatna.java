package shabdak2;

import java.util.ArrayList;
import java.util.List;

/**
 * Attempt - historing guesses which are evaluated and scored
 * @author Hrishi
 *
 */
public class Prayatna {
	List<SanketAkshar> sanketakshare;

	public Prayatna(List<SanketAkshar> sanketakshare) {
		super();
		this.sanketakshare = sanketakshare;
	}

	public static Prayatna createAttempt(Shabda tarka, SanketShodhak shodhak) {
		List<SanketAkshar> shodhaleli = new ArrayList<SanketAkshar>();
		
		for (Aksharavatar tarkAvatar : tarka.akshare) {
			shodhaleli.add(shodhak.aksharSanketMap.get(tarkAvatar.moolAkshar));
		}

		return new Prayatna(shodhaleli);
	}

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (SanketAkshar sanketAkshar : sanketakshare) {
			buf.append("[").append(sanketAkshar).append("]");
		}
		return buf.toString();
	}
	
	
}
