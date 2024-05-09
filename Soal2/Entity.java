package Soal2;

class Entity {
    protected int hp;
    protected int level;

    public Entity(int hp, int level) {
        this.hp = hp;
        this.level = level;
    }

    public void entityInfo() {
        System.out.println("# Entity dengan level: " + level + " dan HP: " + hp);
    }
}
