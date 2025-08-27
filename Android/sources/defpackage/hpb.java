package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: hpb  reason: default package */
public final class hpb implements Handler.Callback {
    public Object X;
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final TreeMap c;
    public boolean o;
    public boolean v;
    public boolean w;
    public final Object x;
    public final Object y;
    public final Object z;

    public hpb(x54 x54, vs6 vs6, cb4 cb4) {
        this.X = x54;
        this.y = vs6;
        this.x = cb4;
        this.c = new TreeMap();
        this.b = t0g.m(this);
        this.z = new up(1);
    }

    public gpb a() {
        return new gpb(this, (cb4) this.x);
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (this.w) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                dpb dpb = (dpb) message.obj;
                long j = dpb.a;
                TreeMap treeMap = this.c;
                long j2 = dpb.b;
                Long l = (Long) treeMap.get(Long.valueOf(j2));
                if (l == null) {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                } else if (l.longValue() <= j) {
                    return true;
                } else {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                }
            default:
                if (this.w) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                epb epb = (epb) message.obj;
                long j3 = epb.a;
                TreeMap treeMap2 = this.c;
                long j4 = epb.b;
                Long l2 = (Long) treeMap2.get(Long.valueOf(j4));
                if (l2 == null) {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                } else if (l2.longValue() <= j3) {
                    return true;
                } else {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                }
        }
    }

    public hpb(y54 y54, rt6 rt6, cb4 cb4) {
        this.X = y54;
        this.y = rt6;
        this.x = cb4;
        this.c = new TreeMap();
        this.b = v0g.o(this);
        this.z = new vp(1);
    }
}
