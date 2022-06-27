package com.example.recyclerview.Act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;

public class StoryActivity extends AppCompatActivity {

    TextView txtProfileName;
    ImageView profieImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        binding();
    }

    private void binding() {

        txtProfileName = findViewById(R.id.txtProfileName);
        profieImg = findViewById(R.id.profieImg);

        if (getIntent().getStringExtra("name")!=null)
        {
            txtProfileName.setText(getIntent().getStringExtra("name"));
        }
        if (getIntent().getIntExtra("image",-1)!=-1)
        {
            int img= (int) getIntent().getIntExtra("image",-1);
            profieImg.setImageResource(img);
        }

    }
}