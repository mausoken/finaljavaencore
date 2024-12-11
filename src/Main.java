public class Main {
    public static void main(String[] args) {

        // Creating genres and authors
        Genre pop = new Genre("POP");
        Author cleanBandit = new Author("Clean", "Bandit");
        Author kavinsky = new Author("Kavinsky", "Kavinsky");
        Author mitski = new Author("Mitski", "Matsubara");

        // Creating music objects
        Music skyfall = new Music("Skyfall", cleanBandit, pop,
                "https://www.youtube.com/watch?v=sZrTJesvJeo", 246, 40);
        Music nightCall = new Music("Night Call", kavinsky, pop,
                "https://www.youtube.com/watch?v=MT3EzPOE00M", 256, 55);
        Music realHero = new Music("Real Hero", cleanBandit, pop,
                "https://www.youtube.com/watch?v=lBQUxEgPqUM", 267, 60);
        Music phonique = new Music("My Love Mine All Mine", mitski, pop,
                "https://www.youtube.com/watch?v=81c-alO8TVQ", 138, 50);
        Music neverGoneGiveYouAp = new Music("Never Gone Give You Ap", cleanBandit, pop,
                "https://www.youtube.com/watch?v=vnYm_kguurE", 212, 40);

        // Creating users
        User ryan = new User("Ryan Gosling", "POP", 500);
        User adis = new User("Adis Askarbekov", "Metal", 120);

        // Users buying music
        ryan.buyMusic(nightCall, 5);
        adis.buyMusic(skyfall, 3);

        // Display balance and playlist for Ryan
        System.out.println("Ryan's Balance: ");
        ryan.getBalance();
        System.out.println("Ryan's Playlist: ");
        ryan.getPlaylist();

        // Display balance and playlist for Adis
        System.out.println("Adis's Balance: ");
        adis.getBalance();
        System.out.println("Adis's Playlist: ");
        adis.getPlaylist();

        // Users listening to music
        ryan.listenMusic(realHero);
        ryan.listenMusic(nightCall);
        adis.listenMusic(phonique);

        // Display music stats for "My Love Mine All Mine"
        System.out.println("Music Stats for 'My Love Mine All Mine': ");
        phonique.getDownloads();
        phonique.getViews();
        phonique.getRate();

        // Open video for "Never Gone Give You Ap"
        skyfall.openVideo();
    }
}
