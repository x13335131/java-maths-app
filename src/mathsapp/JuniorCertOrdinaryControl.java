/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author x13335131
 */
public class JuniorCertOrdinaryControl {
     public static String correctAnswers[]=new String[10];//correct answer
    public static String answers[]=new String[10];//user answer
    public static boolean correct[]= new boolean[10];//corrrect right or wrong
    public static int count=0;
    
    //populates array
    public static void populate () {
        correctAnswers[0]="true";
        correctAnswers[1]="{3,4,6,8,9,12}";
        correctAnswers[2]="12";
        correctAnswers[3]="€41.25";
        correctAnswers[4]="22%";
        correctAnswers[5]="€10150";
        correctAnswers[6]="17";
        correctAnswers[7]="(x-y)(3+c)";
        correctAnswers[8]="b";
        correctAnswers[9]="12x+1";
        for(int i=0; i<answers.length; i++){
            answers[i]="error";
        }
        for(int i=0; i<correct.length; i++){
            correct[i]=false;
        }
       
    }
    
    public static void updateAns(String s, int i){
        answers[i]=s;
    }
    
    //testing purposes
    public static void test (int i){
        System.out.println(correct[i]);
       
    }
    //validates questions 1-10
    public static void validateQuestion1(){
       if (!answers[0] .equals (correctAnswers [0])){
            correct[0] = false;
        }
        else {
            correct[0]=true;
        }
        test(0);
    }
    public static void validateQuestion2(){
         if (!answers[1] .equals (correctAnswers [1])){
            correct[1] = false;
        }
        else {
            correct[1]=true;
        }
        test(1);
    }
    public static void validateQuestion3(){
       if (!answers[2] .equals (correctAnswers [2])){
            correct[2] = false;
        }
        else {
            correct[2]=true;
        }
       test(2);
    }
    public static void validateQuestion4(){
       if (!answers[3] .equals (correctAnswers [3])){
            correct[3] = false;
        }
        else {
            correct[3]=true;
        }
        test(3);
    }
    public static void validateQuestion5(){
       if (!answers[4] .equals (correctAnswers [4])){
            correct[4] = false;
        }
        else {
            correct[4]=true;
        }
       test(4);
    }
    public static void validateQuestion6(){
       if (!answers[5] .equals (correctAnswers [5])){
            correct[5] = false;
        }
        else {
            correct[5]=true;
        }
       test(5);
    }
    public static void validateQuestion7(){
       if (!answers[6] .equals (correctAnswers [6])){
            correct[6] = false;
        }
        else {
            correct[6]=true;
        }
       test(6);
    }
    public static void validateQuestion8(){
       if (!answers[7] .equals (correctAnswers [7])){
            correct[7] = false;
        }
        else {
            correct[7]=true;
        }
       test(7);
    }
     public static void validateQuestion9(){
      if (!answers[8] .equals (correctAnswers [8])){
            correct[8] = false;
        }
        else {
            correct[8]=true;
        }
         test(8);
    }
     public static void validateQuestion10(){
      if (!answers[9] .equals (correctAnswers [9])){
            correct[9] = false;
        }
        else {
            correct[9]=true;
        }
       test(9);
    }
     //summary-prints out score and shows user which questions they got wrong
      public static String getSummary(){
      count=0;
      String summary="error";
      String result="error";
      for(int i=0; i<correct.length; i++){
          if (correct[i]==true){
              count++;
          }
      }
      count=count*10;
      summary="you got "+count+" % !\n";
      for(int i=0; i<correct.length; i++){
          if(correct[i]==false){
          summary=summary+"you got Q."+(i+1)+" wrong \n";
          }
      }
      result = "Junior Cert Ordinary Quiz - "+count+"%";
      saveResults(result);
      return summary;
    }
       public static int getCount(){
        return count;
    }
      //makes a .txt file to store/save results
      private static void saveResults(String s) {
          File outFile;
        FileWriter fw;
        BufferedWriter bw;
        
        try {
            outFile = new File("grades.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);

            bw.write(s);
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
      
      }
      //allows user access previous results
      public static void showResults() {
          String result;
        File inFile;
        FileReader fr;
        BufferedReader br;

        try {
            inFile = new File("grades.txt");
            fr = new FileReader(inFile);
            br = new BufferedReader(fr);

            result = br.readLine();
            while (result != null) {
                JOptionPane.showMessageDialog(null, "Result - " + result);
                result = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
}
