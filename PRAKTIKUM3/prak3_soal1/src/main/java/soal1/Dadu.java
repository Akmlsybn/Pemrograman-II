package soal1;

import java.util.LinkedList;
import java.util.Random;

public class Dadu {

    private LinkedList<Integer> angkaDadu;

    public Dadu (){
        angkaDadu = new LinkedList<>();
    }

    public int acakNilai(){
        Random random = new Random();
        int nilai = random.nextInt(6) + 1;
        return nilai;
    }

    public LinkedList<Integer> getAngkaDadu(){
        return angkaDadu;
    }

    public void lemparanDadu(int n){
        for (int i = 0; i < n; i++){
            angkaDadu.add(acakNilai());
        }
    }

    public int hitungDadu(int n){
        int total = 0;
        for (int i = 0; i < n; i++){
            total += angkaDadu.get(i);
        }
        return total;
    }
}