package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.e;
import androidx.preference.SeekBarPreference;

/* renamed from: cw8  reason: default package */
public final class cw8 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cw8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    rw8 rw8 = (rw8) seekBar.getTag();
                    e eVar = (e) ((dw8) this.b).E0.get(rw8.c);
                    if (eVar != null) {
                        eVar.N(i == 0);
                    }
                    rw8.j(i);
                    return;
                }
                return;
            case 1:
                xob xob = (xob) this.b;
                if (!z || !xob.y) {
                    xob.w.setVisibility(8);
                    return;
                }
                wob wob = xob.z;
                if (wob != null) {
                    ((hf7) wob).z0.d(new oy3(i));
                }
                u11 u11 = xob.w;
                ((TextView) u11.c).setText(b0h.c((long) i));
                vpb vpb = xob.v;
                u11.setTranslationX(Math.min((float) ((vpb.getWidth() - xob.o.getWidth()) - u11.getWidth()), Math.max((float) xob.c.getWidth(), ((float) (vpb.getThumbOffset() + (xob.getPaddingLeft() + vpb.getThumb().getBounds().centerX()))) - (((float) u11.getWidth()) / 2.0f))));
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.b;
                if (!z || (!seekBarPreference.f1 && seekBarPreference.a1)) {
                    int i2 = i + seekBarPreference.X0;
                    TextView textView = seekBarPreference.c1;
                    if (textView != null) {
                        textView.setText(String.valueOf(i2));
                        return;
                    }
                    return;
                }
                seekBarPreference.B(seekBar);
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                dw8 dw8 = (dw8) this.b;
                if (dw8.F0 != null) {
                    dw8.A0.removeMessages(2);
                }
                dw8.F0 = (rw8) seekBar.getTag();
                return;
            case 1:
                wob listener = ((xob) this.b).getListener();
                if (listener != null) {
                    ((hf7) listener).z0.d(py3.a);
                    return;
                }
                return;
            default:
                ((SeekBarPreference) this.b).a1 = true;
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((dw8) this.b).A0.sendEmptyMessageDelayed(2, 500);
                return;
            case 1:
                xob xob = (xob) this.b;
                wob listener = xob.getListener();
                if (listener != null) {
                    ((hf7) listener).z0.d(new qy3(seekBar.getProgress()));
                }
                xob.w.setVisibility(8);
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.b;
                seekBarPreference.a1 = false;
                if (seekBar.getProgress() + seekBarPreference.X0 != seekBarPreference.W0) {
                    seekBarPreference.B(seekBar);
                    return;
                }
                return;
        }
    }
}
