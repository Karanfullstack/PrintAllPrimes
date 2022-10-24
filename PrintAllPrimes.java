public class PrintAllPrimes {
    public static void main(String[] args) {
        int num = 12;
        printPrimes(num);
    }
    static boolean isPrime(int num){
        if(num < 0)
            return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    static void printPrimes(int num){
        for(int i = 2; i < num; i++)
            if(isPrime(i))
                System.out.println(i + "");
    }
}
