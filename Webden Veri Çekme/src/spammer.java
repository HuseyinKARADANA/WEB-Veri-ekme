import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class spammer {
    public static void main(String[] args) throws AWTException {
        Robot robot=new Robot();
        Scanner input=new Scanner(System.in);
        System.out.println("Write send message");
        String text=input.nextLine();
        
        StringSelection stringSelection=new StringSelection(text);
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        
        System.out.println("Start the Spamming");
        while (true) {            
            try {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            
                Thread.sleep(100); 
            } catch (InterruptedException ex) {
                Logger.getLogger(spammer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}
