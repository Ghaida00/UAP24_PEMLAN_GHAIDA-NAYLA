import java.util.Scanner;
public class AksiAdmin extends Aksi {
    private Scanner scanner = new Scanner (System.in);
    @Override
    public void tampilanAksi() {
        System.out.println("Aksi Admin:");
        System.out.println("1. Tambah Film");
        System.out.println("2. Lihat List Film");
        System.out.println("3. Logout");
        System.out.println("4. Tutup Aplikasi");
    }

    @Override
    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    @Override
    public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup.");
        System.exit(0);
    }

  @Override
public void lihatListFilm() {
    // Implementasi melihat list film
    // method getFilm untuk melihat list film
    for (Film film : Film.getFilms().values()) {
        System.out.println(film.getName() + " - " + film.getDescription() + " - Harga: " + film.getPrice()
                + " - Stok: " + film.getStock()); // informasi dari list film
    }
}


    public void tambahFilm() {
        // Implementasi menambahkan film
        // meminta admin untuk memasukkan informasi list film
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Film: ");
        String name = scanner.nextLine();
        System.out.print("Deskripsi Film: ");
        String description = scanner.nextLine();
        System.out.print("Harga Tiket: ");
        double price = scanner.nextDouble();
        System.out.print("Stok Tiket: ");
        int stock = scanner.nextInt();

        Film.addFilm(name, description, price, stock); // untuk menambahkan informasi list film ke class film
    }
}
