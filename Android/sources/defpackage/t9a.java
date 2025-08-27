package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ru.ok.messages.calls.views.TextureViewRenderer;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: t9a  reason: default package */
public final class t9a implements zi6, fc3, ife, qk3, x33, sf6, d1g, sd8, wv9, y1c, x34, jaf {
    public static t9a b;
    public static final t9a c = new t9a(1);
    public static final t9a o = new t9a(2);
    public static final t9a v = new t9a(3);
    public static final t9a w = new t9a(4);
    public static final t9a x = new t9a(5);
    public static final t9a y = new t9a(6);
    public final /* synthetic */ int a;

    public /* synthetic */ t9a(int i) {
        this.a = i;
    }

    public static y33 b(y33 y33) {
        try {
            if (y33.m0(y33) && (y33.e0() instanceof CloseableStaticBitmap)) {
                return ((CloseableStaticBitmap) y33.e0()).cloneUnderlyingBitmapReference();
            }
            y33.U(y33);
            return null;
        } finally {
            y33.U(y33);
        }
    }

    public static z3a f(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o41 o41 = (o41) it.next();
            int i = jsg.a[o41.a.a.ordinal()];
            ln1 ln1 = o41.a;
            if (i == 1) {
                hashSet.add(ln1.b);
            } else if (i == 2) {
                hashSet2.add(ln1.b);
            } else if (i == 3) {
                hashSet3.add(ln1.b);
            }
        }
        return new z3a(15, hashSet2);
    }

    public static k00 h(l20 l20, long j, long j2, Uri uri) {
        if (l20.f()) {
            return new k00(l20, l20.b, j, j2, uri);
        } else if (!l20.i()) {
            return null;
        } else {
            return new k00(l20, l20.d, j, j2, uri);
        }
    }

    public void a(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) serializable;
        }
    }

    public void accept(Object obj) {
        List list = gvc.h;
        z68.f("gvc", "RECENT REMOVED update handle fail", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                fc1 fc1 = (fc1) obj;
                fc1.getClass();
                return new bi8(new ec1(fc1, d7d.a(0, "SELECT * FROM call_links"), 0));
            default:
                return ((OneMeRoomDatabase) obj).B();
        }
    }

    public void c() {
    }

    public Map d(Map map) {
        return map == null ? new HashMap() : map;
    }

    public void e(w6e w6e, Throwable th) {
        Object b2 = w6e.b();
        bg5.l(y33.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(w6e)), b2 == null ? null : b2.getClass().getName());
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(qp0.class, Executor.class)));
    }

    public int i(Object obj) {
        return ((e69) obj).V();
    }

    public ode j(k0d k0d) {
        return (ode) k0d.get(0);
    }

    public Object m(pf9 pf9) {
        return Long.valueOf(ryg.d0(pf9, 0));
    }

    public t9a(TextureViewRenderer textureViewRenderer, jaf jaf) {
        this.a = 20;
    }
}
