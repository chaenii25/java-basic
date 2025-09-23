package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        //전원 켜기
        musicPlayer.on();

        //volumeup
        musicPlayer.volumeUp();

        //volume down
        musicPlayer.volumeDown();

        //volume up
        musicPlayer.volumeUp();

        //상태 확인
        musicPlayer.isOn();

        //전원 끄기
        musicPlayer.off();
    }
}
