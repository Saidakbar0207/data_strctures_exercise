package exercises.porgramming.exercises.ex10_2;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;
    public BMI(String name, int age, double weight, double height, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", feet=" + feet +
                ", inches=" + inches +
                '}';
    }
}
