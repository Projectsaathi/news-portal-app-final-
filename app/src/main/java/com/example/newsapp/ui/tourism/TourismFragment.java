package com.example.newsapp.ui.national;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;
import com.example.newsapp.models.ArticleAdapter;
import com.example.newsapp.models.National;
import com.example.newsapp.models.NationalAdapter;
import com.example.newsapp.models.Tourism;
import com.example.newsapp.models.TourismAdapter;
import com.example.newsapp.ui.tourism.TourismViewModel;

import java.util.List;

public class TourismFragment extends Fragment {

    private TourismViewModel tourismViewModel;
    private RecyclerView recyclerView;
    private TourismAdapter tourismAdapter;
    private List<Tourism> tourisms;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tourismViewModel = ViewModelProviders.of(this).get(TourismViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tourism, container, false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        tourismViewModel = ViewModelProviders.of(this).get(TourismViewModel.class);

        tourismViewModel.getTourism().observe(this, new Observer<List<Tourism>>() {
            @Override
            public void onChanged(List<Tourism> tourisms) {

                tourismAdapter = new TourismAdapter(getActivity(), tourisms);



                recyclerView.setAdapter(tourismAdapter);
                tourismAdapter.notifyDataSetChanged();

            }
        });

        return root;
    }
}