abstract class Toy {

    double height;
    String bodyColor;

    public double getHeight() {
        return height;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    abstract void gun();

    abstract void act();

}

class Bulk extends Toy {

    public Bulk(double height, String bodyColor) {
        this.bodyColor = bodyColor;

        this.height = height;
    }

    @Override
    void gun() {
        System.out.println("Bump");
    }

    @Override
    void act() {
        System.out.println("Moon Jump");
    }
}

class Dogverine extends Toy {

    public Dogverine(double height, String bodyColor) {
        this.height = height;
        this.bodyColor = bodyColor;
    }

    @Override
    void gun() {
        System.out.println("Slash");
    }

    @Override
    void act() {
        System.out.println("Run super fast");
    }
}

class WhiteShadow extends Toy {

    public WhiteShadow(double height, String bodyColor) {
        this.height = height;
        this.bodyColor = bodyColor;
    }

    @Override
    void gun() {
        System.out.println("Pew Pew");
    }

    @Override
    void act() {
        System.out.println("Become Invisible");
    }
}







