package com.google.android.material.timepicker;

import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import java.util.WeakHashMap;

public final class e implements o33, qjf, mjf {
    public static final String[] w = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] x = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] y = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView a;
    public final ijf b;
    public float c;
    public float o;
    public boolean v = false;

    public e(TimePickerView timePickerView, ijf ijf) {
        this.a = timePickerView;
        this.b = ijf;
        if (ijf.c == 0) {
            timePickerView.I0.setVisibility(0);
        }
        timePickerView.G0.v0.add(this);
        timePickerView.K0 = this;
        timePickerView.J0 = this;
        timePickerView.G0.D0 = this;
        String[] strArr = w;
        for (int i = 0; i < 12; i++) {
            strArr[i] = ijf.a(this.a.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = y;
        for (int i2 = 0; i2 < 12; i2++) {
            strArr2[i2] = ijf.a(this.a.getResources(), strArr2[i2], "%02d");
        }
        invalidate();
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void b() {
        this.a.setVisibility(0);
    }

    public final void c(int i) {
        d(i, true);
    }

    public final void d(int i, boolean z) {
        boolean z2 = i == 12;
        TimePickerView timePickerView = this.a;
        timePickerView.G0.o = z2;
        ijf ijf = this.b;
        ijf.w = i;
        int i2 = ijf.c;
        String[] strArr = z2 ? y : i2 == 1 ? x : w;
        int i3 = z2 ? ymc.material_minute_suffix : i2 == 1 ? ymc.material_hour_24h_suffix : ymc.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.H0;
        clockFaceView.N(i3, strArr);
        int i4 = 2;
        int i5 = (ijf.w == 10 && i2 == 1 && ijf.o >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.H0;
        clockHandView.G0 = i5;
        clockHandView.invalidate();
        timePickerView.G0.c(z2 ? this.c : this.o, z);
        boolean z3 = i == 12;
        Chip chip = timePickerView.E0;
        chip.setChecked(z3);
        int i6 = z3 ? 2 : 0;
        WeakHashMap weakHashMap = gag.a;
        chip.setAccessibilityLiveRegion(i6);
        boolean z4 = i == 10;
        Chip chip2 = timePickerView.F0;
        chip2.setChecked(z4);
        if (!z4) {
            i4 = 0;
        }
        chip2.setAccessibilityLiveRegion(i4);
        gag.j(chip2, new ljf(this, timePickerView.getContext(), ymc.material_hour_selection, 0));
        gag.j(chip, new ljf(this, timePickerView.getContext(), ymc.material_minute_selection, 1));
    }

    public final void e() {
        ijf ijf = this.b;
        int i = ijf.x;
        int b2 = ijf.b();
        int i2 = ijf.v;
        TimePickerView timePickerView = this.a;
        timePickerView.getClass();
        timePickerView.I0.b(i == 1 ? agc.material_clock_period_pm_button : agc.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(b2)});
        Chip chip = timePickerView.E0;
        if (!TextUtils.equals(chip.getText(), format)) {
            chip.setText(format);
        }
        Chip chip2 = timePickerView.F0;
        if (!TextUtils.equals(chip2.getText(), format2)) {
            chip2.setText(format2);
        }
    }

    public final void invalidate() {
        ijf ijf = this.b;
        this.o = (float) ((ijf.b() * 30) % 360);
        this.c = (float) (ijf.v * 6);
        d(ijf.w, false);
        e();
    }

    public final void j(float f, boolean z) {
        if (!this.v) {
            ijf ijf = this.b;
            int i = ijf.o;
            int i2 = ijf.v;
            int round = Math.round(f);
            int i3 = ijf.w;
            TimePickerView timePickerView = this.a;
            if (i3 == 12) {
                ijf.d((round + 3) / 6);
                this.c = (float) Math.floor((double) (ijf.v * 6));
            } else {
                int i4 = (round + 15) / 30;
                if (ijf.c == 1) {
                    i4 %= 12;
                    if (timePickerView.H0.H0.G0 == 2) {
                        i4 += 12;
                    }
                }
                ijf.c(i4);
                this.o = (float) ((ijf.b() * 30) % 360);
            }
            if (!z) {
                e();
                if (ijf.v != i2 || ijf.o != i) {
                    timePickerView.performHapticFeedback(4);
                }
            }
        }
    }
}
