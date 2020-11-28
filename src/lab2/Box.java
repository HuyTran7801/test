package lab2;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private int width;
    private int height;
    private List<Particle> particleList;
    private static Box instance;

    public static Box getInstance() {
        if(instance == null) {
            instance = new Box();
        }

        return instance;
    }

    private Box() {}

    public Box( int width, int height ){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int generateRandomNumber(int min, int max){
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }

    public void checkParticleCollide() {
        ArrayList<Particle> particleArrayList = new ArrayList<Particle>(); // dynamic size, size = 0

//        int maxX = this.width;
//        int min = 0;
//        int rangeX = maxX - min + 1;
//        int randomX = (int) (Math.random() * rangeX) + min;
//
//        int maxY = this.height;
//        int rangeY = maxY - min + 1;
//        int randomY = (int) (Math.random() * rangeY) + min;
//        Particle particle1 = new Particle(randomX, randomY);
//
//        randomX = (int) (Math.random() * rangeX) + min;
//        randomY = (int) (Math.random() * rangeY) + min;
//        Particle particle2  = new Particle(randomX, randomY);
//
//        randomX = (int) (Math.random() * rangeX) + min;
//        randomY = (int) (Math.random() * rangeY) + min;
//        Particle particle3  = new Particle(randomX, randomY);
//
//        randomX = (int) (Math.random() * rangeX) + min;
//        randomY = (int) (Math.random() * rangeY) + min;
//        Particle particle4  = new Particle(randomX, randomY);

        Particle particle1 = new Particle(generateRandomNumber(0, this.width),generateRandomNumber(0, this.height));
        Particle particle2 = new Particle(generateRandomNumber(0, this.width),generateRandomNumber(0, this.height));
        Particle particle3 = new Particle(generateRandomNumber(0, this.width),generateRandomNumber(0, this.height));
        Particle particle4 = new Particle(generateRandomNumber(0, this.width),generateRandomNumber(0, this.height));
        Particle particle5 = new Particle(generateRandomNumber(0, this.width),generateRandomNumber(0, this.height));


        particleArrayList.add(particle1);
        System.out.println( particleArrayList.size() ); // size = 1;
        particleArrayList.add(particle2);
        System.out.println( particleArrayList.size() ); // size = 2;


        for(var index = 0; index < particleArrayList.size(); index++) {
            Particle currentParticle = particleArrayList.get(index);
            System.out.println(currentParticle.getX());
            // particleArrayList.get(1) => particle2.getX() => 3
        }

    }
}
