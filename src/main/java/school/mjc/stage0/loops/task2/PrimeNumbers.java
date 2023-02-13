package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int j = 1;
        int count = 0;
        while (i <= printToInclusive){
            while(j <= i){
                if(i % j == 0){
                    count++;
                }
                j++;
            }
            if(count < 3){
                System.out.println(i);
            }
            count = 0;
            j = 1;
            i++;
        }
    }
}
