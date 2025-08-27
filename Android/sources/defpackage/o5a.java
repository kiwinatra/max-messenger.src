package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.apache.http.HttpHost;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.TracerLibraryManifest;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: o5a  reason: default package */
public abstract class o5a {
    public static p5a a;
    public static String b;
    public static final String[] c = {"com.sec.android.app.sbrowser"};
    public static final ekd d = new ekd(13);
    public static final Object e = new Object();
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static ccb h;
    public static volatile Set i;

    public static int A(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Throwable th) {
            z68.f("o5a", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    public static long B(Context context, Uri uri) {
        long j = 0;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    z68.f("o5a", "getVideoDuration from uri: failed", th);
                    return 0;
                } finally {
                    T(mediaMetadataRetriever);
                }
            }
            T(mediaMetadataRetriever2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            z68.f("o5a", "getVideoDuration from uri: failed", th);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d A[SYNTHETIC, Splitter:B:46:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.iq5 C(android.content.Context r14, android.net.Uri r15) {
        /*
            java.lang.String r0 = "o5a"
            java.lang.String r1 = "getVideoParams: failed"
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch:{ RuntimeException -> 0x0061, all -> 0x005e }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0061, all -> 0x005e }
            r7.setDataSource(r14, r15)     // Catch:{ RuntimeException -> 0x005a }
            r14 = -1
            android.graphics.Bitmap r14 = r7.getFrameAtTime(r14)     // Catch:{ RuntimeException -> 0x005a }
            r15 = 9
            java.lang.String r15 = r7.extractMetadata(r15)     // Catch:{ all -> 0x0022 }
            long r2 = java.lang.Long.parseLong(r15)     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r15 = move-exception
            java.lang.String r8 = "getVideoDuration: failed "
            defpackage.z68.f(r0, r8, r15)     // Catch:{ RuntimeException -> 0x0058 }
        L_0x0028:
            android.graphics.Point r15 = D(r7)     // Catch:{ RuntimeException -> 0x0053 }
            int r8 = A(r7)     // Catch:{ RuntimeException -> 0x0050 }
            r9 = 16
            java.lang.String r1 = r7.extractMetadata(r9)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            r1 = r5
            goto L_0x0042
        L_0x003b:
            r9 = move-exception
            java.lang.String r10 = "getVideoBitrate: failed"
            defpackage.z68.f(r0, r10, r9)     // Catch:{ RuntimeException -> 0x0049 }
        L_0x0041:
            r1 = r6
        L_0x0042:
            T(r7)
            r13 = r1
            r9 = r2
        L_0x0047:
            r12 = r8
            goto L_0x007b
        L_0x0049:
            r9 = move-exception
            goto L_0x0066
        L_0x004b:
            r4 = r7
            goto L_0x00bd
        L_0x004e:
            r14 = move-exception
            goto L_0x004b
        L_0x0050:
            r9 = move-exception
        L_0x0051:
            r8 = r5
            goto L_0x0066
        L_0x0053:
            r9 = move-exception
        L_0x0054:
            r15 = r4
            goto L_0x0051
        L_0x0056:
            r9 = r15
            goto L_0x0054
        L_0x0058:
            r15 = move-exception
            goto L_0x0056
        L_0x005a:
            r9 = move-exception
            r14 = r4
            r15 = r14
            goto L_0x0051
        L_0x005e:
            r14 = move-exception
            goto L_0x00bd
        L_0x0061:
            r9 = move-exception
            r14 = r4
            r15 = r14
            r7 = r15
            goto L_0x0051
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r10.<init>(r1)     // Catch:{ all -> 0x004e }
            r10.append(r9)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x004e }
            defpackage.z68.f(r0, r1, r4)     // Catch:{ all -> 0x004e }
            T(r7)
            r9 = r2
            r13 = r6
            goto L_0x0047
        L_0x007b:
            if (r14 == 0) goto L_0x00a4
            int r1 = r14.getWidth()     // Catch:{ all -> 0x00a2 }
            int r2 = r14.getHeight()     // Catch:{ all -> 0x00a2 }
            int r3 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x00a2 }
            r4 = 512(0x200, float:7.175E-43)
            if (r3 <= r4) goto L_0x00a4
            r4 = 1140850688(0x44000000, float:512.0)
            float r3 = (float) r3     // Catch:{ all -> 0x00a2 }
            float r4 = r4 / r3
            float r1 = (float) r1     // Catch:{ all -> 0x00a2 }
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x00a2 }
            float r2 = (float) r2     // Catch:{ all -> 0x00a2 }
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)     // Catch:{ all -> 0x00a2 }
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createScaledBitmap(r14, r1, r2, r6)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a4
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r8 = r14
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r2 = "getVideoParams: failed to resize to thumbnail"
            defpackage.z68.f(r0, r2, r1)
            goto L_0x00a4
        L_0x00ac:
            if (r15 == 0) goto L_0x00b0
        L_0x00ae:
            r11 = r15
            goto L_0x00b6
        L_0x00b0:
            android.graphics.Point r15 = new android.graphics.Point
            r15.<init>(r5, r5)
            goto L_0x00ae
        L_0x00b6:
            iq5 r14 = new iq5
            r7 = r14
            r7.<init>((android.graphics.Bitmap) r8, (long) r9, (android.graphics.Point) r11, (int) r12, (boolean) r13)
            return r14
        L_0x00bd:
            T(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.C(android.content.Context, android.net.Uri):iq5");
    }

    public static Point D(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt == 90 || parseInt == 270) {
                String str = extractMetadata2;
                extractMetadata2 = extractMetadata;
                extractMetadata = str;
            }
            return new Point(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2));
        } catch (Throwable th) {
            z68.f("o5a", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static boolean E(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = q5a.a;
            }
        } else if (!(iterable instanceof xfe)) {
            return false;
        } else {
            obj = ((ic7) ((xfe) iterable)).o;
        }
        return comparator.equals(obj);
    }

    public static ya7 F(Object obj) {
        return obj == null ? ya7.b : new ya7(obj);
    }

    public static void G(p5a p5a) {
        boolean z;
        synchronized (o5a.class) {
            z = a != null;
        }
        if (!z) {
            synchronized (o5a.class) {
                try {
                    if (a == null) {
                        a = p5a;
                    } else {
                        throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final ag0 H(int i2) {
        if (i2 == 0) {
            return ag0.a;
        }
        if (i2 == 1) {
            return ag0.b;
        }
        throw new IllegalArgumentException(a81.j(i2, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int I(int i2) {
        if (i2 == 0) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            i3 = 4;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(a81.j(i2, "Could not convert ", " to NetworkType"));
            }
        }
        return i3;
    }

    public static final t5b J(int i2) {
        if (i2 == 0) {
            return t5b.a;
        }
        if (i2 == 1) {
            return t5b.b;
        }
        throw new IllegalArgumentException(a81.j(i2, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final xog K(int i2) {
        if (i2 == 0) {
            return xog.a;
        }
        if (i2 == 1) {
            return xog.b;
        }
        if (i2 == 2) {
            return xog.c;
        }
        if (i2 == 3) {
            return xog.o;
        }
        if (i2 == 4) {
            return xog.v;
        }
        if (i2 == 5) {
            return xog.w;
        }
        throw new IllegalArgumentException(a81.j(i2, "Could not convert ", " to State"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r0.contains(r10.getFilesDir().getParent()) == false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean L(android.net.Uri r9, android.content.Context r10, defpackage.m95 r11) {
        /*
            java.lang.String r0 = r9.getPath()
            boolean r1 = defpackage.cvg.A(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000d
            goto L_0x011f
        L_0x000d:
            r1 = r2
        L_0x000e:
            r3 = 1
            r4 = 10
            java.lang.String r5 = "/"
            if (r1 >= r4) goto L_0x0045
            boolean r4 = defpackage.cvg.A(r0)
            if (r4 == 0) goto L_0x001d
            r6 = r0
            goto L_0x003a
        L_0x001d:
            java.lang.String[] r4 = r0.split(r5)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x0027
            r6 = r4[r2]
            goto L_0x0029
        L_0x0027:
            java.lang.String r6 = ""
        L_0x0029:
            r7 = r3
        L_0x002a:
            int r8 = r4.length
            if (r7 >= r8) goto L_0x003a
            r8 = r4[r7]
            java.lang.String r6 = defpackage.g63.i(r6, r5, r8)
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x003a:
            boolean r4 = r0.equals(r6)
            if (r4 == 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
            r0 = r6
            goto L_0x000e
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x004a
            goto L_0x0108
        L_0x004a:
            boolean r1 = defpackage.cvg.A(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x00dc
        L_0x0052:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ Exception -> 0x0060 }
            if (r1 == 0) goto L_0x00dc
            r0 = r1
            goto L_0x00dc
        L_0x0060:
            boolean r1 = defpackage.cvg.A(r0)
            if (r1 == 0) goto L_0x0068
            goto L_0x00dc
        L_0x0068:
            java.lang.String r1 = "/./"
            java.lang.String r0 = r0.replace(r1, r5)
        L_0x006e:
            java.lang.String r1 = "//"
            java.lang.String r1 = r0.replace(r1, r5)
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L_0x0120
            java.lang.String[] r0 = r0.split(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.length
            if (r4 <= 0) goto L_0x008b
            r4 = r0[r2]
            r1.add(r4)
        L_0x008b:
            r4 = r3
        L_0x008c:
            int r6 = r0.length
            if (r4 >= r6) goto L_0x00ae
            r6 = r0[r4]
            java.lang.String r7 = ".."
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00a8
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x00a8
            int r6 = r1.size()
            int r6 = r6 - r3
            r1.remove(r6)
            goto L_0x00ab
        L_0x00a8:
            r1.add(r6)
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x008c
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x00c2
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
        L_0x00c2:
            r4 = r3
        L_0x00c3:
            int r6 = r1.size()
            if (r4 >= r6) goto L_0x00d8
            r0.append(r5)
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x00c3
        L_0x00d8:
            java.lang.String r0 = r0.toString()
        L_0x00dc:
            boolean r1 = defpackage.cvg.A(r0)
            if (r1 != 0) goto L_0x011f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "/data/data/"
            r1.<init>(r4)
            java.lang.String r4 = r10.getPackageName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0108
            java.io.File r10 = r10.getFilesDir()
            java.lang.String r10 = r10.getParent()
            boolean r10 = r0.contains(r10)
            if (r10 == 0) goto L_0x011f
        L_0x0108:
            if (r11 == 0) goto L_0x011e
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "Uri is internal: %s"
            r10.<init>(r0, r9)
            uta r11 = (defpackage.uta) r11
            r11.c(r10, r3)
        L_0x011e:
            return r3
        L_0x011f:
            return r2
        L_0x0120:
            r0 = r1
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.L(android.net.Uri, android.content.Context, m95):boolean");
    }

    public static final boolean M(a89 a89) {
        l10 d2 = a89.a.d();
        boolean z = d2 == null || d2.b();
        if (d2 == null) {
            return true;
        }
        if (z) {
            List list = d2.f;
            if (list.size() == 1) {
                long j = a89.a.w;
                Long l = (Long) list.get(0);
                if (l != null && j == l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean N(int i2) {
        if (i2 == 15 || i2 == 255) {
            return true;
        }
        return i2 != 32768 ? i2 != 32783 ? i2 == 33023 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
    }

    public static final aje O(bs5 bs5, tu7 tu7) {
        qu7 qu7 = new qu7(bs5, (Continuation) null);
        tu7.getClass();
        return ev0.v(tu7, (CoroutineContext) null, (f14) null, new su7(tu7, qu7, (Continuation) null), 3);
    }

    public static boolean P(String str) {
        p5a p5a;
        synchronized (o5a.class) {
            p5a = a;
            if (p5a == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return p5a.e(str);
    }

    public static final int Q(int i2) {
        int y = tr1.y(i2);
        if (y == 0) {
            return 0;
        }
        if (y == 1) {
            return 1;
        }
        if (y == 2) {
            return 2;
        }
        if (y == 3) {
            return 3;
        }
        if (y == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + i2a.p(i2) + " to int");
    }

    public static final z9f R(Context context) {
        return ((y9f) context.getApplicationContext()).a();
    }

    public static final int S(t5b t5b) {
        int i2 = eqg.$EnumSwitchMapping$3[t5b.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void T(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused) {
            }
        }
    }

    public static final wie U() {
        wie wie = new wie(13, false);
        wie.b = new AtomicReference((Object) null);
        return wie;
    }

    public static final zof V(String str) {
        Set j = j();
        ArrayList arrayList = new ArrayList();
        for (Object next : j) {
            if (Intrinsics.areEqual((Object) ((zof) next).namespace(), (Object) str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder p = tr1.p("More then one manifest found for ", str, ": ");
            p.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, m61.v0, 31, (Object) null));
            throw new IllegalStateException(p.toString().toString());
        } else if (arrayList.size() == 1) {
            return (zof) arrayList.get(0);
        } else {
            try {
                String str2 = str + ".TracerLibraryManifest";
                zof zof = (zof) Class.forName(str2).newInstance();
                if (Intrinsics.areEqual((Object) zof.namespace(), (Object) str)) {
                    return zof;
                }
                throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
            } catch (Throwable th) {
                NoSuchElementException noSuchElementException = new NoSuchElementException(a81.m("No manifest found for ", str));
                noSuchElementException.initCause(th);
                throw noSuchElementException;
            }
        }
    }

    public static void W(bud bud, String str) {
        int w = w(new ab5(str).e(1, "Orientation"));
        if (w != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) w);
            Bitmap decodeFile = BitmapFactory.decodeFile(str, (BitmapFactory.Options) null);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            decodeFile.recycle();
            d0(str, createBitmap, bud);
            createBitmap.recycle();
        }
    }

    public static boolean X(bud bud, String str, String str2) {
        akd akd = (akd) bud;
        akd.getClass();
        long j = (long) 1920;
        return Y(str, str2, (int) akd.r(PmsKey.f47imagewidth, j), (int) akd.r(PmsKey.f44imageheight, j), (int) (akd.g.getFloat(PmsKey.f45imagequality.name(), 0.8f) * ((float) 100)));
    }

    public static boolean Y(String str, String str2, int i2, int i3, int i4) {
        Point m = m(str, false);
        int i5 = m.x;
        int i6 = m.y;
        if (i5 > i6) {
            int i7 = i3;
            i3 = i2;
            i2 = i7;
        }
        if (i5 <= i2 && i6 <= i3) {
            return false;
        }
        int e2 = new ab5(str).e(1, "Orientation");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = q(m, i2, i3);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        try {
            b0(str2, decodeFile, i4);
            ab5 ab5 = new ab5(str2);
            ab5.F("Orientation", String.valueOf(e2));
            ab5.B();
            return true;
        } finally {
            if (decodeFile != null) {
                decodeFile.recycle();
            }
        }
    }

    public static Bitmap Z(int i2, int i3, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        return (height < i2 || height > i3 || width < i2 || width > i3) ? (height < i2 || width < i2) ? Bitmap.createScaledBitmap(bitmap, i2, i2, false) : Bitmap.createScaledBitmap(bitmap, i3, i3, false) : bitmap;
    }

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            new ArrayList().add("");
            if (o54.O(sq6.B(0, str, 0, 7, false)) != null) {
                return str;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        } catch (Throwable th) {
            z68.f("ServerPrefs", "validate host failure", th);
            str = null;
        }
    }

    public static final List a0(List list, int i2, int i3) {
        while (i2 >= 0 && i2 <= CollectionsKt.getLastIndex(list)) {
            if (i3 == 0) {
                return CollectionsKt.listOfNotNull(CollectionsKt.getOrNull(list, i2));
            }
            if (i3 > 0) {
                int i4 = i3 + i2;
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                try {
                    return list.subList(i2, i4);
                } catch (Throwable unused) {
                    return CollectionsKt.emptyList();
                }
            } else {
                int coerceAtLeast = RangesKt.coerceAtLeast(i3 + i2, 0);
                i3 = i2;
                i2 = coerceAtLeast;
            }
        }
        return CollectionsKt.emptyList();
    }

    public static void b(zz7 zz7, mj6 mj6, Executor executor) {
        zz7.d(new uj6(0, zz7, mj6), executor);
    }

    public static void b0(String str, Bitmap bitmap, int i2) {
        c0(str, bitmap, i2, Bitmap.CompressFormat.JPEG);
    }

    public static void c0(String str, Bitmap bitmap, int i2, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(compressFormat, i2, fileOutputStream2);
                z68.c("o5a", "save bitmap success! %s", str);
                j4b.j(fileOutputStream2);
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    z68.f("o5a", "save bitmap failure!", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    j4b.j(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                j4b.j(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            z68.f("o5a", "save bitmap failure!", e);
            throw e;
        }
    }

    public static void d0(String str, Bitmap bitmap, bud bud) {
        try {
            akd akd = (akd) bud;
            akd.getClass();
            b0(str, bitmap, (int) (akd.g.getFloat(PmsKey.f45imagequality.name(), 0.8f) * ((float) 100)));
        } catch (IOException unused) {
        }
    }

    public static final int e(ag0 ag0) {
        int i2 = eqg.$EnumSwitchMapping$1[ag0.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Bitmap e0(int i2, int i3, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        float width = ((float) i2) / ((float) bitmap.getWidth());
        float height = ((float) i3) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, new Paint(2));
        return createBitmap;
    }

    public static String f(String str) {
        if (cvg.A(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt >= 0 && charAt <= 31) || charAt == '\"' || charAt == '*' || charAt == '/' || charAt == ':' || charAt == '<' || charAt == '\\' || charAt == '|' || charAt == 127 || charAt == '>' || charAt == '?') {
                sb.append('_');
            } else {
                sb.append(charAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] f0(java.util.Set r4) {
        /*
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            int r2 = r4.size()     // Catch:{ all -> 0x003a }
            r1.writeInt(r2)     // Catch:{ all -> 0x003a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x003a }
        L_0x001f:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x003a }
            vj3 r2 = (defpackage.vj3) r2     // Catch:{ all -> 0x003a }
            android.net.Uri r3 = r2.a     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003a }
            r1.writeUTF(r3)     // Catch:{ all -> 0x003a }
            boolean r2 = r2.b     // Catch:{ all -> 0x003a }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x003a }
            goto L_0x001f
        L_0x003a:
            r4 = move-exception
            goto L_0x004c
        L_0x003c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r4)     // Catch:{ all -> 0x004a }
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x004a:
            r4 = move-exception
            goto L_0x0052
        L_0x004c:
            throw r4     // Catch:{ all -> 0x004d }
        L_0x004d:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r4)     // Catch:{ all -> 0x004a }
            throw r2     // Catch:{ all -> 0x004a }
        L_0x0052:
            throw r4     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.f0(java.util.Set):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet g(byte[] r8) {
        /*
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r8.length
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003c }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003c }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0032 }
            r4 = 0
        L_0x0019:
            if (r4 >= r3) goto L_0x0034
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x0032 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0032 }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x0032 }
            vj3 r7 = new vj3     // Catch:{ all -> 0x0032 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0032 }
            r0.add(r7)     // Catch:{ all -> 0x0032 }
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0032:
            r3 = move-exception
            goto L_0x003e
        L_0x0034:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0032 }
            kotlin.io.CloseableKt.closeFinally(r2, r8)     // Catch:{ IOException -> 0x003c }
            goto L_0x0047
        L_0x003a:
            r8 = move-exception
            goto L_0x004d
        L_0x003c:
            r2 = move-exception
            goto L_0x0044
        L_0x003e:
            throw r3     // Catch:{ all -> 0x003f }
        L_0x003f:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch:{ IOException -> 0x003c }
            throw r4     // Catch:{ IOException -> 0x003c }
        L_0x0044:
            r2.printStackTrace()     // Catch:{ all -> 0x003a }
        L_0x0047:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
            kotlin.io.CloseableKt.closeFinally(r1, r8)
            return r0
        L_0x004d:
            throw r8     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.g(byte[]):java.util.LinkedHashSet");
    }

    public static void g0(View view, bh8 bh8) {
        x05 x05 = bh8.a.b;
        if (x05 != null && x05.a) {
            float f2 = c44.DEFAULT_ASPECT_RATIO;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = gag.a;
                f2 += v9g.i((View) parent);
            }
            ah8 ah8 = bh8.a;
            if (ah8.m != f2) {
                ah8.m = f2;
                bh8.q();
            }
        }
    }

    public static final void h(File file) {
        File parentFile;
        if (!file.exists() || !file.canWrite()) {
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null && !parentFile.mkdirs()) {
                File absoluteFile = file.getAbsoluteFile();
                throw new IOException("Can't create log file parent dirs=" + absoluteFile);
            } else if (!file.createNewFile()) {
                throw new IOException(a81.m("Can't create log file=", file.getAbsolutePath()));
            } else if (!file.canWrite()) {
                throw new IOException(a81.m("Can't write to file=", file.getAbsolutePath()));
            }
        }
    }

    public static final int h0(xog xog) {
        switch (eqg.$EnumSwitchMapping$0[xog.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [b59, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [b59, java.lang.Object] */
    public static b59 i(int i2) {
        return i2 != 0 ? i2 != 1 ? new Object() : new Object() : new Object();
    }

    public static Bitmap i0(int i2, Context context) {
        Drawable b2 = ew3.b(context, i2);
        if (b2 != null) {
            ru4.h(b2, ColorStateList.valueOf(-16745729));
        }
        Bitmap createBitmap = Bitmap.createBitmap(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b2.draw(canvas);
        return createBitmap;
    }

    public static final Set j() {
        Set set = i;
        if (set != null) {
            return set;
        }
        Set createSetBuilder = SetsKt.createSetBuilder();
        try {
            for (Object add : Arrays.asList(new zof[]{new TracerLibraryManifest(), new ru.ok.android.externcalls.sdk.audio.TracerLibraryManifest(), new uof()})) {
                createSetBuilder.add(add);
            }
            i = createSetBuilder;
            return SetsKt.build(createSetBuilder);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final cg1 j0(kpc kpc, boolean z) {
        int ordinal = kpc.ordinal();
        switch (kpc.ordinal()) {
            case 0:
                return new cg1(ordinal, new igf(sqa.Q));
            case 1:
                return new cg1(ordinal, new igf(sqa.O));
            case 2:
                return new cg1(ordinal, new igf(sqa.Z));
            case 3:
                return new cg1(ordinal, new igf(sqa.R));
            case 4:
                return new cg1(ordinal, new igf(sqa.P));
            case 5:
                return new cg1(ordinal, new igf(sqa.W));
            case 6:
                return new cg1(ordinal, new igf(sqa.X));
            case 7:
                return new cg1(ordinal, new igf(sqa.Y));
            case 8:
                return new cg1(ordinal, new igf(sqa.V));
            case 9:
                return new cg1(ordinal, new igf(sqa.U));
            case 10:
                return new cg1(ordinal, z ? new igf(sqa.T) : new igf(sqa.S));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String k(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 2) {
            return null;
        }
        String str = pathSegments.get(0);
        if (cvg.A(str) || !str.equalsIgnoreCase("external_files")) {
            return null;
        }
        Uri.Builder buildUpon = Uri.fromFile(Environment.getExternalStorageDirectory()).buildUpon();
        for (int i2 = 1; i2 < pathSegments.size(); i2++) {
            buildUpon.appendPath(pathSegments.get(i2));
        }
        String path = buildUpon.build().getPath();
        if (cjf.p(path)) {
            return path;
        }
        return null;
    }

    public static Point l(FileDescriptor fileDescriptor, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i2 == 6 || i2 == 8) ? new Point(point.y, point.x) : point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m(java.lang.String r2, boolean r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L_0x000f
            ab5 r3 = new ab5     // Catch:{ IOException -> 0x000f }
            r3.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x000f }
            java.lang.String r1 = "Orientation"
            int r3 = r3.e(r0, r1)     // Catch:{ IOException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r0
            android.graphics.BitmapFactory.decodeFile(r2, r1)
            android.graphics.Point r2 = new android.graphics.Point
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            r2.<init>(r0, r1)
            r0 = 6
            if (r3 == r0) goto L_0x002a
            r0 = 8
            if (r3 != r0) goto L_0x0034
        L_0x002a:
            android.graphics.Point r3 = new android.graphics.Point
            int r0 = r2.y
            int r2 = r2.x
            r3.<init>(r0, r2)
            r2 = r3
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.m(java.lang.String, boolean):android.graphics.Point");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String o(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            java.lang.String r0 = "file://"
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r2 = "getDataColumn: uri = %s, selection = %s, selection args = %s"
            java.lang.String r3 = "o5a"
            defpackage.z68.c(r3, r2, r1)
            java.lang.String r1 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            r2 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            r9 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            if (r10 == 0) goto L_0x0063
            boolean r12 = r10.moveToFirst()     // Catch:{ Exception -> 0x005d }
            if (r12 == 0) goto L_0x0063
            int r12 = r10.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r12 = r10.getString(r12)     // Catch:{ Exception -> 0x005d }
            boolean r13 = defpackage.cvg.A(r12)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x003e
            r10.close()
            return r2
        L_0x003e:
            java.lang.String r13 = "/"
            boolean r13 = r12.startsWith(r13)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x004a
            r10.close()
            return r12
        L_0x004a:
            boolean r13 = r12.startsWith(r0)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = ""
            java.lang.String r11 = r12.replace(r0, r13)     // Catch:{ Exception -> 0x005d }
            r10.close()
            return r11
        L_0x005a:
            r11 = move-exception
            r2 = r10
            goto L_0x007e
        L_0x005d:
            r12 = move-exception
            goto L_0x006d
        L_0x005f:
            r10.close()
            return r2
        L_0x0063:
            if (r10 == 0) goto L_0x007d
        L_0x0065:
            r10.close()
            goto L_0x007d
        L_0x0069:
            r11 = move-exception
            goto L_0x007e
        L_0x006b:
            r12 = move-exception
            r10 = r2
        L_0x006d:
            java.lang.String r13 = "getDataColumn: error for uri = %s, e = %s"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x005a }
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}     // Catch:{ all -> 0x005a }
            defpackage.z68.g(r3, r13, r11)     // Catch:{ all -> 0x005a }
            if (r10 == 0) goto L_0x007d
            goto L_0x0065
        L_0x007d:
            return r2
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()
        L_0x0083:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static Object p(Future future) {
        Object obj;
        if (future.isDone()) {
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(tf6.Y("Future was expected to be done: %s", future));
    }

    public static int q(Point point, int i2, int i3) {
        int i4 = 1;
        while (true) {
            if (point.x / i4 <= i2 && point.y / i4 <= i3) {
                return i4;
            }
            i4 *= 2;
        }
    }

    public static String r(String str) {
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            String substring = str.substring(lastIndexOf + 1);
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
            return (!cvg.A(mimeTypeFromExtension) || cvg.A(substring)) ? mimeTypeFromExtension : "application/".concat(substring);
        } catch (Exception e2) {
            z68.e("o5a", "getMimeTypeFromFileName: failed, e: " + e2.toString());
            return null;
        }
    }

    public static String u(Context context, Uri uri, kn5 kn5) {
        try {
            String uri2 = uri.toString();
            try {
                String path = uri.getPath();
                if (!cvg.A(path)) {
                    File file = new File(path);
                    if (file.exists()) {
                        z68.c("o5a", "getPath: from file: " + uri2, new Object[0]);
                        return file.getAbsolutePath();
                    }
                } else {
                    z68.c("o5a", "getPath: path from uri.getPath is empty, uri = %s", uri2);
                }
                File file2 = new File(uri.toString());
                if (file2.exists()) {
                    z68.c("o5a", "getPath: from file: " + uri2, new Object[0]);
                    return file2.getAbsolutePath();
                }
            } catch (Exception e2) {
                z68.f("o5a", "getPath: error check file exists", e2);
            }
            char c2 = 65535;
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str = uri2.split("/1/")[1];
                    int indexOf = str.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), StandardCharsets.UTF_8));
                    }
                } catch (Exception e3) {
                    z68.f("o5a", "getPath: error on get google photos uri", e3);
                }
            }
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    z68.c("o5a", "getPath: is external document: " + uri, new Object[0]);
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    z68.c("o5a", "getPath: is download document: " + uri, new Object[0]);
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (cvg.A(documentId) || !documentId.toLowerCase().startsWith("raw:")) {
                        return o(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                    }
                    String substring = documentId.substring(4);
                    if (cjf.p(substring)) {
                        return substring;
                    }
                    return null;
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    z68.c("o5a", "getPath: is media document: " + uri, new Object[0]);
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    int hashCode = str2.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875) {
                                if (str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                    c2 = 1;
                                }
                            }
                        } else if (str2.equals("image")) {
                            c2 = 0;
                        }
                    } else if (str2.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        c2 = 2;
                    }
                    return o(context, c2 != 0 ? c2 != 1 ? c2 != 2 ? null : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                String authority = uri.getAuthority();
                if (!cvg.A(authority) && authority.equalsIgnoreCase(kn5.a)) {
                    z68.c("o5a", "getPath: from application content scheme: " + uri, new Object[0]);
                    String k = k(uri);
                    if (!cvg.A(k)) {
                        return k;
                    }
                }
                z68.c("o5a", "getPath: from content scheme: " + uri, new Object[0]);
                return o(context, uri, (String) null, (String[]) null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                z68.c("o5a", "getPath: from file scheme: " + uri, new Object[0]);
                return uri.getPath();
            }
        } catch (Exception e4) {
            z68.g("o5a", "getPath: error for uri %s, e: %s", uri, e4.toString());
        }
        return null;
    }

    public static final ccb v(Context context) {
        ccb ccb = h;
        if (ccb != null) {
            return ccb;
        }
        ccb ccb2 = new ccb(context.getApplicationContext());
        h = ccb2;
        return ccb2;
    }

    public static int w(int i2) {
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static Uri x(String str) {
        String z = z(str);
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        return Uri.parse(z);
    }

    public static Uri y(Resources resources, int i2) {
        return Uri.parse("android.resource://" + resources.getResourcePackageName(i2) + '/' + resources.getResourceTypeName(i2) + '/' + resources.getResourceEntryName(i2));
    }

    public static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = hhf.a;
        return (!str.regionMatches(true, 0, "file:", 0, 5) && !str.regionMatches(true, 0, HttpHost.DEFAULT_SCHEME_NAME, 0, 4) && !str.regionMatches(true, 0, "content", 0, 7) && !str.regionMatches(true, 0, "android.resource:/", 0, 18) && !str.regionMatches(true, 0, "res:/", 0, 5)) ? "file:".concat(str) : str;
    }

    public abstract boolean c(int i2, int i3);

    public abstract boolean d(int i2, int i3);

    public Object n(int i2, int i3) {
        return null;
    }

    public abstract int s();

    public abstract int t();
}
