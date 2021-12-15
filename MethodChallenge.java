package com.company;

public class MethodChallenge {
    public static void main(String[] args){
    DisplayHighScorePosition("Kruthika", 1);
    DisplayHighScorePosition("Aparna",2);
    DisplayHighScorePosition("Prarthana",3);
    CalculateHighScorePosition(1500);
    CalculateHighScorePosition(900);
    CalculateHighScorePosition(100);
    CalculateHighScorePosition(400);
    CalculateHighScorePosition(50);
    }
// Creating a method DisplayHighScorePosition
    public static void DisplayHighScorePosition(String playersName, int position){
        System.out.println(playersName+ " managed to get into position " +position+ " on the high score table");
    }

    public static void CalculateHighScorePosition(int PlayerScore){
        if(PlayerScore>1000){
            System.out.println("1");
        } else if(PlayerScore>500 && PlayerScore<1000){
            System.out.println("2");
        } else if(PlayerScore>100 && PlayerScore<500){
            System.out.println("3");
        } else{
            System.out.println("4");
        }
    }
}
