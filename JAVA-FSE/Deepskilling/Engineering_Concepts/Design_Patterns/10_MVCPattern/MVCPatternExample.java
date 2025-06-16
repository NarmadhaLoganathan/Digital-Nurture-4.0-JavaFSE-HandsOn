public class MVCPatternExample {
    public static void main(String[] args) {
        
        Member member = new Member("Nila", "C123", "Dancer");

       
        MemberView view = new MemberView();

        MemberController controller = new MemberController(member, view);

        
        controller.updateView();

        controller.setMemberName("Narmadha");
        controller.setMemberRole("Speaker");

       
        System.out.println("\nAfter update:");
        controller.updateView();
    }
}
