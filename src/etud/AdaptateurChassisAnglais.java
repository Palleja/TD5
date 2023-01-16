package etud;

public class AdaptateurChassisAnglais implements Voiture{
    private ChassisAnglais chassisAnglais;

    public AdaptateurChassisAnglais(ChassisAnglais chassisAnglais) {
        this.chassisAnglais = chassisAnglais;
    }

    @Override
    public float getPrix() {
        return chassisAnglais.getPrice();
    }

    @Override
    public float getMasse() {
        return chassisAnglais.getMass();
    }

    @Override
    public float getPuissanceMoteur() {
        return chassisAnglais.getEnginePower();
    }

    @Override
    public float getRegimeOptimal() {
        return chassisAnglais.getOptimalRegime();
    }

    @Override
    public float getForceFreinageCst() {
        return chassisAnglais.getBreakingForceCst();
    }

    @Override
    public float getCoeffFreinageProp() {
        return chassisAnglais.getCoeffBreaking();
    }

    @Override
    public float getRapportRouesMoteur() {
        return chassisAnglais.getMotorWheelRatio();
    }

    @Override
    public float getRayonRoues() {
        return chassisAnglais.getWheelRadius();
    }
}
