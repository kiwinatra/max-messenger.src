package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: bbe  reason: default package */
public abstract class bbe extends yyc {
    public boolean g = true;

    public bbe() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120;
        this.d = 120;
        this.e = 250;
        this.f = 250;
    }

    public boolean a(pzc pzc, ft ftVar, ft ftVar2) {
        int i;
        int i2;
        if (ftVar == null || ((i = ftVar.b) == (i2 = ftVar2.b) && ftVar.c == ftVar2.c)) {
            return q(pzc);
        }
        return s(pzc, i, ftVar.c, i2, ftVar2.c);
    }

    public boolean b(pzc pzc, pzc pzc2, ft ftVar, ft ftVar2) {
        int i;
        int i2;
        int i3 = ftVar.b;
        int i4 = ftVar.c;
        if (pzc2.K()) {
            int i5 = ftVar.b;
            i = ftVar.c;
            i2 = i5;
        } else {
            i2 = ftVar2.b;
            i = ftVar2.c;
        }
        return r(pzc, pzc2, i3, i4, i2, i);
    }

    public boolean c(pzc pzc, ft ftVar, ft ftVar2) {
        int i = ftVar.b;
        int i2 = ftVar.c;
        View view = pzc.a;
        int left = ftVar2 == null ? view.getLeft() : ftVar2.b;
        int top = ftVar2 == null ? view.getTop() : ftVar2.c;
        if (pzc.B() || (i == left && i2 == top)) {
            t(pzc);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return s(pzc, i, i2, left, top);
    }

    public boolean d(pzc pzc, ft ftVar, ft ftVar2) {
        int i = ftVar.b;
        int i2 = ftVar2.b;
        if (i == i2 && ftVar.c == ftVar2.c) {
            h(pzc);
            return false;
        }
        return s(pzc, i, ftVar.c, i2, ftVar2.c);
    }

    public abstract boolean q(pzc pzc);

    public abstract boolean r(pzc pzc, pzc pzc2, int i, int i2, int i3, int i4);

    public abstract boolean s(pzc pzc, int i, int i2, int i3, int i4);

    public abstract void t(pzc pzc);

    public boolean u(pzc pzc) {
        return !this.g || pzc.z();
    }
}
