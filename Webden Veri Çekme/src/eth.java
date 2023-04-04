
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huseyinkaradana
 */
public class eth implements Runnable{
    public static double price=0;
    
    public static double fiyatDondur(){
        
        return price;
    }

    
    
    @Override
    public void run() {
         double coinPrice=0;
        String coinNames="";
        try {
            Document doc=Jsoup.connect("https://www.binance.com/tr/price/bitcoin").get();
            Element price=doc.getElementsByClass("css-12ujz79").first();
           
            Element coinName=doc.getElementsByClass("css-azwkv").first();
            String p=price.text().toString();
            String n=coinName.text().toString();
            p=p.replace("$", "");
            p=p.replace(",", "");
            this.price=Double.parseDouble(p);
            System.out.println(n+"\n"+p);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
