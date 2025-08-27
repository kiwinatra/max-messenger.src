package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ryg  reason: default package */
public abstract class ryg {
    public static p3a b;
    public static final bpa c = new bpa(10, "REMOVED_TASK");
    public static final bpa d = new bpa(10, "CLOSED_EMPTY");
    public static final ed7 e = new ed7(14);
    public static Integer f;
    public static Integer g;
    public static Integer h;
    public static final /* synthetic */ int i = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ ryg(int i2) {
        this.a = i2;
    }

    public static int A(Context context) {
        if (f == null) {
            ((qra) ym.e()).n().getClass();
            Size k = hn4.k(context);
            f = Integer.valueOf(Math.max(k.getWidth(), k.getHeight()));
        }
        return f.intValue();
    }

    public static int B(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static ky6 C() {
        if (ky6.c != null) {
            return ky6.c;
        }
        synchronized (ky6.class) {
            try {
                if (ky6.c == null) {
                    ky6.c = new ky6(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ky6.c;
    }

    public static void D(Activity activity) {
        n2d.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new n2d());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static xxd E(Set set, dc7 dc7) {
        b0h.h(set, "set1");
        b0h.h(dc7, "set2");
        return new xxd(set, dc7);
    }

    public static il7 F() {
        if (il7.c != null) {
            return il7.c;
        }
        synchronized (il7.class) {
            try {
                if (il7.c == null) {
                    il7.c = new il7();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return il7.c;
    }

    public static ew6 G() {
        if (ld8.a != null) {
            return ld8.a;
        }
        synchronized (ld8.class) {
            try {
                if (ld8.a == null) {
                    ld8.a = new ew6(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ld8.a;
    }

    public static ea6[] H(ArrayList arrayList) {
        int size = arrayList.size();
        ea6[] ea6Arr = new ea6[size];
        int i2 = 0;
        while (i2 < size) {
            ea6 ea6 = ((kq8) arrayList.get(i2)).a;
            if (ea6 != null) {
                ea6Arr[i2] = ea6;
                i2++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return ea6Arr;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [dc2, java.lang.Object] */
    public static ec2 I(kc2 kc2) {
        ec2 ec2 = ec2.i;
        ? obj = new Object();
        lc2 lc2 = kc2.a;
        obj.a = lc2.a;
        obj.b = lc2.b;
        obj.c = lc2.c;
        obj.d = kc2.b;
        obj.e = kc2.c;
        obj.f = kc2.d;
        obj.g = kc2.e;
        obj.h = kc2.f;
        return new ec2(obj);
    }

    public static qq3 J(tq3 tq3) {
        vy a2 = qq3.a(new s58(tq3.b, tq3.c, tq3.d, tq3.e, tq3.f, tq3.g));
        ap0 ap0 = tq3.a;
        a2.b = ap0.b;
        a2.c = ap0.c;
        a2.o = tq3.h;
        return a2.d();
    }

    public static Set K() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static void L(Bundle bundle, HashSet hashSet) {
        List list;
        z68.c("ryg", "onCreate", new Object[0]);
        if (bundle.containsKey("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS") && (list = (List) bundle.get("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS")) != null) {
            hashSet.clear();
            hashSet.addAll(list);
        }
    }

    public static void O(gd9 gd9, Map map) {
        gd9.m(map.size());
        for (Map.Entry entry : map.entrySet()) {
            P(gd9, entry.getKey());
            P(gd9, entry.getValue());
        }
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [qae, java.util.Map] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void P(defpackage.gd9 r13, java.lang.Object r14) {
        /*
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto L_0x000b
            java.lang.String r14 = (java.lang.String) r14
            r13.o(r14)
            goto L_0x02f0
        L_0x000b:
            boolean r0 = r14 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r13.g(r14)
            goto L_0x02f0
        L_0x001a:
            boolean r0 = r14 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0029
            java.lang.Long r14 = (java.lang.Long) r14
            long r0 = r14.longValue()
            r13.j(r0)
            goto L_0x02f0
        L_0x0029:
            boolean r0 = r14 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0053
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            r0 = 5
            r13.b(r0)
            org.msgpack.core.buffer.MessageBuffer r0 = r13.v
            int r1 = r13.w
            int r2 = r1 + 1
            r13.w = r2
            r2 = -54
            r0.putByte(r1, r2)
            org.msgpack.core.buffer.MessageBuffer r0 = r13.v
            int r1 = r13.w
            r0.putFloat(r1, r14)
            int r14 = r13.w
            int r14 = r14 + 4
            r13.w = r14
            goto L_0x02f0
        L_0x0053:
            boolean r0 = r14 instanceof java.lang.Double
            if (r0 == 0) goto L_0x007e
            java.lang.Double r14 = (java.lang.Double) r14
            double r0 = r14.doubleValue()
            r14 = 9
            r13.b(r14)
            org.msgpack.core.buffer.MessageBuffer r14 = r13.v
            int r2 = r13.w
            int r3 = r2 + 1
            r13.w = r3
            r3 = -53
            r14.putByte(r2, r3)
            org.msgpack.core.buffer.MessageBuffer r14 = r13.v
            int r2 = r13.w
            r14.putDouble(r2, r0)
            int r14 = r13.w
            int r14 = r14 + 8
            r13.w = r14
            goto L_0x02f0
        L_0x007e:
            boolean r0 = r14 instanceof java.lang.Short
            r1 = 256(0x100, float:3.59E-43)
            r2 = -48
            r3 = -32
            if (r0 == 0) goto L_0x00bc
            java.lang.Short r14 = (java.lang.Short) r14
            short r14 = r14.shortValue()
            if (r14 >= r3) goto L_0x00a1
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r14 >= r0) goto L_0x009b
            r0 = -47
            r13.p0(r0, r14)
            goto L_0x02f0
        L_0x009b:
            byte r14 = (byte) r14
            r13.e0(r2, r14)
            goto L_0x02f0
        L_0x00a1:
            r0 = 128(0x80, float:1.794E-43)
            if (r14 >= r0) goto L_0x00ab
            byte r14 = (byte) r14
            r13.V(r14)
            goto L_0x02f0
        L_0x00ab:
            if (r14 >= r1) goto L_0x00b5
            r0 = -52
            byte r14 = (byte) r14
            r13.e0(r0, r14)
            goto L_0x02f0
        L_0x00b5:
            r0 = -51
            r13.p0(r0, r14)
            goto L_0x02f0
        L_0x00bc:
            boolean r0 = r14 instanceof java.lang.Byte
            if (r0 == 0) goto L_0x00d2
            java.lang.Byte r14 = (java.lang.Byte) r14
            byte r14 = r14.byteValue()
            if (r14 >= r3) goto L_0x00cd
            r13.e0(r2, r14)
            goto L_0x02f0
        L_0x00cd:
            r13.V(r14)
            goto L_0x02f0
        L_0x00d2:
            boolean r0 = r14 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00e8
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00e1
            r14 = -61
            goto L_0x00e3
        L_0x00e1:
            r14 = -62
        L_0x00e3:
            r13.V(r14)
            goto L_0x02f0
        L_0x00e8:
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto L_0x0107
            java.util.List r14 = (java.util.List) r14
            int r0 = r14.size()
            r13.d(r0)
            java.util.Iterator r14 = r14.iterator()
        L_0x00f9:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r14.next()
            P(r13, r0)
            goto L_0x00f9
        L_0x0107:
            boolean r0 = r14 instanceof java.util.Set
            if (r0 == 0) goto L_0x0126
            java.util.Set r14 = (java.util.Set) r14
            int r0 = r14.size()
            r13.d(r0)
            java.util.Iterator r14 = r14.iterator()
        L_0x0118:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r14.next()
            P(r13, r0)
            goto L_0x0118
        L_0x0126:
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L_0x0131
            java.util.Map r14 = (java.util.Map) r14
            O(r13, r14)
            goto L_0x02f0
        L_0x0131:
            boolean r0 = r14 instanceof long[]
            r2 = 0
            if (r0 == 0) goto L_0x0147
            long[] r14 = (long[]) r14
            int r0 = r14.length
            r13.d(r0)
            int r0 = r14.length
        L_0x013d:
            if (r2 >= r0) goto L_0x02f0
            r3 = r14[r2]
            r13.j(r3)
            int r2 = r2 + 1
            goto L_0x013d
        L_0x0147:
            boolean r0 = r14 instanceof byte[]
            if (r0 == 0) goto L_0x0190
            byte[] r14 = (byte[]) r14
            int r0 = r14.length
            if (r0 >= r1) goto L_0x0157
            r1 = -60
            byte r0 = (byte) r0
            r13.e0(r1, r0)
            goto L_0x0167
        L_0x0157:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 >= r1) goto L_0x0162
            r1 = -59
            short r0 = (short) r0
            r13.p0(r1, r0)
            goto L_0x0167
        L_0x0162:
            r1 = -58
            r13.k0(r1, r0)
        L_0x0167:
            int r0 = r14.length
            org.msgpack.core.buffer.MessageBuffer r1 = r13.v
            if (r1 == 0) goto L_0x0186
            int r1 = r1.size()
            int r3 = r13.w
            int r1 = r1 - r3
            if (r1 < r0) goto L_0x0186
            int r1 = r13.b
            if (r0 <= r1) goto L_0x017a
            goto L_0x0186
        L_0x017a:
            org.msgpack.core.buffer.MessageBuffer r1 = r13.v
            r1.putBytes(r3, r14, r2, r0)
            int r14 = r13.w
            int r14 = r14 + r0
            r13.w = r14
            goto L_0x02f0
        L_0x0186:
            r13.flush()
            org.msgpack.core.buffer.MessageBufferOutput r13 = r13.o
            r13.write(r14, r2, r0)
            goto L_0x02f0
        L_0x0190:
            boolean r0 = r14 instanceof defpackage.gz
            if (r0 == 0) goto L_0x019f
            gz r14 = (defpackage.gz) r14
            java.util.HashMap r14 = r14.a()
            O(r13, r14)
            goto L_0x02f0
        L_0x019f:
            boolean r0 = r14 instanceof defpackage.v5b
            if (r0 == 0) goto L_0x01ae
            v5b r14 = (defpackage.v5b) r14
            ts r14 = r14.a()
            O(r13, r14)
            goto L_0x02f0
        L_0x01ae:
            boolean r0 = r14 instanceof defpackage.y5b
            java.lang.String r1 = "type"
            if (r0 == 0) goto L_0x01f2
            y5b r14 = (defpackage.y5b) r14
            r14.getClass()
            java.util.HashMap r0 = new java.util.HashMap
            r2 = 3
            r0.<init>(r2)
            int r2 = r14.a
            r3 = 1
            if (r2 == r3) goto L_0x01d2
            r3 = 2
            if (r2 == r3) goto L_0x01cf
            r3 = 3
            if (r2 != r3) goto L_0x01cd
            java.lang.String r2 = "FORWARD"
            goto L_0x01d4
        L_0x01cd:
            r13 = 0
            throw r13
        L_0x01cf:
            java.lang.String r2 = "REPLY"
            goto L_0x01d4
        L_0x01d2:
            java.lang.String r2 = "UNKNOWN"
        L_0x01d4:
            r0.put(r1, r2)
            long r1 = r14.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "chatId"
            r0.put(r2, r1)
            long r1 = r14.c
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "messageId"
            r0.put(r1, r14)
            O(r13, r0)
            goto L_0x02f0
        L_0x01f2:
            boolean r0 = r14 instanceof defpackage.ra9
            if (r0 == 0) goto L_0x0279
            ra9 r14 = (defpackage.ra9) r14
            long r2 = r14.a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r4 = "entityId"
            r5 = 0
            if (r0 <= 0) goto L_0x020d
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r4, r6)
        L_0x020b:
            r7 = r6
            goto L_0x0220
        L_0x020d:
            java.lang.String r6 = r14.b
            if (r6 == 0) goto L_0x021f
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0218
            goto L_0x021f
        L_0x0218:
            java.lang.String r7 = "entityName"
            kotlin.Pair r6 = kotlin.TuplesKt.to(r7, r6)
            goto L_0x020b
        L_0x021f:
            r7 = r5
        L_0x0220:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            if (r0 <= 0) goto L_0x0227
            goto L_0x0228
        L_0x0227:
            r2 = r5
        L_0x0228:
            if (r2 == 0) goto L_0x0238
            long r2 = r2.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r4, r0)
            r8 = r0
            goto L_0x0239
        L_0x0238:
            r8 = r5
        L_0x0239:
            va9 r0 = r14.c
            java.lang.String r0 = r0.name()
            kotlin.Pair r9 = kotlin.TuplesKt.to(r1, r0)
            short r0 = r14.o
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            java.lang.String r1 = "from"
            kotlin.Pair r10 = kotlin.TuplesKt.to(r1, r0)
            short r0 = r14.v
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            java.lang.String r1 = "length"
            kotlin.Pair r11 = kotlin.TuplesKt.to(r1, r0)
            java.util.Map r14 = r14.w
            if (r14 == 0) goto L_0x0265
            java.lang.String r0 = "attributes"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r0, r14)
        L_0x0265:
            r12 = r5
            kotlin.Pair[] r14 = new kotlin.Pair[]{r7, r8, r9, r10, r11, r12}
            java.util.List r14 = kotlin.collections.CollectionsKt.listOfNotNull((T[]) r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Map r14 = kotlin.collections.MapsKt.toMap(r14)
            O(r13, r14)
            goto L_0x02f0
        L_0x0279:
            boolean r0 = r14 instanceof defpackage.qtd
            if (r0 == 0) goto L_0x0287
            qtd r14 = (defpackage.qtd) r14
            java.util.Map r14 = r14.a()
            O(r13, r14)
            goto L_0x02f0
        L_0x0287:
            boolean r0 = r14 instanceof defpackage.r82
            if (r0 == 0) goto L_0x02f1
            r82 r14 = (defpackage.r82) r14
            r14.getClass()
            ts r0 = new ts
            r0.<init>(r2)
            java.lang.String r1 = "id"
            java.lang.String r2 = r14.a
            r0.put(r1, r2)
            java.lang.String r1 = "title"
            java.lang.String r2 = r14.b
            r0.put(r1, r2)
            java.lang.String r1 = r14.c
            if (r1 == 0) goto L_0x02ac
            java.lang.String r2 = "emoji"
            r0.put(r2, r1)
        L_0x02ac:
            java.lang.String r1 = "include"
            java.util.Set r2 = r14.o
            r0.put(r1, r2)
            java.lang.String r1 = "favorites"
            java.util.Set r2 = r14.v
            r0.put(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r14.w
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x02c9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02dd
            java.lang.Object r3 = r2.next()
            q82 r3 = (defpackage.q82) r3
            java.lang.String r3 = r3.name()
            r1.add(r3)
            goto L_0x02c9
        L_0x02dd:
            java.lang.String r2 = "filters"
            r0.put(r2, r1)
            boolean r14 = r14.x
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.String r1 = "hideEmpty"
            r0.put(r1, r14)
            O(r13, r0)
        L_0x02f0:
            return
        L_0x02f1:
            if (r14 != 0) goto L_0x02fb
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "value == null"
            r13.<init>(r14)
            throw r13
        L_0x02fb:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r0 = "type "
            java.lang.String r1 = " isn't yet implemented"
            java.lang.String r14 = defpackage.wj6.k(r0, r14, r1)
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.P(gd9, java.lang.Object):void");
    }

    public static cs Q(String str) {
        int i2;
        String str2;
        boolean F = StringsKt__StringsJVMKt.startsWith$default(str, "HTTP/1.", false, 2, (Object) null);
        y8c y8c = y8c.HTTP_1_0;
        if (F) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    y8c = y8c.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (StringsKt__StringsJVMKt.startsWith$default(str, "ICY ", false, 2, (Object) null)) {
            i2 = 4;
        } else {
            throw new ProtocolException(a81.m("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new cs(str2, parseInt, 19, y8c);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static Object R(c1g c1g) {
        switch (tr1.y(c1g.g())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((hb7) c1g).a);
            case 2:
                return Long.valueOf(c1g.l().o());
            case 3:
                return Float.valueOf((float) ((lb7) c1g).a);
            case 4:
                return ((p1) c1g.s()).E();
            case 5:
                return ByteBuffer.wrap(((p1) c1g.u()).a).asReadOnlyBuffer();
            case 6:
                bb7 e2 = c1g.e();
                ArrayList arrayList = new ArrayList(r0);
                for (c1g R : e2.a) {
                    arrayList.add(R(R));
                }
                return arrayList;
            case 7:
                zb7 m = c1g.m();
                HashMap hashMap = new HashMap(m.a.length / 2);
                Iterator it = new os(m.a).iterator();
                while (true) {
                    ab7 ab7 = (ab7) it;
                    if (!ab7.hasNext()) {
                        return hashMap;
                    }
                    Map.Entry entry = (Map.Entry) ab7.next();
                    hashMap.put(R((c1g) entry.getKey()), R((c1g) entry.getValue()));
                }
            default:
                throw new RuntimeException(wj6.k("Type ", wzf.p(c1g.g()), " isn't yet implemented"));
        }
    }

    public static void S(Set set, ij0 ij0, boolean z) {
        z68.c("ryg", "event: " + ij0.getClass().getName() + " postponed", new Object[0]);
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ij0 ij02 = (ij0) it.next();
                if (ij02.getClass().equals(ij0.getClass())) {
                    arrayList.add(ij02);
                }
            }
            set.removeAll(arrayList);
        }
        set.add(ij0);
    }

    public static int T(int i2, l8b l8b) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return l8b.u() + 1;
            case 7:
                return l8b.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static long U(l8b l8b, int i2, int i3) {
        l8b.G(i2);
        if (l8b.a() < 5) {
            return -9223372036854775807L;
        }
        int g2 = l8b.g();
        if ((8388608 & g2) != 0 || ((2096896 & g2) >> 8) != i3 || (g2 & 32) == 0 || l8b.u() < 7 || l8b.a() < 7 || (l8b.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        l8b.e(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static final void V(CharSequence charSequence) {
        Object[] objArr = null;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            try {
                objArr = spannable.getSpans(0, spannable.length(), uk.class);
            } catch (Throwable unused) {
            }
            uk[] ukVarArr = (uk[]) objArr;
            if (ukVarArr != null) {
                for (uk ukVar : ukVarArr) {
                    ld8.m0(spannable, kuf.class, spannable.getSpanStart(ukVar), spannable.getSpanEnd(ukVar));
                }
            }
        }
    }

    public static Object W(Function0 function0, Continuation continuation) {
        return ev0.I(EmptyCoroutineContext.INSTANCE, new jj7(function0, (Continuation) null), continuation);
    }

    public static int X(pf9 pf9) {
        if (pf9.n().a() == 7) {
            return pf9.t0();
        }
        pf9.A();
        return 0;
    }

    public static boolean Y(pf9 pf9) {
        Boolean bool = Boolean.FALSE;
        if (pf9.n().a() == 2) {
            bool = Boolean.valueOf(pf9.v0());
        } else {
            pf9.A();
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r6 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = (byte) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Byte Z(defpackage.pf9 r6) {
        /*
            r0 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            hb9 r1 = r6.n()
            int r1 = r1.a()
            r2 = 3
            if (r1 != r2) goto L_0x00c7
            byte r0 = r6.readByte()
            boolean r1 = defpackage.o54.z(r0)
            if (r1 == 0) goto L_0x001c
            goto L_0x00b5
        L_0x001c:
            r1 = -128(0xffffffffffffff80, float:NaN)
            r2 = 127(0x7f, double:6.27E-322)
            r4 = 127(0x7f, float:1.78E-43)
            switch(r0) {
                case -52: goto L_0x00af;
                case -51: goto L_0x0097;
                case -50: goto L_0x0089;
                case -49: goto L_0x0075;
                case -48: goto L_0x0070;
                case -47: goto L_0x005c;
                case -46: goto L_0x0048;
                case -45: goto L_0x002c;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r6 = "Integer"
            org.msgpack.core.MessagePackException r6 = defpackage.pf9.s0(r6, r0)
            throw r6
        L_0x002c:
            long r0 = r6.readLong()
            r4 = -128(0xffffffffffffff80, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x003e
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x003e
        L_0x003a:
            int r6 = (int) r0
        L_0x003b:
            byte r0 = (byte) r6
            goto L_0x00b5
        L_0x003e:
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x0048:
            int r6 = r6.readInt()
            if (r6 < r1) goto L_0x0051
            if (r6 > r4) goto L_0x0051
        L_0x0050:
            goto L_0x003b
        L_0x0051:
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x005c:
            short r6 = r6.readShort()
            if (r6 < r1) goto L_0x0065
            if (r6 > r4) goto L_0x0065
            goto L_0x0050
        L_0x0065:
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x0070:
            byte r0 = r6.readByte()
            goto L_0x00b5
        L_0x0075:
            long r0 = r6.readLong()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0084
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0084
            goto L_0x003a
        L_0x0084:
            org.msgpack.core.MessageIntegerOverflowException r6 = defpackage.pf9.e0(r0)
            throw r6
        L_0x0089:
            int r6 = r6.readInt()
            if (r6 < 0) goto L_0x0092
            if (r6 > r4) goto L_0x0092
            goto L_0x0050
        L_0x0092:
            org.msgpack.core.MessageIntegerOverflowException r6 = defpackage.pf9.V(r6)
            throw r6
        L_0x0097:
            short r6 = r6.readShort()
            if (r6 < 0) goto L_0x00a0
            if (r6 > r4) goto L_0x00a0
            goto L_0x0050
        L_0x00a0:
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x00af:
            byte r0 = r6.readByte()
            if (r0 < 0) goto L_0x00ba
        L_0x00b5:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L_0x00ca
        L_0x00ba:
            r6 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            org.msgpack.core.MessageIntegerOverflowException r0 = new org.msgpack.core.MessageIntegerOverflowException
            r0.<init>(r6)
            throw r0
        L_0x00c7:
            r6.A()
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.Z(pf9):java.lang.Byte");
    }

    public static int a(int i2, int i3) {
        return rae.h(i2, i3, 31);
    }

    public static Double a0(pf9 pf9, Double d2) {
        double d3;
        if (pf9.n().a() == 4) {
            byte readByte = pf9.readByte();
            if (readByte == -54) {
                d3 = (double) pf9.k0(4).getFloat(pf9.Y);
            } else if (readByte == -53) {
                d3 = pf9.k0(8).getDouble(pf9.Y);
            } else {
                throw pf9.s0("Float", readByte);
            }
            return Double.valueOf(d3);
        }
        pf9.A();
        return d2;
    }

    public static void b(knb knb) {
        bq0 b2 = ym.e().b(9, 10);
        qa7 qa7 = (qa7) knb.e;
        if (qa7 != null) {
            ra7 b3 = ra7.b(qa7);
            b3.l = b2;
            knb.e = b3.a();
        }
    }

    public static Float b0(pf9 pf9, Float f2) {
        float f3;
        if (pf9.n().a() == 4) {
            byte readByte = pf9.readByte();
            if (readByte == -54) {
                f3 = pf9.k0(4).getFloat(pf9.Y);
            } else if (readByte == -53) {
                f3 = (float) pf9.k0(8).getDouble(pf9.Y);
            } else {
                throw pf9.s0("Float", readByte);
            }
            return Float.valueOf(f3);
        }
        pf9.A();
        return f2;
    }

    public static void c(Context context, l20 l20, knb knb, boolean z, boolean z2) {
        v3d w;
        Object obj;
        Object obj2;
        Object obj3 = knb.e;
        if (obj3 == null || ((qa7) obj3).i == null) {
            v3d w2 = w(context, l20, z);
            if (!(w2 == null || (obj2 = knb.e) == null)) {
                ra7 b2 = ra7.b((qa7) obj2);
                b2.d = w2;
                knb.e = b2.a();
            }
            if (!z && z2 && (w = w(context, l20, true)) != null && (obj = knb.e) != null) {
                ra7 b3 = ra7.b((qa7) obj);
                b3.d = w;
                knb.f = b3.a();
            }
        }
    }

    public static int c0(pf9 pf9) {
        Integer num = 0;
        if (pf9.n().a() == 3) {
            num = Integer.valueOf(pf9.w0());
        } else {
            pf9.A();
        }
        return num.intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0013 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.text.Spannable r11, java.util.ArrayList r12, defpackage.fk r13) {
        /*
            r0 = 1
            java.util.concurrent.atomic.AtomicReference r1 = r13.a
            java.lang.Object r1 = r1.get()
            xi r1 = (defpackage.xi) r1
            int r1 = r1.b()
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r3 = r2
        L_0x0013:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r12.next()
            fsb r4 = (defpackage.fsb) r4
            if (r3 >= r1) goto L_0x00b6
            int r5 = r4.c
            if (r5 < 0) goto L_0x00b6
            int r5 = r11.length()
            int r6 = r4.d
            if (r6 <= r5) goto L_0x002f
            goto L_0x00b6
        L_0x002f:
            int r5 = r4.c
            r7 = 0
            java.lang.Class<uk> r8 = defpackage.uk.class
            java.lang.Object[] r8 = r11.getSpans(r5, r6, r8)     // Catch:{ all -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r8 = r7
        L_0x003a:
            uk[] r8 = (defpackage.uk[]) r8
            if (r8 == 0) goto L_0x006d
            int r9 = r8.length
            if (r9 != 0) goto L_0x0043
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r2
        L_0x0044:
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x006d
            java.util.Iterator r8 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r8)
        L_0x004b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x006d
            java.lang.Object r9 = r8.next()
            uk r9 = (defpackage.uk) r9
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0062 }
            r11.removeSpan(r9)     // Catch:{ all -> 0x0062 }
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0062 }
            kotlin.Result.m23constructorimpl(r9)     // Catch:{ all -> 0x0062 }
            goto L_0x004b
        L_0x0062:
            r9 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            kotlin.Result.m23constructorimpl(r9)
            goto L_0x004b
        L_0x006d:
            java.lang.CharSequence r8 = r11.subSequence(r5, r6)
            int r9 = r8.length()
            boolean r10 = r8 instanceof android.text.Spanned     // Catch:{ all -> 0x0086 }
            if (r10 == 0) goto L_0x007c
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x0086 }
            goto L_0x007d
        L_0x007c:
            r8 = r7
        L_0x007d:
            if (r8 == 0) goto L_0x0086
            java.lang.Class<kuf> r10 = defpackage.kuf.class
            java.lang.Object[] r8 = r8.getSpans(r2, r9, r10)     // Catch:{ all -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r8 = r7
        L_0x0087:
            kuf[] r8 = (defpackage.kuf[]) r8
            if (r8 == 0) goto L_0x0091
            java.lang.Object r7 = kotlin.collections.ArraysKt.firstOrNull((T[]) r8)
            kuf r7 = (defpackage.kuf) r7
        L_0x0091:
            if (r7 != 0) goto L_0x0095
            goto L_0x0013
        L_0x0095:
            uk r8 = new uk
            java.util.concurrent.ConcurrentHashMap r9 = r13.b
            java.lang.String r10 = r4.a
            java.lang.Object r9 = r9.get(r10)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            one.me.rlottie.RLottieDrawable r4 = r4.b
            r8.<init>(r4, r7, r9, r3)
            r7 = 34
            r11.setSpan(r8, r5, r6, r7)
            qu4 r5 = defpackage.qu4.a
            r4.setCallback(r5)
            r4.start()
            int r3 = r3 + r0
            goto L_0x0013
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.d(android.text.Spannable, java.util.ArrayList, fk):void");
    }

    public static long d0(pf9 pf9, long j) {
        if (pf9.n().a() == 3) {
            return pf9.x0();
        }
        pf9.A();
        return j;
    }

    public static final void e(View view, boolean z) {
        if (view instanceof t15) {
            t15 t15 = (t15) view;
            if (t15.a() != (!z)) {
                t15.setEmojiCompatEnabled(!z);
            }
        }
    }

    public static int e0(pf9 pf9) {
        if (pf9.n().a() == 8) {
            return pf9.y0();
        }
        pf9.A();
        return 0;
    }

    public static p74 f(w2d w2d, String str, cpc cpc, int i2) {
        o74 o74 = new o74(0);
        o74.b = tf6.k0(str, cpc.c);
        o74.g = cpc.a;
        o74.h = cpc.b;
        String a2 = w2d.a();
        if (a2 == null) {
            a2 = cpc.b(((ll0) w2d.b.get(0)).a).toString();
        }
        o74.e(a2);
        o74.c(i2);
        return o74.a();
    }

    public static short f0(pf9 pf9) {
        int readByte;
        long readLong;
        if (pf9.n().a() == 3) {
            byte readByte2 = pf9.readByte();
            if (o54.z(readByte2)) {
                return (short) readByte2;
            }
            switch (readByte2) {
                case -52:
                    readByte = pf9.readByte() & UByte.MAX_VALUE;
                    break;
                case -51:
                    short readShort = pf9.readShort();
                    if (readShort >= 0) {
                        return readShort;
                    }
                    throw new MessageIntegerOverflowException(BigInteger.valueOf((long) (readShort & UShort.MAX_VALUE)));
                case -50:
                    readByte = pf9.readInt();
                    if (readByte < 0 || readByte > 32767) {
                        throw pf9.V(readByte);
                    }
                case -49:
                    readLong = pf9.readLong();
                    if (readLong < 0 || readLong > 32767) {
                        throw pf9.e0(readLong);
                    }
                case -48:
                    readByte = pf9.readByte();
                    break;
                case -47:
                    return pf9.readShort();
                case -46:
                    readByte = pf9.readInt();
                    if (readByte < -32768 || readByte > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) readByte));
                    }
                case -45:
                    readLong = pf9.readLong();
                    if (readLong < -32768 || readLong > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong));
                    }
                default:
                    throw pf9.s0("Integer", readByte2);
            }
            readByte = (int) readLong;
            return (short) readByte;
        }
        pf9.A();
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.u() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(defpackage.l8b r20, defpackage.uq5 r21, int r22, defpackage.yl4 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.b
            long r5 = r20.w()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r10
        L_0x0024:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            r6 = 7
            if (r14 > r6) goto L_0x0052
            int r6 = r1.h
            int r6 = r6 - r3
            if (r14 != r6) goto L_0x00c3
            goto L_0x0059
        L_0x0052:
            if (r14 > r2) goto L_0x00c3
            int r6 = r1.h
            r9 = 2
            if (r6 != r9) goto L_0x00c3
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r6 = r1.j
            if (r8 != r6) goto L_0x00c3
        L_0x0060:
            if (r5 != 0) goto L_0x00c3
            long r5 = r20.B()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r7 = r23
            goto L_0x0070
        L_0x006b:
            int r7 = r1.c
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L_0x0068
        L_0x0070:
            r7.b = r5
            r5 = r19
            int r5 = T(r5, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c3
            int r6 = r1.c
            if (r5 > r6) goto L_0x00c3
            if (r13 != 0) goto L_0x0082
            goto L_0x00a7
        L_0x0082:
            r5 = 11
            if (r13 > r5) goto L_0x008b
            int r1 = r1.g
            if (r13 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x008b:
            int r1 = r1.f
            r5 = 12
            if (r13 != r5) goto L_0x009a
            int r2 = r20.u()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x009a:
            r5 = 14
            if (r13 > r5) goto L_0x00c3
            int r6 = r20.A()
            if (r13 != r5) goto L_0x00a5
            int r6 = r6 * r2
        L_0x00a5:
            if (r6 != r1) goto L_0x00c3
        L_0x00a7:
            int r1 = r20.u()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = defpackage.v0g.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = defpackage.v0g.q
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b3
        L_0x00c0:
            if (r1 != r5) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.g(l8b, uq5, int, yl4):boolean");
    }

    public static String g0(pf9 pf9) {
        if (pf9.n().a() == 5) {
            return pf9.A0();
        }
        pf9.A();
        return null;
    }

    public static final boolean h(Set set, hj hjVar) {
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsJVMKt.contentEquals((CharSequence) it.next(), hjVar.name(), true)) {
                return true;
            }
        }
        return false;
    }

    public static String h0(pf9 pf9, String str) {
        if (pf9.n().a() == 5) {
            return pf9.A0();
        }
        pf9.A();
        return str;
    }

    public static boolean i(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z = true;
            for (int i2 = 0; i2 < length; i2++) {
                z = i(listFiles[i2]) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static void i0(Map map, ByteArrayOutputStream byteArrayOutputStream) {
        dd9 dd9 = fd9.b;
        gd9 gd9 = new gd9(new OutputStreamBufferOutput(byteArrayOutputStream, dd9.c), dd9);
        try {
            gd9.m(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                gd9.o(str);
                P(gd9, obj);
            }
        } finally {
            gd9.close();
        }
    }

    public static ep4 j() {
        if (ep4.b != null) {
            return ep4.b;
        }
        synchronized (ep4.class) {
            try {
                if (ep4.b == null) {
                    ep4.b = new ep4(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ep4.b;
    }

    public static boolean j0(w28 w28) {
        if (w28 == null) {
            return false;
        }
        if (w28.G() <= 1) {
            ym ymVar = ym.v;
            kn4.a.getClass();
            if (jn4.a(ymVar) != kn4.o) {
                return false;
            }
        }
        return true;
    }

    public static void k(Activity activity, hu7 hu7) {
        if (activity instanceof jv7) {
            ju7 lifecycle = ((jv7) activity).getLifecycle();
            if (lifecycle instanceof lv7) {
                ((lv7) lifecycle).e(hu7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k0(defpackage.jha r1, defpackage.qk3 r2, defpackage.qk3 r3, defpackage.x6 r4) {
        /*
            or7 r0 = new or7
            r0.<init>(r2, r3, r4)
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            pa3 r3 = new pa3
            r4 = 1
            r3.<init>(r4, r2)
            r0.c(r3)
            r1.a(r3)
        L_0x0016:
            boolean r1 = r3.f()
            if (r1 == 0) goto L_0x001d
            goto L_0x0040
        L_0x001d:
            java.lang.Object r1 = r2.poll()
            if (r1 != 0) goto L_0x0030
            java.lang.Object r1 = r2.take()     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = move-exception
            r3.dispose()
            r0.onError(r1)
            goto L_0x0040
        L_0x0030:
            boolean r4 = r3.f()
            if (r4 != 0) goto L_0x0040
            java.lang.Object r4 = defpackage.pa3.c
            if (r1 == r4) goto L_0x0040
            boolean r1 = defpackage.lea.b(r0, r1)
            if (r1 == 0) goto L_0x0016
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.k0(jha, qk3, qk3, x6):void");
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static ArrayList l0(pf9 pf9, wv9 wv9) {
        if (pf9.n().a() == 7) {
            ArrayList arrayList = new ArrayList();
            int t0 = pf9.t0();
            for (int i2 = 0; i2 < t0; i2++) {
                arrayList.add(wv9.m(pf9));
            }
            return arrayList;
        }
        pf9.A();
        return null;
    }

    public static yxd m(Set set, msb msb) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof yxd) {
                yxd yxd = (yxd) sortedSet;
                msb msb2 = yxd.b;
                msb2.getClass();
                return new yxd((SortedSet) yxd.a, new qsb(Arrays.asList(new msb[]{msb2, msb})));
            }
            sortedSet.getClass();
            return new yxd(sortedSet, msb);
        } else if (set instanceof yxd) {
            yxd yxd2 = (yxd) set;
            msb msb3 = yxd2.b;
            msb3.getClass();
            return new yxd((Set) yxd2.a, new qsb(Arrays.asList(new msb[]{msb3, msb})));
        } else {
            set.getClass();
            return new yxd(set, msb);
        }
    }

    public static Set m0(pf9 pf9, wv9 wv9) {
        if (pf9.n().a() == 7) {
            int t0 = pf9.t0();
            HashSet hashSet = new HashSet(t0);
            for (int i2 = 0; i2 < t0; i2++) {
                hashSet.add(wv9.m(pf9));
            }
            return hashSet;
        }
        pf9.A();
        return Collections.emptySet();
    }

    public static long n0(pf9 pf9) {
        if (pf9.n().a() == 3) {
            return pf9.x0();
        }
        pf9.A();
        hb9 n = pf9.n();
        throw new IllegalArgumentException("invalid type " + n);
    }

    public static final void p(int i2, int i3, int i4, int i5, int[] iArr) {
        if (iArr.length > 1) {
            float f2 = (float) i5;
            float f3 = (float) i4;
            int i6 = (int) ((f2 / f3) * ((float) i2));
            if (1 > i3 || i3 >= i6) {
                i3 = i6;
            } else {
                i2 = (int) ((f3 / f2) * ((float) i3));
            }
            iArr[0] = i2;
            iArr[1] = i3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static jnb q(Context context, Uri uri, gv4 gv4, int i2, int i3, boolean z) {
        qa7 qa7;
        if (uri != null) {
            ra7 d2 = ra7.d(uri);
            d2.d = new v3d(i2, (float) t(context), i3);
            qa7 = d2.a();
        } else {
            qa7 = null;
        }
        knb a2 = ld9.p.get();
        a2.e = qa7;
        a2.l = gv4;
        if (z) {
            b(a2);
        }
        return a2.a();
    }

    public static int t(Context context) {
        if (h == null) {
            ((qra) ym.e()).n().getClass();
            Size k = hn4.k(context);
            int min = (int) ((((float) Math.min(k.getWidth(), k.getHeight())) / 3.0f) * 2.0f);
            if (min < 400) {
                min = 400;
            }
            h = Integer.valueOf(min);
        }
        return h.intValue();
    }

    public static v3d u(Context context, int i2, int i3, boolean z) {
        int i4;
        int t = t(context);
        int A = A(context);
        if (z) {
            A = t;
        }
        if (i3 * i2 < A * A) {
            return null;
        }
        if (i3 <= A && i2 <= A) {
            return null;
        }
        if (i3 > i2) {
            int i5 = (int) ((((float) i2) / ((float) i3)) * ((float) A));
            i4 = A;
            A = i5;
        } else {
            i4 = (int) ((((float) i3) / ((float) i2)) * ((float) A));
        }
        return new v3d(A, z ? (float) t : 2048.0f, i4);
    }

    public static v3d v(Context context, k20 k20, boolean z) {
        int i2;
        int i3 = k20.d;
        int i4 = k20.e;
        v3d u = u(context, i3, i4, z);
        if (u == null && (i2 = k20.d) > 0 && i4 > 0) {
            u = new v3d(i2, z ? (float) t(context) : 2048.0f, i4);
        }
        return u;
    }

    public static v3d w(Context context, l20 l20, boolean z) {
        g20 g20 = l20.a;
        if (g20 == g20.x) {
            c20 c20 = l20.g;
            if (c20.b()) {
                return w(context, c20.g, z);
            }
            if (c20.a()) {
                x10 x10 = c20.f;
                return u(context, x10.c, x10.o, z);
            }
        } else if (g20 == g20.c) {
            x10 x102 = l20.b;
            return u(context, x102.c, x102.o, z);
        } else {
            boolean W = ld8.W(l20);
            s10 s10 = l20.j;
            if (!W) {
                if (l20.a == g20.o) {
                    return v(context, l20.d, z);
                }
                if (ld8.Y(l20)) {
                    return v(context, s10.d.d, z);
                }
            } else if (!z) {
                return null;
            } else {
                x10 x103 = s10.d.b;
                return u(context, x103.c, x103.o, z);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = defpackage.ym.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.id3 x(androidx.fragment.app.a r0) {
        /*
            androidx.fragment.app.b r0 = r0.M1()
            if (r0 == 0) goto L_0x000c
            id3 r0 = defpackage.ym.e()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            id3 r0 = defpackage.ym.e()
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryg.x(androidx.fragment.app.a):id3");
    }

    public static ArrayList z(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public abstract void M(int i2);

    public abstract void N(Typeface typeface, boolean z);

    public abstract int n(View view, int i2, int i3);

    public qu6 o() {
        return new qu6();
    }

    public abstract String r();

    public abstract int s(View view, int i2);

    public String toString() {
        switch (this.a) {
            case 11:
                return "Alignment:" + r();
            default:
                return super.toString();
        }
    }

    public int y(int i2, int i3) {
        return i2;
    }
}
