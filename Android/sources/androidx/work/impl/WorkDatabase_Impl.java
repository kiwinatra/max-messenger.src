package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile ypg m;
    public volatile dm4 n;
    public volatile aqg o;
    public volatile m7f p;
    public volatile npg q;
    public volatile qpg r;
    public volatile wsb s;

    public final uj7 e() {
        return new uj7(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final f3f f(t74 t74) {
        return t74.c.c(new g5b(t74.a, t74.b, new b7d(t74, new eya(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    public final List g() {
        return Arrays.asList(new pq9[]{new qq9(13, 14, 17), new dya(2)});
    }

    public final Set i() {
        return new HashSet();
    }

    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(ypg.class, Collections.emptyList());
        hashMap.put(dm4.class, Collections.emptyList());
        hashMap.put(aqg.class, Collections.emptyList());
        hashMap.put(m7f.class, Collections.emptyList());
        hashMap.put(npg.class, Collections.emptyList());
        hashMap.put(qpg.class, Collections.emptyList());
        hashMap.put(wsb.class, Collections.emptyList());
        hashMap.put(fqc.class, Collections.emptyList());
        return hashMap;
    }

    public final dm4 t() {
        dm4 dm4;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new dm4((i6d) this);
                }
                dm4 = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dm4;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [wsb, java.lang.Object] */
    public final wsb u() {
        wsb wsb;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new li(this, 18);
                    this.s = obj;
                }
                wsb = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wsb;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, m7f] */
    public final m7f v() {
        m7f m7f;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new li(this, 27);
                    obj.c = new t5d(this, 15);
                    obj.o = new t5d(this, 16);
                    this.p = obj;
                }
                m7f = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m7f;
    }

    public final npg w() {
        npg npg;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new npg((i6d) this, 0);
                }
                npg = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return npg;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [qpg, java.lang.Object] */
    public final qpg x() {
        qpg qpg;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new mpg(this, 1);
                    obj.c = new ppg(this, 0);
                    obj.o = new ppg(this, 1);
                    this.r = obj;
                }
                qpg = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qpg;
    }

    public final ypg y() {
        ypg ypg;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new ypg(this);
                }
                ypg = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ypg;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [aqg, java.lang.Object] */
    public final aqg z() {
        aqg aqg;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new mpg(this, 3);
                    obj.c = new ppg(this, 13);
                    this.o = obj;
                }
                aqg = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aqg;
    }
}
