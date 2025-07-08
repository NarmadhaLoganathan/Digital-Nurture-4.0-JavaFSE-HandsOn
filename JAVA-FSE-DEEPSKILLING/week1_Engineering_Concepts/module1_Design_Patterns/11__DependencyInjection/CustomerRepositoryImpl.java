import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put(1, new Customer(1, "Narmadha"));
        customers.put(2, new Customer(2, "Pavithra"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}
