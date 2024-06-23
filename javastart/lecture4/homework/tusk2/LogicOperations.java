package sk.com.ymca.javastart.lecture4.homework.tusk2;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10 , z = 15;
        int a = x += y >> x++ * z;
        int b = z = ++x & y * 5;
        int c = y /= x + 5 | z;
        int d = z = x++ & y * 5;
        int e = x = y << x++ ^ z;
        System.out.println(a +" " + b +" "+ c+" "+d+" "+e);


    }
}
