import java.sql.SQLOutput;

public class CountVowels {
    public static void main(String[] args) {
        String s1="Arpit PatidarT";
        int vowels=0;
        int consonants=0;
        int whiteSpaces=0;

        for (int i=0;i<s1.length()-1;i++){
            char ch=Character.toLowerCase(s1.charAt(i));
            if ("aeiou".indexOf(ch)!=-1)
                vowels++;
            else if(ch==' ')
                whiteSpaces++;
            else
                consonants++;
        }

        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
        System.out.println("WhiteSpaces:"+whiteSpaces);
    }
}
