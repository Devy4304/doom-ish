package doom;

public class Vec2 {
    public int x;
    public int y;

    public Vec2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(Vec2 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public Vec2() {
        x = 0;
        y = 0;
    }

    public void add(Vec2 other) {
        this.x += other.x;
        this.y += other.y;
    }

    public void subtract(Vec2 other) {
        this.x -= other.x;
        this.y -= other.y;
    }

    public void multiply(Vec2 other) {
        this.x *= other.x;
        this.y *= other.y;
    }

    public void divide(Vec2 other) {
        this.x /= other.x;
        this.y /= other.y;
    }

    public double distance(Vec2 other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

    
}
