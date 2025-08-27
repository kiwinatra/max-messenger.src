package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Spannable;
import android.view.View;
import androidx.recyclerview.widget.a;
import com.google.android.gms.location.LocationAvailability;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* renamed from: z3a  reason: default package */
public final class z3a implements uu1, f0b, n9g, qk3, uoe, g08 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z3a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(byte[] bArr) {
        for (v1a v1a : (Set) ((b4a) this.b).a) {
            v1a.w.add(ev0.v(v1a.v, (CoroutineContext) null, (f14) null, new t1a(v1a, bArr, (Continuation) null), 3));
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                z68.f(((vud) this.b).v, "onServiceNotAvailable", (Throwable) obj);
                return;
            default:
                xoc xoc = (xoc) obj;
                j09 j09 = (j09) this.b;
                ((sjf) ((rjf) j09.j)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                for (Map.Entry entry : ((HashMap) j09.d).entrySet()) {
                    mne mne = (mne) entry.getKey();
                    usg usg = (usg) entry.getValue();
                    if ((usg.b.toMillis(usg.a) + usg.c) - 10 < elapsedRealtime) {
                        usg.c = elapsedRealtime;
                        mne.a(xoc);
                    }
                }
                return;
        }
    }

    public void b(gpe gpe) {
        ((xte) this.b).b(gpe);
    }

    public void c(bv1 bv1) {
        b4a b4a = (b4a) this.b;
        b4a.T0 = 100;
        w3a w3a = b4a.V0;
        boolean Z = b4a.Z();
        w3a.getClass();
        boolean z = bv1.b;
        w3a.x = z;
        w3a.y.b = z;
        boolean z2 = false;
        if (Z) {
            w3a.w.setVisibility(z ? 0 : 8);
        }
        for (r1a W : (Set) w3a.a) {
            W.W((String) null);
        }
        l5b l5b = b4a.A0;
        if (l5b == l5b.b || l5b == l5b.a) {
            z2 = true;
        }
        b4a.h0(z2);
    }

    public int d(View view) {
        ((a) this.b).getClass();
        return a.F(view) - ((bzc) view.getLayoutParams()).topMargin;
    }

    public int e() {
        return ((a) this.b).L();
    }

    public void f(gpe gpe) {
        ((xte) this.b).f(gpe);
    }

    public void g(File file) {
        b4a b4a = (b4a) this.b;
        if (b4a.C0) {
            b4a.C0 = false;
            return;
        }
        if (b4a.O0.getVisibility() == 0) {
            b4a.n0();
        }
        b4a.N(new a0(11, file));
    }

    public void h(CameraExceptionImpl cameraExceptionImpl) {
        z68.g("b4a", "Camera error, error message: %s", cameraExceptionImpl.getMessage());
        b4a b4a = (b4a) this.b;
        int i = b4a.T0;
        if (i < 1000) {
            ((View) b4a.c).postDelayed(new o99(10, this), (long) i);
        } else if (n54.f((Context) b4a.b)) {
            if (b4a.Z()) {
                ((uta) b4a.z).c(new Exception("Exception when QuickCamera has fullMode"), false);
            }
            for (v1a v1a : (Set) b4a.a) {
                ((View) ((ok8) v1a.b).x0.c).setVisibility(8);
            }
        }
        b4a.T0 += 500;
    }

    public void i(pq9... pq9Arr) {
        for (pq9 pq9 : pq9Arr) {
            int i = pq9.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i2 = pq9.b;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap.get(Integer.valueOf(i2)));
                pq9.toString();
            }
            treeMap.put(Integer.valueOf(i2), pq9);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[EDGE_INSN: B:41:0x007c->B:30:0x007c ?: BREAK  
    EDGE_INSN: B:43:0x007c->B:30:0x007c ?: BREAK  
    EDGE_INSN: B:44:0x007c->B:30:0x007c ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.StaticLayout j(java.lang.CharSequence r18, android.text.TextPaint r19, int r20, android.text.Layout.Alignment r21, boolean r22, android.text.TextUtils.TruncateAt r23, int r24) {
        /*
            r17 = this;
            r1 = r18
            r0 = r17
            java.lang.Object r0 = r0.b
            r2 = r0
            m95 r2 = (defpackage.m95) r2
            java.lang.String r3 = "z3a"
            r15 = r1
            r16 = 0
        L_0x000e:
            int r0 = r15.length()     // Catch:{ IndexOutOfBoundsException -> 0x0021, IllegalArgumentException -> 0x001e }
            if (r16 == 0) goto L_0x0017
            r6 = r0
            r7 = 0
            goto L_0x0019
        L_0x0017:
            r7 = r0
            r6 = 0
        L_0x0019:
            if (r16 == 0) goto L_0x0025
            zef r0 = defpackage.bff.e     // Catch:{ IndexOutOfBoundsException -> 0x0021, IllegalArgumentException -> 0x001e }
            goto L_0x0027
        L_0x001e:
            r0 = move-exception
            r4 = r15
            goto L_0x0041
        L_0x0021:
            r0 = move-exception
            r4 = r15
            goto L_0x0090
        L_0x0025:
            zef r0 = defpackage.bff.c     // Catch:{ IndexOutOfBoundsException -> 0x0021, IllegalArgumentException -> 0x001e }
        L_0x0027:
            r5 = r15
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r20
            r14 = r24
            r4 = r15
            r15 = r0
            android.text.StaticLayout r0 = defpackage.cjf.E(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x003f, IllegalArgumentException -> 0x003d }
            return r0
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            goto L_0x0090
        L_0x0041:
            java.lang.String r5 = "seems we work with RTL text"
            defpackage.z68.f(r3, r5, r0)
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L_0x004e
            java.lang.String r5 = ""
        L_0x004e:
            if (r16 != 0) goto L_0x007c
            java.lang.String r6 = "fromIndex"
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r6, false, 2, (java.lang.Object) null)
            if (r6 == 0) goto L_0x007c
            java.lang.String r6 = "toIndex"
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r6, false, 2, (java.lang.Object) null)
            if (r5 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x0078
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r5 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check range exception: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r0)
            ((defpackage.uta) r2).c(r5, false)
        L_0x0078:
            r16 = 1
            r15 = r4
            goto L_0x000e
        L_0x007c:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unknown: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0090:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L_0x00b5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Hit bug #35412, retrying with Spannables removed: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            defpackage.z68.f(r3, r5, r0)
            if (r2 == 0) goto L_0x00af
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r6 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            r6.<init>(r5, r0)
            ((defpackage.uta) r2).c(r6, false)
        L_0x00af:
            java.lang.String r15 = r4.toString()
            goto L_0x000e
        L_0x00b5:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "strange: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.j(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }

    public void k(Object obj) {
        kt6 kt6 = (kt6) obj;
        kt6.getClass();
        boolean z = ((LocationAvailability) this.b).o < 1000;
        kt6.a.getClass();
        z68.c("e68", "onLocationAvailability: %s", Boolean.valueOf(z));
    }

    public void l(g0b g0b) {
        ((b6c) ((h6c) this.b)).b.invoke(g0b);
    }

    public int m() {
        a aVar = (a) this.b;
        return aVar.o - aVar.I();
    }

    public View n(int i) {
        return ((a) this.b).v(i);
    }

    public void o() {
        j50 j50 = (j50) this.b;
        j50.getClass();
        Handler handler = l0b.a;
        l0b.b((h0b) j50.y, g0b.c);
    }

    public int p(View view) {
        ((a) this.b).getClass();
        return a.z(view) + ((bzc) view.getLayoutParams()).bottomMargin;
    }

    public void q(zuf zuf) {
        SuggestsViewModel V2 = ((SuggestsFragment) this.b).V2();
        V2.getClass();
        CharSequence charSequence = zuf.b.e;
        nd ndVar = V2.c;
        if (!(charSequence == null || charSequence.length() == 0)) {
            ndVar.f("MENTION_SUGGEST_CLICK", charSequence.charAt(0) == '@' ? zuf.f ? "publicLink" : "contactLink" : "fullName");
        }
        ndVar.e("CLICK_ON_COMMAND_IN_SUGGEST");
        p1a p1a = V2.D;
        if (p1a == null) {
            p1a = null;
        }
        V2.n(zuf, p1a.Y());
        V2.o(y1f.a);
    }

    public int r(int i) {
        int i2;
        cge cge;
        cge[] cgeArr = (cge[]) this.b;
        int length = cgeArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (cge = cgeArr[i2]) != null) {
            int i4 = cge.b;
            int i5 = cge.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = (i2 = (i3 + length) >>> 1) + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    public z3a(Spannable spannable) {
        Object obj;
        this.a = 8;
        try {
            obj = spannable.getSpans(0, spannable.length(), i35.class);
        } catch (Throwable unused) {
            obj = null;
        }
        i35[] i35Arr = (i35[]) (obj == null ? new i35[0] : obj);
        this.b = new cge[i35Arr.length];
        int length = i35Arr.length;
        for (int i = 0; i < length; i++) {
            ((cge[]) this.b)[i] = new cge(spannable.getSpanStart(i35Arr[i]), spannable.getSpanEnd(i35Arr[i]));
        }
        Arrays.sort((cge[]) this.b);
    }

    public z3a() {
        this.a = 5;
        this.b = new LinkedHashMap();
    }
}
