package pxc.aplicacionpruebaspxc;

//import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	String player=new String("master");
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
