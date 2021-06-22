public class TernaryExample {
    public static void main(String args[]) {
        int age = 25;
        boolean hasVoterId = false;
        String output;

        /*
        if(age >= 18) {
            output = "Can vote";
        }
        else {
            output = "Cannot vote";
        }

        System.out.println(output);
         */

        /*
        output = (age >= 18) ? "Can vote" : "Cannot vote";

        System.out.println(output);
         */
        //System.out.println((age >= 18) ? "Can vote" : "Cannot vote");

        /*
        long ifStartTime = System.currentTimeMillis();
        System.out.println("If Start Time: " + ifStartTime);
        if(age >= 18) {
            if(hasVoterId) {
                output = "Can vote";
            }
            else {
                output = "Cannot vote";
            }
        }
        else {
            output = "Cannot vote";
        }
        long ifEndTime = System.currentTimeMillis();
        System.out.println("If End Time: " + ifEndTime);
        long ifDiffTime = ifEndTime - ifStartTime;

        long ternaryStartTime = System.currentTimeMillis();
        System.out.println("Ternary Start Time: " + ternaryStartTime);
        output = (age >= 18) ? (hasVoterId ? "Can vote" : "Cannot vote") : "Cannot vote";
        long ternaryEndTime = System.currentTimeMillis();
        System.out.println("Ternary End Time: " + ternaryEndTime);

        System.out.println(output);

         */
        if(age >= 18)
            output = "Can vote";
        else
            output = "Cannot vote";
        System.out.println("Just a statement");

        System.out.println(output);
    }
}