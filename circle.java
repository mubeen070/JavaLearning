public class circle {
    private double radius;

    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getCircumference(){
        return  2*3.14*radius;
    }

}
