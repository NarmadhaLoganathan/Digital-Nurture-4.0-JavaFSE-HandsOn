public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository; // Constructor Injection
    }

    public void displayCustomer(int id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println(customer.getDetails());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
