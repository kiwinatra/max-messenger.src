package ru.ok.tamtam.android.db.room;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import kotlin.Metadata;
import one.me.android.OneMeApplication;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/db/room/OneMeRoomDatabase;", "Li6d;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class OneMeRoomDatabase extends i6d {
    public static volatile q0a m;

    public abstract xe4 A();

    public abstract iu4 B();

    public abstract oi5 C();

    public abstract xi5 D();

    public abstract bj5 E();

    public abstract nj5 F();

    public abstract xf9 G();

    public abstract aj9 H();

    public abstract gfa I();

    public abstract lfa J();

    public abstract oga K();

    public abstract ueb L();

    public abstract bsc M();

    public abstract kuc N();

    public abstract c6d O();

    public abstract ddd P();

    public abstract zqd Q();

    public abstract rne R();

    public abstract wqe S();

    public abstract kse T();

    public abstract hef U();

    public abstract dzf V();

    public abstract o4g W();

    public abstract WorkersQueueDao X();

    public final void a() {
        if (m != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            boolean k = k();
            boolean n = n();
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            String valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
            StringBuilder sb = new StringBuilder("NotMainThreadException(isOpenInternal=");
            sb.append(n);
            sb.append(", isInTransaction=");
            sb.append(k);
            sb.append(", curThread=");
            IllegalStateException illegalStateException = new IllegalStateException(wj6.n(sb, valueOf, ")"));
            int i = OneMeApplication.X;
            h2g.a.d().a("ONEME-8045", illegalStateException);
        }
    }

    public abstract pi t();

    public abstract ok u();

    public abstract fc1 v();

    public abstract jc2 w();

    public abstract hs2 x();

    public abstract sq3 y();

    public abstract ht3 z();
}
