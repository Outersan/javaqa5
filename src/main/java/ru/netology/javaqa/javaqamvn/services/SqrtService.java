package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int x, int y) {
        int i;
        int count = 0;

        for (i = 1; i <= y; i++) {
            while (i * i <= y) {
                i = i * i;
                System.out.println(i);
                if (i * i <= x) {
                    i++;
                    continue;
                } else if (i * i >= x) {
                    i++;
                    count++;
                }
            }
        }
        return count;
    }
}