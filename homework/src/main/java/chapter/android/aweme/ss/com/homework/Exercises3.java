package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {
    private ListView listview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        ListView listView = findViewById(R.id.listview1);
        listView.setAdapter(new ListViewAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Exercises3.this, "当前位置" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Exercises3.this, listactivity.class);
                intent.putExtra("第几个", position);
                startActivity(intent);
            }
        });


    }
    public static class ListViewAdapter extends BaseAdapter {

        private Context mContext;

        public ListViewAdapter(Context context) {
            mContext = context;
        }

        @Override public int getCount() {
            return 50;
        }

        @Override public Object getItem(int position) {
            return null;
        }

        @Override public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.im_list_item, null);

            } else {
                //!=null
                view = convertView;
            }

            return view;
        }
    }




}
