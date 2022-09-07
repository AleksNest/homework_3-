package Medicine;


public class Students {
    private String name;
    private int age;
    private boolean illness;

    public Students(String name, int age, boolean illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isIllness() {
        return this.illness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }
}
