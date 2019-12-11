public class Hen extends Notflyable {

   public void debGrains () {

    }
    public void eat() {
        debGrains();
        super.eat();
    }

}
