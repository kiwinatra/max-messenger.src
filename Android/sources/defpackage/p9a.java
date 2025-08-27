package defpackage;

import android.os.Parcel;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.protocol.HTTP;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: p9a  reason: default package */
public final class p9a implements zi6, qk3, fc3, xxf, ife, s33, pd8, x34, a7e, t0d {
    public static p9a b;
    public static final p9a c = new p9a(1);
    public static final p9a o = new p9a(2);
    public static final p9a v = new p9a(3);
    public static final p9a w = new p9a(4);
    public static final p9a x = new p9a(5);
    public static final p9a y = new p9a(6);
    public final /* synthetic */ int a;

    public /* synthetic */ p9a(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        r0 = r2.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0.equals("libcore.io.GaiException") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw new java.net.UnknownHostException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0007, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0009, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.net.HttpURLConnection r2) {
        /*
            r2.connect()     // Catch:{ SecurityException -> 0x000a, IllegalArgumentException -> 0x0008, NullPointerException -> 0x0006, all -> 0x0004 }
            return
        L_0x0004:
            r2 = move-exception
            throw r2
        L_0x0006:
            r2 = move-exception
            throw r2
        L_0x0008:
            r2 = move-exception
            throw r2
        L_0x000a:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0030
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "libcore.io.GaiException"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = "android.system.GaiException"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            throw r2
        L_0x002a:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            r2.<init>()
            throw r2
        L_0x0030:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9a.d(java.net.HttpURLConnection):void");
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream, j47, java.util.zip.DeflaterOutputStream] */
    public static i57 f(eud eud) {
        BufferedOutputStream bufferedOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) eud.c).openConnection();
        Iterator it = ArrayIteratorKt.iterator((b57[]) ((c57) eud.o).b);
        while (it.hasNext()) {
            b57 b57 = (b57) it.next();
            httpURLConnection.setRequestProperty(b57.a, b57.b);
        }
        try {
            httpURLConnection.setRequestMethod((String) eud.b);
            g7a g7a = (g7a) eud.v;
            if (g7a != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setChunkedStreamingMode(0);
            }
            d(httpURLConnection);
            if (g7a != null) {
                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                hm hmVar = (hm) g7a.b;
                boolean shouldGzip = hmVar.shouldGzip();
                int i = g7a.a;
                yl ylVar = (yl) g7a.c;
                k47 k47 = (k47) g7a.d;
                if (shouldGzip) {
                    ? gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    k47.b.f(gZIPOutputStream, hmVar, ylVar, i);
                    gZIPOutputStream.finish();
                    gZIPOutputStream.m();
                } else {
                    k47.b.f(bufferedOutputStream, hmVar, ylVar, i);
                }
                bufferedOutputStream.close();
            }
            ArrayList arrayList = new ArrayList();
            int responseCode = httpURLConnection.getResponseCode();
            for (String next : httpURLConnection.getHeaderFields().keySet()) {
                if (next != null) {
                    arrayList.add(new b57(next, httpURLConnection.getHeaderField(next)));
                }
            }
            return new i57(responseCode, new c57(0, (b57[]) arrayList.toArray(new b57[0])), new af6(2, httpURLConnection), 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException(e);
        } catch (IOException e2) {
            httpURLConnection.disconnect();
            throw e2;
        } catch (Throwable th) {
            bufferedOutputStream.close();
            throw th;
        }
    }

    public static jtc h(String str) {
        String k = wj6.k("https://player.vimeo.com/video/", str, "/config");
        String m = a81.m("https://vimeo.com/", str);
        rla rla = new rla();
        hr6 hr6 = new hr6();
        hr6.C(k);
        ((e4) hr6.c).y(HTTP.CONTENT_TYPE, "application/json");
        ((e4) hr6.c).y("Referer", m);
        return rla.b(hr6.c());
    }

    public static l51 i(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2105248304) {
            if (hashCode != -1881579439) {
                if (hashCode != -1284823979) {
                    if (hashCode == 65120 && str.equals("ASR")) {
                        return l51.o;
                    }
                } else if (str.equals("ADD_PARTICIPANT")) {
                    return l51.a;
                }
            } else if (str.equals("RECORD")) {
                return l51.b;
            }
        } else if (str.equals("MOVIE_SHARE")) {
            return l51.c;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        if (r11 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00f3
            if (r7 != 0) goto L_0x0007
            goto L_0x00f3
        L_0x0007:
            if (r9 < 0) goto L_0x00f3
            if (r10 >= 0) goto L_0x000d
            goto L_0x00f3
        L_0x000d:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00f3
            if (r2 == r3) goto L_0x00f3
            if (r1 == r2) goto L_0x001e
            goto L_0x00f3
        L_0x001e:
            r4 = 1
            if (r11 == 0) goto L_0x00a9
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x0030
            if (r11 >= r1) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            if (r9 >= 0) goto L_0x0032
        L_0x0030:
            r1 = r3
            goto L_0x0061
        L_0x0032:
            r11 = r0
        L_0x0033:
            if (r9 != 0) goto L_0x0036
            goto L_0x0061
        L_0x0036:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003f
            if (r11 == 0) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            r1 = r0
            goto L_0x0061
        L_0x003f:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004f
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x004c
            goto L_0x0030
        L_0x004c:
            int r9 = r9 + -1
            goto L_0x0032
        L_0x004f:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0058
            int r9 = r9 + -1
            goto L_0x0033
        L_0x0058:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005f
            goto L_0x0030
        L_0x005f:
            r11 = r4
            goto L_0x0033
        L_0x0061:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x0070
            if (r10 >= r2) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            if (r9 >= 0) goto L_0x0072
        L_0x0070:
            r10 = r3
            goto L_0x00a4
        L_0x0072:
            r11 = r0
        L_0x0073:
            if (r9 != 0) goto L_0x0077
            r10 = r2
            goto L_0x00a4
        L_0x0077:
            if (r2 < r10) goto L_0x007c
            if (r11 == 0) goto L_0x00a4
            goto L_0x0070
        L_0x007c:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008e
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0089
            goto L_0x0070
        L_0x0089:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0072
        L_0x008e:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0099
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0099:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x00a0
            goto L_0x0070
        L_0x00a0:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x0073
        L_0x00a4:
            if (r1 == r3) goto L_0x00f3
            if (r10 != r3) goto L_0x00b7
            goto L_0x00f3
        L_0x00a9:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b7:
            java.lang.Class<kuf> r9 = defpackage.kuf.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            kuf[] r9 = (defpackage.kuf[]) r9
            if (r9 == 0) goto L_0x00f3
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00f3
            int r11 = r9.length
            r2 = r0
        L_0x00c6:
            if (r2 >= r11) goto L_0x00dd
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x00dd:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = r4
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9a.j(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static gzb k(String str) {
        for (gzb gzb : gzb.w) {
            if (Intrinsics.areEqual((Object) gzb.a, (Object) str)) {
                return gzb;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void a() {
    }

    public void accept(Object obj, Object obj2) {
        m3h m3h = (m3h) ((n0h) obj).o();
        p5h p5h = new p5h((qdf) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = qzg.a;
        obtain.writeInt(1);
        tf6.E0(obtain, tf6.B0(obtain, 20293));
        obtain.writeStrongBinder(p5h);
        Parcel obtain2 = Parcel.obtain();
        try {
            m3h.c.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return ((OneMeRoomDatabase) obj).v();
            default:
                ArrayList arrayList = new ArrayList();
                for (ouc ouc : (List) obj) {
                    Long l = null;
                    vpe vpe = ouc instanceof vpe ? (vpe) ouc : null;
                    if (vpe != null) {
                        l = Long.valueOf(vpe.c);
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                return arrayList;
        }
    }

    public bs5 b(ome ome) {
        return new sbd(new eme(ome, (Continuation) null));
    }

    public void c(String str) {
    }

    public void close() {
    }

    public Object e(reb reb) {
        return reb.R0;
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(pv7.class, Executor.class)));
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p9a(j6h j6h) {
        this.a = 22;
    }

    public void accept(Object obj) {
        z68.f(bu4.g, "restoreUploadsFromStorage: failed", (Throwable) obj);
    }
}
