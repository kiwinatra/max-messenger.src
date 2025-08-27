package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.settings.FrgAppearanceSettings;

/* renamed from: et3  reason: default package */
public final /* synthetic */ class et3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ et3(pzc pzc, zs3 zs3, boolean z, int i) {
        this.a = i;
        this.o = pzc;
        this.b = zs3;
        this.c = z;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ft3 ft3 = (ft3) this.o;
                ys3 ys3 = ft3.D0;
                zs3 zs3 = (zs3) this.b;
                ys3.f(zs3.a);
                ft3.E0.a(y64.J(zs3.a), ph0.SMALL, this.c ? oh0.CAROUSEL : oh0.BANNER);
                return;
            case 1:
                tt3 tt3 = (tt3) this.o;
                ys3 ys32 = tt3.D0;
                zs3 zs32 = (zs3) this.b;
                ys32.f(zs32.a);
                tt3.E0.a(y64.J(zs32.a), ph0.MEDIUM, this.c ? oh0.CAROUSEL : oh0.BANNER);
                return;
            case 2:
                FrgAppearanceSettings frgAppearanceSettings = (FrgAppearanceSettings) this.o;
                frgAppearanceSettings.getClass();
                fu4 e = fu4.k.e(view.getContext());
                i9a i9a = (i9a) ((l15) e.g).o();
                boolean z = this.c;
                MaterialTimePicker materialTimePicker = (MaterialTimePicker) this.b;
                if (z) {
                    hq hqVar = frgAppearanceSettings.Q1;
                    ijf ijf = materialTimePicker.V1;
                    int i = ijf.v;
                    hqVar.j(ijf.o % 24, "app.night.mode.start.h");
                    hqVar.j(i, "app.night.mode.start.m");
                    long j = i9a.c;
                    TimeUnit timeUnit = (j & 1) == 1 ? TimeUnit.MILLISECONDS : TimeUnit.NANOSECONDS;
                    long j2 = j >> 1;
                    ijf ijf2 = materialTimePicker.V1;
                    e.j(new i9a(ijf2.o % 24, ijf2.v, (int) timeUnit.toHours(j2), ((int) timeUnit.toMinutes(j2)) % 60));
                } else {
                    long j3 = i9a.b;
                    TimeUnit timeUnit2 = (j3 & 1) == 1 ? TimeUnit.MILLISECONDS : TimeUnit.NANOSECONDS;
                    long j4 = j3 >> 1;
                    hq hqVar2 = frgAppearanceSettings.Q1;
                    ijf ijf3 = materialTimePicker.V1;
                    int i2 = ijf3.v;
                    hqVar2.j(ijf3.o % 24, "app.night.mode.end.h");
                    hqVar2.j(i2, "app.night.mode.end.m");
                    ijf ijf4 = materialTimePicker.V1;
                    e.j(new i9a((int) timeUnit2.toHours(j4), ((int) timeUnit2.toMinutes(j4)) % 60, ijf4.o % 24, ijf4.v));
                }
                frgAppearanceSettings.p3();
                frgAppearanceSettings.S1.j();
                frgAppearanceSettings.S1.b(true);
                return;
            default:
                t5 a2 = t5.a(((long[]) this.o)[0]);
                a2.e = true;
                a2.k = this.c ? uk2.DEFAULT : uk2.SCHEDULED_SEND;
                q5.T((Activity) this.b, a2);
                return;
        }
    }

    public /* synthetic */ et3(FrgAppearanceSettings frgAppearanceSettings, boolean z, MaterialTimePicker materialTimePicker) {
        this.a = 2;
        this.o = frgAppearanceSettings;
        this.c = z;
        this.b = materialTimePicker;
    }

    public /* synthetic */ et3(long[] jArr, Activity activity) {
        this.a = 3;
        this.o = jArr;
        this.c = true;
        this.b = activity;
    }
}
