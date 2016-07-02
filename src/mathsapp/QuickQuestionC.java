/**
 *
 * @author x14110890
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import java.io.Serializable;


/**
 *
 * @author fsheridan
 */
public class QuickQuestionC implements Serializable{
    private String name;
    private String favorite;
    private int mark;
    
    public QuickQuestionC(){
        name = new String();
        favorite = new String();
        mark = 0;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

   
    
    
}
