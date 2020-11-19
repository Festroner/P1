// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis.primer_parcial;
import java.util.*;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

// Otros imports ...

public class LeerCSV {

    public ArrayList<golfPlayer> parseaCSV(String path) {
        
        ArrayList<golfPlayer> players = new CsvToBeanBuilder(FileReader("../../../../../../../best-golf-players.csv"))
        return players;
    }
}
