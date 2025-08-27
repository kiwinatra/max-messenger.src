package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.SessionDescription;

/* renamed from: gm1  reason: default package */
public abstract class gm1 implements rz0, kn1, lz9, bj8 {
    public final lgd A0;
    public final mz9 X;
    public final ef1 Y;
    public final jc1 Z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean b;
    public Runnable c;
    public final te1 o;
    public final yoc v;
    public final jj8 v0;
    public final voc w;
    public fm1 w0;
    public final sp5 x;
    public int x0 = 0;
    public final d y;
    public boolean y0;
    public final ArrayList z = new ArrayList();
    public kbb z0;

    public gm1(ef1 ef1, mz9 mz9, te1 te1, voc voc, yoc yoc, sp5 sp5, d dVar, jc1 jc1, jj8 jj8, lgd lgd) {
        ur9.e();
        this.o = te1;
        this.w = voc;
        this.v = yoc;
        this.x = sp5;
        this.Y = ef1;
        this.X = mz9;
        this.Z = jc1;
        jc1.a.a.add(this);
        jc1.l.a.add(this);
        mz9.a.add(this);
        this.y = dVar;
        this.v0 = jj8;
        this.A0 = lgd;
    }

    public static String B(int i) {
        return i == 0 ? "PASSIVE" : "ACTIVE";
    }

    public Map A() {
        return null;
    }

    public void C(xne xne) {
    }

    public abstract String D();

    public void E(ue1 ue1, List list, boolean z2, sy0 sy0) {
    }

    public void F() {
    }

    public void G() {
    }

    public final boolean H(xnf xnf) {
        return y().equals(xnf);
    }

    public final boolean I() {
        return this.x0 == 1;
    }

    public final void J() {
        if (!this.b) {
            te1 te1 = this.o;
            te1.b.getClass();
            if (this.c == null) {
                this.c = w();
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                Handler handler = this.a;
                te1.b.getClass();
                handler.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
            }
        }
    }

    public void K(ue1 ue1, zwd zwd, boolean z2, ty0 ty0) {
    }

    public void L() {
        ur9.e();
        jj8 jj8 = this.v0;
        if (jj8 != null) {
            jj8.d.log("MediaAdaptation", "Releasing media adaptation controller");
            jj8.a.i.remove(jj8);
        }
        this.X.a.remove(this);
        this.Z.a.a.remove(this);
        this.w0 = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void M(xoc xoc) {
    }

    public void N(boolean z2) {
    }

    public void O(one one2) {
    }

    public void P(List list) {
        ur9.e();
        ArrayList arrayList = this.z;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void Q(ln1 ln1, List list) {
    }

    public final void R(String str) {
        this.w.log(D(), str);
    }

    public void S(List list) {
    }

    public abstract void T(kbb kbb);

    public final void U(String str) {
        this.w.log(D(), str);
    }

    public void a(e4 e4Var) {
    }

    public void j(mz9 mz9) {
    }

    public void onActiveParticipantUpdated(qz0 qz0) {
    }

    public void onActiveParticipantsAdded(mz0 mz0) {
    }

    public void onActiveParticipantsChanged(nz0 nz0) {
    }

    public void onActiveParticipantsDeAnonimized(oz0 oz0) {
    }

    public void onActiveParticipantsRemoved(pz0 pz0) {
    }

    public final void q(dj8 dj8) {
        if (I()) {
            kbb kbb = dj8.b;
            if (kbb == null) {
                kbb = this.z0;
            }
            T(kbb);
        }
    }

    public void s() {
    }

    public void t(ue1 ue1, SessionDescription sessionDescription) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('@');
        boolean z2 = ur9.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(B(this.x0));
        sb.append('}');
        return sb.toString();
    }

    public void u(ye1 ye1, boolean z2) {
    }

    public final void v(String str) {
        this.w.log(D(), str);
    }

    public abstract Runnable w();

    public long x() {
        return -1;
    }

    public abstract xnf y();

    public final ye1 z(ue1 ue1) {
        if (ue1 != null) {
            return this.Y.j(ue1);
        }
        return null;
    }
}
