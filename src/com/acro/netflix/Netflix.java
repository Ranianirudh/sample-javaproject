package com.acro.netflix;


public class Netflix {
    public User registerUser(String userName, String email, String password, int phoneNumber, long creditCardNumber){
        if(creditCardNumber>999999999999999L && creditCardNumber<9999999999999999L){
            BillingDetails billingDetails=new BillingDetails(creditCardNumber,"06-01-2023","Premium HD");
            if(email!=null &&email.length()>4 && password!=null &&password.length()>8) {
                User user1= new User(userName,email,password,phoneNumber,billingDetails);
                System.out.println("Registered your Netflix Account");
                return user1;
            }
        }
        return null;
    }
    public User login(User[] users, String email,String password) {
        for (int i = 0; i < users.length; i++) {

            if (email.equals(users[i].email)&&(password.equals(users[i].password))) {
                System.out.println("Login successful: "+ users[i]);
                return users[i];
            }
        }
        System.out.println("Login failed");
        return null;
    }
    public Movie searchByTitle(Movie[] movies,String titleOfTheMovie) {
        for (int i = 0; i < movies.length; i++) {
            if (titleOfTheMovie.equals(movies[i].titleOfTheMovie)) {
                System.out.println("Playing movie: "+ movies[i]);
                return movies[i];
            }
            
        }return null;
    }
    public TvShow searchByTitle(TvShow[] tvShows,String titleOfTheShow){
        for (int i = 0; i < tvShows.length; i++) {
            if (titleOfTheShow.equals(tvShows[i].titleOfTheShow)) {
                System.out.println("Playing TvShow:" + tvShows[i]);

                return tvShows[i];
            }
        }return null;

    }
    public void watchMovie(User[] users, Movie[] movies,String email,String password,String titleOfTheMovie){
        User byName=login(users,email,password);
        Movie byTitle = searchByTitle(movies,titleOfTheMovie);
    }
    public void watchTvShow(User[] users, TvShow[] tvShows,String email,String password,String titleOfTheShow){
        User byName=login(users,email,password);
        TvShow byTitle = searchByTitle(tvShows,titleOfTheShow);
    }
    public static void main(String[] args) {
        Netflix netflix=new Netflix();
       User user1=netflix.registerUser("Siri","sss@gmail.com","qwe345344",
                 23456678,6574389120976598L);
       User user2=netflix.registerUser("Rani","nnn@yahoo.com","tertew546",
                 123456678,9876543211234598L);
       User[] users={user1,user2};
       
        Movie m1=new Movie("The Elephant Whisperers",8,2022,Category.Documentaries,Language.Hindi);
        Movie m2=new Movie("RRR",8,2022,Category.Action,Language.Telugu);
        Movie m3=new Movie("Lakshya",8,2004,Category.Action,Language.Hindi);
        Movie m4=new Movie("Minions The Rise Of Gru",7,2017,Category.KidsAndFamily,Language.English);
        Movie m5=new Movie("Bahubali-2",8,2017,Category.Action,Language.Telugu);
        Movie m6=new Movie("Yes Man",7,2008,Category.Comedies,Language.English);
        Movie[] movies={m1,m2,m3,m4,m5,m6};

        TvShow tv1=new TvShow("Jurassic World Camp Cretaceous",Category.Action,35,Language.English);
        TvShow tv2=new TvShow("Chota Bheem",Category.KidsAndFamily,50,Language.Hindi);
        TvShow tv3=new TvShow("Quantico",Category.Action,15,Language.English);

        TvShow[] tvShows={tv1,tv2,tv3};

        netflix.watchMovie(users,movies,"nnn@yahoo.com","tertew546","Lakshya");
        netflix.watchTvShow(users,tvShows,"sss@gmail.com","qwe345344","Chota Bheem");


    }
    
    }
