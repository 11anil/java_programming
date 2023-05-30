public class equal {
    public static String substring(String str,int si, int ei){
     String substr = "";
     for(int i=si; i<ei; i++){
        substr += str.charAt(i);
     }
     return substr;
    }

    
    public static void main(String args[]){
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1==s2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // if(s1==s3){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        // String str = "HELLOWORLD";
        // // System.out.println(substring(str, 0, 5));
        // System.out.println(str.substring(0,5));



        // String fruits[]= {"Mango" ,"Apple" ,"Banana"};
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
// System.out.println(largest);

StringBuilder sb = new StringBuilder("");
for(char ch = 'a'; ch <= 'z'; ch++){
 sb.append(ch);
    }//abcdefghijkl
    //O(26)
    //O(n^2)
    System.out.println(sb.length());
}
}
//this method(.equals) is used when the value of strings are same