# MOBILE TESTING WITH API 
(PART 1)
## Apa Itu Mobile testing
   Mobile testing adalah proses dimana aplikasi yang dikembangkan untuk perangkat mobile diuji untuk perangkat mobile diuji untuk kegunaan dan konsistensinya. Ada dua macam pengujian yang harus dilakukan untuk aplikasi pada perangkat mobile yaitu pengujian hardware dan software, dan berikut adalah pembahasanya.

## Testing Hardware 
   Hardware termasuk prosesor, memori internal, ukuran layar, resolusinya, besarnya RAM, kemampuan kamera, bluethooth, WIFI dan lain-lain akan menjadi komponen yang yang harus diuji dalam proses pengujian ini.

## Software Testing
   Dalam tahap ini kemudian aplikasi mobile yang telah dikembangkan akan diuji secara mendetail dan teliti. Fungsi dan konsistenti sebuah aplikasi mbile akan diuji. Seperti kita ketahui bahwa aplikasi mobile terbagi menjadi tiga macam yakni: aplikasi mobile native, aplikasi mobile hybrid dan aplikasi mobile web. Ketiga nya memiliki perbedaan dasar yang tentunya akan mempengaruhi proses pengujian.

   Pengujian aplikasi mobile jauh lebih kompleks dibanding pengujian aplikasi atau web untuk dekstop karena:
   - Perangkat mobile memiliki banyak macam ukuran layar konfigurasi hardware seperti keypad, virtual keypad (touch screen), trackball dan lain-lain.
   - Bermacam-macam sistem operasi yang di pakai, seperti android, windows, blackberry, dan iOS
   - Bermacam-macam versi dari sistem operasi 
   - Bermacam-macam jenis jaringan mobile, seperti CDMA atau GSM, berkemampuan EDGE, 3G, atau 4G.

   Untuk mengatasi semua masalah teknis di atas, ada beberapa macam testing yang selayaknya dilakukan pada aplikasi mobile.
   - Usability testing, untuk memastikan bahwa aplikasi mobile mudah digunakan dan memberikan user experience yang baik untuk penggunanya.
   - Compatibility testing, pengujian aplikasi dengan perangkat mobile yang berbeda, melalui browser, dengan ukuran layar yang berbeda serta versi OS sesuai dengan kebutuhan.
   - Interface testing, pengujian pilihan menu, tombol, bookmark, history, pengaturan, dan anvigasi dari aplikasi
   - Service testing, pengujian aplikasi dalam keadaan online maupun offline 
   - Low leve resource testing, pengujian memori, auto-delete file-file sementara, masalah pertumbuhan database.
   - Performance testing, pengujian kinerja aplikasi dengan mengubah koneksi dari 2G atau 3G ke wifi. Bagaimana kemampuan berbagi dokumennya dan bagaimana kapasitas baaterai yang dibutuhkan.
   - Operational testing, backup dan rencana recovery jika baterai melemah atau saat kehilangan data karena proses upgrade dari toko aplikasi. 
   - Installation testing, validasi aplikasi dengan menginstall atau menguninstall pada perangkat mobile
   - Securuty testing, pengujian aplikasi untuk memvalidasi apakah data terlindungi system informasi.
   
   Untuk memastikan bahwa semua standart kualitas dan kinerja terpenuhi maka adanya strategi untuk testing aplikasi mobile sangat dibutuhkan.
   - Pemilihan perangkat, menganalisis pasar dan memilih perangkat yang banyak digunakan. Keputusan ini sebagian besar bergantung pada pengguna, atau pada pengembang yang mempertimbangkan faktor popularitas sebuah perangkat tertentu.)
   - Emulator, penggunaan emolator sangat membantu dalam tahap pengembangan awal. Emulator memungkinkan untuk melalukukan pengecekan secara cepat dan efisien. Emulator sendiri merupakan sistem yang menjalankan software yang seolah-olah membawa kita pada sistem operasi lain.

# Mobile Automation Testing With Appium
  Appium adalah mobile web native dan hybrid software application test automation tools Open-source, software automation tool, Biasanya banyak digunakan untuk android dan IOS platform aplikasi. Yang paling penting adalah : Appium bisa “cross-platform” automation tool , Jadi kalian bisa membuat software automatios test script di IOS dan Android menggunakan API yang sama. “cross-platform” Mengizinkan kalian untuk menggunakan code yang bisa di gunakan di IOS dan Android test suites. Appium dapat di jalankan di Android devices simulator atau di real devices. Appium dibangung diatas beberapa filosopi penting :
  - Tidak perlu me-rekompile aplikasi kalian untuk menjalankan automasi.
  - Tidak terpaku pada spesifik bahasa pemrograman atau framework tertentu
  - Open source 

  Kenapa harus menggunakan Appium?
  Appium dapat membantu regression test aplikasi mobile anda menjadi lebih mudah. Khususnya untuk aplikasi mobile yang besar dimana Update-nya dilakukan secara berkelanjutan dengan fitur dan fungsi yang terus di perbaharui.
  Keuntungan lainnya dari menggunakan appium adalah : Appium mendukung Multiple Platforms dan Bahasa. Serta bisa menggunakan testing framework apapun.
  - Mendukung Multiple Platforms 
  - Appium mendukung platforms yang berbeda-beda
  - Android
  - IOS
  - FirefoxOS

  Appium Mendukung Multiple Languages 
  Appium mendukung beberapa bahasa pemrograman with theSelenium WebDriver API dan language-specific client libraries ;
  - Java
  - Objective-C
  - JavaScript with Node.js
  - PHP
  - Python
  - Ruby
  - C#
  - Clojure
  - Perl
  Appium juga memiliki keunggulan seperti tidak membutuhkan source code untuk testing aplikasi dimana anda bisa testing langsung, juga anda bisa membangun “built-in” aplikasi seperti kamera , kalendar , dsb di dalam test script.

  Keterbatasan Appium
  - Untuk versi Android, Tidak support untuk Android API level < 17.
  - Eksekusi Script sangat lambat di IOS platform.
  - Gestures support sangat terbatas
  - Tidak mendukung untuk pop-up atau toast messages.

