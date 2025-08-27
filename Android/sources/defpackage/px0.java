package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.connection.RouteException;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;

/* renamed from: px0  reason: default package */
public final class px0 implements vi7 {
    public static final px0 b = new px0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ px0(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [ce, java.lang.Object] */
    public final k4d a(otc otc) {
        otc otc2 = otc;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                y2d y2d = otc2.f;
                ata ata = new ata(4, y2d, (Object) null);
                if (y2d != null) {
                    ex0 ex0 = y2d.a;
                    if (ex0 == null) {
                        int i = ex0.n;
                        ex0 = kr7.G(y2d.d);
                        y2d.a = ex0;
                    }
                    if (ex0.j) {
                        ata = new ata(4, (Object) null, (Object) null);
                    }
                }
                jtc jtc = otc2.b;
                if (!(jtc instanceof jtc)) {
                    jtc = null;
                }
                if (jtc != null) {
                    bk3 bk3 = jtc.b;
                }
                y2d y2d2 = (y2d) ata.b;
                k4d k4d = (k4d) ata.c;
                if (y2d2 == null && k4d == null) {
                    j4d j4d = new j4d();
                    j4d.a = y2d;
                    j4d.b = y8c.HTTP_1_1;
                    j4d.c = HttpStatus.SC_GATEWAY_TIMEOUT;
                    j4d.d = "Unsatisfiable Request (only-if-cached)";
                    j4d.g = u0g.c;
                    j4d.k = -1;
                    j4d.l = System.currentTimeMillis();
                    return j4d.a();
                } else if (y2d2 == null) {
                    j4d m = k4d.m();
                    k4d a2 = js9.a(k4d);
                    j4d.b(a2, "cacheResponse");
                    m.i = a2;
                    return m.a();
                } else {
                    k4d b2 = otc2.b(y2d2);
                    if (k4d != null) {
                        if (b2.o == 304) {
                            j4d m2 = k4d.m();
                            ArrayList arrayList = new ArrayList(20);
                            lx6 lx6 = k4d.w;
                            int size = lx6.size();
                            int i2 = 0;
                            while (true) {
                                lx6 lx62 = b2.w;
                                if (i2 < size) {
                                    String d = lx6.d(i2);
                                    String f = lx6.f(i2);
                                    if ((!StringsKt__StringsJVMKt.equals("Warning", d, true) || !StringsKt__StringsJVMKt.startsWith$default(f, "1", false, 2, (Object) null)) && (StringsKt__StringsJVMKt.equals(HTTP.CONTENT_LEN, d, true) || StringsKt__StringsJVMKt.equals(HTTP.CONTENT_ENCODING, d, true) || StringsKt__StringsJVMKt.equals(HTTP.CONTENT_TYPE, d, true) || !js9.i(d) || lx62.b(d) == null)) {
                                        arrayList.add(d);
                                        arrayList.add(StringsKt.trim((CharSequence) f).toString());
                                    }
                                    i2++;
                                } else {
                                    int size2 = lx62.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        String d2 = lx62.d(i3);
                                        if (!StringsKt__StringsJVMKt.equals(HTTP.CONTENT_LEN, d2, true) && !StringsKt__StringsJVMKt.equals(HTTP.CONTENT_ENCODING, d2, true) && !StringsKt__StringsJVMKt.equals(HTTP.CONTENT_TYPE, d2, true) && js9.i(d2)) {
                                            String f2 = lx62.f(i3);
                                            arrayList.add(d2);
                                            arrayList.add(StringsKt.trim((CharSequence) f2).toString());
                                        }
                                    }
                                    Object[] array = arrayList.toArray(new String[0]);
                                    if (array != null) {
                                        e4 e4Var = new e4(20);
                                        CollectionsKt__MutableCollectionsKt.addAll((ArrayList) e4Var.b, (T[]) (String[]) array);
                                        m2.f = e4Var;
                                        m2.k = b2.Y;
                                        m2.l = b2.Z;
                                        k4d a3 = js9.a(k4d);
                                        j4d.b(a3, "cacheResponse");
                                        m2.i = a3;
                                        k4d a4 = js9.a(b2);
                                        j4d.b(a4, "networkResponse");
                                        m2.h = a4;
                                        m2.a();
                                        b2.x.close();
                                        throw null;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        } else {
                            ptc ptc = k4d.x;
                            if (ptc != null) {
                                u0g.c(ptc);
                            }
                        }
                    }
                    j4d m3 = b2.m();
                    k4d a5 = js9.a(k4d);
                    j4d.b(a5, "cacheResponse");
                    m3.i = a5;
                    k4d a6 = js9.a(b2);
                    j4d.b(a6, "networkResponse");
                    m3.h = a6;
                    return m3.a();
                }
            default:
                jtc jtc2 = otc2.b;
                synchronized (jtc2) {
                    if (!jtc2.Z) {
                        throw new IllegalStateException("released".toString());
                    } else if (!(!jtc2.Y)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (!jtc2.X) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                t95 t95 = jtc2.w;
                rla rla = jtc2.y0;
                t95.getClass();
                try {
                    s95 j = t95.a(otc2.g, otc2.h, otc2.i, rla.J0, rla.w, !Intrinsics.areEqual((Object) otc2.f.c, (Object) HttpGet.METHOD_NAME)).j(rla, otc2);
                    bk3 bk32 = bk3.o;
                    ? obj = new Object();
                    obj.c = jtc2;
                    obj.o = bk32;
                    obj.v = t95;
                    obj.w = j;
                    obj.b = j.f();
                    jtc2.z = obj;
                    jtc2.w0 = obj;
                    synchronized (jtc2) {
                        jtc2.X = true;
                        jtc2.Y = true;
                    }
                    if (!jtc2.v0) {
                        return otc.a(otc2, 0, obj, (y2d) null, 61).b(otc2.f);
                    }
                    throw new IOException("Canceled");
                } catch (RouteException e) {
                    t95.b(e.a);
                    throw e;
                } catch (IOException e2) {
                    t95.b(e2);
                    throw new RouteException(e2);
                }
        }
    }
}
