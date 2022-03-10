# 8. AGILE TESTING
Materi yang akan dibahas :
1. Apa itu SDLC?
2. Phases of SDLC 
3. Model SDLC
4. Agile Testing Manifesto
5. 5 kunci dalam agile testing manifesto
6. Testing Pyramid

#  Apa itu SDLC (Software Development Life Cycle) ?
proses untuk merancang, mengembangkan, dan menguji software, untuk menyediakan alur terstruktur untuk menghasilkan software kualitas tinggi dengan biaya rendah dan memenuhi kebutuhan.

# Phases of SDLC (Software Development Life Cycle)
  - Requirements Gathering 
    tools apa yang akan digunakan, dan sistem akan dianalisis bagaimana nanti dijalankan, kelebihan kekurangan sistem, fungsi sistem , pembaharuan yang dapat diterapkan
  - Design 
    membuat model cara kerja aplikasi/software
  - Development (code) 
    buat test case yang nantinya akan di proyek kecil = dapat ditulis 1 dev aja, kalo besar bisa beberapa tim
  - Testing 
    sistem diuji sebelum di publish, apakah bisa bekerja optimal atau tidak.
  - Deployment  
    aplikasi sudah tersedia pada user untuk digunakan
  - Maintenance
    aplikasi sudah selesai dan bisa digunakan oleh pengguna.
    bisa jadi ada bug pada aplikasi

# Model SDLC (Software Development Life Cycle)
  1. Waterfall 
     setelah fase 1 selesai, fase berikutnya dimulai. jika ada satu detail kecil tertinggal maka akan mempengaruhi keseluruhan.
  2. Agile model  
     tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan. Dapat memicu proyek ke arah yg salah dan ga sesuai keinginan
  3. Iterative model  
     repetisi tinggi, dapat mengkonsumsi bahan baku jika ada 1 detail tertinggal
  4. V-shaped model
     lanjutan waterfall model. mencoba tiap fase dalam proses pengembangan suatu produk
  5. Bigbang model
     model yang beresiko tinggi saat dijalankan, karena semua bahan baku diinvestasikan dalam project tersebut. berhasil untuk proyek yang kecil dan berbahaya untuk proyek yang besar
  6. Sprial model
     paling fleksibel dan mirip iterative model. fokus pada repetisi dalam pengerjaannya.

# Agile Testing Manifesto
  hal-hal yang jauh dari agile testing manifesto : 
  - Testing is always behind
  - automation is even further behind that
  - testers can't work until development is done
  - there is pressure at the end of a sprint
  - there is blame around bugs (it's his fault etc.)

# 5 kunci dalam agile testing manifesto
  1. Testing is an activity not a phase 
     tester perlu beriringan dengan development. seperti membuat test case sebelum dev menulis code.

  2. prevent bugs rather than finding bugs 
     bug dapat muncul karena req yang kurang lengkap/detail. sehingga kita perlu menulis dulu req nya, dengan komunikasi sesama anggota tim.

  3. dont be a checker, be a tester 
     jangan hanya mengecek saja dan tidak paham kebutuhan user. maka kita perlu memberikan feedback terhadap apa yg dites

  4. dont try to break the system, instead help build the best possible system 
     qe akan mencari positif dan negatif. dan terkadang menemui bug. tapi kita perlu inget bahwa kita ingin membuat software yang berkualitas. sehingga kita perlu memposisikan diri sebagai user. 

  5. the whole team is responsible for quality, not just the tester 
     jangan hanya memberikan pekerjaan kepada QE yang tidak terlalu teliti dalam pengecekan bug, atau menyalahkan developer karena salah coding, tapi pada setiap bagian memiliki tanggung jawab.

# Testing Pyramid
  3 level
  - UI -> service -> unit test
  - Ui -> integration -> unit test
  - unit test = menguji tiap komponen perangkat lunak, pada saat di buat oleh developer, berupa modul, function, objek dll
  - integration = pengujian dr hasil gabungan unit2, dilakukan secara bertahap
  - UI = testing tingkat tinggi
    semakin tinggi level = semakin sedikit test yg kita lakukan karena semakin mahal, semakin rendah maka semakin cepat pelaksanaannya

# Task Hal 40
  1. Pada fase apa saja QE berperan pada proses SDLC? sebutkan dan jelaskan peran seperti apa yang QE dapat lakukan pada setiap fase tersebut!
  Jawab : 
  - QE Pada Fase Recruitments Gathring
    Qe membantu company/perusahaan untuk menghemat budget yang ada dengan ikut serta dalam memberikan ide mengenai fitur  yang akan digunakan dimasa depan. Selain itu QE juga bisa mencuri start untuk menjalankan test case, membuat test scenario yang nantinya akan dipakai.
  - QE Pada Fase Design 
    Sama seperti fase sebelumnya, pada fase design, QE dapat terlibat dalam membantu mengidentifikasi design yang nantinya akan menjadi blocker atau masalah pada software.
  - QE Pada Fase Development
    Pada fase ini QE juga ikut mempertimbangkan dampak dan pengalaman untuk pengguna dimasa depan, bisa jadi dengan memberikan saran mengenai animasi ataupun posisi tombol yang nantinya akan ada di dalam software
  - QE Pada Fase Testing 
    Pada fase ini merupakan fase terpenting untuk QE yang dimana QE akan membuat test case dan mengeksekusinya untuk menjaga kualitas yang akan dikembangkan. selain itu QE akan membuat bug report jika menemukan bug pada proses testing tersebut. ketika proses dijalankan QE juga mencari tahu system requirements terbaik yang akan digunakan oleh end-user nantinya.
  - QE Pada Fase deployment
    Pada fase ini, biasanya melakukan smoke testing untuk memastikan fungsi penting yang ada pada software agar dapat berjalan dengan baik tanpa ada masalah ataupun showstopper.
  - QE Pada Fase maintenance
    Pada fase ini, akan mengulangi apa yang dilakukan pada fase testing. ini juga berlaku pada tahap bug fixing, qe juga harus melakukan verify bugfix yang telah dilakukan tim programmer sebelumnya. pengujian testing lainnya juga akan dilakukan untuk memastikan fungsi yang ada dapat berjalan dengan baik. lalu pada fase ini QE bahkan memeriksa bug yang dilaporkan oleh pengguna software.

  2. Menurut teman teman, apa tantangan ketika menerapkan agile testing? berikan penjelasan pada masing - masing 5 poin agile testing manifesto!
  - testing is an activity not a phase
    tester harus melakukan testing secara berkala adapun tantangannya ialah ketika di akhir proses development qe harus testing software secara keseluruhan dan hal tersebut akan membutuhkan waktu yang cukup lama

  - prevent bugs rather than finding bugs
    biasanya dikarenakan requirements yang kurang lengkap ataupun detail. tantangan yang harus dilalui seorang qe yaitu membuat requirements yang detail dan mengidentifikasi darimana bug muncul . hal ini juga dapat dilakukan dengan berhipotesis dengan tim programmer sehingga komunikasi juga merupakan hal penting untuk dilakukan 

  - don't be a checker, be a tester
    sebagai qe pemula banyak yang masih takut untuk berkomunikasi memberikan feedback kepada tim programmer. tantangan tersebut dapat dilatih dengan menulis review singkat mengenai software yang diuji dan diberikan pada tim programmer sebagai saran untuk penyempurnaan fitur.

  - don't try to break the system, instead help build the best possible system. 
    jika tahap sebelumnya  memberikan review dengan kacamata tester, kali ini qe harus dapat memberikan masukan dengan kacamata user. hal tsb terkadang sulit dilakukan terutama untuk tester lama karena terkadang hasil masukan atau reveiw yang diberikan pada programmer dapat bersifat bias (tester perbaikan,user : untuk mempermudah pekerjaan)

  - the whole team is responsible for quality, not just the tester
    tantangan yang akan ditemui kadang berupa pressure yang didapatkan dari tim, biasanya ketika sehabis menyelesaikan build, yang menguji hanya tim qe, sehingga proses pengujian akan tidak efektif terutama untuk tim yang memiliki qe sedikit.