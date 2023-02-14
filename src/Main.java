public class Main
{
    public static void main(String[] args)
    {
        Zlomok Z1 = new Zlomok(4, 3);
        Zlomok Z2 = new Zlomok(6,5);
        System.out.println(Z1);
        System.out.println(Z2);

        System.out.println(Z1.plus(Z2));
        System.out.println(Z1.plus(3));
        System.out.println(Z1.minus(Z2));
        System.out.println(Z1.krat(Z2));
        System.out.println(Z1.deleno(Z2));
        System.out.printf("%s + %s = %s",Z1,Z2,Z1.plus(Z2));
    }
}
