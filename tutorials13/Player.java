package tutorials13;

abstract class Player {
    // abstract를 public 대신 정의하여 추상화
    abstract void play(String songName);

    abstract void pause();

    abstract void stop();
}
