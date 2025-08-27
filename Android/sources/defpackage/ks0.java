package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;

/* renamed from: ks0  reason: default package */
public final class ks0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public ks0(ls0 ls0, b0e b0e) {
        this.c = ls0;
        this.b = b0e;
    }

    private final void a(SeekBar seekBar, int i, boolean z) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (z) {
                    int i2 = d.x1;
                    ((rw8) seekBar.getTag()).j(i);
                    return;
                }
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((ls0) this.c).F0 = true;
                return;
            default:
                d dVar = (d) this.c;
                if (dVar.U0 != null) {
                    dVar.S0.removeCallbacks((tj7) this.b);
                }
                dVar.U0 = (rw8) seekBar.getTag();
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ls0 ls0 = (ls0) this.c;
                fyd fyd = ls0.E0;
                if (fyd != null) {
                    ((b0e) this.b).C(fyd.a, Integer.valueOf(seekBar.getProgress()));
                }
                ls0.F0 = false;
                return;
            default:
                ((d) this.c).S0.postDelayed((tj7) this.b, 500);
                return;
        }
    }

    public ks0(d dVar) {
        this.c = dVar;
        this.b = new tj7(10, this);
    }
}
