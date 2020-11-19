// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis.primer_parcial;

import java.io.*; 
import java.util.*; 
  
import com.opencsv.CSVReader; 
import com.opencsv.bean.CsvToBean; 
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

// Otros imports ...

public class LeerCSV {

    public ArrayList<golfPlayer> parseaCSV(String path) {
        
    	Map<String, String> mapping = new 
                HashMap<String, String>();
    	
    	mapping.put("Posicion", "Posicion"); 
        mapping.put("Nombre", "Nombre"); 
        mapping.put("Apellido", "Apellido"); 
        mapping.put("Pais", "Pais"); 
        mapping.put("Edad", "Edad");
        
        
        HeaderColumnNameTranslateMappingStrategy<golfPlayer> strategy = 
                new HeaderColumnNameTranslateMappingStrategy<golfPlayer>(); 
           strategy.setType(golfPlayer.class); 
           strategy.setColumnMapping(mapping);
           
           CSVReader csvReader = null; 
           try { 
               csvReader = new CSVReader(new FileReader 
               ("D:\\EclipseWorkSpace\\CSVOperations\\StudentData.csv")); 
           } 
           catch (FileNotFoundException e) { 
     
               // TODO Auto-generated catch block 
               e.printStackTrace(); 
           } 
           CsvToBean csvToBean = new CsvToBean(); 
     
           // call the parse method of CsvToBean 
           // pass strategy, csvReader to parse method 
           List<golfPlayer> list = csvToBean.parse(strategy, csvReader); 
     
        return players;
    }
}
