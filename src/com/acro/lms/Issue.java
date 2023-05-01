package com.acro.lms;


public class Issue {
    //IID, UID, BID, IssueDate,  ReturnDate, Fine
    int issueId;
    int userId;
    int bookId;
    String issueDate;
    String returnDate;
    public Issue(int issueId, int userId, int bookId, String issueDate, String returnDate) {
        this.issueId = issueId;
        this.userId = userId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
}
