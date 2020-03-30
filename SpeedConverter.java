public class SpeedConverter {
    public static long ToMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }
    public static void PrintConversion(double kilomnetersPerHour) {
        if(kilomnetersPerHour < 0) {
            System.out.println("Invalid Val");
        }else {
            long milesPerHour = ToMilesPerHour(kilomnetersPerHour);
            System.out.println(kilomnetersPerHour +
                    "km/h ="+ milesPerHour +
                    "mi/h");
        }
    }
}
