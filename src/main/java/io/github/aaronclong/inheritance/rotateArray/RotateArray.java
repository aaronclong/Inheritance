package io.github.aaronclong.inheritance.rotateArray;

import java.util.ArrayList;

/**
 * Created by aaronlong on 5/2/17.
 */
public class RotateArray<E> extends ArrayList<E> {

    private E tmp;

    public int getSize() {
        return size() - 1;
    }

    public void rotate(int rotateDegree) {
        int size = getSize();
        if (rotateDegree-1 <= size) {
            tmp = get(size);
            for (int i = size; rotateDegree > -1; i--) {
                for (int z = i; z >= 0; z--) {
                    copy(z, z-1);
                }
                set(0, tmp);
            }
        }
    }

    private void copy(int index1, int index2) {
        int size = getSize();
        E valOne = null;
        E valTwo = null;

        if (index1 >= 0 && index1 <= size) {
            valOne = get(index1);
        }
        if (index2 >= 0 && index2 <= size) {
            valTwo = get(index2);
        }
        if (valOne != null) set(index2, valOne);
        if (valTwo != null) set(index1, valTwo);
    }

    public static void main(String[] args) {
        RotateArray<String> list = new RotateArray<String>();
        list.add("John");
        list.add("Aimee");
        list.add("Aaron");
        list.rotate(1);
        System.out.println(list.get(0));
    }
}
