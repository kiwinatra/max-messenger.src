package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* renamed from: iqg  reason: default package */
public final class iqg implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;
    public final Object v;

    public /* synthetic */ iqg(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.v = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public final void run() {
        uta uta;
        hdb hdb;
        Lazy lazy;
        i6d i6d;
        Object obj = this.v;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.o;
        switch (this.a) {
            case 0:
                gud gud = (gud) obj3;
                gud.a = (hud) ((Lazy) obj4).getValue();
                try {
                    z68.c("jqg", "start processing task = %s", gud);
                    gud.z();
                    z68.c("jqg", "finished processing task = %s", gud);
                    return;
                } catch (Exception e) {
                    z68.f("jqg", "exception = " + e.getMessage() + ", task = " + gud, e);
                    uta = (uta) ((m95) obj);
                    uta.c(e, true);
                    gud.y();
                    if (gud instanceof hdb) {
                        hdb = (hdb) gud;
                        lazy = (Lazy) obj2;
                        ((eef) lazy.getValue()).c(hdb.getId());
                        tdf j = ((eef) lazy.getValue()).j(hdb.getId());
                        if (j != null && j.c >= 10) {
                            hdb.c();
                            break;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    uta.c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + hdb.getId() + " type " + hdb.getType(), th), true);
                    break;
                }
                break;
            case 1:
                qx1 qx1 = (qx1) obj3;
                if (qx1 != null) {
                    grg grg = (grg) obj;
                    ((rx1) grg.b).J0 = true;
                    qx1.b.c(false);
                    ((rx1) grg.b).J0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((m69) obj4).q(menuItem, (i79) null, 4);
                    return;
                }
                return;
            case 2:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((kc3) obj2).d();
                    eb3 eb3 = (eb3) obj;
                    ma3 ma3 = eb3.v;
                    if (ma3 == null) {
                        ((ya3) obj4).onError(new TimeoutException(p95.e(eb3.b, eb3.c)));
                        return;
                    }
                    ma3.j(new ch2(4, this));
                    return;
                }
                return;
            case 3:
                er7 er7 = (er7) obj;
                mm8 mm8 = (mm8) ((sy8) er7.b).v.get(((vm8) ((um8) obj3)).a.getBinder());
                if (mm8 != null) {
                    sy8 sy8 = (sy8) er7.b;
                    sy8.getClass();
                    HashMap hashMap = mm8.f;
                    String str = (String) obj2;
                    IBinder iBinder = (IBinder) obj4;
                    if (iBinder == null) {
                        try {
                            hashMap.remove(str);
                        } catch (Throwable th2) {
                            sy8.w = null;
                            throw th2;
                        }
                    } else {
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((v7b) it.next()).a) {
                                    it.remove();
                                }
                            }
                            if (list.size() == 0) {
                                hashMap.remove(str);
                            }
                        }
                    }
                    sy8.w = null;
                    return;
                }
                return;
            case 4:
                er7 er72 = (er7) obj;
                mm8 mm82 = (mm8) ((sy8) er72.b).v.get(((vm8) ((um8) obj3)).a.getBinder());
                Bundle bundle = (Bundle) obj2;
                if (mm82 == null) {
                    Objects.toString(bundle);
                    return;
                }
                sy8 sy82 = (sy8) er72.b;
                sy82.w = mm82;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                ((ResultReceiver) obj4).send(-1, (Bundle) null);
                sy82.w = null;
                return;
            case 5:
                rng.h((View) obj3, (vng) obj2, (h0h) obj4);
                ((ValueAnimator) obj).start();
                return;
            default:
                cyd cyd = (cyd) obj4;
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                h88 x = h88.x();
                String str2 = rpg.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                t64 t64 = (t64) obj2;
                sb.append(t64);
                sb.append(")");
                x.p(str2, sb.toString());
                rpg rpg = (rpg) obj;
                WorkDatabase workDatabase = rpg.a;
                WorkDatabase workDatabase2 = rpg.a;
                workDatabase.c();
                try {
                    xpg m = workDatabase2.y().m(uuid2);
                    if (m != null) {
                        if (m.b == xog.b) {
                            opg opg = new opg(uuid2, t64);
                            qpg x2 = workDatabase2.x();
                            i6d = (i6d) x2.a;
                            i6d.b();
                            i6d.c();
                            ((mpg) x2.b).c0(opg);
                            i6d.r();
                            i6d.l();
                        } else {
                            h88 x3 = h88.x();
                            x3.Z(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                        }
                        cyd.j((Object) null);
                        workDatabase2.r();
                        workDatabase2.l();
                        return;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th3) {
                    try {
                        h88.x().u(rpg.c, "Error updating Worker progress", th3);
                        cyd.k(th3);
                    } catch (Throwable th4) {
                        workDatabase2.l();
                        throw th4;
                    }
                }
        }
        ((eef) lazy.getValue()).d(hdb.getId());
        z68.c("jqg", "remove task because it cause too many exceptions: ".concat(iqg.class.getName()), new Object[0]);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((gud) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public iqg(gud gud, Lazy lazy, m95 m95, Lazy lazy2) {
        this.a = 0;
        this.b = gud;
        this.c = lazy;
        this.v = m95;
        this.o = lazy2;
    }

    public iqg(View view, vng vng, h0h h0h, ValueAnimator valueAnimator) {
        this.a = 5;
        this.b = view;
        this.c = vng;
        this.o = h0h;
        this.v = valueAnimator;
    }

    public iqg(er7 er7, vm8 vm8, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 4;
        this.v = er7;
        this.b = vm8;
        this.c = bundle;
        this.o = resultReceiver;
    }
}
