package com.example.festaseeventos.Activity.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import com.example.festaseeventos.R;

public class InformacoesFragment extends Fragment {

    private EditText editLocalFesta;
    private EditText editData;
    private EditText editNumConvidados;
    private ImageView imagemClick;
    private FrameLayout frameLayout;

    private String[] cardViewNome = new String[] {"Festa de aniversario", "Bodas", "Datas comemorativas",
            "Casamento", "Corporativa", "Debutante", "Escolar", "Outros"};

    private int[] cardViewImg = {R.drawable.aniversario, R.drawable.bodas, R.drawable.datas_comemorativas,
            R.drawable.casamento, R.drawable.corporativa, R.drawable.debutante, R.drawable.escolar, R.drawable.outros};

    // Required empty public constructor
    public InformacoesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_informacoes, container, false);

        editLocalFesta = view.findViewById(R.id.edit_local_festa);
        editData = view.findViewById(R.id.edit_data);
        editNumConvidados = view.findViewById(R.id.edit_num_convidados);
        imagemClick = view.findViewById(R.id.imagemClick);
        frameLayout = view.findViewById(R.id.frameLayout);

        //Configurando o adapter e a listagem dos itens
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, cardViewNome);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Configuração do spinner do layout
        Spinner informacoesSpinner = view.findViewById(R.id.spinner_categoria);
        informacoesSpinner.setAdapter(adapter);


        informacoesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        editLocalFesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "toque", Toast.LENGTH_SHORT).show();
            }
        });

        imagemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayout.setVisibility(View.VISIBLE);

            }
        });

        // Inflate the layout for this fragment
        return view;

    }


}
