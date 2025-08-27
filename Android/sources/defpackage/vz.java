package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: vz  reason: default package */
public final class vz {
    public static final int w = ((int) ym.v.getResources().getDimension(ydc.attach_drawable));
    public static final Drawable x = ym.v.getResources().getDrawable(nad.c0);
    public static final Drawable y = ym.v.getResources().getDrawable(cad.E0);
    public static final Drawable z = ym.v.getResources().getDrawable(nad.h1);
    public final r20 a = new r20(ym.v);
    public final r20 b;
    public final r20 c;
    public final id3 d;
    public final o20 e;
    public final ro4 f;
    public final Context g;
    public final uz h;
    public l20 i;
    public a89 j;
    public boolean k;
    public boolean l;
    public VideoInfoTextView m;
    public VideoPlayerSeekBar n;
    public boolean o;
    public final GradientDrawable p;
    public final scf q;
    public boolean r;
    public LiveVideoPlaceHolderView s;
    public or7 t;
    public float[] u;
    public a32 v;

    public vz(View view, uz uzVar) {
        r20 r20 = new r20(ym.v);
        this.b = r20;
        r20 r202 = new r20(ym.v, nad.h1);
        this.c = r202;
        this.k = false;
        this.o = true;
        id3 e2 = ym.e();
        this.d = e2;
        this.g = view.getContext();
        this.e = ((qra) e2).h();
        this.f = ro4.b();
        this.h = uzVar;
        r20.setCallback(view);
        r202.setCallback(view);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.q = k0;
        this.p = i8b.K(Integer.valueOf(k0.s), (Integer) null, (Integer) null);
        Drawable drawable = x;
        int i2 = k0.u;
        iq.a0(drawable, i2);
        iq.a0(z, i2);
        iq.a0(y, i2);
    }

    public static File d(l20 l20) {
        po5 p2 = ((qra) ym.e()).p();
        boolean A = cvg.A(l20.b.X);
        x10 x10 = l20.b;
        return !A ? p2.l(x10.X) : (cvg.A(x10.z) || !cvg.A(l20.r)) ? p2.l(l20.q) : p2.l(String.valueOf(x10.y));
    }

    public final void a(sp6 sp6, m58 m58) {
        boolean W = ld8.W(this.i);
        l20 l20 = this.i;
        boolean z2 = false;
        if (l20.a == g20.c || W) {
            x10 x10 = W ? l20.j.d.b : l20.b;
            boolean z3 = l20.n.a() || this.i.n.b();
            if (x10.y == 0 || x10.v || (z3 && !i(x10))) {
                sp6.i((Drawable) null, 3);
            } else {
                sp6.i(this.a, 3);
            }
        } else {
            sp6.i((Drawable) null, 3);
        }
        if (this.v != null && ld8.g0(this.i, this.j)) {
            z2 = true;
        }
        BitmapDrawable b2 = this.e.b(this.i, z2);
        if (b2 != null) {
            sp6.i(new vdd(b2, m58), 1);
        } else {
            sp6.i((Drawable) null, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f0, code lost:
        if (defpackage.cvg.c((r5.z0 == null || (r5 = r5.D0) == null) ? null : r5.q, r0.i.q) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.graphics.Canvas r17, android.graphics.Rect r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            l20 r3 = r0.i
            g20 r4 = r3.a
            g20 r5 = defpackage.g20.c
            android.graphics.drawable.GradientDrawable r6 = r0.p
            r20 r8 = r0.b
            android.graphics.drawable.Drawable r9 = x
            r10 = 0
            int r12 = w
            if (r4 == r5) goto L_0x02d3
            boolean r3 = defpackage.ld8.W(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x02d3
        L_0x0020:
            l20 r3 = r0.i
            g20 r4 = r3.a
            g20 r5 = defpackage.g20.o
            if (r4 == r5) goto L_0x002e
            boolean r3 = defpackage.ld8.Y(r3)
            if (r3 == 0) goto L_0x048d
        L_0x002e:
            int r3 = r18.centerX()
            int r4 = r18.centerY()
            l20 r5 = r0.i
            boolean r5 = defpackage.ld8.Y(r5)
            if (r5 == 0) goto L_0x0047
            l20 r5 = r0.i
            s10 r5 = r5.j
            l20 r5 = r5.d
            k20 r5 = r5.d
            goto L_0x004b
        L_0x0047:
            l20 r5 = r0.i
            k20 r5 = r5.d
        L_0x004b:
            l20 r15 = r0.i
            boolean r15 = defpackage.ld8.Y(r15)
            android.graphics.drawable.Drawable r7 = z
            if (r15 != 0) goto L_0x0185
            l20 r15 = r0.i
            k20 r13 = r15.d
            r19 = r15
            long r14 = r13.a
            int r13 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0063
            goto L_0x0185
        L_0x0063:
            boolean r5 = defpackage.ld8.d0(r19)
            if (r5 != 0) goto L_0x0152
            l20 r5 = r0.i
            k20 r13 = r5.d
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x007d
            d20 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x007d
            goto L_0x0152
        L_0x007d:
            l20 r5 = r0.i
            d20 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x00c5
            l20 r5 = r0.i
            k20 r5 = r5.d
            long r13 = r5.a
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c5
            int r5 = r9.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r7 = r9.getIntrinsicHeight()
            int r7 = r7 / 2
            int r7 = r4 - r7
            int r8 = r9.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r10 = r9.getIntrinsicHeight()
            int r10 = r10 / 2
            int r10 = r10 + r4
            r9.setBounds(r5, r7, r8, r10)
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r7 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r6.setBounds(r5, r7, r3, r12)
            r6.draw(r1)
            r9.draw(r1)
            goto L_0x0224
        L_0x00c5:
            l20 r5 = r0.i
            d20 r5 = r5.n
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x011e
            l20 r5 = r0.i
            d20 r5 = r5.n
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x011e
            l20 r5 = r0.i
            k20 r5 = r5.d
            boolean r8 = r5.f
            if (r8 != 0) goto L_0x011e
            java.lang.String r5 = r5.g
            boolean r5 = defpackage.cvg.A(r5)
            if (r5 != 0) goto L_0x00ea
            goto L_0x011e
        L_0x00ea:
            int r5 = r9.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r7 = r9.getIntrinsicHeight()
            int r7 = r7 / 2
            int r7 = r4 - r7
            int r8 = r9.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r10 = r9.getIntrinsicHeight()
            int r10 = r10 / 2
            int r10 = r10 + r4
            r9.setBounds(r5, r7, r8, r10)
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r7 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r6.setBounds(r5, r7, r3, r12)
            r6.draw(r1)
            r9.draw(r1)
            goto L_0x0224
        L_0x011e:
            int r5 = r7.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r8 = r7.getIntrinsicHeight()
            int r8 = r8 / 2
            int r8 = r4 - r8
            int r9 = r7.getIntrinsicWidth()
            int r9 = r9 / 2
            int r9 = r9 + r3
            int r10 = r7.getIntrinsicHeight()
            int r10 = r10 / 2
            int r10 = r10 + r4
            r7.setBounds(r5, r8, r9, r10)
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r8 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r6.setBounds(r5, r8, r3, r12)
            r6.draw(r1)
            r7.draw(r1)
            goto L_0x0224
        L_0x0152:
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r6 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r8.setBounds(r5, r6, r3, r12)
            l20 r3 = r0.i
            float r3 = r3.p
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r0.h(r3)
            l20 r3 = r0.i
            k20 r3 = r3.d
            long r3 = r3.a
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x017f
            a89 r3 = r0.j
            ha9 r3 = r3.a
            qe9 r3 = r3.Y
            qe9 r4 = defpackage.qe9.EDITED
            if (r3 == r4) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r7 = 0
            goto L_0x0180
        L_0x017f:
            r7 = 1
        L_0x0180:
            r8.b(r1, r7)
            goto L_0x0224
        L_0x0185:
            boolean r8 = r0.o
            if (r8 == 0) goto L_0x0224
            l20 r8 = r0.i
            boolean r8 = defpackage.ld8.d0(r8)
            if (r8 == 0) goto L_0x01b6
            l20 r8 = r0.i
            boolean r8 = defpackage.ld8.Y(r8)
            if (r8 != 0) goto L_0x01b6
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r6 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r20 r4 = r0.c
            r4.setBounds(r5, r6, r3, r12)
            l20 r3 = r0.i
            float r3 = r3.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r3 = (int) r3
            r4.setLevel(r3)
            r3 = 1
            r4.b(r1, r3)
            goto L_0x0224
        L_0x01b6:
            boolean r5 = r5.n
            if (r5 != 0) goto L_0x01f2
            id3 r5 = r0.d
            qra r5 = (defpackage.qra) r5
            mu8 r8 = r5.t()
            boolean r8 = r8.v()
            if (r8 == 0) goto L_0x01f2
            a89 r8 = r0.j
            if (r8 == 0) goto L_0x01f2
            ha9 r8 = r8.a
            int r8 = r8.b()
            r9 = 1
            if (r8 != r9) goto L_0x01f2
            mu8 r5 = r5.t()
            smb r5 = r5.X
            j0a r8 = r5.z0
            if (r8 == 0) goto L_0x01e7
            l20 r5 = r5.D0
            if (r5 != 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            java.lang.String r5 = r5.q
            goto L_0x01e8
        L_0x01e7:
            r5 = 0
        L_0x01e8:
            l20 r8 = r0.i
            java.lang.String r8 = r8.q
            boolean r5 = defpackage.cvg.c(r5, r8)
            if (r5 == 0) goto L_0x0224
        L_0x01f2:
            int r5 = r7.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r8 = r7.getIntrinsicHeight()
            int r8 = r8 / 2
            int r8 = r4 - r8
            int r9 = r7.getIntrinsicWidth()
            int r9 = r9 / 2
            int r9 = r9 + r3
            int r10 = r7.getIntrinsicHeight()
            int r10 = r10 / 2
            int r10 = r10 + r4
            r7.setBounds(r5, r8, r9, r10)
            int r12 = r12 / 2
            int r5 = r3 - r12
            int r8 = r4 - r12
            int r3 = r3 + r12
            int r12 = r12 + r4
            r6.setBounds(r5, r8, r3, r12)
            r6.draw(r1)
            r7.draw(r1)
        L_0x0224:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            if (r3 == 0) goto L_0x0233
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0233
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            r3.draw(r1)
        L_0x0233:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            ro4 r4 = r0.f
            if (r3 == 0) goto L_0x0265
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0265
            l20 r3 = r0.i
            boolean r3 = defpackage.ld8.w(r3)
            if (r3 == 0) goto L_0x0265
            r17.save()
            int r3 = r2.left
            int r5 = r4.e
            int r3 = r3 + r5
            float r3 = (float) r3
            int r5 = r2.bottom
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r6 = r0.n
            int r6 = r6.getMeasuredHeight()
            int r5 = r5 - r6
            float r5 = (float) r5
            r1.translate(r3, r5)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            r3.draw(r1)
            r17.restore()
        L_0x0265:
            ru.ok.messages.views.widgets.VideoInfoTextView r3 = r0.m
            if (r3 == 0) goto L_0x048d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x048d
            r17.save()
            r4.getClass()
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = (int) r3
            int r4 = defpackage.vo4.b(r3)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r0.n
            if (r5 == 0) goto L_0x028d
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x028d
            r4 = 1086324736(0x40c00000, float:6.0)
            int r4 = (int) r4
            int r4 = defpackage.vo4.b(r4)
        L_0x028d:
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            boolean r5 = defpackage.ct.z(r5)
            if (r5 == 0) goto L_0x02b3
            int r5 = r2.right
            ru.ok.messages.views.widgets.VideoInfoTextView r6 = r0.m
            int r6 = r6.getMeasuredWidth()
            int r5 = r5 - r6
            int r3 = defpackage.vo4.b(r3)
            int r5 = r5 - r3
            float r3 = (float) r5
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
            goto L_0x02c9
        L_0x02b3:
            int r5 = r2.left
            int r3 = defpackage.vo4.b(r3)
            int r3 = r3 + r5
            float r3 = (float) r3
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
        L_0x02c9:
            ru.ok.messages.views.widgets.VideoInfoTextView r0 = r0.m
            r0.draw(r1)
            r17.restore()
            goto L_0x048d
        L_0x02d3:
            int r3 = r18.centerX()
            int r2 = r18.centerY()
            l20 r4 = r0.i
            boolean r4 = defpackage.ld8.W(r4)
            if (r4 == 0) goto L_0x02ec
            l20 r5 = r0.i
            s10 r5 = r5.j
            l20 r5 = r5.d
            x10 r5 = r5.b
            goto L_0x02f0
        L_0x02ec:
            l20 r5 = r0.i
            x10 r5 = r5.b
        L_0x02f0:
            long r13 = r5.y
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0332
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x0332
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.c()
            if (r7 != 0) goto L_0x0332
            l20 r4 = r0.i
            float r4 = r4.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r0.h(r4)
            int r12 = r12 / 2
            int r4 = r3 - r12
            int r5 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r8.setBounds(r4, r5, r3, r12)
            a89 r0 = r0.j
            ha9 r0 = r0.a
            qe9 r0 = r0.Y
            qe9 r2 = defpackage.qe9.EDITED
            if (r0 == r2) goto L_0x032c
            r7 = 1
            goto L_0x032d
        L_0x032c:
            r7 = 0
        L_0x032d:
            r8.b(r1, r7)
            goto L_0x048d
        L_0x0332:
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0360
            java.lang.String r7 = r5.z
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0360
            l20 r4 = r0.i
            float r4 = r4.p
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r0.h(r4)
            int r12 = r12 / 2
            int r0 = r3 - r12
            int r4 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r8.setBounds(r0, r4, r3, r12)
            r0 = 1
            r8.b(r1, r0)
            goto L_0x048d
        L_0x0360:
            if (r4 != 0) goto L_0x03a0
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x03a0
            int r0 = r9.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r9.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r9.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r7 = r9.getIntrinsicHeight()
            int r7 = r7 / 2
            int r7 = r7 + r2
            r9.setBounds(r0, r4, r5, r7)
            int r12 = r12 / 2
            int r0 = r3 - r12
            int r4 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r6.setBounds(r0, r4, r3, r12)
            r6.draw(r1)
            r9.draw(r1)
            goto L_0x048d
        L_0x03a0:
            if (r4 != 0) goto L_0x03ec
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x03ec
            boolean r7 = r0.i(r5)
            if (r7 != 0) goto L_0x03ec
            long r7 = r5.y
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x03ec
            int r0 = r9.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r9.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r9.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r7 = r9.getIntrinsicHeight()
            int r7 = r7 / 2
            int r7 = r7 + r2
            r9.setBounds(r0, r4, r5, r7)
            int r12 = r12 / 2
            int r0 = r3 - r12
            int r4 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r6.setBounds(r0, r4, r3, r12)
            r6.draw(r1)
            r9.draw(r1)
            goto L_0x048d
        L_0x03ec:
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x0451
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0451
            l20 r7 = r0.i
            d20 r7 = r7.n
            boolean r7 = r7.d()
            if (r7 != 0) goto L_0x0451
            boolean r5 = r5.v
            if (r5 == 0) goto L_0x0451
            uz r5 = r0.h
            if (r5 == 0) goto L_0x0451
            l20 r7 = r0.i
            boolean r5 = r5.j(r7)
            if (r5 != 0) goto L_0x0451
            if (r19 != 0) goto L_0x0451
            android.graphics.drawable.Drawable r0 = y
            int r4 = r0.getIntrinsicWidth()
            int r4 = r4 / 2
            int r4 = r3 - r4
            int r5 = r0.getIntrinsicHeight()
            int r5 = r5 / 2
            int r5 = r2 - r5
            int r7 = r0.getIntrinsicWidth()
            int r7 = r7 / 2
            int r7 = r7 + r3
            int r8 = r0.getIntrinsicHeight()
            int r8 = r8 / 2
            int r8 = r8 + r2
            r0.setBounds(r4, r5, r7, r8)
            int r12 = r12 / 2
            int r4 = r3 - r12
            int r5 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r6.setBounds(r4, r5, r3, r12)
            r6.draw(r1)
            r0.draw(r1)
            goto L_0x048d
        L_0x0451:
            if (r4 == 0) goto L_0x0457
            boolean r4 = r0.l
            if (r4 == 0) goto L_0x048d
        L_0x0457:
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x048d
            int r0 = r9.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r9.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r9.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r7 = r9.getIntrinsicHeight()
            int r7 = r7 / 2
            int r7 = r7 + r2
            r9.setBounds(r0, r4, r5, r7)
            int r12 = r12 / 2
            int r0 = r3 - r12
            int r4 = r2 - r12
            int r3 = r3 + r12
            int r12 = r12 + r2
            r6.setBounds(r0, r4, r3, r12)
            r6.draw(r1)
            r9.draw(r1)
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.b(android.graphics.Canvas, android.graphics.Rect, boolean):void");
    }

    public final knb c(gv4 gv4, boolean z2, boolean z3, boolean z4) {
        knb a2 = ld9.p.get();
        a2.h = mf6.b;
        l20 l20 = this.i;
        g20 g20 = l20.a;
        g20 g202 = g20.c;
        x10 x10 = l20.b;
        boolean z5 = false;
        a2.j = g20 == g202 && x10.v;
        this.l = false;
        String str = l20.r;
        id3 id3 = this.d;
        qa7 qa7 = null;
        if (g20 != g202) {
            g20 g203 = g20.o;
            o20 o20 = this.e;
            if (g20 == g203) {
                Uri a3 = o20.a(l20);
                if (a3 != null) {
                    a2.e = qa7.a(a3);
                }
            } else if (g20 == g20.w) {
                a2.e = qa7.a(po5.s(l20.f.b));
                a2.j = true;
            } else if (g20 == g20.X) {
                if (ld8.Y(l20)) {
                    Uri a4 = o20.a(this.i);
                    if (a4 != null) {
                        a2.e = qa7.a(a4);
                    } else {
                        a2.e = null;
                    }
                } else if (ld8.W(this.i)) {
                    if (!z2 && this.k && !this.i.n.c()) {
                        z5 = true;
                    }
                    Uri a5 = o20.a(this.i);
                    if (a5 != null) {
                        ra7 d2 = ra7.d(a5);
                        d2.b = z5 ? pa7.DISK_CACHE : pa7.FULL_FETCH;
                        if (z5) {
                            d2.n = new tz(this);
                        }
                        qa7 = d2.a();
                    }
                    if (cvg.A(str) || str.toLowerCase().endsWith(".heic")) {
                        a2.e = qa7;
                    } else {
                        ra7 d3 = ra7.d(o5a.x(str));
                        if (z3) {
                            d3.d = ryg.w(this.g, this.i, true);
                        }
                        if (z4) {
                            d3.l = id3.b(9, 10);
                        }
                        a2.e = d3.a();
                        a2.f = qa7;
                    }
                }
            }
        } else if (x10.y <= 0 || (!l20.n.a() && ((z2 || !this.k || this.i.n.c()) && (!this.i.n.b() || i(this.i.b))))) {
            l20 l202 = this.i;
            if (l202.b.v) {
                File d4 = d(l202);
                if (d4.exists()) {
                    a2.f = qa7.a(Uri.fromFile(d4));
                }
                if (!cvg.A(str)) {
                    int i2 = cjf.g;
                    if (!str.endsWith(".mp4")) {
                        a2.e = ra7.d(po5.s(o5a.z(str))).a();
                    }
                }
                if (z4) {
                    ryg.b(a2);
                    qa7 qa72 = (qa7) a2.f;
                    if (qa72 != null) {
                        ra7 b2 = ra7.b(qa72);
                        b2.l = id3.b(9, 10);
                        a2.f = b2.a();
                    }
                }
                return a2;
            }
            if (!cvg.A(str)) {
                File file = new File(str);
                if (file.exists()) {
                    Uri uri = mzf.a;
                    a2.e = qa7.a(Uri.fromFile(file));
                }
            }
            if ((!this.i.f() || cvg.A(this.i.b.a)) && cvg.A(this.i.b.b)) {
                z68.g("vz", "failed to build controller for photo attach, local id=", this.i.q);
                a2.e = null;
            } else {
                a2.e = ra7.d(po5.s(o5a.z(this.i.b.a()))).a();
            }
        } else {
            a2.e = null;
        }
        if (z4) {
            ryg.b(a2);
        }
        a2.k = true;
        a2.l = gv4;
        return a2;
    }

    public final void e(int i2, int i3) {
        VideoInfoTextView videoInfoTextView = this.m;
        if (videoInfoTextView != null) {
            videoInfoTextView.measure(View.MeasureSpec.makeMeasureSpec(i2, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, IntCompanionObject.MIN_VALUE));
            if (ct.z(this.m)) {
                VideoInfoTextView videoInfoTextView2 = this.m;
                videoInfoTextView2.layout(i2 - videoInfoTextView2.getMeasuredWidth(), 0, i2, this.m.getMeasuredHeight());
            } else {
                VideoInfoTextView videoInfoTextView3 = this.m;
                videoInfoTextView3.layout(0, 0, videoInfoTextView3.getMeasuredWidth(), this.m.getMeasuredHeight());
            }
        }
        VideoPlayerSeekBar videoPlayerSeekBar = this.n;
        if (videoPlayerSeekBar != null) {
            ro4 ro4 = this.f;
            videoPlayerSeekBar.measure(View.MeasureSpec.makeMeasureSpec(i2 - (ro4.e * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(ro4.d, 1073741824));
            VideoPlayerSeekBar videoPlayerSeekBar2 = this.n;
            videoPlayerSeekBar2.layout(0, 0, videoPlayerSeekBar2.getMeasuredWidth(), this.n.getMeasuredHeight());
        }
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            LiveVideoPlaceHolderView liveVideoPlaceHolderView2 = this.s;
            liveVideoPlaceHolderView2.layout(0, 0, liveVideoPlaceHolderView2.getMeasuredWidth(), this.s.getMeasuredHeight());
        }
    }

    public final boolean f(int i2, int i3, MotionEvent motionEvent) {
        uz uzVar = this.h;
        if (uzVar == null) {
            return false;
        }
        if (this.i.a == g20.a) {
            return true;
        }
        boolean z2 = fqc.k((double) i2, (double) i3, (double) motionEvent.getX(), (double) motionEvent.getY()) <= ((double) (w / 2));
        l20 l20 = this.i;
        if (l20.a == g20.o || ld8.Y(l20)) {
            boolean Y = ld8.Y(this.i);
            l20 l202 = this.i;
            if (Y) {
                l202 = l202.j.d;
            }
            k20 k20 = l202.d;
            if (k20.a == 0 && this.i.n.b()) {
                return false;
            }
            if (!this.i.n.d() || k20.a != 0 || Y) {
                if (!z2) {
                    return false;
                }
                uzVar.e(this.i);
            } else if (z2) {
                a89 a89 = this.j;
                if (a89.a.Y != qe9.EDITED) {
                    uzVar.f(this.i, a89);
                }
            }
            return true;
        }
        l20 l203 = this.i;
        if (l203.a != g20.c && !ld8.W(l203)) {
            return false;
        }
        x10 x10 = ld8.W(this.i) ? this.i.j.d.b : this.i.b;
        if (x10.y == 0 && this.i.n.b()) {
            return false;
        }
        boolean z3 = x10.v;
        if (z3 && this.i.n.c()) {
            uzVar.c(this.i);
        } else if (!z2) {
            return false;
        } else {
            if (x10.y == 0 && (this.i.n.d() || this.i.n.e())) {
                a89 a892 = this.j;
                if (a892.a.Y != qe9.EDITED) {
                    uzVar.f(this.i, a892);
                }
            } else if (!z3) {
                if (this.k) {
                    this.k = false;
                    uzVar.d(this.i);
                } else if (this.i.n.e() || (this.i.n.b() && i(x10))) {
                    uzVar.a(this.i);
                } else if (!this.i.n.a() && (!this.i.n.b() || i(x10))) {
                    return false;
                } else {
                    uzVar.d(this.i);
                }
            } else if (this.i.n.d()) {
                uzVar.a(this.i);
            } else {
                uzVar.c(this.i);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (defpackage.cvg.c(r0.q, r4.q) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.l20 r4, defpackage.a89 r5, defpackage.a32 r6) {
        /*
            r3 = this;
            l20 r0 = r3.i
            r1 = 1
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r4.q
            java.lang.String r0 = r0.q
            boolean r0 = defpackage.cvg.c(r0, r2)
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r3.r = r1
        L_0x0011:
            r3.v = r6
            r3.i = r4
            r3.j = r5
            id3 r4 = r3.d
            qra r4 = (defpackage.qra) r4
            z9f r4 = defpackage.tr1.h(r4)
            l20 r5 = r3.i
            boolean r5 = defpackage.ld8.Y(r5)
            l20 r6 = r3.i
            boolean r6 = defpackage.ld8.W(r6)
            l20 r0 = r3.i
            boolean r0 = r0.f()
            r2 = 0
            if (r0 != 0) goto L_0x003a
            if (r6 == 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r3.k = r2
            goto L_0x0067
        L_0x003a:
            if (r6 == 0) goto L_0x0045
            l20 r6 = r3.i
            s10 r6 = r6.j
            l20 r6 = r6.d
            x10 r6 = r6.b
            goto L_0x0049
        L_0x0045:
            l20 r6 = r3.i
            x10 r6 = r6.b
        L_0x0049:
            boolean r6 = r6.v
            if (r6 != 0) goto L_0x0064
            l20 r6 = r3.i
            d20 r6 = r6.n
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x0064
            sjd r4 = (defpackage.sjd) r4
            ed2 r4 = r4.h()
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            r3.k = r1
        L_0x0067:
            l20 r4 = r3.i
            g20 r4 = r4.a
            g20 r6 = defpackage.g20.o
            if (r4 == r6) goto L_0x0079
            if (r5 == 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            or7 r3 = r3.t
            defpackage.jbd.c(r3)
            goto L_0x0158
        L_0x0079:
            ru.ok.messages.views.widgets.VideoInfoTextView r4 = r3.m
            android.content.Context r6 = r3.g
            if (r4 != 0) goto L_0x0094
            ru.ok.messages.views.widgets.VideoInfoTextView r4 = new ru.ok.messages.views.widgets.VideoInfoTextView
            r4.<init>(r6)
            r3.m = r4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r4.setLayoutParams(r0)
            ru.ok.messages.views.widgets.VideoInfoTextView r4 = r3.m
            defpackage.ct.b(r4)
        L_0x0094:
            if (r5 == 0) goto L_0x009f
            l20 r4 = r3.i
            s10 r4 = r4.j
            l20 r4 = r4.d
            k20 r4 = r4.d
            goto L_0x00a3
        L_0x009f:
            l20 r4 = r3.i
            k20 r4 = r4.d
        L_0x00a3:
            id3 r5 = defpackage.ym.e()
            qra r5 = (defpackage.qra) r5
            ltb r5 = r5.y()
            boolean r5 = defpackage.ld8.x0(r5, r4)
            r0 = 8
            if (r5 == 0) goto L_0x00d2
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = r3.s
            if (r5 != 0) goto L_0x00c0
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = new ru.ok.messages.video.widgets.LiveVideoPlaceHolderView
            r5.<init>(r6)
            r3.s = r5
        L_0x00c0:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = r3.s
            r5.J0 = r4
            r5.M()
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = r3.s
            float[] r1 = r3.u
            r5.setCorners(r1)
            r3.j()
            goto L_0x00de
        L_0x00d2:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r5 = r3.s
            if (r5 == 0) goto L_0x00d9
            r5.setVisibility(r0)
        L_0x00d9:
            or7 r5 = r3.t
            defpackage.jbd.c(r5)
        L_0x00de:
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r3.m
            r5.l(r4)
            l20 r5 = r3.i
            boolean r5 = defpackage.ld8.w(r5)
            if (r5 == 0) goto L_0x0151
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r3.n
            if (r5 != 0) goto L_0x0140
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = new ru.ok.messages.video.widgets.VideoPlayerSeekBar
            r0 = 0
            r1 = 6
            r5.<init>(r6, r0, r1)
            r3.n = r5
            defpackage.ct.b(r5)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r3.n
            r5.setPadding(r2, r2, r2, r2)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r3.n
            r5.setSeekBarEnable(r2)
            android.content.res.Resources r5 = r6.getResources()
            int r6 = defpackage.nad.D2
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            android.graphics.drawable.LayerDrawable r5 = (android.graphics.drawable.LayerDrawable) r5
            r6 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r6 = r5.findDrawableByLayerId(r6)
            scf r0 = r3.q
            int r1 = r0.s
            defpackage.iq.a0(r6, r1)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r6 = r5.findDrawableByLayerId(r6)
            int r0 = r0.u
            defpackage.iq.a0(r6, r0)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r6 = r5.findDrawableByLayerId(r6)
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r0 = defpackage.j4b.l0(r1, r0)
            defpackage.iq.a0(r6, r0)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r6 = r3.n
            r6.setProgressDrawable(r5)
        L_0x0140:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r3.n
            long r5 = r4.j
            int r5 = (int) r5
            long r5 = (long) r5
            long r0 = r4.b
            int r4 = (int) r0
            r3.setMax(r4)
            int r4 = (int) r5
            r3.setProgress(r4)
            goto L_0x0158
        L_0x0151:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r3.n
            if (r3 == 0) goto L_0x0158
            r3.setVisibility(r0)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.g(l20, a89, a32):void");
    }

    public final void h(int i2) {
        boolean z2 = this.r;
        r20 r20 = this.b;
        if (z2) {
            this.r = false;
            if (r20.getLevel() == i2) {
                r20.onLevelChange(i2);
                return;
            }
        }
        r20.setLevel(i2);
    }

    public final boolean i(x10 x10) {
        return !x10.v && this.i.n.b() && !this.k && ((qra) this.d).y().a.m() - this.i.o > 60000;
    }

    public final void j() {
        jbd.c(this.t);
        if (this.h != null && ld8.b0(((qra) ym.e()).y(), this.i)) {
            lja s2 = jha.p(1, TimeUnit.SECONDS).s(qe.a());
            or7 or7 = new or7(new d9d(5, this), new rx0(22), m58.e);
            s2.a(or7);
            this.t = or7;
        }
    }
}
