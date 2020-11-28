package lab2;

public class Particle {
    private int x;
    private int y;
    public Particle ( int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void move(String direction){

        switch (direction) {
            case "N": // if (direction == "N)
                this.y -= 1;
                System.out.println("N");
                break;
            case "NE": // elseif (direction == "N)
                this.y -= 1;
                this.x += 1;
                System.out.println("NE");
                break;
            case "E":
                this.x += 1;
                System.out.println("E");
                break;
            case "SE":
                this.y += 1;
                this.x += 1;
                System.out.println("SE");
                break;
            case "S":
                this.y += 1;
                System.out.println("S");
                break;
            case "SW":
                this.y += 1;
                this.x -= 1;
                System.out.println("SW");
                break;
            case "W":
                this.x -= 1;
                System.out.println("W");
                break;
            case "NW":
                this.y -= 1;
                this.x -= 1;
                System.out.println("NW");
                break;
            default:
                break;

        }
    }

}
