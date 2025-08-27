package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.b;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.views.fragments.FrgProfileSettings;

/* renamed from: gk8  reason: default package */
public final class gk8 extends tyc {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int o = 0;
    public boolean v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public gk8(Context context, hk8 hk8, ch chVar, o20 o20, h48 h48, n48 n48) {
        v3d v3d;
        this.w = hk8;
        this.x = chVar;
        this.y = o20;
        this.z = h48;
        this.X = n48;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ydc.compose_view_item_height);
        if (dimensionPixelSize <= 0) {
            v3d = null;
        } else {
            v3d = new v3d(c44.DEFAULT_ASPECT_RATIO, dimensionPixelSize, dimensionPixelSize, 12);
        }
        this.Y = v3d;
    }

    /* JADX WARNING: type inference failed for: r4v23, types: [vpa] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList E() {
        /*
            r30 = this;
            r0 = r30
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlin.Lazy r2 = defpackage.scf.b0
            java.lang.Object r2 = r0.w
            android.content.Context r2 = (android.content.Context) r2
            scf r3 = defpackage.j4b.k0(r2)
            int r5 = defpackage.lic.setting_notifications
            int r6 = defpackage.nad.W0
            int r4 = defpackage.qad.U5
            java.lang.String r7 = r2.getString(r4)
            java.lang.Object r4 = r0.X
            cq r4 = (defpackage.cq) r4
            boolean r10 = r4.c()
            j6c r12 = new j6c
            r11 = 1
            r8 = 0
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r4 = defpackage.lic.setting_media
            int r5 = defpackage.nad.e1
            int r6 = defpackage.qad.o4
            java.lang.String r6 = r2.getString(r6)
            j6c r4 = defpackage.j6c.b(r4, r5, r6)
            r1.add(r4)
            int r4 = defpackage.lic.setting_appearance
            int r5 = defpackage.nad.N0
            int r6 = defpackage.qad.k9
            java.lang.String r6 = r2.getString(r6)
            j6c r4 = defpackage.j6c.b(r4, r5, r6)
            r1.add(r4)
            int r4 = defpackage.lic.setting_messages
            int r5 = defpackage.nad.P0
            int r6 = defpackage.qad.t5
            java.lang.String r6 = r2.getString(r6)
            j6c r4 = defpackage.j6c.b(r4, r5, r6)
            r1.add(r4)
            int r4 = defpackage.lic.setting_language
            int r5 = defpackage.nad.D
            int r6 = defpackage.qad.p9
            java.lang.String r6 = r2.getString(r6)
            j6c r4 = defpackage.j6c.b(r4, r5, r6)
            r1.add(r4)
            j6c r4 = defpackage.j6c.a()
            r1.add(r4)
            int r4 = defpackage.lic.setting_privacy
            int r5 = defpackage.nad.f2
            int r6 = defpackage.qad.u7
            java.lang.String r6 = r2.getString(r6)
            j6c r4 = defpackage.j6c.b(r4, r5, r6)
            r1.add(r4)
            j6c r4 = defpackage.j6c.a()
            r1.add(r4)
            int r7 = defpackage.nad.A
            int r4 = defpackage.qad.W
            java.lang.String r8 = r2.getString(r4)
            java.lang.Object r4 = r0.y
            ltb r4 = (defpackage.ltb) r4
            hq r5 = r4.c
            java.lang.String r6 = "app.messages.calls.menu.item"
            r13 = 1
            boolean r10 = r5.c(r6, r13)
            j6c r14 = new j6c
            int r6 = defpackage.lic.setting_calls_checkbox
            r9 = 0
            r11 = 0
            r12 = 1
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.add(r14)
            int r5 = defpackage.lic.setting_folders
            int r6 = defpackage.nad.o0
            int r7 = defpackage.qad.m3
            java.lang.String r7 = r2.getString(r7)
            j6c r5 = defpackage.j6c.b(r5, r6, r7)
            r1.add(r5)
            j6c r5 = defpackage.j6c.a()
            r1.add(r5)
            int r5 = defpackage.lic.setting_feedback
            int r6 = defpackage.nad.r
            int r7 = defpackage.qad.v2
            java.lang.String r7 = r2.getString(r7)
            int r8 = r3.l
            j6c r9 = new j6c
            r9.<init>(r5, r7, r6, r8)
            r1.add(r9)
            int r5 = defpackage.lic.setting_contact_invite
            int r6 = defpackage.nad.N1
            int r7 = defpackage.qad.W9
            java.lang.String r7 = r2.getString(r7)
            j6c r8 = new j6c
            int r9 = r3.l
            r8.<init>(r5, r7, r6, r9)
            r1.add(r8)
            j6c r5 = defpackage.j6c.a()
            r1.add(r5)
            int r15 = defpackage.lic.setting_version
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = defpackage.qad.aa
            java.lang.String r6 = r2.getString(r6)
            r5.append(r6)
            java.lang.String r6 = " v25.6.4"
            r5.append(r6)
            vpa r6 = defpackage.kv0.f
            r7 = 0
            if (r6 == 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r6 = r7
        L_0x0118:
            r6.getClass()
            java.lang.String r5 = r5.toString()
            a33 r6 = r4.a
            tn4 r8 = r6.j
            r8.getClass()
            h2g r8 = defpackage.h2g.a
            vpa r8 = r8.c()
            r8.getClass()
            int r8 = defpackage.b0h.g
            java.lang.String r8 = r6.q()
            boolean r9 = defpackage.cvg.A(r8)
            if (r9 != 0) goto L_0x013c
            goto L_0x0144
        L_0x013c:
            java.util.Locale r8 = defpackage.b0h.B()
            java.lang.String r8 = r8.getLanguage()
        L_0x0144:
            java.util.Locale r9 = new java.util.Locale
            java.lang.String r10 = "ru"
            r9.<init>(r10)
            java.lang.String r9 = r9.getLanguage()
            boolean r8 = r8.equals(r9)
            int r9 = defpackage.fhf.a
            if (r8 == 0) goto L_0x015a
            int r8 = defpackage.rmc.privacy_policy_link_ru
            goto L_0x015c
        L_0x015a:
            int r8 = defpackage.rmc.privacy_policy_link_en
        L_0x015c:
            java.lang.String r8 = r2.getString(r8)
            int r9 = defpackage.qad.v7
            java.lang.String r9 = r2.getString(r9)
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = "<a href=\""
            java.lang.String r11 = "\">"
            java.lang.String r8 = defpackage.wj6.k(r10, r8, r11)
            java.lang.String r10 = "</a>"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r8, r10}
            java.lang.String r5 = java.lang.String.format(r9, r5)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "<br />"
            java.lang.String r5 = r5.replace(r8, r9)
            r8 = 0
            android.text.Spanned r17 = android.text.Html.fromHtml(r5, r8)
            j6c r5 = new j6c
            r19 = 0
            r21 = 0
            r16 = 0
            int r3 = r3.N
            r20 = 0
            r14 = r5
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.add(r5)
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x02a4
            j6c r0 = defpackage.j6c.a()
            r1.add(r0)
            ve8 r5 = new ve8
            r5.<init>((android.content.Context) r2, (defpackage.ltb) r4)
            defpackage.kv0.K()
            cud r0 = r4.b
            int r0 = r0.n()
            i94 r0 = defpackage.i94.a(r0)
            i94 r4 = defpackage.i94.DEV_OPTIONS_MENU
            if (r0 == r4) goto L_0x01c1
        L_0x01bd:
            r25 = r7
            goto L_0x0268
        L_0x01c1:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01da }
            kotlin.Lazy r0 = r5.b     // Catch:{ all -> 0x01da }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01da }
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0     // Catch:{ all -> 0x01da }
            int r4 = defpackage.rmc.build_at     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x01da }
            java.util.Date r0 = r0.parse(r4)     // Catch:{ all -> 0x01da }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x01da }
            goto L_0x01e5
        L_0x01da:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x01e5:
            java.lang.Throwable r4 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r4 != 0) goto L_0x01ec
            goto L_0x01f1
        L_0x01ec:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
        L_0x01f1:
            java.util.Date r0 = (java.util.Date) r0
            vpa r4 = defpackage.kv0.f
            if (r4 == 0) goto L_0x01f8
            goto L_0x01f9
        L_0x01f8:
            r4 = r7
        L_0x01f9:
            r4.getClass()
            vpa r4 = defpackage.kv0.f
            if (r4 == 0) goto L_0x0201
            r7 = r4
        L_0x0201:
            r7.getClass()
            tn4 r4 = r6.j
            r4.getClass()
            h2g r4 = defpackage.h2g.a
            vpa r4 = r4.c()
            r4.getClass()
            java.lang.String r4 = r6.z()
            java.lang.String r6 = r6.A()
            int r7 = defpackage.rmc.git_branch
            java.lang.String r7 = r2.getString(r7)
            int r9 = defpackage.rmc.git_last_commit_hash
            java.lang.String r9 = r2.getString(r9)
            r10 = 16
            java.lang.String r9 = kotlin.text.StringsKt.take((java.lang.String) r9, (int) r10)
            kotlin.Lazy r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            java.util.Locale r5 = (java.util.Locale) r5
            long r10 = r0.getTime()
            java.lang.String r0 = defpackage.j4b.C(r2, r5, r10, r13)
            java.lang.String r5 = "\n            |Build Type: release;\n            |Version: 25.6.4(6355);\n            |Server: "
            java.lang.String r10 = ":"
            java.lang.String r11 = ";\n            |Branch: "
            java.lang.StringBuilder r4 = defpackage.rae.r(r5, r4, r10, r6, r11)
            r4.append(r7)
            java.lang.String r5 = "\n            |Hash: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = "\n            |Сборка от "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "\n        "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, (java.lang.String) null, 1, (java.lang.Object) null)
            goto L_0x01bd
        L_0x0268:
            boolean r0 = defpackage.cvg.D(r25)
            if (r0 == 0) goto L_0x0284
            int r23 = defpackage.lic.setting_debug_info
            j6c r0 = new j6c
            r27 = 0
            r29 = 0
            r24 = 0
            r28 = 0
            r22 = r0
            r26 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r1.add(r0)
        L_0x0284:
            int r0 = defpackage.lic.setting_dev_logs
            int r3 = defpackage.rmc.menu_dev_logs
            java.lang.String r3 = r2.getString(r3)
            j6c r4 = new j6c
            r4.<init>(r0, r3, r8, r8)
            r1.add(r4)
            int r0 = defpackage.lic.setting_dev
            int r3 = defpackage.rmc.menu_dev_settings
            java.lang.String r2 = r2.getString(r3)
            j6c r3 = new j6c
            r3.<init>(r0, r2, r8, r8)
            r1.add(r3)
        L_0x02a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk8.E():java.util.ArrayList");
    }

    public boolean F() {
        Iterator it = ((ArrayList) this.Y).iterator();
        while (it.hasNext()) {
            j6c j6c = (j6c) it.next();
            if (j6c.a == lic.setting_notifications) {
                return j6c.f;
            }
        }
        return false;
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((h48) this.z).f.c();
            default:
                return ((ArrayList) this.Y).size();
        }
    }

    public long k(int i) {
        d48 d48;
        switch (this.o) {
            case 0:
                uqd j = ((h48) this.z).f.j(i);
                if (j == null || (d48 = j.a) == null) {
                    return 0;
                }
                return d48.b;
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.o) {
            case 1:
                int i2 = ((j6c) ((ArrayList) this.Y).get(i)).a;
                int i3 = lic.short_divider;
                if (i2 == i3) {
                    return i3;
                }
                int i4 = lic.fat_divider;
                if (i2 == i4) {
                    return i4;
                }
                int i5 = lic.setting_calls_checkbox;
                if (i2 == i5) {
                    return i5;
                }
                return 0;
            default:
                return super.l(i);
        }
    }

    public final void s(pzc pzc, int i) {
        int i2 = i;
        int i3 = 8;
        BitmapDrawable bitmapDrawable = null;
        switch (this.o) {
            case 0:
                ik8 ik8 = (ik8) pzc;
                uqd j = ((h48) this.z).f.j(i2);
                if (j != null) {
                    boolean z2 = j.e;
                    boolean z3 = z2 != ik8.N0;
                    ik8.N0 = z2;
                    ik8.J0 = j;
                    z68.c("ik8", "Dispose", new Object[0]);
                    SimpleDraweeView simpleDraweeView = ik8.K0;
                    simpleDraweeView.animate().cancel();
                    o48 o48 = ik8.O0;
                    if (o48 != null) {
                        o48.a();
                    }
                    ik8.O0 = null;
                    n48 n48 = ik8.I0;
                    d48 d48 = j.a;
                    o48 a = n48.a(ik8, d48);
                    a.c();
                    ik8.O0 = a;
                    if (ik8.G0) {
                        ch chVar = ik8.D0;
                        boolean z4 = z3 && chVar.q();
                        uqd uqd = ik8.J0;
                        if (uqd != null) {
                            simpleDraweeView.animate().cancel();
                            View view = ik8.M0;
                            if (z4) {
                                if (uqd.e) {
                                    simpleDraweeView.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.5f).setDuration(100).setInterpolator(chVar.a.n());
                                    view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100).setInterpolator(chVar.a.n());
                                } else {
                                    simpleDraweeView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100).setInterpolator(chVar.a.n());
                                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(chVar.a.n());
                                }
                            } else if (uqd.e) {
                                simpleDraweeView.setScaleX(0.8f);
                                simpleDraweeView.setScaleY(0.8f);
                                simpleDraweeView.setAlpha(0.5f);
                                view.setScaleX(0.8f);
                                view.setScaleY(0.8f);
                            } else {
                                simpleDraweeView.setScaleX(1.0f);
                                simpleDraweeView.setScaleY(1.0f);
                                simpleDraweeView.setAlpha(1.0f);
                                view.setScaleX(1.0f);
                                view.setScaleY(1.0f);
                            }
                        }
                    }
                    if ((d48 instanceof k00) && !dfb.b(j.c, d48)) {
                        bitmapDrawable = ik8.F0.b(((k00) d48).X, false);
                    }
                    ((sp6) simpleDraweeView.getHierarchy()).i(bitmapDrawable, 1);
                    return;
                }
                return;
            default:
                j6c j6c = (j6c) ((ArrayList) this.Y).get(i2);
                int i4 = j6c.a;
                if (!(i4 == lic.short_divider || i4 == lic.fat_divider)) {
                    v0e v0e = (v0e) pzc;
                    boolean z5 = j6c.g;
                    View view2 = v0e.a;
                    view2.setEnabled(z5);
                    int i5 = j6c.a;
                    view2.setId(i5);
                    SwitchCompat switchCompat = v0e.H0;
                    if (switchCompat != null) {
                        switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                        switchCompat.setChecked(j6c.e);
                        switchCompat.setOnCheckedChangeListener(new u0e(0, v0e, j6c));
                    }
                    AppCompatImageView appCompatImageView = v0e.F0;
                    if (appCompatImageView != null) {
                        int i6 = j6c.b;
                        if (i6 != 0) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(i6);
                        } else {
                            appCompatImageView.setVisibility(8);
                        }
                    }
                    CharSequence charSequence = j6c.c;
                    TextView textView = v0e.G0;
                    textView.setText(charSequence);
                    scf scf = v0e.J0;
                    int i7 = j6c.d;
                    if (i7 != 0) {
                        appCompatImageView.setColorFilter(i7);
                    } else if (i5 == lic.setting_version || i5 == lic.setting_debug_info) {
                        appCompatImageView.setColorFilter(scf.N);
                        i7 = scf.N;
                    } else {
                        appCompatImageView.setColorFilter(scf.G);
                        i7 = scf.G;
                    }
                    textView.setTextColor(i7);
                    view2.setBackground(scf.e());
                    int i8 = lic.setting_version;
                    Resources resources = v0e.D0;
                    if (i5 == i8) {
                        textView.setTextSize(0, resources.getDimension(mad.f));
                        textView.setMaxLines(2);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setTransformationMethod(new qy7((ny7) null, i7, true, false));
                        textView.setLineSpacing(c44.DEFAULT_ASPECT_RATIO, 1.83f);
                        textView.setClickable(false);
                    } else if (i5 == lic.setting_debug_info) {
                        textView.setTextSize(0, resources.getDimension(mad.f));
                        textView.setMaxLines(IntCompanionObject.MAX_VALUE);
                        textView.setLineSpacing(c44.DEFAULT_ASPECT_RATIO, 1.1f);
                        textView.setBackground(scf.d());
                        textView.setClickable(true);
                        ct.G(textView, 300, new kqc(8, (Object) v0e, (Object) j6c));
                    } else {
                        textView.setTextSize(0, resources.getDimension(mad.b));
                        textView.setMaxLines(1);
                        textView.setMovementMethod((MovementMethod) null);
                        textView.setTransformationMethod((TransformationMethod) null);
                        textView.setLineSpacing(c44.DEFAULT_ASPECT_RATIO, 1.0f);
                        textView.setClickable(false);
                    }
                    TextView textView2 = v0e.I0;
                    if (textView2 != null) {
                        if (j6c.f) {
                            i3 = 0;
                        }
                        textView2.setVisibility(i3);
                    }
                }
                if (l(i2) == lic.short_divider) {
                    ((zq4) pzc).M(xq4.SHORT_DIVIDER);
                    return;
                } else if (l(i2) == lic.fat_divider) {
                    ((zq4) pzc).M(xq4.FAT_DIVIDER);
                    return;
                } else {
                    return;
                }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new ik8(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_media_bar_selected, viewGroup, false), (ch) this.x, (hk8) this.w, (o20) this.y, this.v, (v3d) this.Y, (n48) this.X);
            default:
                int i2 = lic.short_divider;
                LayoutInflater layoutInflater = (LayoutInflater) this.z;
                if (i == i2) {
                    return new zq4(layoutInflater.inflate(ujc.row_divider, viewGroup, false));
                }
                if (i == lic.fat_divider) {
                    return new zq4(layoutInflater.inflate(ujc.row_divider, viewGroup, false));
                }
                int i3 = lic.setting_calls_checkbox;
                FrgProfileSettings frgProfileSettings = (FrgProfileSettings) this.x;
                return i == i3 ? new v0e(layoutInflater.inflate(ujc.row_main_setting_checkbox, viewGroup, false), true, frgProfileSettings) : new v0e(layoutInflater.inflate(ujc.row_main_setting, viewGroup, false), false, frgProfileSettings);
        }
    }

    public void y(pzc pzc) {
        switch (this.o) {
            case 0:
                ((ik8) pzc).K0.animate().cancel();
                return;
            default:
                return;
        }
    }

    public gk8(b bVar, FrgProfileSettings frgProfileSettings, ltb ltb, cq cqVar, boolean z2) {
        this.w = bVar;
        this.x = frgProfileSettings;
        this.y = ltb;
        this.z = LayoutInflater.from(bVar);
        this.X = cqVar;
        this.v = z2;
        this.Y = E();
    }
}
