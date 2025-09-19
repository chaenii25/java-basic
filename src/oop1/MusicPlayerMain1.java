package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 20;
        boolean isOn = false;

        //전원 켜기
        isOn = true;
        System.out.println("음악 플레이어 실행..");

        //볼륨증가
        volume++;
        System.out.println("소리: " + volume);

        //볼륨감소
        volume--;
        System.out.println("소리: " + volume);

        //상태
        System.out.println("현재 전원?");
        if(isOn) System.out.println("켜짐");
        else System.out.println("꺼짐");
    }
}
