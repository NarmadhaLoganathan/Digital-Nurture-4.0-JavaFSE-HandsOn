public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository); // Dependency Injected

        service.displayCustomer(1);
        service.displayCustomer(3); // Non-existing ID
    }
}
