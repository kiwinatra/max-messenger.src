package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: a00  reason: default package */
public final class a00 extends ArrayList {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 b(pf9 pf9) {
        ? arrayList = new ArrayList();
        int t0 = pf9.t0();
        for (int i = 0; i < t0; i++) {
            arrayList.add(gz.b(pf9));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 d(pf9 pf9) {
        int t0 = pf9.t0();
        ? arrayList = new ArrayList(t0);
        for (int i = 0; i < t0; i++) {
            arrayList.add(b32.a(pf9));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 e(pf9 pf9) {
        int X = ryg.X(pf9);
        ? arrayList = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            fo3 e = fo3.e(pf9);
            fo3 fo3 = do3.y0;
            if (e == null) {
                Objects.requireNonNull(fo3, "defaultObj");
                e = fo3;
            }
            arrayList.add(e);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 f(pf9 pf9) {
        int X = ryg.X(pf9);
        ? arrayList = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            arrayList.add(Long.valueOf(ryg.d0(pf9, 0)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 g(pf9 pf9) {
        ? arrayList = new ArrayList();
        int X = ryg.X(pf9);
        for (int i = 0; i < X; i++) {
            arrayList.add(z79.a(pf9));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 l(pf9 pf9) {
        int X = ryg.X(pf9);
        ? arrayList = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            int e0 = ryg.e0(pf9);
            b89 b89 = null;
            String str = null;
            ArrayList arrayList2 = null;
            long j = 0;
            for (int i2 = 0; i2 < e0; i2++) {
                String A0 = pf9.A0();
                A0.getClass();
                char c = 65535;
                switch (A0.hashCode()) {
                    case -1361631597:
                        if (A0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -191501435:
                        if (A0.equals("feedback")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 357304895:
                        if (A0.equals("highlights")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 954925063:
                        if (A0.equals("message")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        j = pf9.x0();
                        break;
                    case 1:
                        str = pf9.A0();
                        break;
                    case 2:
                        int X2 = ryg.X(pf9);
                        ArrayList arrayList3 = new ArrayList(X2);
                        for (int i3 = 0; i3 < X2; i3++) {
                            arrayList3.add(pf9.A0());
                        }
                        arrayList2 = arrayList3;
                        break;
                    case 3:
                        b89 = z79.a(pf9);
                        break;
                    default:
                        pf9.A();
                        break;
                }
            }
            he9 he9 = new he9(str, arrayList2, j, b89);
            if (b89 != null) {
                arrayList.add(he9);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a00, java.util.AbstractCollection, java.util.ArrayList] */
    public static a00 m(pf9 pf9) {
        int X = ryg.X(pf9);
        ? arrayList = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            arrayList.add(ryg.g0(pf9));
        }
        return arrayList;
    }
}
