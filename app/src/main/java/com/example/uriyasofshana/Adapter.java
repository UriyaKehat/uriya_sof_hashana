package com.example.uriyasofshana;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context mContext;
    String [] mData;
    public Adapter(Context context, String[] data){
        this.mContext = context;
        this.mData = data;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.mtv.setText(this.mData[position]);

    }

    @Override
    public int getItemCount() {
        return this.mData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mtv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtv = itemView.findViewById(R.id.mtv);
        }
    }
}
