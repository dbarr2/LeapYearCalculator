public class LeapYear {

    //Write the main method for testing methods (these will be later converted to Junit test cases)
    public static void main(String[] args) {

        int year = 2024;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        System.out.println("-------------------"); //Expected Outcome ==> true

        year = 1999;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        System.out.println("-------------------"); //Expected Outcome ==> false

        year = 1965;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        System.out.println("-------------------"); //Expected outcome ==> false

        year = -1;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        System.out.println("-------------------"); //Expected Outcome ==> false

        year = 10000;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        System.out.println("-------------------"); // Expected outcome ==> false
    }

    public static boolean isLeapYear(int year) {

        //If the year is not within range then exit the loop and return false
        if(year < 0 || year > 9999) {
            return false;
        }

        //Find out if the year is a leap year or not
        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

}
