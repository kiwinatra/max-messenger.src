package defpackage;

import android.os.SystemClock;
import kotlin.reflect.KProperty;

/* renamed from: ur1  reason: default package */
public final class ur1 implements qk3 {
    public long a;
    public long b;
    public Object c;

    public /* synthetic */ ur1(Object obj, long j, long j2) {
        this.c = obj;
        this.a = j;
        this.b = j2;
    }

    public int a() {
        if (!((wr1) this.c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = uptimeMillis;
        }
        long j = uptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    public void accept(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            qfa qfa = (qfa) this.c;
            qfa.getClass();
            KProperty kProperty = qfa.y[5];
            ((hga) qfa.w.get()).f(this.a, this.b);
        }
    }

    public int b() {
        boolean c2 = ((wr1) this.c).c();
        long j = this.a;
        if (!c2) {
            if (j > 0) {
                return Math.min((int) j, 10000);
            }
            return 10000;
        } else if (j > 0) {
            return Math.min((int) j, 1800000);
        } else {
            return 1800000;
        }
    }
}
