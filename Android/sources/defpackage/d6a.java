package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import javax.inject.Provider;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* renamed from: d6a  reason: default package */
public final class d6a implements kfb, k9c, qk3, xte, nj6, s9f, fl4, g08 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d6a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String q(ype ype) {
        switch (ype.ordinal()) {
            case 0:
                return "suggest";
            case 1:
                return "storefront";
            case 2:
                return "search";
            case 3:
                return "recents";
            case 4:
                return "chat";
            case 5:
                return "forward";
            case 6:
                return "onboarding";
            case 7:
                return "keyboard_favorite";
            case 8:
                return "keyboard_favorite_set";
            case 9:
                return "set";
            case 10:
                return "settings";
            case 11:
                return "similar";
            default:
                Locale locale = Locale.ENGLISH;
                z68.f("d6a", "Unknown send source value " + ype, (Throwable) null);
                return null;
        }
    }

    public void A() {
        KProperty[] kPropertyArr = PhotoViewerWidget.v;
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        photoViewerWidget.f0().u(photoViewerWidget.d0(), photoViewerWidget.c0());
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((Runnable) this.b).run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x014d, code lost:
        r10 = (r10 = r10.b).f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.a
            switch(r1) {
                case 6: goto L_0x024c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r18
            tf9 r1 = (defpackage.tf9) r1
            java.lang.Object r0 = r0.b
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r0 = (ru.ok.tamtam.upload.workers.UploadDraftMediaWorker) r0
            r0.getClass()
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r3 = "onUploadUpdate %s"
            java.lang.String r4 = "UploadDraftMediaWorker"
            defpackage.z68.c(r4, r3, r2)
            bxf r2 = r1.a
            boolean r2 = r2.a()
            r3 = 0
            r5 = 0
            java.lang.String r7 = "onUploadSuccess: attaches is null"
            java.lang.String r8 = "onUploadSuccess: draft is null"
            java.lang.String r9 = "onUploadSuccess: chat is null"
            java.lang.String r10 = ", messageUploadState = "
            if (r2 == 0) goto L_0x0112
            au4 r2 = r0.d()
            st4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadSuccess: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r2 = r11.toString()
            defpackage.z68.c(r4, r2, new java.lang.Object[0])
            r62 r2 = r0.c()
            au4 r10 = r0.d()
            st4 r10 = r10.a
            long r10 = r10.a
            a32 r2 = r2.G(r10)
            if (r2 != 0) goto L_0x0064
            defpackage.z68.f(r4, r9, r3)
            goto L_0x024b
        L_0x0064:
            m72 r9 = r2.b
            pt4 r15 = r9.f0
            if (r15 != 0) goto L_0x0075
            defpackage.z68.f(r4, r8, r3)
            a08 r1 = defpackage.d08.a()
            r0.x0 = r1
            goto L_0x024b
        L_0x0075:
            w28 r8 = r15.c()
            if (r8 != 0) goto L_0x0086
            defpackage.z68.f(r4, r7, r3)
            a08 r1 = defpackage.d08.a()
            r0.x0 = r1
            goto L_0x024b
        L_0x0086:
            m20 r3 = r8.Q()
            au4 r4 = r0.d()
            st4 r4 = r4.a
            java.lang.String r4 = r4.b
            nxf r7 = new nxf
            r8 = 0
            r7.<init>(r1, r8)
            defpackage.kr7.P(r3, r4, r7)
            r3.c()
            kotlin.Lazy r1 = r0.v
            java.lang.Object r1 = r1.getValue()
            xt4 r1 = (defpackage.xt4) r1
            r1.a(r15)
            r62 r10 = r0.c()
            long r11 = r2.a
            java.lang.Long r1 = r15.a()
            if (r1 == 0) goto L_0x00b9
            long r5 = r1.longValue()
        L_0x00b9:
            r13 = r5
            r10.n(r11, r13, r15)
            kotlin.Lazy r1 = r0.w
            java.lang.Object r1 = r1.getValue()
            eef r1 = (defpackage.eef) r1
            idb r3 = defpackage.idb.TYPE_DRAFT_SAVE
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r1 = r1.i(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x00d5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r3 = r1.next()
            tdf r3 = (defpackage.tdf) r3
            hdb r4 = r3.f
            boolean r5 = r4 instanceof defpackage.vt4
            if (r5 == 0) goto L_0x00d5
            vt4 r4 = (defpackage.vt4) r4
            long r4 = r4.o
            long r6 = r2.a
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00d5
            kotlin.Lazy r4 = r0.w
            java.lang.Object r4 = r4.getValue()
            eef r4 = (defpackage.eef) r4
            long r5 = r3.a
            r4.d(r5)
            goto L_0x00d5
        L_0x00ff:
            kotlin.Lazy r1 = r0.c
            java.lang.Object r1 = r1.getValue()
            jqg r1 = (defpackage.jqg) r1
            defpackage.rvd.A(r1)
            c08 r1 = defpackage.d08.b()
            r0.x0 = r1
            goto L_0x024b
        L_0x0112:
            bxf r2 = r1.a
            wyf r2 = r2.g
            wyf r11 = defpackage.wyf.UPLOADING
            if (r2 != r11) goto L_0x0222
            au4 r2 = r0.d()
            st4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadProgress: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r10 = r11.toString()
            defpackage.z68.c(r4, r10, new java.lang.Object[0])
            r62 r10 = r0.c()
            au4 r11 = r0.d()
            st4 r11 = r11.a
            long r11 = r11.a
            a32 r10 = r10.G(r11)
            if (r10 == 0) goto L_0x0156
            m72 r10 = r10.b
            if (r10 == 0) goto L_0x0156
            pt4 r10 = r10.f0
            if (r10 == 0) goto L_0x0156
            w28 r10 = r10.c()
            goto L_0x0157
        L_0x0156:
            r10 = r3
        L_0x0157:
            au4 r11 = r0.d()
            st4 r11 = r11.a
            java.lang.String r11 = r11.b
            if (r10 == 0) goto L_0x0201
            int r12 = r10.G()
            if (r12 > 0) goto L_0x0169
            goto L_0x0201
        L_0x0169:
            java.lang.Object r10 = r10.b
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0173:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0189
            java.lang.Object r12 = r10.next()
            r13 = r12
            l20 r13 = (defpackage.l20) r13
            java.lang.String r13 = r13.q
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
            if (r13 == 0) goto L_0x0173
            goto L_0x018a
        L_0x0189:
            r12 = r3
        L_0x018a:
            if (r12 != 0) goto L_0x018e
            goto L_0x0201
        L_0x018e:
            bxf r10 = r1.a
            float r10 = r10.e
            r0.w0 = r10
            r62 r10 = r0.c()
            long r11 = r2.a
            a32 r10 = r10.G(r11)
            if (r10 != 0) goto L_0x01ab
            defpackage.z68.f(r4, r9, r3)
            a08 r1 = defpackage.d08.a()
            r0.x0 = r1
            goto L_0x024b
        L_0x01ab:
            m72 r9 = r10.b
            pt4 r9 = r9.f0
            if (r9 != 0) goto L_0x01bc
            defpackage.z68.f(r4, r8, r3)
            a08 r1 = defpackage.d08.a()
            r0.x0 = r1
            goto L_0x024b
        L_0x01bc:
            w28 r8 = r9.c()
            if (r8 != 0) goto L_0x01cd
            defpackage.z68.f(r4, r7, r3)
            a08 r1 = defpackage.d08.a()
            r0.x0 = r1
            goto L_0x024b
        L_0x01cd:
            m20 r3 = r8.Q()
            java.lang.String r2 = r2.b
            nxf r4 = new nxf
            r7 = 1
            r4.<init>(r1, r7)
            defpackage.kr7.P(r3, r2, r4)
            r3.c()
            kotlin.Lazy r1 = r0.v
            java.lang.Object r1 = r1.getValue()
            xt4 r1 = (defpackage.xt4) r1
            r1.a(r9)
            r62 r11 = r0.c()
            long r12 = r10.a
            java.lang.Long r0 = r9.a()
            if (r0 == 0) goto L_0x01fa
            long r5 = r0.longValue()
        L_0x01fa:
            r14 = r5
            r16 = r9
            r11.n(r12, r14, r16)
            goto L_0x024b
        L_0x0201:
            au4 r1 = r0.d()
            st4 r1 = r1.a
            java.lang.String r1 = r1.b
            au4 r2 = r0.d()
            st4 r2 = r2.a
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "cancelUploadIfAttachIsDeleted: chat or attach is deleted: attachLocalId =%s, chatId = %s"
            defpackage.z68.c(r4, r2, r1)
            r0.i()
            goto L_0x024b
        L_0x0222:
            au4 r2 = r0.d()
            st4 r2 = r2.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onUploadUpdate: failed. Unknown upload state. key = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", state = "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            defpackage.z68.f(r4, r1, r3)
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown upload state"
            r1.<init>(r2)
            r0.e(r1)
        L_0x024b:
            return
        L_0x024c:
            r1 = r18
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.b
            vud r0 = (defpackage.vud) r0
            java.lang.String r0 = r0.v
            java.lang.String r2 = "onSuccess"
            defpackage.z68.f(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6a.accept(java.lang.Object):void");
    }

    public void b(gpe gpe) {
        ykb ykb = (ykb) ((o61) this.b).y;
        ykb.getClass();
        bve bve = bve.b;
        long j = gpe.a;
        KProperty[] kPropertyArr = StickersShowcaseScreen.Y;
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) ykb.b;
        stickersShowcaseScreen.getClass();
        KProperty kProperty = StickersShowcaseScreen.Y[0];
        long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
        ta4 W0 = bve.W0();
        StringBuilder n = tr1.n(j, ":stickers/preview?sticker_id=", "&chat_id=");
        n.append(longValue);
        W0.b(n.toString(), (Bundle) null);
    }

    public void c(mqe mqe) {
        ykb ykb = (ykb) ((o61) this.b).y;
        ykb.getClass();
        KProperty[] kPropertyArr = StickersShowcaseScreen.Y;
        mve d0 = ((StickersShowcaseScreen) ykb.b).d0();
        d0.getClass();
        Long valueOf = Long.valueOf(mqe.a);
        ts tsVar = d0.Z;
        pm7 pm7 = (pm7) tsVar.get(valueOf);
        if (pm7 == null || !pm7.isActive()) {
            tsVar.put(Long.valueOf(mqe.a), xag.g(d0, ((osa) d0.o).b(), (f14) null, new lve(d0, mqe, (Continuation) null), 2));
        }
    }

    public void d(EventItemsMap eventItemsMap) {
        int i = znf.$EnumSwitchMapping$0[((xnf) ((Function0) this.b).invoke()).ordinal()];
        eventItemsMap.set("call_topology", i != 1 ? i != 2 ? "?" : "D" : "S");
    }

    public void e(ibf ibf) {
        lcf lcf = (lcf) this.b;
        lcf.a().a(new s6e(13, lcf, ibf));
    }

    public void f(gpe gpe) {
        ykb ykb = (ykb) ((o61) this.b).y;
        ykb.getClass();
        KProperty[] kPropertyArr = StickersShowcaseScreen.Y;
        mve d0 = ((StickersShowcaseScreen) ykb.b).d0();
        long j = d0.b;
        if (j > 0) {
            ((jqg) d0.x.getValue()).a(new yud(new xud(1, j, gpe.a)));
            xag.h(d0.z, p33.b);
        }
        qc7 qc7 = (qc7) ave.a.getAccessor().j(qc7.class);
        if (qc7 != null) {
            qc7.f(SetsKt.setOf(new pc7(nc7.SEND_5_MESSAGES, 1), new pc7(nc7.SEND_3_STICKERS, 1)), jgd.CHAT);
        }
    }

    public void g(Throwable th) {
    }

    public Object get() {
        return ((Provider) this.b).get();
    }

    public Map getRemoteVideoRenderers(ue1 ue1) {
        fl4 fl4 = ((hz0) this.b).t1;
        return fl4 != null ? fl4.getRemoteVideoRenderers(ue1) : Collections.emptyMap();
    }

    public void h(qaf qaf) {
        lcf lcf = (lcf) this.b;
        lcf.a().a(new rbf(lcf, qaf, 2));
    }

    public void i() {
        KProperty[] kPropertyArr = PhotoViewerWidget.v;
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        photoViewerWidget.f0().w(photoViewerWidget.d0(), photoViewerWidget.c0());
    }

    public boolean isEnabled() {
        return ((hz0) this.b).t1 != null;
    }

    public boolean j(CharSequence charSequence, seb seb) {
        String str = seb.b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((ykb) this.b).i(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    public void k(Object obj) {
        f08 f08;
        kt6 kt6 = (kt6) obj;
        he heVar = ((e1h) this.b).d;
        synchronized (heVar) {
            heVar.b = false;
            f08 = (f08) ((o15) heVar.c).c;
        }
        if (f08 != null) {
            ((swg) heVar.o).b(f08, 2441);
        }
    }

    public void l() {
        zx3 targetController = ((PhotoViewerWidget) this.b).getTargetController();
        mfb mfb = targetController instanceof mfb ? (mfb) targetController : null;
        if (mfb != null) {
            ((ChatMediaViewerScreen) mfb).v0(false);
        }
    }

    public long m() {
        return 0;
    }

    public void n(ype ype) {
        String q = q(ype);
        boolean isEmpty = TextUtils.isEmpty(q);
        nd ndVar = (nd) this.b;
        if (isEmpty) {
            ndVar.e("STICKER_SET_ADD_TO_FAVORITE");
        } else {
            ndVar.f("STICKER_SET_ADD_TO_FAVORITE", q);
        }
    }

    public void o(ype ype) {
        String q = q(ype);
        boolean isEmpty = TextUtils.isEmpty(q);
        nd ndVar = (nd) this.b;
        if (isEmpty) {
            ndVar.e("STICKER_SET_REMOVE_FROM_FAVORITE");
        } else {
            ndVar.f("STICKER_SET_REMOVE_FROM_FAVORITE", q);
        }
    }

    public void p(int i) {
        ((nd) this.b).f("STICKERS_STOREFRONT_OPEN", rae.e(i));
    }

    public d6a(m7h m7h, f08 f08) {
        this.a = 17;
        this.b = m7h;
    }

    public d6a(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new LinkedHashSet();
                return;
            case 7:
                this.b = new Object();
                return;
            default:
                this.b = new ykb(100);
                return;
        }
    }
}
