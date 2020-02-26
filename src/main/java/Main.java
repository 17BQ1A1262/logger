
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String args[])
    {
        final Logger log = LogManager.getLogger(Main.class);
        Scanner scan=new Scanner(System.in);

        log.info("Enter Principal");
        double p=scan.nextDouble();
        log.info("Enter time");
        double t=scan.nextDouble();
        log.info("Enter rate_of_interest");
        double r=scan.nextDouble();

        log.info("Enter construction details");
        log.info("Is automated ?");
        boolean a=scan.nextBoolean();
        log.info("Enter material standard");
        String m=scan.next();
        log.info("Enter area ");
        double area=scan.nextDouble();

        simple_interest s =new simple_interest(p,t,r);
        double SI=s.cal();
        log.info("Simple Interest : "+SI);

        compound_interest c =new compound_interest(p,t,r);
        double CI=c.calc();
        log.info("Compound Interest : "+CI);


        Construction con =new Construction(a,m,area);
        double cost=con.construct();
        log.info("Total Cost for construction : "+cost);


    }
}