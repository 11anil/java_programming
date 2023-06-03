public class Oops {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.Pencolor);
    }
}

class Pen{
    String Pencolor;
    int Tip;


    void setcolor(String newColor){
        Pencolor = newColor;

       
    }
}
