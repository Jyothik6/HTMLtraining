package com.example.demo.entities;                                                                     
import jakarta.persistence.Entity;                                                                     
import jakarta.persistence.GeneratedValue;                                                             
import jakarta.persistence.GenerationType;                                                             
import jakarta.persistence.Id;                                                                         
import jakarta.persistence.OneToOne;                                                                   
@Entity                                                                                                
public class Account {                                                                                 
	@Id                                                                                                
    @GeneratedValue(strategy = GenerationType.IDENTITY)                                                
    private int id;                                                                                    
	private String accountNumber;                                                                      
    private double balance;                                                                            
    public Account() {                                                                                 
    }                                                                                                  
	public Account(int id, String accountNumber, double balance) {                                     
		super();                                                                                       
		this.id = id;                                                                                  
		this.accountNumber = accountNumber;                                                            
		this.balance = balance;                                                                        
	}                                                                                                  
	public Account( String accountNumber, double balance) {                                            

		this.accountNumber = accountNumber;                                                            
		this.balance = balance;                                                                        
	}                                                                                                  
    public int getId() {                                                                               
		return id;                                                                                     
	}                                                                                                  
	public void setId(int id) {                                                                        
		this.id = id;                                                                                  
	}                                                                                                  
	public String getAccountNumber() {                                                                 
		return accountNumber;                                                                          
	}                                                                                                  
	public void setAccountNumber(String accountNumber) {                                               
		this.accountNumber = accountNumber;                                                            
	}                                                                                                  
	public double getBalance() {                                                                       
		return balance;                                                                                
	}                                                                                                  
	public void setBalance(double balance) {                                                           
		this.balance = balance;                                                                        
	}                                                                                                  
	public void withdraw(double amount) {                                                              
        if (amount > 0 && amount <= balance) {                                                         
            balance -= amount;                                                                         
            System.out.println("Withdrawal successful. Remaining balance: " + balance);                
        }                                                                                              
    }                                                                                                  
	public void deposit(double amount) {                                                               
        if (amount > 0) {                                                                              
            balance += amount;                                                                         
            System.out.println("Deposit successful. Updated balance: " + balance);                     
        }                                                                                             
    }                                                                                                  
	public void transfer(Account recipient, double amount) {                                           
        if (amount > 0 && amount <= balance) {                                                         
            withdraw(amount);                                       
            recipient.deposit(amount);                              
            System.out.println("Transfer successful. Transferred: " + amount);                         
        }                                                                                               
    }                                                                                                  
	@Override                                                                                          
	public String toString() {                                                                         
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}                                                                                                  

}                              