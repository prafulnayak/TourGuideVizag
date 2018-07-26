package org.sairaa.tourguidevizag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.RecyclerViewHolder> {
    String[] name1, name2;
    public RecyclerAdapter2(String[] name1, String[] name2){
        this.name1 = name1;
        this.name2 = name2;
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
        holder.tx1.setText(name1[position]);
    }

    @Override
    public int getItemCount() {
        return name1.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tx1, tx2;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.item_text2);
        }
    }
}
