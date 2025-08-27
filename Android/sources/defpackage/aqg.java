package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.work.WorkRequest;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import ru.ok.messages.views.dialogs.FrgDlgFavoriteStickersLimit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException;

/* renamed from: aqg  reason: default package */
public final class aqg implements am, h65, ya3, cnd, Provider, nj6, mza {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ aqg(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public void C(CharSequence charSequence) {
        mza mza = ((c3b) ((d3b) this.c)).a;
        if (mza != null) {
            mza.C(charSequence);
        }
    }

    public void L() {
        int i;
        f3b f3b = (f3b) this.b;
        if (f3b != null) {
            h3b h3b = f3b.a;
            h3b.C0 = false;
            int ordinal = h3b.getForm().ordinal();
            boolean z = true;
            if (ordinal == 0) {
                i = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
            } else if (ordinal == 1) {
                i = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
            } else if (ordinal == 2) {
                i = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            h3b.setPadding(i, h3b.getPaddingTop(), h3b.getPaddingRight(), h3b.getPaddingBottom());
            if (h3b.getRightSecondaryView() instanceof pza) {
                View rightSecondaryView = h3b.getRightSecondaryView();
                if (rightSecondaryView != null) {
                    ViewGroup.LayoutParams layoutParams = rightSecondaryView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginEnd(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
                        rightSecondaryView.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                View rightPrimaryView = h3b.getRightPrimaryView();
                if (rightPrimaryView != null) {
                    rightPrimaryView.setVisibility(0);
                }
            }
            h3b.getTitleTextView().setVisibility(0);
            h3b.getTitleTextView().setWidth(h3b.getTitleTextView().getMeasuredWidth());
            Lazy lazy = h3b.x;
            if (lazy.isInitialized()) {
                j7e j7e = (j7e) lazy.getValue();
                if (j7e.getVisibility() != 0) {
                    z = false;
                }
                boolean z2 = h3b.B0;
                if (z != z2) {
                    j7e.setVisibility(z2 ? 0 : 8);
                    j7e.a(((Boolean) h3b.v.getValue(h3b, h3b.F0[4])).booleanValue());
                    h3b.m();
                }
            }
            Lazy<OneMeAvatarView> titleAvatarViewLazy = h3b.getTitleAvatarViewLazy();
            if (titleAvatarViewLazy.isInitialized()) {
                titleAvatarViewLazy.getValue().setVisibility(0);
            }
            Lazy<ImageView> titleDropdownViewLazy = h3b.getTitleDropdownViewLazy();
            if (titleDropdownViewLazy.isInitialized()) {
                titleDropdownViewLazy.getValue().setVisibility(0);
            }
            View leftView = h3b.getLeftView();
            if (leftView != null) {
                leftView.setVisibility(0);
            }
        }
        mza mza = ((c3b) ((d3b) this.c)).a;
        if (mza != null) {
            mza.L();
        }
    }

    public void a(Object obj) {
        Surface surface = (Surface) obj;
        hd8.N((zz7) this.a, (do1) this.b);
    }

    public void b() {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((kc3) this.a).dispose();
            ((ya3) this.c).b();
        }
    }

    public void c(mq4 mq4) {
        ((kc3) this.a).a(mq4);
    }

    public void d() {
        f3b f3b;
        if (((pza) this.a).z && (f3b = (f3b) this.b) != null) {
            f3b.a();
        }
        mza mza = ((c3b) ((d3b) this.c)).a;
        if (mza != null) {
            mza.d();
        }
    }

    public void e(qkf qkf, wf5 wf5, qtf qtf) {
        this.b = qkf;
        qtf.a();
        qtf.b();
        ypf B = wf5.B(qtf.e, 5);
        this.c = B;
        B.d((ca6) this.a);
    }

    public void f() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = (MediaCodec) this.a;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (dequeueOutputBuffer != -3) {
            u4g u4g = (u4g) this.b;
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer != -1 && dequeueOutputBuffer >= 0) {
                    if (bufferInfo.size > 0 && u4g != null) {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                        if ((bufferInfo.flags & 2) == 0) {
                            float f = (float) (((double) ((int) (((((double) bufferInfo.presentationTimeUs) / ((double) (u4g.y - u4g.x))) * 100.0d) * 100.0d))) / 100.0d);
                            qk3 qk3 = (qk3) u4g.w.a;
                            if (qk3 != null) {
                                try {
                                    qk3.accept(Float.valueOf(f));
                                } catch (Throwable th) {
                                    z68.f("qva", "convertVideo: progress accept failed", th);
                                }
                            }
                        }
                        d0a d0a = u4g.c;
                        if (d0a.b()) {
                            boolean z = d0a.c;
                            MediaMuxer mediaMuxer = (MediaMuxer) d0a.f;
                            if (!z) {
                                mediaMuxer.start();
                                d0a.c = true;
                            }
                            d0a.a();
                            mediaMuxer.writeSampleData(d0a.a, outputBuffer, bufferInfo);
                        } else {
                            ((ArrayList) d0a.g).add(new c0a(d0a.a, outputBuffer, bufferInfo));
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0 && u4g != null) {
                        MediaCodec mediaCodec2 = (MediaCodec) u4g.h.a;
                        if (mediaCodec2 != null) {
                            mediaCodec2.stop();
                        }
                        MediaCodec mediaCodec3 = (MediaCodec) u4g.h.a;
                        if (mediaCodec3 != null) {
                            mediaCodec3.release();
                        }
                        u4g.g.a();
                        ((MediaMuxer) u4g.c.f).stop();
                        ((MediaMuxer) u4g.c.f).release();
                        u4g.l = true;
                    }
                }
            } else if (u4g != null) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                d0a d0a2 = u4g.c;
                d0a2.a = ((MediaMuxer) d0a2.f).addTrack(outputFormat);
            }
        }
    }

    public void g(Throwable th) {
        boolean z = th instanceof CancellationException;
        do1 do1 = (do1) this.b;
        if (z) {
            bs0.r((String) null, do1.d(new RuntimeException(wj6.n(new StringBuilder(), (String) this.c, " cancelled."), th)));
        } else {
            do1.b((Object) null);
        }
    }

    public Object get() {
        return new agd(((Integer) ((Provider) this.c).get()).intValue(), (Context) ((Provider) this.a).get(), (String) ((Provider) this.b).get());
    }

    public op7 getFailParser() {
        return (op7) this.c;
    }

    public op7 getOkParser() {
        return (op7) this.b;
    }

    public int getPriority() {
        return ((hm) this.a).getPriority();
    }

    public mm getScope() {
        return ((hm) this.a).getScope();
    }

    public Uri getUri() {
        return ((hm) this.a).getUri();
    }

    public void h(g1g g1g) {
        long c2;
        long j;
        y64.k((qkf) this.b);
        int i = t0g.a;
        qkf qkf = (qkf) this.b;
        synchronized (qkf) {
            try {
                long j2 = qkf.c;
                c2 = j2 != -9223372036854775807L ? j2 + qkf.b : qkf.c();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        qkf qkf2 = (qkf) this.b;
        synchronized (qkf2) {
            j = qkf2.b;
        }
        if (c2 != -9223372036854775807L && j != -9223372036854775807L) {
            ca6 ca6 = (ca6) this.a;
            if (j != ca6.y0) {
                aa6 a2 = ca6.a();
                a2.o = j;
                ca6 ca62 = new ca6(a2);
                this.a = ca62;
                ((ypf) this.c).d(ca62);
            }
            int c3 = g1g.c();
            ((ypf) this.c).c(c3, g1g);
            ((ypf) this.c).b(c2, 1, c3, 0, (wpf) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.or6
            if (r0 == 0) goto L_0x0013
            r0 = r7
            or6 r0 = (defpackage.or6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            or6 r0 = new or6
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0076 }
            goto L_0x0069
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r7)
            jw9 r7 = new jw9
            r2 = 18
            r7.<init>(r3, r2)
            java.lang.String r2 = "conversationId"
            r7.t(r2, r6)
            java.lang.Object r6 = r5.a     // Catch:{ all -> 0x0076 }
            rl r6 = (defpackage.rl) r6     // Catch:{ all -> 0x0076 }
            java.lang.Object r2 = r5.b     // Catch:{ all -> 0x0076 }
            lfd r2 = (defpackage.lfd) r2     // Catch:{ all -> 0x0076 }
            jna r6 = (defpackage.jna) r6     // Catch:{ all -> 0x0076 }
            fce r6 = r6.U(r7, r2)     // Catch:{ all -> 0x0076 }
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x0076 }
            gcf r5 = (defpackage.gcf) r5     // Catch:{ all -> 0x0076 }
            r5.getClass()     // Catch:{ all -> 0x0076 }
            ecf r7 = new ecf     // Catch:{ all -> 0x0076 }
            r2 = 0
            r7.<init>(r5, r4, r2)     // Catch:{ all -> 0x0076 }
            dx5 r5 = r6.k(r7)     // Catch:{ all -> 0x0076 }
            r0.c = r4     // Catch:{ all -> 0x0076 }
            java.lang.Object r7 = defpackage.bs0.f(r5, r0)     // Catch:{ all -> 0x0076 }
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            w3g r7 = (defpackage.w3g) r7     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r5 = r7.c     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r3 = r5
        L_0x0071:
            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r3)     // Catch:{ all -> 0x0076 }
            return r5
        L_0x0076:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.i65 j(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Object r0 = r2.get(r0)
            i65 r0 = (defpackage.i65) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.a
            h65 r3 = (defpackage.h65) r3
            boolean r4 = r3.m(r1)
            if (r4 == 0) goto L_0x013e
            i65 r3 = r3.o(r1)
            if (r3 != 0) goto L_0x0030
        L_0x002d:
            r5 = 0
            goto L_0x0136
        L_0x0030:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r3.d()
            r4.<init>(r6)
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0041:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0052
            java.lang.Object r7 = r6.next()
            sa0 r7 = (defpackage.sa0) r7
            int r8 = r7.j
            if (r8 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 != 0) goto L_0x0058
            r5 = 0
            goto L_0x00c6
        L_0x0058:
            int r6 = r7.j
            r15 = 1
            if (r15 == r6) goto L_0x0068
            r6 = 5
            java.lang.String r8 = "video/hevc"
            r9 = 2
        L_0x0061:
            r10 = r8
            r19 = r9
            r9 = r6
            r6 = r19
            goto L_0x006f
        L_0x0068:
            int r6 = r7.a
            java.lang.String r8 = r7.b
            int r9 = r7.g
            goto L_0x0061
        L_0x006f:
            r14 = 10
            int r8 = r7.c
            int r11 = r7.h
            if (r14 != r11) goto L_0x007b
            r16 = r6
            r11 = r8
            goto L_0x00ac
        L_0x007b:
            android.util.Rational r12 = new android.util.Rational
            r12.<init>(r14, r11)
            r16 = r6
            double r5 = (double) r8
            double r12 = r12.doubleValue()
            double r12 = r12 * r5
            int r5 = (int) r12
            java.lang.String r6 = "BackupHdrProfileEncoderProfilesProvider"
            r12 = 3
            boolean r6 = defpackage.o54.C(r12, r6)
            if (r6 == 0) goto L_0x00ab
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r8, r11, r12}
            java.lang.String r8 = "Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d"
            java.lang.String.format(r8, r6)
        L_0x00ab:
            r11 = r5
        L_0x00ac:
            sa0 r5 = new sa0
            int r6 = r7.f
            int r13 = r7.i
            int r12 = r7.d
            int r7 = r7.e
            r8 = r5
            r17 = r13
            r13 = r7
            r7 = r14
            r14 = r6
            r6 = r15
            r15 = r16
            r16 = r7
            r18 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00c6:
            if (r5 != 0) goto L_0x00ca
        L_0x00c8:
            r5 = 0
            goto L_0x0119
        L_0x00ca:
            uc0 r6 = defpackage.e4g.d(r5)
            java.lang.Object r0 = r0.b
            bj6 r0 = (defpackage.bj6) r0
            java.lang.Object r0 = r0.apply(r6)
            a5g r0 = (defpackage.a5g) r0
            if (r0 == 0) goto L_0x00c8
            int r7 = r5.e
            int r8 = r5.f
            boolean r7 = r0.B0(r7, r8)
            if (r7 != 0) goto L_0x00e5
            goto L_0x00c8
        L_0x00e5:
            android.util.Range r0 = r0.E0()
            int r6 = r6.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Comparable r0 = r0.clamp(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            if (r10 != r6) goto L_0x00fc
            goto L_0x0119
        L_0x00fc:
            sa0 r0 = new sa0
            int r14 = r5.g
            int r15 = r5.h
            int r8 = r5.a
            java.lang.String r9 = r5.b
            int r11 = r5.d
            int r12 = r5.e
            int r13 = r5.f
            int r6 = r5.i
            int r5 = r5.j
            r7 = r0
            r16 = r6
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r0
        L_0x0119:
            if (r5 == 0) goto L_0x011e
            r4.add(r5)
        L_0x011e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0126
            goto L_0x002d
        L_0x0126:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            ra0 r5 = defpackage.ra0.e(r0, r5, r3, r4)
        L_0x0136:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.put(r0, r5)
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.j(int):i65");
    }

    public ArrayList k(String str) {
        d7d a2 = d7d.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }

    public void l() {
        f3b f3b;
        if (((pza) this.a).z && (f3b = (f3b) this.b) != null) {
            f3b.a();
        }
        mza mza = ((c3b) ((d3b) this.c)).a;
        if (mza != null) {
            mza.l();
        }
    }

    public boolean m(int i) {
        return ((h65) this.a).m(i) && j(i) != null;
    }

    public void n() {
        mza mza = ((c3b) ((d3b) this.c)).a;
        if (mza != null) {
            mza.n();
        }
    }

    public i65 o(int i) {
        return j(i);
    }

    public void onError(Throwable th) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((kc3) this.a).dispose();
            ((ya3) this.c).onError(th);
            return;
        }
        n54.D(th);
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [sda, bda] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e1 A[SYNTHETIC, Splitter:B:128:0x02e1] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02f2 A[SYNTHETIC, Splitter:B:133:0x02f2] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038e A[SYNTHETIC, Splitter:B:169:0x038e] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03b1 A[SYNTHETIC, Splitter:B:179:0x03b1] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0485 A[SYNTHETIC, Splitter:B:228:0x0485] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6 A[Catch:{ NameNotFoundException -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0183 A[SYNTHETIC, Splitter:B:69:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p() {
        /*
            r17 = this;
            r1 = r17
            r2 = 2
            r3 = 0
            java.lang.Object r0 = r1.c
            er7 r0 = (defpackage.er7) r0
            java.lang.String r4 = "gcm.n.noui"
            boolean r0 = r0.G(r4)
            r4 = 1
            if (r0 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = "keyguard"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x0025
            goto L_0x0052
        L_0x0025:
            int r5 = android.os.Process.myPid()
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0052
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            int r7 = r6.pid
            if (r7 != r5) goto L_0x003b
            int r0 = r6.importance
            r5 = 100
            if (r0 != r5) goto L_0x0052
            return r3
        L_0x0052:
            java.lang.Object r0 = r1.c
            er7 r0 = (defpackage.er7) r0
            java.lang.String r5 = "gcm.n.image"
            java.lang.String r0 = r0.M(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0064
        L_0x0062:
            r5 = 0
            goto L_0x006e
        L_0x0064:
            f97 r5 = new f97     // Catch:{ MalformedURLException -> 0x0062 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0062 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0062 }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x0062 }
        L_0x006e:
            if (r5 == 0) goto L_0x008a
            java.lang.Object r0 = r1.a
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            qdf r7 = new qdf
            r7.<init>()
            uo5 r8 = new uo5
            r9 = 10
            r8.<init>((int) r9, (java.lang.Object) r5, (java.lang.Object) r7)
            java.util.concurrent.Future r0 = r0.submit(r8)
            r5.b = r0
            s7h r0 = r7.a
            r5.c = r0
        L_0x008a:
            java.lang.Object r0 = r1.b
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r0 = r1.c
            r8 = r0
            er7 r8 = (defpackage.er7) r8
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.e93.a
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r9 = r7.getPackageName()
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00ac }
            if (r0 == 0) goto L_0x00b0
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00ac }
            if (r0 == 0) goto L_0x00b0
        L_0x00aa:
            r9 = r0
            goto L_0x00b3
        L_0x00ac:
            r0 = move-exception
            r0.toString()
        L_0x00b0:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            goto L_0x00aa
        L_0x00b3:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r8.M(r0)
            r10 = 3
            android.content.pm.PackageManager r11 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cc }
            java.lang.String r12 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x00cc }
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x00cc }
            int r11 = r11.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00cc }
            r12 = 26
            if (r11 >= r12) goto L_0x00ce
        L_0x00cc:
            r0 = 0
            goto L_0x011f
        L_0x00ce:
            java.lang.Class<android.app.NotificationManager> r11 = android.app.NotificationManager.class
            java.lang.Object r11 = r7.getSystemService(r11)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00e3
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00e3
            goto L_0x011f
        L_0x00e3:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r9.getString(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00f6
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00f6
            goto L_0x011f
        L_0x00f6:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 != 0) goto L_0x011f
            android.content.res.Resources r12 = r7.getResources()
            java.lang.String r13 = r7.getPackageName()
            java.lang.String r14 = "fcm_fallback_notification_channel_label"
            java.lang.String r15 = "string"
            int r12 = r12.getIdentifier(r14, r15, r13)
            if (r12 != 0) goto L_0x0113
            java.lang.String r12 = "Misc"
            goto L_0x0117
        L_0x0113:
            java.lang.String r12 = r7.getString(r12)
        L_0x0117:
            android.app.NotificationChannel r13 = new android.app.NotificationChannel
            r13.<init>(r0, r12, r10)
            r11.createNotificationChannel(r13)
        L_0x011f:
            java.lang.String r11 = r7.getPackageName()
            android.content.res.Resources r12 = r7.getResources()
            android.content.pm.PackageManager r13 = r7.getPackageManager()
            eda r14 = new eda
            r14.<init>(r7, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r8.L(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x013f
            r14.f(r0)
        L_0x013f:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r8.L(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x015c
            r14.e(r0)
            cda r15 = new cda
            r15.<init>(r3)
            java.lang.CharSequence r0 = defpackage.eda.c(r0)
            r15.f = r0
            r14.q(r15)
        L_0x015c:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r8.M(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x017a
            java.lang.String r15 = "drawable"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x0171
            goto L_0x0195
        L_0x0171:
            java.lang.String r15 = "mipmap"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x017a
            goto L_0x0195
        L_0x017a:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r15 = r9.getInt(r0, r3)
            if (r15 == 0) goto L_0x0183
            goto L_0x018e
        L_0x0183:
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x018a }
            int r15 = r0.icon     // Catch:{ NameNotFoundException -> 0x018a }
            goto L_0x018e
        L_0x018a:
            r0 = move-exception
            r0.toString()
        L_0x018e:
            if (r15 == 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r15 = r0
        L_0x0195:
            android.app.Notification r0 = r14.F
            r0.icon = r15
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r8.M(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01ab
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r8.M(r0)
        L_0x01ab:
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01b3
            r0 = 0
            goto L_0x01e2
        L_0x01b3:
            java.lang.String r15 = "default"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L_0x01de
            java.lang.String r15 = "raw"
            int r12 = r12.getIdentifier(r0, r15, r11)
            if (r12 == 0) goto L_0x01de
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "android.resource://"
            r12.<init>(r15)
            r12.append(r11)
            java.lang.String r15 = "/raw/"
            r12.append(r15)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01e2
        L_0x01de:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r2)
        L_0x01e2:
            if (r0 == 0) goto L_0x01e7
            r14.p(r0)
        L_0x01e7:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r8.M(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0201
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r0)
            r12.setPackage(r11)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r12.setFlags(r0)
            goto L_0x0233
        L_0x0201:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r8.M(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x0213
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r8.M(r0)
        L_0x0213:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x021e
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x021f
        L_0x021e:
            r0 = 0
        L_0x021f:
            if (r0 == 0) goto L_0x022f
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.VIEW"
            r12.<init>(r13)
            r12.setPackage(r11)
            r12.setData(r0)
            goto L_0x0233
        L_0x022f:
            android.content.Intent r12 = r13.getLaunchIntentForPackage(r11)
        L_0x0233:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.e93.a
            r11 = 1140850688(0x44000000, float:512.0)
            java.lang.String r13 = "google.c.a.e"
            if (r12 != 0) goto L_0x023d
            r2 = 0
            goto L_0x0299
        L_0x023d:
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r12.addFlags(r15)
            android.os.Bundle r15 = new android.os.Bundle
            java.lang.Object r6 = r8.b
            android.os.Bundle r6 = (android.os.Bundle) r6
            r15.<init>(r6)
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0253:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x027f
            java.lang.Object r16 = r6.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = "google.c."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0279
            java.lang.String r2 = "gcm.n."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0279
            java.lang.String r2 = "gcm.notification."
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L_0x027c
        L_0x0279:
            r15.remove(r10)
        L_0x027c:
            r2 = 2
            r10 = 3
            goto L_0x0253
        L_0x027f:
            r12.putExtras(r15)
            boolean r2 = r8.G(r13)
            if (r2 == 0) goto L_0x0291
            android.os.Bundle r2 = r8.R()
            java.lang.String r6 = "gcm.n.analytics_data"
            r12.putExtra(r6, r2)
        L_0x0291:
            int r2 = r0.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r7, r2, r12, r11)
        L_0x0299:
            r14.g = r2
            boolean r2 = r8.G(r13)
            if (r2 != 0) goto L_0x02a3
            r0 = 0
            goto L_0x02cf
        L_0x02a3:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r6)
            android.os.Bundle r6 = r8.R()
            android.content.Intent r2 = r2.putExtras(r6)
            int r0 = r0.incrementAndGet()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r10 = "com.google.android.c2dm.intent.RECEIVE"
            r6.<init>(r10)
            java.lang.String r10 = r7.getPackageName()
            android.content.Intent r6 = r6.setPackage(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r2 = r6.putExtra(r10, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r7, r0, r2, r11)
        L_0x02cf:
            if (r0 == 0) goto L_0x02d5
            android.app.Notification r2 = r14.F
            r2.deleteIntent = r0
        L_0x02d5:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r8.M(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02ea
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x02ea }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x02ea }
            goto L_0x02fc
        L_0x02ea:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r9.getInt(r0, r3)
            if (r0 == 0) goto L_0x02fb
            int r0 = defpackage.fw3.a(r7, r0)     // Catch:{ NotFoundException -> 0x02fb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x02fb }
            goto L_0x02fc
        L_0x02fb:
            r0 = 0
        L_0x02fc:
            if (r0 == 0) goto L_0x0304
            int r0 = r0.intValue()
            r14.x = r0
        L_0x0304:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r8.G(r0)
            r0 = r0 ^ r4
            r2 = 16
            r14.i(r2, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r8.G(r0)
            r14.u = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r8.M(r0)
            if (r0 == 0) goto L_0x0328
            android.app.Notification r2 = r14.F
            java.lang.CharSequence r0 = defpackage.eda.c(r0)
            r2.tickerText = r0
        L_0x0328:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r8.I(r0)
            r2 = -2
            if (r0 != 0) goto L_0x0333
        L_0x0331:
            r0 = 0
            goto L_0x0341
        L_0x0333:
            int r6 = r0.intValue()
            if (r6 < r2) goto L_0x0331
            int r6 = r0.intValue()
            r7 = 2
            if (r6 <= r7) goto L_0x0341
            goto L_0x0331
        L_0x0341:
            if (r0 == 0) goto L_0x0349
            int r0 = r0.intValue()
            r14.k = r0
        L_0x0349:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r8.I(r0)
            if (r0 != 0) goto L_0x0353
        L_0x0351:
            r0 = 0
            goto L_0x0361
        L_0x0353:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x0351
            int r6 = r0.intValue()
            if (r6 <= r4) goto L_0x0361
            goto L_0x0351
        L_0x0361:
            if (r0 == 0) goto L_0x0369
            int r0 = r0.intValue()
            r14.y = r0
        L_0x0369:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r8.I(r0)
            if (r0 != 0) goto L_0x0373
        L_0x0371:
            r0 = 0
            goto L_0x037a
        L_0x0373:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x037a
            goto L_0x0371
        L_0x037a:
            if (r0 == 0) goto L_0x0382
            int r0 = r0.intValue()
            r14.j = r0
        L_0x0382:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.String r6 = r8.M(r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x039a
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0397 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0397 }
            goto L_0x039b
        L_0x0397:
            defpackage.er7.V(r0)
        L_0x039a:
            r0 = 0
        L_0x039b:
            if (r0 == 0) goto L_0x03a7
            r14.l = r4
            long r6 = r0.longValue()
            android.app.Notification r0 = r14.F
            r0.when = r6
        L_0x03a7:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r8.J(r0)
            if (r0 != 0) goto L_0x03b1
        L_0x03af:
            r7 = 0
            goto L_0x03d4
        L_0x03b1:
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            if (r6 <= r4) goto L_0x03c8
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            long[] r7 = new long[r6]     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            r9 = r3
        L_0x03be:
            if (r9 >= r6) goto L_0x03d4
            long r10 = r0.optLong(r9)     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            r7[r9] = r10     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            int r9 = r9 + r4
            goto L_0x03be
        L_0x03c8:
            org.json.JSONException r6 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            java.lang.String r7 = "vibrateTimings have invalid length"
            r6.<init>((java.lang.String) r7)     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
            throw r6     // Catch:{ NumberFormatException | JSONException -> 0x03d0 }
        L_0x03d0:
            r0.toString()
            goto L_0x03af
        L_0x03d4:
            if (r7 == 0) goto L_0x03da
            android.app.Notification r0 = r14.F
            r0.vibrate = r7
        L_0x03da:
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r6 = r8.J(r0)
            if (r6 != 0) goto L_0x03e4
        L_0x03e2:
            r0 = 0
            goto L_0x0426
        L_0x03e4:
            r7 = 3
            int[] r0 = new int[r7]
            int r9 = r6.length()     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            if (r9 != r7) goto L_0x0413
            java.lang.String r7 = r6.optString(r3)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 == r9) goto L_0x040b
            r0[r3] = r7     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            int r7 = r6.optInt(r4)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            r0[r4] = r7     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            r7 = 2
            int r9 = r6.optInt(r7)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            r0[r7] = r9     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            goto L_0x0426
        L_0x0409:
            r0 = move-exception
            goto L_0x041b
        L_0x040b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            java.lang.String r7 = "Transparent color is invalid"
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            throw r0     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
        L_0x0413:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            java.lang.String r7 = "lightSettings don't have all three fields"
            r0.<init>((java.lang.String) r7)     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
            throw r0     // Catch:{ JSONException -> 0x0422, IllegalArgumentException -> 0x0409 }
        L_0x041b:
            r6.toString()
            r0.getMessage()
            goto L_0x03e2
        L_0x0422:
            r6.toString()
            goto L_0x03e2
        L_0x0426:
            if (r0 == 0) goto L_0x0444
            r6 = r0[r3]
            r7 = r0[r4]
            r9 = 2
            r0 = r0[r9]
            android.app.Notification r9 = r14.F
            r9.ledARGB = r6
            r9.ledOnMS = r7
            r9.ledOffMS = r0
            if (r7 == 0) goto L_0x043d
            if (r0 == 0) goto L_0x043d
            r0 = r4
            goto L_0x043e
        L_0x043d:
            r0 = r3
        L_0x043e:
            int r6 = r9.flags
            r2 = r2 & r6
            r0 = r0 | r2
            r9.flags = r0
        L_0x0444:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r8.G(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r8.G(r2)
            if (r2 == 0) goto L_0x0454
            r2 = 2
            r0 = r0 | r2
        L_0x0454:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r8.G(r2)
            if (r2 == 0) goto L_0x045e
            r0 = r0 | 4
        L_0x045e:
            r14.g(r0)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r8.M(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x046f
        L_0x046d:
            r2 = r0
            goto L_0x0482
        L_0x046f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x046d
        L_0x0482:
            if (r5 != 0) goto L_0x0485
            goto L_0x04c7
        L_0x0485:
            s7h r0 = r5.c     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            defpackage.vzg.m(r0)     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r7 = 5
            java.lang.Object r0 = defpackage.hsg.d(r0, r7, r6)     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r14.k(r0)     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            bda r6 = new bda     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r6.<init>()     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            if (r0 != 0) goto L_0x04a0
            r0 = 0
            goto L_0x04a4
        L_0x04a0:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
        L_0x04a4:
            r6.e = r0     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r7 = 0
            r6.f = r7     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r6.g = r4     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            r14.q(r6)     // Catch:{ ExecutionException -> 0x04af, InterruptedException -> 0x04b5, TimeoutException -> 0x04b1 }
            goto L_0x04c7
        L_0x04af:
            r0 = move-exception
            goto L_0x04c0
        L_0x04b1:
            r5.close()
            goto L_0x04c7
        L_0x04b5:
            r5.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x04c7
        L_0x04c0:
            java.lang.Throwable r0 = r0.getCause()
            java.util.Objects.toString(r0)
        L_0x04c7:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r1 = r14.b()
            r0.notify(r2, r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.p():boolean");
    }

    public void q(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zpg zpg = new zpg((String) it.next(), str);
            i6d i6d = (i6d) this.a;
            i6d.b();
            i6d.c();
            try {
                ((mpg) this.b).c0(zpg);
                i6d.r();
            } finally {
                i6d.l();
            }
        }
    }

    public void r(Throwable th, boolean z) {
        Toast toast = (Toast) this.c;
        if (toast != null) {
            toast.cancel();
        }
        FrgBase frgBase = (FrgBase) this.b;
        Context O1 = frgBase.O1();
        if (O1 != null) {
            if (th instanceof FavoriteStickerSetController$MaxFavoriteStickerSetsException ? true : !(th instanceof TamErrorException) ? false : "favorite.stickersets.limit".equals(((TamErrorException) th).a.b)) {
                int i = pad.g;
                akd akd = (akd) ((bud) this.a);
                akd.getClass();
                String s = ghf.s(i, (int) akd.r(PmsKey.f66maxfavoritestickersets, (long) 100), O1);
                FrgDlgFavoriteStickersLimit frgDlgFavoriteStickersLimit = new FrgDlgFavoriteStickersLimit();
                Bundle bundle = new Bundle();
                bundle.putString("ru.ok.tamtam.extra.TEXT", s);
                frgDlgFavoriteStickersLimit.L2(bundle);
                frgDlgFavoriteStickersLimit.d3(frgBase);
                return;
            }
            String c2 = th instanceof TamErrorException ? fhf.c(O1, ((TamErrorException) th).a) : null;
            if (cvg.A(c2)) {
                c2 = z ? frgBase.S1(qad.J9) : frgBase.S1(qad.L9);
            }
            Toast makeText = Toast.makeText(O1, c2, 0);
            this.c = makeText;
            makeText.show();
        }
    }

    public void s(boolean z) {
        Toast toast = (Toast) this.c;
        if (toast != null) {
            toast.cancel();
        }
        Context O1 = ((FrgBase) this.b).O1();
        if (O1 != null) {
            Toast makeText = Toast.makeText(O1, z ? qad.I9 : qad.K9, 0);
            this.c = makeText;
            makeText.show();
        }
    }

    public boolean shouldGzip() {
        return ((hm) this.a).shouldGzip();
    }

    public boolean shouldPost() {
        return ((hm) this.a).shouldPost();
    }

    public boolean willWriteParams() {
        return ((hm) this.a).willWriteParams();
    }

    public boolean willWriteSupplyParams() {
        return ((hm) this.a).willWriteSupplyParams();
    }

    public void writeParams(zp7 zp7) {
        ((hm) this.a).writeParams(zp7);
    }

    public void writeSupplyParams(zp7 zp7) {
        ((hm) this.a).writeSupplyParams(zp7);
    }

    public aqg(bud bud, FrgBase frgBase) {
        this.a = bud;
        this.b = frgBase;
    }

    public aqg(hm hmVar, op7 op7) {
        djd djd = djd.c;
        this.a = hmVar;
        this.b = op7;
        this.c = djd;
    }

    public aqg(String str, int i) {
        switch (i) {
            case 18:
                this.a = str;
                this.b = null;
                this.c = null;
                return;
            default:
                aa6 aa6 = new aa6();
                aa6.k = str;
                this.a = new ca6(aa6);
                return;
        }
    }

    public aqg(File file) {
        this.a = null;
        this.b = file;
        this.c = null;
    }

    public aqg(Boolean bool) {
        this.a = null;
        this.b = null;
        this.c = bool;
    }

    public aqg() {
        this.a = Collections.emptyList();
        this.b = Collections.emptyList();
    }
}
