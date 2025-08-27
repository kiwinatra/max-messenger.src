package ru.ok.messages.views.fragments.base;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.calls.utils.StartCallsViewModel;
import ru.ok.messages.chats.common.CommonChatsViewModel;
import ru.ok.messages.constructor.MessageConstructorView;
import ru.ok.messages.constructor.MessagesConstructorDraftView;
import ru.ok.messages.gallery.GalleryResultViewModel;
import ru.ok.messages.media.audio.AudioRecordView;
import ru.ok.messages.views.dialogs.PickPhotoDialog;
import ru.ok.messages.views.fragments.FrgChatProfile;
import ru.ok.messages.views.fragments.FrgContactProfile;
import ru.ok.messages.views.fragments.FrgContactSearchProfile;
import ru.ok.messages.views.widgets.ProfileTopPartView;
import ru.ok.messages.views.widgets.SmoothSnapAppBarLayoutBehavior;
import ru.ok.messages.views.widgets.TamAvatarView;

public abstract class FrgBaseProfile extends FrgBase implements l6c, kmf, hh6 {
    public final String B1 = getClass().getName();
    public EndlessRecyclerView C1;
    public n09 D1;
    public View E1;
    public Button F1;
    public ImageButton G1;
    public ImageButton H1;
    public float I1;
    public TamAvatarView J1;
    public TamAvatarView K1;
    public AppBarLayout L1;
    public ProfileTopPartView M1;
    public b33 N1;
    public Button O1;
    public n99 P1;
    public View Q1;
    public StartCallsViewModel R1;
    public u82 S1;
    public final dm4 T1 = new dm4(16, (Object) new vl6(this));
    public final gm4 U1 = new gm4((Object) new hg6(this, 1));
    public c73 V1;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, d19] */
    public void A2(View view, Bundle bundle) {
        c73 c73 = this.V1;
        if (c73 != null) {
            this.C1.setPager(c73);
            c73 c732 = this.V1;
            jv7 X1 = X1();
            gm4 gm4 = this.U1;
            CommonChatsViewModel commonChatsViewModel = (CommonChatsViewModel) gm4.get();
            c732.w = commonChatsViewModel;
            ps5 ps5 = new ps5(commonChatsViewModel.n, new b73(c732, (Continuation) null), 5);
            od6 od6 = (od6) X1;
            od6.b();
            bs0.K(ps5, i8b.t(od6.v));
            hsg.z(((CommonChatsViewModel) gm4.get()).q, (od6) X1(), new hg6(this, 2));
        }
        red red = new red(28);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(11, new tc(22, this)));
        StartCallsViewModel startCallsViewModel = (StartCallsViewModel) new bbg(Reflection.getOrCreateKotlinClass(StartCallsViewModel.class), (Function0) new vc(20, lazy), (Function0) red, (Function0) new vc(21, lazy)).getValue();
        etc etc = startCallsViewModel.s;
        bs0.K(new kyd(new ps5(new on2(etc, 28), new oke(etc, (Continuation) null), 5), 4), fqc.p(X1()));
        c Q12 = Q1();
        Context G2 = G2();
        jv7 X12 = X1();
        Q12.g0("ConfirmationDialog:request_key", X12, new bh3(new mke(startCallsViewModel, 0), new mke(startCallsViewModel, 1), 0));
        ? obj = new Object();
        obj.b = Q12;
        obj.c = startCallsViewModel;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a E = Q12.E("CallDialog");
        if (E != null) {
            objectRef.element = new mq1(E, obj);
            vu7 t = i8b.t(E.b1);
            ev0.v(t, (CoroutineContext) null, (f14) null, new ru7(t, new ske(objectRef, (Continuation) null), (Continuation) null), 3);
        }
        Q12.g0("CallDialogFragment:result:request", X12, new uq(1, new nke(obj, objectRef, startCallsViewModel, Q12)));
        etc etc2 = startCallsViewModel.o;
        kyd kyd = new kyd(new ps5(new on2(etc2, 28), new qke(etc2, (Continuation) null, G2, Q12, objectRef, obj), 5), 5);
        od6 od62 = (od6) X12;
        od62.b();
        bs0.K(kyd, i8b.t(od62.v));
        this.R1 = startCallsViewModel;
        dm4 dm4 = this.T1;
        hsg.z(((GalleryResultViewModel) ((ul6) dm4.get())).d, (od6) X1(), new hg6(this, 3));
        hsg.z(((GalleryResultViewModel) ((ul6) dm4.get())).e, (od6) X1(), new hg6(this, 4));
        hsg.z(((GalleryResultViewModel) ((ul6) dm4.get())).i, (od6) X1(), new hg6(this, 5));
        if (getClass().equals(FrgContactProfile.class) || getClass().equals(FrgContactSearchProfile.class)) {
            fqc.l(this.C1, new bi7(false, false, false, true, false, 0));
        }
    }

    public void A3(boolean z) {
        ((qra) ((id3) this.p1.b)).c().f("ACTION_CALL_UI_CLICK", "PROFILE".concat(z ? "_VIDEO" : "_AUDIO"));
        M1();
        vk3 l3 = l3();
        if (l3 != null) {
            z3(l3, z);
        }
    }

    public final void J0() {
        Context O12 = O1();
        if (O12 != null) {
            v6.T(O12);
        }
    }

    public void S0() {
        y3();
    }

    public void Z2(View view) {
        i3a i3a;
        scf scf = this.r1;
        iq.d(scf, this.F1, this.m1.C);
        iq.b(scf, this.G1, this.m1.C);
        iq.b(scf, this.H1, this.m1.C);
        view.setBackgroundColor(scf.n);
        this.C1.getAdapter().m();
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.a(scf);
            this.N1.o();
        }
        n99 n99 = this.P1;
        if (n99 != null && (i3a = n99.E0) != null && i3a.c0()) {
            i3a.w0.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
        if (defpackage.cvg.A(r7) == false) goto L_0x023d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b3(int r27, int r28, android.content.Intent r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            r0 = r29
            r4 = 2
            n99 r5 = r1.P1
            boolean r5 = r5.c()
            r6 = 99
            r7 = 88
            r8 = 1
            r9 = 0
            r10 = 0
            if (r5 == 0) goto L_0x001a
            if (r2 == r7) goto L_0x001c
        L_0x001a:
            if (r2 != r6) goto L_0x005a
        L_0x001c:
            n99 r4 = r1.P1
            ni3 r4 = r4.Y
            if (r2 != r6) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r8 = r10
        L_0x0024:
            if (r0 == 0) goto L_0x002e
            r4.getClass()
            android.net.Uri r0 = r29.getData()
            goto L_0x002f
        L_0x002e:
            r0 = r9
        L_0x002f:
            java.lang.Object r5 = r4.f
            android.net.Uri r5 = (android.net.Uri) r5
            if (r5 != 0) goto L_0x0055
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "ni3"
            java.lang.String r5 = "onPhotoOrVideoSelected: failed, captureFile is empty and data is null"
            defpackage.z68.f(r0, r5, r9)
            java.lang.Object r0 = r4.a
            ru.ok.messages.views.fragments.base.FrgBase r0 = (ru.ok.messages.views.fragments.base.FrgBase) r0
            m5 r4 = r0.X2()
            int r5 = defpackage.qad.s3
            java.lang.String r0 = r0.S1(r5)
            defpackage.hi7.b0(r10, r4, r0)
            goto L_0x03b1
        L_0x0051:
            r4.f = r0
            goto L_0x03b1
        L_0x0055:
            r4.d(r9, r8)
            goto L_0x03b1
        L_0x005a:
            n09 r5 = r1.D1
            r5.getClass()
            boolean r5 = defpackage.n09.h(r27)
            if (r5 == 0) goto L_0x0117
            n09 r5 = r1.D1
            java.lang.Object r6 = r5.y
            ru.ok.messages.views.fragments.base.FrgBaseProfile r6 = (ru.ok.messages.views.fragments.base.FrgBaseProfile) r6
            java.lang.String r11 = "n09"
            r12 = -1
            if (r2 == r7) goto L_0x00e2
            r7 = 555(0x22b, float:7.78E-43)
            if (r2 == r7) goto L_0x00b6
            r7 = 666(0x29a, float:9.33E-43)
            if (r2 == r7) goto L_0x007a
            goto L_0x03b1
        L_0x007a:
            if (r3 == r12) goto L_0x0085
            if (r3 == r4) goto L_0x0080
            goto L_0x03b1
        L_0x0080:
            r5.d()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x0085:
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "data from ActAvatarCrop is null"
            defpackage.z68.f(r11, r0, r9)     // Catch:{ IOException -> 0x0112 }
            r5.i()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x0091:
            java.lang.String r4 = "ru.ok.tamtam.extra.CROPPED_RECT"
            android.os.Parcelable r4 = r0.getParcelableExtra(r4)     // Catch:{ IOException -> 0x0112 }
            android.graphics.RectF r4 = (android.graphics.RectF) r4     // Catch:{ IOException -> 0x0112 }
            java.lang.String r7 = "ru.ok.tamtam.extra.CROPPED_ABSOLUTE"
            android.os.Parcelable r0 = r0.getParcelableExtra(r7)     // Catch:{ IOException -> 0x0112 }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IOException -> 0x0112 }
            java.lang.Object r7 = r5.b     // Catch:{ IOException -> 0x0112 }
            po5 r7 = (defpackage.po5) r7     // Catch:{ IOException -> 0x0112 }
            java.lang.Object r8 = r5.a     // Catch:{ IOException -> 0x0112 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0112 }
            java.io.File r7 = r7.r(r8)     // Catch:{ IOException -> 0x0112 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x0112 }
            r6.t3(r7, r4, r0)     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x00b6:
            if (r3 != r12) goto L_0x03b1
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "data from PickPhotoDialog is null"
            defpackage.z68.f(r11, r0, r9)     // Catch:{ IOException -> 0x0112 }
            r5.i()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x00c4:
            java.lang.String r7 = "ru.ok.tamtam.RESULT"
            int r0 = r0.getIntExtra(r7, r10)     // Catch:{ IOException -> 0x0112 }
            if (r0 == r8) goto L_0x00dd
            if (r0 == r4) goto L_0x00d8
            r4 = 3
            if (r0 == r4) goto L_0x00d3
            goto L_0x03b1
        L_0x00d3:
            r6.u3()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x00d8:
            r5.d()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x00dd:
            r5.j()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x00e2:
            if (r3 != r12) goto L_0x03b1
            r6.getClass()     // Catch:{ IOException -> 0x0112 }
            if (r0 == 0) goto L_0x00f0
            android.net.Uri r9 = r29.getData()     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            goto L_0x0100
        L_0x00f0:
            android.content.Context r0 = r6.O1()     // Catch:{ Exception -> 0x00ee }
            java.lang.Object r4 = r5.a     // Catch:{ Exception -> 0x00ee }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00ee }
            defpackage.m5a.o(r0, r9, r4)     // Catch:{ Exception -> 0x00ee }
            r5.k(r6)     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x0100:
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0112 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0112 }
            java.lang.String r4 = "onActivityResultExtended: failed to copy picked image, e:"
            defpackage.z68.g(r11, r4, r0)     // Catch:{ IOException -> 0x0112 }
            r5.i()     // Catch:{ IOException -> 0x0112 }
            goto L_0x03b1
        L_0x0112:
            r5.i()
            goto L_0x03b1
        L_0x0117:
            r5 = 128(0x80, float:1.794E-43)
            if (r2 != r5) goto L_0x0132
            boolean r4 = r26.q3()
            if (r4 == 0) goto L_0x03b1
            if (r0 == 0) goto L_0x03b1
            java.lang.String r4 = "ru.ok.tamtam.extra.CHAT_IDS"
            long[] r0 = r0.getLongArrayExtra(r4)
            n99 r4 = r1.P1
            k0a r4 = r4.v
            r4.b0(r0)
            goto L_0x03b1
        L_0x0132:
            java.lang.String r5 = "sendToConstructor, constructorId = %d, paramsType = %s"
            java.lang.String r6 = "p99"
            r11 = 121(0x79, float:1.7E-43)
            java.lang.String r12 = "k0a"
            if (r2 != r11) goto L_0x0295
            boolean r4 = r26.q3()
            if (r4 == 0) goto L_0x03b1
            java.lang.String r4 = "ru.ok.tamtam.extra.CONTACT_LIST"
            java.util.ArrayList r4 = r0.getParcelableArrayListExtra(r4)
            java.util.ArrayList r4 = defpackage.kr3.a(r4)
            java.lang.String r11 = "ru.ok.tamtam.extra.PHONES_LIST"
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r11)
            if (r0 != 0) goto L_0x0156
            r11 = r9
            goto L_0x0171
        L_0x0156:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x015f:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0171
            java.lang.Object r13 = r0.next()
            beb r13 = (defpackage.beb) r13
            qdb r13 = r13.a
            r11.add(r13)
            goto L_0x015f
        L_0x0171:
            n99 r0 = r1.P1
            k0a r0 = r0.v
            r0.getClass()
            if (r4 == 0) goto L_0x017f
            int r13 = r4.size()
            goto L_0x0180
        L_0x017f:
            r13 = r10
        L_0x0180:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            if (r11 == 0) goto L_0x018b
            int r14 = r11.size()
            goto L_0x018c
        L_0x018b:
            r14 = r10
        L_0x018c:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14}
            java.lang.String r14 = "sendContact: contacts = %s, phones = %s"
            defpackage.z68.c(r12, r14, r13)
            i1a r12 = r0.z
            if (r12 == 0) goto L_0x01a0
            r12.a()
        L_0x01a0:
            r0.W()
            p1a r12 = r12.c
            java.lang.CharSequence r12 = r12.Y()
            r0.X(r12)
            lk3 r12 = r0.o
            r12.getClass()
            a00 r13 = new a00
            r13.<init>()
            if (r4 == 0) goto L_0x01e6
            java.util.Iterator r4 = r4.iterator()
        L_0x01bc:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x01e6
            java.lang.Object r14 = r4.next()
            vk3 r14 = (defpackage.vk3) r14
            al3 r15 = new al3
            long r17 = r14.r()
            r22 = 0
            r23 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r14 = r15
            r15.<init>(r16, r17, r19, r20, r21, r22, r23, r24, r25)
            r13.add(r14)
            goto L_0x01bc
        L_0x01e6:
            if (r11 == 0) goto L_0x0273
            java.util.Iterator r4 = r11.iterator()
        L_0x01ec:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0273
            java.lang.Object r11 = r4.next()
            qdb r11 = (defpackage.qdb) r11
            al3 r15 = new al3
            int r14 = r11.a
            ou8 r9 = r12.a
            if (r14 <= 0) goto L_0x0210
            r7 = r9
            wj0 r7 = (defpackage.wj0) r7
            d19 r7 = r7.e
            java.lang.String r7 = r7.y(r14)
            boolean r8 = defpackage.cvg.A(r7)
            if (r8 != 0) goto L_0x0211
            goto L_0x023d
        L_0x0210:
            r7 = 0
        L_0x0211:
            java.util.List r8 = r11.f
            boolean r14 = defpackage.cjf.B(r8)
            if (r14 != 0) goto L_0x023d
            java.lang.Object r14 = r8.get(r10)
            java.lang.Long r14 = (java.lang.Long) r14
            long r16 = r14.longValue()
            r18 = 0
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x023d
            java.lang.Object r7 = r8.get(r10)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            wj0 r9 = (defpackage.wj0) r9
            d19 r9 = r9.e
            c7d r14 = r12.b
            java.lang.String r7 = r9.z(r7, r14)
        L_0x023d:
            java.util.List r8 = r11.e
            boolean r9 = defpackage.cjf.B(r8)
            if (r9 == 0) goto L_0x0248
            r21 = 0
            goto L_0x0250
        L_0x0248:
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            r21 = r8
        L_0x0250:
            java.lang.String r8 = r11.d
            java.lang.String r9 = r11.g
            r16 = 0
            java.lang.String r14 = r11.b
            java.lang.String r11 = r11.c
            r23 = 0
            r24 = 0
            r18 = r14
            r14 = r15
            r10 = r15
            r15 = r7
            r19 = r11
            r20 = r8
            r22 = r9
            r14.<init>(r15, r16, r18, r19, r20, r21, r22, r23, r24)
            r13.add(r10)
            r9 = 0
            r10 = 0
            goto L_0x01ec
        L_0x0273:
            long r7 = r0.Z
            a32 r4 = r0.X
            if (r4 == 0) goto L_0x027b
            long r9 = r4.a
        L_0x027b:
            p99 r0 = r0.v
            r0.getClass()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r4 = 5
            java.lang.String r7 = defpackage.g63.q(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}
            defpackage.z68.c(r6, r5, r0)
            defpackage.tr1.y(r4)
            goto L_0x03b1
        L_0x0295:
            r7 = 116(0x74, float:1.63E-43)
            if (r2 != r7) goto L_0x0312
            if (r0 == 0) goto L_0x03b1
            android.net.Uri r5 = r29.getData()
            if (r5 == 0) goto L_0x03b1
            android.net.Uri r0 = r29.getData()
            z52 r5 = new z52
            r6 = 6
            r5.<init>(r6, r1, r0)
            mka r6 = new mka
            r6.<init>(r4, r5)
            sjd r4 = r1.q1
            jbf r4 = r4.z()
            r4.getClass()
            kbf r4 = (defpackage.kbf) r4
            lfd r4 = r4.a()
            fce r4 = r6.n(r4)
            sjd r5 = r1.q1
            jbf r5 = r5.z()
            kbf r5 = (defpackage.kbf) r5
            lfd r5 = r5.c()
            fce r4 = r4.j(r5)
            ip5 r5 = new ip5
            r6 = 11
            r5.<init>(r6)
            ib4 r6 = new ib4
            r7 = 18
            r6.<init>(r7, r1, r0)
            hg6 r0 = new hg6
            r7 = 0
            r0.<init>(r1, r7)
            dj6 r7 = defpackage.m58.e
            oh8 r8 = new oh8
            r8.<init>(r6, r0, r7)
            java.lang.String r0 = "observer is null"
            java.util.Objects.requireNonNull(r8, r0)
            vh8 r0 = new vh8     // Catch:{ NullPointerException -> 0x0310, all -> 0x0301 }
            r6 = 0
            r0.<init>(r8, r5, r6)     // Catch:{ NullPointerException -> 0x0310, all -> 0x0301 }
            r4.l(r0)     // Catch:{ NullPointerException -> 0x0310, all -> 0x0301 }
            r1.T2(r8)
            goto L_0x03b1
        L_0x0301:
            r0 = move-exception
            defpackage.hd8.Z(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "subscribeActual failed"
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        L_0x0310:
            r0 = move-exception
            throw r0
        L_0x0312:
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L_0x03b1
            boolean r4 = r26.q3()
            if (r4 != 0) goto L_0x031e
            goto L_0x03b1
        L_0x031e:
            if (r0 != 0) goto L_0x032b
            n99 r0 = r1.P1
            k0a r0 = r0.v
            i1a r0 = r0.z
            r0.a()
            goto L_0x03b1
        L_0x032b:
            java.lang.String r4 = "ru.ok.tamtam.extra.LOCATION"
            java.io.Serializable r4 = r0.getSerializableExtra(r4)
            s58 r4 = (defpackage.s58) r4
            if (r4 != 0) goto L_0x0350
            java.lang.String r0 = r1.B1
            java.lang.String r4 = "Can't read location"
            r5 = 0
            defpackage.z68.f(r0, r4, r5)
            android.content.Context r0 = r26.O1()
            int r4 = defpackage.qad.U1
            defpackage.hi7.a0(r4, r0)
            n99 r0 = r1.P1
            k0a r0 = r0.v
            i1a r0 = r0.z
            r0.a()
            goto L_0x03b1
        L_0x0350:
            java.lang.String r7 = "ru.ok.tamtam.extra.DURATION"
            r8 = 0
            long r7 = r0.getLongExtra(r7, r8)
            java.lang.String r9 = "ru.ok.tamtam.extra.ZOOM"
            r10 = 0
            float r0 = r0.getFloatExtra(r9, r10)
            n99 r9 = r1.P1
            k0a r9 = r9.v
            r9.getClass()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r7}
            java.lang.String r4 = "sendLocation: location = %s, zoom = %f, livePeriod = %d"
            defpackage.z68.c(r12, r4, r0)
            i1a r0 = r9.z
            if (r0 == 0) goto L_0x037e
            r0.a()
        L_0x037e:
            r9.W()
            p1a r0 = r0.c
            java.lang.CharSequence r0 = r0.Y()
            r9.X(r0)
            lk3 r0 = r9.o
            r0.getClass()
            b10 r0 = defpackage.b10.UNKNOWN
            long r7 = r9.Z
            a32 r0 = r9.X
            if (r0 == 0) goto L_0x0399
            long r10 = r0.a
        L_0x0399:
            p99 r0 = r9.v
            r0.getClass()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r4 = 4
            java.lang.String r7 = defpackage.g63.q(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}
            defpackage.z68.c(r6, r5, r0)
            defpackage.tr1.y(r4)
        L_0x03b1:
            dm4 r0 = r1.p1
            java.lang.Object r0 = r0.b
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            r0.c()
            r26.O1()
            defpackage.fqc.C(r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.fragments.base.FrgBaseProfile.b3(int, int, android.content.Intent):void");
    }

    public final boolean d3() {
        d8b d8b;
        n99 n99 = this.P1;
        if (n99 == null || !n99.c()) {
            return false;
        }
        k0a k0a = this.P1.v;
        if (k0a == null) {
            return true;
        }
        z68.c("k0a", "onBackPressed", new Object[0]);
        i1a i1a = k0a.z;
        if (i1a != null) {
            if (i1a.f.W()) {
                return true;
            }
            h1a h1a = i1a.d;
            if (h1a.W()) {
                f2a f2a = h1a.a;
                if (f2a == null || (d8b = ((u2a) f2a).X) == null) {
                    return true;
                }
                d8b.d();
                return true;
            }
            f2a f2a2 = i1a.e.a;
            if (f2a2 == null) {
                return true;
            }
            j4a j4a = (j4a) f2a2;
            if (j4a.w0.getState() == rre.c) {
                j4a.a0();
                j4a.c0();
                j4a.y0.m(8);
                return true;
            } else if (((n1a) i1a.g.getValue()).c()) {
                return true;
            }
        }
        if (!k0a.U()) {
            return true;
        }
        ((l2a) k0a.a).Z();
        return true;
    }

    public void e3(int i, String[] strArr, int[] iArr) {
        if (q3()) {
            soc soc = this.P1.X;
            soc.getClass();
            if (i == 157) {
                n54.X((FrgBase) soc.b, strArr, iArr, n54.n(), qad.f7, qad.e7);
            } else if (i == 160) {
                if (n54.X((FrgBase) soc.b, strArr, iArr, n54.f, qad.z6, qad.x6)) {
                    s60 s60 = (s60) soc.v;
                    s60.b();
                    if (s60.m == r60.c) {
                        s60.m = r60.b;
                        s60.t();
                    }
                }
            } else if (i != 168) {
                ni3 ni3 = (ni3) soc.c;
                if (i != 162) {
                    if (i != 163) {
                        dm4 dm4 = (dm4) soc.w;
                        switch (i) {
                            case 170:
                                dm4.q(i, strArr, iArr);
                                return;
                            case 171:
                                dm4.q(i, strArr, iArr);
                                return;
                            case 172:
                                if (soc.j(qad.T6, strArr, iArr)) {
                                    b4a b4a = (b4a) dm4.c;
                                    if (b4a != null) {
                                        b4a.p0();
                                        return;
                                    } else {
                                        z68.n("dm4", (IOException) null, "Listener is null", Arrays.copyOf(new Object[0], 0));
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            default:
                                return;
                        }
                    } else if (ni3 != null && soc.j(qad.T6, strArr, iArr)) {
                        ni3.c();
                    }
                } else if (ni3 != null && soc.j(qad.R6, strArr, iArr)) {
                    ni3.b();
                }
            } else {
                if (n54.X((FrgBase) soc.b, strArr, iArr, n54.n(), qad.Y6, qad.e7)) {
                    ((k1a) soc.o).X();
                }
            }
        } else {
            this.D1.getClass();
            if (n09.h(i)) {
                n09 n09 = this.D1;
                FrgBaseProfile frgBaseProfile = (FrgBaseProfile) n09.y;
                frgBaseProfile.getClass();
                if (i == 158) {
                    if (n54.X(frgBaseProfile, strArr, iArr, n54.e, qad.P6, qad.N6)) {
                        n09.b(frgBaseProfile);
                    } else {
                        frgBaseProfile.getClass();
                    }
                } else if (i == 157) {
                    if (n54.X(frgBaseProfile, strArr, iArr, n54.n(), qad.f7, qad.e7)) {
                        try {
                            frgBaseProfile.getClass();
                            if (((Uri) n09.z) != null) {
                                m5a.o(frgBaseProfile.O1(), (Uri) n09.z, (String) n09.a);
                                n09.k(frgBaseProfile);
                            }
                        } catch (Exception e) {
                            z68.b("n09", "continuePickPhotoAfterGrantedPermissions: failed", e);
                            n09.i();
                        }
                    } else {
                        n09.a = null;
                        n09.z = null;
                        frgBaseProfile.getClass();
                    }
                }
            }
        }
    }

    public final void h3(float f) {
        if (this.o1 && n3()) {
            this.F1.setElevation(f);
            this.G1.setElevation(f);
            this.H1.setElevation(f);
        }
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [n09, java.lang.Object] */
    public void i2(Bundle bundle) {
        super.i2(bundle);
        this.S1 = (u82) ((qra) ((id3) this.p1.b)).getAccessor().g(u82.class);
        po5 p = ((qra) ((id3) this.p1.b)).p();
        cud cud = ((qra) ((id3) this.p1.b)).y().b;
        m95 o = ((qra) ((id3) this.p1.b)).o();
        h48 s = ((qra) ((id3) this.p1.b)).s();
        jbf H = ((qra) ((id3) this.p1.b)).H();
        Context applicationContext = G2().getApplicationContext();
        gaf G = ((qra) ((id3) this.p1.b)).G();
        ? obj = new Object();
        obj.y = this;
        obj.b = p;
        obj.o = cud;
        obj.v = o;
        obj.w = s;
        obj.x = H;
        obj.c = new zc4(p, (bud) cud, o, applicationContext, G);
        this.D1 = obj;
        Q1().A = new wc6(1, this);
        if (M1() instanceof m5) {
            M1();
            this.P1 = new n99(this, this, (id3) this.p1.b, (ib8) ((qra) ((id3) this.p1.b)).getAccessor().g(ib8.class), uk2.DEFAULT);
        }
    }

    public final void i3(boolean z) {
        FrgBaseProfile frgBaseProfile = (FrgBaseProfile) this.D1.y;
        frgBaseProfile.getClass();
        PickPhotoDialog pickPhotoDialog = new PickPhotoDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ru.ok.tamtam.RESULT", z);
        pickPhotoDialog.L2(bundle);
        pickPhotoDialog.P2(555, frgBaseProfile);
        pickPhotoDialog.Y2(frgBaseProfile.Q1(), "ru.ok.messages.views.dialogs.PickPhotoDialog");
    }

    public abstract tyc j3();

    public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        M1();
        View inflate = layoutInflater.inflate(ujc.frg_profile_base, viewGroup, false);
        this.Q1 = inflate;
        scf scf = this.r1;
        inflate.setBackgroundColor(scf.n);
        ((qra) ym.e()).v();
        AppBarLayout appBarLayout = (AppBarLayout) this.Q1.findViewById(lic.appbar);
        this.L1 = appBarLayout;
        ((wz3) appBarLayout.getLayoutParams()).b(new SmoothSnapAppBarLayoutBehavior());
        this.M1 = (ProfileTopPartView) this.Q1.findViewById(lic.collapsing_toolbar);
        View view = this.Q1;
        this.L1.setElevation(c44.DEFAULT_ASPECT_RATIO);
        Uri uri = null;
        this.L1.setOutlineProvider((ViewOutlineProvider) null);
        AppBarLayout appBarLayout2 = this.L1;
        appBarLayout2.a(h88.d0(this.M1, appBarLayout2, X1()));
        this.M1.setNavigationListener(this);
        this.K1 = this.M1.getCollapsedAvatarView();
        TamAvatarView tamAvatarView = (TamAvatarView) view.findViewById(lic.act_profile__image);
        this.J1 = tamAvatarView;
        ct.G(tamAvatarView, 300, new gg6(this, 4));
        obd obd = new obd(new fj((a) this), (Toolbar) this.Q1.findViewById(lic.toolbar));
        obd.x = scf;
        obd.v = this.M1;
        b33 b33 = new b33(obd);
        this.N1 = b33;
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            toolbar.setNavigationIcon((Drawable) null);
        }
        this.I1 = (float) R1().getDimensionPixelSize(ydc.profile_button_elevation);
        EndlessRecyclerView endlessRecyclerView = (EndlessRecyclerView) this.Q1.findViewById(lic.frg_profile__rv_content);
        this.C1 = endlessRecyclerView;
        endlessRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.C1.setAdapter(j3());
        this.C1.getLayoutManager().m0();
        this.C1.getRecycledViewPool().setMaxRecycledViews(lic.header, 0);
        if (bundle != null) {
            n09 n09 = this.D1;
            n09.getClass();
            n09.a = bundle.getString("ru.ok.tamtam.extra.UPLOAD_FILE_NAME");
            String string = bundle.getString("ru.ok.tamtam.extra.PICKED_URI");
            try {
                if (!cvg.A(string)) {
                    uri = Uri.parse(string);
                }
                n09.z = uri;
            } catch (Exception unused) {
            }
            n99 n99 = this.P1;
            if (n99 != null) {
                View view2 = this.Q1;
                if (bundle.getBoolean("ru.ok.tamtam.extra.IS_SHOWING_CONSTRUCTOR", false)) {
                    n99.w0 = bundle.getBoolean("ru.ok.tamtam.extra.CLEAR_LAST_INPUT_AFTER_SEND", true);
                    n99.e(view2, 0, bundle);
                }
            }
        }
        this.E1 = this.Q1.findViewById(lic.frg_profile__separator);
        Button button = (Button) this.Q1.findViewById(lic.frg_profile__main_action_button);
        this.F1 = button;
        iq.f(scf, button, this.m1.C, 0, 0, 60);
        ct.G(this.F1, 300, new gg6(this, 0));
        ImageButton imageButton = (ImageButton) this.Q1.findViewById(lic.frg_profile__audio_call_button);
        this.G1 = imageButton;
        iq.b(scf, imageButton, this.m1.C);
        ct.G(this.G1, 300, new gg6(this, 1));
        ImageButton imageButton2 = (ImageButton) this.Q1.findViewById(lic.frg_profile_video_call);
        this.H1 = imageButton2;
        iq.b(scf, imageButton2, this.m1.C);
        ct.G(this.H1, 300, new gg6(this, 2));
        Button button2 = (Button) this.Q1.findViewById(lic.frg_profile__constructor_action_button);
        this.O1 = button2;
        iq.f(scf, button2, this.m1.C, 0, 0, 60);
        ct.G(this.O1, 300, new gg6(this, 3));
        x3();
        return this.Q1;
    }

    public a32 k3() {
        return null;
    }

    public void l2() {
        super.l2();
        n99 n99 = this.P1;
        if (n99 != null) {
            k0a k0a = n99.v;
            if (k0a != null) {
                i1a i1a = k0a.z;
                f2a f2a = i1a.f.a;
                if (f2a != null) {
                    i3a i3a = (i3a) f2a;
                    g5b g5b = i3a.x0;
                    if (g5b != null && g5b.a) {
                        g5b.i();
                    }
                    ok8 ok8 = i3a.w0;
                    if (ok8 != null) {
                        ok8.x0.release();
                    }
                }
                f2a f2a2 = i1a.d.a;
                if (f2a2 != null) {
                    oh4 oh4 = ((u2a) f2a2).w;
                    o54.k(oh4.A0);
                    o54.k(oh4.B0);
                    o54.k(oh4.C0);
                    o54.k(oh4.D0);
                    o54.k(oh4.E0);
                    o54.k(oh4.x0);
                    o54.k((mq4) null);
                }
                a2a a2a = i1a.e;
                a2a.getClass();
                try {
                    a2a.w.f(a2a);
                } catch (Exception unused) {
                }
                f2a f2a3 = a2a.a;
                if (f2a3 != null) {
                    j4a j4a = (j4a) f2a3;
                    j4a.x0.setListener((nve) null);
                    j4a.w0.setListener((qre) null);
                }
                mre mre = a2a.o;
                cre cre = mre.a;
                jbd.c(cre.j);
                cre.c.remove(mre);
                jbd.c(mre.j);
                jbd.c(mre.k);
                mre.g.a.clear();
                a2a.X.d();
                a2a.Y.clear();
                f2a f2a4 = i1a.c.a;
                if (f2a4 != null) {
                    s3a s3a = (s3a) f2a4;
                    s3a.v.e();
                    jbd.c(s3a.G0);
                }
                n1a n1a = (n1a) i1a.g.getValue();
                p99 p99 = k0a.v;
                if (p99 != null) {
                    p99.f = null;
                    try {
                        p99.a.f(p99);
                    } catch (Exception e) {
                        z68.f("p99", "unregister: exception", e);
                    }
                }
                or7 or7 = k0a.Y;
                if (or7 != null) {
                    qq4.a(or7);
                }
            }
            ju8 ju8 = n99.x0;
            id3 id3 = n99.x;
            if (ju8 != null) {
                ((qra) id3).t().w(n99.x0);
            }
            if (n99.y0 != null) {
                ((qra) id3).t().w(n99.y0);
            }
            if (n99.z0 != null) {
                ((qra) id3).t().w(n99.z0);
            }
            ni0 ni0 = n99.A0;
            if (ni0 != null) {
                ryg.k0(ni0.B(), new p79(3), m58.g, m58.e);
            }
            n99.getClass();
            jbd.c((mq4) null);
        }
    }

    public vk3 l3() {
        return null;
    }

    public cs3 m3() {
        return null;
    }

    public boolean n3() {
        return true;
    }

    public boolean o3() {
        return false;
    }

    public boolean p3() {
        return this instanceof FrgChatProfile;
    }

    public final b33 q1() {
        return this.N1;
    }

    public final boolean q3() {
        n99 n99 = this.P1;
        return n99 != null && n99.c();
    }

    public int r3() {
        return qad.p;
    }

    public abstract void s3();

    public void t2() {
        super.t2();
        n99 n99 = this.P1;
        if (n99 != null) {
            k0a k0a = n99.v;
            if (k0a != null) {
                i1a i1a = k0a.z;
                k1a k1a = i1a.f;
                k1a.getClass();
                try {
                    k1a.v.f(k1a);
                } catch (Exception unused) {
                }
                f2a f2a = i1a.d.a;
                if (f2a != null) {
                    u2a u2a = (u2a) f2a;
                    u2a.X.f();
                    oh4 oh4 = u2a.w;
                    o54.k(oh4.D0);
                    o54.k(oh4.E0);
                }
                a2a a2a = i1a.e;
                a2a.getClass();
                try {
                    a2a.w.f(a2a);
                } catch (Exception unused2) {
                }
                a2a.o.b.remove(a2a);
                f2a f2a2 = i1a.c.a;
                if (f2a2 != null) {
                    s3a s3a = (s3a) f2a2;
                    s3a.w.z((s60) null);
                    s60 s60 = s3a.v;
                    s60.k.remove(s3a);
                    try {
                        s60.h.f(s60);
                    } catch (IllegalArgumentException unused3) {
                    }
                    r60 r60 = s60.m;
                    if (!(r60 == r60.c || r60 == r60.o)) {
                        s60.v();
                    }
                    AudioRecordView audioRecordView = s60.o;
                    if (audioRecordView != null) {
                        audioRecordView.L();
                    }
                    s60.D = false;
                }
                ((n1a) i1a.g.getValue()).d();
            }
            n99.b();
        }
    }

    public abstract void t3(String str, RectF rectF, Rect rect);

    public abstract void u3();

    public void v3() {
        vk3 l3 = l3();
        if (l3 != null) {
            m5 X2 = X2();
            long r = l3.r();
            int i = q5.z0;
            q5.W(X2, r, true, uk2.DEFAULT);
            return;
        }
        cs3 m3 = m3();
        if (m3 != null) {
            ((qra) ((id3) this.p1.b)).c().e("CONTACTS_SEARCH_PROFILE_CREATE_CHAT");
            nd c = ((qra) ((id3) this.p1.b)).c();
            fo3 fo3 = m3.a;
            c.g("ACTION_ANON_WRITE_CLICKED", Collections.singletonMap("contactId", Long.valueOf(fo3.a)));
            km3 i2 = this.q1.i();
            long j = fo3.a;
            if (i2.l(j)) {
                q5.U(X2(), j);
                return;
            }
            this.q1.i().z(fo3, m3.o, tm3.b).i(qe.a()).j(new ao1(0, m58.g, new fg6(this, m3, 0)));
            return;
        }
        a32 k3 = k3();
        if (k3 != null) {
            ((qra) ym.e()).c().e("CHAT_PROFILE_WRITE_CLICKED");
            q5.T(X2(), new t5(k3.a));
        }
    }

    public void w2() {
        super.w2();
        n99 n99 = this.P1;
        if (n99 != null) {
            k0a k0a = n99.v;
            if (k0a != null) {
                k0a.Z();
            }
            n99.a();
        }
    }

    public final void w3() {
        if (this.P1.c()) {
            sqd sqd = ((qra) ym.e()).s().f;
            ur0 q = sqd.q();
            sqd.a();
            this.P1.v.a0(q);
        }
    }

    public void x2(Bundle bundle) {
        k0a k0a;
        String str;
        MessagesConstructorDraftView messagesConstructorDraftView;
        boolean z = true;
        super.x2(bundle);
        n09 n09 = this.D1;
        String str2 = (String) n09.a;
        if (str2 != null) {
            bundle.putString("ru.ok.tamtam.extra.UPLOAD_FILE_NAME", str2);
        }
        Uri uri = (Uri) n09.z;
        if (uri != null) {
            bundle.putString("ru.ok.tamtam.extra.PICKED_URI", uri.toString());
        }
        n99 n99 = this.P1;
        if (n99 != null && (k0a = n99.v) != null) {
            f2a f2a = k0a.a;
            if ((f2a != null && ((l2a) f2a).y.getVisibility() == 0) || ((messagesConstructorDraftView = ((l2a) n99.v.a).Y) != null && messagesConstructorDraftView.getVisibility() == 0)) {
                bundle.putBoolean("ru.ok.tamtam.extra.IS_SHOWING_CONSTRUCTOR", true);
                bundle.putBoolean("ru.ok.tamtam.extra.CLEAR_LAST_INPUT_AFTER_SEND", n99.w0);
            }
            k0a k0a2 = n99.v;
            bundle.putLong("ru.ok.tamtam.extra.CONSTRUCTOR_ID", k0a2.Z);
            f2a f2a2 = k0a2.a;
            if (f2a2 != null) {
                l2a l2a = (l2a) f2a2;
                int i = l2a.w0;
                if (i == 1) {
                    str = "HIDDEN";
                } else if (i == 2) {
                    str = "LIST";
                } else if (i == 3) {
                    str = "CONSTRUCTOR";
                } else if (i == 4) {
                    str = "DRAFT";
                } else {
                    throw null;
                }
                bundle.putString("ru.ok.tamtam.extra.STATE", str);
                bundle.putInt("ru.ok.tamtam.extra.SCROLL_STATE", l2a.y.c);
                if (l2a.w0 == 3) {
                    MessageConstructorView messageConstructorView = l2a.x;
                    bundle.putLong("ru.ok.tamtam.extra.CONSTRUCTED_ID", messageConstructorView.v);
                    bundle.putBoolean("ru.ok.tamtam.extra.INPUT_VISIBLE", messageConstructorView.v0.g0());
                }
            }
            i1a i1a = k0a2.z;
            k1a k1a = i1a.f;
            bundle.putParcelable("ru.ok.tamtam.extra.CAPTURE_URI", (Uri) k1a.b.f);
            f2a f2a3 = k1a.a;
            if (f2a3 != null) {
                i3a i3a = (i3a) f2a3;
                String concat = "ru.ok.tamtam.extra.EXTRA_ATTACH_BAR_VISIBLE".concat("k0a");
                g5b g5b = i3a.x0;
                bundle.putBoolean(concat, g5b != null && g5b.a);
                ok8 ok8 = i3a.w0;
                if (ok8 != null) {
                    bundle.putInt("ru.ok.tamtam.extra.SCROLL_STATE", ok8.c);
                }
            }
            h1a h1a = i1a.d;
            h1a.getClass();
            f2a f2a4 = h1a.a;
            if (f2a4 != null) {
                u2a u2a = (u2a) f2a4;
                cpe cpe = u2a.y;
                if (cpe == null || cpe.getVisibility() != 0) {
                    z = false;
                }
                bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_EMOJI_VISIBLE", z);
                d8b d8b = u2a.X;
                if (d8b != null) {
                    bundle.putBoolean("emoji-panel:is-showing", d8b.e());
                }
            }
            a2a a2a = i1a.e;
            a2a.getClass();
            a2a.V(new o1a(bundle, 2));
            p1a p1a = i1a.c;
            p1a.getClass();
            p1a.V(new o1a(bundle, 0));
            ((n1a) i1a.g.getValue()).getClass();
        }
    }

    public final void x3() {
        if (p3()) {
            this.F1.setVisibility(0);
            this.F1.setText(r3());
        } else {
            this.F1.setVisibility(8);
        }
        this.O1.setVisibility(8);
        if (o3()) {
            this.G1.setVisibility(0);
            this.H1.setVisibility(0);
        } else {
            this.G1.setVisibility(8);
            this.H1.setVisibility(8);
        }
        if (n3()) {
            this.F1.setEnabled(true);
            this.G1.setEnabled(true);
            this.H1.setEnabled(true);
            h3(this.I1);
            return;
        }
        this.F1.setEnabled(false);
        this.G1.setEnabled(false);
        this.H1.setEnabled(false);
        h3(c44.DEFAULT_ASPECT_RATIO);
    }

    public final void y3() {
        String str = this.B1;
        z68.c(str, "showScheduledMessages", new Object[0]);
        vk3 l3 = l3();
        if (l3 != null) {
            ((qra) ((id3) this.p1.b)).c().e("ACTION_PROFILE_SCHEDULED_MESSAGES_CLICKED");
            q5.W(X2(), l3.r(), true, uk2.SCHEDULED_SEND);
            return;
        }
        a32 k3 = k3();
        if (k3 == null) {
            z68.n(str, (IOException) null, "showScheduledMessages: chat is null!", Arrays.copyOf(new Object[0], 0));
            return;
        }
        ((qra) ym.e()).c().e("ACTION_CHAT_PROFILE_SCHEDULED_MESSAGES_CLICKED");
        m5 X2 = X2();
        uk2 uk2 = uk2.SCHEDULED_SEND;
        t5 t5Var = new t5(k3.a);
        t5Var.k = uk2;
        t5Var.e = true;
        q5.T(X2, t5Var);
    }

    public final void z2() {
        k0a k0a;
        ok8 ok8;
        super.z2();
        n99 n99 = this.P1;
        if (n99 != null && (k0a = n99.v) != null) {
            k1a k1a = k0a.z.f;
            if (k1a.U() && (ok8 = ((i3a) k1a.a).w0) != null) {
                ok8.x0.q0();
            }
        }
    }

    public final void z3(vk3 vk3, boolean z) {
        StartCallsViewModel startCallsViewModel = this.R1;
        xme xme = startCallsViewModel.n;
        if (vk3 == null) {
            hsg.l(startCallsViewModel.q);
            int i = qad.a;
            o85 o85 = new o85(new Object());
            xme.getClass();
            xme.m((Object) null, o85);
            return;
        }
        long r = vk3.r();
        startCallsViewModel.f.getClass();
        oje oje = new oje(r);
        KProperty[] kPropertyArr = StartCallsViewModel.t;
        startCallsViewModel.j.setValue(startCallsViewModel, kPropertyArr[0], oje);
        startCallsViewModel.k.setValue(startCallsViewModel, kPropertyArr[1], Boolean.FALSE);
        startCallsViewModel.l.setValue(startCallsViewModel, kPropertyArr[2], Boolean.valueOf(z));
        String f = vk3.f();
        if (f == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (f.length() > 0) {
            Application application = startCallsViewModel.d;
            o85 o852 = new o85(new eke(application.getString(qad.k0, new Object[]{f}), application.getString(qad.P), application.getString(qad.m0)));
            xme.getClass();
            xme.m((Object) null, o852);
        } else {
            startCallsViewModel.l(oje, z);
        }
    }
}
