public class Overload {

public static double getAverage (double first , double second){
    return (first+second)/2.0;
}

public static double getAverage (double first, double second, double third){
    return (first+second+third)/3.0;
}

public static double getAverage (double [] num) {
    double sum = 0.0;
    for (int i = 0; i < num.length; i++) {
        sum += num[i];
    }

    return (sum / num.length);

}


public static double getRectangleArea (double width, double length){

    return width*length;

}
public static int getRectangleArea(int width, int length){
    return width*length;
}

public static void main (String [] args){
    double [] num = new double[5];
    num [0]= 10.0;
    num [1] = 12.0;
    num [2] = 13.0;
    num [3]= 12.0;
    num [4]= 14.0;

    System.out.println(Overload.getAverage(num));
    System.out.println(Overload.getAverage(5.0,3.0));
    System.out.println("Rectangle area is " + Overload.getRectangleArea(12.0,14.0));





}


}







