package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Lazy;

/* renamed from: ym  reason: default package */
public final class ym extends ContextWrapper implements dh, hd3, xhf {
    public static ym v;
    public final Application a;
    public final Lazy b;
    public final Lazy c;
    public final fme[] o = {fsc.b};

    public ym(Application application, Lazy lazy, Lazy lazy2, vpa vpa) {
        super(application);
        kv0.f = vpa;
        this.b = lazy;
        this.a = application;
        this.c = lazy2;
        v = this;
    }

    public static id3 e() {
        return (id3) v.c.getValue();
    }

    public final scf K0() {
        return ((qra) e()).I().c();
    }

    public final z9f a() {
        return tr1.h((qra) ((id3) this.c.getValue()));
    }

    public final id3 b() {
        return (id3) this.c.getValue();
    }

    public final ltb c() {
        return (ltb) this.b.getValue();
    }

    public final ch d() {
        return ((qra) ((id3) this.c.getValue())).d();
    }

    public final Context getBaseContext() {
        return this.a.getBaseContext();
    }
}
