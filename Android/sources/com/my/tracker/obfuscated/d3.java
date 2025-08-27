package com.my.tracker.obfuscated;

import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.n0;
import java.util.Map;

public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ((d.c) this.b).a((OwnedPurchasesResult) this.c);
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((d.c) this.b).a((String) this.c);
                return;
            case 1:
                a();
                return;
            default:
                ((n0.a) this.b).a((Map) this.c);
                return;
        }
    }
}
