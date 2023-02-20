package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary unitLibrary = context.getBean("uniLibrary", UniLibrary.class);
        unitLibrary.getBook();
        unitLibrary.addBook("Zaur", book);
        unitLibrary.addMagazine();
//        unitLibrary.getMagazine();
//        unitLibrary.returnMagazine();
//        unitLibrary.addBook();

        context.close();
    }
}
