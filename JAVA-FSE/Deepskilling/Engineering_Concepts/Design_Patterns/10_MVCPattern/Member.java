public class Member {
    private String name;
    private String memberId;
    private String role;

    public Member(String name, String memberId, String role) {
        this.name = name;
        this.memberId = memberId;
        this.role = role;
    }

    
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
