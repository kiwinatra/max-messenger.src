package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: xc1  reason: default package */
public final class xc1 extends pae {
    public final Executor X;
    public final ll1 Y;
    public final p6g Z;
    public final mmb v;
    public final b v0;
    public final pk1 w;
    public final Lazy w0;
    public final z51 x;
    public final Lazy x0;
    public final dk1 y;
    public final lk1 z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xc1(defpackage.mmb r2, defpackage.nh1 r3, defpackage.dh1 r4, defpackage.mh1 r5, defpackage.lk1 r6, kotlin.Lazy r7, kotlin.Lazy r8, defpackage.ll1 r9, defpackage.p6g r10, androidx.recyclerview.widget.b r11) {
        /*
            r1 = this;
            sjd r0 = defpackage.sjd.a
            aua r0 = r0.t()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1.<init>(r0)
            r1.v = r2
            r1.w = r3
            r1.x = r4
            r1.y = r5
            r1.z = r6
            r1.X = r0
            r1.Y = r9
            r1.Z = r10
            r1.v0 = r11
            r1.w0 = r7
            r1.x0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc1.<init>(mmb, nh1, dh1, mh1, lk1, kotlin.Lazy, kotlin.Lazy, ll1, p6g, androidx.recyclerview.widget.b):void");
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        kbe.M((wc1) ((lz7) E(i)));
    }

    /* renamed from: K */
    public final void z(kbe kbe) {
        kbe.O();
        tk1 tk1 = kbe instanceof tk1 ? (tk1) kbe : null;
        if (tk1 != null) {
            tk1.D0.a.remove(tk1);
        }
    }

    public final void t(pzc pzc, int i, List list) {
        j3h j3h;
        kbe kbe = (kbe) pzc;
        if (!list.isEmpty()) {
            wc1 wc1 = (wc1) ((lz7) E(i));
            if (wc1 instanceof vc1) {
                j3h = new j3h(7);
                for (Object next : list) {
                    uc1 uc1 = next instanceof uc1 ? (uc1) next : null;
                    if (uc1 != null) {
                        ((BitSet) j3h.a).or((BitSet) uc1.a);
                    }
                }
            } else if (wc1 instanceof rc1) {
                j3h = new j3h(7);
                for (Object next2 : list) {
                    qc1 qc1 = next2 instanceof qc1 ? (qc1) next2 : null;
                    if (qc1 != null) {
                        ((BitSet) j3h.a).or((BitSet) qc1.a);
                    }
                }
            } else if (wc1 instanceof tc1) {
                j3h = new j3h(7);
                for (Object next3 : list) {
                    sc1 sc1 = next3 instanceof sc1 ? (sc1) next3 : null;
                    if (sc1 != null) {
                        ((BitSet) j3h.a).or((BitSet) sc1.a);
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            kbe.N(wc1, j3h);
            return;
        }
        s(kbe, i);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        Lazy lazy = this.w0;
        Lazy lazy2 = this.x0;
        b bVar = this.v0;
        p6g p6g = this.Z;
        if (i == 111) {
            rk1 rk1 = new rk1(viewGroup.getContext(), (AttributeSet) null);
            rk1.setLayoutParams(new fj3(-1, -1));
            rk1.setVisibility(0);
            rk1.setOnTouchListener((View.OnTouchListener) lazy.getValue());
            rk1.setControlsMediator((zy3) lazy2.getValue());
            rk1.setVideoLayoutUpdatesController(p6g);
            rk1.setCallSpeakerMediator(this.z);
            rk1.setListener(this.w);
            rk1.setOpponentsViewPool(bVar);
            ((zy3) lazy2.getValue()).a.add(rk1);
            this.v.a.add(rk1);
            return new tk1(rk1, this.Y);
        } else if (i == 222) {
            a61 a61 = new a61(viewGroup.getContext(), (AttributeSet) null);
            a61.setLayoutParams(new fj3(-1, -1));
            a61.setVisibility(0);
            a61.setOnTouchListener((View.OnTouchListener) lazy.getValue());
            a61.setControlsMediator((zy3) lazy2.getValue());
            a61.setListener(this.x);
            a61.setVideoLayoutUpdatesController(p6g);
            a61.setOpponentsViewPool(bVar);
            ((zy3) lazy2.getValue()).a.add(a61);
            return new b61(a61, 0);
        } else if (i == 225) {
            ek1 ek1 = new ek1(viewGroup.getContext(), (AttributeSet) null);
            ek1.setLayoutParams(new fj3(-1, -1));
            ek1.setVisibility(0);
            ek1.setListener(this.y);
            return new b61(ek1, 2);
        } else {
            throw new IllegalStateException(("unknown item view type " + i).toString());
        }
    }
}
