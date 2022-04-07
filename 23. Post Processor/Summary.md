# POST PROCESSOR
  Adalah bagian dari test plan yang merupakan sebuah aksi yang berjalan saat proses request ke alamat web, pada umumnya proses yang dijalankan yaitu untuk mengekstrak value yang didapatkan dari hasil mengakses sebuah alamat web, seperti data - data pada Json, session atau pada bagian response yang lainnya.

## JSON PATH 
   - Digunakan untuk ekstrak isi dari json response
   - beberapa ekspresi yang umum digunakan :
     - $ = root element
     - . = child operator (object)
     - [] = Child operator (array)
     - .. = rescursive descent (langsung ke objek)
     - * = wildcard (all things)
     - [start:end] = array slice operator borrowed
     