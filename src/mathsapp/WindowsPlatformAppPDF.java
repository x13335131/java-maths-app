/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import java.io.File;

/**
 *
 * @author x14100274
 */
public class WindowsPlatformAppPDF {
      public static void main(String[] args) {
    
try {
                  if ((new File("JCHCP12011.pdf")).exists()) {
                                  Process p = Runtime
                                     .getRuntime()
                                     .exec("rundll32 url.dll,FileProtocolHandler JCHCP12011.pdf");
                                  p.waitFor();
                  } else {
                                  System.out.println("File does not exist");
                  }
                  System.out.println("Done");
    } catch (Exception ex) {
                  ex.printStackTrace();
    }
}
    
}
