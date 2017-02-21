package com.example.unity.clappprototype;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements MyDialog.Communicator{
    private int lastExpandedPosition = -1;
    private ExpandableListView exp;

    List<String> Headings = new ArrayList<String>();
    List<String> H1= new ArrayList<String>();
    List<String> H2 = new ArrayList<String>();
    List<String> H3= new ArrayList<String>();
    List<String> H4= new ArrayList<String>();
    List<String> H5 = new ArrayList<String>();
    List<String> H6= new ArrayList<String>();
    List<String> H7= new ArrayList<String>();
    List<String> H8 = new ArrayList<String>();
    List<String> H9= new ArrayList<String>();
    HashMap <String, List<String>> ChildList = new HashMap<String, List<String>>();
    String HeadingItems [];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        exp = (ExpandableListView) findViewById(R.id.ExpListView);

        Log.d("Testing RadioButton", "testing");
        ShowDialogF(null);



        exp.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if (lastExpandedPosition != -1
                        && groupPosition != lastExpandedPosition) {
                    exp.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });



    }

public void ShowDialogF(View v){

    FragmentManager manager = getFragmentManager();
    MyDialog myDialog = new MyDialog();
    myDialog.show(manager, "Choose Language");

}

  private void populateLanguageWords_English(){


      HeadingItems = getResources().getStringArray(R.array.header_Title_English);
      String i1 [] = getResources().getStringArray(R.array.header1);
      String i2 [] = getResources().getStringArray(R.array.header2);
      String i3 [] = getResources().getStringArray(R.array.header3);
      String i4 [] = getResources().getStringArray(R.array.header4);
      String i5 [] = getResources().getStringArray(R.array.header5);
      String i6 [] = getResources().getStringArray(R.array.header6);
      String i7 [] = getResources().getStringArray(R.array.header7);
      String i8 [] = getResources().getStringArray(R.array.header8);
      String i9 [] = getResources().getStringArray(R.array.header9);

      for(String Title : HeadingItems)
      {
          Headings.add(Title);
      }

      for(String Title : i1)
      {
          H1.add(Title);
      }

      for(String Title : i2)
      {
          H2.add(Title);
      }

      for(String Title : i3)
      {
          H3.add(Title);
      }

      for(String Title : i4)
      {
          H4.add(Title);
      }

      for(String Title : i5)
      {
          H5.add(Title);
      }

      for(String Title : i6)
      {
          H6.add(Title);
      }

      for(String Title : i7)
      {
          H7.add(Title);
      }

      for(String Title : i8)
      {
          H8.add(Title);
      }

      for(String Title : i9)
      {
          H9.add(Title);
      }


      ChildList.put(Headings.get(0),H1);
      ChildList.put(Headings.get(1),H2);
      ChildList.put(Headings.get(2),H3);
      ChildList.put(Headings.get(3),H4);
      ChildList.put(Headings.get(4),H5);
      ChildList.put(Headings.get(5),H6);
      ChildList.put(Headings.get(6),H7);
      ChildList.put(Headings.get(7),H8);
      ChildList.put(Headings.get(8),H9);

      MyAdapter Myadapter = new MyAdapter(this,Headings,ChildList );
      exp.setAdapter(Myadapter);

  }

    private void populateLanguageWords_Spanish(){


        HeadingItems = getResources().getStringArray(R.array.header_Title_Spanish);
        String i1 [] = getResources().getStringArray(R.array.header1);
        String i2 [] = getResources().getStringArray(R.array.header2);
        String i3 [] = getResources().getStringArray(R.array.header3);
        String i4 [] = getResources().getStringArray(R.array.header4);
        String i5 [] = getResources().getStringArray(R.array.header5);
        String i6 [] = getResources().getStringArray(R.array.header6);
        String i7 [] = getResources().getStringArray(R.array.header7);
        String i8 [] = getResources().getStringArray(R.array.header8);
        String i9 [] = getResources().getStringArray(R.array.header9);

        for(String Title : HeadingItems)
        {
            Headings.add(Title);
        }

        for(String Title : i1)
        {
            H1.add(Title);
        }

        for(String Title : i2)
        {
            H2.add(Title);
        }

        for(String Title : i3)
        {
            H3.add(Title);
        }

        for(String Title : i4)
        {
            H4.add(Title);
        }

        for(String Title : i5)
        {
            H5.add(Title);
        }

        for(String Title : i6)
        {
            H6.add(Title);
        }

        for(String Title : i7)
        {
            H7.add(Title);
        }

        for(String Title : i8)
        {
            H8.add(Title);
        }

        for(String Title : i9)
        {
            H9.add(Title);
        }


        ChildList.put(Headings.get(0),H1);
        ChildList.put(Headings.get(1),H2);
        ChildList.put(Headings.get(2),H3);
        ChildList.put(Headings.get(3),H4);
        ChildList.put(Headings.get(4),H5);
        ChildList.put(Headings.get(5),H6);
        ChildList.put(Headings.get(6),H7);
        ChildList.put(Headings.get(7),H8);
        ChildList.put(Headings.get(8),H9);

        MyAdapter Myadapter = new MyAdapter(this,Headings,ChildList );
        exp.setAdapter(Myadapter);

    }

    private void populateLanguageWords_France(){


        HeadingItems = getResources().getStringArray(R.array.header_Title_France);
        String i1 [] = getResources().getStringArray(R.array.header1);
        String i2 [] = getResources().getStringArray(R.array.header2);
        String i3 [] = getResources().getStringArray(R.array.header3);
        String i4 [] = getResources().getStringArray(R.array.header4);
        String i5 [] = getResources().getStringArray(R.array.header5);
        String i6 [] = getResources().getStringArray(R.array.header6);
        String i7 [] = getResources().getStringArray(R.array.header7);
        String i8 [] = getResources().getStringArray(R.array.header8);
        String i9 [] = getResources().getStringArray(R.array.header9);

        for(String Title : HeadingItems)
        {
            Headings.add(Title);
        }

        for(String Title : i1)
        {
            H1.add(Title);
        }

        for(String Title : i2)
        {
            H2.add(Title);
        }

        for(String Title : i3)
        {
            H3.add(Title);
        }

        for(String Title : i4)
        {
            H4.add(Title);
        }

        for(String Title : i5)
        {
            H5.add(Title);
        }

        for(String Title : i6)
        {
            H6.add(Title);
        }

        for(String Title : i7)
        {
            H7.add(Title);
        }

        for(String Title : i8)
        {
            H8.add(Title);
        }

        for(String Title : i9)
        {
            H9.add(Title);
        }


        ChildList.put(Headings.get(0),H1);
        ChildList.put(Headings.get(1),H2);
        ChildList.put(Headings.get(2),H3);
        ChildList.put(Headings.get(3),H4);
        ChildList.put(Headings.get(4),H5);
        ChildList.put(Headings.get(5),H6);
        ChildList.put(Headings.get(6),H7);
        ChildList.put(Headings.get(7),H8);
        ChildList.put(Headings.get(8),H9);

        MyAdapter Myadapter = new MyAdapter(this,Headings,ChildList );
        exp.setAdapter(Myadapter);

    }

    private void populateLanguageWords_Chinese(){


        HeadingItems = getResources().getStringArray(R.array.header_Title_Chinese);
        String i1 [] = getResources().getStringArray(R.array.header1);
        String i2 [] = getResources().getStringArray(R.array.header2);
        String i3 [] = getResources().getStringArray(R.array.header3);
        String i4 [] = getResources().getStringArray(R.array.header4);
        String i5 [] = getResources().getStringArray(R.array.header5);
        String i6 [] = getResources().getStringArray(R.array.header6);
        String i7 [] = getResources().getStringArray(R.array.header7);
        String i8 [] = getResources().getStringArray(R.array.header8);
        String i9 [] = getResources().getStringArray(R.array.header9);

        for(String Title : HeadingItems)
        {
            Headings.add(Title);
        }

        for(String Title : i1)
        {
            H1.add(Title);
        }

        for(String Title : i2)
        {
            H2.add(Title);
        }

        for(String Title : i3)
        {
            H3.add(Title);
        }

        for(String Title : i4)
        {
            H4.add(Title);
        }

        for(String Title : i5)
        {
            H5.add(Title);
        }

        for(String Title : i6)
        {
            H6.add(Title);
        }

        for(String Title : i7)
        {
            H7.add(Title);
        }

        for(String Title : i8)
        {
            H8.add(Title);
        }

        for(String Title : i9)
        {
            H9.add(Title);
        }


        ChildList.put(Headings.get(0),H1);
        ChildList.put(Headings.get(1),H2);
        ChildList.put(Headings.get(2),H3);
        ChildList.put(Headings.get(3),H4);
        ChildList.put(Headings.get(4),H5);
        ChildList.put(Headings.get(5),H6);
        ChildList.put(Headings.get(6),H7);
        ChildList.put(Headings.get(7),H8);
        ChildList.put(Headings.get(8),H9);

        MyAdapter Myadapter = new MyAdapter(this,Headings,ChildList );
        exp.setAdapter(Myadapter);

    }

    private void populateLanguageWords_Dutch(){


        HeadingItems = getResources().getStringArray(R.array.header_Title_Dutch);
        String i1 [] = getResources().getStringArray(R.array.header1);
        String i2 [] = getResources().getStringArray(R.array.header2);
        String i3 [] = getResources().getStringArray(R.array.header3);
        String i4 [] = getResources().getStringArray(R.array.header4);
        String i5 [] = getResources().getStringArray(R.array.header5);
        String i6 [] = getResources().getStringArray(R.array.header6);
        String i7 [] = getResources().getStringArray(R.array.header7);
        String i8 [] = getResources().getStringArray(R.array.header8);
        String i9 [] = getResources().getStringArray(R.array.header9);

        for(String Title : HeadingItems)
        {
            Headings.add(Title);
        }

        for(String Title : i1)
        {
            H1.add(Title);
        }

        for(String Title : i2)
        {
            H2.add(Title);
        }

        for(String Title : i3)
        {
            H3.add(Title);
        }

        for(String Title : i4)
        {
            H4.add(Title);
        }

        for(String Title : i5)
        {
            H5.add(Title);
        }

        for(String Title : i6)
        {
            H6.add(Title);
        }

        for(String Title : i7)
        {
            H7.add(Title);
        }

        for(String Title : i8)
        {
            H8.add(Title);
        }

        for(String Title : i9)
        {
            H9.add(Title);
        }


        ChildList.put(Headings.get(0),H1);
        ChildList.put(Headings.get(1),H2);
        ChildList.put(Headings.get(2),H3);
        ChildList.put(Headings.get(3),H4);
        ChildList.put(Headings.get(4),H5);
        ChildList.put(Headings.get(5),H6);
        ChildList.put(Headings.get(6),H7);
        ChildList.put(Headings.get(7),H8);
        ChildList.put(Headings.get(8),H9);

        MyAdapter Myadapter = new MyAdapter(this,Headings,ChildList );
        exp.setAdapter(Myadapter);

    }


    @Override
    public void SelectedID(int id) {

        switch (id){

            case R.id.radioButton1:
                populateLanguageWords_English();
                break;

            case R.id.radioButton2:
                populateLanguageWords_Spanish();
                break;

            case R.id.radioButton3:
                populateLanguageWords_France();
                break;

            case R.id.radioButton4:
                populateLanguageWords_Chinese();
                break;

            case R.id.radioButton5:
                populateLanguageWords_Dutch();
                break;
        }

    }
}
