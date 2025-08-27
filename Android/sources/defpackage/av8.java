package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.util.Collections;

/* renamed from: av8  reason: default package */
public final class av8 extends q8 {
    public final /* synthetic */ int m;
    public final /* synthetic */ KeyEvent.Callback n;

    public /* synthetic */ av8(KeyEvent.Callback callback, int i) {
        this.m = i;
        this.n = callback;
    }

    public void A() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            default:
                return;
        }
    }

    public void B() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            case 1:
                ((ev8) this.n).g();
                return;
            case 3:
                ((uv8) this.n).g();
                return;
            case 4:
                ((dw8) this.n).n();
                return;
            default:
                return;
        }
    }

    public final void C(rw8 rw8) {
        grg b;
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            case 1:
                ((ev8) this.n).g();
                return;
            case 2:
                ((d) this.n).q(true);
                return;
            case 3:
                ((uv8) this.n).g();
                return;
            default:
                dw8 dw8 = (dw8) this.n;
                if (rw8 == dw8.z && rw8.a() != null) {
                    qw8 qw8 = rw8.a;
                    qw8.getClass();
                    sw8.b();
                    for (rw8 rw82 : Collections.unmodifiableList(qw8.b)) {
                        if (!Collections.unmodifiableList(dw8.z.u).contains(rw82) && (b = dw8.z.b(rw82)) != null && b.z() && !dw8.Y.contains(rw82)) {
                            dw8.o();
                            dw8.m();
                            return;
                        }
                    }
                }
                dw8.n();
                return;
        }
    }

    public void D() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            case 1:
                ((ev8) this.n).g();
                return;
            case 3:
                ((uv8) this.n).g();
                return;
            case 4:
                ((dw8) this.n).n();
                return;
            default:
                return;
        }
    }

    public void E(rw8 rw8) {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            case 1:
                ((ev8) this.n).dismiss();
                return;
            case 3:
                ((uv8) this.n).dismiss();
                return;
            case 4:
                dw8 dw8 = (dw8) this.n;
                dw8.z = rw8;
                dw8.o();
                dw8.m();
                return;
            default:
                return;
        }
    }

    public void F() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            case 2:
                ((d) this.n).q(false);
                return;
            case 4:
                ((dw8) this.n).n();
                return;
            default:
                return;
        }
    }

    public void G(rw8 rw8) {
        e eVar;
        KeyEvent.Callback callback = this.n;
        switch (this.m) {
            case 2:
                d dVar = (d) callback;
                SeekBar seekBar = (SeekBar) dVar.Z0.get(rw8);
                int i = rw8.o;
                int i2 = d.x1;
                if (seekBar != null && dVar.U0 != rw8) {
                    seekBar.setProgress(i);
                    return;
                }
                return;
            case 4:
                int i3 = dw8.c1;
                dw8 dw8 = (dw8) callback;
                if (dw8.F0 != rw8 && (eVar = (e) dw8.E0.get(rw8.c)) != null) {
                    int i4 = eVar.D0.o;
                    eVar.N(i4 == 0);
                    eVar.F0.setProgress(i4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void H() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).getClass();
                return;
            default:
                return;
        }
    }

    public void y() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            default:
                return;
        }
    }

    public void z() {
        switch (this.m) {
            case 0:
                ((cv8) this.n).b();
                return;
            default:
                return;
        }
    }
}
