package cui;

import service.CustomerService;

import java.util.Scanner;

public class CommandUserInterface {
    public void hosgeldiniz(){
        System.out.println("Hosgeldiniz X Bank");
    }

    public void islemListesi(){
        System.out.println("Yapabileceginiz islemler :\n" +
                "1-)Bakiye Sorgu\n" +
                "2-)Para Cekme\n" +
                "3-)Para Yatir\n" +
                "4-)Cikis");
    }
    public void requestAction(){
        System.out.println("Hangi islemi yapmak istersiniz, tuslayin");
        Scanner scanner = new Scanner(System.in);

        int action = scanner.nextInt();
        Action(action);

    }
    public void Action(int action){
        CustomerService customerService = new CustomerService();
        if (action == 1){
            customerService.bakiyeSorgu();
        }
        if (action == 2){
            customerService.paraCekme();
        }
        if (action == 3){
            customerService.paraYatirma();
        }
        if (action == 4){
            customerService.cikis();
        }

    }
}
