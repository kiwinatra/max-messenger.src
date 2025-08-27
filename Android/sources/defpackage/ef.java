package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import com.facebook.animated.gif.GifFrame;
import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: ef  reason: default package */
public final class ef {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Cloneable h;
    public final Object i;
    public Object j;

    /* JADX WARNING: type inference failed for: r6v15, types: [ff[], java.lang.Cloneable] */
    public ef(djd djd, m7f m7f, Rect rect, boolean z) {
        new Rect();
        new Rect();
        this.c = djd;
        this.d = m7f;
        GifImage gifImage = (GifImage) m7f.a;
        this.e = gifImage;
        int[] f2 = gifImage.f();
        this.g = f2;
        djd.getClass();
        int length = f2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f2[i2] < 11) {
                f2[i2] = 100;
            }
        }
        int[] iArr = (int[]) this.g;
        ((djd) this.c).getClass();
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        this.a = i3;
        int[] iArr2 = (int[]) this.g;
        ((djd) this.c).getClass();
        int[] iArr3 = new int[iArr2.length];
        int length2 = iArr2.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            iArr3[i6] = i5;
            i5 += iArr2[i6];
        }
        this.f = a((GifImage) this.e, rect);
        this.b = z;
        this.h = new ff[((GifImage) this.e).e()];
        for (int i7 = 0; i7 < ((GifImage) this.e).e(); i7++) {
            ((ff[]) this.h)[i7] = ((GifImage) this.e).g(i7);
        }
        Paint paint = new Paint();
        this.i = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect a(GifImage gifImage, Rect rect) {
        return rect == null ? new Rect(0, 0, gifImage.k(), gifImage.h()) : new Rect(0, 0, Math.min(rect.width(), gifImage.k()), Math.min(rect.height(), gifImage.h()));
    }

    public qo8 b(ex8 ex8) {
        zz7 zz7 = (zz7) ((HashMap) this.i).get(ex8);
        if (zz7 == null || !zz7.isDone()) {
            return null;
        }
        try {
            return (qo8) o5a.p(zz7);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void c(Canvas canvas, float f2, float f3, ff ffVar) {
        if (ffVar.e == 2) {
            int ceil = (int) Math.ceil((double) (((float) ffVar.a) * f2));
            int ceil2 = (int) Math.ceil((double) (((float) ffVar.b) * f3));
            canvas.drawRect(new Rect(ceil, ceil2, ((int) Math.ceil((double) (((float) ffVar.c) * f2))) + ceil, ((int) Math.ceil((double) (((float) ffVar.d) * f3))) + ceil2), (Paint) this.i);
        }
    }

    public void d(boolean z) {
        ArrayList arrayList;
        ni0 ni0;
        ry8 ry8 = (ry8) this.c;
        synchronized (ry8.a) {
            arrayList = new ArrayList(ry8.c.values());
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (!i((ex8) arrayList.get(i2), false)) {
                i2++;
            } else {
                return;
            }
        }
        int i3 = v0g.a;
        ry8 ry82 = (ry8) this.c;
        if (i3 >= 24) {
            ct8.a(ry82, z);
        } else {
            ry82.stopForeground(z || i3 < 21);
        }
        this.b = false;
        if (z && (ni0 = (ni0) this.j) != null) {
            ((tea) this.f).b.cancel((String) null, ni0.b);
            this.a++;
            this.j = null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized android.graphics.Bitmap e(int r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.j     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x002e
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0018 }
            if (r0 < r2) goto L_0x001a
            java.lang.Object r0 = r1.j     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0018 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x0018 }
            if (r0 >= r3) goto L_0x002e
            goto L_0x001a
        L_0x0018:
            r2 = move-exception
            goto L_0x004a
        L_0x001a:
            monitor-enter(r1)     // Catch:{ all -> 0x0018 }
            java.lang.Object r0 = r1.j     // Catch:{ all -> 0x0028 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002a
            r0.recycle()     // Catch:{ all -> 0x0028 }
            r0 = 0
            r1.j = r0     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r2 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002e
        L_0x002c:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0018 }
        L_0x002e:
            java.lang.Object r0 = r1.j     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x003c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)     // Catch:{ all -> 0x0018 }
            r1.j = r2     // Catch:{ all -> 0x0018 }
        L_0x003c:
            java.lang.Object r2 = r1.j     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0018 }
            r3 = 0
            r2.eraseColor(r3)     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.j     // Catch:{ all -> 0x0018 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return r2
        L_0x004a:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef.e(int, int):android.graphics.Bitmap");
    }

    public void f(Canvas canvas, int i2) {
        GifFrame d2 = ((GifImage) this.e).d(i2);
        try {
            if (d2.d() > 0) {
                if (d2.c() > 0) {
                    g(canvas, d2);
                    d2.a();
                }
            }
        } finally {
            d2.a();
        }
    }

    public void g(Canvas canvas, GifFrame gifFrame) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.b) {
            float max = Math.max(((float) gifFrame.d()) / ((float) Math.min(gifFrame.d(), canvas.getWidth())), ((float) gifFrame.c()) / ((float) Math.min(gifFrame.c(), canvas.getHeight())));
            i4 = (int) (((float) gifFrame.d()) / max);
            i3 = (int) (((float) gifFrame.c()) / max);
            i2 = (int) (((float) gifFrame.e()) / max);
            i5 = (int) (((float) gifFrame.f()) / max);
        } else {
            i4 = gifFrame.d();
            i3 = gifFrame.c();
            i2 = gifFrame.e();
            i5 = gifFrame.f();
        }
        synchronized (this) {
            Bitmap e2 = e(i4, i3);
            this.j = e2;
            gifFrame.g(i4, i3, e2);
            canvas.save();
            canvas.translate((float) i2, (float) i5);
            canvas.drawBitmap((Bitmap) this.j, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
            canvas.restore();
        }
    }

    public void h(Canvas canvas, GifFrame gifFrame, ff ffVar, ff ffVar2) {
        Rect rect = (Rect) this.f;
        if (rect != null && rect.width() > 0 && ((Rect) this.f).height() > 0) {
            float width = ((float) canvas.getWidth()) / ((float) ((Rect) this.f).width());
            if (ffVar2 != null) {
                c(canvas, width, width, ffVar2);
            }
            int d2 = gifFrame.d();
            int c2 = gifFrame.c();
            Rect rect2 = new Rect(0, 0, d2, c2);
            int e2 = (int) (((float) gifFrame.e()) * width);
            int f2 = (int) (((float) gifFrame.f()) * width);
            Rect rect3 = new Rect(e2, f2, ((int) (((float) d2) * width)) + e2, ((int) (((float) c2) * width)) + f2);
            synchronized (this) {
                Bitmap e3 = e(d2, c2);
                gifFrame.g(d2, c2, e3);
                canvas.drawBitmap(e3, rect2, rect3, (Paint) null);
            }
        }
    }

    public boolean i(ex8 ex8, boolean z) {
        qo8 b2 = b(ex8);
        return b2 != null && (b2.q() || z) && (b2.getPlaybackState() == 3 || b2.getPlaybackState() == 2);
    }

    public void j(ex8 ex8, ni0 ni0, boolean z) {
        int i2 = v0g.a;
        Notification notification = (Notification) ni0.c;
        if (i2 >= 21) {
            notification.extras.putParcelable("android.mediaSession", (MediaSession.Token) ex8.a.h.X.a.c.b);
        }
        this.j = ni0;
        int i3 = ni0.b;
        if (z) {
            ry8 ry8 = (ry8) this.c;
            hw3.b(ry8, (Intent) this.h);
            if (i2 >= 29) {
                s0g.a(ry8, i3, notification, 2, "mediaPlayback");
            } else {
                ry8.startForeground(i3, notification);
            }
            this.b = true;
            return;
        }
        ((tea) this.f).a((String) null, i3, notification);
        d(false);
    }

    public ef(ry8 ry8, zs8 zs8, ni0 ni0) {
        this.c = ry8;
        this.d = zs8;
        this.e = ni0;
        this.f = new tea(ry8);
        this.g = new oc4(new Handler(Looper.getMainLooper()), 1);
        this.h = new Intent(ry8, ry8.getClass());
        this.i = new HashMap();
        this.b = false;
    }
}
