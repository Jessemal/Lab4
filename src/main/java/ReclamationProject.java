/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * returns a if it is contained in string b.
 * returns an empty string if a is not contained in b.
 */
public class ReclamationProject {
    /**
     * returns a if it is contained in string b.
     * returns an empty string if a is not contained in b.
     * @param a is a cool string
     * @param b potentially contains a
     * @return a if a is contained in b
     */
    static String doit(final String a, final String b) {
        String first = a;
        String second = b;
        if (a.length() > b.length()) { // if a is longer than b, switch two variables using temp c
            String c = a;
            first = b;
            second = c;
        }
        String r = "";
        for (int i = 0; i < first.length(); i++) {
            //works forward through string a
            for (int j = first.length() - i; j > 0; j--) {
                //works backwards through string a
                for (int k = 0; k < second.length() - j; k++) {
                    //works backwards through string b
                    if (first.regionMatches(i, second, k, j) && j > r.length()) {
                        //changed to a conditional statement
                        r = first.substring(i, i + j);
                    }
                }
            }
        } return r;
    }
}
