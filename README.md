# Kalkulator BMI (JavaFX & CLI)

Aplikasi untuk menghitung **Body Mass Index (BMI)** berdasarkan berat badan, tinggi badan, dan jenis kelamin (Pria & Perempuan). Proyek ini dibangun menggunakan **Java** dan **Maven** dengan menerapkan konsep **Object-Oriented Programming (OOP)** (*Inheritance* & *Polymorphism*) serta arsitektur **Model-View-Controller (MVC)**.

---

## Tampilan Aplikasi (Screenshots)

| Antarmuka Grafis (JavaFX / Scene Builder) | Antarmuka Teks (Terminal / CLI) |
| :---: | :---: |
| <img src="screenshots/UI-BMI.png" alt="Tampilan GUI Kalkulator BMI" width="320"/> | <img src="screenshots/BMI-Terminal.png" alt="Tampilan Terminal Kalkulator BMI" width="380"/> |

---

## Fitur Utama
- **Dual Interface**: Mendukung eksekusi melalui tampilan GUI (**JavaFX Scene Builder**) maupun interaktif via **Terminal (CLI)**.
- **Perhitungan Spesifik Gender**: Menerapkan *inheritance* dan *method overriding* pada class `BMI_Pria` dan `BMI_Perempuan` untuk menentukan kategori ideal sesuai standar masing-masing gender.
- **Validasi Input**: Dilengkapi penanganan *exception* untuk mencegah input kosong, angka negatif/nol, atau karakter non-numerik.

---

## Struktur Proyek
```text
Kalkulator_BMI/
├── screenshots/
│   ├── UI-BMI.png                # Screenshot tampilan GUI JavaFX
│   └── BMI-Terminal.png          # Screenshot tampilan CLI Terminal
├── src/main/
│   ├── java/
│   │   ├── controller/
│   │   │   └── BMI_Controller.java
│   │   ├── main/
│   │   │   ├── Main.java
│   │   │   └── demoTerminal.java
│   │   └── model/
│   │       ├── BMI.java
│   │       ├── BMI_Pria.java
│   │       └── BMI_Perempuan.java
│   └── resources/
│       └── BMI_View.fxml
└── pom.xml
```

---

## Contoh Skenario Pengujian
- **Jenis Kelamin**: Pria
- **Berat Badan**: 58 kg
- **Tinggi Badan**: 165 cm
- **Hasil Nilai BMI**: `21,30`
- **Kategori**: `Normal (Ideal)`

---

## Cara Menjalankan Proyek

### 1. Prasyarat (Prerequisites)
Pastikan perangkat Anda telah terinstal:
- **Java Development Kit (JDK)** (Disarankan JDK 21 atau versi terbaru)
- **Apache Maven** (Sudah termasuk secara bawaan jika menggunakan Apache NetBeans / IntelliJ IDEA)
- **Git** (Opsional, untuk melakukan *clone* repositori)

### 2. Clone Repositori
Buka terminal atau Git Bash, lalu jalankan perintah berikut untuk mengunduh proyek:
```bash
git clone [https://github.com/egiyudasebayang-collab/Kalkulator_BMI.git](https://github.com/egiyudasebayang-collab/Kalkulator_BMI.git)
cd Kalkulator_BMI
```

### 3. Menjalankan Aplikasi via IDE (NetBeans / VS Code / IntelliJ)
1. Buka proyek **`Kalkulator_BMI`** di IDE Anda sebagai proyek Maven.
2. Lakukan **Clean and Build** terlebih dahulu agar Maven mengunduh seluruh dependensi JavaFX secara otomatis.
3. Pilih mode tampilan yang ingin dijalankan:
   - **Mode GUI (JavaFX Scene Builder):** Klik kanan pada file `src/main/java/main/Main.java` -> pilih **Run File** (`Shift + F6`).
   - **Mode Terminal (CLI):** Klik kanan pada file `src/main/java/main/demoTerminal.java` -> pilih **Run File** (`Shift + F6`).

### 4. Menjalankan Aplikasi via Terminal (Command Line)
Jika ingin menjalankan proyek langsung dari terminal tanpa membuka IDE:

- **Menjalankan Versi GUI (JavaFX):**
  ```bash
  mvn clean javafx:run
  ```
- **Menjalankan Versi Terminal (CLI):**
  ```bash
  mvn compile exec:java -Dexec.mainClass="main.demoTerminal"
  ```

---

## Lisensi
Proyek ini dilisensikan di bawah **MIT License** — lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.
