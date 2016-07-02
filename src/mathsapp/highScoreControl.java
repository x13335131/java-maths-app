/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x13335131
 */
public class highScoreControl {
    
    private static ArrayList<highscore> LCH = new ArrayList<highscore>();
    private static ArrayList<highscore> LCO = new ArrayList<highscore>();
    private static ArrayList<highscore> JCH = new ArrayList<highscore>();
    private static ArrayList<highscore> JCO = new ArrayList<highscore>();
    
    
    public static void addLCHigher(String name, int score, String level ){
     int size=  LCH.size();
    LCH.add(size, new highscore (name, score, level));
        
}
    public static void addLCOrd(String name, int score, String level ){
     int size=  LCO.size();
    LCO.add(size, new highscore (name, score, level));
        
}
    public static void addJCHigher(String name, int score, String level ){
     int size=  JCH.size();
    JCH.add(size, new highscore (name, score, level));
        
}
    public static void addJCOrd(String name, int score, String level ){
     int size=  JCO.size();
    JCO.add(size, new highscore (name, score, level));
        
}
    
    public static String getLCHtop5 () {
        String msg="High Score\n";
        int[] topFiveIndex = new int[5];
        for(int i=0; i<5 ;i++){
            topFiveIndex[i]=-1;
        }
        int compare=-1;
        int count=0;
        int placeholder=0;
        boolean used =false;
        
            for (int i=0; i<5;i++) {
                LCH.add(LCH.size(), new highscore ("unknown", 0, "LCHH"));
            }
    
        for (int k=0; k<5;k++) {
            for (int i=0 ;i<LCH.size() ;i++) {
                if (LCH.get(i).getScore() > compare) {
                    for (int j=0 ;j<5 ;j++) {
                        if(topFiveIndex[j]==i){
                            used=true;
                        }
                    }
                    if (used==false) {
                        compare = LCH.get(i).getScore();
                        placeholder=i; 
                    }
                }
                used=false;
            }
            topFiveIndex[count]=placeholder;
            count++;
            compare=-1;
            used=false;
        }
        for(int i=0; i<5; i++) {
            msg=msg+(i+1)+".  "+LCH.get(topFiveIndex[i]).getName()+"  -  "+LCH.get(topFiveIndex[i]).getScore()+"\n";
        }
        return msg;
    }
    
     public static String getLCOtop5 () {
        String msg="High Score\n";
        int[] topFiveIndex = new int[5];
        for(int i=0; i<5 ;i++){
            topFiveIndex[i]=-1;
        }
        int compare=-1;
        int count=0;
        int placeholder=0;
        boolean used =false;
        
            for (int i=0; i<5;i++) {
                LCO.add(LCO.size(), new highscore ("unknown", 0, "LCOH"));
            }
    
        for (int k=0; k<5;k++) {
            for (int i=0 ;i<LCO.size() ;i++) {
                if (LCO.get(i).getScore() > compare) {
                    for (int j=0 ;j<5 ;j++) {
                        if(topFiveIndex[j]==i){
                            used=true;
                        }
                    }
                    if (used==false) {
                        compare = LCO.get(i).getScore();
                        placeholder=i; 
                    }
                }
                used=false;
            }
            topFiveIndex[count]=placeholder;
            count++;
            compare=-1;
            used=false;
        }
        for(int i=0; i<5; i++) {
            msg=msg+(i+1)+".  "+LCO.get(topFiveIndex[i]).getName()+"  -  "+LCO.get(topFiveIndex[i]).getScore()+"\n";
        }
        return msg;
    }
     
      public static String getJCHtop5 () {
        String msg="High Score\n";
        int[] topFiveIndex = new int[5];
        for(int i=0; i<5 ;i++){
            topFiveIndex[i]=-1;
        }
        int compare=-1;
        int count=0;
        int placeholder=0;
        boolean used =false;
        
            for (int i=0; i<5;i++) {
                JCH.add(JCH.size(), new highscore ("unknown", 0, "JCHH"));
            }
    
        for (int k=0; k<5;k++) {
            for (int i=0 ;i<JCH.size() ;i++) {
                if (JCH.get(i).getScore() > compare) {
                    for (int j=0 ;j<5 ;j++) {
                        if(topFiveIndex[j]==i){
                            used=true;
                        }
                    }
                    if (used==false) {
                        compare = JCH.get(i).getScore();
                        placeholder=i; 
                    }
                }
                used=false;
            }
            topFiveIndex[count]=placeholder;
            count++;
            compare=-1;
            used=false;
        }
        for(int i=0; i<5; i++) {
            msg=msg+(i+1)+".  "+JCH.get(topFiveIndex[i]).getName()+"  -  "+JCH.get(topFiveIndex[i]).getScore()+"\n";
        }
        return msg;
    }
      
       public static String getJCOtop5 () {
        String msg="High Score\n";
        int[] topFiveIndex = new int[5];
        for(int i=0; i<5 ;i++){
            topFiveIndex[i]=-1;
        }
        int compare=-1;
        int count=0;
        int placeholder=0;
        boolean used =false;
        
            for (int i=0; i<5;i++) {
                JCO.add(JCO.size(), new highscore ("unknown", 0, "JCOH"));
            }
    
        for (int k=0; k<5;k++) {
            for (int i=0 ;i<JCO.size() ;i++) {
                if (JCO.get(i).getScore() > compare) {
                    for (int j=0 ;j<5 ;j++) {
                        if(topFiveIndex[j]==i){
                            used=true;
                        }
                    }
                    if (used==false) {
                        compare = JCO.get(i).getScore();
                        placeholder=i; 
                    }
                }
                used=false;
            }
            topFiveIndex[count]=placeholder;
            count++;
            compare=-1;
            used=false;
        }
        for(int i=0; i<5; i++) {
            msg=msg+(i+1)+".  "+JCO.get(topFiveIndex[i]).getName()+"  -  "+JCO.get(topFiveIndex[i]).getScore()+"\n";
        }
        return msg;
    }
    
       public static void clearHighScores(){
            int temp = JOptionPane.showConfirmDialog(null, "Are you Sure", "Confirmation Window", JOptionPane.YES_NO_OPTION);
        if (temp == JOptionPane.YES_OPTION) {
        
        
           for(int i=0; i<LCH.size(); i++){
               LCH.remove(i);
           }
           for(int i=0; i<LCO.size(); i++){
               LCO.remove(i);
           }
           for(int i=0; i<JCH.size(); i++){
               JCH.remove(i);
           }
           for(int i=0; i<JCO.size(); i++){
               JCO.remove(i);
           }
        }else {
           
        }
           
       }
               
       //for testing purposes
    public static void test(){
        for (int i=0;i<LCH.size();i++) {
            System.out.println(LCH.get(i).getName());
            System.out.println(LCH.get(i).getScore());
            System.out.println(LCH.get(i).getLevel());
            System.out.println(" ");
        }
    }
}
