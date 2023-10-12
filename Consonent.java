public class Consonent {

    public static void main(String[] args) {
        
        String str = "Hello man how are you";
        int vcount = 0;
        int ccount=0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
        
         if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
          
            vcount++;
         }

         else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
           
            ccount++;

         }
        
        }
         System.out.println("The numbers of vowels is "+ccount);
         System.out.println("The nubers of consonant is "+vcount);
}
}