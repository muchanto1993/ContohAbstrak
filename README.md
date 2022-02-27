# Apa itu Class Abstrak?
Class abstrak adalah class yang masih dalam bentuk abstrak. Karena bentuknya masih abstrak, dia tidak bisa dibuat langsung menjadi objek.

Sebuah class agar dapat disebut class abstrak setidaknya memiliki satu atau lebih method abstrak.

Method abstrak adalah method yang tidak memiliki implementasi atau tidak ada bentuk konkritnya.

# Mengapa Harus Pakai Class Abstrak?
Kita tahu, class abstrak memang belum bisa digunakan secara langsung.

Karena itu, agar class abstrak dapat digunakan, maka ia harus dibuat bentuk konkritnya.

Cara membuat class abstrak menjadi konkrit adalah dengan membuat implementasi dari method-method yang masih abstrak.

Ini bisa kita lakukan dengan pewarisan (inheritance).

Class abstrak biasanya digunakan sebagai class induk dari class-class yang lain. Class anak akan membuat versi konkrit dari class abstrak.

# Cara Membuat Abstrak Class di Java
Cara membuat class abstrak adalah dengan memberikan kata kunci abstract kepada class dan method yang ingin dijadikan abstrak.

![Contoh Penggunaan Class Abstrak](https://github.com/muchanto1993/Database-Indonesia/blob/main/img/List%20Provinsi.png)

# Apa Bedanya Class Abstrak dengan Interface?
Class abstrak dan interface sama-sama digunakan untuk membuat abstraksi.

Keduanya hampir memiliki sifat yang sama. Tapi ada bedanya.

Apa itu?
1. di class abstrak kita bisa buat properti atau variabel sedangkan di interface kita cuma bisa buat konstanta saja
2. di class abstrak kita bisa implementasikan kode method seperti class biasa, sedangkan di interface harus menggunakan default
3. di class abstrak dapat memiliki member private dan protected sedangkan interface harus publik semua
4. Class abstrak diimpelentasikan dengan pewarisan (extends) sedangkan interaface menggunakan implements

# Apa Selanjutnya?
Intinya, class abstrak adalah class yang bentuknya masih abstrak dan kita harus membuat bentuk konkritnya agar bisa digunakan.