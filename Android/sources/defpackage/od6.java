package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;

/* renamed from: od6  reason: default package */
public final class od6 implements tw6, odd, hbg {
    public final a a;
    public final gbg b;
    public final Runnable c;
    public dbg o;
    public lv7 v = null;
    public ndd w = null;

    public od6(a aVar, gbg gbg, y86 y86) {
        this.a = aVar;
        this.b = gbg;
        this.c = y86;
    }

    public final void a(hu7 hu7) {
        this.v.e(hu7);
    }

    public final void b() {
        if (this.v == null) {
            this.v = new lv7(this);
            ndd ndd = new ndd(this);
            this.w = ndd;
            ndd.a();
            this.c.run();
        }
    }

    public final y34 getDefaultViewModelCreationExtras() {
        Application application;
        a aVar = this.a;
        Context applicationContext = aVar.G2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        zy9 zy9 = new zy9(0);
        if (application != null) {
            zy9.a(cbg.d, application);
        }
        zy9.a(b59.o, aVar);
        zy9.a(b59.p, this);
        Bundle bundle = aVar.x;
        if (bundle != null) {
            zy9.a(b59.q, bundle);
        }
        return zy9;
    }

    public final dbg getDefaultViewModelProviderFactory() {
        Application application;
        a aVar = this.a;
        dbg defaultViewModelProviderFactory = aVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(aVar.e1)) {
            this.o = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.o == null) {
            Context applicationContext = aVar.G2().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.o = new pdd(application, aVar, aVar.x);
        }
        return this.o;
    }

    public final ju7 getLifecycle() {
        b();
        return this.v;
    }

    public final mdd getSavedStateRegistry() {
        b();
        return this.w.b;
    }

    public final gbg getViewModelStore() {
        b();
        return this.b;
    }
}
