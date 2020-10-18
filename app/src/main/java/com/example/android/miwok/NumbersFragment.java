package com.example.android.miwok;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class NumbersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Anaheim", "Disneyland",R.drawable.disneyland,"Disneyland Dr Anaheim CA 92802",R.string.disneyland, "+1 7147814636"));
        words.add(new Word("Los Feliz", "Griffith Park",R.drawable.griffith, "4730 Crystal Springs Dr Los Angeles CA 90027 ",R.string.griffith,"+1 3239134688"));
        words.add(new Word("$17.00-$22.00", "LA Zoo",R.drawable.zoo, "5333 Zoo Dr Los Angeles CA 90027",R.string.zoo,"+1 3236444200"));
        words.add(new Word("Santa Monica", "Pacific Park",R.drawable.pacific, "380 Santa Monica Pier Santa Monica CA 90401",R.string.pacific,"+1 3102608744"));
        words.add(new Word("Anaheim", "Adventure city",R.drawable.adventure, "1238 S Beach Blvd Anaheim, CA 92804",R.string.adventure,"+1 7142369300"));
        words.add(new Word("Anaheim", "Raging Waters",R.drawable.raging, "111 Raging Waters Dr San Dimas CA 91773",R.string.raging," +1 9098022200"));
        words.add(new Word("Stanton", "Knotts Berry Farm",R.drawable.knotts, "8039 Beach Blvd Buena Park CA 90620",R.string.knotts,"+1 7142205200"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file. ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}