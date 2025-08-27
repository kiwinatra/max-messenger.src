package defpackage;

import android.view.View;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ad5  reason: default package */
public final class ad5 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public ad5(eob eob) {
        this.f = eob;
    }

    public void a() {
        this.c = this.d ? ((vo7) this.f).h() : ((vo7) this.f).m();
    }

    public void b(View view, int i) {
        if (this.d) {
            this.c = ((vo7) this.f).o() + ((vo7) this.f).c(view);
        } else {
            this.c = ((vo7) this.f).f(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int o = ((vo7) this.f).o();
        if (o >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int h = (((vo7) this.f).h() - o) - ((vo7) this.f).c(view);
            this.c = ((vo7) this.f).h() - h;
            if (h > 0) {
                int d2 = this.c - ((vo7) this.f).d(view);
                int m = ((vo7) this.f).m();
                int min = d2 - (Math.min(((vo7) this.f).f(view) - m, 0) + m);
                if (min < 0) {
                    this.c = Math.min(h, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int f2 = ((vo7) this.f).f(view);
        int m2 = f2 - ((vo7) this.f).m();
        this.c = f2;
        if (m2 > 0) {
            int h2 = (((vo7) this.f).h() - Math.min(0, (((vo7) this.f).h() - o) - ((vo7) this.f).c(view))) - (((vo7) this.f).d(view) + f2);
            if (h2 < 0) {
                this.c -= Math.min(m2, -h2);
            }
        }
    }

    public void d(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void e() {
        this.b = -1;
        this.c = IntCompanionObject.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return wzf.l(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public ad5() {
        e();
    }
}
