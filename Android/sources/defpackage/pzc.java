package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: pzc  reason: default package */
public abstract class pzc {
    public static final List C0 = Collections.emptyList();
    public RecyclerView A0;
    public tyc B0;
    public int X;
    public ArrayList Y = null;
    public List Z = null;
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int o = -1;
    public long v = -1;
    public int v0 = 0;
    public int w = -1;
    public hzc w0 = null;
    public int x = -1;
    public boolean x0 = false;
    public pzc y = null;
    public int y0 = 0;
    public pzc z = null;
    public int z0 = -1;

    public pzc(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final boolean A() {
        if ((this.X & 16) == 0) {
            WeakHashMap weakHashMap = gag.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        return (this.X & 8) != 0;
    }

    public final boolean C() {
        return this.w0 != null;
    }

    public final boolean E() {
        return (this.X & 256) != 0;
    }

    public final boolean G() {
        return (this.X & 2) != 0;
    }

    public final void H(int i, boolean z2) {
        if (this.o == -1) {
            this.o = this.c;
        }
        if (this.x == -1) {
            this.x = this.c;
        }
        if (z2) {
            this.x += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((bzc) view.getLayoutParams()).c = true;
        }
    }

    public final void I() {
        if (!RecyclerView.J1 || !E()) {
            this.X = 0;
            this.c = -1;
            this.o = -1;
            this.v = -1;
            this.x = -1;
            this.v0 = 0;
            this.y = null;
            this.z = null;
            ArrayList arrayList = this.Y;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.X &= -1025;
            this.y0 = 0;
            this.z0 = -1;
            RecyclerView.o(this);
            return;
        }
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public final void J(boolean z2) {
        int i = this.v0;
        int i2 = z2 ? i - 1 : i + 1;
        this.v0 = i2;
        if (i2 < 0) {
            this.v0 = 0;
            if (!RecyclerView.J1) {
                toString();
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z2 && i2 == 1) {
            this.X |= 16;
        } else if (z2 && i2 == 0) {
            this.X &= -17;
        }
        if (RecyclerView.K1) {
            toString();
        }
    }

    public final boolean K() {
        return (this.X & Uuid.SIZE_BITS) != 0;
    }

    public final boolean L() {
        return (this.X & 32) != 0;
    }

    public final void n(int i) {
        this.X = i | this.X;
    }

    public final int p() {
        RecyclerView recyclerView = this.A0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.Q(this);
    }

    public final int q() {
        RecyclerView recyclerView;
        tyc adapter;
        int Q;
        if (this.B0 == null || (recyclerView = this.A0) == null || (adapter = recyclerView.getAdapter()) == null || (Q = this.A0.Q(this)) == -1) {
            return -1;
        }
        return adapter.i(this.B0, this, Q);
    }

    public final int s() {
        int i = this.x;
        return i == -1 ? this.c : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List t() {
        /*
            r2 = this;
            int r0 = r2.X
            r0 = r0 & 1024(0x400, float:1.435E-42)
            java.util.List r1 = C0
            if (r0 != 0) goto L_0x0016
            java.util.ArrayList r0 = r2.Y
            if (r0 == 0) goto L_0x0016
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            java.util.List r2 = r2.Z
            return r2
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzc.t():java.util.List");
    }

    public final String toString() {
        StringBuilder m = g63.m(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        m.append(Integer.toHexString(hashCode()));
        m.append(" position=");
        m.append(this.c);
        m.append(" id=");
        m.append(this.v);
        m.append(", oldPos=");
        m.append(this.o);
        m.append(", pLpos:");
        m.append(this.x);
        StringBuilder sb = new StringBuilder(m.toString());
        if (C()) {
            sb.append(" scrap ");
            sb.append(this.x0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (z()) {
            sb.append(" invalid");
        }
        if (!y()) {
            sb.append(" unbound");
        }
        if ((this.X & 2) != 0) {
            sb.append(" update");
        }
        if (B()) {
            sb.append(" removed");
        }
        if (K()) {
            sb.append(" ignored");
        }
        if (E()) {
            sb.append(" tmpDetached");
        }
        if (!A()) {
            sb.append(" not recyclable(" + this.v0 + ")");
        }
        if ((this.X & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 || z()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean v(int i) {
        return (this.X & i) != 0;
    }

    public final boolean x() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.A0) ? false : true;
    }

    public final boolean y() {
        return (this.X & 1) != 0;
    }

    public final boolean z() {
        return (this.X & 4) != 0;
    }
}
