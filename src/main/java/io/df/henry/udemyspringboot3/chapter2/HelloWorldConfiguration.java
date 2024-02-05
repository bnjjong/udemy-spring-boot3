package io.df.henry.udemyspringboot3.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
  public Person person() {
    return new Person("George", 38, new Address("Baker street", "London"));
  }

  @Bean
  public Person person2MethodCall() {
    return new Person(name(), age(), address());
  }

  @Bean
  public Person person3Parameters(String name, int age, Address address3) {
    return new Person(name, age, address3);
  }

  @Bean(name = "address2")
  public Address address() {
    return new Address("Baker street", "London");
  }

  @Bean(name = "address3")
  public Address address2() {
    return new Address("Donggyo-ro 1-gil", "Seoul");
  }

}

