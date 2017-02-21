package com.example.unity.clappprototype;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

/**
 * Created by brachelo on 2/19/2017.
 */

public class MyAdapter extends BaseExpandableListAdapter {

    private List<String> Header_Title;
    private HashMap<String, List<String>> child_Title;
    private Context cxt;

    MyAdapter(Context cxt, List<String> header_Title , HashMap<String, List<String>> child_Title){

        this.cxt = cxt;
        this.child_Title = child_Title;
        this. Header_Title = header_Title;


    }


    @Override
    public int getGroupCount() {
        return Header_Title.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return child_Title.get(Header_Title.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Header_Title.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        return child_Title.get(Header_Title.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }



    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
       String title = (String) this.getGroup(groupPosition);
        if(convertView == null)
        {
            LayoutInflater Inf = (LayoutInflater) this.cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = Inf.inflate(R.layout.list_parrent_layout,null);
        }
        TextView textview = (TextView) convertView.findViewById(R.id.Parent_Item);
        textview.setTypeface(null, Typeface.BOLD);
        textview.setText(title);
        return convertView;
    }



    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title = (String) this.getChild(groupPosition, childPosition);
        if (convertView == null)
        {
            LayoutInflater Inf = (LayoutInflater) this.cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = Inf.inflate(R.layout.list_child_layout, null);
        }
        TextView textview = (TextView) convertView.findViewById(R.id.childItem);
        textview.setText(title);
        return convertView;
    }



    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
