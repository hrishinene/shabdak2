package shabdak2;

import shabdak2.Sanket.SanketPrakar;

public class SanketAkshar {
	Aksharavatar avatar;
	SanketPrakar sanket;
	
	public SanketAkshar(Aksharavatar aksharavatar) {
		this.avatar = aksharavatar;
		sanket = Sanket.SanketPrakar.Adnyaat;
	}

	public SanketAkshar(Aksharavatar aksharavatar, SanketPrakar sanket) {
		this.avatar = aksharavatar;
		this.sanket = sanket;
	}

	@Override
	public String toString() {
		return Sanket.getBKColor(sanket) + avatar + Sanket.resetBKColor();
	}
	
	public static void main(String[] args) {
		SanketAkshar s = new SanketAkshar(new Aksharavatar("कु"), Sanket.SanketPrakar.Achook);
		System.out.println(s.toString());
	}
}
