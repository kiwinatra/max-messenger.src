package defpackage;

import java.util.List;

/* renamed from: kvd  reason: default package */
public final class kvd extends hvd {
    public final /* synthetic */ int l = 0;
    public final String m;
    public boolean n;
    public final Object o;

    public kvd(long j, String str, boolean z, List list) {
        super(j);
        this.m = str;
        this.n = z;
        this.o = list;
    }

    public final ivd a() {
        switch (this.l) {
            case 0:
                return new lvd(this);
            default:
                return new mvd(this);
        }
    }

    public mvd b() {
        return new mvd(this);
    }

    public kvd(long j, String str, l20 l20) {
        super(j);
        this.m = str;
        this.o = l20;
    }
}
