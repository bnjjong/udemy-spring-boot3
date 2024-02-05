package io.df.henry.udemyspringboot3.chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp01 {
  public static void main(String[] args){
    // 1. Launch a spring context
    var context = new AnnotationConfigApplicationContext(
        HelloWorldConfiguration.class);

    // 2. configure the things that we want manage spring to manage
    // 2-1. HelloWorldConfiguration.class - @Configuration
    // 2-2. @Bean - name

    // 3. get bean of name.
    System.out.println(context.getBean("name")); // Henry
    System.out.println(context.getBean("age")); // 38
    System.out.println(context.getBean("person")); // Person[name=George, age=38]
    System.out.println(context.getBean("person2MethodCall")); // Person[name=George, age=38]
    System.out.println(context.getBean("person3Parameters")); // Person[name=George, age=38]
//    System.out.println(context.getBean("address")); // Address[firstLine=Baker street, city=London]

    System.out.println(context.getBean("address2")); // Bean 이름을 address2로 변경 함.
//    System.out.println(context.getBean(Address.class)); // class 로도 찾을 수 있다.
  }
}
