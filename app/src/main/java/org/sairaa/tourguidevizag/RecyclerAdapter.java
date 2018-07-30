package org.sairaa.tourguidevizag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private Context ctx;
    RecyclerView name1, name2;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] name10 = {"Hello","Hi","Bye", "tata","Thanks"};
    String[] name20 = {"Hello","Hi","Bye", "tata","Thanks"};
    ArrayList<TourPlace> tourPlaces, nearBYTourPlace, tourPlacesFragment;

    public RecyclerAdapter(RecyclerView recyclerView2, ArrayList<TourPlace> tourPlacesFragment, Context highlightsFragment, ArrayList<TourPlace> tourPlaces) {
        name1 = recyclerView2;
        this.tourPlaces = tourPlaces;
        this.ctx = highlightsFragment;
        this.tourPlacesFragment = tourPlacesFragment;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, int position) {

        final TourPlace tPlace = tourPlacesFragment.get(position);
//        ImageView imageView = holder.tx1.findViewById(R.id.item_image);
        holder.imageView.setBackgroundResource(tPlace.getImageId());
        holder.placeName.setText(tPlace.getPlaceName());
        holder.area.setText(tPlace.getArea());
        holder.loc.setText(tPlace.getLocation());
        holder.loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:"+tPlace.getLocation());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(ctx.getPackageManager()) != null) {
                    ctx.startActivity(mapIntent);
                }
            }
        });
        nearBYTourPlace = findNearByTourPlaces(tPlace.getArea(),tPlace.getHighlights());
//        recyclerView = holder.tx1.findViewById(R.id.recycle_view);
//        recyclerView2 = findViewById(R.id.recycle_view2);
        if(nearBYTourPlace != null){
            adapter = new RecyclerAdapter2(nearBYTourPlace);
            layoutManager = new LinearLayoutManager(holder.tx1.getContext(),LinearLayoutManager.HORIZONTAL, true);
            holder.tx1.setLayoutManager(layoutManager);
            holder.tx1.setHasFixedSize(true);
            holder.tx1.setAdapter(adapter);
        }

    }

    private ArrayList<TourPlace> findNearByTourPlaces(String area, int position) {
        ArrayList<TourPlace>  tkPlace = new ArrayList<TourPlace>();
        Log.i("Hello",""+area+position);
        for(int i=0; i<tourPlaces.size();i++){
            if(area.equals(tourPlaces.get(i).getArea())){
                if(tourPlaces.get(i).getHighlights() != position){
//                    Log.i("Loop",""+i+tourPlaces.get(i).getArea()+tourPlaces.size());
                    tkPlace.add(tourPlaces.get(i));
                }
            }
        }
        return tkPlace;
    }

    @Override
    public int getItemCount() {
        return tourPlacesFragment.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView placeName, area,loc;
        RecyclerView tx1, tx2;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.recycle_view2);
            imageView = itemView.findViewById(R.id.item_image);
            placeName = itemView.findViewById(R.id.prime_place_name);
            area = itemView.findViewById(R.id.prime_area);
            loc = itemView.findViewById(R.id.prime_location);
        }
    }
}
