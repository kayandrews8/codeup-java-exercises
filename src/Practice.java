

public class Practice {

    public static int subtractTen(int num){
        return num - 10;
    }

    public static int summation(int num){
        int sum = 0;
        for(int i=0; i <= num; i++){
            sum += i;
        }
        return sum;
    }

    public static int squareSum(int[] n){
        int total = 0;
        for(int i = 0; i < n.length; i ++){
            total += (i * i);
        }
        return total;
    }



    public static void main(String[] args) {

//        System.out.println(subtractTen(14));

    }

}
