package Soal2;

class Player extends Entity {
    private String name;

    public Player(int level, int hp, String name) {
        super(hp, level);
        this.name = name;
    }

    public void attack(Entity target) {
        if (hp <= 0) {
            System.out.println("# YOU DIE, GAME OVER");
            return;
        }
        System.out.println("player: UGHH");
        target.hp -= 10;
        if (target.hp <= 0) {
            System.out.println("# " + target.getClass().getSimpleName() + " SUDAH MATI");
        }
    }

    public void interact(Merchant merchant) {
        if (hp <= 0) {
            System.out.println("# YOU DIE, GAME OVER");
            return;
        }
        if (merchant.hp <= 0) {
            System.out.println("# MERCHANT SUDAH MATI");
            return;
        }
        System.out.println("Merchant: Barang yang tersedia hari ini");
        for (String item : merchant.listItem) {
            System.out.println("# " + item);
        }
    }
}
