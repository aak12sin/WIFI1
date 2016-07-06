package com.example.aakash.listwifia;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {
 //   ListView lv;
    WifiManager wifi;
//    TextView textStatus;
//    Button buttonScan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  textStatus = (TextView) findViewById(R.id.buttonScan);
     //   buttonScan = (Button) findViewById(R.id.buttonScan);
        //   buttonScan.setOnClickListener(this);
        //lv = (ListView)findViewById(R.id.list);

      /*  wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        if(wifi.isWifiEnabled()==true) {
            wifi.setWifiEnabled(false);
        }
        else {
           wifi.setWifiEnabled(true);
        }*/


 }
    public void ON(View view){
        wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        if(wifi.isWifiEnabled()==true) {
            wifi.setWifiEnabled(false);
        }
        else {
            wifi.setWifiEnabled(true);
        }
    }

}





