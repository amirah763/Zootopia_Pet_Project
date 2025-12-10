public class Judy {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Setter methods to modify attributes
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    public void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }

    // Getter methods to retrieve attributes
    public int getHealth() {
        return this.health;
    }  

    public int getEnergy() {
        return this.energy;
    }

    public int getHappiness() {
        return this.happiness;
    }

    // Method to solve a case
    public void solveCase(int num) {
        System.out.println("Solving case #" + num);
        this.health -= 5;
        this.energy -= 15;
        this.happiness += 5;
    }

    // Method to sleep
    public void sleep() {
        System.out.println("Judy is sleeping...");
        this.energy += 30;
        this.health += 10;
    }

    // Method to eat
    public void eat() {
        System.out.println("Judy is eating...");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
    }

    // Method to do nothing
    public void doNothing() {
        System.out.println("Judy is doing nothing...");
        this.energy -= 2;
        this.health -= 1;
        this.happiness -= 2;
    }

    // Method to check stats
    public void checkStats() {
        System.out.println("=== Judy's Current Status ===");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }
}   