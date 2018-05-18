package com.accenture.accenfindskills;


import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.accenture.accenfindskills.Calls.DummyContent;
/*import com.example.mcarpentiervargas.myapplication2.dummy.DummyContent;*/


public class personaDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";


    private DummyContent.DummyItem mItem;

    public personaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            Log.i("asdasdasdasdasdas", "ARG_ITEM_ID: " + ARG_ITEM_ID);
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
           /* if (mItem == null) {
                Log.i("asdasdasdasdasdas", "Entro en tus cachetes");
                mItem = new DummyContent.DummyItem("3", "Alan", "Brito", "Alan.Brito.Delgado@gmail.com", "987654321");
            }*/
            Log.i("asdasd", "mItem: " + mItem);
            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.nombre + " " + mItem.Apellido); /* eliminar */
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.persona_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.txtnombre)).setText(mItem.nombre + " " + mItem.Apellido);
            ((TextView) rootView.findViewById(R.id.txtcorreo)).setText(mItem.correo);
            ((TextView) rootView.findViewById(R.id.txttelefono)).setText(mItem.telefono);
        }

        return rootView;
    }
}

