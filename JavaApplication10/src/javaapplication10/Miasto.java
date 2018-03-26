package javaapplication10;
import java.util.*;

public class Miasto {
    private String nazwa;
    private int liczbaLudnosci;

    public Miasto(String nazwa, int liczbaLudnosci) {
        this.nazwa = nazwa;
        this.liczbaLudnosci = liczbaLudnosci;
    }

    @Override
    public String toString() {
        return nazwa + " " + liczbaLudnosci;
    }

    @Override
    public boolean equals(Object obj) {
        final Miasto mst = (Miasto) obj;
        if(nazwa==mst.nazwa && liczbaLudnosci==mst.liczbaLudnosci){
            return true;
        }else{
            return false;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }
    
    
    
}