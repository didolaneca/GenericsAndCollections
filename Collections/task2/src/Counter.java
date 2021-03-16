import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer>/* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/ counts;

    public Counter(E[] things){
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
        this.counts = new HashMap<>();
        for (E el: things) {
            if(!counts.containsKey(el)) {
                counts.put(el, 1);
            } else {
                counts.put(el, counts.get(el) + 1);
            }
        }
    }

    public Integer getCount(E element){
        /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
/* TODO 
Returns the most frequent key in the HashMap*/
        return counts.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }
}
