package com.atfreaks.gamerzwiki;

import android.app.ActionBar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.atfreaks.gamerzwiki.cores.NavigationDrawerItem;
import com.atfreaks.gamerzwiki.cores.ObjectGraphInjector;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;


public class MainActivity extends ActionBarActivity {
    private static final String SCREEN_NAME = "MainActivity";

    @Optional @InjectView(R.id.tool_bar) Toolbar toolbar;
    @InjectView(R.id.DrawerLayout) DrawerLayout mDrawerLayout;

    @Inject GamerzWikiApplication mGamerzWikiApplication;

    android.support.v7.app.ActionBar mActionBar;

    List<NavigationDrawerItem> mNavigationDrawerItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);
        ObjectGraphInjector.inject(this);

        setSupportActionBar(toolbar);
        setupDrawerLayout();
        setupActionBar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void setupActionBar() {
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.setHomeButtonEnabled(true);
    }

    private void setupDrawerLayout() {
        mNavigationDrawerItemList = new ArrayList<NavigationDrawerItem>();
        mNavigationDrawerItemList.add(new NavigationDrawerItem(getString(R.string.title_home), "{fa-home}") {
            @Override
            public void onClick() {
                mActionBar.setTitle(R.string.title_home);
                /*getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new TopGameFragment())
                        .commit();*/
            }
        });
        mNavigationDrawerItemList.add(new NavigationDrawerItem(getString(R.string.title_settings), "{fa-cog}") {
            @Override
            public void onClick() {
                //startActivity(SettingsActivity.createIntent(getApplicationContext()));
            }
        });



        /*
        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mNavigationDrawerFragment.setup(
                R.id.navigation_drawer,
                mNavigationDrawerItemList,
                mDrawerLayout
        );*/

        /*mActionBar.setTitle(R.string.activity_home);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TopGameFragment())
                .commit();*/

        /*
        if (!mAuthenticator.hasAuthentication()) {
            mNavigationDrawerItemList.add(new NavigationDrawerItem(getString(R.string.title_login), "{fa-sign-in}") {
                @Override
                public void onClick() {
                    startActivity(AuthenticationActivity.createIntent(getApplicationContext()));
                }
            });
        } else {
            mNavigationDrawerItemList.add(new NavigationDrawerItem(getString(R.string.title_booking_history), "{fa-history}") {
                @Override
                public void onClick() {
                    mActionBar.setTitle(R.string.title_booking_history);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new BookingHistoryFragment())
                            .commit();
                }
            });
            mNavigationDrawerItemList.add(new NavigationDrawerItem(getString(R.string.title_favorite), "{fa-star}") {
                @Override
                public void onClick() {
                    mActionBar.setTitle(getString(R.string.title_favorite));
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, new FavoriteGameListFragment())
                            .commit();
                }
            });
            mNavigationDrawerItemList.add(new NavigationDrawerItem("ユーザ情報の確認・表示", "{fa-user}") {
                @Override
                public void onClick() {
                    startActivity(AccountSettingActivity.createIntent(getApplicationContext()));
                }
            });
        }
        */




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
}
