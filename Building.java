public class Building{

    public int floors, occupants;
    public double area;
    public void areaperperson() {
        System.out.println("Area per person is :"+area/occupants);
    }
}
