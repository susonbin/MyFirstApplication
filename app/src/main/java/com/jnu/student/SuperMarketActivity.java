package com.jnu.student;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SuperMarketActivity extends AppCompatActivity {

    private ArrayList<Good> theCoaches;
    private ListView listView;
    private GoodArrayAdapter theAdaper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_market);

        listView=(ListView) findViewById(R.id.list_view);

        theCoaches=new ArrayList<Good>();
        theCoaches.add(new Good("fresh1",100,R.drawable.a1));
        theCoaches.add(new Good("fresh2",100,R.drawable.a2));
        theCoaches.add(new Good("fresh3",100,R.drawable.a3));
        theCoaches.add(new Good("fresh4",100,R.drawable.a4));

        theAdaper = new GoodArrayAdapter(this, R.layout.list_item, theCoaches);


        listView.setAdapter(theAdaper);
        this.registerForContextMenu(listView);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {



        switch(item.getItemId()){
            case 1: {
                AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

                theCoaches.add(menuInfo.position,new Good("fresh1", 100, R.drawable.a1));
                theAdaper.notifyDataSetChanged();

                Toast.makeText(this, "你选择了新建", Toast.LENGTH_SHORT).show();
                break;
            }
            case 2: {
                AdapterView.AdapterContextMenuInfo menuInfo=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
                final int itemPosition=menuInfo.position;
                new android.app.AlertDialog.Builder(this)
                        .setTitle("询问")
                        .setMessage("删除吗")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                theCoaches.remove(itemPosition);
                                theAdaper.notifyDataSetChanged();
                                Toast.makeText(SuperMarketActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .create().show();
                break;
            }
            case 3:
                Toast.makeText(this, "版权所有", Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        int itemPosition=((AdapterView.AdapterContextMenuInfo)menuInfo).position;
        menu.setHeaderTitle(theCoaches.get(itemPosition).getName());

        menu.add(0, 1, 0, "新建");
        menu.add(0, 2, 0, "删除");
        menu.add(0, 3, 0, "关于...");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    protected class GoodArrayAdapter extends ArrayAdapter<Good>
    {
        private int resourceId;

        public GoodArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Good> objects) {
            super(context, resource, objects);
            resourceId=resource;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater mInflater=LayoutInflater.from(this.getContext());
            View item = mInflater.inflate(this.resourceId,null);

            ImageView img = (ImageView)item.findViewById(R.id.image_view_good);
            TextView name = (TextView)item.findViewById(R.id.text_view_name);
            TextView price = (TextView)item.findViewById(R.id.text_view_price);

            Good good_item = this.getItem(position);
            img.setImageResource(good_item.getPictureID());
            name.setText(good_item.getName());
            price.setText(good_item.getPrice()+"");

            return item;
        }


    }


}
