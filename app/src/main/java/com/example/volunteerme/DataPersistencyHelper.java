package com.example.volunteerme;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Volunteers> volunteer)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(volunteer );
        editor.putString("users", json);
        editor.commit();
    }

    public static List<Volunteers> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("users",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Volunteers>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Volunteers> volunteer = new ArrayList<Volunteers>();
            volunteer.add(new Volunteers(R.drawable.alon_davis, "Alon Davis", "General Practitioner", "MD"));
            volunteer.add(new Volunteers(R.drawable.chrstina_yang, "Chrstina Yang", "Cardiothoracic surgeon", "MD,PhD, FACS"));
            volunteer.add(new Volunteers(R.drawable.derek_shepherd, "Derek Shepherd", "Neurosurgeon", "MD, FACS"));
            volunteer.add(new Volunteers(R.drawable.ken_jeong, "Ken Jeong", "Physician", "MD"));
            volunteer.add(new Volunteers(R.drawable.meredith_grey, "Meredith Grey", "General Surgeon", "MD, FACS"));
            volunteer.add(new Volunteers(R.drawable.sheldon_cooper, "Sheldon Cooper", "Theoretical Physicist", "PhD"));
            volunteer.add(new Volunteers(R.drawable.steven_strange, "Steven Strange", "Neurosurgeon", "MD, PhD"));


            return volunteer;
        }
    }

    public static List<Organizations> LoadData1()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("users",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Volunteers>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Organizations> organizations = new ArrayList<Organizations>();
            organizations.add(new Organizations(R.drawable.doctors_wout_borders, "Doctors without Borders", "General Practitioner", "New York/Global"));
            organizations.add(new Organizations(R.drawable.intern_medical_corps, "International Medical Corps", "Cardiothoracic surgeon", "Ecuador"));
            organizations.add(new Organizations(R.drawable.intern_medical_relief, "International Medical Relief", "Neurosurgeon", "Israel/Kazakhstan"));
            organizations.add(new Organizations(R.drawable.mercy_ships, "Mercy Ships", "Physician", "Papua New Guinea"));
            organizations.add(new Organizations(R.drawable.moh, "Ministry of Health", "General Surgeon", "Bnei Brak"));
            organizations.add(new Organizations(R.drawable.project_hope, "Project Hope", "CardioSurgeon", "Zambia"));
            organizations.add(new Organizations(R.drawable.ta_medical_center, "Ichlov Medical Center", "Neurosurgeon", "Tel-Aviv Yafo"));


            return organizations;
        }
    }

}