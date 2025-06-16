public class MemberController {
    private Member model;
    private MemberView view;

    public MemberController(Member model, MemberView view) {
        this.model = model;
        this.view = view;
    }

    public void setMemberName(String name) {
        model.setName(name);
    }

    public void setMemberRole(String role) {
        model.setRole(role);
    }

    public String getMemberName() {
        return model.getName();
    }

    public String getMemberId() {
        return model.getMemberId();
    }

    public String getMemberRole() {
        return model.getRole();
    }

    public void updateView() {
        view.displayMemberDetails(model.getName(), model.getMemberId(), model.getRole());
    }
}
