package javaapplication10;
import java.util.*;
public class Zadaniemiasta {
    public static void main(String[] args) {
        Miasto warszawa = new Miasto("Warszawa", 200000 );
        Miasto gdansk = new Miasto("GdaĹsk", 15000);
        Miasto wroclaw = new Miasto("WrocĹaw", 44000);
        
        Miasto moskwa = new Miasto("Moskwa", 18000);
        Miasto kazan = new Miasto("Kazan", 12000);
        Miasto kaliningrad = new Miasto("Kaliningrad", 3000);
        
        Miasto berlin = new Miasto("Berlin", 300000);
        Miasto monachium = new Miasto("Monachium", 26000);
        Miasto hanover = new Miasto("Hanover", 4000);
        
        Panstwo polska = new Panstwo("Polska",1000000,warszawa);
        Panstwo rosja = new Panstwo("Rosja",25000000,moskwa);
        Panstwo niemcy = new Panstwo("Niemcy",4000000,berlin);
        
        HashMap<Panstwo, ArrayList<Miasto>> mapa = new HashMap();
        
        ArrayList<Miasto> miasta = new ArrayList();
        miasta.add(warszawa);
        miasta.add(gdansk);
        miasta.add(wroclaw);
        mapa.put(polska, miasta);
        
        miasta = new ArrayList();
        miasta.add(moskwa);
        miasta.add(kazan);
        miasta.add(kaliningrad);
        mapa.put(rosja, miasta);
        
        miasta = new ArrayList();
        miasta.add(berlin);
        miasta.add(monachium);
        miasta.add(hanover);
        mapa.put(niemcy, miasta);
        
        ArrayList<Panstwo> panstwalist = new ArrayList();
        panstwalist.addAll(mapa.keySet());
        
        Random r = new Random();
        int los = r.nextInt(panstwalist.size())+1;
        
        Panstwo p=null;
        Iterator it = panstwalist.iterator();
        int k=0;
        while(k<los){
            p = (Panstwo) it.next();
            k++;
        }
        
        Miasto tab[] = mapa.get(p).toArray(new Miasto[]{});
        Arrays.sort(tab, new Porownywacz());
        System.out.println(tab[0]);
        
        TreeSet<Miasto> tree = new TreeSet(new Porownywacz());
        for(Panstwo x : mapa.keySet())
            tree.addAll(mapa.get(x));
        
        System.out.println(tree);
        
        Miasto tabli[] = tree.toArray(new Miasto[]{});
        Arrays.sort(tab, new Porownywacz());
        for(Miasto element:tabli) System.out.println(element);
        
    }
    
}