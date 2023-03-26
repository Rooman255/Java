package seminar6;

// 3. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// информационной системой ветеринарной клиники

// Поля:
// Кличка
// Возраст
// Прививка

// Методы:
// Кот {} мяукнул {} раз
// Прививка:

public class cat {
    private String name;
    private Integer age;
    private boolean izbrisan;
    private boolean gender;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setIzbrisan(boolean izbrisan) {
        this.izbrisan = izbrisan;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public void catSaid(int n){
        System.out.printf("%s мяукнул %d раз \n", this.name, n);
    }
    public void catPupil(){
        if(!this.izbrisan){
            System.out.printf("Cat was`t inizbrisan \n");;
        }
        else{
            System.out.printf("Cat was inizbrisan \n");
        }
        this.izbrisan = true;
    }
}
   
