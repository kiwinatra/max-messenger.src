package defpackage;

import android.util.SparseIntArray;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g54  reason: default package */
public final class g54 implements ThreadFactory {
    public static final SparseIntArray v;
    public final int a = 9;
    public final int b = v.get(9, 0);
    public final String c;
    public final AtomicInteger o = new AtomicInteger(0);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v = sparseIntArray;
        sparseIntArray.put(1, 10);
        sparseIntArray.put(2, 16);
        sparseIntArray.put(3, 13);
        sparseIntArray.put(4, 16);
        sparseIntArray.put(5, 0);
        sparseIntArray.put(6, -2);
        sparseIntArray.put(7, -4);
        sparseIntArray.put(8, -6);
        sparseIntArray.put(9, -5);
        sparseIntArray.put(10, -8);
    }

    public g54(String str) {
        this.c = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new ir1(19, this, runnable));
        try {
            thread.setPriority(this.a);
        } catch (Throwable unused) {
        }
        thread.setName(this.c + "-" + this.o.getAndIncrement());
        return thread;
    }
}
