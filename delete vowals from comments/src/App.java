import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int [] vowals_ascci = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
        String str = "This website is for losers LOL!";
        char [] comment = str.toCharArray();
        char [] tempComment;
        char [] tempComment3 = null;
        int asciiChar = 126;
        char specChar = (char) asciiChar;
        for (int i = 0; i < comment.length; i++) {
            for (int j = 0; j < vowals_ascci.length; j++) {
                if ((int) comment [i] == vowals_ascci[j]) {
                    comment[i] = specChar;
                }
            }
        }
        int j=0;
        for (int i = 0; i < comment.length; i++) {
            if (comment[i] == specChar) {
                tempComment = Arrays.copyOfRange(comment, j, i);
                sb.append(tempComment);
                j = i+1;
            }
            tempComment3 = sb.toString().toCharArray();
        }
        tempComment = Arrays.copyOfRange(comment, j, comment.length);
        sb.append(tempComment);
        tempComment3 = sb.toString().toCharArray();
        str =  String.valueOf(comment);
        System.out.println(str);       
    }
}

