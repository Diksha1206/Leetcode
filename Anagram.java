import java.nio.charset.CharsetEncoder;

public class Anagram {




    public static void main(String[] args) {
        //String str1 = "geeksfor geeks" ;   ;
        //String str2 = "forgeeksgeeks";

        String str1 = "abcd" ;   ;
        String str2 = "xyz";

        char[] charStr1 = str1.replace(" ", "").toLowerCase().toCharArray();
        char[] charStr2 = str2.replace(" ", "").toLowerCase().toCharArray();

        int [] array = new int[256];
        
        if(charStr1.length != charStr2.length) {
            System.out.println("The strings are not anagrams");
            return;
        }

        for(int i=0; i<charStr2.length; i++) {
            //System.out.println(array[charStr1[i] - 'a']);
            //System.out.println(array[charStr2[i] - 'a']);

            array[charStr1[i]-'a']++;
            array[charStr2[i]-'a']--;
        }

        for(int i=0; i<array.length; i++) {
            System.out.println(i +" "+array[i]);
        }

    }
    
}
