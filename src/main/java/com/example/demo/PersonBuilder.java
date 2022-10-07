package com.example.demo;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        super();
        //this.id = id;
        //this.name = name;
        //return this;
    }

    public void cualquiera(){
        super.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*public class PersonBuilder {
        public Person build(int id, String name) {
            return new Person();
        }

}*/

public class PersonBuilder {
    public static void main(String args[]) {
        /*Person person = new Person();
        person.setId(100002152);
        person.setName("fernando");
*/

        Person person = new Person(1215,"fernando");
        System.out.println(person.getId() + " " + person.getName());

    }
}