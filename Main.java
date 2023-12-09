import javax.swing.*; //Swing'i çalıştırmak için gerekli olan import.

public class Main {
    public static void main(String[] args) {
//Uygulamayı main'de çalıştırırız.
        HWButton frame = new HWButton();
        SwingUtilities.invokeLater(() ->new HWButton());
    }
}

