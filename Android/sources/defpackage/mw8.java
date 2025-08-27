package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mw8  reason: default package */
public final class mw8 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ow8 c;

    public mw8(ow8 ow8) {
        this.c = ow8;
    }

    public static void a(lw8 lw8, int i, Object obj) {
        sw8 sw8 = lw8.a;
        int i2 = 65280 & i;
        q8 q8Var = lw8.b;
        if (i2 == 256) {
            rw8 rw8 = (i == 264 || i == 262) ? (rw8) ((v7b) obj).b : (rw8) obj;
            if (i == 264 || i == 262) {
                rw8 rw82 = (rw8) ((v7b) obj).a;
            }
            if (rw8 == null) {
                return;
            }
            if ((lw8.d & 2) != 0 || rw8.h(lw8.c)) {
                switch (i) {
                    case 257:
                        q8Var.B();
                        return;
                    case 258:
                        q8Var.D();
                        return;
                    case 259:
                        q8Var.C(rw8);
                        return;
                    case 260:
                        q8Var.G(rw8);
                        return;
                    case 261:
                        q8Var.getClass();
                        return;
                    case 262:
                        q8Var.E(rw8);
                        return;
                    case 263:
                        q8Var.F();
                        return;
                    case 264:
                        q8Var.E(rw8);
                        return;
                    default:
                        return;
                }
            } else {
                sw8.c();
            }
        } else if (i2 == 512) {
            qw8 qw8 = (qw8) obj;
            switch (i) {
                case 513:
                    q8Var.y();
                    return;
                case 514:
                    q8Var.A();
                    return;
                case 515:
                    q8Var.z();
                    return;
                default:
                    return;
            }
        } else if (i2 == 768 && i == 769) {
            rae.w(obj);
            q8Var.H();
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        int l;
        ArrayList arrayList = this.a;
        int i = message.what;
        Object obj = message.obj;
        ow8 ow8 = this.c;
        if (i == 259 && ow8.f().c.equals(((rw8) obj).c)) {
            ow8.n(true);
        }
        ArrayList arrayList2 = this.b;
        if (i == 262) {
            rw8 rw8 = (rw8) ((v7b) obj).b;
            ow8.c.r(rw8);
            if (ow8.p != null && rw8.d()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ow8.c.q((rw8) it.next());
                }
                arrayList2.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    ow8.c.p((rw8) obj);
                    break;
                case 258:
                    ow8.c.q((rw8) obj);
                    break;
                case 259:
                    s7f s7f = ow8.c;
                    rw8 rw82 = (rw8) obj;
                    s7f.getClass();
                    if (rw82.c() != s7f && (l = s7f.l(rw82)) >= 0) {
                        s7f.w((v7f) s7f.A0.get(l));
                        break;
                    }
            }
        } else {
            rw8 rw83 = (rw8) ((v7b) obj).b;
            arrayList2.add(rw83);
            ow8.c.p(rw83);
            ow8.c.r(rw83);
        }
        try {
            int size = ow8.f.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ArrayList arrayList3 = ow8.f;
                    sw8 sw8 = (sw8) ((WeakReference) arrayList3.get(size)).get();
                    if (sw8 == null) {
                        arrayList3.remove(size);
                    } else {
                        arrayList.addAll(sw8.b);
                    }
                } else {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a((lw8) arrayList.get(i2), i, obj);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
