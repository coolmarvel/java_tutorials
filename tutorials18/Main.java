package tutorials18;

public class Main {
    public static void main(String[] args) {
        Hero[] heros = new Hero[3];

        heros[0] = new Warrior("전사");
        heros[1] = new Archer("궁사");
        heros[2] = new Wizard("마법사");

        for (int i = 0; i < heros.length; i++) {
            // 일반 히어로
            // heros[i].attack();

            if (heros[i] instanceof Warrior) {
                // 전사
                Warrior temp = (Warrior) heros[i];
                temp.groundCutting();
            } else if (heros[i] instanceof Archer) {
                // 궁사
                Archer temp = (Archer) heros[i];
                temp.fireArrow();
            } else if (heros[i] instanceof Wizard) {
                // 마법사
                Wizard temp = (Wizard) heros[i];
                temp.freezing();
            }
        }
    }
}
