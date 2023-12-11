
package model;


public class Account {

    private String userName;
    private String gmail;
    private String pass;
    private Integer role;

    public Account() {
    }

    public Account(String userName, String gmail, String pass) {
        this.userName = userName;
        this.gmail = gmail;
        this.pass = pass;
    }

    public Account(String userName, String gmail, String pass, Integer role) {
        this.userName = userName;
        this.gmail = gmail;
        this.pass = pass;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", gmail=" + gmail + ", pass=" + pass + '}';
    }

}
