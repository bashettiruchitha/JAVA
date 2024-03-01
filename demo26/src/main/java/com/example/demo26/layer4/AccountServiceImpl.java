package com.example.demo26.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo26.layer2.Account;
import com.example.demo26.layer3.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepository accountrepo;
    @Override
    public Account addaccount(Account account)
    {
        return accountrepo.save(account);

    }
    @Override
    public Account updateAccount(int id, Account UpdateAccount) {
    Account account =accountrepo.findById(id);
    if(UpdateAccount.getAccname()!=null)
    {
        account.setAccname(UpdateAccount.getAccname());

    }
        if(UpdateAccount.getAccbal()!=0.0){
        account.setAccbal(UpdateAccount.getAccbal());

    }
    return  accountrepo.save(account);

    }
    @Override
    public void removeaccount(int id) {
    accountrepo.deleteById(id);
    }
   @Override
   public Account getAccountById(int id) {
        return accountrepo.findById(id);
    }
    @Override
    public  List<Account> getAllAccount() {
    return accountrepo.findAll();
    }

    
}

