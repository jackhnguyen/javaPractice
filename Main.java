public class Main {
    public static void printSlogan(String newSlogan){
    System.out.println(newSlogan);
    }
    public static void main(String args[]){

        superHero superJack = new superHero (0,"Jackson", "super speed", "sleep");
        superJack.setAge(2);
        superJack.setName("bob");
        superJack.setSuperPower("super Strength");
        superJack.setWeakness("girls");
        printSlogan("hello");

        //Problem 7
        //Repository is the history of all of the commits with all the files
        //Git is useful because it allows us to share code and transfer to IDE.
        //Commit is like a save point where we save all of out code into git
        //Directory ??
        //Staging Area ??
        //Branches are when you go back into a commit and decide to make another version because you want to change some things. if the branch is good in you opinion you can add it back in.
        //Local in commiting on computer's files, remote is when you push the commit onto the main
    }
}
