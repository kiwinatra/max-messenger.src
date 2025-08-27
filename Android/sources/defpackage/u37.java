package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: u37  reason: default package */
public final class u37 extends mdf {
    public final /* synthetic */ fb1 e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ a0e g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u37(String str, fb1 fb1, a0e a0e) {
        super(str, true);
        this.e = fb1;
        this.g = a0e;
    }

    public final long a() {
        int i;
        Object obj;
        fb1 fb1 = this.e;
        boolean z = this.f;
        T t = this.g;
        fb1.getClass();
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (((a47) fb1.c).H0) {
            synchronized (((a47) fb1.c)) {
                try {
                    a0e a0e = ((a47) fb1.c).B0;
                    if (!z) {
                        T a0e2 = new a0e();
                        for (int i2 = 0; i2 < 10; i2++) {
                            if (((1 << i2) & a0e.a) != 0) {
                                a0e2.b(i2, a0e.b[i2]);
                            }
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & t.a) != 0) {
                                a0e2.b(i3, t.b[i3]);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        t = a0e2;
                    }
                    objectRef2.element = t;
                    long a = ((long) t.a()) - ((long) a0e.a());
                    longRef.element = a;
                    if (a != 0) {
                        if (!((a47) fb1.c).c.isEmpty()) {
                            Object[] array = ((a47) fb1.c).c.values().toArray(new h47[0]);
                            if (array != null) {
                                obj = (h47[]) array;
                                objectRef.element = obj;
                                a47 a47 = (a47) fb1.c;
                                a47.B0 = (a0e) objectRef2.element;
                                a47.Y.c(new r37(((a47) fb1.c).o + " onSettings", fb1, objectRef2), 0);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    obj = null;
                    objectRef.element = obj;
                    a47 a472 = (a47) fb1.c;
                    a472.B0 = (a0e) objectRef2.element;
                    a472.Y.c(new r37(((a47) fb1.c).o + " onSettings", fb1, objectRef2), 0);
                    Unit unit22 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ((a47) fb1.c).H0.a((a0e) objectRef2.element);
            } catch (IOException e2) {
                ((a47) fb1.c).a(2, 2, e2);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        h47[] h47Arr = (h47[]) objectRef.element;
        if (h47Arr == null) {
            return -1;
        }
        for (h47 h47 : h47Arr) {
            synchronized (h47) {
                long j = longRef.element;
                h47.d += j;
                if (j > 0) {
                    h47.notifyAll();
                }
                Unit unit4 = Unit.INSTANCE;
            }
        }
        return -1;
    }
}
