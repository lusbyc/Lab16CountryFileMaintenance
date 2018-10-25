
public class Country {
	public String countryName;

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public static void setCountryName(String countryName) {
		countryName = countryName;
	}

	@Override
	public String toString() {
		return "Newest Addition(s) to List: " + countryName;
	}
	
	

}
