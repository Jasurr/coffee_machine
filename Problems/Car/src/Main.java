

 class Test {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(person.getNextId()); // (1)
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        this.name = name; // (2)
        this.id = nextId;
        nextId++; // (3)
    }

    public long getNextId() { // (4)
        return nextId;
    }
}