/*2. Sort the string composed of only [a-z,A-Z] chars in ascending order in linear Time.*/
package march.week2.assignment8;

public class Qst2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="JavaForDataStructureAndAlgorithm";

        int [] lowerCase=new int[26];
        int [] upperCase=new int[26];

        for(int i=0;i<str.length();i++) {
            if (Character.isLowerCase(str.charAt(i)))//checking char as lower case
                lowerCase[str.charAt(i)-'a']++;
            else if (Character.isUpperCase(str.charAt(i)))//checking char as upper case
                upperCase[str.charAt(i)-'A']++;
        }


        int i = 0, j = 0;
        char str1[]=str.toCharArray();//conerting string into char array

        while (i < 26 && lowerCase[i] == 0)
            i++;

        while (j < 26 && upperCase[j] == 0)
            j++;
        for (int k=0;k<str.length();k++){
            if (Character.isLowerCase(str.charAt(k))){
                while (lowerCase[i] == 0)
                    i++;
                str1[k]=(char) (i + 'a');
                lowerCase[i]--;
            }
            else if (Character.isUpperCase(str.charAt(k))){
                while (upperCase[j] == 0)
                    j++;
                str1[k]=(char) (j + 'A');
                upperCase[j]--;
            }
        }
        for(int a=0;a<str1.length;a++){
            System.out.print(str1[a]);
        }
    }
}
