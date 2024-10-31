package Polymorphism;

public class Ques2 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Bank obj1 = new PNB();
        Bank obj2 = new SBI();
        obj.RateofInterest();
        obj1.RateofInterest();
        obj2.RateofInterest();

    }
}
 class Bank{
    void RateofInterest(){

        System.out.println("Rate Of interest of Bank 5%");
    }

 }
 class SBI extends Bank{
    void Rateofinterest(){
        System.out.println("Rate of interest of bank is 5%");
    }
 }
 class PNB extends Bank{
     @Override
     void RateofInterest() {
         System.out.println("Rate of Interest of Bank is 6%");
     }
 }
 class HDFC extends Bank{
     @Override
     void RateofInterest() {
         super.RateofInterest();
         System.out.println("Rate of interest of Bank is 5.5%");
     }
 }
