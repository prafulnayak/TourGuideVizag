package org.sairaa.tourguidevizag;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TourFragmentPageAdapter extends FragmentPagerAdapter {
    private final int HIGHLIGHTS = 0;
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
                return new HighlightsFragment(constant.HIGHLIGHTS);
            case 1:
                return new HighlightsFragment(constant.BEACH);
            case 2:
                return new HighlightsFragment(constant.PARK);
            case 3:
                return new HighlightsFragment(constant.TEMPLE);
            case 4:
                return new HighlightsFragment(constant.HOTEL);
            case 5:
                return new HighlightsFragment(constant.MUSEUM);
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
        switch (position){
            case 0:
                return mContext.getString(R.string.highlights);
            case 1:
                return mContext.getString(R.string.beach);
            case 2:
                return mContext.getString(R.string.park);
            case 3:
                return mContext.getString(R.string.temple);
            case 4:
                return mContext.getString(R.string.hotel);
            case 5:
                return mContext.getString(R.string.museum);
            default:
                return mContext.getString(R.string.museum);
        }

    }
}
