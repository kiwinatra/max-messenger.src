package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ml4  reason: default package */
public final /* synthetic */ class ml4 implements ql4, ice {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ Object w;

    public /* synthetic */ ml4(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = j;
        this.v = j2;
        this.w = obj3;
    }

    public ScheduledFuture b(u6h u6h) {
        switch (this.a) {
            case 0:
                pl4 pl4 = (pl4) this.b;
                pl4.getClass();
                return pl4.b.scheduleAtFixedRate(new nl4(pl4, (Runnable) this.c, u6h, 0), this.o, this.v, (TimeUnit) this.w);
            default:
                pl4 pl42 = (pl4) this.b;
                pl42.getClass();
                return pl42.b.scheduleWithFixedDelay(new nl4(pl42, (Runnable) this.c, u6h, 2), this.o, this.v, (TimeUnit) this.w);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r8v3, types: [mo5] */
    /* JADX WARNING: type inference failed for: r10v2, types: [gj7] */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.pbe r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Object r2 = r0.b
            p8g r2 = (defpackage.p8g) r2
            r2.getClass()
            java.lang.Object r3 = r0.c
            l20 r3 = (defpackage.l20) r3
            boolean r4 = r3.i()
            boolean r5 = defpackage.ld8.Y(r3)
            java.lang.String r6 = r2.b(r3)
            boolean r7 = defpackage.cvg.A(r6)
            android.content.Context r8 = r2.b
            if (r7 != 0) goto L_0x002a
            f58 r4 = new f58
            r4.<init>(r8, r6)
            goto L_0x00d5
        L_0x002a:
            r6 = 0
            if (r4 != 0) goto L_0x0032
            if (r5 != 0) goto L_0x0032
        L_0x002f:
            r4 = r6
            goto L_0x00d5
        L_0x0032:
            java.lang.String r7 = "VideoRipper"
            k20 r9 = r3.d
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = r9.g
            boolean r4 = defpackage.cvg.A(r4)
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "buildFetcher: video from ok"
            defpackage.z68.c(r7, r4, new java.lang.Object[0])
            gj7 r4 = new gj7
            long r5 = r0.v
            java.lang.String r7 = r9.l
            nh3 r11 = r2.j
            gcf r12 = r2.i
            kbf r13 = r2.e
            sv0 r14 = r2.k
            rl r15 = r2.h
            long r8 = r9.a
            r23 = r2
            long r1 = r0.o
            r10 = r4
            r16 = r8
            r18 = r1
            r20 = r5
            r22 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20, r22)
            r2 = r23
            goto L_0x00d5
        L_0x006b:
            r23 = r2
            if (r5 == 0) goto L_0x0087
            java.lang.String r1 = "buildFetcher: video file"
            defpackage.z68.c(r7, r1, new java.lang.Object[0])
            mo5 r4 = new mo5
            s10 r1 = r3.j
            long r12 = r1.a
            r2 = r23
            lfd r10 = r2.f
            gcf r11 = r2.i
            rl r9 = r2.h
            r8 = r4
            r8.<init>(r9, r10, r11, r12)
            goto L_0x00d5
        L_0x0087:
            r2 = r23
            java.lang.String r1 = r9.g
            boolean r4 = defpackage.prg.b(r1)
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = "buildFetcher: youtube video"
            defpackage.z68.c(r7, r4, new java.lang.Object[0])
            prg r4 = new prg
            r4.<init>(r8, r1)
            goto L_0x00d5
        L_0x009c:
            java.lang.String r4 = defpackage.gdg.b(r1)
            boolean r5 = defpackage.cvg.A(r4)
            if (r5 != 0) goto L_0x00b2
            java.lang.String r1 = "buildFetcher: vimeo"
            defpackage.z68.c(r7, r1, new java.lang.Object[0])
            gdg r1 = new gdg
            r1.<init>(r4)
            r4 = r1
            goto L_0x00d5
        L_0x00b2:
            java.lang.String r1 = defpackage.ei7.b(r1)
            boolean r4 = defpackage.cvg.A(r1)
            if (r4 != 0) goto L_0x00c7
            java.lang.String r4 = "buildFetcher: instagram"
            defpackage.z68.c(r7, r4, new java.lang.Object[0])
            ei7 r4 = new ei7
            r4.<init>(r1)
            goto L_0x00d5
        L_0x00c7:
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r4 = "buildFetcher: unknown type! null"
            defpackage.z68.n(r7, r6, r4, r1)
            goto L_0x002f
        L_0x00d5:
            if (r4 != 0) goto L_0x011b
            z10 r1 = defpackage.z10.b
            z10 r3 = r3.w
            if (r3 != r1) goto L_0x00f2
            boolean r0 = r25.f()
            if (r0 != 0) goto L_0x0126
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            r1 = 9
            java.lang.String r2 = "video is processing"
            r0.<init>(r1, r2)
            r1 = r25
            r1.onError(r0)
            goto L_0x0126
        L_0x00f2:
            r1 = r25
            ys7 r2 = r2.c
            java.lang.Object r2 = r2.get()
            nd r2 = (defpackage.nd) r2
            if (r2 == 0) goto L_0x0109
            java.lang.Object r0 = r0.w
            k20 r0 = (defpackage.k20) r0
            java.lang.String r0 = r0.g
            java.lang.String r3 = "ACTION_VIDEO_FETCH_UNSUPPORTED"
            r2.f(r3, r0)
        L_0x0109:
            boolean r0 = r25.f()
            if (r0 != 0) goto L_0x0126
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            r2 = 3
            java.lang.String r3 = "Unsupported video hosting"
            r0.<init>(r2, r3)
            r1.onError(r0)
            goto L_0x0126
        L_0x011b:
            r1 = r25
            boolean r0 = r25.f()
            if (r0 != 0) goto L_0x0126
            r1.a(r4)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml4.h(pbe):void");
    }
}
