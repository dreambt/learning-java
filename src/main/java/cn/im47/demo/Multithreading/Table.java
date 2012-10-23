package cn.im47.demo.Multithreading;

import java.util.LinkedList;

class Table extends LinkedList<Food> {

    int maxSize;

    public Table(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void putFood(Food f) {
        while (this.size() >= this.maxSize) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }
        this.add(f);
        notifyAll();
    }

    public synchronized Food getFood() {
        while (this.size() <= 0) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }
        Food f = this.removeFirst();
        notifyAll();
        return f;
    }

}