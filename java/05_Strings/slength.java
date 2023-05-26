public class slength {
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    //     String fullname = "Anil Kumar";
    //    System.out.println(fullname.length()) ;
    
     String firstname = "Anil";
    //  String lastname = "Kumar";
    //  String fullname = firstname + " " + lastname;
    //  System.out.println(fullname);

     printletters(firstname);

    }
}
