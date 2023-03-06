public class Bod
{
    private Zlomok surX;
    private Zlomok surY;

    Bod(Zlomok X, Zlomok Y)
    {
        surX = X;
        surY = Y;
    }

    Bod()
    {
        surX = new Zlomok();
        surY = new Zlomok();
    }

    public double getDistance(Bod other)
    {
        Zlomok tmp = ((this.surX.minus(other.surX)).krat(this.surX.minus(other.surX))).plus((this.surY.minus(other.surY)).krat(this.surY.minus(other.surY)));
        return Math.sqrt((double) tmp.getCit()/tmp.getMen());
    }

    public Bod getCenter(Bod other)
    {
        Zlomok tmp = new Zlomok(1, 2);
        return new Bod ((this.surX.plus(other.surX)).krat(tmp), (this.surY.plus(other.surY)).krat(tmp));
    }

    //vygenerovat niekolko random bodov a naist najvzdialenejsi od 0, 0

    @Override
    public String toString() 
    {
        return ("[" + surX + "," + surY + "]");
    }
}
