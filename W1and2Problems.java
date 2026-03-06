\\LEVEL 1
   public class HarryAge { \\Q1
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}
   public class SamAverage { \\Q2
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
   public class KmToMiles { \\Q3
    public static void main(String[] args) {
        double kilometers = 10.8;
        double miles = kilometers / 1.6;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

\\LEVEL 2

   public class BasicCalculator { \\Q1
    public static void main(String[] args) {

        double number1 = 10.5;
        double number2 = 5.5;

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers 
                “+ number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
    }
}


   public class TriangleArea { \\Q2
    public static void main(String[] args) {

        double base = 10;     // in cm
        double height = 5;    // in cm

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaInches + " and sq cm is " + areaCm);
    }
}

   public class SquareSide { \\Q3
    public static void main(String[] args) {

        double perimeter = 40;

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);
    }
}

\\LEVEL 3

   public class TemperaturConversion { \\Q1
    public static void main(String[] args) {

        double celsius = 25;   // given temperature in Celsius

        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");
    }
}
