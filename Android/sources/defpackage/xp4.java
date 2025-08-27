package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.rlottie.d;

/* renamed from: xp4  reason: default package */
public final /* synthetic */ class xp4 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((d) this.b).getClass();
                return true;
            case 1:
                et4 et4 = (et4) this.b;
                et4.getClass();
                int i = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = et4.e;
                if (i == 1) {
                    et4.h = true;
                    et4.l = Collections.unmodifiableList((List) message.obj);
                    boolean d = et4.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((ct4) it.next()).a(et4);
                    }
                    if (d) {
                        et4.a();
                    }
                } else if (i == 2) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = et4.f - i2;
                    et4.f = i4;
                    et4.g = i3;
                    if (i3 == 0 && i4 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((ct4) it2.next()).c();
                        }
                    }
                } else if (i == 3) {
                    at4 at4 = (at4) message.obj;
                    et4.l = Collections.unmodifiableList(at4.c);
                    boolean d2 = et4.d();
                    boolean z = at4.b;
                    rr4 rr4 = at4.a;
                    if (z) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((ct4) it3.next()).f(et4, rr4);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((ct4) it4.next()).e(rr4, at4.d);
                        }
                    }
                    if (d2) {
                        et4.a();
                    }
                } else {
                    throw new IllegalStateException();
                }
                return true;
            case 2:
                m56 m56 = (m56) this.b;
                Iterator it5 = ((CopyOnWriteArraySet) m56.f).iterator();
                while (it5.hasNext()) {
                    m08 m08 = (m08) it5.next();
                    if (!m08.d && m08.c) {
                        xq5 e = m08.b.e();
                        m08.b = new vq5(1);
                        m08.c = false;
                        ((k08) m56.e).f(m08.a, e);
                    }
                    if (((k7f) m56.d).a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                d23 d23 = (d23) this.b;
                Iterator it6 = ((CopyOnWriteArraySet) d23.o).iterator();
                while (it6.hasNext()) {
                    l08 l08 = (l08) it6.next();
                    if (l08.c) {
                        wq5 d3 = l08.b.d();
                        l08.b = new vq5(0);
                        l08.c = false;
                        ((j08) d23.c).g(l08.a, d3);
                    }
                    if (((j7f) d23.b).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 4:
                ox0 ox0 = (ox0) this.b;
                ox0.getClass();
                if (message.what == 1) {
                    try {
                        np8 np8 = (np8) ox0.b;
                        np8.w.l0(np8.c);
                    } catch (RemoteException unused) {
                        i8b.V("Error in sending flushCommandQueue");
                    }
                }
                return true;
            case 5:
                rp8 rp8 = (rp8) this.b;
                rp8.getClass();
                if (message.what == 1) {
                    tp8 tp8 = rp8.e;
                    tp8.L0(false, tp8.l);
                }
                return true;
            case 6:
                prf prf = (prf) this.b;
                if (prf.z && message.what != 4) {
                    return true;
                }
                try {
                    int i5 = message.what;
                    int i6 = 0;
                    if (i5 == 1) {
                        while (true) {
                            ArrayList arrayList = prf.k;
                            if (i6 >= arrayList.size()) {
                                return true;
                            }
                            ((msd) arrayList.get(i6)).start();
                            i6++;
                        }
                    } else if (i5 == 2) {
                        prf.f((dcd) message.obj);
                        return true;
                    } else if (i5 == 3) {
                        prf.c();
                        return true;
                    } else if (i5 != 4) {
                        return false;
                    } else {
                        prf.d(message.arg1, (ExportException) message.obj);
                        return true;
                    }
                } catch (ExportException e2) {
                    prf.d(2, e2);
                    return true;
                } catch (RuntimeException e3) {
                    prf.d(2, ExportException.e(e3));
                    return true;
                }
                break;
            default:
                meg meg = (meg) this.b;
                meg.getClass();
                int i7 = message.what;
                if (i7 == 1) {
                    meg.q.v("recconect requested");
                    meg.g.execute(new qof(12, meg));
                } else if (i7 == 2) {
                    xe8 xe8 = meg.q;
                    xe8.v("handleServerPingTimeout, timeout=" + meg.r);
                    synchronized (meg.b) {
                        try {
                            if (meg.c != null) {
                                meg.n.onFailedByPings();
                                ((ttc) meg.c).b(4000, "dispose");
                                meg.c = null;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    meg.d();
                } else {
                    throw new RuntimeException("unhandled message " + message.what);
                }
                return true;
        }
    }
}
