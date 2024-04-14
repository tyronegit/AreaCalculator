public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println (area ( 5.0 ));
        System.out.println (area ( -1 ));
        System.out.println (area ( 5.0,4.0 ));
        System.out.println (area ( 1.0,-4.0 ));
        System.out.println (area ( -1.0,4.0 ));
    }

    public static double area(double radius){

        if(radius <= -1.0) {
            System.out.println ("Invalid value");
            return -1.0;
        }
        double pi = 3.141592653589793238;
        double area =  pi * (radius * radius);

        return area;
    }

    public static double area(double x, double y){

        if( x <= -1.0 || y <= -1.0) {
            System.out.println ("Invalid value");
            return -1.0;
        }
        double sum;
        sum = (x * y);

        return sum;
    }

}
