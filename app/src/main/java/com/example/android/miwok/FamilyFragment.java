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
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class FamilyFragment extends Fragment {



    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create and setup the {@link AudioManager} to request audio focus


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Arts District","Traktir Restaurant ",R.drawable.traktir, "8151 Santa Monica Blvd",R.string.traktir,"+1 3236543030"));
        words.add(new Word("Arts District","N/naka",R.drawable.nnaka, "3455 Overland Ave",R.string.nnaka," +1 3108366252"));
        words.add(new Word("Baldwin Hills","Providence",R.drawable.providence, "5955 Melrose Ave",R.string.providence,"+17346543535"));
        words.add(new Word("Arleta","71 Above",R.drawable.above, "380 Santa Monica Pier Santa Monica CA 90401",R.string.above,"+13102608744"));
        words.add(new Word("Arlington Heights","PREMIER Restaurant ",R.drawable.premier, "12743 Ventura Blvd",R.string.premier,"+1 8186238844"));
        words.add(new Word("Arts District","Catch LA",R.drawable.catchla, "8715 Melrose Ave",R.string.catchla,"+1315764744"));



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
