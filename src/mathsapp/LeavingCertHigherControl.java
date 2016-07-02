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
public class LeavingCertHigherControl {
    //variables
    public static String correctAnswers[]=new String[10];//answer should be
    public static String answers[]=new String[10];//what user typed
    public static boolean correct[]= new boolean[10];//right or wrong
    public static String[][] q2 = new String[2][2];//2d array for qs 2, two feilds
    private static int count=0;
    
    //populates arrays
    public static void populate () {
        correctAnswers[0]="4x-3";
        correctAnswers[1]="error";
        correctAnswers[2]="18";
        correctAnswers[3]="7";
        correctAnswers[4]="-16.67";
        correctAnswers[5]="7.5";
        correctAnswers[6]="70";
        correctAnswers[7]="3+8i";
        correctAnswers[8]="note";
        correctAnswers[9]="5";
        for(int i=0; i<answers.length; i++){
            answers[i]="error";
        }
        for(int i=0; i<correct.length; i++){
            correct[i]=false;
        }
        //This 2D array is used only for Question 2 as it has 2 parts.
        q2[0][0]="1";
        q2[0][1]="-1";
        q2[1][0]= "error";
        q2[1][1]= "error";
    }
   //gets users answers
    public static void updateAns(String s, int i){
        answers[i]=s;
    }
    //gets users answer for Q2
    public static void setAnswerQ2(String a, String b){
        
        q2[1][0]=a;
        q2[1][1]=b;
        validateQuestion2();
        //test();
    }
    //testing purposes
    public static void test (int i){
        System.out.println(correct[i]);
       
    }
    //checks users answers to see if correct or not-stores result
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
        if (q2[1][0].equals(q2[0][0]) && q2[1][1].equals(q2[0][1])){
            correct[1] = true;
        }
        else {
            correct[1]=false;
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
     public static void validateQuestion9(boolean ans){
      if (ans==true){
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
     //generates summary of quiz 
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
      result = "Leaving Cert Higher Quiz - "+count+"%";
      saveResults(result);
      return summary;
    }
     public static int getCount(){
    return count;
}
     //makes a .txt file to store users results
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
     //allows user access these previous results
     public static void showResults() {
        String result;
        File inFile;
        FileReader fr;
        BufferedReader br;

        try {
            inFile = new File("grades.txt");
            fr = new FileReader(inFile);
            br = new BufferedReader(fr);
            result="";
            for( int i=0; i<5; i++) {
                String temp = br.readLine();
                if (temp!=null) {
                    result =  temp+"\n"+result;
                }
                
            }
            JOptionPane.showMessageDialog(null, "5 most recent results - \n" + result);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
     
    public static void deleteResults() {
      int temp = JOptionPane.showConfirmDialog(null, "Are you Sure", "Confirmation Window", JOptionPane.YES_NO_OPTION);
        if (temp == JOptionPane.YES_OPTION) {
          File inFile;
            try{

                    inFile = new File("grades.txt");

                    if(inFile.delete()){
                            System.out.println(inFile.getName() + " is deleted!");
                    }else{
                            System.out.println("Delete operation is failed.");
                    }

            }catch(Exception e){

                    e.printStackTrace();

            }
        }
        else {
           
        }
    }   
}
