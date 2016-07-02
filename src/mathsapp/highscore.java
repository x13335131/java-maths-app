/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

/**
 *
 * @author x13335131
 */
public class highscore {
    
    private int score;
    private String name; 
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public highscore(){
        score= 0;
        name= "unknown";
        level= "unknown";
    }
    public highscore ( String s, int result, String l) {
		name = s;
		score = result;
                level = l; 
	}
	
}
