public class Book {
    String Author;
    String Name;
    int Year;
    int PageCount;

    public String toString() {
        return Author + " " + Name + " " + Year + " " + PageCount;
    }

    public Book(String Author, String Name, int Year, int PageCount) {
        this.Author = Author;
        this.Name = Name;
        this.Year = Year;
        this.PageCount = PageCount;
    }
}

public class Ball {
    double Radius;
    String Color;
    String Materials;

    public String toString() {
        return Radius + " " + Color + " " + Materials;
    }

    public Ball(double Radius, String Color, String Material) {
        this.Radius = Radius;
        this.Color = Color;
        this.Materials = Material;
    }
}

public class Main {
    public static void main(String[] arg) {
        Book CapitanskayaDochka = new Book("Fedor Dostoevskyi ", " Prestuplenie i nakazanie ", 1866, 608);
        System.out.println(CapitanskayaDochka);

        Ball ball = new Ball(3.5, "red", " rubber ");
        System.out.println(ball);
    }
}
