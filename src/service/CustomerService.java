package service;

import model.Customer;
import util.IOService;

import java.util.Scanner;

public class CustomerService {
    public void bakiyeSorgu(){
        System.out.println("Bakiye sorgu islemi secildi.");
        IOService ioService = new IOService();
        Customer customer = new Customer();
        System.out.println("Guncel bakiyeniz: "+ ioService.balanceRead()+" TRY");
    }
    public void paraCekme(){
        System.out.println("Para cekme islemi secildi.");
        System.out.println("Cekmek istediginiz miktari lutfen giriniz. 5 ve 5'in katlari cekilebilir.");

        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        IOService ioService = new IOService();

        boolean passTrueNumberValidition = false;
        while(!passTrueNumberValidition){
            int paraCek = scanner.nextInt();
            if (paraCek % 5 != 0){
                System.out.println("5 ve 5'in katlari cekilebilir. Tekrar deneyin");
            }
            if (paraCek < 0 || paraCek == 0) {
                System.out.println("Gecersiz miktar. Tekrar deneyin");
            }
            if (paraCek % 5 == 0 && paraCek > 0 ){
                passTrueNumberValidition = true;
                ioService.balanceMinus(paraCek);
                System.out.println("Para cekme islemi tamamlandi. Guncel bakiyeniz: "+ ioService.balanceRead() + " TRY");
            }

        }
    }

    public void paraYatirma(){
        System.out.println("Para yatirma islemi secildi.");
        System.out.print("Lutfen tutari giriniz: ");
        Scanner scanner = new Scanner(System.in);
        IOService ioService = new IOService();

        boolean passValidition = false;
        while(!passValidition){
            int paraEkle = scanner.nextInt();
            if (paraEkle % 5 != 0){
                System.out.println("5 ve 5'in katlari yatirilabilir. Tekrar deneyin");
            }
            if (paraEkle < 0 || paraEkle == 0) {
                System.out.println("Gecersiz miktar. Tekrar deneyin");
            }
            if (paraEkle % 5 == 0 && paraEkle > 0){
                passValidition = true;
                Customer customer = new Customer();
                customer.setCurrentBalance(customer.getCurrentBalance()+paraEkle);
                System.out.println("Para yatirma islemi tamamlandi. Guncel bakiyeniz: "+ (ioService.balanceRead()+paraEkle) +" TRY");
                ioService.balancePlus(customer.getCurrentBalance());
            }

        }
    }
    public void cikis(){
        System.out.println("Güle güle!");
    }
}
