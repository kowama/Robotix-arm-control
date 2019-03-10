package com.ensate.robot_arm_control;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    //System ActionBarUI
    private View mDecorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set view
        mDecorView = getWindow().getDecorView();
        // hide system ui
        hideSystemUI();
        findViewById(R.id.saveButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.connect_scan_menu_item:
            case R.id.action_connect_scan: {
                //openConnectActivity();
                return true;
            }
            case R.id.full_screen_menu_item:
            case R.id.action_full_screen: {
                hideSystemUI();
                return true;
            }
            case R.id.discoverable: {
                // TODO: 2/13/19
                return true;
            }
            case R.id.action_settings: {
                //Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
                // startActivityForResult(i, UPDATE_SETTING);
                return true;
            }
            case R.id.action_help: {
                openHelpActivity();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(item);

            }
        }
    }


    /******========Private methods===========******/
    /**
     * hide SystemUI to make App full screen
     */

    private void hideSystemUI() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            mDecorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                            | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                            | View.SYSTEM_UI_FLAG_IMMERSIVE
            );
        }
    }

    /**
     * showSystemUI
     */
    private void showSystemUI() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            mDecorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
    }

    /**
     * open helpActivity
     */
    private void openHelpActivity() {
        Intent i = new Intent(getApplicationContext(), HelpActivity.class);
        startActivity(i);
    }

}
