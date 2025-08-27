package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Process;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hsg  reason: default package */
public abstract class hsg {
    public static final String[][] a = {new String[]{":-)", "😊"}, new String[]{":)", "😊"}, new String[]{":-(", "😞"}, new String[]{":(", "😞"}, new String[]{";-)", "😉"}, new String[]{";)", "😉"}, new String[]{":-D", "😂"}, new String[]{":D", "😂"}, new String[]{":-@", "😞"}, new String[]{":@", "😞"}, new String[]{"^o)", "😑"}, new String[]{":-S", "🙈"}, new String[]{":S", "🙈"}, new String[]{"*-)", "😏"}, new String[]{"*)", "😏"}, new String[]{":-|", "😠"}, new String[]{":|", "😠"}, new String[]{"8oI", "😡"}, new String[]{";(", "😢"}, new String[]{":'(", "😢"}, new String[]{":-P", "😜"}, new String[]{":P", "😜"}, new String[]{":-$", "😊"}, new String[]{":$", "😊"}, new String[]{":-O", "😳"}, new String[]{":O", "😳"}, new String[]{"|-)", "😪"}, new String[]{"|)", "😪"}, new String[]{"(ch)", "😊"}, new String[]{"(lo)", "😍"}, new String[]{"(sr)", "😔"}, new String[]{"|-(", "😴"}, new String[]{"|(", "😴"}, new String[]{"(H)", "😎"}, new String[]{"(hu)", "😬"}, new String[]{"(tr)", "😞"}, new String[]{"(md)", "😵"}, new String[]{"(fr)", "😄"}, new String[]{"(dt)", "😟"}, new String[]{"(sc)", "😬"}, new String[]{"(Y)", "👍"}, new String[]{"(N)", "👎"}, new String[]{"(v)", "✌"}, new String[]{"(L)", "❤"}, new String[]{"(U)", "💔"}, new String[]{"(K)", "💋"}, new String[]{"(F)", "⚘"}, new String[]{"(*)", "★"}, new String[]{"(^)", "🎂"}, new String[]{"(G)", "🎁"}, new String[]{"(B)", "🍺"}, new String[]{"(D)", "🍸"}, new String[]{"(CC)", "☕"}, new String[]{"(pi)", "🍕"}, new String[]{"(pl)", "🍴"}, new String[]{"(ic)", "🍦"}, new String[]{"($)", "💰"}, new String[]{"(co)", "💻"}, new String[]{"(so)", "⚽"}, new String[]{"(te)", "🎾"}, new String[]{"(nt)", "♬"}, new String[]{"(I)", "💡"}, new String[]{"(E)", "✉"}, new String[]{"(Z)", "👦"}, new String[]{"(X)", "👧"}, new String[]{"(S)", "🌙"}};
    public static final String[] b = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] c = {44100, 48000, 32000};
    public static final int[] d = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] g = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] h = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final gga i = new gga(20);
    public static qyg j = null;
    public static Constructor k = null;
    public static Method l = null;
    public static Method m = null;
    public static final String n = "hsg";

    public static int A(int i2, g1g g1g) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return g1g.v() + 1;
            case 7:
                return g1g.A() + 1;
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

    public static long B(g1g g1g, int i2, int i3) {
        g1g.H(i2);
        if (g1g.c() < 5) {
            return -9223372036854775807L;
        }
        int h2 = g1g.h();
        if ((8388608 & h2) != 0 || ((2096896 & h2) >> 8) != i3 || (h2 & 32) == 0 || g1g.v() < 7 || g1g.c() < 7 || (g1g.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        g1g.g(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void C(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(wj6.h(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void D(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b(textView, drawable);
        b(textView, drawable2);
        b(textView, drawable3);
        b(textView, drawable4);
    }

    public static final void E(Field field, Function0 function0) {
        field.set((Object) null, new js7(new ec3(3, function0)));
    }

    public static void F(Context context, Uri uri, String str) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            hr6 hr6 = new hr6(context);
            ((Intent) hr6.b).setType(str);
            hr6.t(uri);
            hr6.w();
            obj = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r1 = Result.m26exceptionOrNullimpl(obj);
        if (r1 != null) {
            z68.f(n, "shareMedia: failed", r1);
        }
    }

    public static void G(Context context, CharSequence charSequence) {
        Object obj;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            hr6 hr6 = new hr6(context);
            ((Intent) hr6.b).setType(HTTP.PLAIN_TEXT_TYPE);
            hr6.u(charSequence);
            Intent q = q(context, hr6.o());
            if (q != null) {
                context.startActivity(q);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            obj = Result.m23constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r3 = Result.m26exceptionOrNullimpl(obj);
        if (r3 != null) {
            z68.f(n, "showInviteDialog error", r3);
        }
    }

    public static final void H(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, length, dl.class);
            }
        } catch (Throwable unused) {
        }
        if (objArr == null) {
            objArr = new dl[0];
        }
        for (Object obj : objArr) {
            dl dlVar = (dl) obj;
            cl clVar = dlVar.y;
            Drawable b2 = clVar.b();
            RLottieDrawable rLottieDrawable = clVar.v0;
            if (b2 == rLottieDrawable && rLottieDrawable != null) {
                rLottieDrawable.addParentView(imageReceiver);
            }
            cl clVar2 = dlVar.y;
            clVar2.setCallback(view);
            clVar2.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void I(android.text.Layout r6, one.me.rlottie.ImageReceiver r7) {
        /*
            java.lang.CharSequence r6 = r6.getText()
            int r0 = r6.length()
            r1 = 0
            r2 = 0
            boolean r3 = r6 instanceof android.text.Spanned     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0011
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x001b }
            goto L_0x0012
        L_0x0011:
            r6 = r1
        L_0x0012:
            if (r6 == 0) goto L_0x001b
            java.lang.Class<dl> r3 = defpackage.dl.class
            java.lang.Object[] r6 = r6.getSpans(r2, r0, r3)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r6 = r1
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            dl[] r6 = new defpackage.dl[r2]
        L_0x0020:
            int r0 = r6.length
        L_0x0021:
            if (r2 >= r0) goto L_0x0047
            r3 = r6[r2]
            dl r3 = (defpackage.dl) r3
            cl r4 = r3.y
            r4.setCallback(r1)
            cl r3 = r3.y
            one.me.rlottie.RLottieDrawable r4 = r3.v0
            if (r4 == 0) goto L_0x0035
            r4.removeParentView(r7)
        L_0x0035:
            one.me.rlottie.RLottieDrawable r4 = r3.v0
            if (r4 == 0) goto L_0x0041
            boolean r4 = r4.hasParentViews()
            r5 = 1
            if (r4 != r5) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r3.stop()
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsg.I(android.text.Layout, one.me.rlottie.ImageReceiver):void");
    }

    public static JSONArray J(Iterable iterable) {
        String str;
        String str2;
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fxd fxd = (fxd) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", (Object) fxd.b);
            jSONObject.put("versionCode", fxd.a);
            jSONObject.put("environment", (Object) fxd.c);
            jSONObject.put("sessionUuid", (Object) fxd.d);
            jSONObject.put("processName", (Object) fxd.e);
            int i2 = fxd.f;
            if (i2 == 1) {
                str = "BLANK";
            } else if (i2 == 2) {
                str = "CRASH";
            } else if (i2 == 3) {
                str = "ANR";
            } else if (i2 == 4) {
                str = "NATIVE";
            } else {
                throw null;
            }
            jSONObject.put("status", (Object) str);
            e4e e4e = fxd.g;
            if (e4e == null) {
                str2 = null;
            } else if (Intrinsics.areEqual((Object) e4e, (Object) e4e.c)) {
                str2 = "FATAL";
            } else if (Intrinsics.areEqual((Object) e4e, (Object) e4e.o)) {
                str2 = "ERROR";
            } else if (Intrinsics.areEqual((Object) e4e, (Object) e4e.v)) {
                str2 = "WARNING";
            } else if (Intrinsics.areEqual((Object) e4e, (Object) e4e.w)) {
                str2 = "NOTICE";
            } else if (Intrinsics.areEqual((Object) e4e, (Object) e4e.x)) {
                str2 = "INFO";
            } else {
                Intrinsics.areEqual((Object) e4e, (Object) e4e.y);
                str2 = "DEBUG";
            }
            jSONObject.put("maxSeverity", (Object) str2);
            jSONObject.put("isInBackground", fxd.h);
            jSONArray.put((Object) jSONObject);
        }
        return jSONArray;
    }

    public static w28 K(Object obj) {
        return new w28(obj.getClass().getSimpleName(), 12);
    }

    public static final void L(fwf fwf) {
        fwf.e(z5a.class, new zid(18));
        fwf.e(vne.class, new zid(19));
        fwf.e(nf1.class, new zid(20));
        fwf.e(ec8.class, new zid(21));
        fwf.e(ecb.class, new zid(22));
        fwf.e(xcb.class, new zid(23));
        fwf.e(fi0.class, new zid(24));
        fwf.e(tq1.class, new zid(25));
        fwf.e(sfg.class, new zid(26));
        fwf.e(wfg.class, new zid(16));
        fwf.e(g99.class, new zid(17));
    }

    public static Object M(Task task) {
        if (task.h()) {
            return task.f();
        }
        if (((s7h) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }

    public static final int a(int i2, int i3, int i4) {
        int i5 = i2 - (i2 % 16);
        int i6 = i5 / i3;
        if (i6 == 9) {
            return i5;
        }
        int i7 = i3 * 9;
        int i8 = i7 % 16;
        if (i8 == 0) {
            return i7;
        }
        int i9 = i7 - i8;
        int i10 = 9 - i6;
        int i11 = i4 - i9;
        return (i10 <= 0 || i11 <= 0) ? i9 : i9 + (Math.min(i10, i11 / 16) * 16);
    }

    public static void b(View view, Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            Objects.requireNonNull(animationDrawable);
            view.post(new ne4(8, animationDrawable));
        }
    }

    public static Object c(Task task) {
        vzg.l("Must not be called on the main application thread");
        vzg.k();
        vzg.n(task, "Task must not be null");
        if (task.g()) {
            return M(task);
        }
        bpa bpa = new bpa(16);
        ep4 ep4 = xdf.b;
        task.d(ep4, bpa);
        task.c(ep4, bpa);
        task.a(ep4, bpa);
        ((CountDownLatch) bpa.b).await();
        return M(task);
    }

    public static Object d(Task task, long j2, TimeUnit timeUnit) {
        vzg.l("Must not be called on the main application thread");
        vzg.k();
        vzg.n(task, "Task must not be null");
        vzg.n(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return M(task);
        }
        bpa bpa = new bpa(16);
        ep4 ep4 = xdf.b;
        task.d(ep4, bpa);
        task.c(ep4, bpa);
        task.a(ep4, bpa);
        if (((CountDownLatch) bpa.b).await(j2, timeUnit)) {
            return M(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final int e(RecyclerView recyclerView, int i2, int i3) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        return (width - (i2 * i3)) / RangesKt.coerceAtLeast(i3 - 1, 1);
    }

    public static s7h f(Callable callable, Executor executor) {
        vzg.n(executor, "Executor must not be null");
        s7h s7h = new s7h();
        executor.execute(new r1h(4, (Object) s7h, (Object) callable));
        return s7h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.v() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(defpackage.g1g r20, defpackage.uq5 r21, int r22, defpackage.yl4 r23) {
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
            long r5 = r20.D()     // Catch:{ NumberFormatException -> 0x00c3 }
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
            int r5 = A(r5, r0)
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
            int r2 = r20.v()
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
            int r1 = r20.v()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = defpackage.t0g.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = defpackage.t0g.n
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsg.g(g1g, uq5, int, yl4):boolean");
    }

    public static ea6 h(MediaFormat mediaFormat) {
        float f2;
        byte[] bArr;
        ba6 ba6 = new ba6();
        ba6.m = vq9.l(mediaFormat.getString("mime"));
        ba6.d = mediaFormat.getString("language");
        ba6.h = t(mediaFormat, "max-bitrate", -1);
        ba6.g = t(mediaFormat, "bitrate", -1);
        ba6.i = mediaFormat.getString("codecs-string");
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                f2 = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                f2 = (float) mediaFormat.getInteger("frame-rate");
            }
        } else {
            f2 = -1.0f;
        }
        ba6.u = f2;
        ba6.s = t(mediaFormat, "width", -1);
        ba6.t = t(mediaFormat, "height", -1);
        ba6.w = (!mediaFormat.containsKey("sar-width") || !mediaFormat.containsKey("sar-height")) ? 1.0f : ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        ba6.n = t(mediaFormat, "max-input-size", -1);
        int i2 = 0;
        ba6.v = t(mediaFormat, "rotation-degrees", 0);
        m53 m53 = null;
        if (v0g.a >= 24) {
            int t = t(mediaFormat, "color-standard", -1);
            int t2 = t(mediaFormat, "color-range", -1);
            int t3 = t(mediaFormat, "color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = null;
            }
            if (!(t == -1 && t2 == -1 && t3 == -1 && bArr == null)) {
                m53 = new m53(t, t2, t3, -1, -1, bArr);
            }
        }
        ba6.z = m53;
        ba6.B = t(mediaFormat, "sample-rate", -1);
        ba6.A = t(mediaFormat, "channel-count", -1);
        ba6.C = t(mediaFormat, "pcm-encoding", -1);
        m5a.m(4, "initialCapacity");
        int i3 = 0;
        Object[] objArr = new Object[4];
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i2);
            if (byteBuffer2 == null) {
                ba6.p = tb7.n(i3, objArr);
                return new ea6(ba6);
            }
            byte[] bArr3 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr3);
            byteBuffer2.rewind();
            int i4 = i3 + 1;
            Object[] copyOf = objArr.length < i4 ? Arrays.copyOf(objArr, jb7.h(objArr.length, i4)) : objArr;
            copyOf[i3] = bArr3;
            i2++;
            i3 = i4;
            objArr = copyOf;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r4 != 22) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaFormat i(defpackage.ea6 r8) {
        /*
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            int r1 = r8.i
            java.lang.String r2 = "bitrate"
            x(r0, r2, r1)
            java.lang.String r1 = "max-bitrate"
            int r2 = r8.h
            x(r0, r1, r2)
            java.lang.String r1 = "channel-count"
            int r2 = r8.B
            x(r0, r1, r2)
            m53 r1 = r8.A
            w(r0, r1)
            java.lang.String r1 = r8.n
            if (r1 == 0) goto L_0x0028
            java.lang.String r2 = "mime"
            r0.setString(r2, r1)
        L_0x0028:
            java.lang.String r1 = r8.j
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = "codecs-string"
            r0.setString(r2, r1)
        L_0x0031:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r8.v
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "frame-rate"
            r0.setFloat(r1, r2)
        L_0x003e:
            java.lang.String r1 = "width"
            int r2 = r8.t
            x(r0, r1, r2)
            java.lang.String r1 = "height"
            int r2 = r8.u
            x(r0, r1, r2)
            java.util.List r1 = r8.q
            C(r0, r1)
            r1 = 0
            r2 = -1
            r3 = 2
            int r4 = r8.D
            if (r4 != r2) goto L_0x0059
            goto L_0x0079
        L_0x0059:
            java.lang.String r2 = "exo-pcm-encoding-int"
            x(r0, r2, r4)
            if (r4 == 0) goto L_0x0073
            if (r4 == r3) goto L_0x0071
            r2 = 3
            if (r4 == r2) goto L_0x0074
            r2 = 4
            if (r4 == r2) goto L_0x0074
            r2 = 21
            if (r4 == r2) goto L_0x0074
            r2 = 22
            if (r4 == r2) goto L_0x0074
            goto L_0x0079
        L_0x0071:
            r2 = r3
            goto L_0x0074
        L_0x0073:
            r2 = r1
        L_0x0074:
            java.lang.String r4 = "pcm-encoding"
            r0.setInteger(r4, r2)
        L_0x0079:
            java.lang.String r2 = r8.d
            if (r2 == 0) goto L_0x0082
            java.lang.String r4 = "language"
            r0.setString(r4, r2)
        L_0x0082:
            java.lang.String r2 = "max-input-size"
            int r4 = r8.o
            x(r0, r2, r4)
            java.lang.String r2 = "sample-rate"
            int r4 = r8.C
            x(r0, r2, r4)
            java.lang.String r2 = "caption-service-number"
            int r4 = r8.G
            x(r0, r2, r4)
            java.lang.String r2 = "rotation-degrees"
            int r4 = r8.w
            r0.setInteger(r2, r4)
            int r2 = r8.e
            r4 = r2 & 4
            r5 = 1
            if (r4 == 0) goto L_0x00a7
            r4 = r5
            goto L_0x00a8
        L_0x00a7:
            r4 = r1
        L_0x00a8:
            java.lang.String r6 = "is-autoselect"
            r0.setInteger(r6, r4)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x00b3
            r4 = r5
            goto L_0x00b4
        L_0x00b3:
            r4 = r1
        L_0x00b4:
            java.lang.String r6 = "is-default"
            r0.setInteger(r6, r4)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00bd
            r1 = r5
        L_0x00bd:
            java.lang.String r2 = "is-forced-subtitle"
            r0.setInteger(r2, r1)
            java.lang.String r1 = "encoder-delay"
            int r2 = r8.E
            r0.setInteger(r1, r2)
            java.lang.String r1 = "encoder-padding"
            int r2 = r8.F
            r0.setInteger(r1, r2)
            java.lang.String r1 = "exo-pixel-width-height-ratio-float"
            float r8 = r8.x
            r0.setFloat(r1, r8)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 >= 0) goto L_0x00e3
            float r1 = (float) r3
            float r8 = r8 * r1
            int r5 = (int) r8
            goto L_0x00ef
        L_0x00e3:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ee
            float r1 = (float) r3
            float r1 = r1 / r8
            int r5 = (int) r1
            r7 = r5
            r5 = r3
            r3 = r7
            goto L_0x00ef
        L_0x00ee:
            r3 = r5
        L_0x00ef:
            java.lang.String r8 = "sar-width"
            r0.setInteger(r8, r5)
            java.lang.String r8 = "sar-height"
            r0.setInteger(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsg.i(ea6):android.media.MediaFormat");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [fr4, java.lang.Object] */
    public static final hs7 j(Function0 function0) {
        d6a d6a = new d6a(3, (Object) new u6h(12, function0));
        if (d6a instanceof hs7) {
            return (hs7) d6a;
        }
        ? obj = new Object();
        obj.b = fr4.c;
        obj.a = d6a;
        return obj;
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final void l(tz9 tz9) {
        tz9.setValue(new r5a());
    }

    public static final void m(ViewPager2 viewPager2) {
        RecyclerView recyclerView = (RecyclerView) SequencesKt.firstOrNull(SequencesKt.filter(new mag(0, viewPager2), m61.y0));
        if (recyclerView != null) {
            recyclerView.setId(dad.R0);
        }
    }

    public static s7h n(Exception exc) {
        s7h s7h = new s7h();
        s7h.m(exc);
        return s7h;
    }

    public static s7h o(Object obj) {
        s7h s7h = new s7h();
        s7h.n(obj);
        return s7h;
    }

    public static ArrayList p(String str) {
        int i2;
        e4e e4e;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            String string = jSONObject.getString("versionName");
            long j2 = jSONObject.getLong("versionCode");
            String optString = jSONObject.optString("environment", "");
            String str2 = optString.length() > 0 ? optString : null;
            String optString2 = jSONObject.optString("sessionUuid", "");
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = UUID.randomUUID().toString();
            }
            String optString3 = jSONObject.optString("processName", "");
            if (optString3.length() <= 0) {
                optString3 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 != null) {
                if (string2.equals("BLANK")) {
                    i2 = 1;
                } else if (string2.equals("CRASH")) {
                    i2 = 2;
                } else if (string2.equals("ANR")) {
                    i2 = 3;
                } else if (string2.equals("NATIVE")) {
                    i2 = 4;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                String optString4 = jSONObject.optString("maxSeverity", "");
                if (optString4.length() <= 0) {
                    optString4 = null;
                }
                if (optString4 != null) {
                    int hashCode = optString4.hashCode();
                    e4e = e4e.y;
                    switch (hashCode) {
                        case -1986360616:
                            if (optString4.equals("NOTICE")) {
                                e4e = e4e.w;
                                break;
                            } else {
                                break;
                            }
                        case 2251950:
                            if (optString4.equals("INFO")) {
                                e4e = e4e.x;
                                break;
                            } else {
                                break;
                            }
                        case 64921139:
                            boolean equals = optString4.equals("DEBUG");
                            break;
                        case 66247144:
                            if (optString4.equals("ERROR")) {
                                e4e = e4e.o;
                                break;
                            } else {
                                break;
                            }
                        case 66665700:
                            if (optString4.equals("FATAL")) {
                                e4e = e4e.c;
                                break;
                            } else {
                                break;
                            }
                        case 1842428796:
                            if (optString4.equals("WARNING")) {
                                e4e = e4e.v;
                                break;
                            } else {
                                break;
                            }
                    }
                } else {
                    e4e = null;
                }
                arrayList.add(new fxd(j2, string, str2, optString2, optString3, i2, e4e, jSONObject.optBoolean("isInBackground")));
                i3++;
            } else {
                throw new NullPointerException("Name is null");
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.content.pm.ResolveInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.content.pm.ResolveInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.content.pm.ResolveInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.content.pm.ResolveInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[EDGE_INSN: B:20:0x0045->B:13:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent q(android.content.Context r5, android.content.Intent r6) {
        /*
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r0 = 0
            java.util.List r5 = r5.queryIntentActivities(r6, r0)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            android.content.Intent r0 = android.content.Intent.createChooser(r6, r1)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r5.next()
            r3 = r2
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            java.lang.String r4 = "org.telegram.messenger"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "org.telegram.messenger.beta"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "org.telegram.messenger.web"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x001b
        L_0x0044:
            r1 = r2
        L_0x0045:
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            if (r1 == 0) goto L_0x0081
            java.lang.Object r5 = r6.clone()
            android.content.Intent r5 = (android.content.Intent) r5
            android.content.pm.ActivityInfo r6 = r1.activityInfo
            java.lang.String r6 = r6.packageName
            r5.setPackage(r6)
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r3 = r2.packageName
            java.lang.String r2 = r2.name
            r6.<init>(r3, r2)
            r5.setComponent(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r6)
            android.content.pm.LabeledIntent r6 = new android.content.pm.LabeledIntent
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r2 = r2.packageName
            int r3 = r1.labelRes
            int r1 = r1.icon
            r6.<init>(r5, r2, r3, r1)
            android.content.pm.LabeledIntent[] r5 = new android.content.pm.LabeledIntent[]{r6}
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            java.lang.String r6 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r6, r5)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsg.q(android.content.Context, android.content.Intent):android.content.Intent");
    }

    public static final Field r(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & -17);
            return declaredField;
        } catch (Throwable th) {
            z68.f("ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), th);
            return null;
        }
    }

    public static int s(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & -2097152) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = c[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? d[i5 - 1] : e[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? f[i5 - 1] : g[i5 - 1] : h[i5 - 1];
        int i10 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static int t(MediaFormat mediaFormat, String str, int i2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i2;
    }

    public static Intent u(Context context, boolean z) {
        if (!z) {
            return new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), (String) null));
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static final int v(usd usd, usd[] usdArr) {
        int hashCode = (usd.a().hashCode() * 31) + Arrays.hashCode(usdArr);
        xsd xsd = new xsd(usd, 0);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!xsd.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String a2 = ((usd) xsd.next()).a();
            if (a2 != null) {
                i4 = a2.hashCode();
            }
            i3 = i5 + i4;
        }
        xsd xsd2 = new xsd(usd, 0);
        while (xsd2.hasNext()) {
            int i6 = i2 * 31;
            kne kind = ((usd) xsd2.next()).getKind();
            i2 = i6 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }

    public static void w(MediaFormat mediaFormat, m53 m53) {
        if (m53 != null) {
            x(mediaFormat, "color-transfer", m53.c);
            x(mediaFormat, "color-standard", m53.a);
            x(mediaFormat, "color-range", m53.b);
            byte[] bArr = m53.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void x(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static rl0 y(String str) {
        return new rl0(um.a(str));
    }

    public static final void z(fz9 fz9, od6 od6, q85 q85) {
        fz9.e(od6, new ao4(1, new lc5(23, (Object) q85)));
    }
}
