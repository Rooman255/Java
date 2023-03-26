package seminar6;

public class main {
    public static void main(String[] args) {
        cat cat_1 = new cat();
        cat cat_2 = new cat();
        cat_1.setName("Murzic");
        cat_2.setName("Barsic");
        cat_1.setAge(2);
        cat_2.setAge(3);
        System.out.printf("Name of cat is: %s, age: %d \n", cat_2.getName(), cat_2.getAge());
        System.out.printf("Name of cat is: %s, age: %d \n", cat_1.getName(), cat_1.getAge());
        cat_1.catPupil();;
        cat_2.catSaid(3);
        cat_1.catPupil();;
    }
}
