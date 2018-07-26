package org.sairaa.tourguidevizag;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    RecyclerView name1, name2;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] name10 = {"Hello","Hi","Bye", "tata","Thanks"};
    String[] name20 = {"Hello","Hi","Bye", "tata","Thanks"};

    public RecyclerAdapter(RecyclerView recyclerView2) {
        name1 = recyclerView2;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

//        recyclerView = holder.tx1.findViewById(R.id.recycle_view);
//        recyclerView2 = findViewById(R.id.recycle_view2);
        adapter = new RecyclerAdapter2(name10,name20);
        layoutManager = new LinearLayoutManager(holder.tx1.getContext(),LinearLayoutManager.HORIZONTAL, true);
        holder.tx1.setLayoutManager(layoutManager);
        holder.tx1.setHasFixedSize(true);
        holder.tx1.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        RecyclerView tx1, tx2;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.recycle_view2);
        }
    }
}
