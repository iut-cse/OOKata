import java.util.Random;

public class Elevator {


    private int getAFloor() {
        Random rand = new Random();
        return (int) (1 + rand.nextInt(5) % 5);
    }


//    private void moveTo(int begin, int end) {
//        if (end == begin) {
//
//        } else if (end > begin) {
//            moveUpTo(begin, end);
//        } else {
//            moveDownTo(begin, end);
//        }
//    }
//
//    private void moveUpTo(int begin, int end) {
//        System.out.println("Going up ...");
//        while (begin < end) {
//            begin++;
//            System.out.println(begin);
//        }
//        System.out.println("Leave the lift!");
//    }
//
//    private void moveDownTo(int begin, int end) {
//        System.out.println("The elevator is on its way down ...");
//        while (begin > end) {
//            begin--;
//            System.out.println(begin);
//        }
//        System.out.println("Leave the lift!");
//    }

    public boolean call(String button) {

        int begin = getAFloor();
        int end = getAFloor();
        int buttonPressedFloor = getAFloor();


        if (button.equalsIgnoreCase("Up")) // For Up
        {
            return (begin <= buttonPressedFloor && buttonPressedFloor < end) || (begin < buttonPressedFloor && buttonPressedFloor <= end);

        }

        else
            return (begin >= buttonPressedFloor && buttonPressedFloor > end) || (begin > buttonPressedFloor && buttonPressedFloor >= end); //For Down
    }


}

