/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/*
 * returns a if it is contained in string b
 * returns an empty string if a is not contained in b
 * @param a potential substring of a
 * @param b potentially contains a
 * @return a if a is contained in b
 * @see String
 */
public class ReclamationProject {
    static String doit(String a,String b) {

        if (a.length() > b.length()) { // if a is longer than b, switch two variables using temp c
            String c = a;
            a = b;
            b = c;
        }
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            //works forward through string a
            for (int j = a.length() - i; j > 0; j--) {
                //works backwards through string a
                for (int k = 0; k < b.length() - j; k++) {
                    //works backwards through string b
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        //changed to a conditional statement
                        r = a.substring(i, i + j);
                    }
                }
            }
        } return r;
    }
}
