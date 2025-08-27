package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: hf  reason: default package */
public final /* synthetic */ class hf implements e97 {
    public final /* synthetic */ AnimatedFactoryV2Impl a;

    public /* synthetic */ hf(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.a = animatedFactoryV2Impl;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object, lf] */
    public final v33 a(j55 j55, int i, tac tac, c97 c97) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.a;
        if (animatedFactoryV2Impl.e == null) {
            animatedFactoryV2Impl.e = new Object();
        }
        lf lfVar = animatedFactoryV2Impl.e;
        Bitmap.Config config = c97.b;
        lfVar.getClass();
        if (lf.b != null) {
            y33 o = y33.o(j55.a);
            o.getClass();
            try {
                e69 e69 = (e69) o.e0();
                t33 a2 = lf.a(j55.Y, c97, e69.s() != null ? GifImage.a(e69.s(), c97) : GifImage.b(e69.n(), e69.V(), c97));
                y33.U(o);
                return a2;
            } catch (Throwable th) {
                y33.U(o);
                throw th;
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }
}
