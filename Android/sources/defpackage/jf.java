package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: jf  reason: default package */
public final class jf implements e97 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [java.lang.Object, lf] */
    public final v33 a(j55 j55, int i, tac tac, c97 c97) {
        v33 a2;
        switch (this.a) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new Object();
                }
                lf lfVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = c97.b;
                lfVar.getClass();
                if (lf.a != null) {
                    y33 o = y33.o(j55.a);
                    o.getClass();
                    try {
                        e69 e69 = (e69) o.e0();
                        t33 a3 = lf.a(j55.Y, c97, e69.s() != null ? GifImage.a(e69.s(), c97) : GifImage.b(e69.n(), e69.V(), c97));
                        y33.U(o);
                        return a3;
                    } catch (Throwable th) {
                        y33.U(o);
                        throw th;
                    }
                } else {
                    throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
                }
            default:
                j55.m0();
                h97 h97 = j55.c;
                cg4 cg4 = (cg4) this.b;
                cg4.getClass();
                Boolean bool = Boolean.FALSE;
                c97.getClass();
                if (h97 == eg4.a) {
                    y33 e = cg4.c.e(j55, c97.a, i, (ColorSpace) null);
                    try {
                        e.getClass();
                        j55.m0();
                        int i2 = j55.o;
                        j55.m0();
                        CloseableStaticBitmap of = CloseableStaticBitmap.of(e, tac, i2, j55.v);
                        of.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        return of;
                    } finally {
                        y33.U(e);
                    }
                } else {
                    if (h97 == eg4.c) {
                        j55.m0();
                        if (j55.w != -1) {
                            j55.m0();
                            if (j55.x != -1) {
                                c97.getClass();
                                e97 e97 = cg4.a;
                                a2 = e97 != null ? e97.a(j55, i, tac, c97) : cg4.b(j55, c97);
                            }
                        }
                        throw new DecodeException("image width or height is incorrect", j55);
                    } else if (h97 == eg4.j) {
                        c97.getClass();
                        e97 e972 = cg4.b;
                        a2 = e972 != null ? e972.a(j55, i, tac, c97) : cg4.b(j55, c97);
                    } else if (h97 == eg4.m) {
                        return null;
                    } else {
                        if (h97 != h97.c) {
                            return cg4.b(j55, c97);
                        }
                        throw new DecodeException("unknown image format", j55);
                    }
                    return a2;
                }
        }
    }
}
