package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Lazy;

/* renamed from: fn4  reason: default package */
public abstract class fn4 {
    public static volatile kn4 f;
    public final Context a;
    public final jtb b;
    public final Lazy c;
    public PowerManager d;
    public final q3d e = new q3d(new nm1(26, this));

    public fn4(Context context, jtb jtb, Lazy lazy) {
        this.a = context;
        this.b = jtb;
        WeakReference weakReference = new WeakReference(this);
        cud cud = ((ltb) jtb).b;
        cud.n.add(new en4(this, weakReference));
        this.c = lazy;
    }

    public final String a() {
        ltb ltb = (ltb) this.b;
        String str = null;
        String string = ltb.a.g.getString("device.id", (String) null);
        if (cvg.A(string)) {
            z68.c("fn4", "New device id generated", new Object[0]);
            try {
                string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            } catch (Exception e2) {
                z68.f("fn4", "Can't get hardware device id", e2);
                string = null;
            }
            if (cvg.A(string)) {
                f8f f8f = (f8f) ((hn4) this).i.getValue();
                f8f.getClass();
                try {
                    str = f8f.i();
                } catch (Exception e3) {
                    z68.f(f8f.a, "error while get instance id", e3);
                }
                string = !cvg.A(str) ? str : UUID.randomUUID().toString();
            }
            ltb.a.l("device.id", string);
        }
        return string;
    }

    public final kn4 b() {
        if (f == null) {
            Context context = this.a;
            kn4.a.getClass();
            f = jn4.a(context);
        }
        return f;
    }

    public abstract boolean c();

    public final boolean d() {
        return ((udg) ((xq) this.c.getValue())).c();
    }

    public abstract void e();

    public abstract void f(String str);

    public abstract void g(String str);

    public abstract e0g h();
}
