package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;

/* renamed from: df7  reason: default package */
public final class df7 extends tyc {
    public final LayoutInflater X;
    public final Context o;
    public final FrgBaseProfileLinkDescription v;
    public final ny7 w;
    public final yva x;
    public final boolean y;
    public final int z;

    public df7(Context context, FrgBaseProfileLinkDescription frgBaseProfileLinkDescription, gy7 gy7, yva yva, boolean z2, int i) {
        this.o = context;
        this.v = frgBaseProfileLinkDescription;
        this.w = gy7;
        this.x = yva;
        this.y = z2;
        this.z = i;
        this.X = LayoutInflater.from(context);
    }

    public final int j() {
        FrgBaseProfileLinkDescription frgBaseProfileLinkDescription = this.v;
        int i = 1;
        int i2 = (cvg.A(frgBaseProfileLinkDescription.B3()) ^ true ? 1 : 0) + (cvg.A(frgBaseProfileLinkDescription.C3()) ^ true ? 1 : 0);
        if (i2 != 2) {
            i = 0;
        }
        return i2 + i;
    }

    public final int l(int i) {
        FrgBaseProfileLinkDescription frgBaseProfileLinkDescription = this.v;
        if (cvg.A(frgBaseProfileLinkDescription.B3())) {
            if (i == 0) {
                return lic.channel_info_link;
            }
            throw new IllegalStateException("position > getItemCount()");
        } else if (cvg.A(frgBaseProfileLinkDescription.C3())) {
            if (i == 0) {
                return lic.channel_info_description;
            }
            throw new IllegalStateException("position > getItemCount()");
        } else if (i == 0) {
            return lic.channel_info_description;
        } else {
            if (i == 1) {
                return lic.short_divider;
            }
            if (i == 2) {
                return lic.channel_info_link;
            }
            throw new IllegalStateException("position > getItemCount()");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.pzc r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            int r3 = r1.w
            int r4 = defpackage.lic.channel_info_link
            r5 = 4
            r6 = 3
            int r7 = r0.z
            r8 = 1
            yva r9 = r0.x
            ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription r10 = r0.v
            if (r3 != r4) goto L_0x010a
            x1c r1 = (defpackage.x1c) r1
            fz7 r3 = defpackage.fz7.q
            java.lang.String r4 = r10.C3()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r12 = ""
            java.lang.String r13 = "^(http[s]?://www\\.|http[s]?://|www\\.)"
            r14 = 0
            if (r11 == 0) goto L_0x0029
        L_0x0027:
            r4 = r14
            goto L_0x0057
        L_0x0029:
            android.net.Uri r11 = android.net.Uri.parse(r4)
            ty7 r15 = new ty7
            r15.<init>(r3, r2)
            ez7 r11 = r3.d(r11, r15)
            boolean r11 = r11.b
            if (r11 == 0) goto L_0x0049
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x0027
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = r4.replaceFirst(r13, r12)
            goto L_0x0057
        L_0x0049:
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x0027
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r4 = r4.getLastPathSegment()
        L_0x0057:
            java.lang.String r11 = r10.C3()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            ty7 r15 = new ty7
            r15.<init>(r3, r2)
            ez7 r3 = r3.d(r11, r15)
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x006e
            goto L_0x00e6
        L_0x006e:
            java.lang.String r3 = r10.C3()
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x0081
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = r3.replaceFirst(r13, r12)
            goto L_0x0082
        L_0x0081:
            r3 = r14
        L_0x0082:
            int r10 = defpackage.tr1.y(r7)
            android.content.Context r0 = r0.o
            if (r10 == 0) goto L_0x00c5
            if (r10 == r8) goto L_0x00ba
            r11 = 2
            if (r10 == r11) goto L_0x00af
            if (r10 == r6) goto L_0x00a4
            java.lang.String r10 = "df7"
            java.lang.String r11 = "Unknown link type"
            defpackage.z68.f(r10, r11, r14)
            int r10 = defpackage.qad.V7
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getString(r10, r3)
        L_0x00a2:
            r10 = r0
            goto L_0x00d0
        L_0x00a4:
            int r10 = defpackage.qad.V7
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getString(r10, r3)
            goto L_0x00a2
        L_0x00af:
            int r10 = defpackage.qad.U7
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getString(r10, r3)
            goto L_0x00a2
        L_0x00ba:
            int r10 = defpackage.qad.W7
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getString(r10, r3)
            goto L_0x00a2
        L_0x00c5:
            int r10 = defpackage.qad.X7
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getString(r10, r3)
            goto L_0x00a2
        L_0x00d0:
            if (r9 != 0) goto L_0x00d4
            r14 = r10
            goto L_0x00e6
        L_0x00d4:
            if (r7 == r6) goto L_0x00db
            if (r7 != r5) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r11 = r2
            goto L_0x00dc
        L_0x00db:
            r11 = r8
        L_0x00dc:
            r13 = 0
            r16 = 1
            r12 = 0
            r14 = 0
            r15 = 0
            java.lang.CharSequence r14 = r9.a(r10, r11, r12, r13, r14, r15, r16)
        L_0x00e6:
            android.widget.TextView r0 = r1.E0
            r0.setText(r4)
            android.widget.TextView r0 = r1.F0
            r0.setText(r14)
            boolean r3 = defpackage.cvg.A(r14)
            androidx.appcompat.widget.AppCompatImageView r1 = r1.D0
            if (r3 == 0) goto L_0x0101
            int r2 = defpackage.nad.U1
            r1.setImageResource(r2)
            defpackage.iq.I(r0, r8)
            goto L_0x0140
        L_0x0101:
            int r3 = defpackage.nad.O0
            r1.setImageResource(r3)
            defpackage.iq.I(r0, r2)
            goto L_0x0140
        L_0x010a:
            int r4 = defpackage.lic.channel_info_description
            if (r3 != r4) goto L_0x0134
            c12 r1 = (defpackage.c12) r1
            if (r9 != 0) goto L_0x0117
            java.lang.String r0 = r10.B3()
            goto L_0x012e
        L_0x0117:
            java.lang.String r10 = r10.B3()
            if (r7 == r6) goto L_0x0122
            if (r7 != r5) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r11 = r2
            goto L_0x0123
        L_0x0122:
            r11 = r8
        L_0x0123:
            boolean r13 = r0.y
            r16 = 1
            r12 = 1
            r14 = 1
            r15 = 0
            java.lang.CharSequence r0 = r9.a(r10, r11, r12, r13, r14, r15, r16)
        L_0x012e:
            android.widget.TextView r1 = r1.D0
            r1.setText(r0)
            goto L_0x0140
        L_0x0134:
            int r0 = defpackage.lic.short_divider
            if (r3 != r0) goto L_0x0141
            r0 = r1
            zq4 r0 = (defpackage.zq4) r0
            xq4 r1 = defpackage.xq4.SHORT_DIVIDER
            r0.M(r1)
        L_0x0140:
            return
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "position > getItemCount()"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df7.s(pzc, int):void");
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = lic.channel_info_link;
        LayoutInflater layoutInflater = this.X;
        if (i == i2) {
            return new x1c(layoutInflater.inflate(ujc.row_profile_info__link, viewGroup, false), this.v);
        }
        if (i == lic.channel_info_description) {
            return new c12(layoutInflater.inflate(ujc.row_profile_info__descr, viewGroup, false), (gy7) this.w);
        }
        if (i == lic.short_divider) {
            return new zq4(layoutInflater.inflate(ujc.row_divider, viewGroup, false));
        }
        throw new IllegalStateException("unknown settings type");
    }
}
