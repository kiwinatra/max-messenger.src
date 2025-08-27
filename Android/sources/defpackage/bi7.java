package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: bi7  reason: default package */
public final /* synthetic */ class bi7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ bi7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final iog a(View view, iog iog, mbg mbg, tag tag) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                gq4 e2 = iog.a.e();
                if (e2 == null || !this.f) {
                    e2 = null;
                }
                int i7 = 0;
                if (this.b) {
                    i = iog.b() + (e2 != null ? fq4.d(e2.a) : 0);
                } else {
                    i = 0;
                }
                if (this.c) {
                    i2 = iog.d() + (e2 != null ? fq4.f(e2.a) : 0);
                } else {
                    i2 = 0;
                }
                if (this.d) {
                    i3 = iog.c() + (e2 != null ? fq4.e(e2.a) : 0);
                } else {
                    i3 = 0;
                }
                if (this.e) {
                    int a2 = iog.a();
                    if (e2 != null) {
                        i7 = fq4.c(e2.a);
                    }
                    i7 += a2;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = tag.a + i;
                    marginLayoutParams.rightMargin = tag.c + i3;
                    marginLayoutParams.topMargin = tag.b + i2;
                    marginLayoutParams.bottomMargin = tag.d + i7;
                    view.setLayoutParams(marginLayoutParams);
                    return iog.e(i, i2, i3, i7);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                gq4 e3 = iog.a.e();
                if (e3 == null || !this.f) {
                    e3 = null;
                }
                int i8 = 0;
                if (this.b) {
                    i4 = iog.b() + (e3 != null ? fq4.d(e3.a) : 0);
                } else {
                    i4 = 0;
                }
                if (this.c) {
                    i5 = iog.d() + (e3 != null ? fq4.f(e3.a) : 0);
                } else {
                    i5 = 0;
                }
                if (this.d) {
                    i6 = iog.c() + (e3 != null ? fq4.e(e3.a) : 0);
                } else {
                    i6 = 0;
                }
                if (this.e) {
                    int a3 = iog.a();
                    if (e3 != null) {
                        i8 = fq4.c(e3.a);
                    }
                    i8 += a3;
                }
                view.setPadding(mbg.a + i4, mbg.b + i5, mbg.c + i6, mbg.d + i8);
                return iog.e(i4, i5, i6, i8);
        }
    }
}
