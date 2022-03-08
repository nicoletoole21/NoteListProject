package com.example.newproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter{
    private ArrayList<Note> noteData;
    public class ContactViewHolder extends RecyclerView.ViewHolder{
        public TextView textSubject;
        public TextView textLowPriority;
        public TextView textMediumPriority;
        public TextView textHighPriority;
        public Button deleteButton;
        public ContactViewHolder(@NonNull View itemView){
            super(itemView);
            textSubject = itemView.findViewById(R.id.textName);
            textLowPriority= itemView.findViewById(R.id.textlowPriority1);
            textMediumPriority= itemView.findViewById(R.id.textMediumPriority);
            textHighPriority= itemView.findViewById(R.id.textHighPriority);
            deleteButton= itemView.findViewById(R.id.deleteButton1);
        }
        public TextView getTextName(){
            return textSubject;
        }
        public TextView getTextLow(){
            return textLowPriority;
        }
        public TextView getTextMed(){
            return textMediumPriority;
        }
        public TextView getTextHigh(){
            return textHighPriority;
        }
        public Button getDeleteButton(){
            return deleteButton;
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
ContactViewHolder cvh = (ContactViewHolder) holder;
cvh.getTextName().setText(noteData.get(position).getNoteSubject());
   if noteData
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
