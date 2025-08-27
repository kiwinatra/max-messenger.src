package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: pa5  reason: default package */
public final class pa5 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ pa5(int i) {
        this.a = i;
    }

    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                eb5[] eb5Arr = sa5.c;
                return i < 4;
            default:
                int i2 = this.b;
                eb5[] eb5Arr2 = sa5.c;
                return i2 < 4;
        }
    }

    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (eb5 eb5 : sa5.d[this.b]) {
                    hashMap.put(eb5.b, eb5);
                }
                this.b++;
                return hashMap;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
