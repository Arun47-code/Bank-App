
package com.mycompany.bankapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author arun
 */
public class Utility {
    
    public static ArrayList<Account> readfile(String fileName){
    
    ArrayList<Account> account = new ArrayList<>();
    
    try{
    
    FileReader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);
    String line;
    
    while((line = br.readLine()) != null){
        
    String[] currentAccount = line.split("<>");  
    String accNumber = currentAccount[0];
    String accHolder = currentAccount[1];
    String openDate = currentAccount[2];
    double balance = Double.parseDouble(currentAccount[3]);
    
    Account acc = new Account(accNumber, accHolder, openDate, balance);
    account.add(acc);
    
}
    br.close();
    
}

catch(Exception e){

 System.out.println(e);
}
return account;
}
    public static void writefile(ArrayList<Account> account, String fileName){
        try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Account a: account){
                bw.write(a.toString() + "<>" + a.getAccountHolder() + "<>" + a.getOpenDate() + "<>" + String.valueOf(a.getBalance()) +"\n");
            }
            bw.close();
            }
        catch(Exception e){
           System.out.println(e);
        }
    }

}
