# Studi Kasus Bengkel Motor

## Deskripsi Proyek
Proyek ini merupakan implementasi dari berbagai design pattern dalam konteks operasional bengkel motor. Tujuan utama dari proyek ini adalah untuk menunjukkan bagaimana design pattern dapat membantu menyelesaikan masalah-masalah yang muncul dalam manajemen bengkel motor, meningkatkan fleksibilitas sistem, dan menyediakan panduan implementasi yang efektif bagi pengembang lain.

## Domain Kasus
Bengkel motor menghadapi berbagai tantangan dalam operasional sehari-hari, seperti manajemen pesanan, layanan pelanggan, dan pengelolaan sumber daya. Dengan menggunakan design pattern, kita dapat mengatasi tantangan tersebut dengan solusi yang lebih terstruktur dan mudah dipelihara.

## Design Patterns yang Digunakan
1. **Bridge Pattern**: Memisahkan abstraksi layanan dari implementasinya untuk fleksibilitas pengembangan.
2. **Builder Pattern**: Membantu dalam konstruksi objek yang kompleks dengan menggunakan pendekatan langkah demi langkah.
3. **Command Pattern**: Memisahkan permintaan suatu aksi ke dalam objek komando yang mandiri, memungkinkan parameterisasi klien dengan permintaan yang berbeda.
4. **Decorator Pattern**: Memungkinkan penambahan tanggung jawab atau fitur baru ke objek secara dinamis tanpa mengubah kode kelas yang sudah ada.
5. **Prototype Pattern**: Menggunakan prototipe instance untuk membuat objek baru dengan menyalin prototipe ini.
6. **Proxy Pattern**: Mengendalikan akses ke objek lain melalui proxy yang bertindak sebagai perantara.
7. **Singleton Pattern**: Memastikan suatu kelas hanya memiliki satu instance dan menyediakan titik akses global ke instance tersebut.
8. **State Pattern**: Memungkinkan objek untuk mengubah perilakunya ketika keadaan internalnya berubah.
9. **Strategy Pattern**: Mendefinisikan keluarga algoritma, mengenkapsulasi setiap algoritma, dan membuatnya dapat dipertukarkan.

## Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java
- **IDE**: Intellij IDEA

## Anggota Kelompok
- [Rahmat - 10120150]
- [Muhamad Dimas Azka Syarif Umair - 10120165]
- [Dhavin Ilham Zulfah - 10120075]

## Cara Menjalankan Proyek
1. Clone repository ini ke komputer Anda.
    ```bash
    git clone https://github.com/username/repository.git
    ```
2. Buka proyek ini di Intellij IDEA.
3. Pastikan Anda telah menginstal JDK yang diperlukan.
4. Jalankan proyek dengan memilih file `Main.java` dan klik `Run`.

## Struktur Proyek
- `src/BridgePattern/`: Implementasi Bridge Pattern
- `src/BuilderPattern/`: Implementasi Builder Pattern
- `src/CommandPattern/`: Implementasi Command Pattern
- `src/DecoratorPattern/`: Implementasi Decorator Pattern
- `src/PrototypePattern/`: Implementasi Prototype Pattern
- `src/ProxyPattern/`: Implementasi Proxy Pattern
- `src/SingletonPattern/`: Implementasi Singleton Pattern
- `src/StatePattern/`: Implementasi State Pattern
- `src/StrategyPattern/`: Implementasi Strategy Pattern
