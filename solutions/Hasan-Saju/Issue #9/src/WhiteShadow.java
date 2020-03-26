public class WhiteShadow extends Toy {

    public WhiteShadow(int numOfLimbs, String shapeOfBody, String weapon) {
        super(numOfLimbs, shapeOfBody, weapon);
    }

    @Override
    String soundOfWeapon() {
        return "Pew pew";
    }
}
