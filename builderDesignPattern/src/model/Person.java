package model;

public class Person implements IPerson{
    private String firstName;
    private String lastName;
    private int age;

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this; // return this 是链式法则的关键
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(Integer age){
            this.age = age;
            return this;
        }

        // 记得 new 一个
        public Person build(){
            return new Person(this);
        }
    }
}
