public class palindrome {
    public static boolean ispalindrome(String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome


                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
       
        System.out.println(ispalindrome(str));      
    }
}
