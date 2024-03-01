package com.example.demo26.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo26.layer2.Account;
import com.example.demo26.layer4.AccountService;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/add")
     public Account addaccount(@RequestBody Account account)
     {
        return accountService.addaccount(account);

    }
    @PutMapping("/update/{id}")
    public Account updateAccount(@PathVariable int id,@RequestBody Account UpdateAccount) {
        return  accountService.updateAccount(id,UpdateAccount);
    
}
@DeleteMapping("/remove/{id}")
public void removeaccount(@PathVariable int id) {
    accountService.removeaccount(id);
}
@GetMapping("/get/{id}")
public Account getAccountById(@PathVariable int id) {
    return accountService.getAccountById(id);
}
@GetMapping("/getAll")
public List<Account> getAllAccount() {
    return accountService.getAllAccount();
 }
}
