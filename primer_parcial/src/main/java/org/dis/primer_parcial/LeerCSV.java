// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis.primer_parcial;

import java.awt.List;

// Otros imports ...

public class LeerCSV {

    public List<golfPlayer> parseaCSV(String path) {
        ....
        List<golfPlayer> players = csvToBean.parse();
        return players;
    }
}
