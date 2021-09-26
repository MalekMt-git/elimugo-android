package ngo.dean.elimugo;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    static Toolbar toolbar;
    static RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.Theme_ElimuGo_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);


        relativeLayout = findViewById(R.id.relativeLayout);

       setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);




        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_settings, R.id.nav_help)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        toolbar.setVisibility(View.GONE);
        relativeLayout.setVisibility(View.GONE);




    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    public static void setToolbarVisibility(int visibility){

        toolbar.setVisibility(visibility);
        relativeLayout.setVisibility(visibility);

    }

}
