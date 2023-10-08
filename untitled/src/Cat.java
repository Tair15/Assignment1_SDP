public class Cat {
    private static Cat instance;
    private String name;
    private double age;

    private Cat(){}

    public static  Cat getInstance() {
        if(instance == null){
            instance = new Cat();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

}
