package core.basesyntax.lotteryball;
import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();


    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setBallColor(colorSupplier.getRandomColor());
        ball.setBallNumber(random.nextInt(100));
        return ball;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
}
