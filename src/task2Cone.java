public class Cone {
    private Double height;

    private Double radius;

    public Cone(double height, double radius){

        this.height = height;
        this.radius = radius;
    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Info about Cone\n" + "Height: " + height + "\nRadius: " + radius;
    }

    public double calculateArea(){
        final double pi = 3.14;
        double l = Math.sqrt(height*height + radius*radius);
        return pi * radius * l;
    }

    public double calculateVolumeCone(){
        final double pi = 3.14;
        double S = pi * radius * radius;
        return  (S * height)/3;
    }

}
