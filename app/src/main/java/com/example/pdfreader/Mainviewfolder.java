package com.example.pdfreader;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Mainviewfolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public CardView cardView;
    public Mainviewfolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.pdf_textview);
        cardView=itemView.findViewById(R.id.pdf_cardview);

    }
}
