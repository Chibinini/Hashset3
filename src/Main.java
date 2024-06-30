import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Creazione di un HashSet di Stringhe
        Set<Integer> intSet = createIntHashSet();

        // Creazione di un oggetto String e inserimento nell' HashSet
        Integer newNumber = 4;
        intSet.add(newNumber);

        //Ciclo l'HashSet per controllare se il numero appena inserito è già presente nell'HashSet
        for (Integer element : intSet) {
            if(element.equals(newNumber)){
                intSet.remove(element);
            }
        }
        //Svuota hashSet
        Set<Integer> emptyIntSet = clearSet(intSet);

        //Verifica se è vuoto
        boolean isEmptyHashSet = emptyIntSet.isEmpty();

        // Stampare il risultato della verifica
        System.out.println("L'hashset è vuoto? :" + isEmptyHashSet);
    }

    public static Set<Integer> createIntHashSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        return set;
    }

    public static Set<Integer> clearSet(Set<Integer> set) {
        set.clear();
        return set;
    }
}