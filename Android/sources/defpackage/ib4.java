package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.b;
import androidx.media3.common.PlaybackException;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.messages.views.dev.FrgPrefs;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: ib4  reason: default package */
public final /* synthetic */ class ib4 implements i08, zf5, ice, y3f, kj4, lj4, zi6, ima, h08, qk3, ssb, psb, ywa, vla, ss7, fc3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ib4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public String a(String str, String str2) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                KProperty[] kPropertyArr = InputPhoneScreen.D0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj2;
                return y7e.o((aeb) inputPhoneScreen.w0.getValue(), ((zwa) obj).getCode(), str2, str, ((w14) inputPhoneScreen.g0().x0.a.getValue()).b);
            default:
                KProperty[] kPropertyArr2 = InviteByPhoneScreen.z0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj2;
                return y7e.o((aeb) inviteByPhoneScreen.v0.getValue(), ((zwa) obj).getCode(), str2, str, ((w14) inviteByPhoneScreen.f0().Y.a.getValue()).b);
        }
    }

    public void accept(Object obj) {
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                FrgAttachView frgAttachView = (FrgAttachView) obj3;
                frgAttachView.C1 = (a89) obj;
                while (true) {
                    if (i < frgAttachView.C1.a.x0.G()) {
                        l20 F = frgAttachView.C1.a.x0.F(i);
                        if (F.q.equals(frgAttachView.D1.q)) {
                            frgAttachView.D1 = F;
                        } else {
                            if (F.g()) {
                                c20 c20 = F.g;
                                if (c20.g.q.equals(frgAttachView.D1.q)) {
                                    frgAttachView.D1 = c20.g;
                                }
                            }
                            i++;
                        }
                    }
                }
                if (frgAttachView.h3() != null) {
                    ((ActAttachesView) frgAttachView.h3()).a0(frgAttachView.C1);
                }
                ((x6) obj2).run();
                return;
            case 18:
                Boolean bool = (Boolean) obj;
                FrgBaseProfile frgBaseProfile = (FrgBaseProfile) obj3;
                frgBaseProfile.getClass();
                cbe cbe = new cbe(7, ((Uri) obj2).toString());
                if (frgBaseProfile.q3()) {
                    n99 n99 = frgBaseProfile.P1;
                    n99.v.a0(new ur0(cbe));
                    return;
                }
                return;
            case 19:
                t5 a2 = t5.a(((a32) obj).a);
                a2.g = (String) obj2;
                q5.T((b) obj3, a2);
                return;
            case 20:
                FrgContactMultiPicker frgContactMultiPicker = (FrgContactMultiPicker) obj3;
                frgContactMultiPicker.getClass();
                frgContactMultiPicker.q1.A().a(new mvd(new kvd(((a32) obj).a, (String) obj2, true, CollectionsKt.emptyList())));
                return;
            default:
                Map.Entry entry = (Map.Entry) obj;
                j18 j18 = (j18) obj3;
                j18.getClass();
                j18.a();
                long longValue = ((Long) entry.getKey()).longValue();
                List<t58> list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    List list2 = (List) j18.z.c(((a32) obj2).a, longValue, ((ltb) j18.X).a.m()).c(Collections.emptyList());
                    if (!list2.isEmpty()) {
                        Collections.sort(list, new oj4(10));
                        for (t58 t58 : list) {
                            s58 s58 = t58.a;
                            qq3 qq3 = qq3.e;
                            vy vyVar = new vy(s58);
                            vyVar.b = longValue;
                            vyVar.c = t58.b;
                            vyVar.o = ((ec2) list2.get(0)).h;
                            j18.c.d(vyVar.d());
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m14apply(Object obj) {
        ((b97) this.b).getClass();
        String c2 = ((qx0) obj).c();
        int i = 0;
        while (true) {
            List list = (List) this.c;
            if (i >= list.size()) {
                return true;
            }
            if (!TextUtils.isEmpty(c2) && c2.startsWith((String) list.get(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.k0d b(int r17, defpackage.rpf r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 9: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            qb7 r9 = defpackage.tb7.o()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            ij4 r11 = new ij4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            dj4 r5 = (defpackage.dj4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            k0d r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            dj4 r10 = (defpackage.dj4) r10
            int r0 = r10.z
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.X
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            ca6[] r4 = r8.c
            r4 = r4[r2]
            int r5 = r4.z0
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.A0
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.Y
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.t0g.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.t0g.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.z0
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            qb7 r14 = defpackage.tb7.o()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            ca6[] r0 = r8.c
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            pj4 r6 = new pj4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            k0d r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib4.b(int, rpf, int[]):k0d");
    }

    public tf5[] c() {
        fh4 fh4 = (fh4) this.b;
        gze gze = fh4.c;
        ea6 ea6 = (ea6) this.c;
        return new tf5[]{gze.k(ea6) ? new aze(fh4.c.t(ea6), ea6) : new dh4(ea6)};
    }

    public void f(oc0 oc0) {
        ti4 ti4 = (ti4) this.b;
        ti4.getClass();
        zj6 zj6 = zj6.b;
        if (((z3f) this.c).c.a() && oc0.d) {
            zj6 = zj6.c;
        }
        nr4 nr4 = ti4.a;
        ck6.d((AtomicBoolean) nr4.c, true);
        ck6.c((Thread) nr4.e);
        if (((zj6) nr4.n) != zj6) {
            nr4.n = zj6;
            nr4.t(nr4.b);
        }
    }

    public Object g(soc soc) {
        return new gb0((String) this.b, ((ip5) this.c).b((Context) soc.a(Context.class)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:45|46|(2:48|49)|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0138 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.pbe r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            java.lang.Object r1 = r12.b
            int r12 = r12.a
            switch(r12) {
                case 7: goto L_0x00f8;
                default: goto L_0x0009;
            }
        L_0x0009:
            ru.ok.messages.stickers.FrgGifsLoader r1 = (ru.ok.messages.stickers.FrgGifsLoader) r1
            dm4 r12 = r1.p1
            java.lang.Object r12 = r12.b
            id3 r12 = (defpackage.id3) r12
            qra r12 = (defpackage.qra) r12
            ltb r12 = r12.y()
            a33 r12 = r12.a
            java.lang.String r2 = "app.tenor.anon.id"
            java.lang.String r3 = ""
            java.lang.String r4 = r12.f(r2, r3)
            boolean r5 = defpackage.cvg.A(r4)
            java.lang.String r6 = "GET"
            r7 = 0
            java.lang.String r8 = "anon_id"
            if (r5 == 0) goto L_0x009a
            java.lang.String r4 = "anonid"
            sd3 r4 = ru.ok.messages.stickers.FrgGifsLoader.h3(r4)
            hr6 r5 = new hr6
            r5.<init>()
            m57 r4 = r4.c()
            r5.a = r4
            r5.r(r6, r7)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r5.A(r4)
            y2d r4 = r5.c()
            rla r5 = r1.D1
            jtc r4 = r5.b(r4)
            k4d r4 = r4.h()
            java.lang.String r5 = "ru.ok.messages.stickers.FrgGifsLoader"
            ptc r9 = r4.x
            if (r9 != 0) goto L_0x006d
            java.lang.String r12 = "Can't get anonid. Empty body"
            defpackage.z68.f(r5, r12, r7)     // Catch:{ all -> 0x006b }
        L_0x0064:
            defpackage.u0g.c(r9)
            defpackage.u0g.c(r4)
            goto L_0x009b
        L_0x006b:
            r12 = move-exception
            goto L_0x0093
        L_0x006d:
            java.lang.String r3 = r9.V()     // Catch:{ all -> 0x006b }
            java.lang.String r10 = "response = %s"
            java.lang.Object[] r11 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x006b }
            defpackage.z68.c(r5, r10, r11)     // Catch:{ all -> 0x006b }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006b }
            r5.<init>((java.lang.String) r3)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = r5.optString(r8)     // Catch:{ all -> 0x006b }
            boolean r10 = defpackage.cvg.A(r3)     // Catch:{ all -> 0x006b }
            if (r10 == 0) goto L_0x008f
            java.lang.String r3 = "anonId"
            java.lang.String r3 = r5.optString(r3)     // Catch:{ all -> 0x006b }
        L_0x008f:
            r12.l(r2, r3)     // Catch:{ all -> 0x006b }
            goto L_0x0064
        L_0x0093:
            defpackage.u0g.c(r9)
            defpackage.u0g.c(r4)
            throw r12
        L_0x009a:
            r3 = r4
        L_0x009b:
            sd3 r0 = (defpackage.sd3) r0
            r0.b(r8, r3)
            hr6 r12 = new hr6
            r12.<init>()
            m57 r0 = r0.c()
            r12.a = r0
            r12.r(r6, r7)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r12.A(r0)
            y2d r12 = r12.c()
            rla r0 = r1.D1
            jtc r12 = r0.b(r12)
            k4d r12 = r12.h()
            ptc r12 = r12.x
            if (r12 == 0) goto L_0x00e0
            java.lang.String r0 = r12.V()     // Catch:{ all -> 0x00de }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00de }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00de }
            boolean r0 = r13.f()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00f0
            r13.a(r1)     // Catch:{ all -> 0x00de }
            goto L_0x00f0
        L_0x00de:
            r13 = move-exception
            goto L_0x00f4
        L_0x00e0:
            boolean r0 = r13.f()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00f0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "Body is null"
            r0.<init>(r1)     // Catch:{ all -> 0x00de }
            r13.onError(r0)     // Catch:{ all -> 0x00de }
        L_0x00f0:
            defpackage.u0g.c(r12)
            return
        L_0x00f4:
            defpackage.u0g.c(r12)
            throw r13
        L_0x00f8:
            java.lang.String r12 = "th4"
            s9c r0 = (defpackage.s9c) r0
            th4 r1 = (defpackage.th4) r1
            r1.getClass()
            boolean r1 = r13.f()     // Catch:{ Exception -> 0x011f }
            if (r1 != 0) goto L_0x0142
            ph3 r1 = r0.j     // Catch:{ Exception -> 0x011f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x011f }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x011f }
            java.lang.String r2 = "start connect to host: %s"
            defpackage.z68.c(r12, r2, r1)     // Catch:{ Exception -> 0x011f }
            r0.f = r13     // Catch:{ Exception -> 0x0121 }
            r0.connect()     // Catch:{ Exception -> 0x0121 }
            r13.a(r0)     // Catch:{ Exception -> 0x011f }
            goto L_0x0142
        L_0x011f:
            r12 = move-exception
            goto L_0x0139
        L_0x0121:
            r1 = move-exception
            ph3 r2 = r0.j     // Catch:{ Exception -> 0x011f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x011f }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x011f }
            java.lang.String r3 = "close socket for host: %s"
            defpackage.z68.c(r12, r3, r2)     // Catch:{ Exception -> 0x011f }
            java.net.Socket r12 = r0.e     // Catch:{ Exception -> 0x011f }
            if (r12 == 0) goto L_0x0138
            r12.close()     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            throw r1     // Catch:{ Exception -> 0x011f }
        L_0x0139:
            boolean r0 = r13.f()
            if (r0 != 0) goto L_0x0142
            r13.onError(r12)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib4.h(pbe):void");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ud) obj).z0((td) this.b, (qqf) this.c);
                return;
            case 1:
                ((ud) obj).l0((td) this.b, (PlaybackException) this.c);
                return;
            case 2:
                ((ud) obj).K((td) this.b, (z94) this.c);
                return;
            case 3:
                ((ud) obj).N((td) this.b, (i30) this.c);
                return;
            case 4:
                v8g v8g = (v8g) this.c;
                ((ud) obj).T((td) this.b, v8g);
                int i = v8g.a;
                return;
            case 5:
                ((ud) obj).A0((td) this.b, (Exception) this.c);
                return;
            default:
                ((rob) obj).I(((dob) this.b).h, (cqf) this.c);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.k0d j(int r17, defpackage.spf r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 10: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            qb7 r9 = defpackage.tb7.o()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            jj4 r11 = new jj4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            ej4 r5 = (defpackage.ej4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            k0d r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            ej4 r10 = (defpackage.ej4) r10
            int r0 = r10.i
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.j
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            ea6[] r4 = r8.d
            r4 = r4[r2]
            int r5 = r4.t
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.u
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.k
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.v0g.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.v0g.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.t
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            qb7 r14 = defpackage.tb7.o()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            ea6[] r0 = r8.d
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            qj4 r6 = new qj4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            k0d r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib4.j(int, spf, int[]):k0d");
    }

    public boolean l(Preference preference) {
        FrgPrefs frgPrefs = (FrgPrefs) this.b;
        frgPrefs.getClass();
        qra qra = (qra) ((id3) this.c);
        List r = cjf.r(Collections.unmodifiableList(qra.l().H(r62.K, false, (osb) null)), new ip5(23), new ip5(24));
        z68.c("ru.ok.messages.views.dev.FrgPrefs", "sync %d chat settings", Integer.valueOf(r.size()));
        frgPrefs.u1 = new ei6(frgPrefs, qra, r);
        qra.J().d(frgPrefs.u1);
        jna jna = (jna) qra.e();
        jna.getClass();
        List A = CollectionsKt___CollectionsKt.windowed(r, 100, 100, true);
        vq7 vq7 = new vq7(21, (Object) jna);
        int size = A.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Number) vq7.invoke(A.get(i))).longValue();
        }
        return true;
    }

    public void q(Task task) {
        ((f75) this.b).a((Intent) this.c);
    }

    public iog z(View view, iog iog) {
        return (iog) ((Function3) this.b).invoke(view, iog, (Rect) this.c);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 13:
                t25 t25 = (t25) this.b;
                t25.getClass();
                e15 e15 = (e15) this.c;
                int i = e15.a;
                CharSequence c2 = t25.c.c(e15.c);
                return new e15(i, e15.b, c2, (List) obj, e15.e, e15.f, e15.g);
            default:
                ll5 ll5 = (ll5) this.b;
                ll5.getClass();
                for (a89 a89 : (List) obj) {
                    ha9 ha9 = a89.a;
                    g20 g20 = g20.X;
                    if (ha9.n(g20)) {
                        ha9 ha92 = a89.a;
                        l20 I = ha92.x0.I(g20);
                        if (I != null) {
                            if (((String) this.c).equals(I.q)) {
                                return ((sjd) ((z9f) ll5.b)).q().a(ha92.b, false);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return lbe.g(new IllegalStateException("no message found on screen"));
        }
    }
}
