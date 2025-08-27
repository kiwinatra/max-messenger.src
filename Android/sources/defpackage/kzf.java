package defpackage;

import java.util.Collections;

/* renamed from: kzf  reason: default package */
public final class kzf implements fzf {
    public final /* synthetic */ int a;
    public final Object b;

    public kzf() {
        this.a = 0;
        this.b = Collections.synchronizedMap(new wi6(1000));
    }

    public final ma3 a(bxf bxf) {
        switch (this.a) {
            case 0:
                return new qa3(0, new hzf(2, this, bxf));
            default:
                return new na3(4, g(), new gxf(bxf, 4));
        }
    }

    public final ma3 b(long j) {
        switch (this.a) {
            case 0:
                return new qa3(0, new hzf(3, this, new f1a(j, 3)));
            default:
                return new na3(4, g(), new f1a(j, 4));
        }
    }

    public final ma3 c(kxf kxf) {
        switch (this.a) {
            case 0:
                return new qa3(0, new jzf(this, kxf));
            default:
                return new na3(4, g(), new ixf(kxf, 3));
        }
    }

    public final ma3 clear() {
        switch (this.a) {
            case 0:
                return new qa3(0, new jrf(7, (Object) this));
            default:
                return new na3(4, g(), new hxf(5));
        }
    }

    public final nh8 d(kxf kxf) {
        switch (this.a) {
            case 0:
                return new sh8(0, new jzf(this, kxf));
            default:
                return new ai8(new wh8(2, g(), new ixf(kxf, 2)), new hxf(6), 1);
        }
    }

    public final ma3 e(String str) {
        switch (this.a) {
            case 0:
                return new qa3(0, new hzf(3, this, new a62(str, 11)));
            default:
                return new na3(4, g(), new a62(str, 12));
        }
    }

    public final nh8 f() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                wyf wyf = wyf.UNKNOWN;
                return new wh8(2, new yia(new oa3(1, new wh8(2, g(), new jrf()), new q0a(0)), new hxf(6), 3).B(), new hxf(7));
        }
    }

    public wbe g() {
        return ((j6d) this.b).n().i(new hxf(8));
    }

    public kzf(j6d j6d) {
        this.a = 1;
        this.b = j6d;
    }
}
