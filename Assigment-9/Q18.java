// Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
class Movie{
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;
    public Movie(String title, String director){
        this.title = title;
        this.director  = director;
        this.actors = new ArrayList<String>();
    }
    public void addReveiws(String review){
        this.reviews.add(review);
    }

    public void retrievReviews(){
        for(String r : review){
            System.out.println(r);
        }
    }

    public void addActor(String actor){
        this.actors.add(actor);
    }

    public void displayMovieDetails(){
        System.out.println("Movie Tittle = "+ this.title);
        System.out.println("Movie Director = "+ this.director);
        System.out.println("Movie actors = "+ this.actors);
        System.out.println("Movie reveiws = "+ this.reveiws);
    }
}

class Test{
    public static void main(String args[]){

}
}