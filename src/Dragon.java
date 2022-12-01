public class Dragon {
    private int strength;
    private int health;
    private int level;
    private int totalAttackDmg;
    private boolean isAlive;

    public Dragon() {
        strength = 1;
        health = 100;
        level = 1;
        isAlive = true;
        totalAttackDmg = 0;
    }

    public void takeDamage(int dmg) {

        if (isAlive) {

            health -= dmg;

            if (health <= 0) {
                isAlive = false;
                health = 0;
            }

            String output = "The dragon takes " + dmg + " damage and how has " + health + " health";;

            if (!isAlive) {
                output += "\nThe dragon has been slayed!";
            }

            System.out.println(output);

        } else {
            System.out.println("The dragon is already dead!");
        }
    }

    public int attack() {
        int attackDmg = strength * level;
        totalAttackDmg += attackDmg;
        return attackDmg;
    }

    public void attackLine() {
        System.out.println("The dragon attacks for " + attack() + " health points!");

        if (totalAttackDmg >= 50) {
            totalAttackDmg = 0;
            level++;

            System.out.println("The dragon has reached level " + level);
        }
    }

    public void powerUp(int num) {
        if (num == 1) {
            health *= 2;

            System.out.println("The dragon's health has increased to " + health + "!");
        } else {
            strength *= 2;
            System.out.println("The dragon's strength has increased to " + strength + "!");
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return !isAlive;
    }

    public String toString() {
        String output = "Dragon:" +
                "\nStrength = " + strength +
                "\nHealth = " + getHealth() +
                "\nLevel = " + getLevel() +
                "\nDead = " + isDead() +
                "\nAttack Damage = " + totalAttackDmg;

        return output;
    }
}
