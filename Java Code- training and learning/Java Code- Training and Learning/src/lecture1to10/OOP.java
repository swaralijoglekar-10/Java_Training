package lecture1to10;

class User{

    protected String name;
    protected  String email;

    public void login(){
        System.out.println("The user logged in "+name);
    }
}

class Librarian extends User{

    public void manageBooks(){

    }
}

class Member extends User{

    public void borrowBook(){
        System.out.println("Member "+name+ " borrowed a book");
    }
}

 interface Library{
    void addBook(); // abstract method in interface
}

class OnlineLibrary implements Library{
    int countOnlineBooks=0;
    @Override
    public void addBook(){
        countOnlineBooks++;
    }

}
