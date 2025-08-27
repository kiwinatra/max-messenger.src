package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ty  reason: default package */
public abstract class ty {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ty(int i) {
        this.a = i;
    }

    public static void c(String str) {
        if (!StringsKt__StringsJVMKt.equals(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static String f(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
        return sb.toString();
    }

    public static String g(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static int x(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static int y(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public void a(int i) {
        switch (this.a) {
            case 2:
                this.b = i | this.b;
                return;
            default:
                this.b = i | this.b;
                return;
        }
    }

    public abstract void b(af6 af6);

    public abstract void e(af6 af6);

    public boolean h(int i) {
        switch (this.a) {
            case 2:
                return (this.b & i) == i;
            default:
                return (this.b & i) == i;
        }
    }

    public abstract int i();

    public abstract int j();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract void o();

    public abstract void q(af6 af6);

    public abstract void r(af6 af6, int i, int i2);

    public abstract void s(af6 af6);

    public String toString() {
        switch (this.a) {
            case 0:
                return f(this.b);
            case 1:
                return g(this.b);
            default:
                return super.toString();
        }
    }

    public abstract void u(af6 af6);

    public abstract void v(af6 af6, int i, int i2);

    public abstract a7d w(af6 af6);

    public /* synthetic */ ty(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
