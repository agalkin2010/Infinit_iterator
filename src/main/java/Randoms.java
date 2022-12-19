import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        MyIterator iterator = new MyIterator();
        return iterator;
    }

    private class MyIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return (random.nextInt(max - min + 1) + min);
        }
    }

}
