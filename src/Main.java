public class Main {
    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("Weekday");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekend");
                break;
        }
    }
}