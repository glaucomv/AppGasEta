package devandroid.glaucomv.appgaseta.controller;

import android.content.SharedPreferences;

import devandroid.glaucomv.appgaseta.database.GasEtaDB;
import devandroid.glaucomv.appgaseta.model.Combustivel;
import devandroid.glaucomv.appgaseta.view.GasEtaActivity;

public class CombustivelController extends GasEtaDB {

    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreferences;
    public static final String NOME_PREFERENCES = "pref_gaseta";


    public CombustivelController(GasEtaActivity activity){
        super(activity);
        preferences =
                activity.getSharedPreferences(NOME_PREFERENCES,0);
        dadosPreferences = preferences.edit();
    }

    public void salvar(Combustivel combustivel){

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDoCombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getRecomendacao());
        dadosPreferences.apply();


    }

    public void limpar(){

        dadosPreferences.clear();
        dadosPreferences.apply();


    }
}
