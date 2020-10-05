package com.artem;

import java.util.Objects;

public class Artem {

    private String name;
    private Integer age;
    private Boolean isDurak;

    public Artem(String name, Integer age, Boolean isDurak) {
        this.name = name;
        this.age = age;
        this.isDurak = isDurak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getDurak() {
        return isDurak;
    }

    public void setDurak(Boolean durak) {
        isDurak = durak;
    }

    @Override
    public String toString() {
        return "Artem{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDurak=" + isDurak +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artem)) return false;
        Artem artem = (Artem) o;
        return Objects.equals(getName(), artem.getName()) &&
                Objects.equals(getAge(), artem.getAge()) &&
                Objects.equals(isDurak, artem.isDurak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isDurak);
    }
}
