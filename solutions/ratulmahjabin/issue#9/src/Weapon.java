abstract class Toy {

    private double height;
    private String bodyColor;
    private String weapon;

    public Toy(double height, String bodyColor, String weapon) {
        this.height = height;
        this.bodyColor = bodyColor;
        this.weapon = weapon;

    }

    public double getHeight() {
        return height;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getWeapon() {
        return weapon;
    }

    abstract void entertain();

    abstract void act();

}

class Bulk extends Toy {

    public Bulk(double height, String bodyColor, String weapon) {
        super(height, bodyColor, weapon);
    }

    @Override
    void entertain() {
        System.out.println(getWeapon()+ " sounds: Bump");
    }

    @Override
    void act() {
        System.out.println("Moon Jump");
    }
}

class Dogverine extends Toy {

    public Dogverine(double height, String bodyColor, String weapon) {
        super(height, bodyColor, weapon);

    }

    @Override
    void entertain() {
        System.out.println(getWeapon()+" sounds: Slash");
    }

    @Override
    void act() {
        System.out.println("Run super fast");
    }
}

class WhiteShadow extends Toy {

    public WhiteShadow(double height, String bodyColor, String weapon) {
        super(height, bodyColor, weapon);
    }

    @Override
    void entertain() {
        System.out.println(getWeapon()+" sounds: Pew Pew");
    }

    @Override
    void act() {
        System.out.println("Become Invisible");
    }
}