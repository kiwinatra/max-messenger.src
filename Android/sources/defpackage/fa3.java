package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: fa3  reason: default package */
public final class fa3 extends xx3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(zx3 zx3) {
    }

    public void d(zx3 zx3) {
        switch (this.a) {
            case 2:
                ((ly3) this.b).a.e(hu7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void g(zx3 zx3) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b.e(hu7.ON_RESUME);
                return;
            case 2:
                ((ly3) this.b).a.e(hu7.ON_RESUME);
                return;
            case 3:
                qc7 qc7 = (qc7) fc8.a.getAccessor().j(qc7.class);
                if (qc7 != null) {
                    qc7.e(Integer.valueOf(((jgd) this.b).a));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h(zx3 zx3) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b.e(hu7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void j(zx3 zx3, View view) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b.e(hu7.ON_START);
                return;
            case 2:
                ly3 ly3 = (ly3) this.b;
                q8.M(view, ly3);
                if (!m5a.J(zx3)) {
                    ly3.a.e(hu7.ON_CREATE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void k(zx3 zx3) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ComplaintBottomSheet.v;
                ((ComplaintBottomSheet) obj).getClass();
                ka3.b.W0().d();
                return;
            case 4:
                ((e9d) obj).d.remove(zx3);
                return;
            default:
                return;
        }
    }

    public void l(zx3 zx3) {
        switch (this.a) {
            case 2:
                ly3 ly3 = (ly3) this.b;
                if (ly3.a.d.a(iu7.c)) {
                    ly3.a.e(hu7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void n(zx3 zx3, View view) {
        switch (this.a) {
            case 2:
                ((ly3) this.b).a.e(hu7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(zx3 zx3) {
        int i = this.a;
    }

    public void q(zx3 zx3) {
        switch (this.a) {
            case 2:
                ly3 ly3 = (ly3) this.b;
                if (ly3.a.d == iu7.a) {
                    ly3.a = new lv7(ly3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void r(zx3 zx3) {
        switch (this.a) {
            case 1:
                lv7 lv7 = ((tu1) this.b).b;
                if (lv7.d != iu7.b) {
                    lv7.e(hu7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void s(zx3 zx3, View view) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b.e(hu7.ON_STOP);
                return;
            case 2:
                ((ly3) this.b).a.e(hu7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public void t(zx3 zx3) {
        switch (this.a) {
            case 1:
                ((tu1) this.b).b.e(hu7.ON_PAUSE);
                return;
            case 2:
                ((ly3) this.b).a.e(hu7.ON_PAUSE);
                return;
            default:
                return;
        }
    }
}
