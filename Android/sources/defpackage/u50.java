package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: u50  reason: default package */
public final class u50 implements p40 {
    public final dy9 a;
    public final p9c b;
    public final Lazy c;
    public final Lazy o;
    public final q40 v;
    public boolean w;
    public boolean x;
    public final s50 y = new s50(this);
    public final Lazy z;

    public u50(Context context, dy9 dy9, p9c p9c) {
        this.a = dy9;
        this.b = p9c;
        Lazy h = v50.a.getAccessor().h(dp1.class);
        this.c = h;
        this.o = LazyKt.lazy(new v4(context, 4));
        this.v = new q40(context, this);
        e4 e4Var = new e4(2, (Object) this);
        Lazy lazy = LazyKt.lazy(new j6(12, this));
        this.z = lazy;
        ((xy9) dy9).e(e4Var);
        ((mp1) ((dp1) h.getValue())).I.add((t50) lazy.getValue());
    }

    public static final boolean c(u50 u50) {
        for (AudioDeviceInfo type : ((AudioManager) u50.o.getValue()).getDevices(2)) {
            int type2 = type.getType();
            if (type2 == 3 || type2 == 4 || type2 == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void d(u50 u50) {
        boolean z2 = ((xy9) u50.a).z;
        q40 q40 = u50.v;
        if (z2) {
            q40.v(1);
            u50.e();
            return;
        }
        q40.u();
        if (u50.w) {
            u50.w = false;
            p9c p9c = u50.b;
            p9c.b();
            p9c.h.remove(u50.y);
        }
    }

    public final boolean a() {
        return ((xy9) this.a).z;
    }

    public final float b() {
        return ((xy9) this.a).B;
    }

    public final void e() {
        if (this.x && !this.w && ((xy9) this.a).z) {
            this.w = true;
            p9c p9c = this.b;
            p9c.a();
            p9c.h.add(this.y);
        }
    }

    public final void g(float f) {
    }

    public final void onAudioFocusChange(int i) {
        this.v.t(i);
    }

    public final void pause() {
        dy9 dy9 = this.a;
        if (!dy9.b()) {
            ((xy9) dy9).q();
        }
    }

    public final void play() {
        dy9 dy9 = this.a;
        if (!dy9.b()) {
            this.v.v(1);
            ((xy9) dy9).r();
        }
    }
}
