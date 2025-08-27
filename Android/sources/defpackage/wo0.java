package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.rlottie.c;

/* renamed from: wo0  reason: default package */
public final /* synthetic */ class wo0 implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Bitmap[] c;
    public final /* synthetic */ int o;
    public final /* synthetic */ ib7[] v;
    public final /* synthetic */ int w;
    public final /* synthetic */ RandomAccessFile x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ CountDownLatch[] z;

    public /* synthetic */ wo0(c cVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i, ib7[] ib7Arr, int i2, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.a = cVar;
        this.b = atomicBoolean;
        this.c = bitmapArr;
        this.o = i;
        this.v = ib7Arr;
        this.w = i2;
        this.x = randomAccessFile;
        this.y = arrayList;
        this.z = countDownLatchArr;
    }

    public final void run() {
        c cVar = this.a;
        AtomicBoolean atomicBoolean = this.b;
        Bitmap[] bitmapArr = this.c;
        int i = this.o;
        ib7[] ib7Arr = this.v;
        int i2 = this.w;
        RandomAccessFile randomAccessFile = this.x;
        ArrayList arrayList = this.y;
        CountDownLatch[] countDownLatchArr = this.z;
        if (!cVar.n.get() && !atomicBoolean.get()) {
            bitmapArr[i].compress(Bitmap.CompressFormat.WEBP, cVar.k, ib7Arr[i]);
            int i3 = ib7Arr[i].b;
            try {
                synchronized (cVar.h) {
                    zo0 zo0 = new zo0(i2);
                    zo0.c = (int) randomAccessFile.length();
                    arrayList.add(zo0);
                    randomAccessFile.write(ib7Arr[i].a, 0, i3);
                    zo0.b = i3;
                    ib7 ib7 = ib7Arr[i];
                    synchronized (ib7) {
                        ib7.b = 0;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    atomicBoolean.set(true);
                    throw th;
                }
                atomicBoolean.set(true);
            }
            countDownLatchArr[i].countDown();
        }
    }
}
