package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class listactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
        int data=getIntent().getIntExtra("第几个",0);
        TextView txtview=findViewById(R.id.textView2);
        txtview.setText("这是第"+getIntent().getIntExtra("第几个",0)+"个");
    }
}
