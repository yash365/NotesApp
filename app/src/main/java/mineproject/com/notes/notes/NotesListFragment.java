package mineproject.com.notes.notes;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mineproject.com.notes.R;


public class NotesListFragment extends Fragment {

    public NotesListFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static NotesListFragment newInstance(String param1, String param2) {
        NotesListFragment fragment = new NotesListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes_list, container, false);
    }
}
