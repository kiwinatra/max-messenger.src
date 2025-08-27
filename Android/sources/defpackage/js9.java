package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import one.me.android.MainActivity;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;

/* renamed from: js9  reason: default package */
public final class js9 implements fc3, qk3, xxf, x66, pyc {
    public static final js9 a = new Object();
    public static final js9 b = new Object();
    public static Context c;
    public static final js9 o = new Object();
    public static final js9 v = new Object();
    public static final js9 w = new Object();
    public static final js9 x = new Object();

    public static final k4d a(k4d k4d) {
        if ((k4d != null ? k4d.x : null) == null) {
            return k4d;
        }
        j4d m = k4d.m();
        m.g = null;
        return m.a();
    }

    public static int b(View view) {
        return MathKt.roundToInt(((float) (iog.g(view, view.getRootWindowInsets()).a.f(2).d > 0 ? 52 : 60)) * vo4.c().getDisplayMetrics().density);
    }

    public static m15 h(int i) {
        Object obj;
        Iterator it = m15.z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m15) obj).a == i) {
                break;
            }
        }
        m15 m15 = (m15) obj;
        return m15 == null ? m15.CLASSIC : m15;
    }

    public static boolean i(String str) {
        return !StringsKt__StringsJVMKt.equals(HTTP.CONN_DIRECTIVE, str, true) && !StringsKt__StringsJVMKt.equals(HTTP.CONN_KEEP_ALIVE, str, true) && !StringsKt__StringsJVMKt.equals(AUTH.PROXY_AUTH, str, true) && !StringsKt__StringsJVMKt.equals(AUTH.PROXY_AUTH_RESP, str, true) && !StringsKt__StringsJVMKt.equals("TE", str, true) && !StringsKt__StringsJVMKt.equals("Trailers", str, true) && !StringsKt__StringsJVMKt.equals(HTTP.TRANSFER_ENCODING, str, true) && !StringsKt__StringsJVMKt.equals("Upgrade", str, true);
    }

    public static boolean k(vag vag) {
        return vag == vag.b;
    }

    public static void l(Context context, Uri uri, z0b z0b, iz1 iz1, int i) {
        int i2 = MainActivity.E0;
        Uri uri2 = null;
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            z0b = null;
        }
        Function1 function1 = iz1;
        if ((i & 8) != 0) {
            function1 = new wg7(10);
        }
        Intent intent = new Intent(context, MainActivity.class);
        if (uri != null) {
            uri2 = uri;
        }
        intent.putExtra("deep_link", uri2);
        intent.putExtra("snackbar", z0b);
        function1.invoke(intent);
        context.startActivity(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(int r8, byte[] r9, int r10) {
        /*
        L_0x0000:
            if (r8 >= r10) goto L_0x0009
            byte r0 = r9[r8]
            if (r0 < 0) goto L_0x0009
            int r8 = r8 + 1
            goto L_0x0000
        L_0x0009:
            r0 = 0
            if (r8 < r10) goto L_0x000f
        L_0x000c:
            r2 = r0
            goto L_0x0079
        L_0x000f:
            if (r8 < r10) goto L_0x0012
            goto L_0x000c
        L_0x0012:
            int r1 = r8 + 1
            byte r2 = r9[r8]
            if (r2 >= 0) goto L_0x007e
            r3 = -1
            r4 = -32
            r5 = -65
            if (r2 >= r4) goto L_0x002e
            if (r1 < r10) goto L_0x0022
            goto L_0x0079
        L_0x0022:
            r4 = -62
            if (r2 < r4) goto L_0x002c
            int r8 = r8 + 2
            byte r1 = r9[r1]
            if (r1 <= r5) goto L_0x000f
        L_0x002c:
            r2 = r3
            goto L_0x0079
        L_0x002e:
            r6 = -16
            if (r2 >= r6) goto L_0x0054
            int r6 = r10 + -1
            if (r1 < r6) goto L_0x003b
            int r2 = defpackage.r3h.a(r1, r9, r10)
            goto L_0x0079
        L_0x003b:
            int r6 = r8 + 2
            byte r1 = r9[r1]
            if (r1 > r5) goto L_0x002c
            r7 = -96
            if (r2 != r4) goto L_0x0047
            if (r1 < r7) goto L_0x002c
        L_0x0047:
            r4 = -19
            if (r2 != r4) goto L_0x004d
            if (r1 >= r7) goto L_0x002c
        L_0x004d:
            int r8 = r8 + 3
            byte r1 = r9[r6]
            if (r1 <= r5) goto L_0x000f
            goto L_0x002c
        L_0x0054:
            int r4 = r10 + -2
            if (r1 < r4) goto L_0x005d
            int r2 = defpackage.r3h.a(r1, r9, r10)
            goto L_0x0079
        L_0x005d:
            int r4 = r8 + 2
            byte r1 = r9[r1]
            if (r1 > r5) goto L_0x002c
            int r2 = r2 << 28
            int r1 = r1 + 112
            int r1 = r1 + r2
            int r1 = r1 >> 30
            if (r1 != 0) goto L_0x002c
            int r1 = r8 + 3
            byte r2 = r9[r4]
            if (r2 > r5) goto L_0x002c
            int r8 = r8 + 4
            byte r1 = r9[r1]
            if (r1 <= r5) goto L_0x000f
            goto L_0x002c
        L_0x0079:
            if (r2 != 0) goto L_0x007d
            r8 = 1
            return r8
        L_0x007d:
            return r0
        L_0x007e:
            r8 = r1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js9.n(int, byte[], int):boolean");
    }

    public void accept(Object obj) {
        List list = gvc.h;
        z68.f("gvc", "Can't add to recents", (Throwable) obj);
    }

    public Widget c(String str, b bVar) {
        return new ChatsListWidget(str);
    }

    public m58 d(ea6 ea6) {
        String str = ea6.n;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new vp(0);
                case 1:
                    return new i77();
                case 2:
                    return new s77((p77) null);
                case 3:
                    return new vp(1);
                case 4:
                    return new ahe();
            }
        }
        throw new IllegalArgumentException(a81.m("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public fu4 e(Context context) {
        if (fu4.l == null) {
            synchronized (this) {
                try {
                    if (fu4.l == null) {
                        fu4.l = new fu4(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fu4.l;
    }

    public k2b f(View view) {
        return e(view.getContext()).f();
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(bf0.class, Executor.class)));
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        if (!(unsatisfiedLinkError instanceof mfe) || (unsatisfiedLinkError instanceof lfe)) {
            return false;
        }
        String str = ((mfe) unsatisfiedLinkError).a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (zvf zvf : nfeArr) {
            if (zvf instanceof zvf) {
                zvf zvf2 = zvf;
                if (!(zvf2 instanceof cg0)) {
                    try {
                        zvf2.getClass();
                        zvf2.d(2);
                    } catch (Exception unused) {
                        zvf2.getClass();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean m(ea6 ea6) {
        String str = ea6.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
