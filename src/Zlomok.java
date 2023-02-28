import java.util.Scanner;

public class Zlomok {
    private int cit;
    private int men;

    public int getCit()
    {
        return cit;
    }

    public int getMen()
    {
        return men;
    }

    public Zlomok plus(Zlomok other)
    {
        return new Zlomok(this.cit*other.men+other.cit*this.men, this.men*other.men);
    }

    public Zlomok plus(int other)
    {
        return new Zlomok(this.cit + other * this.men, this.men);
    }

    public Zlomok minus(Zlomok other)
    {
        return new Zlomok(this.cit*other.men-other.cit*this.men, this.men*other.men);
    }

    public Zlomok minus(int other)
    {
        return new Zlomok();
    }

    public Zlomok krat(Zlomok other)
    {
        return new Zlomok(this.cit*other.cit, this.men*other.men);
    }

    public Zlomok deleno(Zlomok other)
    {
        return new Zlomok(this.cit*other.men, this.men*other.cit);
    }

    public boolean equals(Zlomok other)
    {
       return this.cit == other.cit && this.men == other.men;
    }

    private int NSD(int c1, int c2)
    {
        int t;
        while (c2 != 0)
        {
            t = c2;
            c2 = c1 % c2;
            c1 = t;
        }
        return c1;
    }

    Zlomok (int pCit, int pMen)
    {

        try
        {
            if (pMen==0) throw new ArithmeticException();
            int nsd = NSD(pCit, pMen);
            cit=pCit/nsd;
            men=pMen/nsd;
        }
        catch(ArithmeticException e)
        {
            System.out.println("nulou sa neda delit");
            cit=pCit;
            men = 1;
        }
    }

    Zlomok (int pCit)
    {
        cit=pCit;
        men=1;
    }
    public Zlomok()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj citatel");
        cit = sc.nextInt();
        System.out.println("zadaj menovatel");
        men = sc.nextInt();
    }

    @Override
    public String toString()
    {
        /*if(men!=1)
        {
            return cit+"/"+men;
        }
        return cit+"";*/

        return (men!=1)?cit+"/"+men:Integer.toString(cit);
        //return super.toString();
    }
}
