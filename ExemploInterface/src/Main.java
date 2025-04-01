//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando musica");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };

        musicPlayer.playMusic();
    }
}