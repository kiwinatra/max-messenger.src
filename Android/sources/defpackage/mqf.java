package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.opengl.GLES20;
import android.provider.MediaStore;
import android.util.Pair;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlin.uuid.Uuid;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;
import ru.ok.messages.messages.panels.widgets.ChatTopPanelViewImpl;

/* renamed from: mqf  reason: default package */
public class mqf implements v2f, ds6, hgd, cnd, dnd {
    public static final /* synthetic */ int x = 0;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object o;
    public Object v;
    public Object w;

    public /* synthetic */ mqf(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.v = obj2;
        this.w = bArr;
        this.c = objArr;
        this.b = i;
    }

    public static /* synthetic */ void A(mqf mqf, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = mqf.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        mqf.z(i, str, str2);
        throw null;
    }

    public void B(byte b2, boolean z) {
        String L = m58.L(b2);
        int i = z ? this.b - 1 : this.b;
        int i2 = this.b;
        String str = (String) this.c;
        A(this, rae.p("Expected ", L, ", but had '", (i2 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, (String) null, 4);
        throw null;
    }

    public int C(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        A(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6);
        throw null;
    }

    public View D(int i) {
        return ((RecyclerView) ((u6h) this.o).b).getChildAt(F(i));
    }

    public int E() {
        return ((RecyclerView) ((u6h) this.o).b).getChildCount() - ((ArrayList) this.w).size();
    }

    public int F(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((u6h) this.o).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            jz2 jz2 = (jz2) this.v;
            int Q = i - (i2 - jz2.Q(i2));
            if (Q == 0) {
                while (jz2.S(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += Q;
        }
        return -1;
    }

    public String G(String str) {
        HashMap hashMap = (HashMap) this.v;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = ((ArrayList) this.w).iterator();
            while (true) {
                if (it.hasNext()) {
                    qu1 g = ((qu1) it.next()).g();
                    bs0.m("CameraInfo doesn't contain Camera2 implementation.", g instanceof as1);
                    if (str2.equals(((as1) ((as1) g).c.b).a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public View H(int i) {
        return ((RecyclerView) ((u6h) this.o).b).getChildAt(i);
    }

    public int I() {
        return ((RecyclerView) ((u6h) this.o).b).getChildCount();
    }

    public void J(View view) {
        ((ArrayList) this.w).add(view);
        u6h u6h = (u6h) this.o;
        u6h.getClass();
        pzc V = RecyclerView.V(view);
        if (V != null) {
            int i = V.z0;
            View view2 = V.a;
            if (i != -1) {
                V.y0 = i;
            } else {
                WeakHashMap weakHashMap = gag.a;
                V.y0 = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) u6h.b;
            if (recyclerView.b0()) {
                V.z0 = 4;
                recyclerView.D1.add(V);
                return;
            }
            WeakHashMap weakHashMap2 = gag.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean K(mqf mqf, int i) {
        return mqf != null && t0g.a(((r1d[]) this.o)[i], ((r1d[]) mqf.o)[i]) && t0g.a(((ld5[]) this.v)[i], ((ld5[]) mqf.v)[i]);
    }

    public boolean L(mqf mqf, int i) {
        return mqf != null && v0g.a(((s1d[]) this.o)[i], ((s1d[]) mqf.o)[i]) && v0g.a(((md5[]) this.v)[i], ((md5[]) mqf.v)[i]);
    }

    public boolean M(View view) {
        return ((ArrayList) this.w).contains(view);
    }

    public boolean N(int i) {
        switch (this.a) {
            case 0:
                return ((r1d[]) this.o)[i] != null;
            default:
                return ((s1d[]) this.o)[i] != null;
        }
    }

    public byte O() {
        int i = this.b;
        while (true) {
            int Q = Q(i);
            if (Q != -1) {
                char charAt = ((String) this.c).charAt(Q);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i = Q + 1;
                } else {
                    this.b = Q;
                    return m58.g(charAt);
                }
            } else {
                this.b = Q;
                return 10;
            }
        }
    }

    public String P(boolean z) {
        String str;
        byte O = O();
        if (z) {
            if (O != 1 && O != 0) {
                return null;
            }
            str = u();
        } else if (O != 1) {
            return null;
        } else {
            str = t();
        }
        this.v = str;
        return str;
    }

    public int Q(int i) {
        if (i < ((String) this.c).length()) {
            return i;
        }
        return -1;
    }

    public synchronized void R(gs6 gs6, long j) {
        try {
            if (this.b > 0) {
                ((gy0) this.w).v(new yd6(this, gs6, j));
                this.b--;
            } else {
                ((ArrayDeque) this.c).add(Pair.create(gs6, Long.valueOf(j)));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void S(int i) {
        u6h u6h = (u6h) this.o;
        int i2 = this.b;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i2 != 2) {
            try {
                int F = F(i);
                View childAt = ((RecyclerView) u6h.b).getChildAt(F);
                if (childAt == null) {
                    this.b = 0;
                    this.c = null;
                    return;
                }
                this.b = 1;
                this.c = childAt;
                if (((jz2) this.v).Z(F)) {
                    a0(childAt);
                }
                u6h.q(F);
                this.b = 0;
                this.c = null;
            } catch (Throwable th) {
                this.b = 0;
                this.c = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public void T() {
        or2 or2;
        ArrayList arrayList = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    or2 = null;
                    break;
                }
                or2 = (or2) it.next();
                if (!or2.e) {
                    if (or2.c) {
                        break;
                    }
                } else {
                    return;
                }
            }
            or2 or22 = (or2 != null || arrayList.isEmpty()) ? or2 : (or2) arrayList.get(0);
            if (or22 != null) {
                or22.e = true;
                AnimatorSet animatorSet = (AnimatorSet) this.w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                View view = or22.a;
                int paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + or22.b;
                ChatTopPanelViewImpl chatTopPanelViewImpl = (ChatTopPanelViewImpl) this.o;
                MiniPlayerView miniPlayerView = chatTopPanelViewImpl.getMiniPlayerView();
                boolean z = miniPlayerView != null && miniPlayerView.getVisibility() == 0;
                RecyclerView rvPanels = chatTopPanelViewImpl.getRvPanels();
                boolean z2 = rvPanels != null && rvPanels.getVisibility() == 0;
                mqf mqf = or22.f;
                boolean z3 = (z && (((ChatTopPanelViewImpl) mqf.o).getRvPanels() == view || ((ChatTopPanelViewImpl) mqf.o).getAddOrBlockView() == view)) || (z2 && ((ChatTopPanelViewImpl) mqf.o).getAddOrBlockView() == view);
                int i = this.b;
                boolean z4 = or22.c;
                boolean z5 = or22.d;
                if (z4) {
                    if (!z3) {
                        int i2 = ((ViewGroup.MarginLayoutParams) ((View) this.v).getLayoutParams()).topMargin;
                        int i3 = i2 + paddingBottom;
                        if (z5) {
                            kr2 kr2 = new kr2(this, view, 0);
                            Objects.requireNonNull(chatTopPanelViewImpl);
                            ms1 ms1 = new ms1(18, chatTopPanelViewImpl);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) (-paddingBottom), 0.0f});
                            ofFloat.setDuration(200);
                            ofFloat.addUpdateListener(new z00(6, (Object) ms1));
                            nr2 nr2 = r0;
                            ValueAnimator valueAnimator = ofFloat;
                            ms1 ms12 = ms1;
                            int i4 = i3;
                            nr2 nr22 = new nr2(this, kr2, ms12, c44.DEFAULT_ASPECT_RATIO, (Runnable) null, or22);
                            valueAnimator.addListener(nr2);
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i4});
                            ofInt.addUpdateListener(new z00(5, (Object) this));
                            ofInt.addListener(new mr2(this, i4, 0));
                            Animator[] animatorArr = {valueAnimator, ofInt};
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.setDuration(200);
                            animatorSet2.playTogether(animatorArr);
                            this.w = animatorSet2;
                            chatTopPanelViewImpl.postOnAnimation(new pr1(14, this));
                            return;
                        }
                        b0(true, or22, view, i3);
                        return;
                    }
                    int i5 = ((ViewGroup.MarginLayoutParams) ((View) this.v).getLayoutParams()).topMargin;
                    int i6 = (i5 + paddingBottom) - i;
                    if (z5) {
                        float f = (float) ((-paddingBottom) + i);
                        view.setVisibility(0);
                        view.setTranslationY(f);
                        float f2 = (float) 0;
                        kr2 kr22 = new kr2(this, view, 3);
                        lr2 lr2 = new lr2(view);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f, f2});
                        ofFloat2.setDuration(200);
                        ofFloat2.addUpdateListener(new z00(6, (Object) lr2));
                        ofFloat2.addListener(new nr2(this, kr22, lr2, f2, (Runnable) null, or22));
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{i5, i6});
                        ofInt2.addUpdateListener(new z00(5, (Object) this));
                        ofInt2.addListener(new mr2(this, i6, 0));
                        Animator[] animatorArr2 = {ofFloat2, ofInt2};
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.setDuration(200);
                        animatorSet3.playTogether(animatorArr2);
                        this.w = animatorSet3;
                        chatTopPanelViewImpl.postOnAnimation(new pr1(14, this));
                        return;
                    }
                    b0(true, or22, view, i6);
                } else if (!z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) ((View) this.v).getLayoutParams()).topMargin;
                    int i8 = i7 - paddingBottom;
                    if (z5) {
                        float f3 = (float) (-paddingBottom);
                        kr2 kr23 = new kr2(this, view, 2);
                        Objects.requireNonNull(chatTopPanelViewImpl);
                        ms1 ms13 = new ms1(18, chatTopPanelViewImpl);
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, f3});
                        ofFloat3.setDuration(200);
                        ofFloat3.addUpdateListener(new z00(6, (Object) ms13));
                        ofFloat3.addListener(new nr2(this, (Runnable) null, ms13, f3, kr23, or22));
                        ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{i7, i8});
                        ofInt3.addUpdateListener(new z00(5, (Object) this));
                        ofInt3.addListener(new mr2(this, i8, 0));
                        Animator[] animatorArr3 = {ofFloat3, ofInt3};
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        animatorSet4.setDuration(200);
                        animatorSet4.playTogether(animatorArr3);
                        this.w = animatorSet4;
                        chatTopPanelViewImpl.postOnAnimation(new pr1(14, this));
                        return;
                    }
                    b0(false, or22, view, i8);
                } else {
                    int i9 = ((ViewGroup.MarginLayoutParams) ((View) this.v).getLayoutParams()).topMargin;
                    int i10 = (((ViewGroup.MarginLayoutParams) ((View) this.v).getLayoutParams()).topMargin - paddingBottom) + i;
                    if (z5) {
                        float f4 = (float) (-i);
                        float f5 = (float) (-paddingBottom);
                        view.setTranslationY(f4);
                        kr2 kr24 = new kr2(this, view, 1);
                        lr2 lr22 = new lr2(view);
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4, f5});
                        ofFloat4.setDuration(200);
                        ofFloat4.addUpdateListener(new z00(6, (Object) lr22));
                        ofFloat4.addListener(new nr2(this, (Runnable) null, lr22, f5, kr24, or22));
                        ValueAnimator ofInt4 = ValueAnimator.ofInt(new int[]{i9, i10});
                        ofInt4.addUpdateListener(new z00(5, (Object) this));
                        ofInt4.addListener(new mr2(this, i10, 0));
                        Animator[] animatorArr4 = {ofFloat4, ofInt4};
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        animatorSet5.setDuration(200);
                        animatorSet5.playTogether(animatorArr4);
                        this.w = animatorSet5;
                        chatTopPanelViewImpl.postOnAnimation(new pr1(14, this));
                        return;
                    }
                    b0(false, or22, view, i10);
                }
            }
        }
    }

    public void U(int i, View view, boolean z) {
        or2 or2;
        z68.c("mqf", "scheduleHide: view %s animate %b", view.getClass().getSimpleName(), Boolean.valueOf(z));
        Iterator it = ((ArrayList) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                or2 = null;
                break;
            }
            or2 = (or2) it.next();
            if (or2.a == view) {
                break;
            }
        }
        ArrayList arrayList = (ArrayList) this.c;
        if (or2 != null) {
            if (!or2.c) {
                return;
            }
            if (!or2.e) {
                arrayList.remove(or2);
            }
        }
        if (view.getVisibility() != 8) {
            arrayList.add(new or2(this, view, i, false, z));
        }
    }

    public synchronized void V() {
        try {
            if (!((ArrayDeque) this.c).isEmpty()) {
                ((ArrayDeque) this.c).add(Pair.create(gs6.e, Long.MIN_VALUE));
            } else {
                fs6 fs6 = (fs6) this.v;
                Objects.requireNonNull(fs6);
                ((gy0) this.w).v(new bz1(fs6, 1));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public int W() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.c;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.b = i;
            } else {
                i++;
            }
        }
        this.b = i;
        return i;
    }

    public boolean X() {
        int W = W();
        String str = (String) this.c;
        if (W >= str.length() || W == -1 || str.charAt(W) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean Y(boolean z) {
        int Q = Q(W());
        String str = (String) this.c;
        int length = str.length() - Q;
        if (length < 4 || Q == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(Q + i)) {
                return false;
            }
        }
        if (length > 4 && m58.g(str.charAt(Q + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.b = Q + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void Z(char c2) {
        int i = this.b;
        if (i > 0 && c2 == '\"') {
            try {
                this.b = i - 1;
                String u = u();
                this.b = i;
                if (Intrinsics.areEqual((Object) u, (Object) "null")) {
                    z(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        B(m58.g(c2), true);
        throw null;
    }

    public void a(int i, View view, boolean z) {
        u6h u6h = (u6h) this.o;
        int childCount = i < 0 ? ((RecyclerView) u6h.b).getChildCount() : F(i);
        ((jz2) this.v).W(childCount, z);
        if (z) {
            J(view);
        }
        RecyclerView recyclerView = (RecyclerView) u6h.b;
        recyclerView.addView(view, childCount);
        pzc V = RecyclerView.V(view);
        tyc tyc = recyclerView.y0;
        if (!(tyc == null || V == null)) {
            tyc.x(V);
        }
        ArrayList arrayList = recyclerView.O0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((czc) recyclerView.O0.get(size)).d(view);
            }
        }
    }

    public void a0(View view) {
        if (((ArrayList) this.w).remove(view)) {
            u6h u6h = (u6h) this.o;
            u6h.getClass();
            pzc V = RecyclerView.V(view);
            if (V != null) {
                int i = V.y0;
                RecyclerView recyclerView = (RecyclerView) u6h.b;
                if (recyclerView.b0()) {
                    V.z0 = i;
                    recyclerView.D1.add(V);
                } else {
                    WeakHashMap weakHashMap = gag.a;
                    V.a.setImportantForAccessibility(i);
                }
                V.y0 = 0;
            }
        }
    }

    public sq9 b() {
        return (sq9) this.v;
    }

    public void b0(boolean z, or2 or2, View view, int i) {
        ChatTopPanelViewImpl chatTopPanelViewImpl = (ChatTopPanelViewImpl) this.o;
        if (z) {
            view.setVisibility(0);
            chatTopPanelViewImpl.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        chatTopPanelViewImpl.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        iq.O((View) this.v, i);
        ((ArrayList) this.c).remove(or2);
        T();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.ContentResolver r2, android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L_0x0019
            r1.d0(r2)     // Catch:{ all -> 0x0012 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0012 }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            goto L_0x0019
        L_0x0012:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            throw r3
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqf.c(android.content.ContentResolver, android.net.Uri):void");
    }

    public void c0(int i) {
        int[] iArr = (int[]) this.w;
        if (iArr[i] == 0) {
            iArr[i] = 1;
            for (nu6 nu6 : ((nu6[][]) this.v)[i]) {
                c0(nu6.a.b);
                int i2 = this.b;
                this.b = i2 - 1;
                ((nu6[]) this.o)[i2] = nu6;
            }
            iArr[i] = 2;
        }
    }

    public void d(rkf rkf, xf5 xf5, qtf qtf) {
    }

    public void d0(OutputStream outputStream) {
        int i;
        byte[] bArr = new byte[2048];
        int i2 = 0;
        do {
            i = this.b;
            int min = Math.min(2048, i - i2);
            ((e69) this.o).U(i2, 0, min, bArr);
            outputStream.write(bArr, 0, min);
            i2 += min;
        } while (i2 < i);
        outputStream.flush();
    }

    public void e(qkf qkf, wf5 wf5, qtf qtf) {
    }

    public void f(l8b l8b) {
        rkf rkf;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        int i;
        rkf rkf2;
        int i2;
        int i3;
        int i4;
        SparseArray sparseArray2;
        l8b l8b2 = l8b;
        if (l8b.u() == 2) {
            ntf ntf = (ntf) this.c;
            int i5 = ntf.a;
            int i6 = 0;
            List list = ntf.c;
            if (i5 == 1 || i5 == 2 || ntf.w0 == 1) {
                rkf = (rkf) list.get(0);
            } else {
                rkf = new rkf(((rkf) list.get(0)).d());
                list.add(rkf);
            }
            if ((l8b.u() & Uuid.SIZE_BITS) != 0) {
                l8b2.H(1);
                int A = l8b.A();
                int i7 = 3;
                l8b2.H(3);
                ky1 ky1 = (ky1) this.o;
                l8b2.e(0, ky1.b, 2);
                ky1.q(0);
                ky1.t(3);
                ntf.C0 = ky1.i(13);
                l8b2.e(0, ky1.b, 2);
                ky1.q(0);
                ky1.t(4);
                l8b2.H(ky1.i(12));
                kk3 kk3 = ntf.w;
                int i8 = ntf.a;
                if (i8 == 2 && ntf.A0 == null) {
                    stf c2 = kk3.c(21, new g7a(21, (String) null, 0, (ArrayList) null, v0g.f));
                    ntf.A0 = c2;
                    if (c2 != null) {
                        c2.d(rkf, ntf.v0, new qtf(A, 21, (int) ConstantsKt.DEFAULT_BUFFER_SIZE, 1));
                    }
                }
                SparseArray sparseArray3 = (SparseArray) this.v;
                sparseArray3.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.w;
                sparseIntArray.clear();
                int a2 = l8b.a();
                while (true) {
                    sparseBooleanArray = ntf.z;
                    if (a2 <= 0) {
                        break;
                    }
                    l8b2.e(i6, ky1.b, 5);
                    ky1.q(i6);
                    int i9 = ky1.i(8);
                    ky1.t(i7);
                    int i10 = ky1.i(13);
                    ky1.t(4);
                    int i11 = ky1.i(12);
                    int i12 = l8b2.b;
                    int i13 = i12 + i11;
                    int i14 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i15 = 0;
                    ky1 ky12 = ky1;
                    while (l8b2.b < i13) {
                        int u = l8b.u();
                        int u2 = l8b2.b + l8b.u();
                        if (u2 > i13) {
                            break;
                        }
                        rkf rkf3 = rkf;
                        if (u == 5) {
                            long w2 = l8b.w();
                            if (w2 == 1094921523) {
                                i14 = 129;
                            } else if (w2 == 1161904947) {
                                i14 = 135;
                            } else if (w2 != 1094921524) {
                                if (w2 == 1212503619) {
                                    i14 = 36;
                                }
                            }
                            sparseArray2 = sparseArray3;
                            i4 = A;
                            i3 = i10;
                            l8b2.H(u2 - l8b2.b);
                            sparseArray3 = sparseArray2;
                            rkf = rkf3;
                            A = i4;
                            i10 = i3;
                        } else {
                            if (u == 106) {
                                sparseArray2 = sparseArray3;
                                i4 = A;
                                i3 = i10;
                                i14 = 129;
                            } else if (u == 122) {
                                sparseArray2 = sparseArray3;
                                i4 = A;
                                i3 = i10;
                                i14 = 135;
                            } else if (u == 127) {
                                int u3 = l8b.u();
                                if (u3 != 21) {
                                    if (u3 == 14) {
                                        i14 = 136;
                                    } else if (u3 == 33) {
                                        i14 = 139;
                                    }
                                    sparseArray2 = sparseArray3;
                                    i4 = A;
                                    i3 = i10;
                                }
                            } else {
                                if (u == 123) {
                                    sparseArray2 = sparseArray3;
                                    i14 = 138;
                                } else if (u == 10) {
                                    String trim = l8b2.s(3, x22.c).trim();
                                    i15 = l8b.u();
                                    sparseArray2 = sparseArray3;
                                    str = trim;
                                } else {
                                    if (u == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (l8b2.b < u2) {
                                            String trim2 = l8b2.s(3, x22.c).trim();
                                            l8b.u();
                                            SparseArray sparseArray4 = sparseArray3;
                                            byte[] bArr = new byte[4];
                                            l8b2.e(0, bArr, 4);
                                            arrayList2.add(new ptf(bArr, trim2));
                                            sparseArray3 = sparseArray4;
                                            A = A;
                                            i10 = i10;
                                        }
                                        sparseArray2 = sparseArray3;
                                        i4 = A;
                                        i3 = i10;
                                        arrayList = arrayList2;
                                        i14 = 89;
                                    } else {
                                        sparseArray2 = sparseArray3;
                                        i4 = A;
                                        i3 = i10;
                                        if (u == 111) {
                                            i14 = 257;
                                        }
                                    }
                                    l8b2.H(u2 - l8b2.b);
                                    sparseArray3 = sparseArray2;
                                    rkf = rkf3;
                                    A = i4;
                                    i10 = i3;
                                }
                                i4 = A;
                                i3 = i10;
                            }
                            l8b2.H(u2 - l8b2.b);
                            sparseArray3 = sparseArray2;
                            rkf = rkf3;
                            A = i4;
                            i10 = i3;
                        }
                        i14 = 172;
                        sparseArray2 = sparseArray3;
                        i4 = A;
                        i3 = i10;
                        l8b2.H(u2 - l8b2.b);
                        sparseArray3 = sparseArray2;
                        rkf = rkf3;
                        A = i4;
                        i10 = i3;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    rkf rkf4 = rkf;
                    int i16 = A;
                    int i17 = i10;
                    l8b2.G(i13);
                    g7a g7a = new g7a(i14, str, i15, arrayList, Arrays.copyOfRange(l8b2.a, i12, i13));
                    if (i9 == 6 || i9 == 5) {
                        i9 = i14;
                    }
                    a2 -= i11 + 5;
                    int i18 = i8 == 2 ? i9 : i17;
                    if (sparseBooleanArray.get(i18)) {
                        sparseArray3 = sparseArray5;
                    } else {
                        stf c3 = (i8 == 2 && i9 == 21) ? ntf.A0 : kk3.c(i9, g7a);
                        if (i8 == 2) {
                            i2 = i17;
                            if (i2 >= sparseIntArray.get(i18, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
                                sparseArray3 = sparseArray5;
                            }
                        } else {
                            i2 = i17;
                        }
                        sparseIntArray.put(i18, i2);
                        sparseArray3 = sparseArray5;
                        sparseArray3.put(i18, c3);
                    }
                    ky1 = ky12;
                    rkf = rkf4;
                    A = i16;
                    i6 = 0;
                    i7 = 3;
                }
                rkf rkf5 = rkf;
                int i19 = A;
                int size = sparseIntArray.size();
                int i20 = 0;
                while (true) {
                    sparseArray = ntf.y;
                    if (i20 >= size) {
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i20);
                    int valueAt = sparseIntArray.valueAt(i20);
                    sparseBooleanArray.put(keyAt, true);
                    ntf.X.put(valueAt, true);
                    stf stf = (stf) sparseArray3.valueAt(i20);
                    if (stf != null) {
                        if (stf != ntf.A0) {
                            xf5 xf5 = ntf.v0;
                            i = i19;
                            qtf qtf = new qtf(i, keyAt, (int) ConstantsKt.DEFAULT_BUFFER_SIZE, 1);
                            rkf2 = rkf5;
                            stf.d(rkf2, xf5, qtf);
                        } else {
                            rkf2 = rkf5;
                            i = i19;
                        }
                        sparseArray.put(valueAt, stf);
                    } else {
                        rkf2 = rkf5;
                        i = i19;
                    }
                    i20++;
                    rkf5 = rkf2;
                    i19 = i;
                }
                if (i8 != 2) {
                    sparseArray.remove(this.b);
                    int i21 = i8 == 1 ? 0 : ntf.w0 - 1;
                    ntf.w0 = i21;
                    if (i21 == 0) {
                        ntf.v0.v();
                        ntf.x0 = true;
                    }
                } else if (!ntf.x0) {
                    ntf.v0.v();
                    ntf.w0 = 0;
                    ntf.x0 = true;
                }
            }
        }
    }

    public Uri g() {
        return (Uri) this.c;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ni3, java.lang.Object] */
    public Object get() {
        Range range = ((z90) this.v).a;
        y90 y90 = (y90) this.w;
        int x2 = te8.x(156000, y90.c, 2, y90.b, 48000, range);
        ? obj = new Object();
        obj.b = -1;
        String str = (String) this.o;
        if (str != null) {
            obj.a = str;
            obj.b = Integer.valueOf(this.b);
            xjf xjf = (xjf) this.c;
            if (xjf != null) {
                obj.c = xjf;
                obj.f = Integer.valueOf(y90.c);
                obj.e = Integer.valueOf(y90.b);
                obj.d = Integer.valueOf(x2);
                return obj.a();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public Integer getHeight() {
        return null;
    }

    public Integer getWidth() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        if (r28.v() == 21) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.g1g r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r2 = r28.v()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            java.lang.Object r2 = r0.c
            mtf r2 = (defpackage.mtf) r2
            int r4 = r2.a
            r5 = 1
            r6 = 0
            java.util.List r7 = r2.b
            if (r4 == r5) goto L_0x0032
            if (r4 == r3) goto L_0x0032
            int r4 = r2.l
            if (r4 != r5) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            qkf r4 = new qkf
            java.lang.Object r8 = r7.get(r6)
            qkf r8 = (defpackage.qkf) r8
            long r8 = r8.c()
            r4.<init>(r8)
            r7.add(r4)
            goto L_0x0038
        L_0x0032:
            java.lang.Object r4 = r7.get(r6)
            qkf r4 = (defpackage.qkf) r4
        L_0x0038:
            int r7 = r28.v()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x0041
            return
        L_0x0041:
            r1.I(r5)
            int r7 = r28.A()
            r8 = 3
            r1.I(r8)
            java.lang.Object r9 = r0.o
            ky1 r9 = (defpackage.ky1) r9
            byte[] r10 = r9.b
            r1.g(r6, r10, r3)
            r9.q(r6)
            r9.t(r8)
            r10 = 13
            int r11 = r9.i(r10)
            r2.r = r11
            byte[] r11 = r9.b
            r1.g(r6, r11, r3)
            r9.q(r6)
            r11 = 4
            r9.t(r11)
            r12 = 12
            int r13 = r9.i(r12)
            r1.I(r13)
            kk3 r13 = r2.e
            int r14 = r2.a
            r15 = 8192(0x2000, float:1.14794E-41)
            r5 = 0
            r12 = 21
            if (r14 != r3) goto L_0x00a1
            rtf r3 = r2.p
            if (r3 != 0) goto L_0x00a1
            w28 r3 = new w28
            byte[] r11 = defpackage.t0g.f
            r3.<init>((int) r12, (java.lang.String) r5, (java.util.ArrayList) r5, (byte[]) r11)
            rtf r3 = r13.b(r12, r3)
            r2.p = r3
            if (r3 == 0) goto L_0x00a1
            wf5 r11 = r2.k
            qtf r5 = new qtf
            r10 = 0
            r5.<init>((int) r7, (int) r12, (int) r15, (int) r10)
            r3.e(r4, r11, r5)
        L_0x00a1:
            java.lang.Object r3 = r0.v
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            r3.clear()
            java.lang.Object r5 = r0.w
            android.util.SparseIntArray r5 = (android.util.SparseIntArray) r5
            r5.clear()
            int r10 = r28.c()
        L_0x00b3:
            android.util.SparseBooleanArray r11 = r2.g
            if (r10 <= 0) goto L_0x0232
            byte[] r15 = r9.b
            r12 = 5
            r1.g(r6, r15, r12)
            r9.q(r6)
            r15 = 8
            int r15 = r9.i(r15)
            r9.t(r8)
            r6 = 13
            int r8 = r9.i(r6)
            r6 = 4
            r9.t(r6)
            r6 = 12
            int r16 = r9.i(r6)
            int r6 = r1.b
            int r12 = r6 + r16
            r17 = -1
            r19 = r7
            r18 = r9
            r9 = r17
            r0 = 0
            r17 = r4
            r4 = 0
        L_0x00e9:
            int r7 = r1.b
            if (r7 >= r12) goto L_0x01c7
            int r7 = r28.v()
            int r20 = r28.v()
            r21 = r3
            int r3 = r1.b
            int r3 = r3 + r20
            if (r3 <= r12) goto L_0x0104
        L_0x00fd:
            r20 = r5
            r24 = r8
            r8 = 4
            goto L_0x01cb
        L_0x0104:
            r20 = 172(0xac, float:2.41E-43)
            r22 = 135(0x87, float:1.89E-43)
            r23 = 129(0x81, float:1.81E-43)
            r24 = r8
            r8 = 5
            if (r7 != r8) goto L_0x013f
            long r7 = r28.w()
            r25 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r25 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r25 != 0) goto L_0x011d
            r9 = r23
            goto L_0x013a
        L_0x011d:
            r25 = 1161904947(0x45414333, double:5.74057318E-315)
            int r23 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r23 != 0) goto L_0x0127
            r9 = r22
            goto L_0x013a
        L_0x0127:
            r22 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r22 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r22 != 0) goto L_0x0131
        L_0x012e:
            r9 = r20
            goto L_0x013a
        L_0x0131:
            r22 = 1212503619(0x48455643, double:5.990563836E-315)
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L_0x013a
            r9 = 36
        L_0x013a:
            r20 = r5
        L_0x013c:
            r8 = 4
            goto L_0x01b9
        L_0x013f:
            r8 = 106(0x6a, float:1.49E-43)
            if (r7 != r8) goto L_0x0148
            r20 = r5
            r9 = r23
            goto L_0x013c
        L_0x0148:
            r8 = 122(0x7a, float:1.71E-43)
            if (r7 != r8) goto L_0x0151
            r20 = r5
            r9 = r22
            goto L_0x013c
        L_0x0151:
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 != r8) goto L_0x015e
            int r7 = r28.v()
            r8 = 21
            if (r7 != r8) goto L_0x013a
            goto L_0x012e
        L_0x015e:
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L_0x0168
            r7 = 138(0x8a, float:1.93E-43)
            r20 = r5
            r9 = r7
            goto L_0x013c
        L_0x0168:
            r8 = 10
            if (r7 != r8) goto L_0x0178
            java.nio.charset.Charset r0 = defpackage.x22.c
            r7 = 3
            java.lang.String r0 = r1.t(r7, r0)
            java.lang.String r0 = r0.trim()
            goto L_0x013a
        L_0x0178:
            r8 = 89
            if (r7 != r8) goto L_0x01af
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0181:
            int r7 = r1.b
            if (r7 >= r3) goto L_0x01a9
            java.nio.charset.Charset r7 = defpackage.x22.c
            r9 = 3
            java.lang.String r7 = r1.t(r9, r7)
            java.lang.String r7 = r7.trim()
            r28.v()
            r8 = 4
            byte[] r9 = new byte[r8]
            r20 = r5
            r5 = 0
            r1.g(r5, r9, r8)
            otf r5 = new otf
            r5.<init>(r9, r7)
            r4.add(r5)
            r5 = r20
            r8 = 89
            goto L_0x0181
        L_0x01a9:
            r20 = r5
            r8 = 4
            r9 = 89
            goto L_0x01b9
        L_0x01af:
            r20 = r5
            r8 = 4
            r5 = 111(0x6f, float:1.56E-43)
            if (r7 != r5) goto L_0x01b9
            r5 = 257(0x101, float:3.6E-43)
            r9 = r5
        L_0x01b9:
            int r5 = r1.b
            int r3 = r3 - r5
            r1.I(r3)
            r5 = r20
            r3 = r21
            r8 = r24
            goto L_0x00e9
        L_0x01c7:
            r21 = r3
            goto L_0x00fd
        L_0x01cb:
            r1.H(r12)
            w28 r3 = new w28
            byte[] r5 = r1.a
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r12)
            r3.<init>((int) r9, (java.lang.String) r0, (java.util.ArrayList) r4, (byte[]) r5)
            r0 = 6
            if (r15 == r0) goto L_0x01df
            r0 = 5
            if (r15 != r0) goto L_0x01e0
        L_0x01df:
            r15 = r9
        L_0x01e0:
            int r16 = r16 + 5
            int r10 = r10 - r16
            r0 = 2
            if (r14 != r0) goto L_0x01e9
            r4 = r15
            goto L_0x01eb
        L_0x01e9:
            r4 = r24
        L_0x01eb:
            boolean r5 = r11.get(r4)
            if (r5 == 0) goto L_0x01f8
            r6 = r20
            r0 = r21
            r5 = 21
            goto L_0x0221
        L_0x01f8:
            r5 = 21
            if (r14 != r0) goto L_0x0201
            if (r15 != r5) goto L_0x0201
            rtf r3 = r2.p
            goto L_0x0205
        L_0x0201:
            rtf r3 = r13.b(r15, r3)
        L_0x0205:
            r6 = r20
            if (r14 != r0) goto L_0x0217
            r0 = 8192(0x2000, float:1.14794E-41)
            int r7 = r6.get(r4, r0)
            r0 = r24
            if (r0 >= r7) goto L_0x0214
            goto L_0x0219
        L_0x0214:
            r0 = r21
            goto L_0x0221
        L_0x0217:
            r0 = r24
        L_0x0219:
            r6.put(r4, r0)
            r0 = r21
            r0.put(r4, r3)
        L_0x0221:
            r3 = r0
            r12 = r5
            r5 = r6
            r4 = r17
            r9 = r18
            r7 = r19
            r6 = 0
            r8 = 3
            r15 = 8192(0x2000, float:1.14794E-41)
            r0 = r27
            goto L_0x00b3
        L_0x0232:
            r0 = r3
            r17 = r4
            r6 = r5
            r19 = r7
            int r1 = r6.size()
            r5 = 0
        L_0x023d:
            android.util.SparseArray r3 = r2.f
            if (r5 >= r1) goto L_0x0287
            int r4 = r6.keyAt(r5)
            int r7 = r6.valueAt(r5)
            r8 = 1
            r11.put(r4, r8)
            android.util.SparseBooleanArray r9 = r2.h
            r9.put(r7, r8)
            java.lang.Object r8 = r0.valueAt(r5)
            rtf r8 = (defpackage.rtf) r8
            if (r8 == 0) goto L_0x027a
            rtf r9 = r2.p
            if (r8 == r9) goto L_0x0270
            wf5 r9 = r2.k
            qtf r10 = new qtf
            r12 = 0
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
            r10.<init>((int) r13, (int) r4, (int) r15, (int) r12)
            r4 = r17
            r8.e(r4, r9, r10)
            goto L_0x0276
        L_0x0270:
            r4 = r17
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0276:
            r3.put(r7, r8)
            goto L_0x0280
        L_0x027a:
            r4 = r17
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0280:
            int r5 = r5 + 1
            r17 = r4
            r19 = r13
            goto L_0x023d
        L_0x0287:
            r5 = 2
            if (r14 != r5) goto L_0x029a
            boolean r0 = r2.m
            if (r0 != 0) goto L_0x02b6
            wf5 r0 = r2.k
            r0.v()
            r0 = 0
            r2.l = r0
            r1 = 1
            r2.m = r1
            goto L_0x02b6
        L_0x029a:
            r4 = r27
            r0 = 0
            r1 = 1
            int r4 = r4.b
            r3.remove(r4)
            if (r14 != r1) goto L_0x02a7
            r6 = r0
            goto L_0x02ab
        L_0x02a7:
            int r0 = r2.l
            int r6 = r0 + -1
        L_0x02ab:
            r2.l = r6
            if (r6 != 0) goto L_0x02b6
            wf5 r0 = r2.k
            r0.v()
            r2.m = r1
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqf.h(g1g):void");
    }

    public String i() {
        return (String) this.w;
    }

    public Integer j() {
        return Integer.valueOf(this.b);
    }

    public int k(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.b = i;
            if (i2 < charSequence.length()) {
                return k(charSequence, this.b);
            }
            A(this, "Unexpected EOF during unicode escape", 0, (String) null, 6);
            throw null;
        }
        int C = C(charSequence, i + 3);
        ((StringBuilder) this.w).append((char) (C + (C(charSequence, i) << 12) + (C(charSequence, i + 1) << 8) + (C(charSequence, i + 2) << 4)));
        return i2;
    }

    public void l(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        u6h u6h = (u6h) this.o;
        int childCount = i < 0 ? ((RecyclerView) u6h.b).getChildCount() : F(i);
        ((jz2) this.v).W(childCount, z);
        if (z) {
            J(view);
        }
        u6h.getClass();
        pzc V = RecyclerView.V(view);
        RecyclerView recyclerView = (RecyclerView) u6h.b;
        if (V != null) {
            if (V.E() || V.K()) {
                if (RecyclerView.K1) {
                    V.toString();
                }
                V.X &= -257;
            } else {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(V);
                throw new IllegalArgumentException(a81.k(recyclerView, sb));
            }
        } else if (RecyclerView.J1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(a81.k(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.io.File r2) {
        /*
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r1.d0(r0)     // Catch:{ all -> 0x000f }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x000f }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L_0x000f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqf.m(java.io.File):void");
    }

    public boolean n() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.c;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i++;
                } else {
                    this.b = i;
                    return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
                }
            } else {
                this.b = i;
                return false;
            }
        }
    }

    public void o(int i, String str) {
        String str2 = (String) this.c;
        if (str2.length() - i >= str.length()) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                if (str.charAt(i2) == (str2.charAt(i + i2) | ' ')) {
                    i2++;
                } else {
                    A(this, "Expected valid boolean literal prefix, but had '" + u() + '\'', 0, (String) null, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        A(this, "Unexpected end of boolean literal", 0, (String) null, 6);
        throw null;
    }

    public String p() {
        int i;
        String str;
        s(Typography.quote);
        int i2 = this.b;
        String str2 = (String) this.c;
        int k = StringsKt__StringsKt.indexOf$default((CharSequence) str2, (char) Typography.quote, i2, false, 4, (Object) null);
        if (k != -1) {
            int i3 = i2;
            while (i < k) {
                if (str2.charAt(i) == '\\') {
                    int i4 = this.b;
                    char charAt = str2.charAt(i);
                    boolean z = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            ((StringBuilder) this.w).append(str2, i4, i);
                            int Q = Q(i + 1);
                            if (Q != -1) {
                                int i5 = Q + 1;
                                char charAt2 = str2.charAt(Q);
                                if (charAt2 == 'u') {
                                    i5 = k(str2, i5);
                                } else {
                                    char c2 = charAt2 < 'u' ? o22.a[charAt2] : 0;
                                    if (c2 != 0) {
                                        ((StringBuilder) this.w).append(c2);
                                    } else {
                                        A(this, "Invalid escaped char '" + charAt2 + '\'', 0, (String) null, 6);
                                        throw null;
                                    }
                                }
                                i4 = Q(i5);
                                if (i4 == -1) {
                                    A(this, "Unexpected EOF", i4, (String) null, 4);
                                    throw null;
                                }
                            } else {
                                A(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6);
                                throw null;
                            }
                        } else {
                            i++;
                            if (i >= str2.length()) {
                                ((StringBuilder) this.w).append(str2, i4, i);
                                i4 = Q(i);
                                if (i4 == -1) {
                                    A(this, "Unexpected EOF", i4, (String) null, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str2.charAt(i);
                            }
                        }
                        i = i4;
                        z = true;
                        charAt = str2.charAt(i);
                    }
                    if (!z) {
                        str = str2.subSequence(i4, i).toString();
                    } else {
                        ((StringBuilder) this.w).append(str2, i4, i);
                        StringBuilder sb = (StringBuilder) this.w;
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        str = sb2;
                    }
                    this.b = i + 1;
                    return str;
                }
                i3 = i + 1;
            }
            this.b = k + 1;
            return str2.substring(i2, k);
        }
        u();
        B((byte) 1, false);
        throw null;
    }

    public byte q() {
        String str;
        int i = this.b;
        while (true) {
            str = (String) this.c;
            if (i == -1 || i >= str.length()) {
                this.b = str.length();
            } else {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i = i2;
                } else {
                    this.b = i2;
                    return m58.g(charAt);
                }
            }
        }
        this.b = str.length();
        return 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void r() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0015 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0017
            int r0 = r4.b     // Catch:{ all -> 0x0015 }
            int r0 = r0 + 1
            r4.b = r0     // Catch:{ all -> 0x0015 }
            monitor-exit(r4)
            return
        L_0x0015:
            r0 = move-exception
            goto L_0x005b
        L_0x0017:
            java.lang.Object r1 = r4.w     // Catch:{ all -> 0x0015 }
            gy0 r1 = (defpackage.gy0) r1     // Catch:{ all -> 0x0015 }
            az1 r2 = new az1     // Catch:{ all -> 0x0015 }
            r3 = 3
            r2.<init>(r3, r4, r0)     // Catch:{ all -> 0x0015 }
            r1.v(r2)     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0015 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0015 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0015 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0015 }
            r2 = -9223372036854775808
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            java.lang.Object r0 = r4.w     // Catch:{ all -> 0x0015 }
            gy0 r0 = (defpackage.gy0) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r4.v     // Catch:{ all -> 0x0015 }
            fs6 r1 = (defpackage.fs6) r1     // Catch:{ all -> 0x0015 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0015 }
            bz1 r2 = new bz1     // Catch:{ all -> 0x0015 }
            r3 = 1
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0015 }
            r0.v(r2)     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            r0.remove()     // Catch:{ all -> 0x0015 }
        L_0x0059:
            monitor-exit(r4)
            return
        L_0x005b:
            monitor-exit(r4)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqf.r():void");
    }

    public void s(char c2) {
        int i = this.b;
        if (i != -1) {
            while (true) {
                String str = (String) this.c;
                if (i < str.length()) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                        i = i2;
                    } else {
                        this.b = i2;
                        if (charAt != c2) {
                            Z(c2);
                            throw null;
                        }
                        return;
                    }
                } else {
                    this.b = -1;
                    Z(c2);
                    throw null;
                }
            }
        } else {
            Z(c2);
            throw null;
        }
    }

    public String t() {
        String str = (String) this.v;
        if (str == null) {
            return p();
        }
        this.v = null;
        return str;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return ((jz2) this.v).toString() + ", hidden list:" + ((ArrayList) this.w).size();
            case 11:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((String) this.c);
                sb.append("', currentPosition=");
                return tr1.k(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public String u() {
        String str;
        String str2 = (String) this.v;
        if (str2 != null) {
            this.v = null;
            return str2;
        }
        int W = W();
        String str3 = (String) this.c;
        if (W >= str3.length() || W == -1) {
            A(this, "EOF", W, (String) null, 4);
            throw null;
        }
        byte g = m58.g(str3.charAt(W));
        if (g == 1) {
            return t();
        }
        if (g == 0) {
            boolean z = false;
            while (m58.g(str3.charAt(W)) == 0) {
                W++;
                if (W >= str3.length()) {
                    ((StringBuilder) this.w).append(str3, this.b, W);
                    int Q = Q(W);
                    if (Q == -1) {
                        this.b = W;
                        ((StringBuilder) this.w).append(str3, 0, 0);
                        StringBuilder sb = (StringBuilder) this.w;
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        return sb2;
                    }
                    W = Q;
                    z = true;
                }
            }
            if (!z) {
                str = str3.subSequence(this.b, W).toString();
            } else {
                ((StringBuilder) this.w).append(str3, this.b, W);
                StringBuilder sb3 = (StringBuilder) this.w;
                String sb4 = sb3.toString();
                sb3.setLength(0);
                str = sb4;
            }
            this.b = W;
            return str;
        }
        A(this, "Expected beginning of the string, but got " + str3.charAt(W), 0, (String) null, 6);
        throw null;
    }

    public synchronized void w() {
        this.b = 0;
        ((ArrayDeque) this.c).clear();
    }

    public String x() {
        String u = u();
        if (Intrinsics.areEqual((Object) u, (Object) "null")) {
            if (((String) this.c).charAt(this.b - 1) != '\"') {
                A(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6);
                throw null;
            }
        }
        return u;
    }

    public void y(int i) {
        int F = F(i);
        ((jz2) this.v).Z(F);
        RecyclerView recyclerView = (RecyclerView) ((u6h) this.o).b;
        View childAt = recyclerView.getChildAt(F);
        if (childAt != null) {
            pzc V = RecyclerView.V(childAt);
            if (V != null) {
                if (!V.E() || V.K()) {
                    if (RecyclerView.K1) {
                        V.toString();
                    }
                    V.n(256);
                } else {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(V);
                    throw new IllegalArgumentException(a81.k(recyclerView, sb));
                }
            }
        } else if (RecyclerView.J1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(F);
            throw new IllegalArgumentException(a81.k(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(F);
    }

    public void z(int i, String str, String str2) {
        String concat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder m = g63.m(str, " at path: ");
        m.append(((cs) this.o).s());
        m.append(concat);
        throw o54.c(m.toString(), (String) this.c, i);
    }

    public mqf(zwd zwd, int i, List list, w8b w8b, List list2) {
        this.a = 10;
        this.o = zwd;
        this.b = i;
        this.v = list;
        this.w = w8b;
        this.c = list2;
    }

    public mqf(e69 e69, sq9 sq9, String str) {
        this.a = 9;
        this.o = e69;
        this.v = sq9;
        this.w = str;
        this.b = e69.V();
        this.c = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public mqf(ChatTopPanelViewImpl chatTopPanelViewImpl, int i) {
        this.a = 4;
        this.c = new ArrayList();
        this.o = chatTopPanelViewImpl;
        this.b = i;
    }

    public mqf(yr6 yr6, fs6 fs6, gy0 gy0) {
        this.a = 6;
        this.o = yr6;
        this.v = fs6;
        this.w = gy0;
        this.c = new ArrayDeque();
    }

    public mqf(vu1 vu1) {
        this.a = 3;
        this.b = 0;
        this.v = new HashMap();
        this.c = new HashSet();
        this.o = new ArrayList();
        this.w = new ArrayList();
        Set<Set> hashSet = new HashSet<>();
        try {
            hashSet = vu1.a.G();
        } catch (CameraAccessExceptionCompat unused) {
        }
        for (Set arrayList : hashSet) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() >= 2) {
                String str = (String) arrayList2.get(0);
                String str2 = (String) arrayList2.get(1);
                try {
                    if (y7e.G(vu1, str) && y7e.G(vu1, str2)) {
                        ((HashSet) this.c).add(new HashSet(Arrays.asList(new String[]{str, str2})));
                        HashMap hashMap = (HashMap) this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList2.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList2.get(0));
                    }
                } catch (InitializationException unused2) {
                }
            }
        }
    }

    public mqf(String str, int i, z90 z90, y90 y90) {
        this.a = 2;
        xjf xjf = xjf.a;
        this.o = str;
        this.b = i;
        this.c = xjf;
        this.v = z90;
        this.w = y90;
    }

    public mqf(u6h u6h) {
        this.a = 5;
        this.b = 0;
        this.o = u6h;
        this.v = new jz2(0);
        this.w = new ArrayList();
    }

    public mqf(r1d[] r1dArr, ld5[] ld5Arr, sqf sqf, me8 me8) {
        this.a = 0;
        this.o = r1dArr;
        this.v = (ld5[]) ld5Arr.clone();
        this.w = sqf;
        this.c = me8;
        this.b = r1dArr.length;
    }

    public mqf(s1d[] s1dArr, md5[] md5Arr, qqf qqf, ne8 ne8) {
        this.a = 1;
        n79.g(s1dArr.length == md5Arr.length);
        this.o = s1dArr;
        this.v = (md5[]) md5Arr.clone();
        this.w = qqf;
        this.c = ne8;
        this.b = s1dArr.length;
    }

    public mqf() {
        byte[] bArr;
        byte[] bArr2;
        this.a = 7;
        int glCreateProgram = GLES20.glCreateProgram();
        this.b = glCreateProgram;
        cjf.f();
        cjf.b(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        cjf.b(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            if (valueOf.length() != 0) {
                "Unable to link shader program: \n".concat(valueOf);
            }
        }
        GLES20.glUseProgram(glCreateProgram);
        this.w = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.o = new ece[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.b;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[i2];
            int[] iArr6 = new int[i2];
            byte[] bArr3 = new byte[i5];
            int i6 = i5;
            int i7 = i4;
            GLES20.glGetActiveAttrib(i4, i3, i5, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    bArr2 = bArr3;
                    i8 = i6;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i8] == 0) {
                    break;
                }
                i8++;
                bArr3 = bArr2;
            }
            String str = new String(bArr2, 0, i8);
            GLES20.glGetAttribLocation(i7, str);
            ece ece = new ece(12);
            ((ece[]) this.o)[i3] = ece;
            ((HashMap) this.w).put(str, ece);
            i3++;
            i2 = 1;
        }
        this.c = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr7, 0);
        this.v = new bk3[iArr7[0]];
        for (int i9 = 0; i9 < iArr7[i]; i9++) {
            int i10 = this.b;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr8, i);
            int i11 = iArr8[i];
            byte[] bArr4 = new byte[i11];
            int i12 = i11;
            GLES20.glGetActiveUniform(i10, i9, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    bArr = bArr4;
                    i13 = i12;
                    break;
                }
                bArr = bArr4;
                if (bArr[i13] == 0) {
                    break;
                }
                i13++;
                bArr4 = bArr;
            }
            i = 0;
            String str2 = new String(bArr, 0, i13);
            GLES20.glGetUniformLocation(i10, str2);
            Object obj = new Object();
            ((bk3[]) this.v)[i9] = obj;
            ((HashMap) this.c).put(str2, obj);
        }
        cjf.f();
    }

    public mqf(String str) {
        this.a = 11;
        cs csVar = new cs(11, (byte) 0);
        csVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        csVar.o = iArr;
        csVar.b = -1;
        this.o = csVar;
        this.w = new StringBuilder();
        this.c = str;
    }

    public mqf(mtf mtf, int i) {
        this.a = 12;
        this.c = mtf;
        this.o = new ky1(new byte[5], (byte) 0, 5, 1);
        this.v = new SparseArray();
        this.w = new SparseIntArray();
        this.b = i;
    }

    public mqf(ntf ntf, int i) {
        this.a = 13;
        this.c = ntf;
        this.o = new ky1(new byte[5], (byte) 0, 5, 2);
        this.v = new SparseArray();
        this.w = new SparseIntArray();
        this.b = i;
    }

    public mqf(pu6 pu6, nu6[] nu6Arr) {
        this.a = 8;
        this.c = pu6;
        int length = nu6Arr.length;
        this.o = new nu6[length];
        this.b = length - 1;
        int f = pu6.f() + 1;
        nu6[][] nu6Arr2 = new nu6[f][];
        int[] iArr = new int[f];
        for (nu6 nu6 : nu6Arr) {
            int i = nu6.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < f; i2++) {
            nu6Arr2[i2] = new nu6[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (nu6 nu62 : nu6Arr) {
            int i3 = nu62.a.a;
            nu6[] nu6Arr3 = nu6Arr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            nu6Arr3[i4] = nu62;
        }
        this.v = nu6Arr2;
        this.w = new int[(((pu6) this.c).f() + 1)];
    }
}
