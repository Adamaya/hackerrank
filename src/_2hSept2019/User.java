package _2hSept2019;

public class User {
    private String uName;
    private String companyNmae;
    private String dateOfJoining;
    private String uEmail;
    private String uPassword;

    public User(String uName, String companyNmae, String dateOfJoining) {
        this.uName = uName;
        this.companyNmae = companyNmae;
        this.dateOfJoining = dateOfJoining;
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

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
