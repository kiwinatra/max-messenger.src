package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyKt;
import ru.ok.messages.bots.InlineKeyboardAttachView;

/* renamed from: ek3  reason: default package */
public final class ek3 extends tyc implements a30 {
    public final ju8 X;
    public final boolean Y;
    public final nd Z;
    public final t3a o;
    public ArrayList v;
    public final ef9 v0;
    public List w;
    public RecyclerView w0;
    public final ro4 x = ro4.b();
    public final ju8 y;
    public final ju8 z;

    public ek3(Context context, t3a t3a, List list, ju8 ju8, ju8 ju82, ju8 ju83, boolean z2, nd ndVar, gaf gaf, et0 et0, m95 m95) {
        et0 et02 = et0;
        this.o = t3a;
        List list2 = list;
        this.v = E(list);
        this.y = ju8;
        this.z = ju82;
        this.X = ju83;
        this.Y = z2;
        this.Z = ndVar;
        Context context2 = context;
        this.v0 = new ef9(context, gaf, LazyKt.lazy(new s2(24, (Object) et02, (Object) context)), LazyKt.lazy(new nm1(14, et02)), m95, 40, 6);
    }

    public final ArrayList E(List list) {
        ArrayList arrayList = new ArrayList();
        cjf.u(list, new ba(22, this, arrayList));
        return arrayList;
    }

    public final int F(long j) {
        for (int i = 0; i < this.v.size(); i++) {
            if (((of9) this.v.get(i)).a.a.b == j) {
                return i;
            }
        }
        return -1;
    }

    public final int j() {
        if (cjf.B(this.v)) {
            return 0;
        }
        return this.v.size();
    }

    public final long k(int i) {
        return ((of9) this.v.get(i)).a.a.b;
    }

    public final void r(RecyclerView recyclerView) {
        this.w0 = recyclerView;
    }

    public final void s(pzc pzc, int i) {
        dk3 dk3 = (dk3) pzc;
        of9 of9 = (of9) this.v.get(i);
        int q = dk3.q();
        gg9 gg9 = dk3.D0;
        gg9.U0 = of9;
        gg9.X0 = false;
        scf scf = gg9.e1;
        gg9.Z0 = scf.g;
        gg9.a1 = scf.h;
        gg9.W0 = false;
        gg9.i(gg9.V0, of9.a);
        gg9.Y0 = bt0.a;
        gg9.E0.setVisibility(8);
        gg9.C0.setVisibility(8);
        gg9.d(q, gg9.U0, gg9.X0, this.Y);
        a89 a89 = of9.a;
        gg9.e(a89);
        gg9.f1.setVisibility(8);
        gg9.g1.setVisibility(8);
        gg9.F0.setVisibility(8);
        gg9.h();
        ha9 ha9 = a89.a;
        boolean r = ha9.r();
        InlineKeyboardAttachView inlineKeyboardAttachView = dk3.E0;
        if (r) {
            inlineKeyboardAttachView.setVisibility(0);
            inlineKeyboardAttachView.a.a(ha9.h());
            int paddingLeft = gg9.getPaddingLeft();
            int paddingRight = gg9.getPaddingRight();
            WeakHashMap weakHashMap = gag.a;
            inlineKeyboardAttachView.setPaddingRelative(paddingLeft, 0, paddingRight, 0);
        } else {
            inlineKeyboardAttachView.setVisibility(8);
        }
        int j = j() - 1;
        View view = dk3.a;
        if (i == j) {
            iq.q(view, this.x.G);
        } else {
            iq.q(view, 0);
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        fk3 fk3 = new fk3(viewGroup.getContext());
        ef9 ef9 = this.v0;
        gg9 gg9 = fk3.b;
        gg9.setTextLayoutRepository(ef9);
        gg9.A(this.y, this.z, this.X);
        return new dk3(this, fk3, this.o, this);
    }

    public final void v(RecyclerView recyclerView) {
        this.w0 = null;
    }
}
