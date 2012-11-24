package pxc.aplicacionpruebaspxc;

//import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.content.Context;
//import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import rpgframework.*;

public class MainActivity extends Activity {
<<<<<<< HEAD
	String player=new String("master");
	WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
	Boolean hotspotState = false;
	wifiHotspot hotspot = new wifiHotspot();
	
	
=======
	String player=new String("normalplayer");
>>>>>>> 4e42e99d0782e2e0b42701b35514cade8987a4f1
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void createHotspot(View view) {
        // Do something in response to button
    	hotspot.createHotspot(wifi);
    }
    public void connectToHotspot(View view) {
        // Do something in response to button
    }
    public void play(View view) {
        // Do something in response to button
    	if(player.equals("master")){
    		Intent intent = new Intent(this, PlayMasterActivity.class);
    		startActivity(intent);
    	}else{
    		if(player.equals("normalplayer")){
    			Intent intent = new Intent(this, PlayPlayerActivity.class);
    			startActivity(intent);
    		}
    	}
    	   	
    }
    public void exit(View view) {
        // Do something in response to button
    }
}
