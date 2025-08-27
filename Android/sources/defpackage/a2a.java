package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.stickers.FrgStickersLoader;

/* renamed from: a2a  reason: default package */
public final class a2a extends w1 implements pse {
    public final kc3 X;
    public final HashMap Y = new HashMap();
    public final HashMap Z = new HashMap();
    public final FrgStickersLoader b;
    public final FrgGifsLoader c;
    public final mre o;
    public final i1a v;
    public final sv0 w;
    public final moe x;
    public final ai5 y;
    public final jbf z;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, kc3] */
    public a2a(i1a i1a, FrgStickersLoader frgStickersLoader, FrgGifsLoader frgGifsLoader, mre mre, jd8 jd8, moe moe, ai5 ai5, jbf jbf) {
        this.v = i1a;
        this.b = frgStickersLoader;
        this.c = frgGifsLoader;
        this.o = mre;
        this.w = jd8;
        this.x = moe;
        this.y = ai5;
        this.z = jbf;
        this.X = new Object();
    }

    public final ype W() {
        ype ype = ype.SHOWCASE;
        if (X()) {
            return !cvg.A(U() ? ((j4a) this.a).Z() : "") ? ype.SEARCH : ype;
        } else if (((j4a) this.a).w0.getState() == rre.b) {
            return ype.SUGGEST;
        } else {
            this.b.getClass();
            return ype;
        }
    }

    public final boolean X() {
        f2a f2a = this.a;
        return f2a != null && ((j4a) f2a).w0.getState() == rre.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(defpackage.boe r8) {
        /*
            r7 = this;
            ype r0 = r7.W()
            ype r1 = defpackage.ype.SUGGEST
            r2 = 0
            i1a r7 = r7.v
            if (r0 != r1) goto L_0x0157
            k0a r7 = r7.a
            i1a r0 = r7.z
            p1a r1 = r0.c
            f2a r1 = r1.a
            if (r1 != 0) goto L_0x0016
            goto L_0x0025
        L_0x0016:
            s3a r1 = (defpackage.s3a) r1
            java.lang.Object r1 = r1.b
            android.content.Context r1 = (android.content.Context) r1
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0025
            android.app.Activity r1 = (android.app.Activity) r1
            defpackage.hd8.B(r1)
        L_0x0025:
            k1a r1 = r0.f
            f2a r1 = r1.a
            i3a r1 = (defpackage.i3a) r1
            boolean r3 = r1.c0()
            if (r3 != 0) goto L_0x0032
            goto L_0x0042
        L_0x0032:
            ok8 r1 = r1.w0
            android.view.View r1 = r1.getFocusedChild()
            if (r1 != 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            android.content.Context r3 = r1.getContext()
            defpackage.hd8.C(r3, r1)
        L_0x0042:
            h1a r0 = r0.d
            f2a r0 = r0.a
            if (r0 != 0) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            u2a r0 = (defpackage.u2a) r0
            d8b r0 = r0.X
            if (r0 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r0.d()
        L_0x0053:
            long r0 = r8.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "k0a"
            java.lang.String r3 = "sendSticker: stickerId = %d"
            defpackage.z68.c(r1, r3, r0)
            i1a r0 = r7.z
            p1a r1 = r0.c
            java.lang.String r3 = r1.a0()
            java.lang.String r4 = r1.a0()
            java.lang.String r4 = r4.toLowerCase()
            java.util.regex.Pattern r5 = defpackage.hhf.a
            java.util.List r8 = r8.z
            r5 = 1
            if (r8 == 0) goto L_0x0093
            java.util.Iterator r8 = r8.iterator()
        L_0x007f:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r8.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.equalsIgnoreCase(r4)
            if (r6 == 0) goto L_0x007f
            r8 = r5
            goto L_0x0094
        L_0x0093:
            r8 = 0
        L_0x0094:
            yva r4 = r0.b
            u25 r6 = r4.k
            boolean r6 = r6.f(r3)
            if (r6 != 0) goto L_0x00ac
            u25 r4 = r4.k
            java.util.List r4 = r4.a(r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00cd
            if (r8 == 0) goto L_0x00cd
        L_0x00ac:
            f2a r8 = r1.a
            if (r8 != 0) goto L_0x00b1
            goto L_0x00cd
        L_0x00b1:
            s3a r8 = (defpackage.s3a) r8
            ru.ok.messages.messages.widgets.MessageComposeEditText r4 = r8.X
            android.text.Editable r4 = r4.getText()
            if (r4 != 0) goto L_0x00bd
            r4 = r2
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r4 = r4.toString()
        L_0x00c1:
            boolean r4 = defpackage.cvg.c(r4, r2)
            if (r4 == 0) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            ru.ok.messages.messages.widgets.MessageComposeEditText r8 = r8.X
            r8.setText(r2)
        L_0x00cd:
            a2a r8 = r0.e
            boolean r0 = r8.U()
            if (r0 == 0) goto L_0x00de
            f2a r0 = r8.a
            j4a r0 = (defpackage.j4a) r0
            java.lang.CharSequence r0 = r0.Z()
            goto L_0x00e0
        L_0x00de:
            java.lang.String r0 = ""
        L_0x00e0:
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r3.toString()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0123
            boolean r0 = defpackage.cvg.A(r3)
            if (r0 == 0) goto L_0x00f5
            goto L_0x0123
        L_0x00f5:
            java.lang.String r0 = r3.trim()
            java.lang.String r3 = "\\s"
            java.lang.String[] r0 = r0.split(r3)
            int r0 = r0.length
            if (r0 != r5) goto L_0x0123
            f2a r0 = r1.a
            if (r0 != 0) goto L_0x0107
            goto L_0x0123
        L_0x0107:
            s3a r0 = (defpackage.s3a) r0
            ru.ok.messages.messages.widgets.MessageComposeEditText r1 = r0.X
            android.text.Editable r1 = r1.getText()
            if (r1 != 0) goto L_0x0113
            r1 = r2
            goto L_0x0117
        L_0x0113:
            java.lang.String r1 = r1.toString()
        L_0x0117:
            boolean r1 = defpackage.cvg.c(r1, r2)
            if (r1 == 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            ru.ok.messages.messages.widgets.MessageComposeEditText r0 = r0.X
            r0.setText(r2)
        L_0x0123:
            f2a r8 = r8.a
            if (r8 != 0) goto L_0x0128
            goto L_0x012d
        L_0x0128:
            j4a r8 = (defpackage.j4a) r8
            r8.a0()
        L_0x012d:
            lk3 r8 = r7.o
            r8.getClass()
            long r0 = r7.Z
            a32 r8 = r7.X
            if (r8 == 0) goto L_0x013a
            long r2 = r8.a
        L_0x013a:
            p99 r7 = r7.v
            r7.getClass()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r8 = 6
            java.lang.String r0 = defpackage.g63.q(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}
            java.lang.String r0 = "p99"
            java.lang.String r1 = "sendToConstructor, constructorId = %d, paramsType = %s"
            defpackage.z68.c(r0, r1, r7)
            defpackage.tr1.y(r8)
            return
        L_0x0157:
            r7.c()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2a.Y(boe):void");
    }

    public final void Z(String str) {
        if (U()) {
            this.Z.put(((j4a) this.a).x0.getCurrentInputType(), str);
            int ordinal = ((j4a) this.a).x0.getCurrentInputType().ordinal();
            if (ordinal == 0) {
                boolean A = cvg.A(str);
                FrgStickersLoader frgStickersLoader = this.b;
                if (!A) {
                    frgStickersLoader.m3(str);
                } else {
                    frgStickersLoader.h3();
                }
            } else if (ordinal == 1) {
                boolean A2 = cvg.A(str);
                FrgGifsLoader frgGifsLoader = this.c;
                if (!A2) {
                    frgGifsLoader.p3(str);
                } else if (!((j4a) this.a).d0()) {
                    frgGifsLoader.j3();
                }
            } else if (ordinal == 2) {
                boolean A3 = cvg.A(str);
                mre mre = this.o;
                if (!A3) {
                    mre.d(str);
                } else if (!((j4a) this.a).d0()) {
                    mre.b();
                }
            } else {
                Locale locale = Locale.ENGLISH;
                ose currentInputType = ((j4a) this.a).x0.getCurrentInputType();
                throw new IllegalStateException("Unexpected value: " + currentInputType);
            }
        }
    }

    public final void a0() {
        FrgStickersLoader frgStickersLoader = this.b;
        frgStickersLoader.getClass();
        z68.c("ru.ok.messages.stickers.FrgStickersLoader", "updateStickersFromServer", new Object[0]);
        if (frgStickersLoader.C1 > 0) {
            lbe C = frgStickersLoader.q1.g().C(frgStickersLoader.C1);
            ao1 ao1 = new ao1(3, new ni6(frgStickersLoader, 0), new ni6(frgStickersLoader, 1));
            C.l(ao1);
            frgStickersLoader.T2(ao1);
        }
    }

    @oye
    public void onEvent(sh3 sh3) {
        if (sh3.b != 1) {
            FrgStickersLoader frgStickersLoader = this.b;
            if (frgStickersLoader.L1 && X()) {
                frgStickersLoader.i3();
            }
            this.v.a.getClass();
            a0();
        }
    }

    public final void v(List list) {
        z68.c("a2a", "onStickersLoaded", new Object[0]);
        f2a f2a = this.a;
        if (f2a != null) {
            ((j4a) f2a).x0.setStickers((List<vte>) list);
        }
    }
}
