package com.example.cuentaloscolores;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class AjustesFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String key) {
        setPreferencesFromResource(R.xml.preferencias, key);
    }
}