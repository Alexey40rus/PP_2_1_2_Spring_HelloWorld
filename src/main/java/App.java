import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld mybean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(mybean.getMessage());
        System.out.println("переменные ссылаются на один и то же обьект ? " +
                (bean == mybean));

        Cat barsik = (Cat) applicationContext.getBean("cat");
        System.out.println(barsik.getMessage());
        Cat murzik = (Cat) applicationContext.getBean("cat");
        System.out.println(murzik.getMessage());
        System.out.println("переменные ссылаются на один и то же объект ? " +
                (barsik==murzik));

    }

}