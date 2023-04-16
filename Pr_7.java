/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr_7;
import java.util.concurrent.Semaphore;

/**
 *
 * @author stanovova
 */
public class Pr_7 {

    public static void main(String[] args) {
        System.out.println("Становова Диана, РИБО-03-21, вариант 2");
        Semaphore sem = new Semaphore(2);
        for (int i = 1; i <= 7; i++) {
            Thread t = new Student(i, sem);
            t.start();
        }
    }
}