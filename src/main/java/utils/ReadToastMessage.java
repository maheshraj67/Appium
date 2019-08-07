package utils;



import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class ReadToastMessage {
 
  static String scrShotDir = "screenshots";
  File scrFile;
  static File scrShotDirPath = new java.io.File("./"+ scrShotDir+ "//");
  String destFile;
  static AndroidDriver driver = null;
  public String imageconversion(AndroidDriver driver) throws IOException, TesseractException          
  {    
	  String imgName = takeScreenShot(driver);
              ITesseract instance = new Tesseract();
  //file path is the image which you need to convert to text
              File imageFile = new File(scrShotDirPath, imgName);
             // File imageFile = new File(filePath);  
              BufferedImage img = null;
              img = ImageIO.read(imageFile);
              BufferedImage blackNWhite = new BufferedImage(img.getWidth(),img.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
              Graphics2D graphics = blackNWhite.createGraphics();
              graphics.drawImage(img, 0, 0, null);
              //path where your downloaded tessdata exists
              //instance.setDatapath("E://ocr//data");
              File tessDataFolder = LoadLibs.extractTessResources("tessdata");
              instance.setDatapath(tessDataFolder.getAbsolutePath());
            //What language you required to convert,( e.g. English)
              instance.setLanguage("eng");        
              String result = instance.doOCR(blackNWhite);


              //System.out.println(result);
              return result;

          }
 
 public String readToastMessage(AndroidDriver driver) throws TesseractException {
  String imgName = takeScreenShot(driver);
  String result = null;
  File imageFile = new File(scrShotDirPath, imgName);
  System.out.println("Image name is :" + imageFile.toString());
  ITesseract instance = new Tesseract();
  

  File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
                   // Tessdata
                   // folder
                   // from
                   // referenced
                   // tess4j
                   // jar
                   // for
                   // language
                   // support
   instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
                // path
  
  

  result = instance.doOCR(imageFile);
  System.out.println(result);
  return result;
 }

 /**
  * Takes screenshot of active screen
  * 
  * @return ImageFileName
  */
 
 public String takeScreenShot(AndroidDriver driver) {
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
  File scr1=driver.getScreenshotAs(OutputType.FILE);
  
  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
  new File(scrShotDir).mkdirs(); // Create folder under project with name
          // "screenshots" if doesn't exist
  destFile = dateFormat.format(new Date()) + ".png"; // Set file name
               // using current
               // date time.
  try {
   FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile)); // Copy
                    // paste
                    // file
                    // at
                    // destination
                    // folder
                    // location
  } catch (IOException e) {
   System.out.println("Image not transfered to screenshot folder");
   e.printStackTrace();
  }
  return destFile;
 }
}