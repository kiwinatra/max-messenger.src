package defpackage;

import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: fkd  reason: default package */
public final /* synthetic */ class fkd implements zi6, lv, qk3, ice, o55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ fkd(jkd jkd, Toolbar toolbar) {
        this.a = 1;
        this.b = jkd;
        this.c = toolbar;
        this.o = null;
    }

    public void a(Surface surface) {
        Executor executor;
        nr4 nr4 = (nr4) this.b;
        int y = tr1.y(nr4.b);
        do1 do1 = (do1) this.c;
        if (y != 0) {
            if (y == 1) {
                z3f z3f = (z3f) this.o;
                if (z3f.a()) {
                    Objects.toString(z3f, "EMPTY");
                    do1.b((Object) null);
                    nr4.e();
                    return;
                }
                nr4.g = surface;
                Objects.toString(surface);
                z3f.b(surface, (Executor) nr4.d, new a0(19, nr4));
                nr4.b = 4;
                do1.b((g65) nr4.f);
                return;
            } else if (y != 2) {
                if (y == 3) {
                    if (!(((o55) nr4.j) == null || (executor = (Executor) nr4.i) == null)) {
                        executor.execute(new s6e(21, nr4, surface));
                    }
                    Objects.toString(surface);
                    return;
                } else if (y != 4) {
                    throw new IllegalStateException("State " + wzf.r(nr4.b) + " is not handled");
                }
            }
        }
        do1.b((Object) null);
    }

    public void accept(Object obj) {
        p47 p47 = (p47) obj;
        paf paf = (paf) this.b;
        paf.getClass();
        boolean z = p47.a;
        u6h u6h = (u6h) this.o;
        if (z) {
            Lazy lazy = paf.c;
            hq hqVar = ((ltb) ((jtb) lazy.getValue())).c;
            ((ltb) ((jtb) lazy.getValue())).b.getClass();
            hqVar.l("app.extra.downloaded.emoji.font.url", "");
            paf.d((File) this.c, u6h);
            return;
        }
        paf.k = (int) p47.b;
        long nanoTime = System.nanoTime();
        long j = paf.l;
        if (j == 0 || Math.abs(nanoTime - j) > 1000000000) {
            paf.l = nanoTime;
            if (u6h != null) {
                int i = paf.k;
                z68.c(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
                ((LoadEmojiFontWorker) u6h.b).state = new f28(i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v18, types: [uyf, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.o
            java.lang.Object r1 = r9.c
            java.lang.Object r2 = r9.b
            int r9 = r9.a
            switch(r9) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x000b;
                case 2: goto L_0x00c6;
                default: goto L_0x000b;
            }
        L_0x000b:
            j57 r10 = (defpackage.j57) r10
            jxf r2 = (defpackage.jxf) r2
            r2.getClass()
            boolean r9 = r10.a
            r2 = 0
            xyf r1 = (defpackage.xyf) r1
            bxf r0 = (defpackage.bxf) r0
            java.lang.String r3 = r10.b
            if (r9 == 0) goto L_0x0047
            r1.getClass()
            xyf r4 = defpackage.xyf.PHOTO
            if (r1 != r4) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            boolean r4 = r1.a()
            if (r4 != 0) goto L_0x002f
            xyf r4 = defpackage.xyf.EXTERNAL_GIF
            if (r1 != r4) goto L_0x0047
        L_0x002f:
            java.lang.String r1 = defpackage.o54.p(r3)
            boolean r3 = defpackage.cvg.A(r1)
            if (r3 != 0) goto L_0x0075
            uyf r2 = new uyf
            r2.<init>()
            r2.a = r1
            vyf r1 = new vyf
            r1.<init>(r2)
        L_0x0045:
            r2 = r1
            goto L_0x0075
        L_0x0047:
            if (r9 == 0) goto L_0x0073
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0073
            boolean r1 = defpackage.cvg.A(r3)
            if (r1 == 0) goto L_0x0056
            goto L_0x0075
        L_0x0056:
            java.lang.String r1 = defpackage.o54.s(r3)
            boolean r4 = defpackage.cvg.A(r1)
            if (r4 == 0) goto L_0x0066
            java.lang.String r1 = "jxf"
            defpackage.z68.f(r1, r3, r2)
            goto L_0x0075
        L_0x0066:
            uyf r2 = new uyf
            r2.<init>()
            r2.a = r1
            vyf r1 = new vyf
            r1.<init>(r2)
            goto L_0x0045
        L_0x0073:
            vyf r2 = r0.h
        L_0x0075:
            if (r9 == 0) goto L_0x0082
            if (r2 == 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            one.me.sdk.transfer.domain.UploadException r9 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r10 = "upload failed. no upload result on finished upload"
            r9.<init>(r10)
            throw r9
        L_0x0082:
            r3 = 0
            if (r9 == 0) goto L_0x009d
            java.lang.String r1 = r2.a
            boolean r1 = defpackage.cvg.A(r1)
            if (r1 == 0) goto L_0x009d
            long r5 = r2.b
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            one.me.sdk.transfer.domain.UploadException r9 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r10 = "upload failed. token and attachId are empty"
            r9.<init>(r10)
            throw r9
        L_0x009d:
            long r5 = r10.d
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00be
            axf r0 = r0.b()
            r0.h = r2
            if (r9 == 0) goto L_0x00ae
            wyf r9 = defpackage.wyf.UPLOADED
            goto L_0x00b0
        L_0x00ae:
            wyf r9 = defpackage.wyf.UPLOADING
        L_0x00b0:
            r0.g = r9
            float r9 = r10.c
            r0.e = r9
            r0.f = r5
            bxf r9 = new bxf
            r9.<init>(r0)
            return r9
        L_0x00be:
            one.me.sdk.transfer.domain.UploadException r9 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r10 = "upload failed. file has zero size"
            r9.<init>(r10)
            throw r9
        L_0x00c6:
            fu r10 = (defpackage.fu) r10
            cre r2 = (defpackage.cre) r2
            r2.getClass()
            java.util.List r9 = r10.o
            long r5 = r10.w
            vqe r10 = r2.e
            wbe r9 = r10.c(r9)
            u52 r10 = new u52
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r8 = 14
            r3 = r10
            r3.<init>((java.lang.Object) r4, (long) r5, (java.lang.Object) r7, (int) r8)
            wbe r9 = r9.i(r10)
            return r9
        L_0x00ea:
            java.lang.String r10 = (java.lang.String) r10
            kotlin.Lazy r9 = defpackage.scf.b0
            android.content.Context r2 = (android.content.Context) r2
            scf r9 = defpackage.j4b.k0(r2)
            int r9 = r9.l
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0146
            id3 r2 = defpackage.ym.e()
            qra r2 = (defpackage.qra) r2
            tld r2 = r2.B()
            java.util.List r0 = r2.e(r10, r0)
            int r2 = defpackage.fhf.a
            java.lang.String r2 = "[\\n\\r]"
            java.lang.String r3 = " "
            java.lang.String r10 = r10.replaceAll(r2, r3)
            java.lang.String r2 = "\\s{2,}"
            java.lang.String r10 = r10.replaceAll(r2, r3)
            boolean r2 = defpackage.cvg.A(r10)
            if (r2 == 0) goto L_0x0121
            goto L_0x0140
        L_0x0121:
            android.text.TextPaint r2 = r1.getPaint()
            float r2 = r2.measureText(r10)
            int r1 = r1.getMeasuredWidth()
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0140
            id3 r1 = defpackage.ym.e()
            qra r1 = (defpackage.qra) r1
            tld r1 = r1.B()
            java.lang.String r10 = r1.m(r10, r0)
        L_0x0140:
            r1 = 0
            android.text.SpannableString r9 = defpackage.i8b.D(r10, r0, r9, r1)
            goto L_0x014a
        L_0x0146:
            android.text.SpannableString r9 = defpackage.i8b.C(r9, r10, r0)
        L_0x014a:
            id3 r10 = defpackage.ym.e()
            qra r10 = (defpackage.qra) r10
            yva r10 = r10.v()
            u25 r10 = r10.k
            java.lang.CharSequence r9 = r10.c(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkd.apply(java.lang.Object):java.lang.Object");
    }

    public void b(View view) {
        jkd jkd = (jkd) this.b;
        jkd.getClass();
        view.setId(lic.menu_search__search);
        int i = lic.menu_search__search;
        Toolbar toolbar = (Toolbar) this.c;
        MenuItem findItem = toolbar != null ? toolbar.getMenu().findItem(i) : null;
        if (findItem != null) {
            findItem.setActionView(view);
            jkd.j(toolbar);
            Runnable runnable = (Runnable) this.o;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void h(pbe pbe) {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.o;
        switch (this.a) {
            case 4:
                jxf jxf = (jxf) obj2;
                jxf.getClass();
                bxf bxf = (bxf) obj;
                z68.c("jxf", "copyFromUri: started for uri=%s", bxf.a.a);
                kxf kxf = bxf.a;
                sv3 sv3 = (sv3) obj3;
                String a2 = ((wj0) ((ou8) jxf.g.g.getValue())).a(kxf.a, sv3.c);
                if (wc8.i(a2)) {
                    z68.c("jxf", "copyFromUri: finished for uri=%s", kxf.a);
                    if (!pbe.f()) {
                        axf b2 = bxf.b();
                        b2.b = a2;
                        b2.c = sv3.c;
                        b2.f = sv3.b;
                        pbe.a(new bxf(b2));
                        return;
                    }
                    return;
                } else if (!pbe.f()) {
                    pbe.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
            case 6:
                t4g t4g = (t4g) obj2;
                t4g.getClass();
                j4g j4g = (j4g) obj;
                z68.c("t4g", "copyFromUri: started for uri = %s", j4g.a.a);
                k4g k4g = j4g.a;
                String a3 = ((wj0) t4g.a).a(k4g.a, ((sv3) obj3).c);
                if (wc8.i(a3)) {
                    z68.c("t4g", "copyFromUri: finished for uri = %s", k4g.a);
                    if (!pbe.f()) {
                        lf6 a4 = j4g.a();
                        a4.o = a3;
                        pbe.a(new j4g(a4));
                        return;
                    }
                    return;
                } else if (!pbe.f()) {
                    pbe.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6((hz0) obj2, (rn1) obj, (WaitingRoomParticipants) obj3, pbe);
                return;
        }
    }

    public /* synthetic */ fkd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }
}
