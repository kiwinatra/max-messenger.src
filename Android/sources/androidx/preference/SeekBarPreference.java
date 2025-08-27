package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference {
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public boolean a1;
    public SeekBar b1;
    public TextView c1;
    public final boolean d1;
    public final boolean e1;
    public final boolean f1;
    public final cw8 g1 = new cw8(2, this);
    public final xld h1 = new xld(1, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SeekBarPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.seekBarPreferenceStyle
            r3.<init>(r4, r5, r0)
            cw8 r1 = new cw8
            r2 = 2
            r1.<init>(r2, r3)
            r3.g1 = r1
            xld r1 = new xld
            r2 = 1
            r1.<init>(r2, r3)
            r3.h1 = r1
            int[] r1 = defpackage.nnc.SeekBarPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.SeekBarPreference_min
            int r5 = r4.getInt(r5, r2)
            r3.X0 = r5
            int r5 = defpackage.nnc.SeekBarPreference_android_max
            r0 = 100
            int r5 = r4.getInt(r5, r0)
            int r0 = r3.X0
            if (r5 >= r0) goto L_0x0031
            r5 = r0
        L_0x0031:
            int r0 = r3.Y0
            if (r5 == r0) goto L_0x003a
            r3.Y0 = r5
            r3.h()
        L_0x003a:
            int r5 = defpackage.nnc.SeekBarPreference_seekBarIncrement
            int r5 = r4.getInt(r5, r2)
            int r0 = r3.Z0
            if (r5 == r0) goto L_0x0056
            int r0 = r3.Y0
            int r1 = r3.X0
            int r0 = r0 - r1
            int r5 = java.lang.Math.abs(r5)
            int r5 = java.lang.Math.min(r0, r5)
            r3.Z0 = r5
            r3.h()
        L_0x0056:
            int r5 = defpackage.nnc.SeekBarPreference_adjustable
            r0 = 1
            boolean r5 = r4.getBoolean(r5, r0)
            r3.d1 = r5
            int r5 = defpackage.nnc.SeekBarPreference_showSeekBarValue
            boolean r5 = r4.getBoolean(r5, r2)
            r3.e1 = r5
            int r5 = defpackage.nnc.SeekBarPreference_updatesContinuously
            boolean r5 = r4.getBoolean(r5, r2)
            r3.f1 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SeekBarPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void A(int i, boolean z) {
        int i2 = this.X0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.Y0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.W0) {
            this.W0 = i;
            TextView textView = this.c1;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (x()) {
                int i4 = ~i;
                if (x()) {
                    i4 = this.b.b().getInt(this.Z, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor a = this.b.a();
                    a.putInt(this.Z, i);
                    y(a);
                }
            }
            if (z) {
                h();
            }
        }
    }

    public final void B(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.X0;
        if (progress == this.W0) {
            return;
        }
        if (a(Integer.valueOf(progress))) {
            A(progress, false);
            return;
        }
        seekBar.setProgress(this.W0 - this.X0);
        int i = this.W0;
        TextView textView = this.c1;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public final void l(ftb ftb) {
        super.l(ftb);
        ftb.a.setOnKeyListener(this.h1);
        this.b1 = (SeekBar) ftb.M(vfc.seekbar);
        TextView textView = (TextView) ftb.M(vfc.seekbar_value);
        this.c1 = textView;
        if (this.e1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.c1 = null;
        }
        SeekBar seekBar = this.b1;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.g1);
            this.b1.setMax(this.Y0 - this.X0);
            int i = this.Z0;
            if (i != 0) {
                this.b1.setKeyProgressIncrement(i);
            } else {
                this.Z0 = this.b1.getKeyProgressIncrement();
            }
            this.b1.setProgress(this.W0 - this.X0);
            int i2 = this.W0;
            TextView textView2 = this.c1;
            if (textView2 != null) {
                textView2.setText(String.valueOf(i2));
            }
            this.b1.setEnabled(g());
        }
    }

    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ond.class)) {
            super.p(parcelable);
            return;
        }
        ond ond = (ond) parcelable;
        super.p(ond.getSuperState());
        this.W0 = ond.a;
        this.X0 = ond.b;
        this.Y0 = ond.c;
        h();
    }

    public final Parcelable q() {
        this.S0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0) {
            return absSavedState;
        }
        ond ond = new ond(absSavedState);
        ond.a = this.W0;
        ond.b = this.X0;
        ond.c = this.Y0;
        return ond;
    }

    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (x()) {
            intValue = this.b.b().getInt(this.Z, intValue);
        }
        A(intValue, true);
    }
}
