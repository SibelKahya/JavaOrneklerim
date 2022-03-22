import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Sibel","Kahya"));
        customers.add(new Customer(2,"Eymen","Kahya"));
        customers.add(new Customer(3,"Musab","Gönülaçar"));

        for (Customer customer:customers){
           System.out.println(customer.firstName);
        }

    }
}
