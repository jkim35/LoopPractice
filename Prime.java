public class Prime{
    public static void main(String[]args){
        System.out.println(countPrimes(1000000)+"                    ");
    }
    public static int countFactors(int num){
        int currentI = 1;
        int numberOfFactors = 0;
        while(currentI <= num){
            if(num%currentI==0){
                numberOfFactors++;
            }
            currentI++;
        }
        return numberOfFactors;
    }
    public static boolean isPrime(int num){
        if(countFactors(num)==2){
            return true;
        }else{
            return false;
        }
    }
    public static int countPrimes(int num){
        int i = 2;
        int numberOfPrimes = 0;
        while(i<=num){
            if(isPrime(i)){
                numberOfPrimes++;
                System.out.println(i);
            }
            i++;
        }
        return numberOfPrimes;
    }
}
