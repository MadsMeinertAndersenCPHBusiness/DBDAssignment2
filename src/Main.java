public class Main {
    public static void main(String[] args) {
        BloomFilter bloomFilter = new BloomFilter();


        bloomFilter.add(10);

        System.out.println(bloomFilter.check(10));
        System.out.println(bloomFilter.check(5));
        System.out.println(bloomFilter.check(3));
        System.out.println(bloomFilter.check(1));
    }
}
