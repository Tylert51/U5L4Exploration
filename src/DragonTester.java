public class DragonTester {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon);


        dragon.attackLine();

        dragon.takeDamage(20);

        dragon.powerUp(1);

        dragon.powerUp(2);

        dragon.powerUp(2);

        dragon.powerUp(2);


        dragon.attackLine();

        System.out.println(dragon);

        dragon.takeDamage(70);

        dragon.powerUp(2);


        dragon.attackLine();

        dragon.powerUp(2);

        System.out.println(dragon);


        dragon.attackLine();

        System.out.println(dragon);

        dragon.takeDamage(65);

        dragon.takeDamage(40);

        dragon.takeDamage(10);

        System.out.println(dragon);

        System.out.println(dragon.getStrength());
        System.out.println(dragon.getHealth());
        System.out.println(dragon.getLevel());
        System.out.println(dragon.isDead());

    }
}
