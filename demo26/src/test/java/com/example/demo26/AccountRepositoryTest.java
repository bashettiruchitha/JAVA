package com.example.demo26;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo26.layer2.Account;
import com.example.demo26.layer3.AccountRepository;

@SpringBootTest
public class AccountRepositoryTest {
    @Autowired
    AccountRepository accrRepository;

    @Test
     public void  addaccount()
    {
        Account Account = new Account();
		Account.setAccno(11);
		Account.setAccname("ruchithaaa");
		Account.setAccbal(100000);
		accrRepository.save(Account);

    }

    @Test
    public Account updateAccount(int id, Account UpdateAccount) {
        Account account =accrRepository.findById(11); 
        return  accrRepository.save(account);

    }
    @Test
    public void removeaccount(int id) {
        accrRepository.deleteById(1);
        }

    @Test
    public Account getAccountById(int id) {
        return accrRepository.findById(1);
    }
    @Test
     public  List<Account> getAllAccount() {
    return accrRepository.findAll();
    }
}
