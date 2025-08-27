package one.me.rlottie;

import android.graphics.BitmapFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.rlottie.RLottie;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

public final class c {
    public static b A;
    public static boolean u;
    public static final ConcurrentHashMap v = new ConcurrentHashMap();
    public static volatile boolean w;
    public static final int x;
    public static ThreadPoolExecutor y;
    public static int z;
    public final yo0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public boolean i;
    public volatile boolean j;
    public final int k;
    public final File l;
    public int m;
    public final AtomicBoolean n;
    public final cf o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;

    static {
        RLottie.Config config = RLottie.config;
        x = Math.max(Math.min(config.corePoolSize - 2, config.maxPoolSize), 1);
    }

    public c(File file, yo0 yo0, xo0 xo0, int i2, int i3, boolean z2) {
        int i4 = i2;
        int i5 = i3;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.n = new AtomicBoolean(false);
        this.o = new cf(6, this);
        this.a = yo0;
        this.b = i4;
        this.c = i5;
        xo0.getClass();
        this.k = 100;
        String name = file.getName();
        if (y == null) {
            int i6 = x;
            y = new ThreadPoolExecutor(i6, i6, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(RLottie.config.getCacheProvider().getCacheDir(), "acache");
        if (!u) {
            file2.mkdir();
            u = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i4);
        sb.append("_");
        sb.append(i5);
        File file3 = new File(file2, wj6.n(sb, z2 ? "_nolimit" : " ", ".pcache2"));
        this.l = file3;
        this.f = i4 < a.a(60.0f) && i5 < a.a(60.0f);
        if (RLottie.config.isHighPerformanceDevice.invoke().booleanValue()) {
            this.j = file3.exists();
            if (this.j) {
                RandomAccessFile randomAccessFile = null;
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "r");
                    try {
                        this.q = randomAccessFile2.readBoolean();
                        if (this.q && arrayList.isEmpty()) {
                            randomAccessFile2.seek((long) randomAccessFile2.readInt());
                            int readInt = randomAccessFile2.readInt();
                            d(randomAccessFile2, readInt > 10000 ? 0 : readInt);
                            if (arrayList.size() == 0) {
                                this.q = false;
                                this.j = false;
                                this.p = true;
                                file3.delete();
                            } else {
                                if (this.s != randomAccessFile2) {
                                    a();
                                }
                                this.s = randomAccessFile2;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        try {
                            th.printStackTrace();
                            this.l.delete();
                            this.j = false;
                            this.p = true;
                            if (!(this.s == randomAccessFile || randomAccessFile == null)) {
                                randomAccessFile.close();
                            }
                            this.p = true;
                            return;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            try {
                                if (!(this.s == randomAccessFile || randomAccessFile == null)) {
                                    randomAccessFile.close();
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            throw th3;
                        }
                    }
                    try {
                        if (this.s != randomAccessFile2) {
                            randomAccessFile2.close();
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th.printStackTrace();
                    this.l.delete();
                    this.j = false;
                    this.p = true;
                    randomAccessFile.close();
                    this.p = true;
                    return;
                }
            }
            this.p = true;
            return;
        }
        this.j = false;
        this.q = false;
    }

    public static void c() {
        int i2 = z - 1;
        z = i2;
        if (i2 <= 0) {
            z = 0;
            RLottieDrawable.lottieCacheGenerateQueue.a(new gc(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|3|(11:5|6|7|8|9|(3:11|(1:13)|(8:15|(1:17)|20|21|22|(2:24|25)|26|28)(2:32|33))|34|(1:36)|37|38|(2:40|41))|50|51|(1:53)|54|(4:55|(2:57|58)|63|(1:67)(2:68|(1:141)(3:110|(2:112|144)(2:113|143)|114)))|67|115|(6:118|(2:120|121)|126|(3:128|129|156)(1:157)|130|116)|132|133|26|28|(2:(1:81)|(2:99|137))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:19|18|42|43|44|45|48|49|50|51|(0)|54|(5:55|(0)|63|(0)(0)|114)|67|115|(1:116)|132|133|26|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f7, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fa, code lost:
        if (r1 >= x) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fc, code lost:
        r0 = r6[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        if (r0 == null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0104, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010c, code lost:
        r0 = (int) r15.length();
        java.util.Collections.sort(r5, new defpackage.cx4(9));
        r1 = r7[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r1.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0121, code lost:
        r1 = r5.size();
        r7[r13].b(r1);
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012f, code lost:
        if (r2 >= r5.size()) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0131, code lost:
        r7[r13].b(((defpackage.zo0) r5.get(r2)).c);
        r7[r13].b(((defpackage.zo0) r5.get(r2)).b);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014e, code lost:
        r15.write(r7[r13].a, r13, (r1 * 8) + 4);
        r1 = r7[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x015f, code lost:
        r15.seek(r9);
        r15.writeBoolean(true);
        r15.writeInt(r0);
        r4.set(true);
        r15.close();
        r11.e.clear();
        r11.e.addAll(r5);
        a();
        r11.s = new java.io.RandomAccessFile(r11.l, r12);
        r11.q = true;
        r11.j = true;
        r11.p = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01fa A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098 A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[SYNTHETIC, Splitter:B:57:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e6 A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }, EDGE_INSN: B:140:0x00e6->B:67:0x00e6 ?: BREAK  
    EDGE_INSN: B:142:0x00e6->B:67:0x00e6 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ed A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x0082=Splitter:B:44:0x0082, B:37:0x0075=Splitter:B:37:0x0075, B:50:0x008b=Splitter:B:50:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r25 = this;
            r11 = r25
            java.io.File r0 = r11.l     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r12 = "r"
            r13 = 0
            r14 = 1
            r9 = 0
            if (r0 == 0) goto L_0x008b
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007d }
            java.io.File r2 = r11.l     // Catch:{ all -> 0x007d }
            r1.<init>(r2, r12)     // Catch:{ all -> 0x007d }
            boolean r0 = r1.readBoolean()     // Catch:{ all -> 0x0048 }
            r11.q = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r11.q     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList r0 = r11.e     // Catch:{ all -> 0x0048 }
            r0.clear()     // Catch:{ all -> 0x0048 }
            int r0 = r1.readInt()     // Catch:{ all -> 0x0048 }
            long r2 = (long) r0     // Catch:{ all -> 0x0048 }
            r1.seek(r2)     // Catch:{ all -> 0x0048 }
            int r0 = r1.readInt()     // Catch:{ all -> 0x0048 }
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r2) goto L_0x0038
            r0 = r13
        L_0x0038:
            if (r0 <= 0) goto L_0x0066
            r11.d(r1, r0)     // Catch:{ all -> 0x0048 }
            r1.seek(r9)     // Catch:{ all -> 0x0048 }
            java.io.RandomAccessFile r0 = r11.s     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x004a
            r25.a()     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = r1
            goto L_0x007d
        L_0x004a:
            r11.s = r1     // Catch:{ all -> 0x0048 }
            r11.j = r14     // Catch:{ all -> 0x0048 }
            r11.p = r14     // Catch:{ all -> 0x0048 }
            java.io.RandomAccessFile r0 = r11.s     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r1) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            yo0 r0 = r11.a
            r0.releaseForGenerateCache()
            return
        L_0x005d:
            r0 = move-exception
            goto L_0x0231
        L_0x0060:
            r0 = move-exception
            goto L_0x021b
        L_0x0063:
            r0 = move-exception
            goto L_0x0224
        L_0x0066:
            r11.j = r13     // Catch:{ all -> 0x0048 }
            r11.q = r13     // Catch:{ all -> 0x0048 }
            r11.p = r14     // Catch:{ all -> 0x0048 }
        L_0x006c:
            boolean r0 = r11.q     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0075
            java.io.File r0 = r11.l     // Catch:{ all -> 0x0048 }
            r0.delete()     // Catch:{ all -> 0x0048 }
        L_0x0075:
            java.io.RandomAccessFile r0 = r11.s     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r1) goto L_0x008b
            r1.close()     // Catch:{ all -> 0x008b }
            goto L_0x008b
        L_0x007d:
            java.io.File r1 = r11.l     // Catch:{ all -> 0x0082 }
            r1.delete()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            java.io.RandomAccessFile r1 = r11.s     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r1 == r0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            r0.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            java.io.RandomAccessFile r15 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.File r0 = r11.l     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r1 = "rw"
            r15.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            one.me.rlottie.b r0 = A     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 != 0) goto L_0x009f
            one.me.rlottie.b r0 = new one.me.rlottie.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            A = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x009f:
            one.me.rlottie.b r0 = A     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r11.c     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r2 = r11.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.a(r1, r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            one.me.rlottie.b r0 = A     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            android.graphics.Bitmap[] r8 = r0.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            ib7[] r7 = r0.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = x     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.CountDownLatch[] r6 = new java.util.concurrent.CountDownLatch[r0]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeBoolean(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeInt(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r4.<init>(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            yo0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.prepareForGenerateCache()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r16 = r13
            r17 = r16
        L_0x00cb:
            r0 = r6[r16]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x00d8
            r0.await()     // Catch:{ InterruptedException -> 0x00d3 }
            goto L_0x00d8
        L_0x00d3:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x00d8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.n     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r4.get()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x00ed
        L_0x00e6:
            r12 = r4
            r20 = r6
            r22 = r8
            goto L_0x01e9
        L_0x00ed:
            yo0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r8[r16]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = r0.getNextFrame(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r14) goto L_0x0197
            r1 = r13
        L_0x00f8:
            int r0 = x     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r1 >= r0) goto L_0x010c
            r0 = r6[r1]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0109
            r0.await()     // Catch:{ InterruptedException -> 0x0104 }
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0109:
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x010c:
            long r0 = r15.length()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = (int) r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            cx4 r1 = new cx4     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = 9
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.Collections.sort(r5, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            monitor-enter(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1.b = r13     // Catch:{ all -> 0x0194 }
            monitor-exit(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r5.size()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2.b(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = r13
        L_0x012b:
            int r3 = r5.size()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r2 >= r3) goto L_0x014e
            r3 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r6 = r5.get(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            zo0 r6 = (defpackage.zo0) r6     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r6 = r6.c     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3.b(r6)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r6 = r5.get(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            zo0 r6 = (defpackage.zo0) r6     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r6 = r6.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3.b(r6)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x012b
        L_0x014e:
            r2 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            byte[] r2 = r2.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r1 * 8
            int r1 = r1 + 4
            r15.write(r2, r13, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r7[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            monitor-enter(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1.b = r13     // Catch:{ all -> 0x0191 }
            monitor-exit(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.seek(r9)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeBoolean(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeInt(r0)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r4.set(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.close()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r0 = r11.e     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.clear()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r0 = r11.e     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.addAll(r5)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r25.a()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.File r1 = r11.l     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.<init>(r1, r12)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.s = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.q = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.j = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.p = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x018a:
            yo0 r0 = r11.a
            r0.releaseForGenerateCache()
            goto L_0x0230
        L_0x0191:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0194:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0194 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0197:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r6[r16] = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.ThreadPoolExecutor r0 = y     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            wo0 r3 = new wo0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r3
            r2 = r25
            r13 = r3
            r3 = r4
            r18 = r12
            r12 = r4
            r4 = r8
            r19 = r5
            r5 = r16
            r20 = r6
            r6 = r7
            r21 = r7
            r7 = r17
            r22 = r8
            r8 = r15
            r23 = r9
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.execute(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = r16 + 1
            int r1 = r17 + 1
            int r2 = x     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 < r2) goto L_0x01d0
            r16 = 0
            goto L_0x01d2
        L_0x01d0:
            r16 = r0
        L_0x01d2:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.d     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.set(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r17 = r1
            r4 = r12
            r12 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r13 = 0
            goto L_0x00cb
        L_0x01e9:
            one.me.rlottie.RLottie$Logger r0 = one.me.rlottie.RLottie.getLogger()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r1 = "cancelled cache generation"
            r0.d(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r12.set(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r13 = 0
        L_0x01f6:
            int r0 = x     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r13 >= r0) goto L_0x0211
            r0 = r20[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0207
            r0.await()     // Catch:{ InterruptedException -> 0x0202 }
            goto L_0x0207
        L_0x0202:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0207:
            r0 = r22[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x020e
            r0.recycle()     // Catch:{ Exception -> 0x020e }
        L_0x020e:
            int r13 = r13 + 1
            goto L_0x01f6
        L_0x0211:
            r15.close()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            yo0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.releaseForGenerateCache()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            goto L_0x0057
        L_0x021b:
            one.me.rlottie.RLottie$Logger r1 = one.me.rlottie.RLottie.getLogger()     // Catch:{ all -> 0x005d }
            r1.e(r0)     // Catch:{ all -> 0x005d }
            goto L_0x018a
        L_0x0224:
            one.me.rlottie.RLottie$Logger r1 = one.me.rlottie.RLottie.getLogger()     // Catch:{ all -> 0x005d }
            r1.e(r0)     // Catch:{ all -> 0x005d }
            r0.printStackTrace()     // Catch:{ all -> 0x005d }
            goto L_0x018a
        L_0x0230:
            return
        L_0x0231:
            yo0 r1 = r11.a
            r1.releaseForGenerateCache()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.c.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i2) {
        if (i2 != 0) {
            byte[] bArr = new byte[(i2 * 8)];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i3 = 0; i3 < i2; i3++) {
                zo0 zo0 = new zo0(i3);
                zo0.c = wrap.getInt();
                zo0.b = wrap.getInt();
                this.e.add(zo0);
            }
        }
    }

    public final byte[] e(zo0 zo0) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("rlottie-bg-pool");
        byte[] bArr = z2 ? (byte[]) v.get(Thread.currentThread()) : this.g;
        if (bArr == null || bArr.length < zo0.b) {
            bArr = new byte[((int) (((float) zo0.b) * 1.3f))];
            if (z2) {
                v.put(Thread.currentThread(), bArr);
                if (!w) {
                    w = true;
                    a.c(MultiFileUploader.UPLOAD_NEXT_INTERVAL, this.o);
                }
            } else {
                this.g = bArr;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(android.graphics.Bitmap r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.i
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r2 = 1
            boolean r3 = r7.q     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0014
            boolean r3 = r7.j     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0014
            return r1
        L_0x0011:
            r8 = move-exception
            goto L_0x00be
        L_0x0014:
            boolean r3 = r7.q     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            r4 = 0
            if (r3 == 0) goto L_0x001d
            java.io.RandomAccessFile r3 = r7.s     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0063
        L_0x001d:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            java.io.File r5 = r7.l     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            java.lang.String r6 = "r"
            r3.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            boolean r5 = r3.readBoolean()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.q = r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r5 = r7.q     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 == 0) goto L_0x004f
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r5 = r5.isEmpty()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 == 0) goto L_0x004f
            int r5 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            long r5 = (long) r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.seek(r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.d(r3, r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r8 = move-exception
            r0 = r3
            goto L_0x00be
        L_0x004c:
            r0 = r3
            goto L_0x00d0
        L_0x004f:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x005b
            r7.q = r4     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.p = r2     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x005b:
            boolean r5 = r7.q     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x0063
            r3.close()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            return r1
        L_0x0063:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x006c
            return r1
        L_0x006c:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5 - r2
            int r9 = java.lang.Math.min(r9, r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r9 = java.lang.Math.max(r9, r4)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            zo0 r9 = (defpackage.zo0) r9     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r9.c     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            long r5 = (long) r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.seek(r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            byte[] r5 = r7.e(r9)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r6 = r9.b     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.readFully(r5, r4, r6)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r6 = r7.r     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 != 0) goto L_0x00a0
            java.io.RandomAccessFile r6 = r7.s     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 == r3) goto L_0x009d
            r7.a()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x009d:
            r7.s = r3     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            goto L_0x00a5
        L_0x00a0:
            r7.s = r0     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x00a5:
            android.graphics.BitmapFactory$Options r6 = r7.t     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 != 0) goto L_0x00b0
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.t = r6     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x00b0:
            android.graphics.BitmapFactory$Options r6 = r7.t     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r6.inBitmap = r8     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r8 = r9.b     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            android.graphics.BitmapFactory.decodeByteArray(r5, r4, r8, r6)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            android.graphics.BitmapFactory$Options r8 = r7.t     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r8.inBitmap = r0     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            return r4
        L_0x00be:
            one.me.rlottie.RLottie$Logger r9 = one.me.rlottie.RLottie.getLogger()
            r9.e(r8)
            int r8 = r7.m
            int r8 = r8 + r2
            r7.m = r8
            r9 = 10
            if (r8 <= r9) goto L_0x00d0
            r7.i = r2
        L_0x00d0:
            boolean r7 = r7.i
            if (r7 == 0) goto L_0x00de
            if (r0 == 0) goto L_0x00de
            r0.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.c.f(android.graphics.Bitmap, int):int");
    }
}
