package com.example.demo21;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo21.layer2.CurrentAccount1;
import com.example.demo21.layer3.AccountRepository;

@SpringBootTest
class Demo21ApplicationTests {
	@Autowired
	AccountRepository  accrepo;

	@Test
	public void insertAccount () {
	CurrentAccount1 currentAccount1=new CurrentAccount1();
	currentAccount1.setAcid(101);
	currentAccount1.setAccname("ruchitha");
	currentAccount1.setBalance(5000);
	accrepo.save(currentAccount1);
	}

	@Test
	public void updateAccount(){
		Optional<CurrentAccount1> currOptional =accrepo.findById(101);
		if(currOptional.isPresent()){
			CurrentAccount1 acutalAccount1=currOptional.get();
			System.out.println("current details --");
			System.out.println("cureent bal"+acutalAccount1.getAcid());
			System.out.println("cureent name "+acutalAccount1.getAccname());
			System.out.println("current bal"+acutalAccount1.getBalance());
			acutalAccount1.setAccname("ruchi");
			acutalAccount1.setBalance(5000);
			accrepo.save(acutalAccount1);
			System.out.println("current details are updated");
		}else{
			throw new  RuntimeException("current details not found");
		}
	}
	@Test
	void deleteAccount(){
		Optional<CurrentAccount1> currOptional=accrepo.findById(101);
		if(currOptional.isPresent()){
			CurrentAccount1 acutalAccount1=currOptional.get();
			System.out.println("current details --");
			System.out.println("cureent bal"+acutalAccount1.getAcid());
			System.out.println("cureent name "+acutalAccount1.getAccname());
			System.out.println("current bal"+acutalAccount1.getBalance());
			accrepo.save(acutalAccount1);
			System.out.println("current details are updated");
		}else{
			throw new  RuntimeException("current details not found");
		
		}
	}
	@Test
	void selectAccount(){
		Optional<CurrentAccount1> currOptional=accrepo.findById(101);
		if(currOptional.isPresent()){
			CurrentAccount1 acutalAccount1=currOptional.get();
			System.out.println("current details --");
			System.out.println("cureent bal"+acutalAccount1.getAcid());
			System.out.println("cureent name "+acutalAccount1.getAccname());
			System.out.println("current bal"+acutalAccount1.getBalance());
			accrepo.save(acutalAccount1);

		}else{
			throw  new  RuntimeException("current account not found");
		}
	}
	@Test
	void selectallaccount(){
		List<CurrentAccount1> accountlist=(List<CurrentAccount1>) accrepo.findAll();
		for (CurrentAccount1 currentAccount1 : accountlist) {
			System.out.println("current details --");
			System.out.println("cureent bal"+currentAccount1.getAcid());
			System.out.println("cureent name "+currentAccount1.getAccname());
			System.out.println("current bal"+currentAccount1.getBalance());
			
		}
	}

}
