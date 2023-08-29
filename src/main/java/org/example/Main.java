package org.example;
/*
ÖDEV - HALİL İBRAHİM TAŞ

Bir not hesaplama uygulaması geliştirdiğimizi düşünelim.
Kullanıcıdan kaç adet sınav notu girmek istediği bilgisini alalım (araştırma konusu javada kullanıcı inputu alma)
Kullanıcının girdiği sayı kadar kullanıcıdan sınav notu alalım.
Ve bütün sınav notu toplamlarını sınav sayısına bölerek ortalamayı bulalım.
Ortalamayı kullanıcıya gösterelim ve eğer not 80'in üzerindeyse konsola "Yüksek Puan" yazdıralım.

*/

// Kullanıcıdan input almak için java.util package'den Scanner classını import edeceğiz
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Encaptulation
        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientName("Tomato");
        ingredient.setIngredientType("Vegetable");
        ingredient.setAmount(3);

        System.out.println("Ingredient Name:" + ingredient.getIngredientName());
        System.out.println("Ingredient Type:" + ingredient.getIngredientType());
        System.out.println("Amount:" + ingredient.getAmount());

        //Inheritance
        OliveOil oliveOil = new OliveOil();
        oliveOil.setAmount(3);
        oliveOil.cookMinutes();


        oliveOil.calorieCalculate(4);
        oliveOil.calorieCalculate(5, 120);

        //Kullanıcıdan alacağımız sınav not sayısını examCount değişkenine vereceğiz.
        int examCount = 0;

        //Kullanıcıdan aldığımız sınav notlarını exams ArrayList içerisine ekleyeceğiz
        ArrayList<Integer> exams = new ArrayList<Integer>();

        // not ortalaması ve toplamını vereceğimiz değişkenleri tanımlıyoruz
        double average = 0.0; // double 64 bit ve daha hassas hesaplama yapıyor, float kullanmak yerine, double tercih ettim
        double sum = 0;

        /*
        Burada kullanıcıdan alacağımız sınav sayısı için bir kod bloğu bulunmaktadır. Bu kod bloğu try-catch içerisinde
        bulunmaktadır. Kullanıcının girdiği değer bir sayı değilse geçersiz değer mesajı gösterip tekrar girmesini istiyoruz.
        */
        while (true){
            Scanner examCountInput = new Scanner(System.in);
            try {
                // Kaç adet not gireceğini alalım
                System.out.println("Lütfen girmek istediğiniz not adetini belirtin: ");
                examCount = examCountInput.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Geçersiz değer girdiniz");
                examCountInput.nextLine();
            }
        }

        /*
        Bu kod bloğunda kullanıcıdan, belirtmiş olduğu sınav sayısı kadar not girişi yapmasını sağlıyoruz.
        Girmiş olduğu notları yine try-catch içerisinde sayısal değer girmesi için kontrol altında tutuyoruz.
        Girmiş olduğu değerleri arrayListe ekliyoruz.
        */
        for (int i = 0; i < examCount; i++){
            int currentExam = i+1;
            while (true){
                Scanner examInput = new Scanner(System.in);
                try {
                    String message = String.format("Lütfen %d. notu giriniz: ",currentExam);
                    System.out.println(message);
                    exams.add(examInput.nextInt());
                    break;
                } catch (Exception e){
                    System.out.println("Geçersiz değer girdiniz");
                    examInput.nextLine();
                }
            }
        }

        /*
        Bu kod bloğunda sınav puanlarını for döngüsü içerisinde topluyoruz ve ortalama hesabı yapıyoruz.
        if şart bloğu ile puanı 80 üzeriyse "Tebrikler. Yüksek puan" yazdırıyoruz."
        */
        for(int exam: exams){
            sum += exam;
        }
        average = sum / exams.size();
        System.out.println(String.format("Öğrencinin not ortalaması: %,.2f", average));
        if(average > 80){
            System.out.println("Tebrikler. Yüksek Puan");
        } else {
            System.out.println("Maalesef. Geçerli not ortalamasına sahip değilsiniz.");
        }
    }
}