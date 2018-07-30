package org.sairaa.tourguidevizag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.RecyclerViewHolder> {
    String[] name1, name2;
    ArrayList<TourPlace> nearByTourPlaces;
    RecyclerAdapter2(String[] name1, String[] name2){
        this.name1 = name1;
        this.name2 = name2;
    }

    public RecyclerAdapter2(ArrayList<TourPlace> tourPlaces) {
        this.nearByTourPlaces = tourPlaces;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view2,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        final TourPlace tPlace = nearByTourPlaces.get(position);
        holder.image.setBackgroundResource(tPlace.getImageId());
        holder.tx1.setText(tPlace.getArea());
        holder.placeName.setText(tPlace.getPlaceName());
//        holder.imageView.setBackgroundResource(tPlace.getImageId());
//        holder.tx1.setText(name1[position]);
    }

    @Override
    public int getItemCount() {
        return nearByTourPlaces.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tx1, placeName, loc;
        ImageView image;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.near_by_area);
            placeName = itemView.findViewById(R.id.near_by_place_name);
            loc = itemView.findViewById(R.id.near_by_location);
            image = itemView.findViewById(R.id.near_by_item_image);
        }
    }
}
