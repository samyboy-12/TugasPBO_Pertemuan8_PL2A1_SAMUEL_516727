package Soal2;

import java.util.ArrayList;

class Merchant extends Entity {
    ArrayList<String> listItem;

    public Merchant(int level, int hp, ArrayList<String> listItem) {
        super(hp, level);
        this.listItem = listItem;
    }

    public void attack(Player player) {
        if (hp <= 0) {
            System.out.println("# MERCHANT SUDAH MATI");
            return;
        }
        System.out.println("Merchant: hey heyy, ngapain nyerang");
        System.out.println("Merchant: Dah lah males jualan");
        System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
    }
}
