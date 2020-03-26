public class Dogverine extends Toy {

    public Dogverine(int numOfLimbs, String shapeOfBody, String weapon) {
        super(numOfLimbs, shapeOfBody, weapon);
    }

    @Override
    String soundOfWeapon() {
        return "Slash";
    }

}
