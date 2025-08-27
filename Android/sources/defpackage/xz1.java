package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xz1  reason: default package */
public final class xz1 {
    public final Lazy a = bzb.a.getAccessor().h(fz7.class);

    public static List b() {
        int i = fxa.z0;
        p7 p7Var = new p7(i, new s1e((long) i, 0, new igf(ixa.J1), (h1e) null, (ngf) null, Integer.valueOf(cad.t), (f1e) null, (y0e) null, (ngf) null, 0, 984), 536871936);
        int i2 = fxa.B0;
        p7 p7Var2 = p7Var;
        s1e s1e = r3;
        s1e s1e2 = new s1e((long) i2, 0, new igf(ixa.L1), (h1e) null, (ngf) null, Integer.valueOf(cad.Z1), (f1e) null, (y0e) null, (ngf) null, 0, 984);
        p7 p7Var3 = new p7(i2, s1e, 1073742848);
        int i3 = fxa.C0;
        p7 p7Var4 = p7Var3;
        s1e s1e3 = r3;
        s1e s1e4 = new s1e((long) i3, 0, new igf(ixa.M1), (h1e) null, (ngf) null, Integer.valueOf(cad.W1), (f1e) null, (y0e) null, (ngf) null, 0, 984);
        return CollectionsKt.listOf(p7Var2, p7Var4, new p7(i3, s1e3, -2147482624));
    }

    public final List a(rz1 rz1) {
        Uri parse;
        igf igf;
        igf igf2;
        rz1 rz12 = rz1;
        boolean z = rz12 instanceof h52;
        Lazy lazy = this.a;
        String str = null;
        if (z) {
            h52 h52 = (h52) rz12;
            a32 o = h52.o();
            boolean z2 = false;
            boolean z3 = o != null && o.K();
            xme xme = h52.i;
            if (z3) {
                g02 g02 = (g02) xme.getValue();
                if (g02 == null) {
                    return CollectionsKt.emptyList();
                }
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(new nmd(new igf(ixa.V1), (ogf) null, 0, 14));
                int i = fxa.i0;
                f02 f02 = f02.c;
                f02 f022 = g02.b;
                createListBuilder.add(new xpd(i, f022 == f02, new igf(ixa.k2), new igf(ixa.i2), 536879104));
                createListBuilder.add(new xpd(fxa.j0, f022 == f02.b, new igf(ixa.p2), new igf(ixa.m2), 1073750016));
                int ordinal = f022.ordinal();
                if (ordinal == 0) {
                    String j = tr1.j(((fz7) lazy.getValue()).e, "/");
                    igf igf3 = new igf(ixa.n2);
                    String str2 = g02.c;
                    ngf ngf = g02.d;
                    if (ngf != null) {
                        igf2 = ngf;
                    } else {
                        igf2 = (str2 == null || str2.length() == 0) ? new igf(ixa.S1) : new igf(ixa.T1);
                    }
                    Integer num = g02.e;
                    createListBuilder.add(new u7e(new s7e(j, str2, igf3, false, false, igf2, Integer.valueOf(num != null ? num.intValue() : jya.L))));
                } else if (ordinal == 1) {
                    String str3 = g02.c;
                    if (str3 == null || str3.length() == 0) {
                        createListBuilder.add(new tnb(new igf(ixa.Q1)));
                    } else {
                        createListBuilder.add(new u7e(new t7e(new mgf(str3), new igf(ixa.R1), Integer.valueOf(jya.L))));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.areEqual((Object) h52.q(), (Object) Boolean.FALSE)) {
                    createListBuilder.addAll(b());
                }
                return CollectionsKt.build(createListBuilder);
            }
            g02 g022 = (g02) xme.getValue();
            if (g022 == null) {
                return CollectionsKt.emptyList();
            }
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(new nmd(new igf(ixa.b2), (ogf) null, 0, 14));
            int i2 = fxa.i0;
            f02 f023 = f02.c;
            f02 f024 = g022.b;
            createListBuilder2.add(new xpd(i2, f024 == f023, new igf(ixa.k2), new igf(ixa.l2), 536879104));
            createListBuilder2.add(new xpd(fxa.j0, f024 == f02.b, new igf(ixa.p2), new igf(ixa.q2), 1073750016));
            int ordinal2 = f024.ordinal();
            Integer num2 = g022.e;
            String str4 = g022.c;
            if (ordinal2 == 0) {
                String j2 = tr1.j(((fz7) lazy.getValue()).e, "/");
                igf igf4 = new igf(ixa.n2);
                String str5 = g022.c;
                ngf ngf2 = g022.d;
                if (ngf2 != null) {
                    igf = ngf2;
                } else {
                    igf = (str5 == null || str5.length() == 0) ? new igf(ixa.Y1) : new igf(ixa.Z1);
                }
                s7e s7e = r10;
                s7e s7e2 = new s7e(j2, str5, igf4, true, false, igf, Integer.valueOf(num2 != null ? num2.intValue() : jya.L));
                createListBuilder2.add(new u7e(s7e));
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            } else if (str4 == null || str4.length() == 0) {
                createListBuilder2.add(new u7e(new r7e(new igf(ixa.W1), new igf(ixa.X1), Integer.valueOf(num2 != null ? num2.intValue() : jya.L))));
            } else {
                createListBuilder2.add(new u7e(new t7e(new mgf(str4), new igf(ixa.X1), Integer.valueOf(jya.L))));
            }
            if (Intrinsics.areEqual((Object) h52.q(), (Object) Boolean.FALSE)) {
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    createListBuilder2.addAll(b());
                }
            }
            return CollectionsKt.build(createListBuilder2);
        } else if (rz12 instanceof cm3) {
            h02 h02 = (h02) ((cm3) rz12).i.getValue();
            if (h02 == null) {
                return CollectionsKt.emptyList();
            }
            List createListBuilder3 = CollectionsKt.createListBuilder();
            createListBuilder3.add(new Object());
            String j3 = tr1.j(((fz7) lazy.getValue()).e, "/");
            String str6 = h02.b;
            if (!(str6 == null || (parse = Uri.parse(str6)) == null)) {
                str = parse.getLastPathSegment();
            }
            String str7 = str;
            igf igf5 = new igf(ixa.B0);
            Integer num3 = h02.d;
            createListBuilder3.add(new u7e(new s7e(j3, str7, igf5, false, true, h02.c, Integer.valueOf(num3 != null ? num3.intValue() : jya.L))));
            return CollectionsKt.build(createListBuilder3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
