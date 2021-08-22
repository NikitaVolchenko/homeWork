package com.company;

class book {

    String name;
    int pageCount;
    int yearOfRelease;
    String author;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    int getPageCount() {
        return pageCount;
    }

    void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    int getYearOfRelease() {
        return yearOfRelease;
    }

    void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    String getAuthor(){
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}
