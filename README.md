# OOPHWwork2
GraphQL Hakkında Bazı Tanımlamalar ve Bilgiler

GraphQL 2012'de Facebook tarafından geliştirilmiş, 2015'te ise herkese açık olarak yayınlanmış API'ler(Uygulama Proglama Arayüzleri) için açık kaynaklı bir veri sorgulama ve işleme dili ve bu sorguları yerie getirmek için yazılmış olan uygulamalardır.2015'te herkese açık olarak yayınlandıktan sonra 7 Kasım 2018 tarihinde Facebook tarafından kâr amacı gütmeyen bir kuruluş olan Linux Vakfı'nın bünyesinde yeni kurulan GraphQL Vakfı'na  devredilmiştir. GraphQL 2012 yılından beri yükseliştedir. Uygulamanın mucidi olan Lee Byron'ın amacı ise GraphQL'i her yerde mevcut ve kullanmılabilir hâle getirmekti. 

GraphQL, kullanıcılara web API'lerini geliştirmek için bir yaklaşım sunar ve bu özelliğinden dolayı da başta REST olmak üzere diğer web hizmeti mimarileri ile de karşılaştırılabilmektedir.

GraphQL istemcilerin talep ettikleri verilerin tanımlanmasına olanak sağlamakta ve bu veriler
tanımlanmış olan sunucudan döndürülmektedir. Bu da aşırı büyük miktarda verinin döndürülmesine engel olur ve sorgu sonuçlarının web'de önbelleğe alınmasını sekteye uğratır.
Sorgu dilinin esnekliği ve zenginliği, basit API'ler için efora değmeyecek kadar karmaşık olabilmekyedir. GraphQL ismine rağmen tam teşekküllü bir grafik veritabanında, hatta geçişli kapatmayı destekleyen SQL lehçelerinde bulunan veya bulunabilecek grafik işlemlerinin zenginliğini ne yazık ki bulundurmamaktadır. 

GraphQl şunlardan oluşmaktadır:
    Tip sistemi, sorgulama dili ve yürütme semantiği(anlambilişim), statik doğrulama ve tip iç gözleminden oluşmaktadır.

GraphQL okumayı, yazmayı ve verilerdeki değişiklere göre güncellemeler yapmayı desteklemektedir.
GraphQL sunucuları C#, C++, Java, JavaScript, Go, Scala, Rust, Elixir, Erlang, PHP, R, D Clojure ve Haskell dilleri dahil çok sayıda programlama dilinde mevcut ve kullanılabilirdir.
Tek bir sorgunun sonucu ise JSON(JavaScript Object Notation biçiminde döndürülmektedir.


Neden GraphQL?
1- İyileştirilmiş geliştirici deneyimi : Geliştiricilerin bir REST API'si tarafından döndürülen sabit bir veri kümesiyle beraber çalışması yerine tam olarak ihtiyaç duydukları verileri almasına GraphQL olanak tanır. Bu da geliştiricilerin API verilerine dayanan uygulamalar oluşturmasını ve bunları sürdürmesini kıolyalaştırır.

2-  Daha iyi API Tasarımı: GraphQL, istemcilerin belli veri verileri talep etmesini sağladığı için API'ler sabit bir veri kümesini döndürmek yerine daha ayrıntılı berileri sağlayacak biçimde tasarlanabilmektedir. Bu sürdürülebilir ve daha esnek API'lere yol açabilir.

3- Artırılmış Performans: Müşterilerin yalnızca ihtiyaç duydukları verileri talep etmesine olanak sağlayan GraphQL, ağ üzerinden aktarılan veri miktarını azaltmaya yardımcı olabilir. Bu yüzden de uygulamaların performansı artırılabilir.

4- Güçlü bir Ekosistem: Farklı dillerde GraphQL sunucuları ve istemciler oluşturma odaklı GraphQL API'lerini görselleştirme ve test etme amacı taşıyan araçlar dahil GraphQL ile çalışmak için birçok araç ve kitaplık bulunmaktadır.

5- Geliştirilmiş API Docs: GraphQL API'leri genellikle her tür ve alan için ayrıntılı belgeleri içermektedir ve bu, geliştiricilerin API'yi anlamasını kullanımın kolaylaşmasını sağlamaktadır.

GraphQL ile REST arasındaki benzerlikler neler olabilir ?

Hem REST hem de GraphQL, istemci-sunucu modelindeki farklı hizmetler ya da uygulamaların arasındaki veri değişimi sağlayan popüler API mimarisi stilleridir.

REST ve GraphQL, API aracılığıyla ayrı bir uygulama, modül ya da hizmet üzerinden veri oluşturmanıza, güncellemenize, silmenize ve değiştirmenize olanak sağlar.

Bazı Diğer Benzerlikler:

1-Mimari: Hem REST hem de GraphQL'in ortak olarak uyguladığı birkaç ortak API mimari prensibi bulunmaktadır. Örneğin;
-Her ikisi de durum bilgisizdir, bu yüzden sunucu istekler arasında cevap geçmişini kayıt altında tutmaz.
-Her ikisi de istemci-sunucu modelini kullanır. Bu yüzden tek bir istemciden gelen istekler yalnızca bir tek sunucudan gelen cevaplarla sonuçlanır.
-HTTP, altta yatan iletişim protokolü olduğu için her ikisi de HTTP tabanlıdır.

2-Kaynak Tabanlı Tasarım: GraphQL ve REST, veri değişimlerini kaynakların etrafında tasarlarlar. Kaynak istemcinin API vasıtasıyla erişebilip değiştirebileceği herhangi bir veri ya da nesneyi ifade etmektedir. Her kaynağın kendilerine özel tanımlayıcısı(URI) ve istemcinin üzerinde gerçekleştirebileceği bir dizi işlem yani HTTP yöntemi vardır.



Kodun çalışma mantığı:

Ayrı bir sınıfta HWButton adında bir buton sınıfı oluşturuldu ve bu sınıfın içindedki JFrame'in içinde JButton "buton" adında bir nesne dizi olarak tanımlandı. Butonun aktifliği ve pasifliği için "ButonDurum" adında bir diğer boolean türünde dizi oluşturuldu. Ve ödevde istenen aktif ve pasif durum için simgeler de ImageIcon yöntemi ile tanımlandı. Aktif ikon aktifSimge ismiyle, pasif ikon pasifSimge ismiyle tanımlandı. HWButton metodunun içinde buton=new Jbutton[16] ile 16 adet buton ve her butonun durumu için butonDurum=new boolean[16] şeklinde 16 ayrı durumun temeli de tanımlandı.
Sonrasında aktifSimgedeki ikon mutlu yüz(happy3.png), pasifSimgedeki ikon üzgün yüz(sad4.png) olarak tanımlandı.

Daha sonra 16 kere dönecek olan bir for döngüsü kullanılarak her bir buton eklendi. Ayrıca buy butonun boyutları, üzerinde yazacak olan yazı gibi özelliklerde burada tanımlandı. En başta pasif simge görünmesi gerektiğinden setIcon(pasifSimge) ve pasif arkaplan rengi olan gri renk te burada tanımlandı. Böylece döngü ile 16 buton oluşturuldu ve ayrıca false ayarı ile pasifSimge tamamlanmış oldu.

"butonpanel=new JPanel" kodu ile panel açma işlemleri yapıldı.(Grid ile 4x4 yapma,pencere kapatma tuşu,boyut ayarlama ve görünülebilirlik.)

actionPerformed metodu ile tıklanan butonun takip edilişi sağlanır. Tıklandığında ButonRenkAyari(aktif ve pasif arkaplan rengi ayarı) ve ButonDurumGuncelle(aktif ve pasif simge) çağırılarak buton durumu güncellenir, bunun sonucunda da simge renk ayarlanır.

ButonDurumGuncelle metodu ile duruma göre aktif ve pasif simge ayarlanır. Tıklandığında durumu tersine çevirir. Başlangıçta pasif simge olarak üzgün yüz, tıklandığında aktif simge olarak mutku yüz görünür.

ButonRenkAyari metodu ile 16 butonun arkplan rengi for döngüsüyle ayarlanır ve tıklandığında aktif arkaplan rengi beyaz, tekrar tıklandığında pasif arkaplan rengi gri görünür.
