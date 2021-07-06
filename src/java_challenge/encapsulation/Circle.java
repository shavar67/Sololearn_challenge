package java_challenge.encapsulation;


   public  class Circle extends Shape{
        Circle(int width){
            super();
            this.width = width;
        }
        @Override
        void area() {
            System.out.println(Math.PI * width * width);

        }

}
