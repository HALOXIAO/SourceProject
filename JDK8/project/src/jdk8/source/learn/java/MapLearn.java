package jdk8.source.learn.java;

import java.util.HashMap;
import java.util.Objects;

public class MapLearn {

    public static void main(String[] args) {
        HashMap<Node, Integer> map = new HashMap<>();
        for (int i = 0; i < 17; i++) {
            map.put(new Node(String.valueOf(i)), i);
        }
        System.out.println(map.entrySet().toString());
    }


}


class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}