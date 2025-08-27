package defpackage;

import android.animation.ValueAnimator;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.util.Range;
import android.view.View;
import android.widget.EditText;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: ce  reason: default package */
public final class ce implements yn1, cla, lj0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;

    /* JADX WARNING: type inference failed for: r0v1, types: [tgg, java.lang.Object, urg] */
    public static urg g(qt1 qt1) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) qt1.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                range = null;
            }
            if (range != null) {
                return new ne(qt1);
            }
        }
        ? obj = new Object();
        obj.b = null;
        obj.o = null;
        obj.a = qt1;
        return obj;
    }

    public void a(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((View) this.b).getPaddingBottom(), i});
        ofInt.addUpdateListener(new z00(14, (Object) this));
        ofInt.addListener(new zg(this, i2, 1));
        ofInt.setDuration(100);
        ofInt.start();
        boolean k = k();
        xw3 xw3 = (xw3) this.w;
        xw3.x = k;
        xw3.a.d(((ArrayList) xw3.y).size() - 2, 1, (Object) null);
    }

    public void b() {
        boolean z = this.a;
        kw1 kw1 = (kw1) this.o;
        if (!z) {
            ts9 ts9 = ts9.FIRST_OR_DEFAULT;
            ts9 ts92 = (ts9) this.v;
            if (ts92 == ts9) {
                Result.Companion companion = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(this.w));
            } else if (kw1.isActive()) {
                Result.Companion companion2 = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + ts92))));
            }
        } else if (kw1.isActive()) {
            Result.Companion companion3 = Result.Companion;
            kw1.resumeWith(Result.m23constructorimpl(this.c));
        }
    }

    public void c(mq4 mq4) {
        this.b = mq4;
        ((kw1) this.o).k(new hw2(9, mq4));
    }

    public void d(Object obj) {
        ts9 ts9 = (ts9) this.v;
        int ordinal = ts9.ordinal();
        mq4 mq4 = null;
        kw1 kw1 = (kw1) this.o;
        if (ordinal == 0 || ordinal == 1) {
            if (!this.a) {
                this.a = true;
                kw1.resumeWith(Result.m23constructorimpl(obj));
                mq4 mq42 = (mq4) this.b;
                if (mq42 != null) {
                    mq4 = mq42;
                }
                mq4.dispose();
            }
        } else if (ordinal != 2 && ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (ts9 != ts9.SINGLE || !this.a) {
            this.c = obj;
            this.a = true;
        } else {
            if (kw1.isActive()) {
                Result.Companion companion = Result.Companion;
                kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + ts9))));
            }
            mq4 mq43 = (mq4) this.b;
            if (mq43 != null) {
                mq4 = mq43;
            }
            mq4.dispose();
        }
    }

    public void e(bi3 bi3) {
        ((ht6) this.w).v0.post(new vj6((Object) this, (Object) bi3, false, 28));
    }

    public IOException f(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            r(iOException);
        }
        bk3 bk3 = (bk3) this.o;
        if (z2) {
            if (iOException != null) {
                bk3.getClass();
            } else {
                bk3.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                bk3.getClass();
            } else {
                bk3.getClass();
            }
        }
        return ((jtc) this.c).k(this, z2, z, iOException);
    }

    public void h(jtc jtc, k4d k4d) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            boolean z = !k4d.isSuccessful();
            if (z) {
                int i = k4d.o;
                nd ndVar = (nd) ((ee) this.w).c.a.getValue();
                ndVar.getClass();
                ndVar.f("HTTP_ERROR", String.valueOf(i));
                if (i == 403 || i == 400) {
                    Pattern pattern = ee.d;
                    Locale locale = Locale.ENGLISH;
                    z68.f("ee", "Url expired try to get new one. Code = " + i, (Throwable) null);
                    ((de) this.c).b.e();
                    ee.h((ee) this.w, (de) this.c, (File) this.o);
                    ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                    u0g.c(k4d);
                }
            }
            ptc ptc = k4d.x;
            long n = ptc == null ? 0 : ptc.n();
            if (!z && ptc != null) {
                if (ptc.n() >= 0) {
                    Pattern pattern2 = ee.d;
                    z68.c("ee", "response content length: " + n, new Object[0]);
                    long length = ((File) this.o).length();
                    long j = n + length;
                    InputStream m = ptc.m();
                    try {
                        fileOutputStream = new FileOutputStream((File) this.o, true);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = null;
                        Exception exc = e;
                        inputStream = m;
                        e = exc;
                        try {
                            Pattern pattern3 = ee.d;
                            z68.f("ee", "exception while downloading file: " + e.getMessage(), (Throwable) null);
                            synchronized (((de) this.c).a) {
                                try {
                                    Iterator it = ((de) this.c).a.iterator();
                                    while (it.hasNext()) {
                                        ((v47) it.next()).l();
                                    }
                                } catch (Throwable th) {
                                    while (true) {
                                    }
                                    throw th;
                                }
                            }
                            ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                            u0g.c(k4d);
                            j4b.k(inputStream);
                            j4b.j(fileOutputStream);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream2 = inputStream;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        inputStream2 = m;
                        th = th;
                        ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                        u0g.c(k4d);
                        j4b.k(inputStream2);
                        j4b.j(fileOutputStream);
                        throw th;
                    }
                    try {
                        int i2 = mh3.$EnumSwitchMapping$0[((ee) this.w).c.c().ordinal()];
                        byte[] bArr = new byte[((i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? ConstantsKt.DEFAULT_BLOCK_SIZE : 16384)];
                        while (true) {
                            int read = m.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            length += (long) read;
                            synchronized (((de) this.c).a) {
                                try {
                                    Iterator it2 = ((de) this.c).a.iterator();
                                    while (it2.hasNext()) {
                                        ((v47) it2.next()).e(j, (((float) length) / ((float) j)) * 100.0f);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                        fileOutputStream.flush();
                        ee eeVar = (ee) this.w;
                        File e2 = ee.e(eeVar, (File) this.o, (File) this.v, this.a ? ee.f(eeVar, k4d) : null);
                        synchronized (((de) this.c).a) {
                            try {
                                Iterator it3 = ((de) this.c).a.iterator();
                                while (it3.hasNext()) {
                                    v47 v47 = (v47) it3.next();
                                    Pattern pattern4 = ee.d;
                                    z68.c("ee", "File download completed", new Object[0]);
                                    v47.j(e2);
                                }
                            } catch (Throwable th5) {
                                while (true) {
                                }
                                throw th5;
                            }
                        }
                        ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                        u0g.c(k4d);
                        j4b.k(m);
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream2 = m;
                        th = th;
                        ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                        u0g.c(k4d);
                        j4b.k(inputStream2);
                        j4b.j(fileOutputStream);
                        throw th;
                    }
                    j4b.j(fileOutputStream);
                    return;
                }
            }
            Pattern pattern5 = ee.d;
            Locale locale2 = Locale.ENGLISH;
            z68.f("ee", "responseFailed = " + z + " response.body().contentLength() = " + n + " tempOutputFile.length() " + ((File) this.o).length(), (Throwable) null);
            ((ee) this.w).c.d("Exception in FileDownloader onResponse");
            if (ee.d((ee) this.w, k4d, ((File) this.o).length())) {
                ee eeVar2 = (ee) this.w;
                File e4 = ee.e(eeVar2, (File) this.o, (File) this.v, this.a ? ee.f(eeVar2, k4d) : null);
                synchronized (((de) this.c).a) {
                    try {
                        Iterator it4 = ((de) this.c).a.iterator();
                        while (it4.hasNext()) {
                            v47 v472 = (v47) it4.next();
                            Pattern pattern6 = ee.d;
                            z68.c("ee", "File already fully downloaded", new Object[0]);
                            v472.j(e4);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                u0g.c(k4d);
            }
            z68.f("ee", "server response code = " + k4d.o + ", download failed", (Throwable) null);
            synchronized (((de) this.c).a) {
                try {
                    Iterator it5 = ((de) this.c).a.iterator();
                    while (it5.hasNext()) {
                        ((v47) it5.next()).a();
                    }
                } catch (Throwable th8) {
                    while (true) {
                    }
                    throw th8;
                }
            }
            ((ee) this.w).getClass();
            ((File) this.o).delete();
            ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
            u0g.c(k4d);
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
            ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
            u0g.c(k4d);
            j4b.k(inputStream2);
            j4b.j(fileOutputStream);
            throw th;
        }
    }

    public lz8 i(int i) {
        HashMap hashMap = (HashMap) this.o;
        lz8 lz8 = (lz8) hashMap.get(Integer.valueOf(i));
        if (lz8 != null) {
            return lz8;
        }
        lz8 lz82 = (lz8) m(i).get();
        lz82.e((ece) ((gze) this.w));
        lz82.b(this.a);
        hashMap.put(Integer.valueOf(i), lz82);
        return lz82;
    }

    public void j() {
        Object obj;
        EditText editText = (EditText) this.c;
        if (editText.hasSelection()) {
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            Editable text = editText.getText();
            SpannableString valueOf = text != null ? SpannableString.valueOf(text) : null;
            jf8[] jf8Arr = valueOf != null ? (jf8[]) valueOf.getSpans(selectionStart, selectionEnd, jf8.class) : null;
            if (jf8Arr != null) {
                for (jf8 jf8 : jf8Arr) {
                    Class<?> cls = jf8.getClass();
                    Iterator it = ((ArrayList) ((xw3) this.w).y).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual((Object) ((ze8) obj).v, (Object) cls)) {
                            break;
                        }
                    }
                    ze8 ze8 = (ze8) obj;
                    if (ze8 != null) {
                        ze8.c = true;
                    }
                }
            }
        }
    }

    public boolean k() {
        jf8[] jf8Arr;
        Editable text = ((EditText) this.c).getText();
        boolean z = false;
        if (text == null || (jf8Arr = (jf8[]) text.getSpans(0, text.length(), jf8.class)) == null) {
            return false;
        }
        if (jf8Arr.length == 0) {
            z = true;
        }
        return !z;
    }

    public boolean l(Class cls) {
        EditText editText = (EditText) this.c;
        Editable text = editText.getText();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        int i = 0;
        while (i != selectionEnd) {
            int i2 = selectionStart + i;
            int i3 = i2 + 1;
            if (i3 > selectionEnd) {
                break;
            } else if (text.getSpans(i2, i3, cls).length == 0) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    public s2f m(int i) {
        s2f s2f;
        s2f bh4;
        HashMap hashMap = (HashMap) this.c;
        s2f s2f2 = (s2f) hashMap.get(Integer.valueOf(i));
        if (s2f2 != null) {
            return s2f2;
        }
        g74 g74 = (g74) this.v;
        g74.getClass();
        Class<lz8> cls = lz8.class;
        if (i != 0) {
            if (i == 1) {
                s2f = new bh4(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), g74, 1);
            } else if (i == 2) {
                s2f = new bh4(HlsMediaSource$Factory.class.asSubclass(cls), g74, 2);
            } else if (i == 3) {
                bh4 = new ch4(0, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls));
            } else if (i == 4) {
                s2f = new bh4(this, g74, 3);
            } else {
                throw new IllegalArgumentException(wj6.h(i, "Unrecognized contentType: "));
            }
            hashMap.put(Integer.valueOf(i), s2f);
            return s2f;
        }
        bh4 = new bh4(DashMediaSource$Factory.class.asSubclass(cls), g74, 0);
        s2f = bh4;
        hashMap.put(Integer.valueOf(i), s2f);
        return s2f;
    }

    public j4d n(boolean z) {
        try {
            j4d e = ((s95) this.w).e(z);
            if (e != null) {
                e.m = this;
            }
            return e;
        } catch (IOException e2) {
            ((bk3) this.o).getClass();
            r(e2);
            throw e2;
        }
    }

    public void o(jtc jtc, IOException iOException) {
        try {
            Pattern pattern = ee.d;
            z68.h("ee", iOException, "exception while download request: %s", (y2d) this.b);
            nd ndVar = (nd) ((ee) this.w).c.a.getValue();
            ndVar.getClass();
            ndVar.f("HTTP_ERROR", iOException.getClass().getSimpleName());
            synchronized (((de) this.c).a) {
                try {
                    Iterator it = ((de) this.c).a.iterator();
                    while (it.hasNext()) {
                        ((v47) it.next()).l();
                    }
                } catch (Throwable th) {
                    while (true) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                Pattern pattern2 = ee.d;
                z68.f("ee", "onFailure: failed to process on failure", th2);
            } catch (Throwable th3) {
                ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
                throw th3;
            }
        }
        ee.g((ee) this.w, (de) this.c, ((File) this.o).getAbsolutePath());
    }

    public void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        ((kw1) this.o).resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
    }

    public void p(boolean z) {
        xw3 xw3 = (xw3) this.w;
        Iterator it = ((ArrayList) xw3.y).iterator();
        while (it.hasNext()) {
            ((ze8) it.next()).o = z;
        }
        if (!z || !this.a) {
            Iterator it2 = ((ArrayList) xw3.y).iterator();
            while (it2.hasNext()) {
                ((ze8) it2.next()).c = false;
            }
            xw3.m();
            return;
        }
        this.a = false;
        j();
        xw3.m();
        this.a = true;
    }

    public void q(do1 do1, yrg yrg) {
        db0 e;
        if (!this.a) {
            synchronized (((zrg) this.o)) {
                ((zrg) this.o).f(1.0f);
                e = db0.e((zrg) this.o);
            }
            s(e);
            do1.d(new Exception("Camera is not active."));
            return;
        }
        ((urg) this.w).k(yrg.c(), do1);
        ((lr1) this.b).A();
    }

    public void r(IOException iOException) {
        ((t95) this.v).b(iOException);
        mtc f = ((s95) this.w).f();
        jtc jtc = (jtc) this.c;
        synchronized (f) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(f.f != null) || (iOException instanceof ConnectionShutdownException)) {
                        f.i = true;
                        if (f.l == 0) {
                            if (iOException != null) {
                                mtc.d(jtc.y0, f.q, iOException);
                            }
                            f.k++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = f.m + 1;
                    f.m = i;
                    if (i > 1) {
                        f.i = true;
                        f.k++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !jtc.v0) {
                    f.i = true;
                    f.k++;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void s(db0 db0) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        fz9 fz9 = (fz9) this.v;
        if (myLooper == mainLooper) {
            fz9.k(db0);
        } else {
            fz9.i(db0);
        }
    }

    public void t(bi3 bi3) {
        kvg kvg = (kvg) ((ht6) this.w).X.get((bm) this.c);
        if (kvg != null) {
            kvg.n(bi3);
        }
    }
}
