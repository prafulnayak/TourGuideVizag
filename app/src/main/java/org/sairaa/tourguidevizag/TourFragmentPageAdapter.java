package org.sairaa.tourguidevizag;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

class TourFragmentPageAdapter extends FragmentPagerAdapter {
    //Context for the app
    private Context mContext;
    public TourFragmentPageAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        mContext = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HighlightsFragment();
            case 1:
                return new HighlightsFragment();
            case 2:
                return new HighlightsFragment();
            case 3:
                return new HighlightsFragment();
            case 4:
                return new HighlightsFragment();
            case 5:
                return new HighlightsFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.highlights);
        }else
            return mContext.getString(R.string.beach);
    }
}
