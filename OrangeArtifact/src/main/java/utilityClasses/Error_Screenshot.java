package utilityClasses;
 
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;

import org.junit.Assert;

import sun.util.calendar.LocalGregorianCalendar.Date;
 
public class Error_Screenshot {
	static Robot robot;
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	static Date date;	
    public static void ScreenSave(String elementType) {
        try {
            
            String format = "bmp";
            String fileName = "D:\\OrangeProject_Screen\\"+elementType+".bmp";
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
            
        } catch (IOException ex) {
            
        }
    }
    
    public static void uploadFileWithRobot (String imagePath) {
        StringSelection stringSelection = new StringSelection("D:\\Im");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
 
        robot = null;
 
        try {
            robot = new Robot();
        } catch (AWTException e) {
            Assert.fail();
        }
 
        robot.delay(6000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}