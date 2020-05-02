package com.xicheng.algorithm.mashibing.sort;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * description 写一个小程序证明选择排序不稳定
 * 思路：其中包含一个年龄很大的人，大家都会跟他交换位置，位置就会发生倒置
 *
 * @author xichengxml
 * @date 2020-05-02 23:22
 */
@Slf4j
public class T03_SelectionSort {

    public static void main(String[] args) {
        User user01 = new User();
        user01.setAge(20);
        user01.setName("zhangsan");
        User user02 = new User();
        user02.setAge(19);
        user02.setName("lisi");
        User user03 = new User();
        user03.setAge(19);
        user03.setName("wangwu");

        User[] arr = {user01, user02, user03};
        sort(arr);
    }

    private static void sort(User[] userArr) {
        int length = userArr.length;
        for (int i = 0; i < length; i++) {
            int minPos = i;
            for (int j = i + 1; j < length; j++) {
                if (userArr[j].getAge() < userArr[minPos].getAge()) {
                    minPos = j;
                    User tmpUser = userArr[i];
                    userArr[i] = userArr[minPos];
                    userArr[minPos] = tmpUser;
                }
            }
        }
        log.info("sort result: {}", Arrays.toString(userArr));
    }
}

@Getter
@Setter
@ToString
class User {

    private int age;

    private String name;
}
