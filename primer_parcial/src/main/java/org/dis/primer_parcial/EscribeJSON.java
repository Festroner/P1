package org.dis.primer_parcial;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json

public class EscribeJSON {

    public static void main(String[] args) {
    	
    	
    	ArrayList<golfPlayer> g = new ArrayList<golfPlayer>();
    	
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonStr = gson.toJson(g);
        System.out.println(jsonStr);
    }
    
 }
