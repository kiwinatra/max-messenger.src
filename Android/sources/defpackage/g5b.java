package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import com.google.android.material.chip.ChipGroup;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: g5b  reason: default package */
public final class g5b implements znb, cla {
    public static final byte[] w = {-1, -39};
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object o;
    public Object v;

    public g5b(View view, WindowManager windowManager) {
        this.c = view;
        this.o = windowManager;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 0, 0, 1002, 16777992, -3);
        this.v = layoutParams;
        if (view.getContext().getResources().getConfiguration().orientation == 1) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.gravity = 8388659;
        view.setLayoutParams(layoutParams);
    }

    public static BitmapFactory.Options m(j55 j55, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = j55.y;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(j55.n(), (Rect) null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public y33 a(j55 j55, Bitmap.Config config) {
        BitmapFactory.Options m = m(j55, config, this.a);
        boolean z = m.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream n = j55.n();
            n.getClass();
            return h(n, m, (ColorSpace) null);
        } catch (RuntimeException e) {
            if (z) {
                return a(j55, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    public void b() {
        if (!this.b) {
            this.b = true;
            this.a = true;
            ((cla) this.c).b();
        }
    }

    public void c(mq4 mq4) {
        mw1 mw1 = (mw1) this.v;
        mw1.getClass();
        qq4.c(mw1, mq4);
    }

    public void d(Object obj) {
        if (!this.b) {
            ((cla) this.c).d(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.y33 e(defpackage.j55 r6, android.graphics.Bitmap.Config r7, int r8, android.graphics.ColorSpace r9) {
        /*
            r5 = this;
            h97 r0 = r6.c
            h97 r1 = defpackage.eg4.a
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x000e
            h97 r1 = defpackage.eg4.l
            if (r0 == r1) goto L_0x000e
        L_0x000c:
            r0 = r2
            goto L_0x0037
        L_0x000e:
            r2f r0 = r6.b
            if (r0 == 0) goto L_0x0013
            goto L_0x000c
        L_0x0013:
            y33 r0 = r6.a
            r0.getClass()
            java.lang.Object r0 = r0.e0()
            e69 r0 = (defpackage.e69) r0
            r1 = 2
            if (r8 >= r1) goto L_0x0023
        L_0x0021:
            r0 = r3
            goto L_0x0037
        L_0x0023:
            int r1 = r8 + -2
            byte r1 = r0.o(r1)
            r4 = -1
            if (r1 != r4) goto L_0x0021
            int r1 = r8 + -1
            byte r0 = r0.o(r1)
            r1 = -39
            if (r0 != r1) goto L_0x0021
            goto L_0x000c
        L_0x0037:
            boolean r1 = r5.a
            android.graphics.BitmapFactory$Options r7 = m(r6, r7, r1)
            java.io.InputStream r1 = r6.n()
            r1.getClass()
            int r4 = r6.o()
            if (r4 <= r8) goto L_0x0050
            rv7 r4 = new rv7
            r4.<init>(r1, r8)
            r1 = r4
        L_0x0050:
            if (r0 != 0) goto L_0x005a
            f9f r0 = new f9f
            byte[] r4 = w
            r0.<init>(r1, r4)
            r1 = r0
        L_0x005a:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r4) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = r3
        L_0x0062:
            jd4 r5 = r5.h(r1, r7, r9)     // Catch:{ RuntimeException -> 0x0071 }
            r1.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006e:
            return r5
        L_0x006f:
            r5 = move-exception
            goto L_0x0084
        L_0x0071:
            r7 = move-exception
            if (r2 == 0) goto L_0x0083
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x006f }
            y33 r5 = r5.e(r6, r7, r8, r9)     // Catch:{ all -> 0x006f }
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0082:
            return r5
        L_0x0083:
            throw r7     // Catch:{ all -> 0x006f }
        L_0x0084:
            r1.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5b.e(j55, android.graphics.Bitmap$Config, int, android.graphics.ColorSpace):y33");
    }

    public boolean f(yg8 yg8) {
        int id = yg8.getId();
        HashSet hashSet = (HashSet) this.o;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        yg8 yg82 = (yg8) ((HashMap) this.c).get(Integer.valueOf(n()));
        if (yg82 != null) {
            q(yg82, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!yg8.isChecked()) {
            yg8.setChecked(true);
        }
        return add;
    }

    public void g() {
        boolean z = !((HashSet) this.o).isEmpty();
        for (yg8 q : ((HashMap) this.c).values()) {
            q(q, false);
        }
        if (z) {
            o();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jd4 h(java.io.InputStream r8, android.graphics.BitmapFactory.Options r9, android.graphics.ColorSpace r10) {
        /*
            r7 = this;
            t9a r0 = defpackage.y33.w
            int r1 = r9.outWidth
            int r2 = r9.outHeight
            r3 = 0
            java.lang.Object r4 = r7.o
            com.facebook.imagepipeline.platform.PreverificationHelper r4 = (com.facebook.imagepipeline.platform.PreverificationHelper) r4
            if (r4 == 0) goto L_0x0017
            android.graphics.Bitmap$Config r5 = r9.inPreferredConfig
            boolean r4 = r4.shouldUseHardwareBitmapConfig(r5)
            if (r4 == 0) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = r3
        L_0x0018:
            r5 = 0
            java.lang.Object r6 = r7.c
            lo0 r6 = (defpackage.lo0) r6
            if (r4 == 0) goto L_0x0022
            r9.inMutable = r3
            goto L_0x003b
        L_0x0022:
            boolean r3 = r7.a
            if (r3 != 0) goto L_0x003b
            int r1 = r7.k(r1, r2, r9)
            java.lang.Object r1 = r6.get(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "BitmapPool.get returned null"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            r1 = r5
        L_0x003c:
            r9.inBitmap = r1
            if (r10 != 0) goto L_0x0046
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
        L_0x0046:
            r9.inPreferredColorSpace = r10
            java.lang.Object r10 = r7.v
            vqb r10 = (defpackage.vqb) r10
            java.lang.Object r2 = r10.c()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L_0x005c
            qv0 r2 = defpackage.r94.a
            r2 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L_0x005c:
            byte[] r3 = r2.array()     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            r9.inTempStorage = r3     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r5, r9)     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            r10.b(r2)
            if (r1 == 0) goto L_0x007b
            if (r1 == r8) goto L_0x007b
            r6.b(r1)
            if (r8 == 0) goto L_0x0075
            r8.recycle()
        L_0x0075:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x007b:
            boolean r7 = r7.b
            if (r7 == 0) goto L_0x0086
            sq6 r7 = defpackage.sq6.c
            jd4 r7 = defpackage.y33.q0(r8, r7, r0)
            return r7
        L_0x0086:
            jd4 r7 = defpackage.y33.q0(r8, r6, r0)
            return r7
        L_0x008b:
            r7 = move-exception
            goto L_0x00b3
        L_0x008d:
            r7 = move-exception
            goto L_0x0091
        L_0x008f:
            r7 = move-exception
            goto L_0x0097
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r6.b(r1)     // Catch:{ all -> 0x008b }
        L_0x0096:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r6.b(r1)     // Catch:{ all -> 0x008b }
        L_0x009c:
            r8.reset()     // Catch:{ IOException -> 0x00b2 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ IOException -> 0x00b2 }
            if (r8 == 0) goto L_0x00b1
            pf6 r9 = defpackage.pf6.j()     // Catch:{ IOException -> 0x00b2 }
            jd4 r7 = defpackage.y33.q0(r8, r9, r0)     // Catch:{ IOException -> 0x00b2 }
            r10.b(r2)
            return r7
        L_0x00b1:
            throw r7     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x00b3:
            r10.b(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5b.h(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.ColorSpace):jd4");
    }

    public void i() {
        if (this.a) {
            View view = (View) this.c;
            if (view.isAttachedToWindow()) {
                try {
                    ((WindowManager) this.o).removeViewImmediate(view);
                } catch (Throwable unused) {
                }
            }
            this.a = false;
            this.b = false;
        }
    }

    public void j() {
        if (this.a) {
            try {
                ((WindowManager) this.o).removeView((View) this.c);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.a = false;
                this.b = false;
                throw th;
            }
            this.a = false;
            this.b = false;
        }
    }

    public int k(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return vo0.c(i, i2, config);
    }

    public ArrayList l(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.o);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof yg8) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int n() {
        if (this.a) {
            HashSet hashSet = (HashSet) this.o;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public void o() {
        er7 er7 = (er7) this.v;
        if (er7 != null) {
            new HashSet((HashSet) this.o);
            ChipGroup chipGroup = (ChipGroup) er7.b;
            uz2 uz2 = chipGroup.x;
            if (uz2 != null) {
                chipGroup.y.l(chipGroup);
                p7d p7d = (p7d) uz2;
                ChipGroup chipGroup2 = (ChipGroup) p7d.c;
                if (chipGroup2.y.a) {
                    int checkedChipId = chipGroup2.getCheckedChipId();
                    e4a e4a = (e4a) ((tz2) p7d.b);
                    e4a.getClass();
                    for (int i = 0; i < chipGroup.getChildCount(); i++) {
                        View childAt = chipGroup.getChildAt(i);
                        childAt.setClickable(childAt.getId() != checkedChipId);
                    }
                    e4a.a0();
                    e4a.N(new a0(12, e4a));
                }
            }
        }
    }

    public void onError(Throwable th) {
        boolean z = this.a;
        cla cla = (cla) this.c;
        if (!z) {
            this.a = true;
            try {
                oka oka = (oka) ((zi6) this.o).apply(th);
                if (oka == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    cla.onError(nullPointerException);
                    return;
                }
                oka.a(this);
            } catch (Throwable th2) {
                hd8.Z(th2);
                cla.onError(new CompositeException(th, th2));
            }
        } else if (this.b) {
            n54.D(th);
        } else {
            cla.onError(th);
        }
    }

    public void p() {
        if (!this.b) {
            this.b = true;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.v;
            layoutParams.flags &= -9;
            try {
                ((WindowManager) this.o).updateViewLayout((View) this.c, layoutParams);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public boolean q(yg8 yg8, boolean z) {
        int id = yg8.getId();
        HashSet hashSet = (HashSet) this.o;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z || hashSet.size() != 1 || !hashSet.contains(Integer.valueOf(id))) {
            boolean remove = hashSet.remove(Integer.valueOf(id));
            if (yg8.isChecked()) {
                yg8.setChecked(false);
            }
            return remove;
        }
        yg8.setChecked(true);
        return false;
    }

    public g5b() {
        this.c = new HashMap();
        this.o = new HashSet();
    }

    public g5b(cla cla, ac2 ac2) {
        this.c = cla;
        this.o = ac2;
        this.v = new mw1(2);
    }

    public g5b(lo0 lo0, vqb vqb, zq0 zq0) {
        this.o = new PreverificationHelper();
        this.c = lo0;
        if (lo0 instanceof sx4) {
            this.a = zq0.a;
            this.b = zq0.b;
        }
        this.v = vqb;
    }

    public g5b(Context context, String str, ty tyVar, boolean z, boolean z2) {
        this.c = context;
        this.o = str;
        this.v = tyVar;
        this.a = z;
        this.b = z2;
    }
}
