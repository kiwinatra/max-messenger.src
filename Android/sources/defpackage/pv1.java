package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.stickers.FrgStickersLoader;

/* renamed from: pv1  reason: default package */
public final /* synthetic */ class pv1 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pv1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        f2a f2a;
        d8b d8b;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                nc0 nc0 = (nc0) obj;
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                lc0 lc0 = (lc0) obj;
                ti4 ti4 = (ti4) obj3;
                ti4.getClass();
                s3f s3f = (s3f) obj2;
                s3f.close();
                Surface surface = (Surface) ti4.y.remove(s3f);
                if (surface != null) {
                    nr4 nr4 = ti4.a;
                    ck6.d((AtomicBoolean) nr4.c, true);
                    ck6.c((Thread) nr4.e);
                    nr4.q(surface, true);
                    return;
                }
                return;
            case 2:
                lc0 lc02 = (lc0) obj;
                px4 px4 = (px4) obj3;
                px4.getClass();
                s3f s3f2 = (s3f) obj2;
                s3f2.close();
                Surface surface2 = (Surface) px4.y.remove(s3f2);
                if (surface2 != null) {
                    nx4 nx4 = px4.a;
                    ck6.d((AtomicBoolean) nx4.c, true);
                    ck6.c((Thread) nx4.e);
                    nx4.q(surface2, true);
                    return;
                }
                return;
            case 3:
                u58 u58 = (u58) obj;
                g1a g1a = (g1a) obj3;
                g1a.getClass();
                u58.f = ((Boolean) obj2).booleanValue();
                g1a.v.getClass();
                z68.e("g68", "background permissions is not supported yet");
                u58.g = false;
                return;
            case 4:
                h1a h1a = (h1a) obj;
                ((u2a) obj3).getClass();
                u2a.c0((p7b) obj2);
                h1a.getClass();
                Parcelable.Creator<goe> creator = goe.CREATOR;
                h1a.c.c();
                throw null;
            case 5:
                CharSequence charSequence = ((e15) obj3).c;
                CharSequence charSequence2 = ((e15) obj2).c;
                ve4 ve4 = ((h1a) obj).b;
                ve4.getClass();
                xa3 l = new na3(4, ve4.b.a.n().i(new tb4(16)), new rt3(12, (Object) new te4(charSequence.toString(), charSequence2.toString(), 0))).l(ve4.c);
                ao1 ao1 = new ao1(0, new tb4(13), new ue4(0));
                l.j(ao1);
                ve4.a.a(ao1);
                return;
            case 6:
                a2a a2a = (a2a) obj;
                if (((rre) obj3) == rre.b) {
                    z = true;
                }
                if (a2a.U()) {
                    FrgStickersLoader frgStickersLoader = a2a.b;
                    if (!z || !frgStickersLoader.E1 || cvg.A(frgStickersLoader.M1)) {
                        if (cvg.A(frgStickersLoader.M1)) {
                            j4a j4a = (j4a) a2a.a;
                            j4a.c0();
                            MenuItem c2 = j4a.z0.c();
                            if (c2 != null) {
                                c2.collapseActionView();
                            }
                        }
                        HashMap hashMap = a2a.Z;
                        String str = (String) obj2;
                        if (!cvg.c(str, (CharSequence) hashMap.get(((j4a) a2a.a).x0.getCurrentInputType()))) {
                            z68.c("a2a", "onStickerPanelStateChanged, search = %s", str);
                            j4a j4a2 = (j4a) a2a.a;
                            j4a2.c0();
                            j4a2.z0.h(str);
                            for (c0 c0Var : ((j4a) a2a.a).x0.v.o.values()) {
                                if (c0Var != null) {
                                    c0Var.a();
                                }
                            }
                            hashMap.put(((j4a) a2a.a).x0.getCurrentInputType(), str);
                            int ordinal = ((j4a) a2a.a).x0.getCurrentInputType().ordinal();
                            if (ordinal == 0) {
                                frgStickersLoader.m3(str);
                            } else if (ordinal == 1) {
                                a2a.c.p3(str);
                            } else if (ordinal == 2) {
                                a2a.o.d(str);
                            } else {
                                Locale locale = Locale.ENGLISH;
                                throw new IllegalStateException("Unexpected value: " + ((j4a) a2a.a).x0.getCurrentInputType());
                            }
                            if (cvg.A(str)) {
                                j4a j4a3 = (j4a) a2a.a;
                                j4a3.c0();
                                MenuItem c3 = j4a3.z0.c();
                                if (c3 != null) {
                                    c3.collapseActionView();
                                }
                            }
                        }
                    } else {
                        j4a j4a4 = (j4a) a2a.a;
                        String str2 = frgStickersLoader.M1;
                        j4a4.c0();
                        j4a4.z0.h(str2);
                    }
                    i1a i1a = a2a.v;
                    p1a p1a = i1a.c;
                    f2a f2a2 = p1a.a;
                    if (f2a2 != null) {
                        Context context = (Context) ((s3a) f2a2).b;
                        if (context instanceof Activity) {
                            hd8.B((Activity) context);
                        }
                    }
                    f2a f2a3 = p1a.a;
                    if (f2a3 != null) {
                        ((View) ((s3a) f2a3).c).setVisibility(4);
                    }
                    h1a h1a2 = i1a.d;
                    if (!(!h1a2.W() || (f2a = h1a2.a) == null || (d8b = ((u2a) f2a).X) == null)) {
                        d8b.d();
                    }
                    i1a.a.getClass();
                    return;
                }
                return;
            case 7:
                int intValue = ((Integer) obj3).intValue();
                b4a b4a = ((a4a) obj).a;
                b4a.getClass();
                if (intValue >= 20) {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                    if (atomicBoolean.get()) {
                        atomicBoolean.set(false);
                        ImageView imageView = b4a.F0;
                        boolean c0 = b4a.c0();
                        Context context2 = (Context) b4a.b;
                        imageView.setImageDrawable(c0 ? iq.E(nad.a2, -1, context2) : iq.E(nad.B, b4a.U0.x, context2));
                        b4a.M0.setImageDrawable(b4a.c0() ? iq.E(nad.B, b4a.U0.x, context2) : iq.E(nad.a2, b4a.U0.x, context2));
                    }
                    float f = ((float) (intValue - 20)) / 20.0f;
                    b4a.F0.setAlpha(f);
                    b4a.M0.setAlpha(f);
                    if (b4a.a0()) {
                        b4a.F0.setTranslationX((float) (intValue - 40));
                        b4a.M0.setTranslationX((float) ((-intValue) + 40));
                        return;
                    }
                    b4a.F0.setTranslationY((float) ((-intValue) + 40));
                    b4a.M0.setTranslationY((float) (intValue - 40));
                    return;
                }
                float f2 = (float) intValue;
                float f3 = 1.0f - (f2 / 20.0f);
                b4a.F0.setAlpha(f3);
                b4a.M0.setAlpha(f3);
                if (b4a.a0()) {
                    b4a.F0.setTranslationX((float) (-intValue));
                    b4a.M0.setTranslationX(f2);
                    return;
                }
                b4a.F0.setTranslationY(f2);
                b4a.M0.setTranslationY((float) (-intValue));
                return;
            default:
                Throwable th = (Throwable) obj;
                lyc lyc = (lyc) obj3;
                if (lyc.W == null) {
                    if (th instanceof EncodeException) {
                        lyc.f0 = 5;
                    } else {
                        lyc.f0 = 6;
                    }
                    lyc.W = th;
                    lyc.H();
                    ((do1) obj2).b((Object) null);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pv1(u2a u2a, boe boe, p7b p7b) {
        this.a = 4;
        this.b = u2a;
        this.c = p7b;
    }
}
