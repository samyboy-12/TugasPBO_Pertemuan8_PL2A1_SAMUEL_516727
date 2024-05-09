package Soal2;

enum ZombieType {
    MELEE,
    RANGED
}
class Zombie extends Entity {
    private ZombieType type;

    public Zombie(int level, int hp, ZombieType type) {
        super(hp, level);
        this.type = type;
    }

    public void attack(Player player) {
        if (hp <= 0) {
            System.out.println("# ZOMBIE SUDAH MATI");
            return;
        }
        int damage = (type == ZombieType.MELEE) ? 20 : 15;
        System.out.println("zombie: GRAAA!");
        player.hp -= damage;
        if (player.hp <= 0) {
            System.out.println("# YOU DIE, GAME OVER");
        }
    }
}
