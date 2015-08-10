package io.efthemiosprime.ensoleillement;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] foreastArray = {
            "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 66/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(foreastArray));

        // context                  - getActivity()
        // ID of list item layout   - R.layout.list_item_forecast
        // ID of text view          - R.id.list_item_forecast_textview
        // list of data             - weakForecast

        mForecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast, R.id.list_item_forecast_textview,weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
