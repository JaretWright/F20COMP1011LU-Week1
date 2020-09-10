public class Main {
    public static void main(String[] args)
    {
        HandCleaner hc = new HandCleaner("Sky's Jet Fuel",
                    100, 70, 15);

        hc.pump();
        hc.pump();

        System.out.println(hc);
    }
}
