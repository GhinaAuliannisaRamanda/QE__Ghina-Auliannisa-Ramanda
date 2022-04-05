# INTRODUCTION TO JMETER
  Apache JMeter merupakan perangkat lunak sumber terbuka. aplikasi dekstop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan megukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.

## Tools yang digunakan 
   1. JMeter
   2. Grafana K6
   3. Locust
   4. BlazeMeter
   5. LoadNinja

## Keuntungan menggunakan JMeter
   1. Open source
      User dapat melihat kode dari apk JMeter ini, jika ada masalah user dapat melihat sendiri dibagian mana yang bermasalah. 
   2. Easy to use with GUI/Non GUI
      Jmeter dibuat dengan user interface (dapat menjalankan aplikasi pada umumnya, terdapat tombol, terdapat font untuk iput) dan tanpa interface(dapat digunakan pada sistem berbasis CLI )

## Bagaimana Menginstall JMeter
   1. Menyiapkan / menginstall Apk java development kit https://www.oracle.com/java/technologies/downloads/
   2. Search Jmeter https://jmeter.apache.org/download_jmeter.cgi
   3. Download File (find the binary and download dile apache-jmeter.zip)
   4. Open File (extract file apache jmeter.zop by double click it)
   5. Open Terminal
   6. Navigate to the bin folder (klik cd lalu diikuti folder yang sudah di ekstrak tadi)
   7. Run Jmeter (.\jmeter.bat)
   lalu selanjutnya menginstall plug in

## komponen of JMeter script
   1. Test plan
      merupakan rencana besar tes yang akan dilakukan (parent)
   2. Thread Groups
      merupakan kumpulan thread yang menjalankan scenario yang sama
   3. Samplers
      merupakan sebutan untuk request yang dkirim ke server
   4. Config elements
      elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirimkan ke server
   5. Listeners
      Perekam data yang dihasilkan dari tes
   6. Timers
      Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan
   7. Assertions
   seperti assert pada API/WEB/Testing merupakan kriteria tambahan apakah pass/tidak
   8. Pre-Post processors
   Fitur yang memproses response data sebelum/sesudah tes