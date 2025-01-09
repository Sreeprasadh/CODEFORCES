import java.util.*;

public class amazon {

    static class TreeMultiSet<T> implements Iterable<T> {
        private final TreeMap<T, Integer> map;
        private int size;

        public TreeMultiSet() {
            map = new TreeMap<>();
            size = 0;
        }

        public TreeMultiSet(boolean reverse) {
            if (reverse) {
                map = new TreeMap<>(Collections.reverseOrder());
            } else {
                map = new TreeMap<>();
            }
            size = 0;
        }

        public void clear() {
            map.clear();
            size = 0;
        }

        public int size() {
            return size;
        }

        public int setSize() {
            return map.size();
        }

        public boolean contains(T a) {
            return map.containsKey(a);
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public Integer get(T a) {
            return map.getOrDefault(a, 0);
        }

        public void add(T a, int count) {
            int cur = get(a);
            if (cur + count > 0) {
                map.put(a, cur + count);
            } else {
                map.remove(a);
            }
            size += count;
        }

        public void addOne(T a) {
            add(a, 1);
        }

        public void remove(T a, int count) {
            int cur = get(a);
            if (cur - count > 0) {
                map.put(a, cur - count);
            } else {
                map.remove(a);
            }
            size -= count;
        }

        public void removeOne(T a) {
            remove(a, 1);
        }

        public void removeAll(T a) {
            remove(a, get(a));
        }

        public T ceiling(T a) {
            return map.ceilingKey(a);
        }

        public T floor(T a) {
            return map.floorKey(a);
        }

        public T first() {
            return map.firstKey();
        }

        public T last() {
            return map.lastKey();
        }

        public T higher(T a) {
            return map.higherKey(a);
        }

        public T lower(T a) {
            return map.lowerKey(a);
        }

        public T pollFirst() {
            T a = first();
            removeOne(a);
            return a;
        }

        public T pollLast() {
            T a = last();
            removeOne(a);
            return a;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<>() {
                private final Iterator<T> iter = map.keySet().iterator();
                private int count = 0;
                private T curElement;

                public boolean hasNext() {
                    return iter.hasNext() || count > 0;
                }

                public T next() {
                    if (count == 0) {
                        curElement = iter.next();
                        count = get(curElement);
                    }
                    count--;
                    return curElement;
                }
            };
        }
    }

    static long bigger(TreeMultiSet<Long> s, long vl) {
        if (s.isEmpty()) {
            return -2;
        }
        Long v1 = s.higher(vl);
        if (v1 == null) {
            return -1;
        }
        return v1;
    }

    static long smaller(TreeMultiSet<Long> s, long vl) {
        if (s.isEmpty()) {
            return -2;
        }
        Long itr = s.floor(vl);
        if (itr != null && itr.equals(vl)) {
            itr = s.lower(vl);
            if (itr == null) {
                return -1;
            }
            return itr;
        } else {
            itr = s.lower(vl);
            if (itr == null) {
                return -1;
            }
            return itr;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Long> b = new ArrayList<>(Collections.nCopies((int) n, 0L));
        for (int i = 0; i < n; i++) {
            b.set(i, scanner.nextLong());
        }
        TreeMultiSet<Long> k = new TreeMultiSet<>();
        for (int i = 0; i < n; i++) {
            long v = smaller(k, b.get(i));
            if (v == -1 || v == -2) {
                k.addOne(b.get(i));
            } else {
                k.removeOne(v);
                k.addOne(b.get(i));
            }
        }

        long g = k.size();

        System.out.println(g);

        scanner.close();
    }
}
