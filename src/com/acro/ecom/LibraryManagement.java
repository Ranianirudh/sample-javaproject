package com.acro.ecom;

public class LibraryManagement {

    /*
     * admin
     * user
     * create/reset*/
    public User login(User[] users,String userName) {
        for (int i = 0; i < users.length; i++) {

            if (userName.equals(users[i].userName)) {
                System.out.println("Login successful: "+ users[i].userName);
                return users[i];

            }
        }
        System.out.println("Login failed");

        return null;
    }
    public Book searchByTitle(Book[] books, String title) {
        for(int i=0;i<books.length;i++){
            if(title.equals(books[i].title)){
                System.out.println("found the book");
                return books[i];
            }
        }
        return null;
    }
    public Issue checkOut(User user,Book book) {

        if (book != null && user != null) {
            String issueDate = "04282023"; // 20230428, 04282023
            String returnDate="05182023";
            Issue issue=new Issue(201,user.userId,book.bookId,issueDate,returnDate );
            System.out.println("Issued this "+book.title + " to "+user.firstName+ " "+user.lastName);
            return issue;
        }

        return null;
    }
    public void transaction(User[] users,Book[] books,String userName,String title){
        User byName=login(users,userName);
        Book byTitle = searchByTitle(books, title);
        checkOut(byName,byTitle);
    }

        public static void main(String[] args) {
            LibraryManagement library=new LibraryManagement();
            Book book = new Book(101, "HarryPotter","J.K.Rowlings","fiction",2);
            Book book2 = new Book(102, "Wings Of Fire","A.P.J.AbdulKalam","non-fiction",4);
            Book book3 = new Book(103, "Inspiring Thoughts","Swamy Vivekananda","non-fiction",3);
            Book[] books ={book,book2,book3};

            Address address1=new Address("suppleveda", 3333, 90034,
                    "Los Angeles","callifornia","UnitedStates");
            Address address2=new Address("sssss", 3334, 90035,
                    "Los Angeles","callifornia","UnitedStates");
            Address address3=new Address("dddd", 3335, 90036,
                    "Los Angeles","callifornia","UnitedStates");
            Address address4=new Address("ccccc", 3336, 90037,
                    "Los Angeles","callifornia","UnitedStates");
            Address address5=new Address("sdfs", 3337, 90038,
                    "Los Angeles","callifornia","UnitedStates");

            User user1=new User(301,"Rani","Nagarani", "Arvpalli", 123456789, address1);
            User user2=new User(302,"Divya","divya", "xxx", 234567891,address2);
            User user3=new User(303,"Madhu","madhu", "yyy", 345678912,address3);
            User user4=new User(304,"Swapna","swapna", "zzz", 456789123,address4);
            User user5=new User(305,"Teja","teja", "wwww", 567891234,address5);
            User[] users={user1,user2,user3,user4,user5};

            library.transaction(users,books,"Rani","Inspiring Thoughts");
            library.transaction(users,books,"Rani","HarryPotter");

        }

    }


