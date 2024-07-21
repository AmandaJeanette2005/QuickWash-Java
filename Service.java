public class Service {
    String[][] data = {
        {"Amanda", "098765432"},
        {"Budi", "123456789"},
        {"Cindy", "987654321"}
    };

    public void serviceMenu(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(1+i);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            // Pindah baris setelah mencetak semua elemen dalam satu baris
            System.out.println(); 
        }
    }
    
}
