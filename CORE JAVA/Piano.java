public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
    
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();
    }
}