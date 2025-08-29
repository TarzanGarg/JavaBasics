package practicequestions;
//Create an interface Playable with method play(). Implement it in classes Football and Guitar. Call play() on both.
interface Playable{
    void play();
}
class Football implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
public class Question5 {
    public static void main(String args[]){
        Playable p1 = new Football();
        Playable p2 = new Guitar();
        p1.play();
        p2.play();
    }
}