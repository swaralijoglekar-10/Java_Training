package brandNewJavaLearning;

public class TemperatureConverter {

    public static double celciusToFahrenheit(double celcius){
        // F = C * (9.0/5) + 32
        return (celcius * (9.0/5))+32 ;
    }

    public static void main(String[] args) {
        System.out.print(celciusToFahrenheit(37));
    }

    // division (9/5) is performed as integer division, which results in 1 instead of 1.8.
    // To fix this, you should use 9.0/5 to ensure floating-point division.

    
}
