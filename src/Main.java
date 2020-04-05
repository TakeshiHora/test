public class Main {
    public static void main(String[] args){
        //FizzBuzzクラスのfizzbuzzメソッドの呼び出し
        FizzBuzz.fizzbuzz();
        //テストコードを作って値の確認
        FizzBuzz2 s = new FizzBuzz2(3);
        System.out.println(s.fizzbuzz2());
    }
}
