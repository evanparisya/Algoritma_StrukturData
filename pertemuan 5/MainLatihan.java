public class MainLatihan {
    public static void main(String[] args) {
        String[][] data = {
            {"BMW", "M2 Coupe", "2016", "6816", "728"},
            {"Ford", "Fiesta ST", "2014", "3921", "575"},
            {"Nissan", "370Z", "2009", "4360", "657"},
            {"Subaru", "BRZ", "2014", "4058", "609"},
            {"Subaru", "Impreza WRX STI", "2013", "6255", "703"},
            {"Toyota", "AE86 Trueno", "1986", "3700", "553"},
            {"Toyota", "86/GT86", "2014", "4180", "609"},
            {"Volkswagen", "Golf GTI", "2014", "4180", "631"}
        };

        int maxAcceleration = Latihan.MaxAcceleration(data, 0, data.length - 1);
        int minAcceleration = Latihan.MinAcceleration(data, 0, data.length - 1);
        double averagePower = Latihan.rataTopPower(data);

        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);
        System.out.println("Top Acceleration Terendah: " + minAcceleration);
        System.out.println("Rata-rata Top Power: " + averagePower);
    }

}