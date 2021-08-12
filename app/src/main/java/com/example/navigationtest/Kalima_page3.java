package com.example.navigationtest;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Kalima_page3 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2,textView3,textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima_page4);

        toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("         KALIMA TAMJEED");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*imageView=findViewById(R.id.imageIcon4);
        textView1=findViewById(R.id.textviewtitelkalima9);*/
        textView2=findViewById(R.id.textviewtitelkalima10);
        textView3=findViewById(R.id.textviewtitelkalima11);
        textView4=findViewById(R.id.textviewtitelkalima12);


      /*  imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima_page3.this, Kalima.class);
                startActivity(intent1);
            }
        });*/


    }
}
