package _2hSept2019;

public class User {
    private String uName;
    private String companyNmae;
    private int dateOfJoining;
    private String uEmail;
    private String uPassword;

    public User(String uName, String companyNmae, int dateOfJoining) {
        this.uName = uName;
        this.companyNmae = companyNmae;
        this.dateOfJoining = dateOfJoining;
        this.uEmail = createUserEmail();
    }

    private String createUserEmail() {
        return String.format("%s_%d@%s", getuName(), getDateOfJoining(), getCompanyNmae());
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public void setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
    }

    public int getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(int dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getuEmail() {
        return uEmail;
    }

    public String getuPassword() {
        return uPassword;
    }
}
