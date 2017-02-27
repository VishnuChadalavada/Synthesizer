package com.example.chadalavada55579.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class SynthesizerActivity extends AppCompatActivity {

    private static final String TAG = SynthesizerActivity.class.getName();
    private final int WHOLE_NOTE = 1000;

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private Boolean loop = false;
    private Boolean record = false;
    private Button Record;
    private Button Loop;
    private ArrayList<MediaPlayer> beat = new ArrayList<MediaPlayer>();
    private Button PlayLoop;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        Button1 = (Button)findViewById(R.id.Button1);
        Button2 = (Button)findViewById(R.id.Button2);
        Button3 = (Button) findViewById(R.id.Button3);
        Record = (Button) findViewById(R.id.Record);
        Loop = (Button) findViewById(R.id.Loop);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);



    }
    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        if (record == true){
            mpE.seekTo(0);
            Log.i(TAG , "Button 1 clicked");
            mpE.start();
            beat.add(mpE);

        }
        else {
            mpE.seekTo(0);
            Log.i(TAG , "Button 1 clicked");
            mpE.start();
        }
    }
    public void onButton2Click(View v) {
        if (record == true){
            mpF.seekTo(0);
            Log.i(TAG , "Button 2 clicked");
            mpF.start();
            beat.add(mpF);
        }
        else {
            mpF.seekTo(0);
            Log.i(TAG , "Button 2 clicked");
            mpF.start();
        }
        }

    public void onButton3Click(View v) {
        if (record == true){
            Log.i(TAG , "before mpb");
            mpB.seekTo(0);
            Log.i(TAG , "Button 3 clicked");
            mpB.start();
            beat.add(mpB);
        }
        else {
            mpB.seekTo(0);
            Log.i(TAG , "Button 3 clicked");
            mpB.start();
        }
    }


public void onRecordClick(View v) {
    if (record == true){
    record = false;
    }
    else{
        record = true;
    }
}

public void onLoopClick (View v) {
    if (loop == false) {
        loop = true;
    }
    else {
        loop = false;
    }
    while (loop == true) {
        for (int i = 0; i < beat.size(); i++) {
            beat.get(i).seekTo(0);
            Log.i("SynthesizerActivity", "Button 3 clicked");
            try {
                beat.get(i).start();
                delayPlaying(WHOLE_NOTE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }



        }
        }
}









       /** public void onmChallenge1Click(View v) {
            Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
            try {
                mpE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpG.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpE.start();
                }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public void onmChallenge5Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        try {
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
        **/










