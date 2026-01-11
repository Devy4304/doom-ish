package doom;

public class Player {
    enum Guns {
        PISTOL{
            final String name = "Pistol";
            final int damage = 2;
            final int ammoUsage = 1;
        },
        SHOTGUN {
            final String name = "Shotgun";
            final int damage = 6;
            final int ammoUsage = 3;
        },
        ROCKET {
            final String name = "Rocket Launcher";
            final int damage = 20;
            final int ammoUsage = 10;
        }
    }
    private int hp; // 0 - 100
    private int ammo;
    private Guns currentGun;

    public Player() {
        this.hp = 100;
        currentGun = Guns.PISTOL;
    }
}
