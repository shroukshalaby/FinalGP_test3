package com.example.lenovo.finalgp_test1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragmentFlight extends Fragment
{
    public String datefrom = "date from";
    public String dateto = "date to";

    public BlankFragmentFlight() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank_fragment_flight, container, false);
        ImageButton imageButtonUp = (ImageButton)rootView.findViewById(R.id.imageButton_upNumOfPassengers);
        ImageButton imageButtonDown = (ImageButton)rootView.findViewById(R.id.imageButton_downNumberOfPassengers);
        ImageButton calendarDept = (ImageButton)rootView.findViewById(R.id.imageButton_calendarDepartureDate);
        ImageButton calendarReturn = (ImageButton)rootView.findViewById(R.id.imageButton_calendarReturnDate);
        TextView text_hiddenFrom = (TextView)rootView.findViewById(R.id.textView_fromDateHidden);
        TextView text_hiddenTo = (TextView)rootView.findViewById(R.id.textView_toDateHidden);
        final TextView textViewNumOfPassengers = (TextView)rootView.findViewById(R.id.textView_numOfPassengers);
        imageButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string_passengers = textViewNumOfPassengers.getText().toString();
                int numOfPassengersSelected = Integer.parseInt(string_passengers) + 1;
                textViewNumOfPassengers.setText(String.valueOf(numOfPassengersSelected));
            }
        });
        imageButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string_passengers = textViewNumOfPassengers.getText().toString();
                int checker = Integer.parseInt(string_passengers);
                if (checker>1){
                    int numOfPassengersSelected = checker - 1;
                    textViewNumOfPassengers.setText(String.valueOf(numOfPassengersSelected));
                }
                else
                    textViewNumOfPassengers.setText("1");

            }
        });
        calendarDept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), CalendarFlight.class);
                startActivity(i);
            }
        });
        calendarReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), CalendarFlight.class);
                startActivity(i);
            }
        });
        text_hiddenFrom.setText(datefrom);
        text_hiddenFrom.setAlpha(1);

        text_hiddenTo.setText(dateto);
        text_hiddenTo.setAlpha(1);
        return rootView;
    }

}
