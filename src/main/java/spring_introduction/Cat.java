package spring_introduction;

//@Component("catBean")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat created!");
    }
    @Override
    public void say(){
        System.out.println("Meow-Meow");
    }
}
