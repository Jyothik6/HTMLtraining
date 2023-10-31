package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.entities.Account;
import com.example.demo.repository.AccountRepository;

@SpringBootApplication
public class SpringJpaAssignmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaAssignmentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AccountRepository repository) {
        return (args) -> {
          
            Account account1 = new Account("465768789", 768875d);
            Account account2 = new Account("897675653", 908875d);
            Account account3 = new Account("465435647", 238875d);
            Account account4 = new Account("576844893", 783627d);

     

            repository.save(account1);
            repository.save(account2);
            repository.save(account3);
            repository.save(account4);
            
            Account acc= repository.findById(2).get();
            acc.withdraw(24490d);
            repository.save(acc);

           Account acc1 = repository.findById(3).get();
            acc1.deposit(13378d);
            repository.save(acc1);

            Account acc2 = repository.findById(1).get();
            Account acc3 = repository.findById(4).get();
           
            acc2.transfer(acc3, 233907d);
            repository.save(acc2);
            repository.save(acc3);

            repository.findAll().forEach(System.out::println);
        };
    }
}
