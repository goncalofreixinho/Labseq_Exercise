package alticelabs;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Labseq Class to calculate the values of the requested sequence.
 * A caching method is used to improve the efficiency of the calculation.
 */

@ApplicationScoped
public class Labseq {
    // Cache to store the results of previous calculations and improve performance.
    private final ConcurrentHashMap<Integer, Long> Cache = new ConcurrentHashMap<>();

    /**
     *
     * @param n  index in the sequence to calculate the value.
     * @return calculated value of the sequence for index n.
     * @throws IllegalArgumentException if n is negative.
     */


    public long calculateLabseq(int n) {
        if (n < 0 ){
            throw new IllegalArgumentException("n must be non-negative");
        }
        long startTime = System.currentTimeMillis(); // Start time measurement.
        long result = calculateLabseqInternal(n);
        long endTime = System.currentTimeMillis();// End time measurement
        long duration = endTime - startTime; // Calculate duration

        System.out.println("Runtime to calculate l(" + n + "): " + duration + " ms");
        return result;
    }

    /**
     * Internal method to calculate the sequence value. Uses Recursion and Caching.
     *
     * @param n The index in the sequence to calculate the value.
     * @return The sequence value for index n.
     */
    public long calculateLabseqInternal(int n) {
        if ( n == 0 ) return 0;
        if ( n == 1 || n == 3 ) return 1;
        if ( n == 2 ) return 0;

        if (Cache.containsKey(n)){
            return Cache.get(n);
        }
        long result = calculateLabseqInternal(n-4) + calculateLabseqInternal(n-3);
        Cache.put(n, result);
        return result;
    }

    /**
     * Clears the cache of stored calculations if desired
     */
    public void clearCache() {
        Cache.clear();
    }
}
