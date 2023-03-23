package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("Poisson", Unite.KILOGRAMME);
		this.date = date;
	}
	
	public String description() {
		return "Poisson pêchés" + date;
	}
	
}
