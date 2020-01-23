package katta5p1;

import java.util.Iterator;
import java.util.List;

public class insertaListaTabla {

    public static void insertList(List<String> list){
        InsertarDatosTabla idt = new InsertarDatosTabla();
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()){
            idt.insert(iterator.next());
        }

    }
    
}
