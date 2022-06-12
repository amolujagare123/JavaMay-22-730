package Pro;

public class ReapeatCharacter {

    public static void main(String[] args) {

        String s = "aaaaaabbbbcccdddeaabc";
        int distinct = 1;

        String result = "";
        for (int i = 1; i < s.length(); i++) {



                if (s.charAt(i-1) == s.charAt(i)) {
                    distinct++;

                }
                else
                {

                    result = result + s.charAt(i-1)+distinct;
                    distinct =1;
                }

        }
        System.out.println(result);
    }
}
