public class Gary {
    private int health;
    private int energy;
    private int happiness;
    private int temperature;

    public Gary() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.temperature = 70; // Normal body temperature in Fahrenheit
    }

    // Parameterized constructor
    public Gary(int health, int energy, int happiness, int temperature) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
        this.temperature = temperature;
    }
     // Getter and Setter for health
     public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter and Setter for happiness
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Getter and Setter for temperature
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    public void doNothing() {
        System.out.println("You chose to do nothing. Gary is feeling neglected...");
        
        // Decrease attributes
        health -= 5;
        energy -= 5;
        happiness -= 10;
        temperature -= 2;
    
        // Ensure attributes don't go below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness < 0) happiness = 0;
        if (temperature < 0) temperature = 0;
    }

    public void checkStats() {
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Temperature: " + temperature + "°F");
    }

}
