public class pallindrom_string {
    public static void main(String args[]){

            String str = "Ranjani", rev_Str = "";

            int strLen = str.length();

            for (int i = (strLen - 1); i >=0; --i) {
                rev_Str = rev_Str + str.charAt(i);
            }

            if (str.toLowerCase().equals(rev_Str.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            }
            else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
}


