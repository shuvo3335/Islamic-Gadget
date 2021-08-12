package com.example.navigationtest;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Kalima_page5 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2,textView3,textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        setContentView(R.layout.activity_kalima_page6);

        toolbar = findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("         KALIMA RADE-KUFR");
        toolbar.setTitleTextColor(getResources().getColor(R.color.yello));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       /* imageView=findViewById(R.id.imageIcon6);
        textView1=findViewById(R.id.textviewtitelkalima17);*/
        textView2=findViewById(R.id.textviewtitelkalima18);
        textView3=findViewById(R.id.textviewtitelkalima19);
        textView4=findViewById(R.id.textviewtitelkalima20);

       /* imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kalima_page5.this, Kalima.class);
                startActivity(intent1);
            }
        });
*/
    }
}
