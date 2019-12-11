import jdk.nashorn.internal.ir.WhileNode;

public class Loader
{
    public static void main(String[] args)
    {
        Integer i=200000;
        do
        {
            System.out.println("Ticket number "+i);
            i++;
        }
        while (i<210001);
    }}
/* Цикл do..while отличается от цикла while тем, что программа выполняет первую итерацию цикла, а после этого проверяет условия,
т.е. один раз цикл будет выполнен в любом случае. В цикле while сначала идет проверка условия и при его соответствии происходит
выполнение цикла.*/



