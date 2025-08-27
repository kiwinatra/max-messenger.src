package ru.ok.messages.media.mediabar;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.media.crop.ActTamCropImage;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

public class ActLocalMedias extends o5 implements hi6, zh6, kmf, fk8, View.OnSystemUiVisibilityChangeListener, fr7, qqd, oqd, s0a, ku8, kj8 {
    public static final /* synthetic */ int W0 = 0;
    public int A0 = 0;
    public String B0;
    public a48 C0;
    public it8 D0;
    public boolean E0 = true;
    public boolean F0 = true;
    public ViewPager2 G0;
    public b33 H0;
    public View I0;
    public MediaBarPreviewLayout J0;
    public hr7 K0;
    public mq4 L0;
    public z0a M0;
    public e3a N0;
    public ju8 O0;
    public ju8 P0;
    public Toast Q0;
    public boolean R0 = true;
    public q09 S0;
    public m02 T0 = null;
    public final Lazy U0 = LazyKt.lazy(new j6(0, this));
    public final k6 V0 = new k6(this, 0);
    public final ArrayList z0 = new ArrayList();

    public static Pair c0(Activity activity, n2 n2Var, o5h o5h, z38 z38, boolean z) {
        Intent intent = new Intent(activity, ActLocalMedias.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_CREATION", z);
        if (o5h == null || n2Var == null) {
            intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new a48(z38));
            return Pair.create(intent, (Object) null);
        }
        intent.putExtra("ru.ok.tamtam.extra.WITH_TRANSITION", true);
        Rect rect = (Rect) o5h.b;
        if (rect != null) {
            z38.g = rect;
        }
        float[] fArr = (float[]) o5h.c;
        if (fArr != null) {
            z38.h = fArr;
        }
        String a = n2Var.a();
        boolean A = cvg.A(a);
        int i = n2Var.a;
        String valueOf = A ? String.valueOf(i) : a;
        View view = (View) o5h.a;
        view.setTransitionName(valueOf);
        if (i == 1 && !cvg.A(a)) {
            ld9.B().f(ra7.d(o5a.x(n2Var.a())).a(), (f0) null);
        }
        ActivityOptions makeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(activity, view, valueOf);
        intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new a48(z38));
        return Pair.create(intent, makeSceneTransitionAnimation.toBundle());
    }

    public static void g0(Activity activity, n2 n2Var, o5h o5h, z38 z38, uk2 uk2) {
        Pair c0 = c0(activity, n2Var, o5h, z38, false);
        Intent intent = (Intent) c0.first;
        if (uk2 != null) {
            intent.putExtra("act:local_medias:chat_mode", uk2.ordinal());
        }
        activity.startActivityForResult(intent, 110, (Bundle) c0.second);
    }

    public final String E() {
        return "LOCAL_MEDIA_VIEWER";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: kwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: kwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kwd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.z0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r7.A0
            java.lang.Object r1 = r0.get(r1)
            d48 r1 = (defpackage.d48) r1
            r2 = 1
            r3 = -1
            if (r8 != r2) goto L_0x0090
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "ru.ok.tamtam.extra.START_POSITION"
            r2 = 0
            long r8 = r10.getLongExtra(r8, r2)
            java.lang.String r0 = "ru.ok.tamtam.extra.END_POSITION"
            long r2 = r10.getLongExtra(r0, r2)
            java.lang.String r0 = "ru.ok.tamtam.extra.THUMBNAIL_URI"
            java.lang.String r10 = r10.getStringExtra(r0)
            z0a r0 = r7.M0
            p4g r4 = r0.y
            i20 r4 = r4.a()
            float r8 = (float) r8
            long r5 = r0.x
            float r9 = (float) r5
            float r8 = r8 / r9
            r4.b = r8
            float r8 = (float) r2
            float r8 = r8 / r9
            r4.c = r8
            p4g r8 = new p4g
            r8.<init>(r4)
            r0.y = r8
            r0.b0()
            d48 r8 = r0.o
            sqd r9 = r0.Y
            java.util.concurrent.CopyOnWriteArraySet r0 = r9.a
            int r0 = r0.size()
            r9.b(r8, r0)
            uqd r8 = r9.i(r8)
            if (r8 != 0) goto L_0x005c
            goto L_0x0074
        L_0x005c:
            r8.d = r10
            java.util.Set r9 = r9.g
            java.util.Iterator r9 = r9.iterator()
        L_0x0064:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r9.next()
            oqd r0 = (defpackage.oqd) r0
            r0.k(r8)
            goto L_0x0064
        L_0x0074:
            if (r1 == 0) goto L_0x018f
            it8 r8 = r7.D0
            long r2 = r1.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r8 = r8.H(r2)
            boolean r9 = r8 instanceof ru.ok.messages.media.mediabar.FrgLocalVideo
            if (r9 == 0) goto L_0x0087
            ru.ok.messages.media.mediabar.FrgLocalVideo r8 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r8
            r8.l3()
        L_0x0087:
            l02 r8 = new l02
            r8.<init>(r1, r10)
            r7.T0 = r8
            goto L_0x018f
        L_0x0090:
            r4 = 2
            if (r8 != r4) goto L_0x014b
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "ru.ok.tamtam.extra.RESULT_URI"
            android.os.Parcelable r8 = r10.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r9 = "ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI"
            android.os.Parcelable r9 = r10.getParcelableExtra(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r1 = "ru.ok.tamtam.extra.CROP_STATE"
            android.os.Parcelable r10 = r10.getParcelableExtra(r1)
            d44 r10 = (defpackage.d44) r10
            if (r8 == 0) goto L_0x0128
            z0a r1 = r7.M0
            dfb r2 = r1.z
            if (r2 == 0) goto L_0x00ba
            kwd r2 = r2.c()
            goto L_0x00bf
        L_0x00ba:
            kwd r2 = new kwd
            r2.<init>()
        L_0x00bf:
            dfb r3 = r1.z
            r4 = 0
            if (r3 == 0) goto L_0x00ce
            android.net.Uri r3 = r3.v
            if (r3 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r2.e = r4
            r2.c = r4
            goto L_0x00d0
        L_0x00ce:
            r2.c = r10
        L_0x00d0:
            if (r9 == 0) goto L_0x00d7
            r2.b = r9
            r2.f = r8
            goto L_0x00d9
        L_0x00d7:
            r2.b = r8
        L_0x00d9:
            if (r10 != 0) goto L_0x00dd
            r2.b = r4
        L_0x00dd:
            dfb r9 = r2.c()
            r1.z = r9
            r1.a0()
            d48 r9 = r1.o
            sqd r10 = r1.Y
            boolean r9 = r10.l(r9)
            boolean r2 = r1.x0
            if (r9 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x00f7
            r1.Z()
        L_0x00f7:
            d48 r9 = r1.o
            boolean r9 = r10.l(r9)
            if (r9 == 0) goto L_0x0104
            if (r2 != 0) goto L_0x0104
            r1.Z()
        L_0x0104:
            t0a r9 = new t0a
            r10 = 5
            r9.<init>(r1, r10)
            r1.c0(r9)
            t0a r9 = new t0a
            r10 = 4
            r9.<init>(r1, r10)
            r1.c0(r9)
            int r9 = r7.A0
            java.lang.Object r9 = r0.get(r9)
            d48 r9 = (defpackage.d48) r9
            if (r9 == 0) goto L_0x018f
            j02 r10 = new j02
            r10.<init>(r9, r8)
            r7.T0 = r10
            goto L_0x018f
        L_0x0128:
            ru.ok.tamtam.util.HandledException r8 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = "no crop result data"
            r8.<init>(r9)
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "ru.ok.messages.media.mediabar.ActLocalMedias"
            java.lang.String r10 = "crop"
            defpackage.z68.g(r9, r10, r8)
            int r8 = defpackage.qad.z
            java.lang.String r8 = r7.getString(r8)
            defpackage.hi7.b0(r2, r7, r8)
            r7.finish()
            goto L_0x018f
        L_0x014b:
            r0 = 3
            if (r8 != r0) goto L_0x018f
            if (r9 != r3) goto L_0x018f
            java.lang.String r8 = "photo_editor:result_uri"
            android.os.Parcelable r8 = r10.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r9 = "photo_editor:editor_state"
            android.os.Parcelable r9 = r10.getParcelableExtra(r9)
            h05 r9 = (defpackage.h05) r9
            z0a r10 = r7.M0
            dfb r0 = r10.z
            if (r0 == 0) goto L_0x016b
            kwd r0 = r0.c()
            goto L_0x0170
        L_0x016b:
            kwd r0 = new kwd
            r0.<init>()
        L_0x0170:
            r0.e = r8
            r0.d = r9
            dfb r9 = r0.c()
            r10.z = r9
            r10.a0()
            t0a r9 = new t0a
            r0 = 0
            r9.<init>(r10, r0)
            r10.c0(r9)
            if (r1 == 0) goto L_0x018f
            k02 r9 = new k02
            r9.<init>(r1, r8)
            r7.T0 = r9
        L_0x018f:
            r7.i0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.H(int, int, android.content.Intent):void");
    }

    public final void J() {
        Intent intent = getIntent();
        if (intent != null && !intent.getBooleanExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false)) {
            super.J();
        }
    }

    public final scf K0() {
        if (this.S0 == null) {
            this.S0 = q09.f0;
        }
        return this.S0;
    }

    public final void N(Set set) {
        i0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.messages.media.mediabar.FrgLocalMedia X() {
        /*
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.G0
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x001d
        L_0x0007:
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L_0x0005
            java.util.ArrayList r2 = r4.z0
            int r3 = r2.size()
            int r3 = r3 + -1
            if (r0 > r3) goto L_0x0005
            java.lang.Object r0 = r2.get(r0)
            d48 r0 = (defpackage.d48) r0
        L_0x001d:
            if (r0 == 0) goto L_0x0028
            it8 r4 = r4.D0
            long r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r4 = r4.H(r0)
            return r4
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.X():ru.ok.messages.media.mediabar.FrgLocalMedia");
    }

    public final void Y() {
        z68.a("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: onStart");
        if (this.J0.getVisibility() != 0) {
            z68.a("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: bottom visible");
            if (this.C0.a) {
                this.J0.O(false);
            }
            e0();
        }
        if (((Toolbar) this.H0.c).getVisibility() != 0) {
            z68.a("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: top visible");
            this.H0.m(0);
        }
    }

    public final h48 Z() {
        return ((qra) ((id3) this.x.b)).s();
    }

    public final ju8 a() {
        if (this.O0 == null) {
            this.O0 = ((qra) ((id3) this.x.b)).t().q(nu8.c, new z50(true, false, false), (jv7) null);
        }
        return this.O0;
    }

    public final void a0() {
        ArrayList arrayList = this.z0;
        if (arrayList.size() != 0) {
            int max = Math.max(this.A0, 0);
            this.A0 = max;
            if (max >= arrayList.size()) {
                this.A0 = arrayList.size() - 1;
            }
            this.M0.X((d48) arrayList.get(this.A0));
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        this.E0 = z;
        mq4 mq4 = this.L0;
        if (mq4 != null && !mq4.f()) {
            this.L0.dispose();
            this.L0 = null;
        }
        if (!z) {
            k0(z3);
            hd8.B(this);
            this.L0 = y64.C(100, new g6(this, 5));
        } else if (!this.F0) {
            M(this);
            getWindow().getDecorView().post(new g6(this, 4));
            if (StringsKt__StringsJVMKt.equals(Build.BRAND, "meizu", true)) {
                k0(z3);
            }
        } else {
            k0(z3);
        }
    }

    public final void b0(boolean z, boolean z2) {
        if (z) {
            ((m48) this.O0).u(1.0f);
            if (z2) {
                int i = qad.P8;
                Toast toast = this.Q0;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(this, i, 0);
                this.Q0 = makeText;
                makeText.show();
                return;
            }
            return;
        }
        ((m48) this.O0).w();
        if (z2) {
            int i2 = qad.N8;
            Toast toast2 = this.Q0;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast makeText2 = Toast.makeText(this, i2, 0);
            this.Q0 = makeText2;
            makeText2.show();
        }
    }

    public final void c() {
        b(!this.E0, true, false);
    }

    public final boolean d() {
        return this.E0;
    }

    public final void d0(cl4 cl4) {
        ArrayList arrayList = this.z0;
        if (!arrayList.isEmpty()) {
            if (Z().f.c() == 0 && !this.C0.b && X() != null) {
                this.M0.Z();
            }
            Intent intent = new Intent();
            intent.putExtra("act:local_medias:send_result", (Parcelable) arrayList.get(this.A0));
            intent.putExtra("act:local_medias:delayed_attrs", cl4);
            setResult(-1, intent);
            if (this.C0.a) {
                sqd sqd = Z().f;
                sqd.getClass();
                Iterator it = new ArrayList(sqd.a).iterator();
                while (it.hasNext()) {
                    ((uqd) it.next()).e = false;
                }
                super.finish();
                return;
            }
            D();
        }
    }

    public final void e() {
        if (Intrinsics.areEqual((Object) this.B0, (Object) "SELECTED_MEDIA_ALBUM")) {
            D();
        } else {
            i0();
        }
    }

    public final void e0() {
        MediaBarPreviewLayout mediaBarPreviewLayout = this.J0;
        if (mediaBarPreviewLayout == null) {
            return;
        }
        if (this.C0.a) {
            i6 i6Var = new i6(this, 0);
            WeakHashMap weakHashMap = gag.a;
            v9g.u(mediaBarPreviewLayout, i6Var);
            this.J0.post(new g6(this, 6));
            return;
        }
        View view = this.I0;
        i6 i6Var2 = new i6(this, 1);
        WeakHashMap weakHashMap2 = gag.a;
        v9g.u(view, i6Var2);
        this.J0.post(new g6(this, 7));
    }

    public final void f0(Uri uri, File file, Uri uri2, File file2, d44 d44) {
        Uri fromFile = Uri.fromFile(file);
        Uri fromFile2 = file2 != null ? Uri.fromFile(file2) : null;
        Intent intent = new Intent(this, ActTamCropImage.class);
        intent.putExtra("ru.ok.tamtam.extra.SOURCE_URI", uri);
        intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", fromFile);
        intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI", uri2);
        intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", fromFile2);
        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", d44);
        intent.putExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
        startActivityForResult(intent, 2);
    }

    public final void finish() {
        ((qra) ((id3) this.x.b)).w().f(jgd.CHAT_ATTACH_PICKER, h8b.e);
        sqd sqd = Z().f;
        sqd.getClass();
        Iterator it = new ArrayList(sqd.a).iterator();
        while (it.hasNext()) {
            ((uqd) it.next()).e = false;
        }
        MediaBarPreviewLayout mediaBarPreviewLayout = this.J0;
        Pair<Integer, Integer> scrollPosition = mediaBarPreviewLayout != null ? mediaBarPreviewLayout.getScrollPosition() : new Pair<>(0, 0);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_POSITION", (Serializable) scrollPosition.first);
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_OFFSET", (Serializable) scrollPosition.second);
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT", this.T0);
        setResult(0, intent);
        super.finish();
    }

    public final void g(CharSequence charSequence) {
        Z().f.j = charSequence;
    }

    public final void i0() {
        this.J0.Q();
        e0();
    }

    public final ju8 j() {
        if (this.P0 == null) {
            this.P0 = ((qra) ((id3) this.x.b)).t().q(nu8.a, new z50(false, true, true), (jv7) null);
        }
        return this.P0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r5 = (defpackage.wk6) r3.g.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0(int r6) {
        /*
            r5 = this;
            b33 r0 = r5.H0
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r6 = r6 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = defpackage.jad.E
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = r5.B0
            java.lang.String r4 = "SELECTED_MEDIA_ALBUM"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0025
            it8 r5 = r5.D0
            java.util.List r5 = r5.v0
            int r5 = r5.size()
            goto L_0x004d
        L_0x0025:
            h48 r3 = r5.Z()
            java.lang.String r5 = r5.B0
            r3.getClass()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x003b
            sqd r5 = r3.f
            int r5 = r5.c()
            goto L_0x004d
        L_0x003b:
            r4 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r5 = r4
            goto L_0x004d
        L_0x0040:
            java.util.Map r3 = r3.g
            java.lang.Object r5 = r3.get(r5)
            wk6 r5 = (defpackage.wk6) r5
            if (r5 != 0) goto L_0x004b
            goto L_0x003e
        L_0x004b:
            int r5 = r5.b
        L_0x004d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r2, r5}
            java.lang.String r6 = "%d %s %d"
            java.lang.String r5 = java.lang.String.format(r1, r6, r5)
            r0.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.j0(int):void");
    }

    public final void k(uqd uqd) {
        i0();
    }

    public final void k0(boolean z) {
        ch d = ((qra) ((id3) this.x.b)).d();
        b33 b33 = this.H0;
        boolean z2 = this.E0;
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            if (z2) {
                d.i(toolbar);
            } else {
                d.g(toolbar);
            }
        }
        if (this.E0) {
            e3a e3a = (e3a) this.M0.a;
            ecg a = gag.a((View) e3a.c);
            b3a b3a = new b3a(e3a, 1);
            WeakReference weakReference = a.a;
            View view = (View) weakReference.get();
            if (view != null) {
                view.animate().withStartAction(b3a);
            }
            a.a(1.0f);
            b3a b3a2 = new b3a(e3a, 0);
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.animate().withEndAction(b3a2);
            }
            a.c(e3a.o.a.b());
            View view3 = (View) weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        } else {
            e3a e3a2 = (e3a) this.M0.a;
            e3a2.c0((View) e3a2.c, false);
        }
        if (this.C0.a) {
            if (this.E0) {
                d.i(this.J0);
            } else {
                d.g(this.J0);
            }
        }
        it8 it8 = this.D0;
        if (it8 != null) {
            for (WeakReference weakReference2 : it8.x0.values()) {
                FrgLocalMedia frgLocalMedia = (FrgLocalMedia) weakReference2.get();
                if (frgLocalMedia != null) {
                    frgLocalMedia.j3();
                }
            }
        }
    }

    public final void n() {
        int ordinal = ((uk2) this.U0.getValue()).ordinal();
        if (ordinal == 0) {
            d0((cl4) null);
        } else if (ordinal == 1) {
            ed6 v = v();
            ued ued = new ued(0, (Object) null, new h6(0, this));
            ad6 ad6 = (ad6) v.m.remove("ScheduledSendPickerDialogFragment:ru.ok.messages.media.mediabar.ActLocalMedias:result");
            if (ad6 != null) {
                ad6.a.b(ad6.c);
            }
            v.g0("ScheduledSendPickerDialogFragment:ru.ok.messages.media.mediabar.ActLocalMedias:result", this, new uq(8, ued));
            ScheduledSendPickerDialogFragment.f3(v(), "ru.ok.messages.media.mediabar.ActLocalMedias");
        }
    }

    public final void onBackPressed() {
        if (!this.C0.X) {
            Z().f.a();
        }
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b33 b33 = this.H0;
        if (b33 != null) {
            b33.c();
        }
        e0();
        hr7 hr7 = this.K0;
        hr7.getClass();
        int i = configuration.orientation;
        if (i != hr7.c) {
            hr7.c = i;
            hr7.b.v = 0;
        }
        y64.C(300, new g6(this, 0));
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.O0 = a();
        this.P0 = j();
        if (bundle2 != null) {
            m48 m48 = (m48) this.O0;
            m48.h = bundle2.getFloat(m48.b("MediaPlayerController.Volume"));
            m48.i = bundle2.getBoolean(m48.b("MediaPlayerController.Looping"));
            m48.j = bundle2.getBoolean(m48.b("MediaPlayerController.PlayWhenReady"));
            m48 m482 = (m48) this.P0;
            m482.h = bundle2.getFloat(m482.b("MediaPlayerController.Volume"));
            m482.i = bundle2.getBoolean(m482.b("MediaPlayerController.Looping"));
            m482.j = bundle2.getBoolean(m482.b("MediaPlayerController.PlayWhenReady"));
        }
        this.H0 = T(ujc.act_local_medias);
        if (!n54.f(this)) {
            finish();
            return;
        }
        this.K0 = new hr7(2, getWindow().getDecorView(), this);
        getLifecycle().a(this.K0);
        this.C0 = (a48) getIntent().getParcelableExtra("ru.ok.tamtam.extra.OPTIONS");
        L(K0().M);
        this.H0.i(new x4(4, (Object) this));
        this.H0.g(nad.u);
        this.H0.h(this.S0.x);
        b33 b33 = this.H0;
        int i = this.S0.O;
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            toolbar.setBackgroundColor(i);
        }
        b33 b332 = this.H0;
        int i2 = this.S0.G;
        TextView textView = (TextView) b332.w;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        b33 b333 = this.H0;
        int i3 = ((ro4) this.x.c).a;
        Toolbar toolbar2 = (Toolbar) b333.c;
        if (toolbar2 != null) {
            WeakHashMap weakHashMap = gag.a;
            v9g.s(toolbar2, (float) i3);
        }
        a48 a48 = this.C0;
        this.B0 = a48.v;
        if (bundle2 == null) {
            this.A0 = a48.x;
        } else {
            this.A0 = bundle2.getInt("ru.ok.tamtam.extra.SELECTED_POS", 0);
            this.E0 = bundle2.getBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", true);
        }
        ArrayList arrayList = this.z0;
        arrayList.addAll(Z().a(this.B0));
        MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) findViewById(lic.act_local_medias__preview);
        this.J0 = mediaBarPreviewLayout;
        mediaBarPreviewLayout.setShouldApplyHighlight(Intrinsics.areEqual((Object) this.B0, (Object) "SELECTED_MEDIA_ALBUM"));
        this.J0.setMessageEdit(this.C0.b);
        this.J0.setFullScreen(true);
        this.J0.setListener(this);
        this.J0.H0.setVisibility(8);
        this.J0.setChatMode((uk2) this.U0.getValue());
        MediaBarPreviewLayout mediaBarPreviewLayout2 = this.J0;
        ((qra) ((id3) this.x.b)).y().b.getClass();
        mediaBarPreviewLayout2.setAnimojisEnabled(ryg.h(Collections.emptySet(), hj.a));
        if (!this.C0.a) {
            this.J0.setVisibility(8);
        }
        View findViewById = findViewById(lic.act_local_medias__fl_root);
        this.N0 = new e3a(findViewById.getContext(), (ViewStub) findViewById.findViewById(lic.act_local_medias__vs_toolbox), ((qra) ((id3) this.x.b)).d());
        e3a e3a = this.N0;
        a48 a482 = this.C0;
        boolean z = a482.a;
        qra qra = (qra) ((id3) this.x.b);
        nd c = qra.c();
        sqd sqd = qra.s().f;
        po5 p = qra.p();
        z3a z3a = new z3a(2, this);
        m95 o = qra.o();
        y3g p2 = qra.y().c.p();
        z0a z0a = r0;
        z0a z0a2 = new z0a(e3a, this, z, a482.c, c, sqd, p, z3a, o, p2);
        this.M0 = z0a;
        this.I0 = findViewById(lic.act_local_medias__vs_toolbox);
        i0();
        a0();
        this.G0 = (ViewPager2) findViewById(lic.act_local_medias__view_pager);
        this.D0 = new it8(this, arrayList, this.C0);
        this.G0.b(this.V0);
        this.G0.setOffscreenPageLimit(2);
        this.G0.setAdapter(this.D0);
        if (cvg.c(this.B0, "SELECTED_MEDIA_ALBUM")) {
            this.G0.b(new k6(this, 1));
            uqd j = Z().f.j(this.A0);
            if (j != null) {
                j.e = true;
            }
        }
        this.G0.e(this.A0, false);
        j0(this.A0);
        i0();
        MediaBarPreviewLayout mediaBarPreviewLayout3 = this.J0;
        a48 a483 = this.C0;
        int i4 = a483.Y;
        RecyclerView recyclerView = mediaBarPreviewLayout3.I0;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).m1(i4, a483.Z);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.WITH_TRANSITION", false)) {
            this.H0.m(4);
            ydd ydd = ydd.m;
            ydd ydd2 = ydd.p;
            TransitionSet b = nv4.b(ydd, ydd2);
            Rect rect = this.C0.y;
            if (rect != null) {
                b.addTransition(new e33(rect, true));
            }
            b.addTransition(new nv4(ydd, ydd2));
            setEnterSharedElementCallback(new l6(this, rect));
            b.addListener(new m6(0, this));
            b.setDuration(((qra) ((id3) this.x.b)).d().a.b());
            getWindow().setSharedElementEnterTransition(b);
            postponeEnterTransition();
            ViewPager2 viewPager2 = this.G0;
            g6 g6Var = new g6(this, 2);
            ViewTreeObserver viewTreeObserver = viewPager2.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ddg(viewTreeObserver, g6Var));
            TransitionSet b2 = nv4.b(ydd2, ydd);
            if (rect != null) {
                b2.addTransition(new e33(rect, false));
            }
            b2.setDuration(((qra) ((id3) this.x.b)).d().a.b());
            getWindow().setSharedElementReturnTransition(b2);
        } else {
            Y();
        }
        M((View.OnSystemUiVisibilityChangeListener) null);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.O0 != null) {
            ((qra) ((id3) this.x.b)).t().w(this.O0);
        }
        if (this.P0 != null) {
            ((qra) ((id3) this.x.b)).t().w(this.P0);
        }
        ViewPager2 viewPager2 = this.G0;
        if (viewPager2 != null) {
            viewPager2.g(this.V0);
        }
        Toast toast = this.Q0;
        if (toast != null) {
            toast.cancel();
        }
    }

    @oye
    public void onEvent(i48 i48) {
        int i;
        if (!i48.b.equals(this.B0)) {
            return;
        }
        if (!this.Z) {
            ryg.S(this.v0, i48, true);
            return;
        }
        List a = Z().a(this.B0);
        if (a.size() == 0) {
            finish();
            return;
        }
        ArrayList arrayList = this.z0;
        if (a.size() != arrayList.size()) {
            i0();
            if (this.A0 < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                arrayList.addAll(a);
                it8 it8 = new it8(this, arrayList, this.C0);
                this.D0 = it8;
                this.G0.setAdapter(it8);
                int i2 = this.A0;
                if (i2 >= a.size()) {
                    i = a.size() - 1;
                } else if (arrayList2.size() + 1 == a.size()) {
                    i = i2 + 1;
                } else {
                    d48 d48 = (d48) CollectionsKt.getOrNull(arrayList2, i2);
                    if (d48 == null || (i = CollectionsKt___CollectionsKt.indexOfFirst(a, new l(1, d48))) == -1) {
                        i = 0;
                    }
                }
                this.A0 = i;
                this.G0.setCurrentItem(i);
                a0();
                j0(this.A0);
            }
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.O0 != null) {
            ((qra) ((id3) this.x.b)).t().s(this.O0);
        }
        if (this.P0 != null) {
            ((qra) ((id3) this.x.b)).t().s(this.P0);
        }
    }

    public final void onResume() {
        d48 d48;
        super.onResume();
        ((qra) ((id3) this.x.b)).w().f(jgd.CHAT_ATTACH_PICKER_MEDIA_VIEWER, h8b.e);
        e0();
        if (this.O0 != null) {
            ((qra) ((id3) this.x.b)).t().o(this.O0);
        }
        if (this.P0 != null) {
            ((qra) ((id3) this.x.b)).t().o(this.P0);
        }
        if (!this.R0) {
            b(this.E0, false, false);
        }
        this.R0 = false;
        ArrayList arrayList = this.z0;
        if (arrayList.size() != 0 && (d48 = (d48) arrayList.get(this.A0)) != null) {
            FrgLocalMedia H = this.D0.H(d48.b);
            if (H instanceof FrgLocalVideo) {
                ((FrgLocalVideo) H).l3();
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.A0);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", this.E0);
        wie wie = new wie(6, (Object) bundle);
        ju8 ju8 = this.O0;
        if (ju8 != null) {
            ((m48) ju8).q(wie);
        }
        ju8 ju82 = this.P0;
        if (ju82 != null) {
            ((m48) ju82).q(wie);
        }
    }

    public final void onStart() {
        super.onStart();
        sqd sqd = Z().f;
        sqd.c.add(this);
        sqd.g.add(this);
        z0a z0a = this.M0;
        d48 d48 = z0a.o;
        if (d48 != null) {
            z0a.X(d48);
        }
        sqd sqd2 = z0a.Y;
        sqd2.c.add(z0a);
        sqd2.d.add(z0a);
        sqd2.f.add(z0a);
    }

    public final void onStop() {
        super.onStop();
        sqd sqd = Z().f;
        sqd.c.remove(this);
        sqd.g.remove(this);
        z0a z0a = this.M0;
        sqd sqd2 = z0a.Y;
        sqd2.c.remove(z0a);
        sqd2.d.remove(z0a);
        sqd2.f.remove(z0a);
        jbd.c(z0a.z0);
        jbd.c(z0a.A0);
    }

    public final void onSystemUiVisibilityChange(int i) {
        boolean z = i == 0 || i == 2;
        this.F0 = z;
        if (this.E0 && z) {
            this.L0 = y64.C(100, new g6(this, 3));
        }
    }

    public final ju8 p() {
        z68.e("ru.ok.messages.media.mediabar.ActLocalMedias", "ActLocalMedias is only for gif/video");
        return ((qra) ((id3) this.x.b)).t().r(nu8.b);
    }

    public final void q(d48 d48, View view, int i, float[] fArr) {
        if (Intrinsics.areEqual((Object) this.C0.v, (Object) "SELECTED_MEDIA_ALBUM")) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.z0;
                if (i2 >= arrayList.size()) {
                    return;
                }
                if (((d48) arrayList.get(i2)).b == d48.b) {
                    this.G0.e(i2, true);
                    this.J0.N(i);
                    return;
                }
                i2++;
            }
        } else {
            Pair<Integer, Integer> scrollPosition = this.J0.getScrollPosition();
            o5h o5h = ((qra) ((id3) this.x.b)).y().c.u() ? new o5h(view, (Object) null, fArr) : null;
            z38 a = a48.a();
            a.d = "SELECTED_MEDIA_ALBUM";
            a.f = i;
            a.a = true;
            a.b = this.C0.b;
            a.j = ((Integer) scrollPosition.first).intValue();
            a.k = ((Integer) scrollPosition.second).intValue();
            a.e = d48.a();
            g0(this, d48, o5h, a, (uk2) null);
            y64.C(((qra) ((id3) this.x.b)).d().a.b(), new g6(this, 1));
        }
    }

    public final b33 q1() {
        return this.H0;
    }
}
