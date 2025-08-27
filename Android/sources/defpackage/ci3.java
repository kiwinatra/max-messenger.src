package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ci3  reason: default package */
public final class ci3 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Serializable e;

    public ci3(String str, String str2, boolean z, boolean z2) {
        this.a = 1;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public di3 a() {
        return new di3(this.b, this.c, (String[]) this.d, (String[]) this.e);
    }

    public void b(x03... x03Arr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(x03Arr.length);
            for (x03 x03 : x03Arr) {
                arrayList.add(x03.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void c(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.d = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void d() {
        if (this.b) {
            this.c = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public void e(ylf... ylfArr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(ylfArr.length);
            for (ylf ylf : ylfArr) {
                arrayList.add(ylf.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                f((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String[], java.io.Serializable] */
    public void f(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.e = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder p = tr1.p("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                p.append((String) this.d);
                p.append(", name=");
                return g63.l(p, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public ci3(int i) {
        this.a = i;
        switch (i) {
            case 2:
                return;
            default:
                this.b = true;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String[], java.io.Serializable] */
    public ci3(di3 di3) {
        this.a = 0;
        this.b = di3.a;
        this.d = di3.c;
        this.e = di3.d;
        this.c = di3.b;
    }
}
