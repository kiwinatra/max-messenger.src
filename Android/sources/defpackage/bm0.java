package defpackage;

import android.net.Uri;
import kotlin.ranges.RangesKt;

/* renamed from: bm0  reason: default package */
public final class bm0 implements am {
    public static final Uri v = um.a("batch.executeV2");
    public final String a;
    public final km[] b;
    public final int c;
    public final grg o;

    public bm0(String str, km[] kmVarArr, int i) {
        this.a = str;
        this.b = kmVarArr;
        this.c = i;
        this.o = new grg(4, kmVarArr);
    }

    public final op7 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        int i = this.c;
        int i2 = 1;
        if (1 <= i && i < 257) {
            return i;
        }
        for (km kmVar : this.b) {
            i2 = RangesKt.coerceAtLeast(i2, kmVar.b.getPriority());
        }
        return i2;
    }

    public final mm getScope() {
        km[] kmVarArr = this.b;
        int length = kmVarArr.length;
        mm mmVar = mm.a;
        if (length == 0) {
            return mmVar;
        }
        if (length == 1) {
            return kmVarArr[0].b.getScope();
        }
        for (km kmVar : kmVarArr) {
            mm scope = kmVar.b.getScope();
            mmVar.getClass();
            mmVar = (mm) RangesKt.coerceAtLeast(mmVar, scope);
            if (kmVar.b.getScopeAfter() != nm.a) {
                break;
            }
        }
        return mmVar;
    }

    public final nm getScopeAfter() {
        km[] kmVarArr = this.b;
        int length = kmVarArr.length;
        nm nmVar = nm.a;
        if (length == 0) {
            return nmVar;
        }
        if (length == 1) {
            return kmVarArr[0].b.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            nm scopeAfter = kmVarArr[i].b.getScopeAfter();
            if (scopeAfter != nmVar) {
                return scopeAfter;
            }
        }
        return nmVar;
    }

    public final Uri getUri() {
        return v;
    }

    public final boolean shouldGzip() {
        for (km kmVar : this.b) {
            if (kmVar.b.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldPost() {
        return true;
    }

    public final void writeParams(zp7 zp7) {
        String str = this.a;
        if (str != null) {
            zp7.h0("id");
            zp7.i(str);
        }
        zp7.h0("methods");
        zp7.v();
        for (km kmVar : this.b) {
            am amVar = kmVar.b;
            zp7.t();
            zp7.h0(kmVar.e);
            zp7.t();
            if (amVar.willWriteParams()) {
                zp7.h0("params");
                zp7.t();
                amVar.writeParams(zp7);
                zp7.r();
            }
            if (amVar.willWriteSupplyParams()) {
                zp7.h0("supplyParams");
                zp7.t();
                amVar.writeSupplyParams(zp7);
                zp7.r();
            }
            if (kmVar.c) {
                zp7.h0("onError");
                zp7.i("SKIP");
            }
            String str2 = kmVar.d;
            if (str2 != null) {
                zp7.h0("condition");
                zp7.i(str2);
            }
            zp7.r();
            zp7.r();
        }
        zp7.u();
    }
}
