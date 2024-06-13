package com.example.pr15_kylosov;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private MediaRecorder mediaRecorder;
    private MediaPlayer mediaPlayer;
    private String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fileName = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/record.3gpp";
    }

    private void releaseRecorder()
    {
        if(mediaRecorder != null)
        {
            mediaRecorder.release();
            mediaRecorder = null;
        }
    }
}