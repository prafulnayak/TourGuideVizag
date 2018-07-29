package org.sairaa.tourguidevizag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HighlightsFragment extends Fragment {
    private RecyclerView recyclerView, recyclerView2;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<TourPlace> tourPlaces = null;

    public HighlightsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tourPlaces = new ArrayList<TourPlace>();
        addTourPlaces();


        View rootView = inflater.inflate(R.layout.highlights_activity, container, false);
        recyclerView = rootView.findViewById(R.id.recycle_view);
        recyclerView2 = rootView.findViewById(R.id.recycle_view2);
        adapter = new RecyclerAdapter(recyclerView2,tourPlaces,getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
//    int imageId,int highlights,int typeFragment,
//    String placeName,String placeDesc,String area,
//    String city,String state,String location)
    private void addTourPlaces() {
        tourPlaces.add(new TourPlace(R.drawable.rkbeach,Integer.parseInt(getString(R.string.one)),2,getString(R.string.rk_beach),"good one",getString(R.string.beach_road),"Vizag","ap",getString(R.string.rk_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.rushikonda,Integer.parseInt(getString(R.string.one)),2,getString(R.string.rushikonda_beach),"good one",getString(R.string.rushikonda),"Vizag","ap",getString(R.string.rushikonda_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.bheemili,Integer.parseInt(getString(R.string.one)),2,getString(R.string.bheemili_beach),"good one",getString(R.string.bheemli),"Vizag","ap",getString(R.string.bheemili_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.appikonda,1,2,getString(R.string.appikonda_beach),"good one",getString(R.string.appikonda),"Vizag","ap",getString(R.string.appikonda_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.mipmap.ic_launcher,1,2,"R.k.beach","good one","NAD","Vizag","ap","ddd"));
        tourPlaces.add(new TourPlace(R.mipmap.ic_launcher,1,2,"R.k.beach","good one","NAD","Vizag","ap","ddd"));
        tourPlaces.add(new TourPlace(R.mipmap.ic_launcher,1,2,"R.k.beach","good one","NAD","Vizag","ap","ddd"));
        tourPlaces.add(new TourPlace(R.mipmap.ic_launcher,1,2,"R.k.beach","good one","NAD","Vizag","ap","ddd"));
        tourPlaces.add(new TourPlace(R.mipmap.ic_launcher,1,2,"R.k.beach","good one","NAD","Vizag","ap","ddd"));
    }
}
