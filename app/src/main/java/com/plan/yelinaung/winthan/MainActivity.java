package com.plan.yelinaung.winthan;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Bind(R.id.img) ImageView img;
  @Bind(R.id.tb) Toolbar tb;
  @Bind(R.id.ct) CollapsingToolbarLayout ct;
  @Bind(R.id.tab) TabLayout tab;
  @Bind(R.id.ab) AppBarLayout ab;
  @Bind(R.id.vp) ViewPager vp;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    tb.setTitle("Hello world");
    ct.setTitle("Hello world");
    img.setImageResource(R.mipmap.h);
    ct.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
    ct.setStatusBarScrimColor(getResources().getColor(R.color.colorPrimary));
    List<Fragment> li = new ArrayList<>();
    li.add(new ItemFragment());
    li.add(new ItemFragment());
    vp.setAdapter(new FakePager(getSupportFragmentManager(), li));
    tab.setupWithViewPager(vp);
  }
}
