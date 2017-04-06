package com.company.alex.introslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Alex on 06/04/2017.
 */

public class PrefManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    //Modo de Shared Preferences
    int PRIVATE_MODE = 0;

    //Archivo de Shared Preferences
    private static final String PREF_NAME = "saludo-app";
    private static final String ES_PRIMERA_VEZ = "EsPrimeraVezQueArranca";

    public PrefManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setEsPrimeraVez(Boolean esPrimeraVez) {
        editor.putBoolean(ES_PRIMERA_VEZ, esPrimeraVez);
        editor.commit();
    }

    public boolean esPrimeraVezLanzar() {
        return pref.getBoolean(ES_PRIMERA_VEZ, true);
    }
}
