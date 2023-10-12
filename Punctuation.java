public class Punctuation {
    
    public static void main(String[] args) {
             int count=0;
        String str ="Th!e Ro,yal Eve;nin.g";
   

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
