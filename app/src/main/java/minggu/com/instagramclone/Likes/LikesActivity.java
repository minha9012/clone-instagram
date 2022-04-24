package minggu.com.instagramclone.Likes;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import minggu.com.instagramclone.Utils.BottomNavigationViewHelper;
import minggu.com.instagramclone.R;

/**
 * Created by User on 5/28/2017.
 */

public class LikesActivity extends AppCompatActivity{
    private static final String TAG = "LikesActivity";
    private static final int ACTIVITY_NUM = 3;

    private Context mContext = LikesActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");

        setupBottomNavigationView();
    }

    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationView BottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(BottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(mContext, this,BottomNavigationView);
        Menu menu = BottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
