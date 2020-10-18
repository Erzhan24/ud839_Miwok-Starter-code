package com.example.android.miwok;

import android.content.Context;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of phrases.
 */
public class PhrasesFragment extends Fragment {

    @Override
    public View onCreateView( final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Baldwin Vista", "The Ritz-Carlton",R.drawable.ritz, "900 W Olympic Blvd",R.string.ritz,"+1 213-743-8800"));
        words.add(new Word("Baldwin Vista", "The Beverly Hills Hotel Spa",R.drawable.beverly, "9641 Sunset Blvd",R.string.beverly,"+1302608744"));
        words.add(new Word("Canterbury Knolls", "Freeland LA",R.drawable.freeland, "416 W 8th St",R.string.freeland,"+1312608744"));
        words.add(new Word("Castle Heights", "Wald of Astoria Beverly Hills",R.drawable.wald, " 9850 Wilshire Blvd",R.string.wald,"+1310608744"));
        words.add(new Word("Central City", "Four Season Hotel",R.drawable.four, "300 Doheny Dr",R.string.four,"+1 3102732222"));
        words.add(new Word("Edendale", "JW Marriott LA",R.drawable.jw, "900 W Olympic Blvd",R.string.jw,"+1 2137658600"));
        words.add(new Word("Flower District", "Beverly Wilshire Hotel",R.drawable.wilshire, "9500 Wilshire Blvd",R.string.wilshire,"+1 310260874"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }

}

