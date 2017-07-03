package com.example.natashaford.wordounter;

import java.util.ArrayList;

/**
 * Created by natashaford on 03/07/2017.
 */

public class Sentence {

    ArrayList<String> wordList;
    String sentence;
    int wordCount = 0;

    public Sentence(String sentence){
        this.sentence = sentence;
        wordList = new ArrayList<String>();
    }

    public String getSentence(){
        return sentence;
    }

    public int getWordCount(){
        return wordCount;
    }

    public void setWordCount(){
        wordCount = sentence.split(" ").length;
    }

    public ArrayList<String> getWordList(){
        return new ArrayList<String>(wordList);
    }

    public void setUpWordList(){
        for(String word : sentence.split(" ")) {
            wordList.add(word);
        }
    }

}
