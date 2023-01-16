package etud;
/** Représente le chassis d'une voiture. Classe de base à décorer... */
public class ChassisAnglais  {
	public float getMass() {
		return 700;
	}

	public float getEnginePower() {
		return 0;
	}

	public float getOptimalRegime() {
		return 0;
	}

	public float getBreakingForceCst() {
		return 0.00001f; // frottement sur la route
	}

	public float getCoeffBreaking() {
		return 10;
	}

	public float getMotorWheelRatio() {
		return 1.f / 3.8f; // 1/16f en moyenne pour la première vitesse d'une voiture de tourisme (d'apres
							// ADILCA)
		// environ 1/3.8 pour la 5° vitesse
	}

	public float getWheelRadius() {
		return 0.3f; // 14*0.0127f; // 14 pouces de diamètre
	}

	public float getPrice() {
		return 5000;
	}

	public String toString() {
		return "Chassis anglais";
	}
}
