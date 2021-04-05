public class BloomFilter {
    private int[] bloomFilter = new int[10];
    private final int m = 3;


    public int HashOne(int value){
        return value - 1 % m;
    }
    public int HashTwo(int value){
        return value * 5 % m;
    }


    public void add(int value){
        int hashOneValue = HashOne(value);
        int hashTwoValue = HashTwo(value);

        if (bloomFilter[hashOneValue] == 0){
            bloomFilter[hashOneValue] = 1;
        }
        if (bloomFilter[hashTwoValue] == 0){
            bloomFilter[hashTwoValue] = 1;
        }
    }

    public String check(int value){
        int hashOneValue = HashOne(value);
        int hashTwoValue = HashTwo(value);

        if (bloomFilter[hashOneValue] == 0 || bloomFilter[hashTwoValue] == 0){
            return value + " was NOT present";
        }
        return value + " was PROBABLY present";
    }
}
