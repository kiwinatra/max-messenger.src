package ru.ok.messages.contacts.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgContactAvatar extends FrgSlideOut {
    public ArrayList C1;
    public Long D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public long H1;
    public boolean I1;

    public FrgContactAvatar() {
        ((qra) ym.e()).p();
    }

    public final String V2() {
        return null;
    }

    public final void b3(int i, int i2, Intent intent) {
        if (intent != null) {
            new srd((Object) ((qra) ((id3) this.p1.b)).p(), (Object) ((qra) ((id3) this.p1.b)).y(), (Object) ((qra) ((id3) this.p1.b)).I(), (Object) ((qra) ((id3) this.p1.b)).c()).r(this, i, i2, intent, new b5(14, this));
        }
    }

    public final void c3(m5 m5Var) {
        super.c3(m5Var);
        if (!(m5Var instanceof rg6)) {
            throw new RuntimeException("Activity used with FrgContactAvatar must implement FrgContactAvatar.Listener interface");
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        this.C1 = this.x.getStringArrayList("ru.ok.tamtam.extra.AVATAR_URL");
        this.D1 = Long.valueOf(this.x.getLong("ru.ok.tamtam.extra.AVATAR_ID"));
        this.E1 = this.x.getBoolean("ru.ok.tamtam.extra.DELETE_OPTION");
        this.F1 = this.x.getBoolean("ru.ok.tamtam.extra.MAKE_MAIN_OPTION");
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID");
            this.H1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
            this.I1 = bundle.getBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED");
        }
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        ActContactAvatars actContactAvatars;
        int i;
        AbstractMap.SimpleEntry simpleEntry;
        long longValue = this.D1.longValue();
        m5 X2 = X2();
        b33 b33 = null;
        rg6 rg6 = X2 instanceof rg6 ? (rg6) X2 : null;
        long j = -1;
        if (rg6 != null && (i = actContactAvatars.H0) >= 0) {
            ArrayList arrayList = (actContactAvatars = (ActContactAvatars) rg6).E0;
            if (!(i >= arrayList.size() || (simpleEntry = (AbstractMap.SimpleEntry) arrayList.get(actContactAvatars.H0)) == null || simpleEntry.getValue() == null)) {
                j = ((Long) simpleEntry.getValue()).longValue();
            }
        }
        if (longValue == j) {
            menu.clear();
            menuInflater.inflate(wjc.menu_avatar_photo, menu);
            b M1 = M1();
            if (M1 instanceof kmf) {
                b33 = ((kmf) M1).q1();
            }
            if (b33 != null) {
                MenuItem b = b33.b(lic.menu_avatar_photo__make_main);
                boolean z = false;
                if (b != null) {
                    b.setVisible(this.E1 && this.F1 && this.D1.longValue() != 0);
                }
                MenuItem b2 = b33.b(lic.menu_avatar_photo__delete);
                if (b2 != null) {
                    if (this.E1 && this.D1.longValue() != 0) {
                        z = true;
                    }
                    b2.setVisible(z);
                }
            }
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_profile_photo, viewGroup, false);
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(lic.frg_profile_photo__iv_photo);
        tp6 tp6 = new tp6(R1());
        tp6.l = ydd.p;
        tp6.j = new r20(O1(), 0);
        Context O1 = O1();
        int i = nad.c0;
        tp6.f = iq.E(i, -1, O1);
        tp6.h = iq.E(i, -1, O1());
        tp6.b = 0;
        zoomableDraweeView.setHierarchy(tp6.a());
        zoomableDraweeView.setZoomEnabled(true);
        zoomableDraweeView.setOnTouchListener(new pg6(new GestureDetector(O1(), new q00(12, this)), 0));
        zoomableDraweeView.setListener(new u00((Object) this, (Object) zoomableDraweeView, (Object) slideOutLayout, 11));
        knb a = ld9.p.get();
        ArrayList<String> arrayList = this.C1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            try {
                ba7 B = ld9.B();
                qa7 b = qa7.b(str);
                B.getClass();
                arrayList2.add(new aa7(B, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a.g = new se7(arrayList2, false);
        a.i = true;
        a.l = zoomableDraweeView.getController();
        zoomableDraweeView.setController(a.a());
        slideOutLayout.setSlideOutListener(this);
        M2(true);
        b M1 = M1();
        b33 q1 = M1 instanceof kmf ? ((kmf) M1).q1() : null;
        if (q1 != null) {
            q1.n();
        }
        return slideOutLayout;
    }

    @oye
    public void onEvent(tr4 tr4) {
        long j = this.G1;
        long j2 = tr4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        String str = tr4.c;
        if (i == 0) {
            if (this.o1) {
                gsg.A(M1(), new File(str), ((qra) ((id3) this.p1.b)).p());
                a3();
                return;
            }
            ryg.S(hashSet, tr4, true);
        } else if (this.H1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.o1) {
                a3();
                new ule(((qra) ((id3) this.p1.b)).p(), ((qra) ((id3) this.p1.b)).n(), ((qra) ((id3) this.p1.b)).y().b).a(this, str);
                return;
            }
            ryg.S(hashSet, tr4, true);
        }
    }

    /* JADX WARNING: type inference failed for: r10v18, types: [m5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s2(android.view.MenuItem r10) {
        /*
            r9 = this;
            int r10 = r10.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r10 != r0) goto L_0x0018
            m5 r10 = r9.X2()
            if (r10 == 0) goto L_0x01a0
            androidx.fragment.app.b r9 = r9.M1()
            r9.finish()
            goto L_0x01a0
        L_0x0018:
            int r0 = defpackage.lic.menu_avatar_photo__save_to_gallery
            r1 = 0
            if (r10 != r0) goto L_0x003d
            m5 r10 = r9.X2()
            if (r10 == 0) goto L_0x01a0
            boolean r10 = r9.o1
            if (r10 == 0) goto L_0x01a0
            java.util.ArrayList r10 = r9.C1
            java.lang.Object r10 = defpackage.cjf.s(r10, r1)
            java.lang.String r10 = (java.lang.String) r10
            r0 = 0
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r10 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.b3(r10, r0)
            androidx.fragment.app.c r9 = r9.D0
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r10.Y2(r9, r0)
            goto L_0x01a0
        L_0x003d:
            int r0 = defpackage.lic.menu_avatar_photo__share
            java.lang.Class<s97> r2 = defpackage.s97.class
            if (r10 != r0) goto L_0x008d
            sjd r10 = r9.q1
            rl r10 = r10.d()
            jna r10 = (defpackage.jna) r10
            jtb r10 = r10.D()
            ltb r10 = (defpackage.ltb) r10
            a33 r10 = r10.a
            long r4 = r10.n()
            r9.G1 = r4
            dm4 r10 = r9.p1
            java.lang.Object r10 = r10.b
            id3 r10 = (defpackage.id3) r10
            qra r10 = (defpackage.qra) r10
            q4 r10 = r10.getAccessor()
            java.lang.Object r10 = r10.g(r2)
            s97 r10 = (defpackage.s97) r10
            java.util.ArrayList r0 = r9.C1
            java.lang.Object r0 = defpackage.cjf.s(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r2 = r9.C1
            java.lang.Object r1 = defpackage.cjf.s(r2, r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r9)
            qg6 r9 = new qg6
            r8 = 0
            r3 = r9
            r3.<init>(r4, r6, r7, r8)
            r10.a(r0, r9)
            goto L_0x01a0
        L_0x008d:
            int r0 = defpackage.lic.menu_avatar_photo__make_main
            if (r10 != r0) goto L_0x00f2
            m5 r10 = r9.X2()
            boolean r0 = r10 instanceof defpackage.rg6
            if (r0 == 0) goto L_0x009c
            rg6 r10 = (defpackage.rg6) r10
            goto L_0x009d
        L_0x009c:
            r10 = r1
        L_0x009d:
            if (r10 == 0) goto L_0x01a0
            java.lang.Long r0 = r9.D1
            long r2 = r0.longValue()
            java.util.ArrayList r9 = r9.C1
            java.lang.Object r9 = defpackage.cjf.s(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            ru.ok.messages.contacts.profile.ActContactAvatars r10 = (ru.ok.messages.contacts.profile.ActContactAvatars) r10
            ao1 r0 = r10.K0
            defpackage.jbd.c(r0)
            a6 r0 = new a6
            r0.<init>((ru.ok.messages.contacts.profile.ActContactAvatars) r10, (java.lang.String) r9, (long) r2)
            dm4 r9 = r10.x
            java.lang.Object r9 = r9.b
            id3 r9 = (defpackage.id3) r9
            qra r9 = (defpackage.qra) r9
            jbf r9 = r9.H()
            kbf r9 = (defpackage.kbf) r9
            lfd r9 = r9.a()
            z5 r1 = new z5
            r4 = 2
            r1.<init>(r10, r2, r4)
            rx0 r2 = new rx0
            r3 = 13
            r2.<init>(r3)
            dm4 r3 = r10.x
            java.lang.Object r3 = r3.b
            id3 r3 = (defpackage.id3) r3
            qra r3 = (defpackage.qra) r3
            jbf r3 = r3.H()
            kbf r3 = (defpackage.kbf) r3
            lfd r3 = r3.c()
            ao1 r9 = defpackage.jbd.a(r0, r9, r1, r2, r3)
            r10.K0 = r9
            goto L_0x01a0
        L_0x00f2:
            int r0 = defpackage.lic.menu_avatar_photo__delete
            if (r10 != r0) goto L_0x014e
            m5 r10 = r9.X2()
            boolean r0 = r10 instanceof defpackage.rg6
            if (r0 == 0) goto L_0x0101
            r1 = r10
            rg6 r1 = (defpackage.rg6) r1
        L_0x0101:
            if (r1 == 0) goto L_0x01a0
            java.lang.Long r9 = r9.D1
            long r9 = r9.longValue()
            ru.ok.messages.contacts.profile.ActContactAvatars r1 = (ru.ok.messages.contacts.profile.ActContactAvatars) r1
            ao1 r0 = r1.K0
            defpackage.jbd.c(r0)
            z5 r0 = new z5
            r2 = 0
            r0.<init>(r1, r9, r2)
            dm4 r2 = r1.x
            java.lang.Object r2 = r2.b
            id3 r2 = (defpackage.id3) r2
            qra r2 = (defpackage.qra) r2
            jbf r2 = r2.H()
            kbf r2 = (defpackage.kbf) r2
            lfd r2 = r2.a()
            z5 r3 = new z5
            r4 = 1
            r3.<init>(r1, r9, r4)
            rx0 r9 = new rx0
            r10 = 12
            r9.<init>(r10)
            dm4 r10 = r1.x
            java.lang.Object r10 = r10.b
            id3 r10 = (defpackage.id3) r10
            qra r10 = (defpackage.qra) r10
            jbf r10 = r10.H()
            kbf r10 = (defpackage.kbf) r10
            lfd r10 = r10.c()
            ao1 r9 = defpackage.jbd.a(r0, r2, r3, r9, r10)
            r1.K0 = r9
            goto L_0x01a0
        L_0x014e:
            int r0 = defpackage.lic.menu_avatar_photo__set_as_chat_bg
            if (r10 != r0) goto L_0x01a0
            dm4 r10 = r9.p1
            java.lang.Object r10 = r10.b
            id3 r10 = (defpackage.id3) r10
            qra r10 = (defpackage.qra) r10
            rl r10 = r10.e()
            jna r10 = (defpackage.jna) r10
            jtb r10 = r10.D()
            ltb r10 = (defpackage.ltb) r10
            a33 r10 = r10.a
            long r4 = r10.n()
            r9.H1 = r4
            dm4 r10 = r9.p1
            java.lang.Object r10 = r10.b
            id3 r10 = (defpackage.id3) r10
            qra r10 = (defpackage.qra) r10
            q4 r10 = r10.getAccessor()
            java.lang.Object r10 = r10.g(r2)
            s97 r10 = (defpackage.s97) r10
            java.util.ArrayList r0 = r9.C1
            java.lang.Object r0 = defpackage.cjf.s(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r2 = r9.C1
            java.lang.Object r1 = defpackage.cjf.s(r2, r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r9)
            qg6 r9 = new qg6
            r8 = 0
            r3 = r9
            r3.<init>(r4, r6, r7, r8)
            r10.a(r0, r9)
        L_0x01a0:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.contacts.profile.FrgContactAvatar.s2(android.view.MenuItem):boolean");
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.H1);
        bundle.putBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED", this.I1);
    }

    @oye
    public void onEvent(vr4 vr4) {
        long j = this.G1;
        long j2 = vr4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        if (i == 0) {
            if (this.o1) {
                a3();
                hi7.b0(0, O1(), S1(qad.y9));
                return;
            }
            ryg.S(hashSet, vr4, true);
        } else if (this.H1 != j2) {
        } else {
            if (this.o1) {
                a3();
                hi7.a0(qad.V8, O1());
                return;
            }
            ryg.S(hashSet, vr4, false);
        }
    }
}
