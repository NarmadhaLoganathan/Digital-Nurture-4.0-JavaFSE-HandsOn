public class PCBuilderTest {
    public static void main(String[] args) {
        PC studentPC = new PC.PCBuilder()
                .processor("Ryzen 5")
                .memory("8GB")
                .disk("256GB SSD")
                .wifiEnabled(true)
                .build();

        System.out.println("Student PC Configuration:");
        studentPC.displayInfo();

        System.out.println("\n---------------------------\n");

        PC budgetPC = new PC.PCBuilder()
                .processor("Intel i3")
                .memory("4GB")
                .disk("500GB HDD")
                .wifiEnabled(false)
                .build();

        System.out.println("Budget PC Configuration:");
        budgetPC.displayInfo();
    }
}
