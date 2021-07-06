package java_challenge.encapsulation;

public class Square extends Shape{
    Square(int width){
        super();
        this.width = width;

    }
    @Override
    void area() {
        System.out.println(width * width);

    }
}

