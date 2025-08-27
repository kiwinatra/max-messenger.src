package defpackage;

import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: ykb  reason: default package */
public final class ykb implements by9, qk3, r97, ima {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ykb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void k(ykb ykb) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) ykb.b).iterator();
        while (it.hasNext()) {
            arrayList.add(((icc) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public void a() {
        foe foe = (foe) this.b;
        foe.b(foe.f, new Exception("onDownloadFailed"));
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                z68.f(((vud) this.b).v, "Error while runAfterDelay", (Throwable) obj);
                return;
            case 8:
                Integer num = (Integer) obj;
                z68.c(((h5f) this.b).b, "Connection restored", new Object[0]);
                return;
            default:
                ((UploadDraftMediaWorker) this.b).e((Throwable) obj);
                return;
        }
    }

    public void c(String str) {
        foe foe = (foe) this.b;
        foe.c(foe.f, new File(str));
    }

    public void d() {
        ((Function0) this.b).invoke();
    }

    public boolean e(Class cls) {
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((icc) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        ((Function0) this.b).invoke();
    }

    public icc g(Class cls) {
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            icc icc = (icc) it.next();
            if (icc.getClass() == cls) {
                return icc;
            }
        }
        return null;
    }

    public ArrayList h(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            icc icc = (icc) it.next();
            if (cls.isAssignableFrom(icc.getClass())) {
                arrayList.add(icc);
            }
        }
        return arrayList;
    }

    public Pattern i(String str) {
        Object obj;
        ni0 ni0 = (ni0) this.b;
        synchronized (ni0) {
            obj = ((wzc) ni0.c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            ni0 ni02 = (ni0) this.b;
            synchronized (ni02) {
                ((wzc) ni02.c).put(str, pattern);
            }
        }
        return pattern;
    }

    public void j() {
        ((Function0) this.b).invoke();
    }

    public void p() {
        ((Function0) this.b).invoke();
    }

    public void q(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    public void v() {
        ((Function0) this.b).invoke();
    }

    public void w() {
        ((Function0) this.b).invoke();
    }

    public void x() {
        ((Function0) this.b).invoke();
    }

    public ykb(jc1 jc1) {
        this.a = 3;
        this.b = new z3a(14, jc1.l);
    }

    public ykb() {
        this.a = 11;
        this.b = new LinkedHashMap();
    }

    public ykb(int i) {
        this.a = 2;
        ni0 ni0 = new ni0(16, false);
        ni0.b = i;
        ni0.c = new wzc(ni0, ((i * 4) / 3) + 1);
        this.b = ni0;
    }

    public ykb(List list) {
        this.a = 1;
        this.b = new ArrayList(list);
    }

    public ykb(re3 re3) {
        this.a = 9;
        this.b = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), re3);
    }
}
