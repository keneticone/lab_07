package pl.utp.programowanie.lab7;

import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog() {}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }

    public static final class DogBuilder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        private DogBuilder() {
        }

        public static DogBuilder aDog() {
            return new DogBuilder();
        }

        public DogBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public DogBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public DogBuilder withToys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            Dog dog = new Dog();
            dog.age = this.age;
            dog.type = this.type;
            dog.name = this.name;
            dog.toys = this.toys;
            this.age = null;
            this.type = null;
            this.name = null;
            this.toys = null;
            return dog;
        }
    }
}