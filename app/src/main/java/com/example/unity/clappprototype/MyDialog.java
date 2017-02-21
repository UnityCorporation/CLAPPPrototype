package com.example.unity.clappprototype;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * Created by brachelo on 2/21/2017.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener{
    Communicator communicator;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnChoose;
    private int selectedId=0;
    private View view;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        communicator = (Communicator) activity;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_language_fragment,null);
        radioGroup = (RadioGroup) view.findViewById(R.id.RadioButtonLanguage);
        btnChoose = (Button) view.findViewById(R.id.btnChoose);
        btnChoose.setOnClickListener(this);

        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View v) {

        // get selected radio button from radioGroup
        selectedId = radioGroup.getCheckedRadioButtonId();
        communicator.SelectedID(selectedId);
        dismiss();
    }

    public int getLanguageBtnID(){

        return selectedId;
    }

    interface Communicator
    {
        public void SelectedID(int id);
    }
}
