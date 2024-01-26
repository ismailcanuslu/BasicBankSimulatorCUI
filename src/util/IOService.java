package util;

import model.Customer;

import java.io.*;

public class IOService {
    public void fileCheck(){
        File balances = new File("Balances.txt");
        File userInfo = new File("userInfo.txt");
        try {
            if (balances.exists());
            else {
                balances.createNewFile();
            }
        }
        catch (IOException e){

        }
        try {
            if (userInfo.exists());
            else {
                userInfo.createNewFile();
            }
        }
        catch (IOException e){

        }
    }

    public void balancePlus(int balance){
        IOService ioService = new IOService();
        int temp = ioService.balanceRead();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("balances.txt"))){
            writer.write(String.valueOf(balance+temp));
        }
        catch (IOException e){

        }
    }

    public void balanceMinus(int balance){
        IOService ioService = new IOService();
        int temp = ioService.balanceRead();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("balances.txt"))){
            writer.write(String.valueOf(temp-balance));
        }
        catch (IOException e){

        }
    }

    public int balanceRead(){
        Customer customer = new Customer();
        try(BufferedReader reader = new BufferedReader(new FileReader("balances.txt"))){
            String satir;
            if ((satir = reader.readLine())!=null){
                try{
                    int balance = Integer.parseInt(satir);
                    customer.setCurrentBalance(balance);
                }
                catch (NumberFormatException e){

                }
            }
        }
        catch (IOException e){

        }
        return customer.getCurrentBalance();
    }





}

