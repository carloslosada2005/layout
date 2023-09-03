package moviles2023.layout.ui.theme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import moviles2023.layout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Edicion_perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Edicion_perfil extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public Edicion_perfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Edicion_perfil.
     */
    // TODO: Rename and change types and number of parameters
    public static Edicion_perfil newInstance(String param1, String param2) {
        Edicion_perfil fragment = new Edicion_perfil();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    EditText nombre,apellido,correo,cargo,telefono,fecha;
    Button guardar;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        nombre = (EditText) getView().findViewById(R.id.nombre_editable);
        apellido = (EditText) getView().findViewById(R.id.apellido_editable);
        correo = (EditText) getView().findViewById(R.id.correo_editable);
        cargo = (EditText) getView().findViewById(R.id.cargo_editable);
        telefono = (EditText) getView().findViewById(R.id.telefono_editable);
        fecha = (EditText) getView().findViewById(R.id.fecha_nac_editable);

        guardar = (Button)  getView().findViewById(R.id.guardar_boton);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre.setClickable(true);
                nombre.setFocusable(false);
                nombre.setInputType(0);
                nombre.setTextIsSelectable(false);

            }
        });

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edicion_perfil, container, false);
    }
}