package oop1;

public class MusicPlayer {

    int volume = 20;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("전원이 켜집니다...");
    }

    void off() {
        isOn = false;
        System.out.println("전원이 꺼집니다...");
    }

    void volumeUp() {
        volume++;
        System.out.println("소리: " + volume);
    }
    
    void volumeDown() {
        volume--;
        System.out.println("소리: " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("켜짐");
        } else {
            System.out.println("꺼짐");
        }
    }

}
