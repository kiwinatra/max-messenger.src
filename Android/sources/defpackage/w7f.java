package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: w7f  reason: default package */
public abstract class w7f extends y7f implements uw8, vw8 {
    public static final ArrayList B0;
    public static final ArrayList C0;
    public final ArrayList A0 = new ArrayList();
    public final Object X;
    public final Object Y;
    public final ww8 Z;
    public final MediaRouter.RouteCategory v0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public final x7f z;
    public final ArrayList z0 = new ArrayList();

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        B0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        C0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public w7f(Context context, ow8 ow8) {
        super(context, new vs6(28, (Object) new ComponentName("android", y7f.class.getName())));
        this.z = ow8;
        Object systemService = context.getSystemService("media_router");
        this.X = systemService;
        this.Y = new yw8((s7f) this);
        this.Z = new ww8(this);
        this.v0 = ((MediaRouter) systemService).createRouteCategory(context.getResources().getString(wlc.mr_user_route_category_name), false);
        v();
    }

    public static v7f n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof v7f) {
            return (v7f) tag;
        }
        return null;
    }

    public final void a(int i, Object obj) {
        v7f n = n(obj);
        if (n != null) {
            n.a.k(i);
        }
    }

    public final void b(int i, Object obj) {
        v7f n = n(obj);
        if (n != null) {
            n.a.j(i);
        }
    }

    public final hw8 d(String str) {
        int k = k(str);
        if (k >= 0) {
            return new t7f(((u7f) this.z0.get(k)).a);
        }
        return null;
    }

    public final void f(pv8 pv8) {
        boolean z2;
        int i = 0;
        if (pv8 != null) {
            pv8.a();
            ArrayList b = pv8.b.b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z2 = pv8.b();
            i = i2;
        } else {
            z2 = false;
        }
        if (this.w0 != i || this.x0 != z2) {
            this.w0 = i;
            this.x0 = z2;
            v();
        }
    }

    public final boolean i(Object obj) {
        String str;
        String str2;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo m = m();
        String str3 = "";
        Context context = this.a;
        if (m == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            str = String.format(locale, "ROUTE_%08x", new Object[]{Integer.valueOf((name != null ? name.toString() : str3).hashCode())});
        }
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i;
                if (k(str2) < 0) {
                    break;
                }
                i++;
            }
            str = str2;
        }
        u7f u7f = new u7f(obj, str);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        l15 l15 = new l15(str, str3);
        o(u7f, l15);
        u7f.c = l15.g();
        this.z0.add(u7f);
        return true;
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((u7f) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((u7f) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(rw8 rw8) {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((v7f) arrayList.get(i)).a == rw8) {
                return i;
            }
        }
        return -1;
    }

    public abstract MediaRouter.RouteInfo m();

    public void o(u7f u7f, l15 l15) {
        int supportedTypes = ((MediaRouter.RouteInfo) u7f.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            l15.c(B0);
        }
        if ((supportedTypes & 2) != 0) {
            l15.c(C0);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) u7f.a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = (Bundle) l15.a;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public final void p(rw8 rw8) {
        iw8 c = rw8.c();
        Object obj = this.X;
        if (c != this) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.v0);
            v7f v7f = new v7f(rw8, createUserRoute);
            createUserRoute.setTag(v7f);
            createUserRoute.setVolumeCallback(this.Z);
            w(v7f);
            this.A0.add(v7f);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int j = j(((MediaRouter) obj).getSelectedRoute(8388611));
        if (j >= 0 && ((u7f) this.z0.get(j)).b.equals(rw8.b)) {
            rw8.l();
        }
    }

    public final void q(rw8 rw8) {
        int l;
        if (rw8.c() != this && (l = l(rw8)) >= 0) {
            v7f v7f = (v7f) this.A0.remove(l);
            ((MediaRouter.UserRouteInfo) v7f.b).setTag((Object) null);
            Object obj = v7f.b;
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) null);
            try {
                ((MediaRouter) this.X).removeUserRoute((MediaRouter.UserRouteInfo) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void r(rw8 rw8) {
        if (rw8.g()) {
            if (rw8.c() != this) {
                int l = l(rw8);
                if (l >= 0) {
                    t(((v7f) this.A0.get(l)).b);
                    return;
                }
                return;
            }
            int k = k(rw8.b);
            if (k >= 0) {
                t(((u7f) this.z0.get(k)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        int i = 0;
        while (i < size) {
            nv8 nv8 = ((u7f) arrayList.get(i)).c;
            if (nv8 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                } else if (arrayList2.contains(nv8)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList2.add(nv8);
                i++;
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        g(new jw8(arrayList2, false));
    }

    public abstract void t(Object obj);

    public abstract void u();

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.X;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z2 = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2 |= i(it.next());
        }
        if (z2) {
            s();
        }
    }

    public void w(v7f v7f) {
        int i;
        Object obj = v7f.b;
        rw8 rw8 = v7f.a;
        ((MediaRouter.UserRouteInfo) obj).setName(rw8.d);
        int i2 = rw8.k;
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) v7f.b;
        userRouteInfo.setPlaybackType(i2);
        userRouteInfo.setPlaybackStream(rw8.l);
        userRouteInfo.setVolume(rw8.o);
        userRouteInfo.setVolumeMax(rw8.p);
        if (rw8.e()) {
            if (sw8.d == null) {
                i = 0;
                userRouteInfo.setVolumeHandling(i);
            }
            sw8.c().getClass();
        }
        i = rw8.n;
        userRouteInfo.setVolumeHandling(i);
    }
}
