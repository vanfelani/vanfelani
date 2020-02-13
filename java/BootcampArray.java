package bootcamparray;

import java.util.Arrays;

public class BootcampArray {

    private String[] trainees;

    public BootcampArray(String[] trainees) {
        this.trainees = trainees;

    }

    public BootcampArray(int size) {
        this.trainees = new String[size];
    }

    public String get(int index) {
        return trainees[index];
    }

    public boolean add(String name) {
        if (size() < trainees.length) {
            for (int i = 0; i < trainees.length; i++) {
                if (trainees[i] == null) {
                    trainees[i] = name;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean edit(int index, String name) {
        if (index < trainees.length) {
            trainees[index] = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String name) {
        int count = 0;
        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i].equals(name)) {
                trainees[i] = null;
                count++;
                break;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public int size() {
        int temp = 0;
        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i] != null) {
                temp++;
            }
        }
        return temp;
    }

    public void print() {
        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i] != null) {
                System.out.println(trainees[i]);
            }

        }
    }
}
