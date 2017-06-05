package com.example.h_mal.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by h_mal on 16/03/2017.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Activity context, ArrayList<News> news) {

        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        String title = currentNews.getTitle();
        String section = currentNews.getSection();

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(title);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(section);

        return listItemView;
    }


}
