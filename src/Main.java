public class Main {
//Muhammet Ali Velibeyoğlu
    public static void main(String[] args) {
        double harmonicMean = 0;
        double harmonicSeries = 0.0;
        double[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (double j : list) {
            if (j == 0) {
                continue;
            } else {
                harmonicSeries += (1 / j);
                harmonicMean = list.length / harmonicSeries;
            }
        }
        System.out.println("Harmonik Ortalama : " + harmonicMean);


    }
}