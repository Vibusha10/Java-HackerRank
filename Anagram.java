import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if (a.length() != b.length()){
            return false;
        }
        
        for (int i = 0 ; i<a.length();i++){
            int countA = 0;
            int countB = 0;
            for (int j = 0 ; j<a.length(); j++){
                if(a.charAt(i) == a.charAt(j)){
                    countA++;
                }
                if(a.charAt(i) == b.charAt(j)){
                    countB++;
                }
            }
            if(countA==countB){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
