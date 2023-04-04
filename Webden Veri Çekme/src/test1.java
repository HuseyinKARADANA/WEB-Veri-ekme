
import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class test1 {

   public static String coin(){
       double coinPrice=0;
    String coinNames="";
    try {
        
            Document doc=Jsoup.connect("https://coinmarketcap.com/currencies/bitcoin/").get();
            Elements price=doc.getElementsByClass("priceValue ");//
            Elements coinName=doc.getElementsByClass("fLa-dNu");
            String p=price.text().toString();
            String n=coinName.text().toString();
            p=p.replace("$","");
            p=p.replace(",","");
            String text=n+" "+p+"$";
            
            coinPrice=Double.parseDouble(p);
            System.out.println(coinPrice);
            return text;
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
    }
    
   

    public static void main(String[] args) {
        ArrayList<Double> data=new ArrayList<>();
        double coinPrice=0;
        String coinNames="";
        try {
            Document doc=Jsoup.connect("https://www.sabah.com.tr/finans/altin/gram-altin-fiyati").get();
            Element price=doc.getElementsByClass("altin-kutu-box-left").first();//
            Element coinName=doc.getElementsByClass("altin-kutu-head-left").first();
            String p=price.text().toString();
            String n=coinName.text().toString();
            
            System.out.println(n+"\n"+p);
            
            
            
            
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
}
}
