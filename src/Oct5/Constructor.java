package Oct5;

public class Constructor {
    String Title;
    String Author;
    int Year;
    int Price;
    int Genre;

    Constructor(){
        Genre =5;
        Price =650;
        Year = 2020;
        Author = "Aggarwal";
        Title = "This is the title";
        System.out.println("this is the default constructor");
    }
    public Constructor(int genre, int price, int year, String author, String title) {
        Genre =genre;
        Price = price;
        Year = year;
        Author = author;
        Title = title;
        System.out.println("This is the four parameter constructor");
        System.out.println("The price"+Price+"and year"+Year+"and Author"+Author+"Title"+Title);
    }
    Constructor(int genre,int price,int year){
        this.Genre=genre;
        this.Price=price;
        this.Year=year;
    }
}
