# CASE
* Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
### Sınıfın Nitelikleri
* name : Çalışanın adı ve soyadı
* salary : Çalışanın maaşı
* workHours : Haftalık çalışma saati
* hireYear : İşe başlangıç yılı
### Sınıfın Metotları
* Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.<br>
* tax() : Maaşa uygulanan vergiyi hesaplayacaktır.<br>
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır. <br>
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.<br>
* bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.<br>
* raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.<br>
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.<br>
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.<br>
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.<br>
* toString() : Çalışana ait bilgileri ekrana bastıracaktır.
#### Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.

## OUTPUT:


![1 - Kopya](https://user-images.githubusercontent.com/75911392/193429247-6084262a-c5a4-4032-838d-8463af12c6a8.png)
