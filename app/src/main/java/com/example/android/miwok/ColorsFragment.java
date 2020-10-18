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
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class ColorsFragment extends Fragment {



    public ColorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Jewelry District", "Universal Studio Hollywood",R.drawable.ush, "100 Universal City Plaza",R.string.ush,"+1 7865623452"));
        words.add(new Word("Gallery Row", "Griffith Observatory",R.drawable.griffitho, "2800 E Observatory Rd",R.string.griffitho,"+1 9483254876"));
        words.add(new Word("Edendale", "LA Museum of Art",R.drawable.museum, "5905 Wilshire Blvd",R.string.museum,"+1 9375726545"));
        words.add(new Word("Civic Center", "Walt Disney Concert Hall",R.drawable.walt, "111 S Grand Ave",R.string.walt,"+1 8746238454"));
        words.add(new Word("Chatsworth", "Natural History Museum of LA",R.drawable.natural, "900 W Exposition Blvd",R.string.natural,"+1 9236754675"));
        words.add(new Word("Brentwood Glen", "Petersen Automotive Museum",R.drawable.petersen, "6060 Wilshire Blvd",R.string.petersen,"+1 9234675858"));

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