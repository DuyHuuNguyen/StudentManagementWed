/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Omni
 */
public class Account {

    private String accountId;
    private String password;
    private int studentId;

    public Account() {}
    
    public Account(String accountId, String password, int studentId) {
        this.accountId = accountId;
        this.password = password;
        this.studentId = studentId;
    }
  
    public boolean isValidableAccoutIdAndPassword(String accountId , String pass ){
        return this.password.equals(pass) && this.accountId.equals(accountId);
    }
   
    public boolean isUnvalidablePassword(String accountId , String pass ){
        return !this.password.equals(pass) && this.accountId.equals(accountId);
    }

     public boolean isUnvalidableAccountId(String accountId , String pass ){
        return this.password.equals(pass) && !this.accountId.equals(accountId);
    }
  
    public boolean isEmty(){
        return this.getAccountId() == null && this.getPassword() == null;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", password=" + password + ", studentId=" + studentId + '}';
    }
    
}
