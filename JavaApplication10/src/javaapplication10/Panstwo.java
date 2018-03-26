package javaapplication10;
import java.util.*;

public class Panstwo {
    private String nazwa;
    private double powierzchnia;
    private Miasto stolica;

    public Panstwo(String nazwa, double powierzchnia, Miasto stolica) {
        this.nazwa = nazwa;
        this.powierzchnia = powierzchnia;
        this.stolica = stolica;
    }

    @Override
    public String toString() {
        return "nazwa=" + nazwa + ", powierzchnia=" + powierzchnia + ", stolica=" + stolica;
    }

    @Override
    public boolean equals(Object obj) {
        final Panstwo panst = (Panstwo) obj;
        if(nazwa==panst.nazwa && powierzchnia==panst.powierzchnia && stolica==panst.stolica){
            return true;
        }else{
            return false;
        }
    }    
}