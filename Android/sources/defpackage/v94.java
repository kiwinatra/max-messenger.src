package defpackage;

import android.graphics.Bitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v94  reason: default package */
public abstract class v94 extends hl4 {
    public final yvb c;
    public final bwb d;
    public final c97 e;
    public boolean f;
    public final gn7 g;
    public int h;
    public final /* synthetic */ w94 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v94(w94 w94, zi0 zi0, yvb yvb, boolean z, int i2) {
        super(zi0);
        this.i = w94;
        this.c = yvb;
        ik0 ik0 = (ik0) yvb;
        this.d = ik0.c;
        c97 c97 = ik0.a.h;
        this.e = c97;
        oj0 oj0 = new oj0((Object) this, (Object) w94, i2, 3);
        Executor executor = w94.b;
        c97.getClass();
        this.g = new gn7(executor, oj0);
        ik0.a(new u94(this, z));
    }

    public final void d() {
        p();
    }

    public final void f(Throwable th) {
        q(th);
    }

    public final void h(int i2, Object obj) {
        j55 j55 = (j55) obj;
        tf6.P();
        boolean a = zi0.a(i2);
        yvb yvb = this.c;
        if (a) {
            if (j55 == null) {
                ik0 ik0 = (ik0) yvb;
                Intrinsics.areEqual(ik0.w.get("cached_value_found"), (Object) Boolean.TRUE);
                ik0.Z.v.getClass();
                q(new Exception("Encoded image is null."));
                return;
            } else if (!j55.e0()) {
                q(new Exception("Encoded image is not valid."));
                return;
            }
        }
        if (u(j55, i2)) {
            boolean l = zi0.l(i2, 4);
            if (a || l || ((ik0) yvb).f()) {
                this.g.c();
            }
        }
    }

    public final void j(float f2) {
        super.j(f2 * 0.99f);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashMap, xb7] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.HashMap, xb7] */
    public final xb7 m(v33 v33, long j, tac tac, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        v33 v332 = v33;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        String str9 = null;
        if (!this.d.i(this.c, "DecodeProducer")) {
            return null;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(((bc7) tac).b);
        String valueOf3 = String.valueOf(z);
        if (!(v332 == null || (extras = v33.getExtras()) == null || (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) == null)) {
            str9 = obj.toString();
        }
        boolean z2 = v332 instanceof CloseableStaticBitmap;
        Object obj2 = HasExtraData.KEY_NON_FATAL_DECODE_ERROR;
        String str10 = str9;
        if (z2) {
            Bitmap underlyingBitmap = ((CloseableStaticBitmap) v332).getUnderlyingBitmap();
            Bitmap bitmap = underlyingBitmap;
            String str11 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
            HashMap hashMap = new HashMap(8);
            hashMap.put("bitmapSize", str11);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str6);
            hashMap.put("imageFormat", str5);
            hashMap.put("requestedImageSize", str7);
            hashMap.put("sampleSize", str4);
            int byteCount = bitmap.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            hashMap.put("byteCount", sb.toString());
            if (str10 != null) {
                hashMap.put(obj2, str10);
            }
            return new HashMap(hashMap);
        }
        String str12 = str8;
        String str13 = str10;
        HashMap hashMap2 = new HashMap(7);
        hashMap2.put("queueTime", valueOf);
        hashMap2.put("hasGoodQuality", valueOf2);
        hashMap2.put("isFinal", valueOf3);
        hashMap2.put("encodedImageSize", str6);
        hashMap2.put("imageFormat", str5);
        hashMap2.put("requestedImageSize", str7);
        hashMap2.put("sampleSize", str12);
        if (str10 != null) {
            hashMap2.put(obj2, str10);
        }
        return new HashMap(hashMap2);
    }

    public abstract int n(j55 j55);

    public abstract bc7 o();

    public final void p() {
        s(true);
        this.b.c();
    }

    public final void q(Throwable th) {
        s(true);
        this.b.e(th);
    }

    public final v33 r(j55 j55, int i2, tac tac) {
        w94 w94 = this.i;
        w94.getClass();
        return w94.c.a(j55, i2, tac, this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x002b
            boolean r2 = r1.f     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0008
            goto L_0x002b
        L_0x0008:
            zi0 r2 = r1.b     // Catch:{ all -> 0x0028 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.i(r0)     // Catch:{ all -> 0x0028 }
            r2 = 1
            r1.f = r2     // Catch:{ all -> 0x0028 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)
            gn7 r2 = r1.g
            monitor-enter(r2)
            j55 r1 = r2.e     // Catch:{ all -> 0x0025 }
            r0 = 0
            r2.e = r0     // Catch:{ all -> 0x0025 }
            r0 = 0
            r2.f = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            defpackage.j55.b(r1)
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r1
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x002b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.s(boolean):void");
    }

    public final void t(j55 j55, v33 v33, int i2) {
        j55.m0();
        Integer valueOf = Integer.valueOf(j55.w);
        ik0 ik0 = (ik0) this.c;
        ik0.putExtra(HasExtraData.KEY_ENCODED_WIDTH, valueOf);
        j55.m0();
        ik0.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(j55.x));
        ik0.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(j55.o()));
        j55.m0();
        ik0.putExtra(HasExtraData.KEY_COLOR_SPACE, j55.X);
        if (v33 instanceof CloseableStaticBitmap) {
            ik0.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) v33).getUnderlyingBitmap().getConfig()));
        }
        if (v33 != null) {
            v33.putExtras(ik0.w);
        }
        ik0.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i2));
    }

    public abstract boolean u(j55 j55, int i2);
}
