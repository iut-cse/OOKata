public abstract class Toy {
   private int numOfLimbs;
   private String shapeOfBody;
   private String weapon;

   //Constructor disi so object diei value pass korte parsi ,setter lage nai
    public Toy(int numOfLimbs, String shapeOfBody, String weapon) {
        this.numOfLimbs = numOfLimbs;
        this.shapeOfBody = shapeOfBody;
        this.weapon = weapon;
    }

    //private kora tai onno jayga theke access korte parbo na that's why getter use korsi

    public int getNumOfLimbs() {
        return numOfLimbs;
    }

    public String getShapeOfBody() {
        return shapeOfBody;
    }

    public String getWeapon() {
        return weapon;
    }

    abstract String soundOfWeapon();
   // abstract void act();
        // eita rakhle porer class gula o abstract kora lagbe
        //mane kono ekta class a shob use na kora porjonto, tar object banaite parbo na???
}
