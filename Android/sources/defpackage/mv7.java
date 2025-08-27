package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: mv7  reason: default package */
public abstract class mv7 extends Service implements jv7 {
    public final w28 a = new w28((jv7) this);

    public final ju7 getLifecycle() {
        return (lv7) this.a.b;
    }

    public final IBinder onBind(Intent intent) {
        this.a.N(hu7.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.N(hu7.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        hu7 hu7 = hu7.ON_STOP;
        w28 w28 = this.a;
        w28.N(hu7);
        w28.N(hu7.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        this.a.N(hu7.ON_START);
        super.onStart(intent, i);
    }
}
