package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.a;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.io.ConstantsKt;
import kotlin.math.MathKt;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: n09  reason: default package */
public final class n09 implements i74, Provider {
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public static boolean h(int i) {
        return i == 555 || i == 158 || i == 157 || i == 88 || i == 666;
    }

    public uc0 a() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((xjf) this.c) == null) {
            str = tr1.j(str, " inputTimebase");
        }
        if (((Size) this.o) == null) {
            str = tr1.j(str, " resolution");
        }
        if (((Integer) this.v) == null) {
            str = tr1.j(str, " colorFormat");
        }
        if (((vc0) this.w) == null) {
            str = tr1.j(str, " dataSpace");
        }
        if (((Integer) this.x) == null) {
            str = tr1.j(str, " frameRate");
        }
        if (((Integer) this.y) == null) {
            str = tr1.j(str, " IFrameInterval");
        }
        if (((Integer) this.z) == null) {
            str = tr1.j(str, " bitrate");
        }
        if (str.isEmpty()) {
            return new uc0((String) this.a, ((Integer) this.b).intValue(), (xjf) this.c, (Size) this.o, ((Integer) this.v).intValue(), (vc0) this.w, ((Integer) this.x).intValue(), ((Integer) this.y).intValue(), ((Integer) this.z).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b(a aVar) {
        this.a = String.valueOf(System.currentTimeMillis());
        h5 h5Var = new h5(17, this);
        jbf jbf = (jbf) this.x;
        jbf.getClass();
        kbf kbf = (kbf) jbf;
        jbd.b(h5Var, kbf.a(), new pbb(5, this, aVar), new y3a(16, (Object) this), kbf.c());
    }

    public List c(long j, gz6 gz6, int i, int i2, long j2, long j3) {
        gz6 gz62 = gz6;
        int i3 = i;
        int i4 = i2;
        if (!(gz62 instanceof a89)) {
            z68.f("n09", "item must be instanceof Message", (Throwable) null);
            return Collections.emptyList();
        }
        a89 a89 = (a89) gz62;
        if (i4 > 0) {
            f(a89, i2, 0);
        }
        if (i3 > 0) {
            f(a89, 0, i);
        }
        return ((i74) this.b).c(j, gz6, i, i2, j2, j3);
    }

    public void d() {
        FrgBaseProfile frgBaseProfile = (FrgBaseProfile) this.y;
        frgBaseProfile.getClass();
        try {
            Context O1 = frgBaseProfile.O1();
            if (O1 != null) {
                String[] strArr = n54.e;
                if (n54.e(O1, strArr)) {
                    b(frgBaseProfile);
                } else {
                    n54.O(frgBaseProfile, strArr, 158, qad.O6);
                }
            }
        } catch (Exception unused) {
        }
    }

    public xe8 e() {
        return (xe8) this.z;
    }

    public void f(a89 a89, int i, int i2) {
        a89 a892 = a89;
        os8 d = ((ps8) this.z).d();
        ha9 ha9 = a892.a;
        long j = ha9.c;
        if (d.d == ha9.z) {
            if (d.c.containsAll((Set) this.y)) {
                if (i > 0) {
                    long j2 = d.b;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                if (i2 > 0) {
                    long j3 = d.a;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
            }
        }
        a32 a32 = (a32) this.x;
        fce U = ((jna) ((rl) this.v)).U(new yt(a32.b.a, Long.valueOf(j), (Set) this.y, Integer.valueOf(i), Integer.valueOf(i2)), xfd.b());
        gcf gcf = (gcf) this.w;
        gcf.getClass();
        bd2 bd2 = (bd2) U.k(new ecf(gcf, 2, 0)).f();
        List d2 = bd2.d();
        ((fa9) this.a).h(a32.a, ((ltb) ((jtb) this.o)).a.s(), d2);
        r62 r62 = (r62) this.c;
        r62.getClass();
        ha9 ha92 = a892.a;
        long j4 = ha92.b;
        long j5 = ha92.o;
        long j6 = a32.a;
        r62.i(j6, false, new l62(r62, (Set) this.y, bd2, i2, j4, i, j5, j6));
    }

    public ImageView g() {
        return (ImageView) ((Lazy) this.y).getValue();
    }

    public Object get() {
        return new zyf((Context) ((Provider) this.b).get(), (tp9) ((Provider) this.c).get(), (g95) ((Provider) this.a).get(), (rm7) ((Provider) this.o).get(), (Executor) ((Provider) this.v).get(), (q6f) ((Provider) this.w).get(), (lzf) ((Provider) this.x).get(), (lzf) ((Provider) this.y).get(), (s23) ((Provider) this.z).get());
    }

    public void i() {
        this.a = null;
        this.z = null;
        FrgBaseProfile frgBaseProfile = (FrgBaseProfile) this.y;
        hi7.b0(0, frgBaseProfile.O1(), frgBaseProfile.S1(qad.s3));
    }

    public void j() {
        FrgBaseProfile frgBaseProfile = (FrgBaseProfile) this.y;
        frgBaseProfile.getClass();
        pl6 pl6 = new pl6(true, false, false, false, true, Collections.emptyList(), true, ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.a = String.valueOf(System.currentTimeMillis());
        xe0 xe0 = new xe0(frgBaseProfile.Q1());
        hd8.T(xe0, kad.b, kad.c);
        int i = frgBaseProfile.H0;
        GalleryFragment galleryFragment = new GalleryFragment();
        galleryFragment.L2(o54.f(TuplesKt.to("gallery_mode", pl6)));
        xe0.k(i, galleryFragment, (String) null);
        xe0.c((String) null);
        xe0.e(false);
    }

    public void k(a aVar) {
        if (aVar != null) {
            File r = ((po5) this.b).r((String) this.a);
            String absolutePath = r.getAbsolutePath();
            bud bud = (bud) this.o;
            o5a.X(bud, absolutePath, absolutePath);
            o5a.W(bud, r.getAbsolutePath());
            ActAvatarCrop.T(aVar, Uri.fromFile(r), r.getAbsolutePath(), true, false, false);
            return;
        }
        throw new IOException("failed to continue, fragment is null");
    }

    public void l(m09 m09) {
        String str = (String) this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Media viewer. New state media page: " + m09, (Throwable) null);
        }
        if (m09 != m09.a) {
            y7e.c((ViewGroup) this.b, g(), -1);
            m(true);
            if (m09 == m09.o) {
                ImageView g = g();
                int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                g.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            } else {
                ImageView g2 = g();
                int roundToInt2 = MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density);
                g2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
            }
        }
        int ordinal = m09.ordinal();
        if (ordinal == 0) {
            m(false);
        } else if (ordinal == 1) {
            g().setImageDrawable((Drawable) ((Lazy) this.w).getValue());
        } else if (ordinal == 2) {
            g().setImageDrawable((Drawable) ((Lazy) this.x).getValue());
        } else if (ordinal == 3) {
            g().setImageDrawable((te7) this.o);
        } else if (ordinal == 4) {
            g().setImageDrawable((Drawable) ((Lazy) this.v).getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.z = m09;
    }

    public void m(boolean z2) {
        g().setVisibility(z2 ? 0 : 8);
    }
}
