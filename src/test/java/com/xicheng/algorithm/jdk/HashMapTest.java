package com.xicheng.algorithm.jdk;

import lombok.Data;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 23:56
 */
public class HashMapTest {

    @Test
    public void putTest() {
        Key key = new Key();
        key.setAge(11);
        Map<Key, String> map = new HashMap<>();
        map.put(key, "value");
        Key key1 = new Key();
        key1.setAge(15);
        map.put(key1, "value");
        System.out.println(map);
    }
}

@Data
class Key {
    private String name;

    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return this.getClass().equals(o.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
