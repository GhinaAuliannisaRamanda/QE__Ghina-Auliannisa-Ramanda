# UNDERSTANDING JMETER RESULT
   Membuka aplikasi Jmeter terlebih dahulu, lalu membuka terminal, setelah terminal dibuka pindah ke folder Jmeter dan selanjutnya dapat dijalankan. 

## Create Your Test Plan
1. HTTP request defaults : https;//reqres.in/
2. Get list users : /api/users/3
3. Post User : /api/users
   body data :
   {
       "name":"$(nama)".
       "job": "Student ALTA"
   }
4. CSV name file 
5. Response Assertion :
   Sellect radio button response code fill pattern to test with 201
6. Before run your test, please save the test plan an save all listener with different name in /dekstop/this-is-your-report.jmx

## Overview of a performance test report
   1. Pembahasan data yang sudah dimiliki
      - summary tentang sistem
      - kondisi awal sistem
      - target yang ingin dicapai
   2. Data perfoemance test yang didapatkan 
      - Masukkan data dari metrics yang didapatkan
   3. Interpretasi data performance test
      - Interpretasi hasil dari metriksnya
   4. Saran
      - berikan saran agar sistem lebih baik lagi setelah dites

