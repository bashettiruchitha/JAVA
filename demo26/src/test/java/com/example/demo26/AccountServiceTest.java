package com.example.demo26;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo26.layer2.Account;
import com.example.demo26.layer4.AccountService;

@SpringBootTest
public class AccountServiceTest {
    @Autowired
    AccountService accountservice;

    @Test
     public void addaccountTest()
    {
        Account Account = new Account();
		Account.setAccno(103);
		Account.setAccname("anusha");
		Account.setAccbal(2000);
		accountservice.addaccount(Account);

    }
    @Test
    public void serviceTestingForModifyingAccount() {
		Account Account = new Account();
		Account.setAccno(12);
		Account.setAccname("RUCHI");
		Account.setAccbal(82000);
		accountservice.addaccount(Account);
	}
    @Test
    public void removeaccount(int id) 
    {
        Account account=new Account();
        account.setAccno(1);
        accountservice.removeaccount(id);
    }

        @Test
        public  void  getAccountById(int id) {
        Account account=accountservice.getAccountById(1);
        System.out.println("Account found...");
		System.out.println("acc no   : "+account.getAccno());
		System.out.println("acc name : "+account.getAccname());
		System.out.println("acc bal  : "+account.getAccbal());
           
        }
    
    @Test
    public void getAllAccount() {
		List<Account> AccountList = accountservice.getAllAccount();

		for (Account Account : AccountList) {
			System.out.println("acc no   : "+Account.getAccname());
			System.out.println("acc name : "+Account.getAccname());
			System.out.println("acc bal  : "+Account.getAccbal());		
		}
	}

    }

    

