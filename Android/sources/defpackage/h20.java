package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: h20  reason: default package */
public final class h20 {
    public long a;
    public int b;
    public int c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    public int i = -1;
    public boolean j;
    public long k;
    public boolean l;
    public int m = -1;
    public Object n;
    public Object o;
    public Object p;

    public k20 a() {
        return new k20(this);
    }

    public boe b() {
        if (((List) this.n) == null) {
            this.n = Collections.emptyList();
        }
        if (this.i == 0) {
            this.i = 1;
        }
        if (this.m == 0) {
            this.m = 1;
        }
        return new boe(this);
    }
}
