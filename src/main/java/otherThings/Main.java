package otherThings;



public class Main {

    public static int reverse(int x) {

        //Reversing a string using StringBuilder

        StringBuilder string
                = new StringBuilder(String.valueOf(x));

        // reversing the string
        if(x<0){
            string.append("-").reverse().deleteCharAt(string.length()-1);
        }


        else{
            string.reverse();
        }
        // converting string to integer
        x = Integer.parseInt(String.valueOf(string));

        // returning integer
        return x;

    }

    public static void main(String[] args) {
        System.out.println(reverse(153));
    }
}
