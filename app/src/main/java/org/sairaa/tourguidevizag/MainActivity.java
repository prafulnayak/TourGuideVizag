package org.sairaa.tourguidevizag;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    private RecyclerView recyclerView, recyclerView2;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
//    String[] name1 = {"Hello","Hi","Bye", "tata","Thanks"};
//    String[] name2 = {"Hello","Hi","Bye", "tata","Thanks"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolBar);

        ViewPager viewPager = findViewById(R.id.viewpager);
        TourFragmentPageAdapter fAdapter = new TourFragmentPageAdapter(this,getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(fAdapter);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

//        recyclerView = findViewById(R.id.recycle_view);
//        recyclerView2 = findViewById(R.id.recycle_view2);
//        adapter = new RecyclerAdapter(recyclerView2);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(adapter);
    }
}
