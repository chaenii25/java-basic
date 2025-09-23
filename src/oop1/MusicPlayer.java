package oop1;

public class MusicPlayer {

    int volume = 20;
    boolean playing = false;

    void on() {
        playing = true;
        System.out.println("playing on");
    }

    void off() {
        playing = false;
        System.out.println("playing off");
    }


    void volumeUp() {
        volume++;
        System.out.println("volume : " + volume );
    }

    void volumeDown() {
        volume--;
        System.out.println("volume : " + volume );
    }

    void isOn() {
        System.out.println("음악 플레이어 상태 확인");
        if (playing) {
            System.out.println("playing on, volume : " + volume);
        } else {
            System.out.println("playing off, volume : " + volume);
        }
    }

}
