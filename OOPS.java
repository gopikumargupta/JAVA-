public class OOPS{
    public static void main(String args[]){
        Pen p = new Pen();
        p.setColour("black");
        System.out.println(p.colour);
        p.setTip(5);
        System.out.println(p.tip);
    }

}
class Pen{
    String colour;
    int tip;
    void setColour(String newColour){
        colour = newColour;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}