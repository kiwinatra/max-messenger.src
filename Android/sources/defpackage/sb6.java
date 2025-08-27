package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: sb6  reason: default package */
public abstract class sb6 implements ha7 {
    public final Object a = new Object();
    public final ha7 b;
    public final HashSet c = new HashSet();

    public sb6(ha7 ha7) {
        this.b = ha7;
    }

    public final void a(rb6 rb6) {
        synchronized (this.a) {
            this.c.add(rb6);
        }
    }

    public final Image a0() {
        return this.b.a0();
    }

    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((rb6) it.next()).a(this);
        }
    }

    public int getHeight() {
        return this.b.getHeight();
    }

    public l97 getImageInfo() {
        return this.b.getImageInfo();
    }

    public int getWidth() {
        return this.b.getWidth();
    }

    public final int n0() {
        return this.b.n0();
    }

    public final wie[] w() {
        return this.b.w();
    }
}
