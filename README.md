# Relasi Kelas Perpustakaan

This program is a simple implementation of a library using class relations in Java. It consists of four classes: `Main_21102094`, `Buku_21102094`, `Pengarang_21102094`, and `Perpustakaan_21102094`.

The `Main_21102094` class is the main class and serves as the entry point of the program. In this class, the user is prompted to enter the library name and the data of books and their authors through keyboard input. After that, the program displays the library information, including the list of books and authors, using the `tampilPerpus_21102094()` method from the `Perpustakaan_21102094` class.

The `Buku_21102094` class represents the book entity in the library. Each book has attributes such as `isbn_21102094` (International Standard Book Number) for unique identification and `judul_21102094` for storing the book title. This class also has a relation with the `Pengarang_21102094` class through the `pengarang_21102094` attribute, which is a list of authors associated with the book. The `tambahPengarang_21102094()` method is used to add an author to the book, and the `tampilBuku_21102094()` and `tampilPengarang_21102094()` methods are used to display the book and author information, respectively.

The `Pengarang_21102094` class represents the author entity. Each author has attributes such as `namaPengarang_21102094` for storing the author's name, and `email_21102094` and `telp_21102094` for storing the contact information. The `tampilPengarang_21102094()` method is used to display the author information.

The `Perpustakaan_21102094` class represents the library. Each library has attributes such as `namaPerpus_21102094` for storing the library name, and `buku_21102094` for maintaining the list of books in the library. The `tambahBuku_21102094()` method is used to add a book to the library, and the `tampilPerpus_21102094()` method is used to display the library information, including the list of books and authors.

Overall, this program allows users to enter book and author data into the library and then displays the library information along with the list of books and authors.
