package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator;

/* renamed from: sb0  reason: default package */
public final class sb0 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = v0g.p((xp4) null);
    public Object f;
    public Object g;

    public sb0(Context context, rt3 rt3, l3d l3d) {
        this.b = context.getApplicationContext();
        this.c = rt3;
        this.d = l3d;
    }

    public tb0 a() {
        String str = this.a == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            str = tr1.j(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new tb0(this.a, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.b, (String) this.c, (String) this.d, (String) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b() {
        int a2 = ((l3d) this.d).a((Context) this.b);
        if (this.a != a2) {
            this.a = a2;
            ((et4) ((rt3) this.c).b).b(this, a2);
        }
    }

    public boolean c() {
        return (this.a < ((List) this.b).size()) || (((ArrayList) this.d).isEmpty() ^ true);
    }

    public int d() {
        l3d l3d = (l3d) this.d;
        Context context = (Context) this.b;
        this.a = l3d.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = l3d.a;
        if ((i & 1) != 0) {
            if (v0g.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                n3d n3d = new n3d(this);
                this.g = n3d;
                connectivityManager.registerDefaultNetworkCallback(n3d);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            if (v0g.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        ao aoVar = new ao(13, this);
        this.f = aoVar;
        context.registerReceiver(aoVar, intentFilter, (String) null, (Handler) this.e);
        return this.a;
    }

    public void e() {
        float f2;
        if (((LinearLayoutManager) this.d).p != 0) {
            z68.f("sb0", "updateCurrentOffset: failed, only HORIZONTAL orientation for LinearLayoutManager is supported", (Throwable) null);
            return;
        }
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) this.b;
        int j = ((tyc) this.e).j();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.d;
        float f3 = (float) (linearLayoutManager instanceof GridLayoutManager ? ((GridLayoutManager) linearLayoutManager).F : 1);
        float f4 = ((float) j) / f3;
        int i = this.a;
        float f5 = ((float) i) / f3;
        int i2 = 0;
        int round = Math.round(f4 - f5) + (i > 0 ? 1 : 0);
        scrollingPagerIndicator.setDotCount(round);
        int W0 = ((LinearLayoutManager) this.d).W0();
        int j2 = ((tyc) this.e).j();
        if (W0 >= j2 && j2 != 0) {
            W0 %= j2;
        }
        if (W0 != -1) {
            int X0 = ((LinearLayoutManager) this.d).X0();
            if (W0 != X0) {
                View r = ((LinearLayoutManager) this.d).r(X0);
                if (r != null) {
                    f2 = 1.0f - (((r.getX() + ((float) r.getMeasuredWidth())) - ((float) ((RecyclerView) this.c).getMeasuredWidth())) / ((float) r.getMeasuredWidth()));
                } else {
                    return;
                }
            } else {
                f2 = 0.0f;
            }
            int i3 = this.a;
            if (W0 >= i3) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this.d;
                int i4 = linearLayoutManager2 instanceof GridLayoutManager ? ((GridLayoutManager) linearLayoutManager2).F : 1;
                i2 = i4 == 1 ? W0 - (i3 - 1) : (W0 / i4) - 1;
            }
            if (f2 >= c44.DEFAULT_ASPECT_RATIO && f2 <= 1.0f && i2 >= 0 && i2 < round) {
                ((ScrollingPagerIndicator) this.b).d(f2, i2);
            }
        }
    }
}
