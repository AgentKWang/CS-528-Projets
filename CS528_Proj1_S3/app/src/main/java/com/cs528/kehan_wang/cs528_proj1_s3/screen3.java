package com.cs528.kehan_wang.cs528_proj1_s3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;


public class screen3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeWebview(View v){
        WebView wView = (WebView) findViewById(R.id.webView);
        switch(v.getId()){
            case R.id.web1:
                wView.loadUrl("http://www.google.com");
                break;
            case R.id.web2:
                wView.loadUrl("http://www.facebook.com");
                break;
            case R.id.web3:
                wView.loadUrl("http://www.wpilife.org");
                break;
        }
    }
}
