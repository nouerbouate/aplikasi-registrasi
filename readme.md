# Aplikasi Registrasi #

Fitur Aplikasi:

* Pendaftaran Peserta Workshop
* Verifikasi email
* Generate tagihan
* Pembayaran

# Cara Membuat Database ##

1. Create user untuk connect ke database

    ```
     create role aplikasiregistrasi WITH PASSWORD 'aplikasiregistrasi';
    ```
2. Create database untuk user tersebut

    ```
    create database registrasidb owner aplikasiregistrasi;
   ```

3. Konfigurasi database

    ```
   spring.datasource.url=jdbc:postgresql://localhost/registrasidb
   spring.datasource.username=registrasiuser
   spring.datasource.password=registrasiuser123
   ```
