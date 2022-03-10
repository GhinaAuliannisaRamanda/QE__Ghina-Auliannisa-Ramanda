# Software Testing Fundamental
Ada beberapa materi yang dibahas :
1. Definition of software testing
2. Seberapa penting software testing 
3. Testing platform
4. Types of software testing
5. Level of Testing
==============================================================================================================
# Definition of software testing
Menurut standar ANSI / IEEE 1059 software testing adalah sebuah proses menganalisis item perangkat lunak untuk mendeteksi perubahan antara kondisi yang sekarang dengan kondisi yang diperlukan untuk mengevaluasi fitur item perangkat lunak.

# Seberapa penting software testing
Dengan adanya software testing dapat menghemat uang dan menjaga kualitas, keamanan, dan kepuasan pelanggan.
Software bugs bisa sangat berbahaya karena dengan adanya bug dapat menyebabkan krisis moneter maupun manusia.

# Testing platform
![ssanke3](./Screenshoots/ssan3.png)

 - API (Application Programming Interface) : Pengembangan aplikasi
 - WEB / Website : Sekumpulan halaman yang berisi informasi dan dapat diakses oleh banyk orang
 - Mobile : terdapat aplikasi yang sering digunakan, dalam software testing platform yang ada dibagi menjadi 2 yaitu android dan IOS.
 - Dekstop : aplikasi yang ada di dekstop seperti code editor, video player dsb.

# Types of software testing
 - Functional Testing (Manual, Automation, dsb)
 Jenis pengujian yang memverifikasi bahwa setiap fungsi aplikasi telah beroperasi sesuai dengan requirment spesification.  
 - Non - Functional Testing (Performance Testing, dsb)
 Pengujian dari aspek non fungsional suatu aplikasi seperti kinerja, keandalan, kegunaan, keamanan, dsb.
 - Maintenance (Regression, dsb)
 Dilakukan setelah sebuah aplikasi di realese kepada konsumen, maintenance testing diperlukan untuk mempertahankan karakteristik, kualitas non fungsional komponen atau sistem pada masa pakainya, terutama efisiensi kerja, kompetibilitas, keandalan, keamanan dan portabilitas

# Level of Testing
 - Unit Testing (Junit, Munit)
 Menguji setiap komponen yang ada di perangkat lunak dan memvalidasi kode dari setiap perangkat lunak
- Integration Testing
Penggabungan dari setiap unit dalam perangkat lunak.
- System Testing
- Acceptance Testing

# TASK
# 1. TASK hal 28
- Line coverage ( mengevaluasi pada jumlah baris kode yang sudah di testing )
pada baris pertama terdapat presentase 69% dari 6/9 test case. 
pada baris kedua 

- Mutation coverage ( memodifikasi satu bagian kecil dari sebuah fungsi/method kode program ) 
Mutation testing dilakukan untuk menentukan apakah test case sudah cukup atau belum. Untuk mendapatkan program yang baik harus memiliki mutasi scorenya 100%. Jika mutation scorenya sudah 100% test casenya sudah cukup, Jika mutation scorenya dibawah 100% butuh test case lagi
Pada baris pertama yang sudah berhasil termutasi 2 dari 3 bagian dengan presentase 67%.
Pada baris kedua yang sudah berhasil termutasi 3 dari 4 bagian dengan presentase 75%.

# 2. TASK Hal 29
Inisiasi Class CalculatorServiceImpl yang mempunyai beberapa fungsi untuk penjumlahan dan pengurangan. Dimana setiap fungsi memiliki 2 masukan nilai (a dan b) dan mengembalikan satu nilai (C).

 - add itu fungsi tambah 
 - subtract itu fungsi pengurangan (berwarna merah dikarenakan masih ada fungsi yang gagal karena tidak ada nilai yang ditentukan) 
 - kalau yg public class calcublabla itu class nya
 - kan int c = int a + int b, return c
 - itu fungsinya untuk mengetahui hasil dari c nya
 - return = mengembalikan
 - kalau return dalem function berarti ngembaliin nilai c