import java.util.Vector;
import java.awt.Desktop;
import java.net.URI;

public class Music {
    String name;
    Author author;
    Genre genre;
    Integer duration_sec;
    double price;
    Integer downloads;
    Integer views;
    Vector<Integer> rates;
    String url;
    public Music(String name, Author author, Genre genre, String url, Integer duration_sec, double price){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration_sec = duration_sec;
        this.url = url;
        this.price = price;
        this.downloads = 0;
        this.views = 0;
        this.rates = new Vector<Integer>();

        genre.quantity_music++;
        author.quantity_music++;
    }

    public void get_info(){
        System.out.println(this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " +this.price);
    }

    public String toString(){
        return this.name + " by " + this.author ;
    }

    public void getDownloads(){
        System.out.println(this.name + " was downloaded " + this.downloads + " times");
    }

    public void getViews(){
        System.out.println(this.name + " was listened " + this.views + " times");
    }

    public void getRate(){
        System.out.print(this.name + " got: ");
        for(int i=0; i < Math.round(this.getAverage()); i++){
            System.out.print("⭐");
        }
    }

    public double getAverage(){
        double result = 0;
        for(int i=0; i < this.rates.size(); i++){
            result += this.rates.get(i);
        }
        return result / this.rates.size();
    }

    public void openVideo(){
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(this.url));
            } else {
                System.out.println("Открытие браузера не поддерживается.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}