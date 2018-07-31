package com.example.android.jokelibrary;


import java.util.ArrayList;
import java.util.Random;

public class Joke {

    String joke1 = "Why are iPhone chargers not called Apple Juice?!";
    String joke2 = "I'm currently boycotting any company that sells items I can't afford.";
    String joke3 = "Always borrow money from a pessimist. He won't expect it back.";
    String joke4 = "I asked God for a bike, but I know God does not work that way. So I stole a bike and asked for forgiveness.";
    String joke5 = "If you think women are the weaker sex, try pulling the blanket back to your side.";
    String joke6 = "Would not exercise be more fun if calories screamed while you burned them?";
    String joke7 = "Happiness is having a large, loving, caring, close-knit family in another city.";
    private  ArrayList<String> jokesList = new ArrayList<>();
    private ArrayList<String> getList(){
        jokesList.add(joke1);
        jokesList.add(joke2);
        jokesList.add(joke3);
        jokesList.add(joke4);
        jokesList.add(joke5);
        jokesList.add(joke6);
        jokesList.add(joke7);
        return jokesList;
    }

    public String getJoke() {
        Random mRandom = new Random();
        int index = mRandom.nextInt(getList().size());
        return jokesList.get(index);
    }
}
