public class Main {
    public static void main(String[] args) {
        ageAndTemperature(45, -5);
        ageAndTemperature(11, 1);
        ageAndTemperature(26, -3);
        ageAndTemperature(50, 31);
        ageAndTemperature(12, -13);
    }

    public static String ageAndTemperature(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }
}