//Gerekli importlar.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HWButton extends JFrame implements ActionListener {//Butonların bulunacağı pencereyi oluşturduk.
    //Ayrıca ActionListener'ı implemente ettik.
    private JButton[] buton; //16 buton olacağı için butonlar dizi olarak tanımlandı.
    private boolean[] butonDurum;  // 16 butonun durumları için yine butonDurum adında dizi tanımlandı.
    private ImageIcon pasifSimge; // Pasif Simge için
    private ImageIcon aktifSimge; // Aktif Simge için

    //Butonu burada gloval bir değişken olarak tanımlamasaydık allta override edilen yerde çalışmazdı.
    HWButton() {
        buton = new JButton[16];//16 buton dizi ile oluşturuldu
        butonDurum = new boolean[16]; //16 ayrı buton için 16 ayrı durum için bir dizi daha oluşturuldu.
        aktifSimge = new ImageIcon("C:\\Users\\Volkan\\Downloads\\happy3.png");
        pasifSimge = new ImageIcon("C:\\Users\\Volkan\\Downloads\\sad4.jpg");
        for (int i = 0; i < 16; i++) {

            buton[i] = new JButton();//Buton eklemesi yapıldı.
            buton[i].setPreferredSize(new Dimension(200, 200));
            buton[i].addActionListener(this);//Butona tıklandığında Clicked yazısı çıkması için gereklidir.
            buton[i].setFocusable(false);//Yazı ve Resmin Sınırındaki çizgileri kaldırdık.
            buton[i].setText((i + 1) + " .button");//Butonun üzerinde yazacak olan yazı.
            butonDurum[i] = false;//Butonlar başlangıçta pasiftir.

            buton[i].setIcon(pasifSimge);
            buton[i].setBackground(Color.GRAY);//Arkaplan rengi.
        }

        JPanel butonpanel = new JPanel(new GridLayout(4, 4, 4, 4));
        for (JButton button : buton) {
            butonpanel.add(button);
        }
        this.add(butonpanel);//Butonun görünmesini sağlıyoruz.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(200, 200);//Boyut
        this.setLayout(new FlowLayout());
        this.setVisible(true);//Pencerenin görünebilmesini sağlıyouz.

    }


    @Override   //İmplemente edilen ActionEvent burada Override edilir.
    public void actionPerformed(ActionEvent HW) {
        for (int i = 0; i < 16; i++) {
            if (HW.getSource() == buton[i]) {
                ButonDurumGuncelle(i);//Buton durumunu değiştiririz.
                ButonRenkAyari();//Rengini güncelleme
                System.out.println("Clicked the " + (i + 1) + ".Button");
                //Burada source butona eşitse butona tıklandığında Clicked yazısı çıkacaktır.
            }
        }
    }

    private void ButonDurumGuncelle(int index) {
        butonDurum[index] = !butonDurum[index]; // Buton durumunu tersine çevirme
        //Butonun durumuna göre simgeyi ayaralamak için açılmış olan if ve else,basılmışsa aktif, değilse pasif.
        if (butonDurum[index]) {
            buton[index].setIcon(aktifSimge);
        } else {
            buton[index].setIcon(pasifSimge);
        }

    }

    private void ButonRenkAyari() {
        // Buton renklerini duruma göre ayarla
        for (int i = 0; i < 16; i++) {
            if (butonDurum[i]) {
                buton[i].setBackground(Color.WHITE); // Aktif arkaplan rengi beyaz olur.
            } else {
                buton[i].setBackground(Color.GRAY);  // Pasif arkaplan rengi  Gri olur.
            }
        }
    }
}

