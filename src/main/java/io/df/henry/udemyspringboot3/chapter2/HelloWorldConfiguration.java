package io.df.henry.udemyspringboot3.chapter2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String name() {
    return "Henry";
  }

  @Bean
  public int age() {
    return 38;
  }

  @Bean
  @Primary
  public Person person() {
    return new Person("George", 38, new Address("Baker street", "London"));
  }

  @Bean
  public Person person2MethodCall() {
    return new Person(name(), age(), address2());
  }

  @Bean
  public Person person3Parameters(String name, int age, @Qualifier("address3-qualifier") Address address3) {
    // address3이름으로 빈 매칭을 할줄 알았는데 어쨌든 타입으로 매칭하여 qualifier를 해줌.
    return new Person(name, age, address3);
  }

  @Bean
  public Person person4Parameters(String name, int age, Address address) {
    return new Person(name, age, address);
  }

  @Bean(name = "address2")
  @Primary
  public Address address2() {
    return new Address("Baker street", "London");
  }

  @Bean(name = "address3")
  @Qualifier("address3-qualifier")
  public Address address3() {
    return new Address("Donggyo-ro 1-gil", "Seoul");
  }

}

