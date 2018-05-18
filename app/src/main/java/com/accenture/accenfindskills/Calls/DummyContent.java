package com.accenture.accenfindskills.Calls;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {


    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /*private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }*/

    static{
        //add 3 sample items
        Log.i("asdasd", "Carga de los datos");
        addItem(new DummyItem("1", "Mauricio", "Carpentier", "Mauricio.carpentier@gmail.com", "968462247"));
        addItem(new DummyItem("2", "Adolfo", "Vargas", "Adolfo.Vargas@gmail.com", "968462247"));
        addItem(new DummyItem("3", "Alan", "Brito", "Alan.Brito.Delgado@gmail.com", "987654321"));
    }

    private static void addItem(DummyItem item) {
        Log.i("asdasd1", "Carga de los datos");
        ITEMS.add(item);
        Log.i("asdasd2", "item" + item);
        ITEM_MAP.put(item.id, item);
        Log.i("asdasd3", "ITEM_MAP" + ITEM_MAP);
    }

    /*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
    */

    public static class DummyItem {
        public final String id;
        public final String nombre;
        public final String Apellido;
        public final String correo;
        public final String telefono;

        public DummyItem(String id, String nombre, String Apellido, String correo, String telefono) {
            this.id = id;
            this.nombre = nombre;
            this.Apellido = Apellido;
            this.correo = correo;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return nombre + " " + Apellido;
        }
    }
}
