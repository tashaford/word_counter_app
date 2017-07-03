package com.example.natashaford.wordounter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enteredSentence;
    Button submitButton;
    TextView wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enteredSentence = (EditText)findViewById(R.id.entered_sentence);
        submitButton = (Button)findViewById(R.id.submit_button);
        wordCount = (TextView)findViewById(R.id.word_count);
    }

    public void onButtonClick(View button){
        String entered = enteredSentence.getText().toString();
        Log.d("WordCounter", entered);
        Sentence sentence = new Sentence(entered);
        sentence.setWordCount();
        Resources res = getResources();
        String outputText = String.format(res.getString(R.string.output), sentence.getWordCount());
        wordCount.setText(outputText);
    }
}
