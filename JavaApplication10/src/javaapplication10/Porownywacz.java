package javaapplication10;
import java.util.*;
public class Porownywacz implements Comparator<Miasto> {
    public int compare(Miasto a, Miasto b){
        if(a.getLiczbaLudnosci() < b.getLiczbaLudnosci())
            return 1;
        else if(a.getLiczbaLudnosci() > b.getLiczbaLudnosci())
            return -1;
        else
            return a.getNazwa().compareTo(b.getNazwa());
    }
}