public class TestEmployee {
    public static void main(String[] args) {


        Employee emp1 = new Employee("Ali", "Ahmad", 9696);
        Employee emp2 = new Employee("Talha", "Irfan", 8595);

        System.out.println(emp1.getFirstName()+"  "+ emp1.getLastName()  + "'s monthly salary is " + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName()+"  "+ emp2.getLastName() + "'s monthly salary is " + emp2.getMonthlySalary());

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);
        
        System.out.println("\nSalary after 10% boost\n");
        System.out.println(emp1.getFirstName()+" "+ emp1.getLastName() + "'s monthly salary is " + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName()+" "+ emp2.getLastName()+ "'s monthly salary is " + emp2.getMonthlySalary());
    }
}