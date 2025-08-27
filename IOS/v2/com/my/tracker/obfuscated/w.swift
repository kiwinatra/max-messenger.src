package com.my.tracker.obfuscated;

public final class w implements u {
    private final int a;
    private int b;

    public w(int i) {
        this.a = i;
        g();
    }

    public int a() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void f() {
        this.b++;
    }

    public void g() {
        this.b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.a + ", count = " + this.b;
    }
}
