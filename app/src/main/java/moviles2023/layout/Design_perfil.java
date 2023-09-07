package moviles2023.layout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import moviles2023.layout.ui.theme.Mercancia;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Design_perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Design_perfil extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    RadioGroup perfil_act;
    ImageButton imagen_perfil;
    Button perfil_edit;
    public Design_perfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Design_perfil.
     */
    // TODO: Rename and change types and number of parameters
    public static Design_perfil newInstance(String param1, String param2) {
        Design_perfil fragment = new Design_perfil();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            perfil_edit=(Button) getView().findViewById(R.id.button_edit);

            perfil_act= (RadioGroup) getView().findViewById(R.id.actividad);
            imagen_perfil= (ImageButton) getView().findViewById(R.id.perfil);
            perfil_act.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if(radioGroup.getCheckedRadioButtonId()==R.id.boton_activo){
                        imagen_perfil.setBackgroundColor(Color.GREEN);
                    } else if (radioGroup.getCheckedRadioButtonId()==R.id.boton_suspendido) {
                        imagen_perfil.setBackgroundColor(Color.YELLOW);
                    }else if (radioGroup.getCheckedRadioButtonId()==R.id.boton_ausente) {
                        imagen_perfil.setBackgroundColor(Color.RED);
                    }
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_design_perfil, container, false);
    }
}