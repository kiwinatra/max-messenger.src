package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* renamed from: ct6  reason: default package */
public abstract class ct6 {
    public final ht6 X;
    public final Context a;
    public final String b;
    public final ox0 c;
    public final pl o;
    public final bm v;
    public final Looper w;
    public final int x;
    public final mvg y;
    public final js9 z;

    public ct6(Context context, ox0 ox0, GoogleSignInOptions googleSignInOptions, js9 js9) {
        this(context, ox0, (pl) googleSignInOptions, new bt6(js9, Looper.getMainLooper()));
    }

    public final qpg a() {
        qpg qpg = new qpg(4);
        qpg.a = null;
        Set emptySet = Collections.emptySet();
        if (((ws) qpg.b) == null) {
            qpg.b = new ws(0);
        }
        ((ws) qpg.b).addAll(emptySet);
        Context context = this.a;
        qpg.o = context.getClass().getName();
        qpg.c = context.getPackageName();
        return qpg;
    }

    public final s7h b(f08 f08, int i) {
        vzg.n(f08, "Listener key cannot be null.");
        ht6 ht6 = this.X;
        ht6.getClass();
        qdf qdf = new qdf();
        ht6.e(qdf, i, this);
        vvg vvg = new vvg(new jwg(f08, qdf), ht6.z.get(), this);
        ws9 ws9 = ht6.v0;
        ws9.sendMessage(ws9.obtainMessage(13, vvg));
        return qdf.a;
    }

    public final s7h c(int i, jb7 jb7) {
        qdf qdf = new qdf();
        ht6 ht6 = this.X;
        ht6.getClass();
        ht6.e(qdf, jb7.b, this);
        vvg vvg = new vvg(new kwg(i, jb7, qdf, this.z), ht6.z.get(), this);
        ws9 ws9 = ht6.v0;
        ws9.sendMessage(ws9.obtainMessage(4, vvg));
        return qdf.a;
    }

    public ct6(Context context, ox0 ox0, pl plVar, bt6 bt6) {
        vzg.n(context, "Null context is not permitted.");
        vzg.n(ox0, "Api must not be null.");
        vzg.n(bt6, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        vzg.n(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String q = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = q;
        this.c = ox0;
        this.o = plVar;
        this.w = bt6.b;
        this.v = new bm(ox0, plVar, q);
        this.y = new mvg(this);
        ht6 f = ht6.f(applicationContext);
        this.X = f;
        this.x = f.y.getAndIncrement();
        this.z = bt6.a;
        ws9 ws9 = f.v0;
        ws9.sendMessage(ws9.obtainMessage(7, this));
    }
}
