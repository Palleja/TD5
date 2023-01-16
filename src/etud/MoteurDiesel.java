package etud;

/** Représente un moteur diesel */
public class MoteurDiesel extends VoitureMontee{
	/** Décore une voiture avec un moteur diesel */
	public MoteurDiesel(Voiture voiture) {
		super(voiture);
	}

	public float getMasse() {
		return super.getMasse() + 500;

	}

	public float getPuissanceMoteur() {
		return super.getPuissanceMoteur() + 150;

	}

	public float getRegimeOptimal() {
		return super.getRegimeOptimal() + 2000;

	}
}
