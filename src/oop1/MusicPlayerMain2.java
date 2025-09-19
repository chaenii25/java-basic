package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //전원 on
        data.isOn = true;
        System.out.println("음플 시작");

        //볼륨 증가
        data.volume++;
        System.out.println("소리: " + data.volume);

        //볼륨 증가
        data.volume++;
        System.out.println("소리: " + data.volume);

        //볼륨 감소
        data.volume--;
        System.out.println("소리: " + data.volume);

        //상태 확인
        System.out.println("전원?");
        if(data.isOn) System.out.println("켜짐");
        else System.out.println("꺼짐");
    }

}
