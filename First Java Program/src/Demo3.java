public class Demo3 {

    public int sumAll(int...numbers){

        int result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Demo3 y = new Demo3();
        System.out.println(y.sumAll(1,2,3,4,5,100,5000));
    }

}
