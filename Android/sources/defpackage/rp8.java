package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: rp8  reason: default package */
public final class rp8 implements IBinder.DeathRecipient {
    public final ro8 a = new ro8(this);
    public ge4 b;
    public to8 c;
    public final Handler d;
    public final /* synthetic */ tp8 e;

    public rp8(tp8 tp8, Looper looper) {
        this.e = tp8;
        this.d = new Handler(looper, new xp4(5, this));
    }

    public final void a(vo8 vo8) {
        tp8 tp8 = this.e;
        sp8 sp8 = tp8.l;
        int i = sp8.g;
        vo8 vo82 = vo8;
        tp8.l = new sp8(vo82, sp8.b, sp8.c, sp8.d, sp8.e, sp8.f, i, sp8.h);
        k();
    }

    public final void b(boolean z) {
        qo8 qo8 = this.e.b;
        qo8.getClass();
        n79.n(Looper.myLooper() == qo8.v.getLooper());
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        new yvd("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY);
        qo8.o.getClass();
        oo8.a();
    }

    public final void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public final void c(Bundle bundle) {
        tp8 tp8 = this.e;
        ni3 ni3 = tp8.m;
        tp8.m = new ni3((ppb) ni3.a, (zvd) ni3.b, (pob) ni3.c, (tb7) ni3.d, bundle, (iwd) null);
        qo8 qo8 = tp8.b;
        qo8.getClass();
        n79.n(Looper.myLooper() == qo8.v.getLooper());
        qo8 qo82 = tp8.b;
        qo8.o.getClass();
    }

    public final void d(vs8 vs8) {
        tp8 tp8 = this.e;
        sp8 sp8 = tp8.l;
        int i = sp8.g;
        vs8 vs82 = vs8;
        tp8.l = new sp8(sp8.a, sp8.b, vs82, sp8.d, sp8.e, sp8.f, i, sp8.h);
        k();
    }

    public final void e(mob mob) {
        tp8 tp8 = this.e;
        sp8 sp8 = tp8.l;
        mob J0 = tp8.J0(mob);
        int i = sp8.g;
        tp8.l = new sp8(sp8.a, J0, sp8.c, sp8.d, sp8.e, sp8.f, i, sp8.h);
        k();
    }

    public final void f(List list) {
        tp8 tp8 = this.e;
        sp8 sp8 = tp8.l;
        List I0 = tp8.I0(list);
        int i = sp8.g;
        tp8.l = new sp8(sp8.a, sp8.b, sp8.c, I0, sp8.e, sp8.f, i, sp8.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        tp8 tp8 = this.e;
        sp8 sp8 = tp8.l;
        int i = sp8.g;
        CharSequence charSequence2 = charSequence;
        tp8.l = new sp8(sp8.a, sp8.b, sp8.c, sp8.d, charSequence2, sp8.f, i, sp8.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str != null) {
            qo8 qo8 = this.e.b;
            qo8.getClass();
            n79.n(Looper.myLooper() == qo8.v.getLooper());
            new yvd(str, Bundle.EMPTY);
            qo8.o.getClass();
            oo8.a();
        }
    }

    public final void i(int i, Object obj, Bundle bundle) {
        ge4 ge4 = this.b;
        if (ge4 != null) {
            Message obtainMessage = ge4.obtainMessage(i, obj);
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            obtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler == null) {
            ge4 ge4 = this.b;
            if (ge4 != null) {
                ge4.b = false;
                ge4.removeCallbacksAndMessages((Object) null);
                this.b = null;
                return;
            }
            return;
        }
        ge4 ge42 = new ge4(this, handler.getLooper());
        this.b = ge42;
        ge42.b = true;
    }

    public final void k() {
        Handler handler = this.d;
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 500);
        }
    }
}
