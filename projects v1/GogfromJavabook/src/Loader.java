public class Loader
{
    public static void main(String[] args)
    {
    Integer size = 27;
    String name = "ФИДО";
    Dog myDog = new Dog(name, size);
    Integer x = size - 5;
    if (x < 15) myDog.bark(8);

    while(x > 3)
    {
    myDog.play();
    }

}
