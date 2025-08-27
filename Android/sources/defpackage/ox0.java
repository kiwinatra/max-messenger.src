package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.camera.core.ProcessingException;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ox0  reason: default package */
public class ox0 implements fo0, ez6, ya3, nj6, pf1, d1g, yn1, gce, ize {
    public static final String[] o = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ ox0(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public static dae p(JSONObject jSONObject) {
        ue1 a2 = ue1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        return new dae(j, Intrinsics.areEqual((Object) string, (Object) "STREAM") ? ayc.c : Intrinsics.areEqual((Object) string, (Object) "RECORD") ? ayc.b : ayc.a, a2, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), ct.C(jSONObject, "recordExternalMovieId"), ct.C(jSONObject, "recordExternalOwnerId"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ox0 r(android.content.Context r4) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            r2.<init>(r4, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileLock r0 = r4.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            ox0 r2 = new ox0     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            r3 = 8
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            return r2
        L_0x0023:
            r0 = r1
            goto L_0x0027
        L_0x0025:
            r4 = r1
            r0 = r4
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.release()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r4 == 0) goto L_0x0031
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox0.r(android.content.Context):ox0");
    }

    public static b59 v(View view) {
        if (view instanceof AdapterView) {
            return new did(0);
        }
        if (view instanceof ScrollView) {
            return new did(3);
        }
        if (view instanceof RecyclerView) {
            return new eid((RecyclerView) view);
        }
        if (view instanceof NestedScrollView) {
            return new did(2);
        }
        if (view instanceof HorizontalScrollView) {
            return new did(1);
        }
        if (view.getParent() instanceof View) {
            return v((View) view.getParent());
        }
        return null;
    }

    public static View w(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return w((View) view.getParent());
        }
        return null;
    }

    public void A(tb0 tb0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object) tb0.a);
            jSONObject.put("Status", tr1.y(tb0.b));
            jSONObject.put("AuthToken", (Object) tb0.c);
            jSONObject.put("RefreshToken", (Object) tb0.d);
            jSONObject.put("TokenCreationEpochInSecs", tb0.f);
            jSONObject.put("ExpiresInSecs", tb0.e);
            jSONObject.put("FisError", (Object) tb0.g);
            hp5 hp5 = (hp5) this.b;
            hp5.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hp5.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(y())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void B(Exception exc, boolean z) {
        this.b = null;
        HashSet hashSet = (HashSet) this.c;
        tb7 p = tb7.p(hashSet);
        hashSet.clear();
        lx5 r = p.listIterator(0);
        while (r.hasNext()) {
            ke4 ke4 = (ke4) r.next();
            ke4.getClass();
            ke4.j(exc, z ? 1 : 3);
        }
    }

    public ft C(pzc pzc, int i) {
        pag pag;
        ft ftVar;
        qae qae = (qae) this.c;
        int d = qae.d(pzc);
        if (d >= 0 && (pag = (pag) qae.i(d)) != null) {
            int i2 = pag.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                pag.a = i3;
                if (i == 4) {
                    ftVar = pag.b;
                } else if (i == 8) {
                    ftVar = pag.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    qae.g(d);
                    pag.a = 0;
                    pag.b = null;
                    pag.c = null;
                    pag.d.b(pag);
                }
                return ftVar;
            }
        }
        return null;
    }

    public void D(ke4 ke4) {
        ((HashSet) this.c).add(ke4);
        if (((ke4) this.b) == null) {
            this.b = ke4;
            pb5 c2 = ke4.b.c();
            ke4.y = c2;
            ge4 ge4 = ke4.s;
            int i = v0g.a;
            c2.getClass();
            ge4.getClass();
            ge4.obtainMessage(1, new ie4(l28.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
        }
    }

    public tb0 E() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(y());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = tr1.A(5)[optInt];
        if (i != 0) {
            Long valueOf = Long.valueOf(optLong);
            Long valueOf2 = Long.valueOf(optLong2);
            String str = i == 0 ? " registrationStatus" : "";
            if (str.isEmpty()) {
                return new tb0(i, valueOf2.longValue(), valueOf.longValue(), optString, optString2, optString3, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void F() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.c).close();
        } catch (IOException unused) {
        }
    }

    public void G(Set set) {
        SQLiteDatabase writableDatabase;
        ((String) this.b).getClass();
        try {
            writableDatabase = ((u74) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete((String) this.b, "name = ?", new String[]{(String) it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void H(pzc pzc) {
        pag pag = (pag) ((qae) this.c).get(pzc);
        if (pag != null) {
            pag.a &= -2;
        }
    }

    public void I(pzc pzc) {
        ya8 ya8 = (ya8) this.b;
        int k = ya8.k() - 1;
        while (true) {
            if (k < 0) {
                break;
            } else if (pzc == ya8.l(k)) {
                Object[] objArr = ya8.c;
                Object obj = objArr[k];
                Object obj2 = fqc.b;
                if (obj != obj2) {
                    objArr[k] = obj2;
                    ya8.a = true;
                }
            } else {
                k--;
            }
        }
        pag pag = (pag) ((qae) this.c).remove(pzc);
        if (pag != null) {
            pag.a = 0;
            pag.b = null;
            pag.c = null;
            pag.d.b(pag);
        }
    }

    public void J(long j, String str, long j2) {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((u74) this.c).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.b, (String) null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public cz K() {
        File file = (File) this.c;
        if (file.exists()) {
            File file2 = (File) this.b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                i8b.V("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new cz(file, 1);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new cz(file, 1);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 10:
                s3f s3f = (s3f) obj;
                s3f.getClass();
                try {
                    ((t3f) ((pk4) this.b).a).c(s3f);
                    return;
                } catch (ProcessingException unused) {
                    return;
                }
            default:
                try {
                    Object apply = ((zi6) this.b).apply(obj);
                    Objects.requireNonNull(apply, "The mapper function returned a null value.");
                    ((gce) this.c).a(apply);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    onError(th);
                    return;
                }
        }
    }

    public void b() {
        hb3 hb3 = (hb3) this.b;
        hb3.getClass();
        Object obj = hb3.c;
        gce gce = (gce) this.c;
        if (obj == null) {
            gce.onError(new NullPointerException("The value supplied is null"));
        } else {
            gce.a(obj);
        }
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 7:
                ((gce) this.c).c(mq4);
                return;
            default:
                ((gce) this.c).c(mq4);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [aqg, java.lang.Object] */
    public zz7 d(Uri uri) {
        Uri uri2;
        aqg aqg = (aqg) this.b;
        if (aqg == null || (uri2 = (Uri) aqg.b) == null || !uri2.equals(uri)) {
            zz7 d = ((fo0) this.c).d(uri);
            ? obj = new Object();
            obj.a = null;
            obj.b = uri;
            obj.c = d;
            this.b = obj;
            return d;
        }
        zz7 zz7 = (zz7) ((aqg) this.b).c;
        n79.o(zz7);
        return zz7;
    }

    public PointF e() {
        rf1 rf1 = ((ng5) this.c).g;
        WindowManager.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = rf1 != null ? rf1.getLayoutParams() : null;
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        }
        return layoutParams != null ? new PointF((float) layoutParams.x, (float) layoutParams.y) : kne.y(((rf1) this.b).getContext());
    }

    public void g(Throwable th) {
        int i = ((q3f) this.c).f;
        if (i != 2 || !(th instanceof CancellationException)) {
            f6e.q(i);
        }
    }

    public void h(jtc jtc, k4d k4d) {
        ((kw1) this.c).resumeWith(Result.m23constructorimpl(k4d));
    }

    public int i(Object obj) {
        s14 s14 = (s14) obj;
        if (((ub8) this.b).y) {
            return s14.f;
        }
        return ((d1g) this.c).i(s14.b.e0());
    }

    public dz6 k() {
        return new rs2((Lazy) this.c, ((q4) this.b).h(fu2.class));
    }

    public void l(float f, float f2) {
        ng5 ng5 = (ng5) this.c;
        rf1 rf1 = ng5.g;
        WindowManager.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = rf1 != null ? rf1.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.x = (int) f;
            layoutParams3.y = (int) f2;
            layoutParams = layoutParams3;
        }
        rf1 rf12 = (rf1) this.b;
        z68.c("FakePipController", "update call local pip", new Object[0]);
        if (layoutParams == null) {
            z68.c("FakePipController", "update call local pip was skip due to layout params are null", new Object[0]);
            return;
        }
        try {
            WindowManager c2 = ng5.c();
            if (c2 != null) {
                c2.updateViewLayout(rf12, layoutParams);
            }
        } catch (IllegalArgumentException e) {
            z68.f("FakePipController", "can't update call local pip", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v4, types: [l15, vye, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object, cmg] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (")".equals(defpackage.amg.b(r8, r11)) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(byte[] r20, int r21, int r22, defpackage.hze r23, defpackage.pk3 r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            int r6 = r1 + r22
            java.lang.Object r7 = r0.c
            l8b r7 = (defpackage.l8b) r7
            r8 = r20
            r7.E(r6, r8)
            r7.G(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            defpackage.smg.d(r7)     // Catch:{ ParserException -> 0x0444 }
        L_0x001e:
            java.nio.charset.Charset r6 = defpackage.x22.c
            java.lang.String r6 = r7.h(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0030:
            r9 = r2
            r8 = r3
        L_0x0032:
            if (r8 != r3) goto L_0x0056
            int r9 = r7.b
            java.nio.charset.Charset r8 = defpackage.x22.c
            java.lang.String r8 = r7.h(r8)
            if (r8 != 0) goto L_0x0040
            r8 = r2
            goto L_0x0032
        L_0x0040:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x004a
            r8 = r4
            goto L_0x0032
        L_0x004a:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0054
            r8 = r5
            goto L_0x0032
        L_0x0054:
            r8 = 3
            goto L_0x0032
        L_0x0056:
            r7.G(r9)
            if (r8 == 0) goto L_0x03f5
            if (r8 != r5) goto L_0x006a
        L_0x005d:
            java.nio.charset.Charset r8 = defpackage.x22.c
            java.lang.String r8 = r7.h(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0030
            goto L_0x005d
        L_0x006a:
            r9 = 0
            if (r8 != r4) goto L_0x03b3
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x03ab
            java.nio.charset.Charset r8 = defpackage.x22.c
            r7.h(r8)
            java.lang.Object r8 = r0.b
            amg r8 = (defpackage.amg) r8
            java.lang.StringBuilder r11 = r8.b
            r11.setLength(r2)
            int r12 = r7.b
        L_0x0083:
            java.nio.charset.Charset r13 = defpackage.x22.c
            java.lang.String r13 = r7.h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x03a7
            byte[] r13 = r7.a
            int r14 = r7.b
            l8b r8 = r8.a
            r8.E(r14, r13)
            r8.G(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00a0:
            defpackage.amg.c(r8)
            int r13 = r8.a()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x00b1
        L_0x00ae:
            r4 = r9
            goto L_0x0117
        L_0x00b1:
            java.nio.charset.Charset r13 = defpackage.x22.c
            java.lang.String r10 = r8.s(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00ae
        L_0x00c0:
            int r10 = r8.b
            java.lang.String r13 = defpackage.amg.b(r8, r11)
            if (r13 != 0) goto L_0x00c9
            goto L_0x00ae
        L_0x00c9:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d4
            r8.G(r10)
            r4 = r15
            goto L_0x0117
        L_0x00d4:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x0109
            int r10 = r8.b
            int r13 = r8.c
            r16 = r2
        L_0x00e2:
            if (r10 >= r13) goto L_0x00fa
            if (r16 != 0) goto L_0x00fa
            byte[] r4 = r8.a
            int r17 = r10 + 1
            byte r4 = r4[r10]
            char r4 = (char) r4
            r10 = 41
            if (r4 != r10) goto L_0x00f3
            r4 = r5
            goto L_0x00f4
        L_0x00f3:
            r4 = r2
        L_0x00f4:
            r16 = r4
            r10 = r17
            r4 = 2
            goto L_0x00e2
        L_0x00fa:
            int r10 = r10 + r3
            int r4 = r8.b
            int r10 = r10 - r4
            java.nio.charset.Charset r4 = defpackage.x22.c
            java.lang.String r4 = r8.s(r10, r4)
            java.lang.String r4 = r4.trim()
            goto L_0x010a
        L_0x0109:
            r4 = r9
        L_0x010a:
            java.lang.String r10 = defpackage.amg.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0117
            goto L_0x00ae
        L_0x0117:
            if (r4 == 0) goto L_0x039c
            java.lang.String r10 = defpackage.amg.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0125
            goto L_0x039c
        L_0x0125:
            cmg r10 = new cmg
            r10.<init>()
            r10.a = r15
            r10.b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.c = r13
            r10.d = r15
            r10.e = r9
            r10.g = r2
            r10.i = r2
            r10.j = r3
            r10.k = r3
            r10.l = r3
            r10.m = r3
            r10.n = r3
            r10.p = r3
            r10.q = r2
            boolean r13 = r15.equals(r4)
            if (r13 == 0) goto L_0x0151
            goto L_0x01b6
        L_0x0151:
            r13 = 91
            int r13 = r4.indexOf(r13)
            if (r13 == r3) goto L_0x0176
            java.util.regex.Pattern r14 = defpackage.amg.c
            java.lang.String r9 = r4.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x0172
            java.lang.String r9 = r9.group(r5)
            r9.getClass()
            r10.d = r9
        L_0x0172:
            java.lang.String r4 = r4.substring(r2, r13)
        L_0x0176:
            int r9 = defpackage.v0g.a
            java.lang.String r9 = "\\."
            java.lang.String[] r4 = r4.split(r9, r3)
            r9 = r4[r2]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r3) goto L_0x0196
            java.lang.String r14 = r9.substring(r2, r13)
            r10.b = r14
            int r13 = r13 + r5
            java.lang.String r9 = r9.substring(r13)
            r10.a = r9
            goto L_0x0198
        L_0x0196:
            r10.b = r9
        L_0x0198:
            int r9 = r4.length
            if (r9 <= r5) goto L_0x01b6
            int r9 = r4.length
            int r13 = r4.length
            if (r9 > r13) goto L_0x01a1
            r13 = r5
            goto L_0x01a2
        L_0x01a1:
            r13 = r2
        L_0x01a2:
            defpackage.n79.g(r13)
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r5, r9)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r4 = java.util.Arrays.asList(r4)
            r9.<init>(r4)
            r10.c = r9
        L_0x01b6:
            r4 = r2
            r9 = 0
        L_0x01b8:
            java.lang.String r13 = "}"
            if (r4 != 0) goto L_0x038a
            int r4 = r8.b
            java.lang.String r9 = defpackage.amg.b(r8, r11)
            if (r9 == 0) goto L_0x01cd
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            r14 = r2
            goto L_0x01ce
        L_0x01cd:
            r14 = r5
        L_0x01ce:
            if (r14 != 0) goto L_0x0382
            r8.G(r4)
            defpackage.amg.c(r8)
            java.lang.String r4 = defpackage.amg.a(r8, r11)
            boolean r17 = r15.equals(r4)
            if (r17 == 0) goto L_0x01e2
            goto L_0x0382
        L_0x01e2:
            java.lang.String r2 = ":"
            java.lang.String r3 = defpackage.amg.b(r8, r11)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01f0
            goto L_0x0382
        L_0x01f0:
            defpackage.amg.c(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L_0x01f9:
            java.lang.String r5 = ";"
            if (r3 != 0) goto L_0x0225
            int r0 = r8.b
            r22 = r3
            java.lang.String r3 = defpackage.amg.b(r8, r11)
            if (r3 != 0) goto L_0x0209
            r0 = 0
            goto L_0x0229
        L_0x0209:
            boolean r18 = r13.equals(r3)
            if (r18 != 0) goto L_0x021e
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0216
            goto L_0x021e
        L_0x0216:
            r2.append(r3)
            r0 = r19
            r3 = r22
            goto L_0x01f9
        L_0x021e:
            r8.G(r0)
            r3 = 1
            r0 = r19
            goto L_0x01f9
        L_0x0225:
            java.lang.String r0 = r2.toString()
        L_0x0229:
            if (r0 == 0) goto L_0x0382
            boolean r2 = r15.equals(r0)
            if (r2 == 0) goto L_0x0233
            goto L_0x0382
        L_0x0233:
            int r2 = r8.b
            java.lang.String r3 = defpackage.amg.b(r8, r11)
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0240
            goto L_0x0249
        L_0x0240:
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0382
            r8.G(r2)
        L_0x0249:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x025c
            r2 = 1
            int r0 = defpackage.o53.a(r0, r2)
            r10.f = r0
            r10.g = r2
            goto L_0x0382
        L_0x025c:
            r2 = 1
            java.lang.String r3 = "background-color"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x026f
            int r0 = defpackage.o53.a(r0, r2)
            r10.h = r0
            r10.i = r2
            goto L_0x0382
        L_0x026f:
            java.lang.String r3 = "ruby-position"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0290
            java.lang.String r3 = "over"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0283
            r10.p = r2
            goto L_0x0382
        L_0x0283:
            java.lang.String r2 = "under"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r0 = 2
            r10.p = r0
            goto L_0x0382
        L_0x0290:
            java.lang.String r2 = "text-combine-upright"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02b0
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x02ab
            java.lang.String r2 = "digits"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r0 = 0
            goto L_0x02ac
        L_0x02ab:
            r0 = 1
        L_0x02ac:
            r10.q = r0
            goto L_0x0382
        L_0x02b0:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02c5
            java.lang.String r2 = "underline"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r0 = 1
            r10.k = r0
            goto L_0x0382
        L_0x02c5:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02d5
            java.lang.String r0 = defpackage.o54.P(r0)
            r10.e = r0
            goto L_0x0382
        L_0x02d5:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = "bold"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0382
            r2 = 1
            r10.l = r2
            goto L_0x0382
        L_0x02ea:
            r2 = 1
            java.lang.String r3 = "font-style"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02ff
            java.lang.String r3 = "italic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0382
            r10.m = r2
            goto L_0x0382
        L_0x02ff:
            java.lang.String r2 = "font-size"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0382
            java.lang.String r2 = defpackage.o54.P(r0)
            java.util.regex.Pattern r3 = defpackage.amg.d
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x032e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid font-size: '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.i8b.V(r0)
            goto L_0x0382
        L_0x032e:
            r0 = 2
            java.lang.String r3 = r2.group(r0)
            r3.getClass()
            int r0 = r3.hashCode()
            switch(r0) {
                case 37: goto L_0x0355;
                case 3240: goto L_0x034a;
                case 3592: goto L_0x033f;
                default: goto L_0x033d;
            }
        L_0x033d:
            r0 = -1
            goto L_0x035f
        L_0x033f:
            java.lang.String r0 = "px"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0348
            goto L_0x033d
        L_0x0348:
            r0 = 2
            goto L_0x035f
        L_0x034a:
            java.lang.String r0 = "em"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0353
            goto L_0x033d
        L_0x0353:
            r0 = 1
            goto L_0x035f
        L_0x0355:
            java.lang.String r0 = "%"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x035e
            goto L_0x033d
        L_0x035e:
            r0 = 0
        L_0x035f:
            switch(r0) {
                case 0: goto L_0x0371;
                case 1: goto L_0x036c;
                case 2: goto L_0x0368;
                default: goto L_0x0362;
            }
        L_0x0362:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0368:
            r0 = 1
            r10.n = r0
            goto L_0x0375
        L_0x036c:
            r0 = 1
            r3 = 2
            r10.n = r3
            goto L_0x0375
        L_0x0371:
            r0 = 1
            r3 = 3
            r10.n = r3
        L_0x0375:
            java.lang.String r2 = r2.group(r0)
            r2.getClass()
            float r0 = java.lang.Float.parseFloat(r2)
            r10.o = r0
        L_0x0382:
            r0 = r19
            r4 = r14
            r2 = 0
            r3 = -1
            r5 = 1
            goto L_0x01b8
        L_0x038a:
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x0393
            r12.add(r10)
        L_0x0393:
            r0 = r19
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            r9 = 0
            goto L_0x00a0
        L_0x039c:
            r1.addAll(r12)
        L_0x039f:
            r0 = r19
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            goto L_0x0030
        L_0x03a7:
            r0 = r19
            goto L_0x0083
        L_0x03ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x03b3:
            r0 = 3
            if (r8 != r0) goto L_0x039f
            java.util.regex.Pattern r0 = defpackage.nmg.a
            java.nio.charset.Charset r0 = defpackage.x22.c
            java.lang.String r2 = r7.h(r0)
            if (r2 != 0) goto L_0x03c2
            r9 = 0
            goto L_0x03ef
        L_0x03c2:
            java.util.regex.Pattern r3 = defpackage.nmg.a
            java.util.regex.Matcher r4 = r3.matcher(r2)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x03d4
            r5 = 0
            emg r9 = defpackage.nmg.d(r5, r4, r7, r1)
            goto L_0x03ef
        L_0x03d4:
            r5 = 0
            java.lang.String r0 = r7.h(r0)
            if (r0 != 0) goto L_0x03dd
        L_0x03db:
            r9 = r5
            goto L_0x03ef
        L_0x03dd:
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r3 = r0.matches()
            if (r3 == 0) goto L_0x03db
            java.lang.String r2 = r2.trim()
            emg r9 = defpackage.nmg.d(r2, r0, r7, r1)
        L_0x03ef:
            if (r9 == 0) goto L_0x039f
            r6.add(r9)
            goto L_0x039f
        L_0x03f5:
            l15 r0 = new l15
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.a = r1
            int r1 = r6.size()
            r2 = 2
            int r1 = r1 * r2
            long[] r1 = new long[r1]
            r0.b = r1
            r1 = 0
        L_0x0410:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x042e
            java.lang.Object r3 = r6.get(r1)
            emg r3 = (defpackage.emg) r3
            int r4 = r1 * 2
            java.lang.Object r5 = r0.b
            long[] r5 = (long[]) r5
            long r7 = r3.b
            r5[r4] = r7
            r7 = 1
            int r4 = r4 + r7
            long r8 = r3.c
            r5[r4] = r8
            int r1 = r1 + r7
            goto L_0x0410
        L_0x042e:
            java.lang.Object r1 = r0.b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.c = r1
            java.util.Arrays.sort(r1)
            r1 = r23
            r2 = r24
            defpackage.ld9.S(r0, r1, r2)
            return
        L_0x0444:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox0.m(byte[], int, int, hze, pk3):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [aqg, java.lang.Object] */
    public zz7 n(byte[] bArr) {
        byte[] bArr2;
        aqg aqg = (aqg) this.b;
        if (aqg == null || (bArr2 = (byte[]) aqg.a) == null || !Arrays.equals(bArr2, bArr)) {
            zz7 n = ((fo0) this.c).n(bArr);
            ? obj = new Object();
            obj.a = bArr;
            obj.b = null;
            obj.c = n;
            this.b = obj;
            return n;
        }
        zz7 zz7 = (zz7) ((aqg) this.b).c;
        n79.o(zz7);
        return zz7;
    }

    public void o(jtc jtc, IOException iOException) {
        kw1 kw1 = (kw1) this.c;
        if (!kw1.isCancelled()) {
            IOException iOException2 = (IOException) this.b;
            if (iOException2 != null) {
                iOException2.initCause(iOException);
            }
            if (iOException2 != null) {
                iOException = iOException2;
            }
            Result.Companion companion = Result.Companion;
            kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(iOException)));
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 7:
                ((gce) this.c).onError(th);
                return;
            default:
                ((gce) this.c).onError(th);
                return;
        }
    }

    public int q() {
        return 1;
    }

    public void s(h97 h97, g97 g97, e97 e97) {
        if (((ArrayList) this.b) == null) {
            this.b = new ArrayList();
        }
        ((ArrayList) this.b).add(g97);
        if (((HashMap) this.c) == null) {
            this.c = new HashMap();
        }
        ((HashMap) this.c).put(h97, e97);
    }

    public void t(pzc pzc, ft ftVar) {
        qae qae = (qae) this.c;
        pag pag = (pag) qae.get(pzc);
        if (pag == null) {
            pag = pag.a();
            qae.put(pzc, pag);
        }
        pag.c = ftVar;
        pag.a |= 8;
    }

    public void u() {
        this.c = null;
        this.b = null;
    }

    public HashMap x() {
        Cursor query;
        try {
            ((String) this.b).getClass();
            query = ((u74) this.c).getReadableDatabase().query((String) this.b, o, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new mx0(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public File y() {
        if (((File) this.c) == null) {
            synchronized (this) {
                try {
                    if (((File) this.c) == null) {
                        hp5 hp5 = (hp5) this.b;
                        hp5.a();
                        File filesDir = hp5.a.getFilesDir();
                        this.c = new File(filesDir, "PersistedInstallation." + ((hp5) this.b).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.c;
    }

    public void z(long j) {
        SQLiteDatabase writableDatabase;
        u74 u74 = (u74) this.c;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (p2g.a(u74.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = u74.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                p2g.b(writableDatabase, 2, hexString, 1);
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.b));
                writableDatabase.execSQL("CREATE TABLE " + ((String) this.b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public /* synthetic */ ox0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ ox0(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ ox0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ox0(String str, cvg cvg, sx6 sx6) {
        this.a = 1;
        this.b = str;
        this.c = cvg;
    }

    public ox0(Context context) {
        p53 p53;
        this.a = 25;
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            p53 = p53.a;
        } else if (i != 32) {
            p53 = p53.c;
        } else {
            p53 = p53.b;
        }
        xme a2 = f6e.a(p53);
        this.c = a2;
        this.b = new etc(a2);
        context.registerComponentCallbacks(new ob2(2, (Object) this));
    }

    public ox0(bs6 bs6, View view) {
        this.a = 21;
        this.c = view;
    }

    public ox0(File file) {
        this.a = 2;
        this.c = file;
        this.b = new File(file.getPath() + ".bak");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [fbf] */
    /* JADX WARNING: type inference failed for: r0v9, types: [fbf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ox0(android.content.Context r4, java.lang.Object r5, java.util.LinkedHashSet r6) {
        /*
            r3 = this;
            r0 = 5
            r3.a = r0
            ekd r0 = new ekd
            r1 = 8
            r0.<init>(r1)
            r3.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.c = r1
            r3.b = r0
            boolean r0 = r5 instanceof defpackage.vu1
            if (r0 == 0) goto L_0x001d
            vu1 r5 = (defpackage.vu1) r5
            goto L_0x0037
        L_0x001d:
            defpackage.hd8.z()
            vu1 r5 = new vu1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x002f
            xu1 r0 = new xu1
            r0.<init>((android.content.Context) r4, (defpackage.f6e) r2)
            goto L_0x0034
        L_0x002f:
            wu1 r0 = new wu1
            r0.<init>((android.content.Context) r4, (defpackage.f6e) r2)
        L_0x0034:
            r5.<init>(r0)
        L_0x0037:
            java.util.Iterator r6 = r6.iterator()
        L_0x003b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            j3f r1 = new j3f
            java.lang.Object r2 = r3.b
            zq1 r2 = (defpackage.zq1) r2
            r1.<init>(r4, r0, r5, r2)
            java.lang.Object r2 = r3.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r0, r1)
            goto L_0x003b
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox0.<init>(android.content.Context, java.lang.Object, java.util.LinkedHashSet):void");
    }

    public ox0(hp5 hp5) {
        this.a = 19;
        this.b = hp5;
    }

    public ox0(int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.c = new qae();
                this.b = new ya8();
                return;
            case 27:
                this.c = new l8b();
                this.b = new amg();
                return;
            default:
                this.c = new HashSet();
                return;
        }
    }

    public ox0(np8 np8, Looper looper) {
        this.a = 16;
        this.b = np8;
        this.c = new Handler(looper, new xp4(4, this));
    }
}
