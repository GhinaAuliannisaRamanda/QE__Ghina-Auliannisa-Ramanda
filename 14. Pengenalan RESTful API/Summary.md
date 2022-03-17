# PENGENALAN RESTFUL API / BASIC OF API TESTING
  Materi yang di bahas :
  1. API & REST API
  2. Testing API
  3. Advantages & Challange testing Api

## API & REST API
  API (Application Programming Interface) merupakan suatu penghubung antara server dengan aplikasi yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya dan dapat berbagi data.

  * Tujuan dari penggunaan API 
    Untuk mempercepat proses development dengan menyediakan function secara terpisah, sehingga developer tidak perlu membuat vitur yang serupa. API berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahu sistem apa yang harus dilakukan lalu memberikan respon yang sesuia untuk permintaan tsb.

  REST API (Representational State Transfer) merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data. REST juga merupakan salah satu implementasi dari web service sebagai tanda yang digunakan untuk pertukaran data antara aplikasi maupun sistem. 
  Rest API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan-tindakan tertentu pada sebuah database. Jika API adalah penghubung, maka REST yang membuat aturan sesuai keinginan programmer dalam merancang web service. simplenya, terdapat request dan response pada data yang dikirimkan ataupun yang diterima. Data yang digunakan dalam REST API umumnya berupa JSON. 
  
  HTTP (Hypertext Transfer Protocol) dirancang untuk memungkinkan komunikasi antar client dan server. HTTP berfungsi sebagai protokol respon dari permintaan client dan server. 
   * contoh : client mengirimkan permintaan http ke server, kemudian server mengembalikan respon ke client tanggapan berisi informasi status tentang permintaan dan mungkin juga berisi conten yang diminta.

   HTTP Method yang sering digunakan yaitu :
   1. Get 
      Digunakan untuk mengambil informasi tentang resource yang sudah ditentukan oleh url. Secara singkat get digunakan untuk membaca data. get merupakan method yang aman berarti bahwa request get tidak boleh menghasilkan perubahan apapun dalam status server. Seharusnya tidak menyebabkan pembuatan, pembaruan atau penghapusan data aplikasi apapun method ini harus dilakukan dalam tindakan read only.
   2. Put 
      Method ini digunakan untuk menciptakan resource baru
   3. Post
      Method ini digunakan untuk mengirimkan data baru ke server. simpelnya digunakan untuk memperbaharui resource yang ada atau membuat baru resource 
   4. Delete
      Method ini digunakan untuk menghapus resource

 ### REST API COMPONENT
     Terdiri dari 4 :
     1. Method 
      (Get, Put, Post, Delete)
     2. Url (base URL + Path)
      cara untuk mendapatkan request. URL terdiri dari kata kunci yang menunjukkan ke server apa yang coba kita lakukan. Contohnya : https://alta.id  
     3. Header
      merupakan kumpulan dari field dan value yang terkait dengan pemberian informasi tentang pesan ke penerima. juga berisi informasi autentikasi yang memberitahu pesan tsb sah
     4. Body
      Mendefinisikan parameter apa ynag dikirimkan ke server, ini menentukan apa informasi yang akan diupdate, dibuat maupun dihapus.

 ### APA ITU JSON ?
     JSON (Java Script Notation) merupakan sebuah format data yang digunakan untuk pertukaran dan penyimpanan data. JSON merupakan bagian (subset) dari Javascript. JSON bisa dibaca dengan berbagai macam bahasa pemrograman seperti C, C++, C#, Java, Javascript Perl, Python, dan banyak lagi. Hal ini membuat JSON menjadi bahasa yang ideal untuk perturakan data antar aplikasi.

     HTTP RESPONSE CODE, seperti :
     1. 200 OK : menandakan bahwa request yang dikirim succes 
     2. 201 created : menandakan bahwa request yang dikirim succes dan resourcenya berhasil dibuat (biasanya digunakan untuk method post dan put)
     3. 400 bad request : Terjadi ketika kita mengajukan request post / put dan datanya tidak sesuai atau ada kesalahan dalam formatnya
     4. 404 not found : terjadi ketika resource yang diperlukan tidak ditemukan
     5. 401 unouthorized : terjadi ketika tidak melakukan authentication terlebih dahulu sebelum melakukan request 
     6. 405 method : ketika request tidak support atau salah http methodnya misalnya, ketika ingin melakukan post tapi kita menggunakan method get 
     7. 500 internal : eror ini karna ada kesalahan di server 

## TESTING API  
   memastikan functional API diharapkan bisa ngasih gambaran gimana respon aplikasi web, tanpa ataupun GUI nya siap meluaskan cakupan testing, melakukan testing sedini mungking, dimana GUI belum sepenuhnya siap untuk disertakan dalam proses testing 
 
### Kind of API Testing 
    - functionality = untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum 
    - load test = menguji kekuatan suatu sistem, apakah bisa menjalankan beban yg diberikan 
    - security = menguji keamanan suatu sistem 
    tools yang digunakan : postman, frsby, jmeter, rest assured. 
  
### Tahapan melakukan API Testing 
    - spesification review = mereview dari speisifikasi API dan use case dokumen 
    - Specification dev 
    - framework dev = milih tools API testing 
    - test case dev = bikin test scenario dan test case 
    - execution & report 
 
## Advantages of testing Api 
   - efisiensi waktu 
   - bahasa yang independen 
   - mengurangi biaya testing 
   - mengurangi resiko 
 
## Challenges of Api testing 
   - kombinasi parameter, pemilihan parameter 
   - tidak ada GUI 
   - Kita harus mengetahui terlebih dahulu parameter 
   - perlu juga mengetest error handling dari setiap API

# TASK
  ![task](./Screenshoots/slide41.jpg)
  Link Spreedsheet : https://docs.google.com/spreadsheets/d/135ITDqDJNnyaFrkEMLK6GWEDFPazvmW77UleHXNZmJo/edit?usp=sharing