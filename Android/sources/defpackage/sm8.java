package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: sm8  reason: default package */
public final class sm8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ sm8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.v = obj5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((vm8) ((um8) this.b)).a.getBinder();
                er7 er7 = (er7) this.w;
                mm8 mm8 = (mm8) ((sy8) er7.b).v.get(binder);
                if (mm8 != null) {
                    sy8 sy8 = (sy8) er7.b;
                    sy8.getClass();
                    HashMap hashMap = mm8.f;
                    String str = (String) this.c;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        IBinder iBinder = (IBinder) this.o;
                        Bundle bundle = (Bundle) this.v;
                        if (hasNext) {
                            v7b v7b = (v7b) it.next();
                            if (iBinder == v7b.a) {
                                Bundle bundle2 = (Bundle) v7b.b;
                                if (bundle != bundle2) {
                                    if (bundle == null) {
                                        n79.o(bundle2);
                                        if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle2 == null) {
                                        if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            list.add(new v7b(iBinder, bundle));
                            hashMap.put(str, list);
                            o67 o67 = new o67(sy8, str, mm8, str, bundle);
                            sy8.w = mm8;
                            if (bundle == null) {
                                o67.d();
                            } else {
                                o67.c = 1;
                                o67.d();
                            }
                            sy8.w = null;
                            if (o67.b) {
                                sy8.w = null;
                                return;
                            }
                            throw new IllegalStateException(rae.q(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), mm8.a, " id=", str));
                        }
                    }
                } else {
                    return;
                }
            case 1:
                j6e j6e = (j6e) this.w;
                ArrayList arrayList = j6e.y;
                WeakHashMap weakHashMap = gag.a;
                View view = (View) this.b;
                arrayList.remove(v9g.k(view));
                j6e.z.add(new i6e(view, (ViewGroup) view.getParent()));
                ((ViewGroup) view.getParent()).removeView(view);
                if (j6e.y.size() == 0) {
                    View view2 = (View) this.c;
                    view2.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.o);
                    view2.setVisibility(4);
                    ((j50) this.v).g();
                    return;
                }
                return;
            default:
                try {
                    if (!(((cyd) this.b).a instanceof u0)) {
                        String uuid = ((UUID) this.c).toString();
                        xpg m = ((vog) this.w).c.m(uuid);
                        if (m == null || m.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((rvb) ((vog) this.w).b).g(uuid, (o96) this.o);
                        String str2 = m.a;
                        int i = m.t;
                        o96 o96 = (o96) this.o;
                        Intent intent = new Intent((Context) this.v, SystemForegroundService.class);
                        intent.setAction("ACTION_NOTIFY");
                        intent.putExtra("KEY_NOTIFICATION_ID", o96.a);
                        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", o96.b);
                        intent.putExtra("KEY_NOTIFICATION", o96.c);
                        intent.putExtra("KEY_WORKSPEC_ID", str2);
                        intent.putExtra("KEY_GENERATION", i);
                        ((Context) this.v).startService(intent);
                    }
                    ((cyd) this.b).j((Object) null);
                    return;
                } catch (Throwable th) {
                    ((cyd) this.b).k(th);
                    return;
                }
        }
    }
}
