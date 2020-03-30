public class BarkingDog {

    public static void main (String [] args) {

        System.out.println(shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ( barking == false || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == true && hourOfDay >= 0 && hourOfDay < 8 ){
            return true;
        } else if(barking == true && hourOfDay >=22 && hourOfDay <= 23) {
            return true;
        }
        else {
            return false;
        }
    }

}