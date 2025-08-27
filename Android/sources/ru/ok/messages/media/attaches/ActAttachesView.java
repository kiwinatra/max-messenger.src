package ru.ok.messages.media.attaches;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.ComGoogleAndroidMaterialR$id;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.messages.secret.widgets.TimerView;

public class ActAttachesView extends o5 implements eg6, xe2, jb9, kmf, ku8 {
    public static final HashSet e1 = new HashSet(Arrays.asList(new g20[]{g20.c, g20.o}));
    public s20 A0;
    public View B0;
    public View C0;
    public TextView D0;
    public TextView E0;
    public ImageButton F0;
    public boolean G0 = false;
    public boolean H0 = false;
    public boolean I0 = false;
    public boolean J0 = false;
    public ViewPager K0;
    public String L0;
    public String M0;
    public FrgChatMediaLoader N0;
    public View O0;
    public TextView P0;
    public RelativeLayout Q0;
    public sd3 R0;
    public FrameLayout S0;
    public TimerView T0;
    public Chronometer U0;
    public b33 V0;
    public int W0;
    public View X0;
    public View Y0;
    public ch Z0;
    public ju8 a1;
    public ju8 b1;
    public nd c1;
    public q09 d1;
    public final ArrayList z0 = new ArrayList();

    public static Intent Y(Context context, long j, a89 a89, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        s10 s10;
        l20 l20;
        Intent intent = new Intent(context, ActAttachesView.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.START_LOCAL_ID", str);
        intent.putExtra("ru.ok.tamtam.extra.START_MESSAGE", new hd9(a89));
        intent.putExtra("ru.ok.tamtam.extra.DESC_ORDER", z);
        if (a89.a.v()) {
            z2 = true;
        }
        intent.putExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", z2);
        if (z3) {
            intent.putExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID", str);
        }
        intent.putExtra("ru.ok.tamtam.extra.CAST_ENABLED", z4);
        ha9 ha9 = a89.a;
        if (ha9.x0.G() > 0) {
            int i = 0;
            while (true) {
                w28 w28 = ha9.x0;
                if (i >= w28.G()) {
                    break;
                }
                l20 F = w28.F(i);
                if (F.g()) {
                    c20 c20 = F.g;
                    if (c20.b()) {
                        F = c20.g;
                    }
                }
                boolean f = F.f();
                String str2 = F.r;
                if (f) {
                    x10 x10 = F.b;
                    if (!x10.v && F.q.equals(str)) {
                        if (cvg.A(str2)) {
                            str2 = x10.a();
                        }
                        Uri s = po5.s(str2);
                        if (s != null) {
                            ba7 B = ld9.B();
                            ra7 d = ra7.d(s);
                            d.d = ryg.w(context, F, false);
                            B.f(d.a(), (f0) null);
                        }
                    }
                }
                if (F.i()) {
                    ld9.B().f(qa7.a(po5.s(F.d.c)), (f0) null);
                } else if (F.c() && (l20 = s10.d) != null) {
                    if (!l20.f()) {
                        l20 l202 = (s10 = F.j).d;
                        str2 = l202.i() ? l202.d.c : null;
                    }
                    if (!cvg.A(str2)) {
                        ld9.B().f(qa7.a(o5a.x(str2)), (f0) null);
                    }
                }
                i++;
            }
        }
        return intent;
    }

    public static void d0(a aVar, long j, a89 a89, String str, o5h o5h, boolean z, boolean z2) {
        l20 l20;
        a aVar2 = aVar;
        String str2 = str;
        o5h o5h2 = o5h;
        Intent Y = Y(aVar.O1(), j, a89, str, false, z, z2, true);
        ha9 ha9 = a89.a;
        Iterator it = ((List) ha9.x0.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                l20 = null;
                break;
            }
            l20 = (l20) it.next();
            if (l20.g()) {
                c20 c20 = l20.g;
                if (c20.b()) {
                    l20 = c20.g;
                }
            }
            if (l20.q.equals(str2) && (((l20.f() && l20.n.c()) || l20.i() || ld8.Y(l20) || ld8.W(l20) || l20.g()) && o5h2 != null)) {
                break;
            }
        }
        if (l20 != null) {
            Y.putExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", true);
            int i = 0;
            Y.putExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false);
            ((View) o5h2.a).setTransitionName(str2);
            b M1 = aVar.M1();
            View view = (View) o5h2.a;
            ActivityOptions makeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(M1, view, str2);
            Y.putExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT", (Rect) o5h2.b);
            if (view instanceof p89) {
                p89 p89 = (p89) view;
                if (!ha9.E()) {
                    i = ((List) ha9.x0.b).indexOf(l20);
                }
                Y.putExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS", p89.y(i));
            } else if (view.getParent() instanceof p89) {
                p89 p892 = (p89) view.getParent();
                if (!ha9.E()) {
                    i = ((List) ha9.x0.b).indexOf(l20);
                }
                Y.putExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS", p892.y(i));
            }
            aVar.R2(Y, makeSceneTransitionAnimation.toBundle());
            return;
        }
        aVar.R2(Y, (Bundle) null);
    }

    public final String E() {
        return "MEDIA_VIEWER";
    }

    public final void H(int i, int i2, Intent intent) {
        sd3 sd3 = this.R0;
        int i3 = sd3.b;
        if (i != i3) {
            return;
        }
        if (i2 != -1) {
            sd3.getClass();
        } else if (i == i3) {
            sd3.h = null;
            long[] longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS");
            Bundle bundleExtra = intent.getBundleExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE");
            long[] longArray = bundleExtra.getLongArray("ru.ok.tamtam.extra.DATA");
            a32 G = ((sjd) ((z9f) sd3.f)).g().G(bundleExtra.getLong("ru.ok.tamtam.extra.CHAT_ID"));
            boolean booleanExtra = intent.getBooleanExtra("ru.ok.tamtam.extra.NOTIFY", true);
            long j = bundleExtra.getLong("ru.ok.tamtam.extra.ATTACH_ID");
            String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.DESCRIPTION");
            if (longArray != null && longArray.length > 0) {
                z68.c("sd3", "finishForward", new Object[0]);
                new qa3(0, new ib9(sd3, longArray, j, G, stringExtra, longArrayExtra, booleanExtra)).i(qe.a()).l(xfd.b()).j(new ao1(0, new td8(15, sd3), new r99(sd3, longArrayExtra, longArray, 1)));
            }
        }
    }

    public final void I0() {
        z68.f("ru.ok.messages.media.attaches.ActAttachesView", "onFailedForward", (Throwable) null);
        hi7.b0(0, this, getString(qad.u1));
    }

    public final scf K0() {
        if (this.d1 == null) {
            this.d1 = q09.f0;
        }
        return this.d1;
    }

    public final void W(a aVar, a89 a89) {
        z68.c("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: start", new Object[0]);
        if (isFinishing() || !this.Z) {
            this.H0 = true;
            return;
        }
        findViewById(lic.act_attachments_view__fl_transition).setVisibility(8);
        if (aVar != null) {
            ed6 v = v();
            v.getClass();
            xe0 xe0 = new xe0(v);
            xe0.j(aVar);
            xe0.e(false);
        }
        z68.c("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: setPagerVisibility", new Object[0]);
        this.K0.setVisibility(0);
        FrgChatMediaLoader frgChatMediaLoader = this.N0;
        if (frgChatMediaLoader != null) {
            ArrayList arrayList = frgChatMediaLoader.B1.d;
            if (arrayList.size() > 0) {
                Z(arrayList);
            } else {
                Z(Collections.singletonList(a89));
            }
        }
        i0(true, false);
    }

    public final long X() {
        return getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
    }

    public final void Z(List list) {
        z68.a("ru.ok.messages.media.attaches.ActAttachesView", "onLoadInitial: count=" + list.size());
        if (this.K0.getVisibility() == 0) {
            c0(list);
        }
    }

    public final ju8 a() {
        if (this.a1 == null) {
            mu8 t = ((qra) ((id3) this.x.b)).t();
            getIntent().getBooleanExtra("ru.ok.tamtam.extra.CAST_ENABLED", true);
            this.a1 = t.q(nu8.c, new z50(true, false, true), (jv7) null);
        }
        return this.a1;
    }

    public final void a0(a89 a89) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.z0;
            if (i >= arrayList.size()) {
                break;
            } else if (((a89) arrayList.get(i)).a.b == a89.a.b) {
                arrayList.set(i, a89);
                break;
            } else {
                i++;
            }
        }
        e0();
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        this.G0 = z;
        if (z) {
            M((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            G((View.OnSystemUiVisibilityChangeListener) null);
        }
        i0(z2, z3);
    }

    public final void b0() {
        if (this.a1 != null) {
            ((qra) ((id3) this.x.b)).t().w(this.a1);
            this.a1 = null;
        }
        if (this.b1 != null) {
            ((qra) ((id3) this.x.b)).t().w(this.b1);
            this.b1 = null;
        }
    }

    public final void c() {
        boolean z = !this.G0;
        this.G0 = z;
        b(z, true, false);
    }

    public final void c0(List list) {
        int indexOf;
        if (!getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false)) {
            list = FrgChatMediaLoader.h3(list, e1);
        }
        if (this.A0 == null) {
            s20 s20 = new s20(v(), this.z0, this, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false), getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
            this.A0 = s20;
            String str = this.M0;
            if (str != null) {
                s20.q = str;
                this.M0 = null;
            }
            this.K0.setAdapter(s20);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", false)) {
            this.A0.p = this.L0;
        }
        s20 s202 = this.A0;
        s202.k.clear();
        s202.j.clear();
        this.A0.p(list, true);
        this.A0.h();
        s20 s203 = this.A0;
        if (s203 != null && (indexOf = s203.j.indexOf(this.L0)) != -1) {
            ViewPager viewPager = this.K0;
            viewPager.H0 = false;
            viewPager.v(indexOf, 0, false, false);
            e0();
        }
    }

    public final boolean d() {
        return this.G0;
    }

    public final void e0() {
        int indexOf;
        s20 s20 = this.A0;
        if (s20 != null && (indexOf = s20.j.indexOf(this.L0)) != -1) {
            f0(indexOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0247, code lost:
        if (defpackage.cd9.c(r0, r3) != false) goto L_0x024b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f0(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 1
            s20 r3 = r0.A0
            if (r3 == 0) goto L_0x024e
            v7b r3 = r3.r(r1)
            if (r3 == 0) goto L_0x024e
            java.lang.Object r4 = r3.b
            a89 r4 = (defpackage.a89) r4
            java.lang.Object r3 = r3.a
            l20 r3 = (defpackage.l20) r3
            boolean r5 = r0.J0
            if (r5 == 0) goto L_0x001d
            goto L_0x024e
        L_0x001d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "updateAttachInfo: position: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ru.ok.messages.media.attaches.ActAttachesView"
            defpackage.z68.c(r6, r5, new java.lang.Object[0])
            ru.ok.messages.media.chat.FrgChatMediaLoader r5 = r0.N0
            g20 r6 = defpackage.g20.o
            if (r5 == 0) goto L_0x003c
            ye2 r5 = r5.B1
            boolean r5 = r5.k
            if (r5 != 0) goto L_0x0046
        L_0x003c:
            ha9 r5 = r4.a
            w28 r5 = r5.x0
            int r5 = r5.G()
            if (r5 <= r2) goto L_0x0075
        L_0x0046:
            b33 r5 = r0.V0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r1 = r1 + r2
            r7.append(r1)
            java.lang.String r1 = " "
            r7.append(r1)
            int r8 = defpackage.jad.E
            java.lang.String r8 = r0.getString(r8)
            r7.append(r8)
            r7.append(r1)
            s20 r1 = r0.A0
            java.util.ArrayList r1 = r1.j
            int r1 = r1.size()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r5.l(r1)
            goto L_0x00a4
        L_0x0075:
            g20 r1 = r3.a
            g20 r5 = defpackage.g20.c
            if (r1 != r5) goto L_0x0087
            b33 r1 = r0.V0
            int r5 = defpackage.qad.p7
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
            goto L_0x00a4
        L_0x0087:
            if (r1 != r6) goto L_0x0095
            b33 r1 = r0.V0
            int r5 = defpackage.qad.oa
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
            goto L_0x00a4
        L_0x0095:
            g20 r5 = defpackage.g20.X
            if (r1 != r5) goto L_0x00a4
            b33 r1 = r0.V0
            int r5 = defpackage.qad.r
            java.lang.String r5 = r0.getString(r5)
            r1.l(r5)
        L_0x00a4:
            dm4 r1 = r0.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            g20 r5 = r3.a
            r7 = 0
            r8 = 8
            if (r5 == r6) goto L_0x010d
            ha9 r5 = r4.a
            java.lang.String r5 = r5.y
            boolean r5 = defpackage.cvg.A(r5)
            if (r5 != 0) goto L_0x010d
            android.view.View r5 = r0.O0
            r5.setVisibility(r7)
            r5 = r1
            qra r5 = (defpackage.qra) r5
            r62 r5 = r5.l()
            long r9 = r20.X()
            a32 r5 = r5.G(r9)
            gsb r9 = r4.v
            r9.f = r5
            yva r10 = r9.a
            int r11 = r10.h()
            int r10 = r10.e()
            r9.j(r5, r11, r10)
            java.lang.CharSequence r5 = r9.g
            android.text.SpannableStringBuilder r5 = android.text.SpannableStringBuilder.valueOf(r5)
            java.lang.String[] r9 = defpackage.ghf.c
            boolean r9 = r5 instanceof android.text.Spannable
            if (r9 == 0) goto L_0x0107
            boolean r9 = defpackage.cvg.A(r5)
            if (r9 != 0) goto L_0x0107
            int r9 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r10 = android.text.style.URLSpan.class
            java.lang.Object[] r9 = r5.getSpans(r7, r9, r10)
            int r10 = r9.length
            r11 = r7
        L_0x00fe:
            if (r11 >= r10) goto L_0x0107
            r12 = r9[r11]
            r5.removeSpan(r12)
            int r11 = r11 + r2
            goto L_0x00fe
        L_0x0107:
            android.widget.TextView r9 = r0.P0
            r9.setText(r5)
            goto L_0x0112
        L_0x010d:
            android.view.View r5 = r0.O0
            r5.setVisibility(r8)
        L_0x0112:
            g20 r5 = r3.a
            r9 = 0
            if (r5 != r6) goto L_0x015e
            d20 r5 = r3.n
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x015e
            k20 r5 = r3.d
            long r5 = r5.a
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x015e
            long r5 = r3.t
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x014d
            android.widget.TextView r1 = r0.D0
            int r11 = defpackage.qad.la
            java.lang.String r11 = r0.getString(r11)
            long r12 = r3.u
            r3 = 0
            java.lang.String r12 = defpackage.ghf.x(r12, r7, r3)
            java.lang.String r3 = defpackage.ghf.x(r5, r7, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3}
            java.lang.String r3 = java.lang.String.format(r11, r3)
            r1.setText(r3)
            goto L_0x0158
        L_0x014d:
            android.widget.TextView r1 = r0.D0
            int r3 = defpackage.qad.ma
            java.lang.String r3 = r0.getString(r3)
            r1.setText(r3)
        L_0x0158:
            android.widget.TextView r1 = r0.E0
            r1.setVisibility(r8)
            goto L_0x019e
        L_0x015e:
            qra r1 = (defpackage.qra) r1
            r62 r3 = r1.l()
            long r5 = r20.X()
            a32 r3 = r3.G(r5)
            if (r3 == 0) goto L_0x0173
            java.lang.String r3 = r4.d(r3)
            goto L_0x0179
        L_0x0173:
            int r3 = defpackage.jad.H
            java.lang.String r3 = r0.getString(r3)
        L_0x0179:
            android.widget.TextView r5 = r0.D0
            yva r6 = r1.v()
            u25 r6 = r6.k
            java.lang.CharSequence r3 = r6.c(r3)
            r5.setText(r3)
            android.widget.TextView r3 = r0.E0
            r3.setVisibility(r7)
            android.widget.TextView r3 = r0.E0
            yva r1 = r1.v()
            ha9 r5 = r4.a
            long r5 = r5.o
            java.lang.String r1 = r1.d(r5)
            r3.setText(r1)
        L_0x019e:
            ha9 r1 = r4.a
            boolean r1 = r1.v()
            ha9 r3 = r4.a
            if (r1 == 0) goto L_0x0201
            android.widget.FrameLayout r1 = r0.S0
            int r1 = r1.getVisibility()
            if (r1 != r8) goto L_0x01b6
            android.widget.FrameLayout r1 = r0.S0
            r5 = 4
            r1.setVisibility(r5)
        L_0x01b6:
            long r5 = r3.L0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r11 = r3.K0
            long r11 = (long) r11
            long r11 = r1.toMillis(r11)
            long r16 = r11 + r5
            long r5 = r3.L0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x01cc
            r18 = r9
            goto L_0x01da
        L_0x01cc:
            ym r1 = defpackage.ym.v
            ltb r1 = r1.c()
            a33 r1 = r1.a
            long r5 = r1.m()
            r18 = r5
        L_0x01da:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.U0
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r11 = r16 - r18
            long r11 = r11 + r5
            r1.setBase(r11)
            long r14 = r3.L0
            int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f9
            ru.ok.messages.secret.widgets.TimerView r13 = r0.T0
            r13.a(r14, r16, r18)
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.U0
            r1.z = r2
            r1.j()
            goto L_0x021c
        L_0x01f9:
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.U0
            r1.z = r7
            r1.j()
            goto L_0x021c
        L_0x0201:
            android.widget.FrameLayout r1 = r0.S0
            r1.setVisibility(r8)
            ru.ok.messages.secret.widgets.TimerView r1 = r0.T0
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.b(r2)
            r5 = -1
            r1.x = r5
            r1.y = r5
            r1.z = r5
            ru.ok.messages.messages.widgets.Chronometer r1 = r0.U0
            r1.z = r7
            r1.j()
        L_0x021c:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r2 = "ru.ok.tamtam.extra.COMPAT_MODE"
            boolean r1 = r1.getBooleanExtra(r2, r7)
            android.widget.ImageButton r2 = r0.F0
            if (r1 != 0) goto L_0x024a
            dm4 r1 = r0.x
            java.lang.Object r1 = r1.b
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            r62 r1 = r1.l()
            long r5 = r20.X()
            a32 r0 = r1.G(r5)
            cd9 r1 = r4.w
            r1.getClass()
            boolean r0 = defpackage.cd9.c(r0, r3)
            if (r0 == 0) goto L_0x024a
            goto L_0x024b
        L_0x024a:
            r7 = r8
        L_0x024b:
            r2.setVisibility(r7)
        L_0x024e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.f0(int):void");
    }

    public final void g0() {
        j0a j0a;
        s20 s20 = this.A0;
        if (s20 != null) {
            FrgAttachView q = s20.q(this.L0);
            if ((q instanceof FrgAttachVideo) && (j0a = ((FrgAttachVideo) q).N1) != null) {
                View o = j0a.o();
                o.post(new vg(o, 5));
            }
        }
    }

    public final void i0(boolean z, boolean z2) {
        if (this.G0) {
            this.Z0.i((Toolbar) this.V0.c);
            this.Z0.i(this.C0);
            this.Z0.i(this.Y0);
        } else {
            this.Z0.g((Toolbar) this.V0.c);
            this.Z0.g(this.C0);
            this.Z0.g(this.Y0);
        }
        boolean z3 = this.G0;
        if (this.S0.getVisibility() != 8) {
            if (z3) {
                if (z) {
                    this.S0.animate().alpha(1.0f).setListener(new f5(this, 0));
                } else {
                    this.S0.animate().cancel();
                    this.S0.setVisibility(0);
                    this.S0.setAlpha(1.0f);
                }
            } else if (z) {
                this.S0.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setListener(new f5(this, 1));
            } else {
                this.S0.animate().cancel();
                this.S0.setVisibility(4);
                this.S0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
        }
        s20 s20 = this.A0;
        if (s20 != null) {
            for (WeakReference weakReference : s20.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.r3();
                }
            }
        }
    }

    public final ju8 j() {
        if (this.b1 == null) {
            this.b1 = ((qra) ((id3) this.x.b)).t().q(nu8.a, new z50(false, true, true), (jv7) null);
        }
        return this.b1;
    }

    public final void onBackPressed() {
        b0();
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int indexOf;
        super.onConfigurationChanged(configuration);
        int i = this.W0;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.c1.c(i2, "ATTACHES_SCREEN_ORIENTATION_CHANGED");
        }
        this.W0 = configuration.orientation;
        this.I0 = true;
        b33 b33 = this.V0;
        if (b33 != null) {
            b33.c();
        }
        ViewGroup.LayoutParams layoutParams = this.Q0.getLayoutParams();
        layoutParams.height = vo4.a(this);
        this.Q0.setLayoutParams(layoutParams);
        s20 s20 = this.A0;
        if (!(s20 == null || (indexOf = s20.j.indexOf(this.L0)) == -1)) {
            ViewPager viewPager = this.K0;
            viewPager.H0 = false;
            viewPager.v(indexOf, 0, false, false);
            e0();
        }
        y64.C(300, new b(3, (Object) this));
        g0();
    }

    public final void onCreate(Bundle bundle) {
        FrgAttachView frgAttachView;
        TransitionSet transitionSet;
        boolean z;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.a1 = a();
        this.b1 = j();
        if (bundle2 != null) {
            m48 m48 = (m48) this.a1;
            m48.h = bundle2.getFloat(m48.b("MediaPlayerController.Volume"));
            m48.i = bundle2.getBoolean(m48.b("MediaPlayerController.Looping"));
            m48.j = bundle2.getBoolean(m48.b("MediaPlayerController.PlayWhenReady"));
            m48 m482 = (m48) this.b1;
            m482.h = bundle2.getFloat(m482.b("MediaPlayerController.Volume"));
            m482.i = bundle2.getBoolean(m482.b("MediaPlayerController.Looping"));
            m482.j = bundle2.getBoolean(m482.b("MediaPlayerController.PlayWhenReady"));
        }
        this.Z0 = ((qra) ((id3) this.x.b)).d();
        this.c1 = ((qra) ((id3) this.x.b)).c();
        this.W0 = getResources().getConfiguration().orientation;
        this.V0 = T(ujc.act_attachments_view);
        this.B0 = findViewById(lic.act_attachments_view__fl_root);
        obd obd = new obd(new fj((hn) this), (Toolbar) findViewById(lic.toolbar));
        obd.x = K0();
        b33 b33 = new b33(obd);
        this.V0 = b33;
        b33.i(new x4(1, (Object) this));
        this.V0.g(nad.u);
        b33 b332 = this.V0;
        int i = ((ro4) this.x.c).a;
        Toolbar toolbar = (Toolbar) b332.c;
        if (toolbar != null) {
            WeakHashMap weakHashMap = gag.a;
            v9g.s(toolbar, (float) i);
        }
        ViewPager viewPager = (ViewPager) findViewById(lic.act_attachments_view__vp_pager);
        this.K0 = viewPager;
        viewPager.b(new e5(this, 0));
        this.C0 = findViewById(lic.act_attachments_view__rl_info);
        this.Y0 = findViewById(lic.act_attachments_view__info_separator);
        this.Q0 = (RelativeLayout) this.C0.findViewById(lic.act_attachments_view__rl_author);
        this.D0 = (TextView) findViewById(lic.act_attachments_view__tv_author);
        this.E0 = (TextView) findViewById(lic.act_attachments_view__tv_date);
        ImageButton imageButton = (ImageButton) findViewById(lic.act_attachments_view__iv_forward);
        this.F0 = imageButton;
        y64.m(imageButton, 300, new b5(0, this));
        this.O0 = findViewById(lic.act_attachments_view__fl_caption);
        this.P0 = (TextView) findViewById(lic.act_attachments_view__tv_caption);
        this.X0 = findViewById(lic.act_attachments_view__caption_divider);
        this.S0 = (FrameLayout) findViewById(lic.act_attachments_view__fl_timer);
        this.T0 = (TimerView) findViewById(lic.act_attachments_view__timer);
        this.U0 = (Chronometer) findViewById(lic.act_attachments_view__chrono);
        this.C0.setBackgroundColor(this.d1.n);
        this.F0.setColorFilter(this.d1.x);
        this.F0.setBackground(this.d1.d());
        int i2 = this.d1.G;
        this.P0.setTextColor(i2);
        this.X0.setBackgroundColor(this.d1.L);
        this.D0.setTextColor(i2);
        this.E0.setTextColor(i2);
        this.V0.a(this.d1);
        L(K0().M);
        this.Y0.setBackgroundColor(this.d1.L);
        View view = this.C0;
        a5 a5Var = new a5(this);
        WeakHashMap weakHashMap2 = gag.a;
        v9g.u(view, a5Var);
        t9g.c(this.C0);
        hd9 hd9 = (hd9) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
        a89 a89 = hd9 != null ? hd9.a : null;
        if (a89 == null) {
            finish();
            return;
        }
        long X = X();
        boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false);
        ha9 ha9 = a89.a;
        if (!booleanExtra) {
            FrgChatMediaLoader frgChatMediaLoader = (FrgChatMediaLoader) v().E("photo_video");
            this.N0 = frgChatMediaLoader;
            if (frgChatMediaLoader == null) {
                long j = ha9.b;
                Long valueOf = Long.valueOf(j);
                HashSet hashSet = e19.d;
                boolean booleanExtra2 = getIntent().getBooleanExtra("ru.ok.tamtam.extra.DESC_ORDER", false);
                z68.c("ru.ok.messages.media.chat.FrgChatMediaLoader", "newInstance: chatId = %d, initialMessageId = %d, descOrder = %b", Long.valueOf(X), valueOf, Boolean.valueOf(booleanExtra2));
                FrgChatMediaLoader frgChatMediaLoader2 = new FrgChatMediaLoader();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CHAT_ID", X);
                bundle3.putBoolean("ru.ok.tamtam.extra.DESC_ORDER", booleanExtra2);
                bundle3.putIntegerArrayList("ru.ok.tamtam.extra.TYPES", new ArrayList(hashSet));
                bundle3.putLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", j);
                frgChatMediaLoader2.L2(bundle3);
                this.N0 = frgChatMediaLoader2;
                b59.d(v(), this.N0, "photo_video");
            }
        }
        if (bundle2 == null) {
            z68.c("ru.ok.messages.media.attaches.ActAttachesView", "onCreate: savedInstanceState == null", new Object[0]);
            this.L0 = getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.M0 = getIntent().getStringExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID");
            if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false)) {
                w28 w28 = ha9.x0;
                l20 l20 = null;
                for (int i3 = 0; i3 < w28.G(); i3++) {
                    if (w28.F(i3).q.equals(getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID"))) {
                        l20 = w28.F(i3);
                    }
                }
                if (l20 == null) {
                    l20 = w28.F(0);
                }
                if (l20.g()) {
                    c20 c20 = l20.g;
                    if (c20.b()) {
                        l20 = c20.g;
                    }
                }
                boolean W = ld8.W(l20);
                boolean f = l20.f();
                if (f || W) {
                    Bundle i32 = FrgAttachView.i3(l20, a89, true, false, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false));
                    FrgAttachPhoto frgAttachPhoto = new FrgAttachPhoto();
                    frgAttachPhoto.L2(i32);
                    frgAttachView = frgAttachPhoto;
                } else {
                    Bundle i33 = FrgAttachView.i3(l20, a89, true, false, false);
                    i33.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", false);
                    frgAttachView = new FrgAttachVideo();
                    frgAttachView.L2(i33);
                }
                frgAttachView.x.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
                b59.c(v(), lic.act_attachments_view__fl_transition, frgAttachView, "ru.ok.messages.media.attaches.fragments.FrgAttachPhoto");
                this.K0.setVisibility(8);
                this.C0.setVisibility(8);
                this.V0.m(8);
                Rect rect = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                ydd ydd = ydd.p;
                ydd ydd2 = ydd.m;
                if (f || W) {
                    transitionSet = nv4.b(ydd2, l20.i() ? ydd2 : ydd);
                } else {
                    transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                }
                if (rect != null) {
                    z = true;
                    transitionSet.addTransition(new e33(rect, true));
                } else {
                    z = true;
                }
                boolean z2 = (!f || TextUtils.isEmpty(l20.b.z)) ? false : z;
                float[] floatArrayExtra = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra != null && !z2) {
                    transitionSet.addTransition(new iv4(floatArrayExtra, iv4.o));
                }
                transitionSet.addListener(new c5(this, frgAttachView, a89));
                setEnterSharedElementCallback(new d5(rect));
                transitionSet.setDuration(200);
                getWindow().setSharedElementEnterTransition(transitionSet);
                if (ha9.G()) {
                    ydd = ydd2;
                }
                TransitionSet b = nv4.b(ydd, ydd2);
                Rect rect2 = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                if (rect2 != null) {
                    b.addTransition(new e33(rect2, false));
                }
                float[] floatArrayExtra2 = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra2 != null) {
                    b.addTransition(new iv4(iv4.o, floatArrayExtra2));
                }
                b.setDuration(200);
                getWindow().setSharedElementReturnTransition(b);
            }
        } else {
            this.L0 = bundle2.getString("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.G0 = bundle2.getBoolean("ru.ok.tamtam.extra.UI_STATE");
            this.H0 = bundle2.getBoolean("ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME");
            i0(false, false);
        }
        if (this.N0 == null) {
            c0(Collections.singletonList(a89));
            f0(0);
            ((qra) ((id3) this.x.b)).getClass();
            c48 q = sjd.a.q();
            long j2 = ha9.b;
            q.getClass();
            c48.b(q, j2, 0, false, 0, 2).n(xfd.b()).j(qe.a()).l(new ao1(3, new a5(this), new rx0(11)));
        }
        this.R0 = new sd3(this, this, (a) null, 987);
        b(false, false, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        b0();
    }

    @oye
    public void onEvent(kv9 kv9) {
        List list;
        boolean z;
        a89 a89;
        Object obj;
        if (this.Z && kv9.b == X() && (list = kv9.v) != null) {
            if (this.N0 == null) {
                int i = 0;
                while (i < this.A0.j.size()) {
                    v7b r = this.A0.r(i);
                    if (r == null || (obj = r.b) == null || !list.contains(Long.valueOf(((a89) obj).a.b))) {
                        i++;
                    } else {
                        hi7.b0(0, this, getString(qad.s5));
                        overridePendingTransition(0, 0);
                        finish();
                        return;
                    }
                }
                return;
            }
            int currentItem = this.K0.getCurrentItem();
            Iterator it = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Long l = (Long) it.next();
                FrgChatMediaLoader frgChatMediaLoader = this.N0;
                long longValue = l.longValue();
                Iterator it2 = frgChatMediaLoader.B1.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        a89 = null;
                        break;
                    }
                    a89 = (a89) it2.next();
                    if (a89.a.b == longValue) {
                        break;
                    }
                }
                if (a89 != null) {
                    if (a89.a.c == 0) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
                FrgChatMediaLoader frgChatMediaLoader2 = this.N0;
                long longValue2 = l.longValue();
                ye2 ye2 = frgChatMediaLoader2.B1;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = ye2.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((a89) arrayList.get(i2)).a.b == longValue2) {
                        arrayList.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z2) {
                if (this.N0.B1.d.size() > 0) {
                    c0(this.N0.B1.d);
                    if (currentItem >= this.A0.j.size()) {
                        currentItem = this.A0.j.size() - 1;
                    }
                    v7b r2 = this.A0.r(currentItem);
                    if (r2 != null) {
                        String str = ((l20) r2.a).q;
                        this.L0 = str;
                        f0(currentItem);
                        ViewPager viewPager = this.K0;
                        viewPager.H0 = false;
                        viewPager.v(currentItem, 0, false, false);
                        z = !TextUtils.equals(str, this.L0);
                    } else {
                        z = false;
                    }
                } else {
                    overridePendingTransition(0, 0);
                    finish();
                }
                if (z) {
                    hi7.b0(0, this, getString(z3 ? qad.ia : qad.s5));
                }
            }
        }
    }

    public final void onPause() {
        super.onPause();
        FrgChatMediaLoader frgChatMediaLoader = this.N0;
        if (frgChatMediaLoader != null) {
            frgChatMediaLoader.B1.o.remove(this);
        }
        if (this.a1 != null) {
            ((qra) ((id3) this.x.b)).t().s(this.a1);
        }
        if (this.b1 != null) {
            ((qra) ((id3) this.x.b)).t().s(this.b1);
        }
    }

    public final void onResume() {
        super.onResume();
        FrgChatMediaLoader frgChatMediaLoader = this.N0;
        if (frgChatMediaLoader != null) {
            if (!this.I0 && frgChatMediaLoader.B1.d.size() > 0 && this.N0.B1.d.size() != this.z0.size()) {
                Z(this.N0.B1.d);
            }
            this.I0 = false;
            this.N0.B1.o.add(this);
            if (this.N0.B1.k) {
                e0();
            }
        }
        s20 s20 = this.A0;
        if (s20 != null) {
            if (s20.k.size() != 0) {
                s20 s202 = this.A0;
                a aVar = (a) s202.g.get(s202.n(this.K0.getCurrentItem()));
                if (aVar instanceof FrgAttachVideo) {
                    ((FrgAttachVideo) aVar).u3();
                }
            }
            if (this.a1 != null) {
                ((qra) ((id3) this.x.b)).t().o(this.a1);
            }
            if (this.b1 != null) {
                ((qra) ((id3) this.x.b)).t().o(this.b1);
            }
            b(this.G0, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r6.A0.r(r6.K0.getCurrentItem());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveInstanceState(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onSaveInstanceState(r7)
            java.lang.String r0 = "ru.ok.tamtam.extra.UI_STATE"
            boolean r1 = r6.G0
            r7.putBoolean(r0, r1)
            s20 r0 = r6.A0
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r0.k
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0017
            goto L_0x002c
        L_0x0017:
            s20 r0 = r6.A0
            androidx.viewpager.widget.ViewPager r1 = r6.K0
            int r1 = r1.getCurrentItem()
            v7b r0 = r0.r(r1)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.a
            l20 r0 = (defpackage.l20) r0
            java.lang.String r0 = r0.q
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.String r1 = "ru.ok.tamtam.extra.START_LOCAL_ID"
            r7.putString(r1, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME"
            boolean r1 = r6.H0
            r7.putBoolean(r0, r1)
            ju8 r0 = r6.a1
            java.lang.String r1 = "MediaPlayerController.PlayWhenReady"
            java.lang.String r2 = "MediaPlayerController.Looping"
            java.lang.String r3 = "MediaPlayerController.Volume"
            if (r0 == 0) goto L_0x0060
            m48 r0 = (defpackage.m48) r0
            java.lang.String r4 = r0.b(r3)
            float r5 = r0.h
            r7.putFloat(r4, r5)
            java.lang.String r4 = r0.b(r2)
            boolean r5 = r0.i
            r7.putBoolean(r4, r5)
            java.lang.String r4 = r0.b(r1)
            boolean r0 = r0.j
            r7.putBoolean(r4, r0)
        L_0x0060:
            ju8 r6 = r6.b1
            if (r6 == 0) goto L_0x0081
            m48 r6 = (defpackage.m48) r6
            java.lang.String r0 = r6.b(r3)
            float r3 = r6.h
            r7.putFloat(r0, r3)
            java.lang.String r0 = r6.b(r2)
            boolean r2 = r6.i
            r7.putBoolean(r0, r2)
            java.lang.String r0 = r6.b(r1)
            boolean r6 = r6.j
            r7.putBoolean(r0, r6)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.onSaveInstanceState(android.os.Bundle):void");
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        s20 s20 = this.A0;
        if (s20 != null) {
            for (WeakReference weakReference : s20.o.values()) {
                FrgAttachView frgAttachView = (FrgAttachView) weakReference.get();
                if (frgAttachView != null) {
                    frgAttachView.m3(z);
                }
            }
        }
    }

    public final ju8 p() {
        z68.e("ru.ok.messages.media.attaches.ActAttachesView", "ActAttachesView is only for gif/video");
        return ((qra) ((id3) this.x.b)).t().r(nu8.b);
    }

    public final b33 q1() {
        return this.V0;
    }

    public final void v1(long[] jArr, long[] jArr2) {
        ViewGroup viewGroup;
        int length = jArr2.length;
        long X = X();
        View view = this.B0;
        if (jArr != null) {
            int i = 0;
            if (jArr.length == 1 && jArr[0] == X) {
                int j = sd3.j(true);
                Handler handler = hi7.j;
                hi7.Z(this, getString(j));
            } else if (jArr.length > 1) {
                int i2 = qad.p3;
                Handler handler2 = hi7.j;
                hi7.b0(0, this, getString(i2));
            } else {
                et3 et3 = new et3(jArr, this);
                int j2 = length > 1 ? qad.p3 : sd3.j(true);
                int i3 = qad.C3;
                view.getContext();
                ro4 b = ro4.b();
                int[] iArr = efe.C;
                CharSequence text = view.getResources().getText(j2);
                ViewGroup viewGroup2 = null;
                View view2 = view;
                while (true) {
                    if (!(view2 instanceof CoordinatorLayout)) {
                        if (view2 instanceof FrameLayout) {
                            if (view2.getId() == 16908290) {
                                viewGroup = (ViewGroup) view2;
                                break;
                            }
                            viewGroup2 = (ViewGroup) view2;
                        }
                        ViewParent parent = view2.getParent();
                        if (parent instanceof View) {
                            view2 = (View) parent;
                            continue;
                        } else {
                            view2 = null;
                            continue;
                        }
                        if (view2 == null) {
                            viewGroup = viewGroup2;
                            break;
                        }
                    } else {
                        viewGroup = (ViewGroup) view2;
                        break;
                    }
                }
                if (viewGroup != null) {
                    Context context = viewGroup.getContext();
                    LayoutInflater from = LayoutInflater.from(context);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(efe.C);
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                    obtainStyledAttributes.recycle();
                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? qjc.design_layout_snackbar_include : qjc.mtrl_layout_snackbar_include, viewGroup, false);
                    efe efe = new efe(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                    hl0 hl0 = efe.i;
                    ((SnackbarContentLayout) hl0.getChildAt(0)).getMessageView().setText(text);
                    efe.k = 0;
                    View findViewById = hl0.findViewById(ComGoogleAndroidMaterialR$id.snackbar_text);
                    TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
                    View findViewById2 = hl0.findViewById(ComGoogleAndroidMaterialR$id.snackbar_action);
                    AppCompatButton appCompatButton = findViewById2 instanceof AppCompatButton ? (AppCompatButton) findViewById2 : null;
                    ViewGroup.LayoutParams layoutParams = hl0.getLayoutParams();
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 81;
                    }
                    if (textView != null) {
                        textView.setTextAlignment(5);
                        textView.setGravity(8388627);
                        iq.s(textView, 0);
                    }
                    if (appCompatButton != null) {
                        appCompatButton.setTextAlignment(4);
                        appCompatButton.setGravity(17);
                    }
                    Context context2 = view.getContext();
                    Lazy lazy = scf.b0;
                    scf k0 = j4b.k0(context2);
                    ((SnackbarContentLayout) hl0.getChildAt(0)).getActionView().setTextColor(k0.l);
                    if (textView != null) {
                        textView.setTextColor(k0.t);
                    }
                    if (appCompatButton != null) {
                        appCompatButton.setBackground(k0.d());
                    }
                    hl0.setBackground(i8b.O(Integer.valueOf(j4b.l0(1.0f, k0.s)), (Integer) null, (Integer) null, b.f));
                    CharSequence text2 = efe.h.getText(i3);
                    Button actionView = ((SnackbarContentLayout) efe.i.getChildAt(0)).getActionView();
                    if (!TextUtils.isEmpty(text2)) {
                        efe.B = true;
                        actionView.setVisibility(0);
                        actionView.setText(text2);
                        actionView.setOnClickListener(new kqc(13, (Object) efe, (Object) et3));
                    } else {
                        actionView.setVisibility(8);
                        actionView.setOnClickListener((View.OnClickListener) null);
                        efe.B = false;
                    }
                    qpg l = qpg.l();
                    int i4 = efe.k;
                    int i5 = -2;
                    if (i4 != -2) {
                        if (efe.B) {
                            i = 4;
                        }
                        i5 = efe.A.getRecommendedTimeoutMillis(i4, i | 3);
                    }
                    fl0 fl0 = efe.u;
                    synchronized (l.a) {
                        try {
                            if (l.m(fl0)) {
                                ffe ffe = (ffe) l.c;
                                ffe.b = i5;
                                ((Handler) l.b).removeCallbacksAndMessages(ffe);
                                l.v((ffe) l.c);
                                return;
                            }
                            ffe ffe2 = (ffe) l.o;
                            if (ffe2 == null || fl0 == null || ffe2.a.get() != fl0) {
                                l.o = new ffe(i5, fl0);
                            } else {
                                ((ffe) l.o).b = i5;
                            }
                            ffe ffe3 = (ffe) l.c;
                            if (ffe3 == null || !l.c(ffe3, 4)) {
                                l.c = null;
                                l.x();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                }
            }
        }
    }

    public final void z() {
        super.z();
        if (this.H0) {
            a D = v().D(lic.act_attachments_view__fl_transition);
            hd9 hd9 = (hd9) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
            W(D, hd9 != null ? hd9.a : null);
        }
    }

    @oye
    public void onEvent(tr4 tr4) {
        v7b r;
        s20 s20 = this.A0;
        if (s20 != null && this.Z && (r = s20.r(this.K0.getCurrentItem())) != null) {
            l20 l20 = (l20) r.a;
            if (l20.d != null) {
                if (l20.q.equals(tr4.o)) {
                    this.D0.setText(getString(qad.ka));
                    this.E0.setVisibility(8);
                    this.J0 = true;
                }
            }
        }
    }
}
