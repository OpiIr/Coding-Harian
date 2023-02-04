
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class LatihanRandomDouble {

    public static void main(String[] args) {
        LatihanRandomDouble lrd = new LatihanRandomDouble();
        double r = lrd.randomBetweenDouble(0, 1);
        System.out.println(r);
    }

    double randomBetweenDouble(double min, double max) {
        Random r = new Random();
        double value = (r.nextDouble() * (max - min)) + min;
        BigDecimal bd = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
        double newValue = bd.doubleValue();
        return newValue;
    }
}
