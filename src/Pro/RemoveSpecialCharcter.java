package Pro;

public class RemoveSpecialCharcter {
    public static void main(String[] args) {
        String inputString = "$Jy%o&ti#";
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String outPutString = "";
        for (int i=0; i < inputString.length() ; i++)
        {
            char ch = inputString.charAt(i);
            if(!specialCharactersString.contains(ch+"")) {
                outPutString = outPutString + ch;
            }

        }


        StringBuilder sb=new StringBuilder(outPutString);
        sb.reverse();



        String str = sb.toString();

        // $Jy%o&ti#  --> $it%o&yj#

        String finalOutput = "$"+str.charAt(0)+str.charAt(1)+"%"
                +str.charAt(2)+"&"+str.charAt(3)+str.charAt(4)+"#";

        System.out.println(finalOutput);
    }
}
