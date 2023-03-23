package produit;

public enum Unite {
	LITRE("l"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("piece");
	
	private String sigle;

	private Unite(String sigle) {
		this.sigle = sigle;
	}

	public String getSigle() {
		return sigle;
	}
	
}
