
public class Interest {
    double principal, time, rate_of_interest;
    public Interest(double p,double t,double r){
        principal=p;
        time=t;
        rate_of_interest=r;
    }
}
class simple_interest extends Interest
{
    public simple_interest(double principal,double time,double rate_of_interest)
    {
        super(principal, time, rate_of_interest);
    }
    public double cal ()
    {
        return (principal*time*rate_of_interest)/100;
    }
}
class compound_interest extends Interest
{
    public compound_interest(double principal,double time,double rate_of_interest)
    {
        super(principal,time,rate_of_interest);
    }
    public double calc()
    {
        return (principal+Math.pow((1+rate_of_interest),time));
    }
}