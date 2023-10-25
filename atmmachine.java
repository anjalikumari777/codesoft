public class atmmachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
        
    }
    
}


class ATM{

    float Balance;
    int PIN = 5643;
    
    

    ATM(){
        scanner sc = new scannner(System.in);
        System.out.println("enter your pin:");
        Int enterdpin = sc.nextInt();
        if(enterdpin == PIN){
            menu();

        }else{
            System.out.println("enter a valid pin");
            menu();
        }

    }
    
    
    

    public void menu(){
    
        
        System.out.println("please enter valid number");
        System.out.println("1 . check balance");
        System.out.println("2 . deposit money");
        System.out.println("3 . withdraw money");
        System.out.println("4. exit");

        scanner sc = new scannner(System.in);

        int x = sc.nextInt();

        if(x == 1){
            check_balance();
        }
        else if(x == 2){
            deposite();
        }
        else if(x == 3){
            withdraw();
        }
        else if(x == 4){
            System.out.println("Thank you");
        }
        else {
            System.out.println("please enter valid no");
            menu();
        }
        

    }
    public void check_balance(){
        System.out.println("your balance" + Balance);
        menu();

    }

    public void deposite(){
        System.out.println("enter your amount");
        scanner sc = new scannner(System.in);
        float a = sc.nextfloat();
        Balance = Balance + a;
        System.out.println("amount deposited successfully");
        menu();
    }


    // to withdraw money
    public void withdraw(){
        System.out.println("enter your amount to withdraw");
        scanner sc = new scannner(System.in);
        float amount = sc.nextfloat();
        if(amount>Balance){
            System.out.println("Insufficient balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("amount withdraw successfully");
        menu();
    }
    
}

        
        



    

    
}
