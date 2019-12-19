package com.tutorialscache.checkboxlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MoviesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MovieModel> moviesData;
    private LayoutInflater layoutInflater;
    private MovieModel movieModel;

    public MoviesAdapter(Context context, ArrayList<MovieModel> moviesData) {
        this.context = context;
        this.moviesData = moviesData;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {;
        return moviesData.size();
    }

    @Override
    public Object getItem(int position) {
        return moviesData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return moviesData.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView=view;
        if(rowView==null)
        {
            rowView=layoutInflater.inflate(R.layout.movies_row,parent,false);
        }
            TextView moviesName=(TextView)rowView.findViewById(R.id.movieNameTv);
            CheckBox checkBox=(CheckBox)rowView.findViewById(R.id.checkbox);

            movieModel = moviesData.get(position);

            moviesName.setText(movieModel.getMoviename());
            checkBox.setChecked(movieModel.isIschecked());
            // Tag is important to get position clicked checkbox
            checkBox.setTag(position);
            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int currentPos = (int) v.getTag();
                    boolean isChecked = false;
                    if (moviesData.get(currentPos).isIschecked()==false){
                        isChecked=true;
                    }
                    Log.d("response ",currentPos+ " "+isChecked);
                    moviesData.get(currentPos).setIschecked(isChecked);
                    notifyDataSetChanged();
                }
            });
            return rowView;
    }
}
