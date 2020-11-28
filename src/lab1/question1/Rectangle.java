package lab1.question1;

public class Rectangle {
    private int width; // 1
    private int height;

//    public Rectangle (){
//        // Rectangle recA = new Rectangle();
//        // recA.setWidth(10);
//        // recA.setHeight(5);
//        // Sysout(recA);
//    }

    public int getWidth () // signature method
    {
        return width;
    }

    public int getHeight (){
        return height;
    }

    public Rectangle( int width, int height ){
        // tham số hình thức ( định nghĩa trước 1 cách trừu tượng chung chung)

        // tham số thực <=> đối số  // // Rectangle recA = new Rectangle(10, 5);
        if(width < 0 ){
            System.out.println("The width must be positive value.");
            width = 1;
        }

        if(height < 0){
            System.out.println("The height must be positive value.");
            height = 1;
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public void showInfo(){
        String a = "The width of rectangle: " + width + "\n" + "The height of rectangle: " + height ;
        System.out.println(a);
        System.out.println("");
    }


    public void ve2() {
        int x = this.width;  // 5
        int y = this.height; // 3

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (j == 0 || j == (x - 1)) {
                    System.out.print("*");
                } else {
                    if (i == 0 || i == (y - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");}
                }
            }
            System.out.println(" ");
        }
        }
    }
