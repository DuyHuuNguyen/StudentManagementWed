/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Account;
import Repository.AccountRepository;


/**
 *
 * @author Omni
 */
public class LoginService {
    private AccountRepository  accountRepository = new AccountRepository();
    
    private static final String LOGIN_SUCCESSFULLY = " đăng nhập thành công";
    private static final String LOGIN_UNSUCCESSFULLY  = " tài khoản không tồn tại trong hệ thống";
    private static final String PASSWORD_UNCORRECT  ="sai mật khẩu";
    private  static final String ACCOUNTID_UNCORRECT ="sai tên đăng nhập";
    public static String LOGIN_STATUS ="đăng nhập không thành công ";
    
    public Account findUser(String accountId , String pass ) { 
        try {
            Account user = accountRepository.getAccountByAccountIdAndPassword(accountId, pass);
            if ( user.isEmty()){
                LOGIN_STATUS = LOGIN_UNSUCCESSFULLY ;
            } else if (user.isUnvalidableAccountId(accountId, pass) ){
                LOGIN_STATUS = ACCOUNTID_UNCORRECT;
            } else if (user.isUnvalidablePassword(accountId, pass)){
                LOGIN_STATUS = PASSWORD_UNCORRECT;
            } else if ( user.isValidableAccoutIdAndPassword(accountId, pass) ) {
                LOGIN_STATUS = LOGIN_SUCCESSFULLY;
                return user;
            }        
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
       
    }
   
}
