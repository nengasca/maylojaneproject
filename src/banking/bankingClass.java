package banking;

public class bankingClass {
    
    int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
        
        return acc == accountNo && pn == pin;
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
    
    
    
}
