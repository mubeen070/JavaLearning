public class Rectangle{
    private double length;
    private double width;
    private double perimeter;
    private double area;
    public void setLengthWidth(double l , double w){
        length = (l>0.0 && l<20.0 ? l : 0);
        width = (w>0.0 && w<20.0 ? w : 0);
    }
    public void getPerArea(){
        
        perimeter = 2*(length + width);
        area = length*width;
        System.out.println("\nPerimeter is:" + perimeter + "\nArea is:" + area);
    }


}