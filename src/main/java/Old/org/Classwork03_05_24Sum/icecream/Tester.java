package Old.org.Classwork03_05_24Sum.icecream;

public class Tester {
    public void tasteIce(Cone cone){
        while (!cone.isEmpty()){
            IceCreamBall ball = cone.takeBall();
            System.out.println("I tasted " + ball.getTaste());
        }
    }
}
