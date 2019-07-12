package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate =LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        setContentView(R.layout.exercise2);
        TextView txtview=findViewById(R.id.textView);
        txtview.setText("结果是"+getViewCount(inflate));
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int ViewCount=1;
        if(view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup) view;
            for (int i = 0; i < viewgroup.getChildCount(); i++)
            {
                ViewCount += getViewCount(viewgroup.getChildAt(i));
            }
        }
        else
            return 1;

        return ViewCount;
    }
}
