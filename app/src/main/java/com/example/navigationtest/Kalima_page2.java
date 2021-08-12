package com.example.navigationtest;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Kalima_page2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2,textView3,textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima_page3);

        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("         KALIMA SHAHADAT");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



       /* imageView=findViewById(R.id.imageIcon3);
        textView1=findViewById(R.id.textviewtitelkalima5);*/
        textView2=findViewById(R.id.textviewtitelkalima6);
        textView3=findViewById(R.id.textviewtitelkalima7);
        textView4=findViewById(R.id.textviewtitelkalima8);


        /*imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima_page2.this, Kalima.class);
                startActivity(intent1);

            }
        });*/
    }

}
