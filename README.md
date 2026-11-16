# APK Qo'riqchi (demo)

Bo'sh Android ilova: ikonka, nom va funksiyalar uchun bo'sh `container`.

## APK olish

**A) Android Studio:** papkani oching, `Build > Build APK(s)`.
APK: `app/build/outputs/apk/debug/app-debug.apk`

**B) Kompyutersiz (GitHub Actions):**
1. GitHub'da yangi repo yarating va shu papkani yuklang.
2. `Actions` bo'limida `Build APK` ishlab bo'lishini kuting (~3 daqiqa).
3. Natijadan `APK-Qoriqchi` artifaktini yuklab, ichidagi `app-debug.apk` ni telefonga o'rnating.

## Funksiya yozish

- Kod: `app/src/main/java/uz/firdavs/apkqoriqchi/MainActivity.kt`
- Ekran: `app/src/main/res/layout/activity_main.xml`
- Ikonka sifatini oshirish uchun: asl rasmni `res/drawable/logo.png` va `res/mipmap-*/ic_launcher.png` ga almashtiring.
