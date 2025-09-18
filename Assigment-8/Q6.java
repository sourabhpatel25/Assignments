/*
Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.
*/  
class Movie{
    private String name ;
    private String  genre;
    private double rating;
    public void setvalue(String name,String genre,double rating){
        this.name=name;
        this.genre=genre;
        this.rating=rating;
    

}
  public boolean isHit() {
        return rating >= 8.0;
    }
public String setname(){
    return name;
}
public String setgenre(){
    return genre;
}
public double setrating(){
    return rating;
}
public void displayMovieDetails(){
    System.out.println("Name : " +name);
     System.out.println("Genre     : " +genre);
    System.out.println("Rating     : " + rating);
    System.out.println("Hit Status : " + (isHit() ? "HIT" : "NOT A HIT"));



}
}

class TestMain{
    public static void main(String args[]){
     Movie obj =new Movie();
     obj.setvalue("InceptionGenre"," Science FictionRating" ,8.8);
     obj.displayMovieDetails();
        //getter method
        //System.out.println("\n");
        // System.out.println(obj.getname());
        //System.out.println(obj.getgenre());
        // System.out.println(obj.getrating());
    }
    
}
