package shabdak2;

public class Kal {
	SanketAkshar sanketakshar;

	public Kal(char c) {
		if (!Akshar.isAkshar(c))
			throw new AvaidhShabdaException("Invalid Character: " + c + "(" + (int) c + ")");
		
		sanketakshar = new SanketAkshar(new Aksharavatar(c));
	}

	public void update(SanketShodhak shodhak) {
		SanketAkshar naveen = shodhak.shodh(sanketakshar.avatar.moolAkshar);
		if (naveen != null && !naveen.equals(sanketakshar))
			sanketakshar = naveen;
	}

	@Override
	public String toString() {
		return "[" + sanketakshar + "]";
	}
	
	public static void main(String[] args) {
		Kal ka = new Kal('क');
		System.out.println(ka.toString());
	}
}
