package defpackage;

import androidx.camera.video.internal.encoder.EncodeException;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: u9a  reason: default package */
public final class u9a implements g69, zi6, fc3, x34, p17, r55, sf6, wv9, op7, pyc {
    public static u9a b;
    public static final u9a c = new u9a(1);
    public static final u9a o = new u9a(2);
    public static final u9a v = new u9a(3);
    public static final u9a w = new u9a(4);
    public static final u9a x = new u9a(5);
    public static final u9a y = new u9a(6);
    public final /* synthetic */ int a;

    public /* synthetic */ u9a(int i) {
        this.a = i;
    }

    public static synchronized u9a a() {
        u9a u9a;
        synchronized (u9a.class) {
            try {
                if (b == null) {
                    b = new u9a(0);
                }
                u9a = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return u9a;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Iterable<jb1> iterable = (List) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (jb1 jb1 : iterable) {
                    arrayList.add(new gb1(jb1.c, jb1.a, jb1.b));
                }
                return arrayList;
            case 2:
                iu4 iu4 = (iu4) obj;
                iu4.getClass();
                return new bi8(new hu4(iu4, d7d.a(0, "SELECT * FROM draft_uploads"), 0));
            default:
                return ((OneMeRoomDatabase) obj).J();
        }
    }

    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (mb3 mb3 : componentRegistrar.getComponents()) {
            String str = mb3.a;
            if (str != null) {
                ba baVar = new ba(21, str, mb3);
                mb3 = new mb3(str, mb3.b, mb3.c, mb3.d, mb3.e, baVar, mb3.g);
            }
            arrayList.add(mb3);
        }
        return arrayList;
    }

    public void d(EncodeException encodeException) {
    }

    public n8b f() {
        return new n17(j17.n, (b17) null);
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(qp0.class, Executor.class)));
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        String str = unsatisfiedLinkError instanceof mfe ? ((mfe) unsatisfiedLinkError).a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (zvf zvf : nfeArr) {
            if (zvf instanceof zvf) {
                zvf zvf2 = zvf;
                zvf.b();
                zvf2.getClass();
                File file = zvf2.a;
                try {
                    w6f.d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    public Object m(pf9 pf9) {
        return Integer.valueOf(ryg.c0(pf9));
    }

    public void n() {
    }

    public void o(g55 g55) {
    }

    public Object parse(sp7 sp7) {
        return kr7.E(sp7);
    }

    public void s(rt3 rt3) {
    }

    public n8b w(j17 j17, b17 b17) {
        return new n17(j17, b17);
    }
}
