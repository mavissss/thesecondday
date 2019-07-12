package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 周期：onpause->onstop->ondestory->oncreate->onstart->onresume
 */
public class Exercises1 extends AppCompatActivity {

    public static final  String TAG="MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: create");
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: pause");
        super.onPause();

    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: resume");
        super.onResume();

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: start");
        super.onStart();

    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: stop");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: destory");
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }
}
