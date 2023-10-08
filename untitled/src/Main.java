public class Main {
    public static void main(String[] args) {
    Cat cat = Cat.getInstance();
    cat.setAge(4.5);
    cat.setName("simba");
        System.out.println(cat.getAge()+" "+cat.getName());
    }
}