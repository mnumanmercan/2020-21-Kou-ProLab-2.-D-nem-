
int kasaBes = 20, kasaOn = 20, kasaYirmi = 10, kasaElli = 30, kasaYuz = 5;
int kalanHizmet1 = 30, kalanHizmet2 = 50, kalanHizmet3 = 100, kalanHizmet4 = 20;
int hizmet1Ucret = 15, hizmet2Ucret = 10, hizmet3Ucret = 5, hizmet4Ucret = 50;
long randomSayi;


void setup() {
  Serial.begin(9600);
  for (int i = 13; i >= 7; i--) {
    pinMode(i, INPUT);
  }
  pinMode(6, OUTPUT);
  pinMode(5, OUTPUT);
  Serial.println(F("                                       START"));
  Serial.println(F(" "));
  randomSeed(analogRead(A0));
}

void loop() {
  int bes = 0, on = 0, yirmi = 0, elli = 0, yuz = 0, total = 0;
  Serial.println(F("                           ------------------------------"));
  Serial.println(F("              ------------- MNM OTOYIKAMA'ya HOSGELDINIZ -------------"));
  Serial.println(F("                           ------------------------------"));
  Serial.println(F(" "));
  int kontrol = 0, kontrol1 = 0, secim1 = 0, secim2 = 0, secim3 = 0, secim4 = 0;
  int tempTotal = 0;
  int kasaTotal = (kasaBes * 5) + (kasaOn * 10) + (kasaYirmi * 20) + (kasaElli * 50) + (kasaYuz * 100);
  Serial.print(F("Kasa total : ")); Serial.print(kasaTotal);Serial.println(F(" TL"));
  Serial.print(kasaBes); Serial.print(F(",")); Serial.print(kasaOn); Serial.print(F(","));
  Serial.print(kasaYirmi); Serial.print(F(",")); Serial.print(kasaElli); Serial.print(F(","));
  Serial.println(kasaYuz);
  Serial.print(F("1,Kopukleme,")); Serial.print(kalanHizmet1); Serial.print(F(",")); Serial.print(hizmet1Ucret); Serial.println(F(" TL"));
  Serial.print(F("2,Yikama,")); Serial.print(kalanHizmet2); Serial.print(F(",")); Serial.print(hizmet2Ucret); Serial.println(F(" TL"));
  Serial.print(F("3,Kurulama,")); Serial.print(kalanHizmet3); Serial.print(F(",")); Serial.print(hizmet3Ucret); Serial.println(F(" TL"));
  Serial.print(F("4,Cilalama,")); Serial.print(kalanHizmet4); Serial.print(F(",")); Serial.print(hizmet4Ucret); Serial.println(F(" TL"));
  Serial.println(F("Lutfen yatiracaginiz para miktarini girin..."));
  delay(100);
  while (kontrol == 0) {
    delay(100);
    int bt1 = digitalRead(13);
    int bt2 = digitalRead(12);
    int bt3 = digitalRead(11);
    int bt4 = digitalRead(10);
    int bt5 = digitalRead(9);
    int bt6Bitis = digitalRead(8);
    int btReset = digitalRead(7);


    if (bt1 == HIGH) {
      delay(10);
      Serial.println("5 TL");
      bes = bes + 1;
      total = total + 5;
      Serial.print(F("Toplam yatirdiginiz para : "));  Serial.print(total); Serial.println(F(" TL"));
      //bt1 = LOW;
    } else if (bt2 == HIGH) {
      delay(10);
      Serial.println("10 TL");
      on = on + 1;
      total = total + 10;
      Serial.print(F("Toplam yatirdiginiz para : "));  Serial.print(total); Serial.println(F(" TL"));
      //bt2 = LOW;
    } else if (bt3 == HIGH) {
      delay(10);
      Serial.println("20 TL");
      yirmi = yirmi + 1;
      total = total + 20;
      Serial.print(F("Toplam yatirdiginiz para : "));  Serial.print(total); Serial.println(F(" TL"));
      // bt3 = LOW;
    } else if (bt4 == HIGH) {
      delay(10);
      Serial.println("50 TL");
      elli = elli + 1;
      total = total + 50;
      Serial.print(F("Toplam yatirdiginiz para : "));  Serial.print(total); Serial.println(F(" TL"));
      // bt4 = LOW;
    } else if (bt5 == HIGH) {
      delay(10);
      Serial.println("100 TL");
      yuz = yuz + 1;
      total = total + 100;
      Serial.print(F("Toplam yatirdiginiz para : "));  Serial.print(total); Serial.println(F(" TL"));
      // bt5 = LOW;
    } else if (bt6Bitis == HIGH) {
      delay(10);
      if (total == 0) {
        Serial.println(F("Henuz secim yapmadiniz lutfen secim yapin ya da bitise tiklayin"));
      } else {
        Serial.println(F("Secimleriniz tamamlandi"));
        Serial.print(F("5 TL adedi : ")); Serial.print(bes); Serial.println(F(" Adet"));
        Serial.print(F("10 TL adedi : ")); Serial.print(on); Serial.println(F(" Adet"));
        Serial.print(F("20 TL adedi : ")); Serial.print(yirmi); Serial.println(F(" Adet"));
        Serial.print(F("50 TL adedi : ")); Serial.print(elli); Serial.println(F(" Adet"));
        Serial.print(F("100 TL adedi : ")); Serial.print(yuz); Serial.println(F(" Adet"));
        Serial.println(F("                 ------------------------"));
        Serial.print(F("Toplam yatirdiginiz para : ")); Serial.print(total); Serial.println(F(" TL"));
        Serial.println(F("                 ------------------------"));
        kontrol = 1;
      }
      // bt6bitis = LOW;
    } else if (btReset == HIGH) {
      delay(10);
      bes = 0;
      on = 0;
      yirmi = 0;
      elli = 0;
      yuz = 0;
      total = 0;
      Serial.print(F("Secimleriniz resetlendi. Toplam yatirdiginiz para : "));Serial.print(total);Serial.println(F(" TL"));
      //btReset = LOW;
    }
    delay(100);
  }
  kasaBes = kasaBes + bes; kasaOn = kasaOn + on; kasaYirmi = kasaYirmi + yirmi; kasaElli = kasaElli + elli; kasaYuz = kasaYuz + yuz;
  tempTotal = total;
  delay(400);
  Serial.println(F("Hizmet secimi yapiniz : "));
  while (kontrol1 == 0) {
    delay(100);
    int bt1 = digitalRead(13);
    int bt2 = digitalRead(12);
    int bt3 = digitalRead(11);
    int bt4 = digitalRead(10);
    int bt6Bitis = digitalRead(8);
    int btReset = digitalRead(7);
    if (bt1 == HIGH) {
      if (kalanHizmet1 != 0) {
        if (total >= 15) {
          kalanHizmet1 = kalanHizmet1 - 1;
          secim1 = secim1 + 1;
          total = total - 15;
          Serial.println(F("Kopukleme hizmeti sectiniz -")); Serial.print(hizmet1Ucret); Serial.println(F(" TL"));
          Serial.print(F("Kalan kopukleme hizmeti : ")); Serial.println(kalanHizmet1);
        } else {
          Serial.print(F("Yeterli paraniz yoktur. Bakiyeniz : ")); Serial.print(total); Serial.println(F(" TL"));
          Serial.print(F("Kopukleme fiyati : "));Serial.print(hizmet1Ucret); Serial.println(F(" TL"));
        }
      } else {
        Serial.println(F("Kopukleme hizmetimiz kalmamistir,uzgunuz."));
      }
      delay(40);
    } else if (bt2 == HIGH) {

      if (kalanHizmet2 != 0) {
        if (total >= 10) {
          kalanHizmet2 = kalanHizmet2 - 1;
          secim2 = secim2 + 1;
          total = total - 10;
          Serial.println(F("Yikama hizmeti sectiniz -")); Serial.print(hizmet2Ucret); Serial.println(F(" TL"));
          Serial.print(F("Kalan Yikama hizmeti : ")); Serial.println(kalanHizmet2);
        } else {
          Serial.print(F("Yeterli paraniz yoktur. Bakiyeniz : ")); Serial.print(total); Serial.println(F(" TL"));
          Serial.print(F("Yikama fiyati : "));Serial.print(hizmet2Ucret); Serial.println(F(" TL"));
        }
      } else {
        Serial.println(F("Yikama hizmetimiz kalmamistir,uzgunuz."));
      }
      delay(40);
    } else if (bt3 == HIGH) {

      if (kalanHizmet3 != 0) {
        if (total >= 5) {
          kalanHizmet3 = kalanHizmet3 - 1;
          secim3 = secim3 + 1;
          total = total - 5;
          Serial.println(F("Kurulama hizmeti sectiniz -")); Serial.print(hizmet3Ucret); Serial.println(F(" TL"));
          Serial.print(F("Kalan kurutma hizmeti : ")); Serial.println(kalanHizmet3);
        } else {
          Serial.print(F("Yeterli paraniz yoktur. Bakiyeniz : ")); Serial.print(total); Serial.println(F(" TL"));
          Serial.print(F("Kurulama fiyati : "));Serial.print(hizmet3Ucret); Serial.println(F(" TL"));
        }
      } else {
        Serial.println(F("Kurutma hizmetimiz kalmamistir,uzgunuz."));
      }
      delay(40);
    } else if (bt4 == HIGH) {

      if (kalanHizmet4 != 0) {
        if (total >= 50) {
          kalanHizmet4 = kalanHizmet4 - 1;
          secim4 = secim4 + 1;
          total = total - 50;
          Serial.print(F("Cilalama hizmeti sectiniz. -")); Serial.print(hizmet4Ucret); Serial.println(F(" TL"));
          Serial.print(F("Kalan cilalama hizmeti : ")); Serial.println(kalanHizmet4);
        } else {
          Serial.print(F("Yeterli paraniz yoktur. Bakiyeniz : ")); Serial.print(total); Serial.println(F(" TL"));
          Serial.print(F("Cilalama fiyati : "));Serial.print(hizmet4Ucret); Serial.println(F(" TL"));
        }
      } else {
        Serial.println(F("Cilalama hizmetimiz kalmamistir,uzgunuz."));
      }
      delay(40);
    } else if (bt6Bitis == HIGH) {
      int totalHizmet = tempTotal - total;
      Serial.println(F("Seciminiz tamamlanmistir"));
      Serial.println(F("     ------------"));
      Serial.print(F("Kopukleme hizmeti : ")); Serial.print(secim1); Serial.println(F(" adet"));
      Serial.print(F("Yikama hizmeti : ")); Serial.print(secim2); Serial.println(F(" adet"));
      Serial.print(F("Kurutma hizmeti : ")); Serial.print(secim3); Serial.println(F(" adet"));
      Serial.print(F("Cilalama hizmeti : ")); Serial.print(secim4); Serial.println(F(" adet"));
      Serial.print(F("Toplam hizmet bedeli : ")); Serial.print(totalHizmet); Serial.println(F(" TL"));
      Serial.print(F("Iade edilecek para ustu : ")); Serial.print(total); Serial.println(F(" TL"));
      kontrol1 = 1;
      delay(40);
    } else if (btReset == HIGH) {

      kalanHizmet1 = kalanHizmet1 + secim1;
      kalanHizmet2 = kalanHizmet2 + secim2;
      kalanHizmet3 = kalanHizmet3 + secim3;
      kalanHizmet4 = kalanHizmet4 + secim4;
      secim1 = 0; secim2 = 0; secim3 = 0; secim4 = 0;
      total = tempTotal;
      Serial.println(F("Sectiginiz hizmetler resetlenmistir.Tekrar secim yapabilirsiniz."));
      delay(40);
    }
    delay(100);
  }
  delay(400);
  randomSayi = millis() % 4 + 1;
  if (randomSayi == 2) {
    digitalWrite(6, HIGH);
    Serial.println(F("------------------------------------------------------------------------------------"));
    Serial.print(F("Random Kod : "));Serial.print(randomSayi);Serial.println(F("          ---!!! HATA KODU !!!---")); Serial.println(F("Uzgunuz,bir ariza olusmustur.Paraniz iade ediliyor..."));
    Serial.println(F("------------------------------------------------------------------------------------"));
    
    kalanHizmet1 = kalanHizmet1 + secim1;
    kalanHizmet2 = kalanHizmet2 + secim2;
    kalanHizmet3 = kalanHizmet3 + secim3;
    kalanHizmet4 = kalanHizmet4 + secim4;
    kasaBes = kasaBes - bes; kasaOn = kasaOn - on; kasaYirmi = kasaYirmi - yirmi; kasaElli = kasaElli - elli; kasaYuz = kasaYuz - yuz;
    secim1 = 0; secim2 = 0; secim3 = 0; secim4 = 0;

    Serial.print(tempTotal); Serial.println(F(" TL paraniz iade edilmistir.Iyi gunler"));
  } else {
    int beslik = 0, onluk = 0, yirmilik = 0, ellilik = 0, yuzluk = 0;
    int kalan = 0, ilkTotal = total;
    Serial.println(F("-------"));
    Serial.print(F("Random Kod : "));Serial.println(randomSayi);
    Serial.println(F("-------"));
    digitalWrite(5, HIGH);
    Serial.println(F("PARA USTUNUZ : "));

    if (kasaYuz >= 1) {
      yuzluk = total / 100;
      kasaYuz = kasaYuz - yuzluk;
      total = total % 100;
    }
    if (kasaElli >= 1) {
      ellilik = total / 50;
      kasaElli = kasaElli - ellilik;
      total = total % 50;
    }
    if (kasaYirmi >= 1) {
      yirmilik = total / 20;
      kasaYirmi = kasaYirmi - yirmilik;
      total = total % 20;
    }
    if (kasaOn >= 1) {
      onluk = total / 10;
      kasaOn = kasaOn - onluk;
      total = total % 10;
    }
    if (kasaBes >= 1) {
      beslik = total / 5;
      kasaBes = kasaBes - beslik;
    }
    if (kasaTotal >= ilkTotal) {
      if (yuzluk != 0) {
        Serial.print(F("100 TL : "));
        Serial.print(yuzluk);
        Serial.println(F(" adet"));
      }
      if (ellilik != 0) {
        Serial.print(F("50 TL : "));
        Serial.print(ellilik);
        Serial.println(F(" adet"));
      }
      if (yirmilik != 0) {
        Serial.print(F("20 TL : "));
        Serial.print(yirmilik);
        Serial.println(F(" adet"));
      }
      if (onluk != 0) {
        Serial.print(F("10 TL : "));
        Serial.print(onluk);
        Serial.println(F(" adet"));
      }
      if (beslik != 0) {
        Serial.print(F("5 TL : "));
        Serial.print(beslik);
        Serial.println(F(" adet"));
      }

    } else {
      Serial.println(F("KASADA YETERLI PARA YOKTUR"));
    }

    Serial.println(F("HIZMETIMIZ TAMAMLANMISTIR.TEKRAR BEKLERIZ")); Serial.println(F("IYI GUNLER DILERIZ :)"));
  }

  delay(2000);
  digitalWrite(5, LOW);
  digitalWrite(6, LOW);
  Serial.println(" ");
}
