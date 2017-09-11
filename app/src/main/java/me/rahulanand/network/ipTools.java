package me.rahulanand.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ipTools extends Activity {

    Button btnIp;
    ListView listaPing;
    EditText edtIP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.network_ping);


        //instanciar os componentes
        btnIp = (Button) findViewById(R.id.btn_ping);
        listaPing = (ListView) findViewById(R.id.listView_ping);
        edtIP = (EditText) findViewById(R.id.edit_ip);

    }
    public void fExecutarPing(View view){
        Editable host = edtIP.getText();
        List<String> listaResponstaPing = new ArrayList<String>();
        //Cria o adapter para a Listview
        ArrayAdapter<String> adapterLista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                listaResponstaPing);

        try {
            String cmdPing = "ping -c 4 "+host;
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(cmdPing);
            BufferedReader in = new BufferedReader(	new InputStreamReader(p.getInputStream()));
            String inputLinhe;

            while((inputLinhe = in.readLine())!= null){
                listaResponstaPing.add(inputLinhe);
                //adiciona para cada linha
                listaPing.setAdapter(adapterLista);
            }

            Toast.makeText(this, "Comando executado com sucesso!", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "Erro: "+e.getMessage().toString(), Toast.LENGTH_SHORT).show();

        }


    }


}
