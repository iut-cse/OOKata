public class Thor extends Toy {

    public Thor(int numOfLimbs, String shapeOfBody, String weapon) {
        super(numOfLimbs, shapeOfBody, weapon);
    }

    @Override
    String soundOfWeapon() {
        return "Bump";
    }
}
