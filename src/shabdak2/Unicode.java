package shabdak2;

public class Unicode {
	int code;

	public Unicode(char c) {
		this.code = c;
	}
	public Unicode(int unicode) {
		this.code = unicode;
	}
	
	

	@Override
	public String toString() {
//		return "\\U" + code;
		return Character.toString((char) code) ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unicode other = (Unicode) obj;
		if (code != other.code)
			return false;
		return true;
	}
}
