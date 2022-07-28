public class Test
{
    public static void main(String[] args)
    {
        Audi audi = new SmartAudi();
        audi.run();
        SmartAudi smartAudi = (SmartAudi)audi;
        smartAudi.automaticParking();
        smartAudi.automaticDrive();
        smartAudi.run();
    }
}
