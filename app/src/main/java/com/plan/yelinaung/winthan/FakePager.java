package com.plan.yelinaung.winthan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

/**
 * Created by user on 2/23/16.
 */
public class FakePager extends FragmentPagerAdapter {
  private List<Fragment> list;

  @Override public Fragment getItem(int position) {
    return list.get(position);
  }

  public FakePager(FragmentManager fm, List<Fragment> list) {
    super(fm);
    this.list = list;
  }

  @Override public int getCount() {
    return list.size();
  }
}
