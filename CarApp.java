class CarApp{
    public static void main(String[] args){
        Car c = new Car();
        c.brand="maruthi";
        c.color="red";
        c.price=120000;
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.price);
        c.accelerate();
    }
     public static class Car{
        String brand;
        String color;
        int price;
        void accelerate(){
            System.out.println("A car accelerates");
        }
        
    }
}