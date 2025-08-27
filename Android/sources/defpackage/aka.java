package defpackage;

import java.util.ArrayList;

/* renamed from: aka  reason: default package */
public final class aka extends ArrayList implements wja {
    public volatile int a;

    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    public final void d(uja uja) {
        if (uja.getAndIncrement() == 0) {
            cla cla = uja.b;
            int i = 1;
            while (!uja.o) {
                int i2 = this.a;
                Integer num = (Integer) uja.c;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i2) {
                    if (!lea.a(cla, get(intValue)) && !uja.o) {
                        intValue++;
                    } else {
                        return;
                    }
                }
                uja.c = Integer.valueOf(intValue);
                i = uja.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void e() {
        add(lea.a);
        this.a++;
    }

    public final void f(Throwable th) {
        add(new jea(th));
        this.a++;
    }
}
