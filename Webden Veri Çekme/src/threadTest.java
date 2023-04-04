
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javafx.concurrent.Task;
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
public class threadTest {
    
    public static void main(String[] args) throws InterruptedException {
        double coinPrice=0;
        
        Thread thread = new Thread(new eth());
        thread.start();
        coinPrice=eth.price;
        thread.join();//it will kill you thread
        Thread.sleep(50000);
        Thread thread1 = new Thread(new eth());
        thread.start();
        
    }
}
