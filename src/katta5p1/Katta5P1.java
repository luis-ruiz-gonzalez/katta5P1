package katta5p1;

import java.util.List;

public class Katta5P1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Luis Ruiz\\Documents\\NetBeansProjects\\katta5P1\\email.txt";
        List<String> validMails = MailListReader.read(path);
        insertaListaTabla.insertList(validMails);
    }
    
}
