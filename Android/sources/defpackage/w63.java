package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w63  reason: default package */
public final class w63 extends j4b {
    public static final w63 F = new w63(0);
    public static final w63 G = new w63(1);
    public static final w63 H = new w63(2);
    public static final w63 I = new w63(3);
    public static final w63 J = new w63(4);
    public static final w63 K = new w63(5);
    public static final w63 L = new w63(6);
    public static final w63 M = new w63(7);
    public static final w63 N = new w63(8);
    public static final w63 O = new w63(9);
    public static final w63 P = new w63(10);
    public final /* synthetic */ int E;

    public /* synthetic */ w63(int i) {
        this.E = i;
    }

    public final boolean e(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return Intrinsics.areEqual((Object) (g83) obj, (Object) (g83) obj2);
            case 1:
                return Intrinsics.areEqual((Object) (n84) obj, (Object) (n84) obj2);
            case 2:
                return Intrinsics.areEqual((Object) (w16) obj, (Object) (w16) obj2);
            case 3:
                return Intrinsics.areEqual((Object) (y26) obj, (Object) (y26) obj2);
            case 4:
                return Intrinsics.areEqual(((lf5) obj).c, ((lf5) obj2).c);
            case 5:
                return Intrinsics.areEqual((Object) (um6) obj, (Object) (um6) obj2);
            case 6:
                return Intrinsics.areEqual((Object) (vm6) obj, (Object) (vm6) obj2);
            case 7:
                return Intrinsics.areEqual((Object) (ejf) obj, (Object) (ejf) obj2);
            case 8:
                wj6.t(obj);
                throw null;
            case 9:
                return Intrinsics.areEqual((Object) (tqd) obj, (Object) (tqd) obj2);
            case 10:
                return Intrinsics.areEqual((Object) (avf) obj, (Object) (avf) obj2);
            case 11:
                return Intrinsics.areEqual((Object) (hr8) obj, (Object) (hr8) obj2);
            case 12:
                return Intrinsics.areEqual((Object) (zs3) obj, (Object) (zs3) obj2);
            case 13:
                return Intrinsics.areEqual((Object) (xv3) obj, (Object) (xv3) obj2);
            case Protos.Attaches.Attach.LOCATION:
                return ((qq7) obj).equals((qq7) obj2);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((g7b) obj).equals((g7b) obj2);
            case 16:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case LangUtils.HASH_SEED:
                ykd ykd = (ykd) obj;
                ykd ykd2 = (ykd) obj2;
                if (!Intrinsics.areEqual((Object) new ws((Collection) ykd.b), (Object) new ws((Collection) ykd2.b))) {
                    return false;
                }
                return ykd.h(ykd2);
            case 18:
                return Intrinsics.areEqual((Object) (iqd) obj, (Object) (iqd) obj2);
            case 19:
                return ((lz7) obj).r((lz7) obj2);
            default:
                return ((oqe) obj).equals((oqe) obj2);
        }
    }

    public final boolean f(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return ((g83) obj).getId() == ((g83) obj2).getId();
            case 1:
                return ((n84) obj).a == ((n84) obj2).a;
            case 2:
                return Intrinsics.areEqual((Object) ((w16) obj).a, (Object) ((w16) obj2).a);
            case 3:
                return ((y26) obj).a() == ((y26) obj2).a();
            case 4:
                Object obj3 = ((lf5) obj).c;
                String b = ((pm6) obj3).a.a.b();
                Object obj4 = ((lf5) obj2).c;
                return Intrinsics.areEqual((Object) b, (Object) ((pm6) obj4).a.a.b()) && ((pm6) obj3).b == ((pm6) obj4).b;
            case 5:
                return Intrinsics.areEqual((Object) ((um6) obj).a(), (Object) ((um6) obj2).a());
            case 6:
                return Intrinsics.areEqual((Object) ((vm6) obj).a(), (Object) ((vm6) obj2).a());
            case 7:
                return ((ejf) obj).a == ((ejf) obj2).a;
            case 8:
                wj6.t(obj);
                throw null;
            case 9:
                return ((tqd) obj).a.a == ((tqd) obj2).a.a;
            case 10:
                return ((avf) obj).a() == ((avf) obj2).a();
            case 11:
                return ((hr8) obj).f((hr8) obj2);
            case 12:
                return ((zs3) obj).a == ((zs3) obj2).a;
            case 13:
                return Intrinsics.areEqual((Object) (xv3) obj, (Object) (xv3) obj2);
            case Protos.Attaches.Attach.LOCATION:
                return ((qq7) obj).a.equals(((qq7) obj2).a);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((g7b) obj).a == ((g7b) obj2).a;
            case 16:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case LangUtils.HASH_SEED:
                ykd ykd = (ykd) obj;
                ykd ykd2 = (ykd) obj2;
                if (ykd.a != ykd2.a) {
                    return false;
                }
                return ykd.n(ykd2);
            case 18:
                return Intrinsics.areEqual((Object) ((iqd) obj).a, (Object) ((iqd) obj2).a);
            case 19:
                return ((lz7) obj).f((lz7) obj2);
            default:
                return ((oqe) obj).a == ((oqe) obj2).a;
        }
    }

    public Object x(Object obj, Object obj2) {
        boolean z;
        switch (this.E) {
            case 5:
                um6 um6 = (um6) obj;
                um6 um62 = (um6) obj2;
                sm6 sm6 = um6 instanceof sm6 ? (sm6) um6 : null;
                if (sm6 == null) {
                    return null;
                }
                sm6 sm62 = um62 instanceof sm6 ? (sm6) um62 : null;
                if (sm62 == null) {
                    return null;
                }
                Bundle bundle = new Bundle();
                int i = sm6.c;
                int i2 = sm62.c;
                boolean z2 = true;
                if (i != i2) {
                    bundle.putInt("selectionNumber", i2);
                    z = true;
                } else {
                    z = false;
                }
                Uri uri = sm6.f;
                Uri uri2 = sm62.f;
                if (!Intrinsics.areEqual((Object) uri, (Object) uri2)) {
                    bundle.putParcelable("overlay", uri2);
                    z = true;
                }
                p4g p4g = sm6.j;
                p4g p4g2 = sm62.j;
                if (!Intrinsics.areEqual((Object) p4g, (Object) p4g2)) {
                    bundle.putString("videoConvertOptions", String.valueOf(p4g2));
                    z = true;
                }
                dfb dfb = sm6.k;
                dfb dfb2 = sm62.k;
                if (!Intrinsics.areEqual((Object) dfb, (Object) dfb2)) {
                    bundle.putParcelable("photoEditorOptions", dfb2);
                } else {
                    z2 = z;
                }
                if (z2) {
                    return bundle;
                }
                return null;
            case 8:
                wj6.t(obj);
                throw null;
            case Protos.Attaches.Attach.LOCATION:
                qq7 qq7 = (qq7) obj;
                qq7 qq72 = (qq7) obj2;
                if (!qq7.a.equals(qq72.a) || !qq7.b.equals(qq72.b) || !TextUtils.equals(qq7.c, qq72.c) || qq7.d != qq72.d) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (qq7.e != qq72.e) {
                    arrayList.add("IS_ACTIVE");
                }
                if (qq7.f == qq72.f) {
                    return arrayList;
                }
                arrayList.add("EDIT");
                return arrayList;
            case 19:
                return ((lz7) obj).l((lz7) obj2);
            default:
                return super.x(obj, obj2);
        }
    }
}
