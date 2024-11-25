package soal1;

import java.util.LinkedList;
import java.util.Random;

class Dadu {

    private LinkedList<Integer> angkaDadu;

    Dadu (){
        angkaDadu = new LinkedList<>();
    }

    int acakNilai(){
        Random random = new Random();
        int nilai = random.nextInt(6) + 1;
        return nilai;
    }

    LinkedList<Integer> getAngkaDadu(){
        return angkaDadu;
    }

    void lemparanDadu(int n){
        for (int i = 0; i < n; i++){
            angkaDadu.add(acakNilai());
        }
    }

    int hitungDadu(int n){
        int total = 0;
        for (int i = 0; i < n; i++){
            total += angkaDadu.get(i);
        }
        return total;
    }
}