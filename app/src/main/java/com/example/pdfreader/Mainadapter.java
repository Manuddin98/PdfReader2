package com.example.pdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class Mainadapter extends RecyclerView.Adapter<Mainviewfolder> {
    private Context context;
    private List<File> pdffiles;
    private OnpdfSelectedListener listener;

    public Mainadapter(Context context, List<File> pdffiles, OnpdfSelectedListener listener) {
        this.context = context;
        this.pdffiles = pdffiles;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Mainviewfolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Mainviewfolder(LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Mainviewfolder holder, int position) {
        holder.textView.setText(pdffiles.get(position).getName());
        holder.textView.setSelected(true);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnPdfSelected(pdffiles.get(position));
            }
        });



    }

    @Override
    public int getItemCount() {
        return pdffiles.size();
    }
}
