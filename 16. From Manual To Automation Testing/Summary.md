# FROM MANUAL TO AUTOMATION TESTING
  Materi yang akan di bahas :
  1. Apa itu manual testing ?
  2. Kelebihan dan kekurangan manual testing
  3. Apa itu Automation Testing?
  4. Kenapa harus menggunakan automation testing 

## Apa itu manual testing ?
   Manual testing atau pengujian manual merupakan langkah untuk mencari cacat atau bug pada program perangkat lunak, pada metode ini tester/penguji memiliki peran penting sebagai pengguna akhir untuk pengecekan semua fitur aplikasi bekerja dengan benar. Penguji melakukan pengecekan secara manual tanpa menggunakan bantuan dari tools atau scripts, tujuannya adalah untuk memastikan jika aplikasi yang di uji bebas cacat dan aplikasi perangkat lunak dapat bekerja sesuai apa yang diharapkan. Manual testing juga berperan penting saat pengujian visual dimana automation tools tidak dapat melakukan.
   
   Manual tester dapat mengetahui kontras antara button dan background yang lebih terang sehingga membuat user kesulitan mencari button dan memahami tindakan yang perlu diambil. User Interface (UI)feedback adalah hal yang tidak dapat ditemukan menggunakan automated testing.

## Kelebihan dan kekurangan manual testing
   a. Kelebihan
      1. Mendapatkan Visual Feedback 
         Tools dan Scripts tidak dapat membantu dalam memberikan opini maupun input mengenai tampilan UI.
      2. Less expensive in the short-term projects
         Jika hanya melakukan tes aplikasi sederhana yang tidak terlalu banyak updates maka manual testing tidak perlu menggunakan tools ataupun software yang mahal.
      3. The human element
         Bisa mendapatkan feedback dari orang secara langsung sehingga mengetahui apa yang user suka dan tidak suka (Dimana automated tools tidak dapat memberikan feedback).

   b. Kekurangan
      1. Kurang teliti daripada automantion testing
         Kadang adanya human error atau ketidaktelitian, sehingga jika menggunakan automation testing akan mengurangi bug yang akan terlewat.
      2. Not reusable
         Jika menemukan banyaknya perubahan maka harus melakukan pengecekan secara manual kembali dari awal agar memastikan perubahan baru tidak akan merusak aplikasi yang sudah jadi.
      3. Kelelahan terhadap tester
         ika QA tester sudah sangat familiar dengan aplikasi yang selalu dia tes secara terus menerus sehingga membuat QA tester sangat memahami alur dari aplikasi tersebut. Sehingga hal ini akan menyebabkan kelelahan dan kesalahan maka melewatkan beberapa hal dan membuat kesalahan.

## Apa itu Automation Testing?
   Merupakan testing yang membutuhkan automation tools untuk menjalankan Test case. QA perlu membuat script yang akan dijalankan dengan bantuan testing automation tools yang akan melakukan validasi otomatis pada software yang sedang di testing.

   Automation testing bergantung pada script test yang berjalan secara otomatis, fungsinya untuk membandingkan hasil yang diharapkan dengan hasil yang sebenarnya. Sehingga dapat mengetahui apakah aplikasi berjalan sesuai dengan apa yang diharapkan, menggunakan automated testing dapat dilakukan secara berulang. Sehingga jika hasilnya tidak sama dengan yang diharapkan maka akan mendapatkan bug.

## Kelebihan dan Kekurangan Automation Testing
   a. Kelebihan
      1. Dapat menemukan bug lebih banyak dari manual tester 
         Script dapat mencari lebih dalam, sehinga dapat menemukan bug yang tester tidak dapat temukan.
      2. Kecepatan dan efisiensi
         Script lebih cepat dari tester, sehingga dapat cepat selesai dalam menemukan bug.
      3. Tes yang dapat dilakukan berulang dengan coding yang dapat di update secara berkala
         Jika selalu mendapatkan update dan perubahan masing-masing unit/feature, maka tidak perlu menulis ulang scripsts setiap saat dan dapat digunakan kembali pada regression testing.

   b. Kekurangan
      1. Lebih Mahal
         Karena menggunakan tools maka pengerjaan menggunakan atuomation testing akan mahal, namun tetap menghemat waktu serta usabilitas.
      2. Kurangnya human element
         seperti pada info sebelumnya, manual testing memberikan human element untuk dapat melakukan interaksi user dengan aplikasi termasuk secara visual.
      3. Tidak adanya feedback mengenai UI
         Tanpa adanya human element, maka kita tidak bisa melakukan pengecekan terhadap UI seperti warna, kontras, pemilihan font, dan button sizes.

## Kenapa harus menggunakan automation testing 
   Karena Automation testing merupakan cara terbaik untuk meningkatkan efektiivitas cakupan pengujian dan kecepatan eksekusi dalam pengujian perangkat lunak. 
   Software atau machine testing penting karena beberapa alasan :
   1. manual testing yang di lakukan dari semua alur kerja dan semua skenario negative akan memakan waktu dan uang yang sangat banyak
   2. Sulit untuk menguji situs multibahasa secara manual 
   3. Automation test dalam software tidak perlu memerlukan campur tangan manusia
   4. Automation test dapat meningkatkan kecepatan eksekusi tes
   5. membantu meningkatkan scope dari sebuah test itu sendiri

## Test Case Yang Bisa Di Automate
   1. Test case executed repetedly
      Test case tersebut di executed berulang kali, jadi ketika kita melakukannya secara manual itu akan membuang waktu kita.
   2. Test case yang sulit dilakukan secra manual
   3. Test case yang membutuhkan waktu lama ketika dilakukan secara manual

## Test Case Yang Tidak Bisa Di Automate 
   1. Test case yang baru dirancang dan belum pernah di executed
   2. Test case yang memiliki requirements yang sering berubah

## Automate Testing Process
   1. Test tool selection
   2. Define scope of automation
   3. Planning, design and development
   4. Test Execution 
   5. Maintenance

## Best Practise
   1. Scope of Automation 
   2. memilih automation tools yang tepat
   3. scripting standart
   4. measure metrics

# TASK 
  Link Task : https://docs.google.com/document/d/197cmlIKHfMyhbC2p33ZccdDpIuwGwkHVwqWrYtKIXDQ/edit?usp=sharing