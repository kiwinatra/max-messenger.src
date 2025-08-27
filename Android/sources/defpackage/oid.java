package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oid  reason: default package */
public final class oid {
    public static final oid c;
    public final yl a;
    public final hbe b;

    static {
        oid oid = new oid(hbe.d, yl.f);
        c = oid;
        oid.d(Uri.parse("https://api.odnoklassniki.ru"));
    }

    public oid(hbe hbe, yl ylVar) {
        this.b = hbe;
        this.a = ylVar;
    }

    public final Uri a() {
        hbe hbe = this.b;
        int binarySearch = Arrays.binarySearch(hbe.a, "api");
        return (Uri) (binarySearch < 0 ? null : hbe.b[binarySearch]);
    }

    public final oid b(String str) {
        yl ylVar = this.a;
        if (Objects.equals(str, ylVar.a)) {
            return this;
        }
        String str2 = ylVar.d;
        if (str2 != null) {
            throw new IllegalStateException("Some session key");
        } else if (ylVar.c == null) {
            if (!Intrinsics.areEqual((Object) str, (Object) ylVar.a)) {
                ylVar = new yl(str, str2, ylVar.e);
            }
            return new oid(this.b, ylVar);
        } else {
            throw new IllegalStateException("Some auth token");
        }
    }

    public final oid c(String str, String str2) {
        yl ylVar = this.a;
        boolean equals = Objects.equals(str, ylVar.d);
        String str3 = ylVar.e;
        if (equals && Objects.equals(str2, str3)) {
            return this;
        }
        String str4 = ylVar.a;
        if (str4 != null) {
            if (!Intrinsics.areEqual((Object) str, (Object) ylVar.d) || !Intrinsics.areEqual((Object) str2, (Object) str3)) {
                ylVar = new yl(str4, str, str2);
            }
            return new oid(this.b, ylVar);
        }
        throw new IllegalStateException("No app key");
    }

    public final oid d(Uri uri) {
        hbe hbe;
        hbe hbe2 = this.b;
        Comparable[] comparableArr = hbe2.a;
        int binarySearch = Arrays.binarySearch(comparableArr, "api");
        Object[] objArr = hbe2.b;
        if (binarySearch < 0) {
            int i = -binarySearch;
            int i2 = i - 1;
            Class<?> componentType = comparableArr.getClass().getComponentType();
            int i3 = hbe2.c + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(componentType, i3);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i2);
            comparableArr2[i2] = "api";
            System.arraycopy(comparableArr, i2, comparableArr2, i, comparableArr.length - i2);
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr2[i2] = uri;
            System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
            hbe = new hbe(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[binarySearch], uri)) {
            hbe = hbe2;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[binarySearch] = uri;
            hbe = new hbe(comparableArr, copyOf);
        }
        return hbe == hbe2 ? this : new oid(hbe, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oid.class != obj.getClass()) {
            return false;
        }
        oid oid = (oid) obj;
        return this.a.equals(oid.a) && this.b.equals(oid.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
