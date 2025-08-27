package defpackage;

import java.util.ArrayDeque;

/* renamed from: py1  reason: default package */
public final class py1 extends dze {
    public final /* synthetic */ int w;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py1() {
        super(2);
        this.w = 0;
    }

    public final void z() {
        switch (this.w) {
            case 0:
                ms1 ms1 = (ms1) this.x;
                ms1.getClass();
                ry1 ry1 = (ry1) ms1.b;
                ry1.getClass();
                this.b = 0;
                this.o = null;
                ry1.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((gy) this.x).w;
                y64.j(arrayDeque.size() < 2);
                y64.g(!arrayDeque.contains(this));
                this.b = 0;
                this.o = null;
                arrayDeque.addFirst(this);
                return;
            default:
                ibe ibe = (ibe) this.x;
                synchronized (ibe.b) {
                    this.b = 0;
                    this.o = null;
                    int i = ibe.y;
                    ibe.y = i + 1;
                    ibe.w[i] = this;
                    if (!ibe.c.isEmpty() && ibe.y > 0) {
                        ibe.b.notify();
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py1(wye wye, int i) {
        super(2);
        this.w = i;
        this.x = wye;
    }
}
