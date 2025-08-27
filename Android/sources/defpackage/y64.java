package defpackage;

import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.ParserException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: y64  reason: default package */
public abstract class y64 {
    public static final Object a = new Object();
    public static final frg b = new frg("SYSTRACE", 2);
    public static final usd[] c = new usd[0];
    public static final tj5[] d = {new tj5("name_ulr_private", 1), new tj5("name_sleep_segment_request", 1), new tj5("get_last_activity_feature_id", 1), new tj5("support_context_feature_id", 1), new tj5("get_current_location", 2), new tj5("get_last_location_with_request", 1), new tj5("set_mock_mode_with_callback", 1), new tj5("set_mock_location_with_callback", 1), new tj5("inject_location_with_callback", 1), new tj5("location_updates_with_callback", 1), new tj5("use_safe_parcelable_in_intents", 1), new tj5("flp_debug_updates", 1), new tj5("google_location_accuracy_enabled", 1), new tj5("geofences_with_callback", 1), new tj5("location_enabled", 1)};
    public static final /* synthetic */ int e = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A(android.content.Context r8) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0063 }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0018:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            r6 = 1
            if (r5 == r6) goto L_0x0044
            r6 = 3
            if (r5 != r6) goto L_0x002b
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r7 <= r4) goto L_0x0044
            goto L_0x002b
        L_0x0029:
            r8 = move-exception
            goto L_0x004c
        L_0x002b:
            if (r5 == r6) goto L_0x0018
            r6 = 4
            if (r5 != r6) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0044:
            if (r2 == 0) goto L_0x0055
        L_0x0046:
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x004a:
            r8 = move-exception
            goto L_0x0065
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x0052:
            if (r2 == 0) goto L_0x0055
            goto L_0x0046
        L_0x0055:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch:{ all -> 0x004a }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.A(android.content.Context):java.lang.String");
    }

    public static mq4 B(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return C(0, runnable);
        }
        runnable.run();
        return p45.a;
    }

    public static mq4 C(long j, Runnable runnable) {
        return qe.a().d(runnable, j, TimeUnit.MILLISECONDS);
    }

    public static final void F(rjf rjf, long j) {
        if (rjf instanceof sjf) {
            sjf sjf = (sjf) rjf;
            synchronized (sjf) {
                if (j != 0) {
                    if (sjf.a == null) {
                        sjf.a = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j));
                        sjf.b = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            }
        }
    }

    public static p01 G(int i, gf4 gf4, g1g g1g) {
        p01 b2 = p01.b(gf4, g1g);
        while (true) {
            int i2 = b2.b;
            if (i2 == i) {
                return b2;
            }
            long j = b2.c + 8;
            if (j <= 2147483647L) {
                gf4.z((int) j);
                b2 = p01.b(gf4, g1g);
            } else {
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw ParserException.c(sb.toString());
            }
        }
    }

    public static int H(k2b k2b, zpa zpa, xpa xpa, boolean z) {
        if (z) {
            int ordinal = zpa.ordinal();
            if (ordinal == 0) {
                int ordinal2 = xpa.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    k2b.getText().getClass();
                } else if (ordinal2 == 2) {
                    return k2b.getText().a;
                } else {
                    if (ordinal2 == 3) {
                        k2b.getText().getClass();
                    } else if (ordinal2 == 4) {
                        k2b.getText().getClass();
                        return -15987442;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                int ordinal3 = xpa.ordinal();
                if (ordinal3 == 0) {
                    k2b.getText().getClass();
                    return -16745729;
                } else if (ordinal3 == 1) {
                    return k2b.getText().b;
                } else {
                    if (ordinal3 == 2) {
                        return k2b.getText().e;
                    }
                    if (ordinal3 == 3) {
                        return k2b.getText().c;
                    }
                    if (ordinal3 == 4) {
                        k2b.getText().getClass();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal4 = zpa.ordinal();
            if (ordinal4 == 0) {
                int ordinal5 = xpa.ordinal();
                if (ordinal5 == 0 || ordinal5 == 1) {
                    return k2b.b().c.e;
                }
                if (ordinal5 == 2) {
                    return k2b.b().c.d;
                }
                if (ordinal5 == 3) {
                    return k2b.b().c.e;
                }
                if (ordinal5 == 4) {
                    return k2b.b().c.i;
                }
                throw new NoWhenBranchMatchedException();
            } else if (ordinal4 == 1 || ordinal4 == 2 || ordinal4 == 3) {
                int ordinal6 = xpa.ordinal();
                if (ordinal6 == 0) {
                    k2b.getText().getClass();
                    return -16745729;
                } else if (ordinal6 == 1) {
                    return k2b.getText().b;
                } else {
                    if (ordinal6 == 2) {
                        return k2b.getText().e;
                    }
                    if (ordinal6 == 3) {
                        return k2b.getText().c;
                    }
                    if (ordinal6 == 4) {
                        k2b.getText().getClass();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return -1;
    }

    public static void I(dac dac) {
        dac.z(300, TimeUnit.MILLISECONDS).s(qe.a()).a(new or7(new qbb(21), m58.g, m58.e));
    }

    public static final rh0 J(xs3 xs3) {
        int ordinal = xs3.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return rh0.CONTACTS;
        }
        if (ordinal == 3 || ordinal == 4) {
            return rh0.PUSH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String K(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = t0g.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void L(qrd qrd, Object obj) {
        Object s = qrd.s(obj);
        if (!(s instanceof d22)) {
            Unit unit = (Unit) s;
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        Object obj2 = ((e22) ev0.C(EmptyCoroutineContext.INSTANCE, new g22(qrd, obj, (Continuation) null))).a;
    }

    public static final void M(fwf fwf) {
        fwf.c(oa4.class, new xoa(9));
        fwf.e(k73.class, new fm8(22));
        Class<dn4> cls = dn4.class;
        fwf.c(cls, new xoa(10));
        fwf.e(r1c.class, new fm8(23));
        fwf.e(qwb.class, new fm8(24));
        fwf.e(lb.class, new fm8(25));
        fwf.e(rwb.class, new fm8(26));
        fwf.c(cls, new xoa(11));
        fwf.c(cls, new xoa(12));
    }

    public static void O(String str, Writer writer) {
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"' || charAt <= 31) {
                if (i2 > i) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(92);
                if (charAt == 12) {
                    writer.write(HttpStatus.SC_PROCESSING);
                } else if (charAt != 13) {
                    if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                writer.write(98);
                                break;
                            case 9:
                                writer.write(116);
                                break;
                            case 10:
                                writer.write(110);
                                break;
                            default:
                                writer.write(117);
                                writer.write(bs0.I((charAt >> 12) & 15));
                                writer.write(bs0.I((charAt >> 8) & 15));
                                writer.write(bs0.I((charAt >> 4) & 15));
                                writer.write(bs0.I(charAt & 15));
                                break;
                        }
                    } else {
                        writer.write(charAt);
                    }
                } else {
                    writer.write(114);
                }
                i = i2 + 1;
            }
        }
        if (length > i) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public static String P(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String q = rae.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(q), e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + q.length() + 8 + 1);
                    sb.append("<");
                    sb.append(q);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(">");
                    str2 = sb.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb2.append(str, i3, str.length());
            } else {
                sb2.append(str, i3, indexOf);
                sb2.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb2.append(str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final boolean a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) CollectionsKt___CollectionsKt.joinToString$default(uri.getPathSegments(), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), (Object) CollectionsKt___CollectionsKt.joinToString$default(uri2.getPathSegments(), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }

    public static zv0 b(k2b k2b, zpa zpa, xpa xpa, boolean z) {
        if (z) {
            int ordinal = zpa.ordinal();
            if (ordinal == 0) {
                int ordinal2 = xpa.ordinal();
                if (ordinal2 == 0) {
                    k2b.c().a.getClass();
                    k2b.b().a.getClass();
                    return new zv0(-16751924, -16745729);
                } else if (ordinal2 == 1) {
                    return new zv0(k2b.b().a.a, Integer.valueOf(k2b.c().a.e));
                } else if (ordinal2 == 2) {
                    return new zv0(k2b.b().a.b, Integer.valueOf(k2b.c().a.f));
                } else if (ordinal2 == 3) {
                    return new zv0(k2b.b().a.d, Integer.valueOf(k2b.c().a.j));
                } else if (ordinal2 == 4) {
                    k2b.c().a.getClass();
                    k2b.b().a.getClass();
                    return new zv0(-1907998, -1);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal == 1) {
                return new zv0(k2b.b().a.c, Integer.valueOf(k2b.c().a.g));
            } else if (ordinal == 2 || ordinal == 3) {
                return new zv0(k2b.b().a.f, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal3 = zpa.ordinal();
            if (ordinal3 == 0) {
                int ordinal4 = xpa.ordinal();
                if (ordinal4 == 0) {
                    return new zv0(k2b.b().a.r, Integer.valueOf(k2b.b().a.r));
                } else if (ordinal4 == 1) {
                    return new zv0(k2b.b().a.j, Integer.valueOf(k2b.b().a.j));
                } else if (ordinal4 == 2) {
                    return new zv0(k2b.b().a.k, Integer.valueOf(k2b.b().a.k));
                } else if (ordinal4 == 3) {
                    return new zv0(k2b.b().a.n, Integer.valueOf(k2b.b().a.n));
                } else if (ordinal4 == 4) {
                    return new zv0(k2b.b().a.i, Integer.valueOf(k2b.b().a.i));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal3 == 1) {
                return new zv0(k2b.b().a.l, Integer.valueOf(k2b.b().a.l));
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                return new zv0(k2b.b().a.f, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static Uri c(String str, String str2, String str3) {
        Uri.Builder encodedPath = new Uri.Builder().scheme(str2).encodedAuthority(str3).encodedPath(StringsKt__StringsKt.substringBefore$default(str, "?", (String) null, 2, (Object) null).toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        String G = StringsKt__StringsKt.substringAfter(str, "?", "");
        int length = G.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (G.charAt(i2) == '=') {
                sb.append(StringsKt.substring(G, RangesKt.until(i, i2)).toLowerCase(Locale.ROOT));
            } else if (G.charAt(i2) == '&') {
                sb.append(StringsKt.substring(G, RangesKt.until(i, i2)));
            } else {
                if (i2 == G.length() - 1) {
                    sb.append(StringsKt.substring(G, RangesKt.until(i, i2 + 1)));
                }
            }
            i = i2;
        }
        return encodedPath.encodedQuery(sb.toString()).build();
    }

    public static float d(aqa aqa) {
        float f;
        float f2;
        int ordinal = aqa.ordinal();
        if (ordinal == 0) {
            f = vo4.c().getDisplayMetrics().density;
            f2 = 10.0f;
        } else if (ordinal == 1) {
            f = vo4.c().getDisplayMetrics().density;
            f2 = 12.0f;
        } else if (ordinal == 2) {
            f = vo4.c().getDisplayMetrics().density;
            f2 = 16.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f * f2;
    }

    public static final Set e(usd usd) {
        if (usd instanceof iy0) {
            return ((iy0) usd).b();
        }
        HashSet hashSet = new HashSet(usd.e());
        int e2 = usd.e();
        for (int i = 0; i < e2; i++) {
            hashSet.add(usd.f(i));
        }
        return hashSet;
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean h(gf4 gf4) {
        g1g g1g = new g1g(8);
        int i = p01.b(gf4, g1g).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        gf4.q(g1g.a, 0, 4, false);
        g1g.H(0);
        return g1g.h() == 1463899717;
    }

    public static void i(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void l(View view, x6 x6Var) {
        new gb3(10, view).i(200, TimeUnit.MILLISECONDS).s(qe.a()).a(new or7(new ibd(x6Var, 3), m58.g, m58.e));
    }

    public static or7 m(View view, long j, x6 x6Var) {
        lja s = new gb3(10, view).z(j, TimeUnit.MILLISECONDS).s(qe.a());
        or7 or7 = new or7(new ibd(x6Var, 2), new qbb(20), m58.e);
        s.a(or7);
        return or7;
    }

    public static void n(View view, x6 x6Var) {
        m(view, 300, x6Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (defpackage.usd[]) r1.toArray(new defpackage.usd[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.usd[] o(java.util.List r1) {
        /*
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x001b
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            usd[] r0 = new defpackage.usd[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            usd[] r1 = (defpackage.usd[]) r1
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            usd[] r1 = c
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.o(java.util.List):usd[]");
    }

    public static String p(String str) {
        StringBuilder sb = new StringBuilder(g63.f(g63.f(5, str), str));
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static void q(Object obj, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    public static final boolean r(int i, int i2) {
        return i == i2;
    }

    public static final ConversationEndReason s(y9e y9e) {
        switch (y9e == null ? -1 : p9e.$EnumSwitchMapping$0[y9e.ordinal()]) {
            case -1:
                return null;
            case 1:
                return ConversationEndReason.Canceled.INSTANCE;
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new RuntimeException("Closed by the server error"));
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String u(String str) {
        return "TRuntime.".concat(str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, we8] */
    public static qf9 w(sf9 sf9) {
        xc9 xc9;
        ? obj = new Object();
        ur1 ur1 = sf9.a;
        p4g p4g = null;
        if (ur1 == null) {
            xc9 = null;
        } else {
            xc9 = new xc9(ur1.a, (String) ur1.c, ur1.b);
        }
        obj.c = xc9;
        obj.a = sf9.c;
        obj.b = sf9.b;
        obj.d = sf9.d;
        i20 i20 = sf9.e;
        if (i20 != null) {
            i20 i202 = new i20(1);
            i202.a = i20.a;
            i202.c = i20.c;
            i202.b = i20.b;
            i202.d = i20.d;
            p4g = i202.a();
        }
        obj.e = p4g;
        return new qf9(obj);
    }

    public static String x(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int y(aqa aqa) {
        int ordinal = aqa.ordinal();
        if (ordinal == 0) {
            return MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:23|24)|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void z(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r5 = move-exception
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch:{ FileNotFoundException -> 0x004e }
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x0012 }
            r2 = 0
            r1.setOutput(r5, r2)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.startDocument(r3, r4)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.endDocument()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            if (r5 == 0) goto L_0x004c
        L_0x003e:
            r5.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004c
        L_0x0042:
            r6 = move-exception
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r6     // Catch:{ all -> 0x0012 }
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x003e
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.z(android.content.Context, java.lang.String):void");
    }

    public abstract void D(boolean z);

    public abstract void E(boolean z);

    public abstract TransformationMethod N(TransformationMethod transformationMethod);

    public abstract InputFilter[] t(InputFilter[] inputFilterArr);

    public abstract boolean v();
}
