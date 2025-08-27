package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: s75  reason: default package */
public final /* synthetic */ class s75 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ s75(int i, t75 t75) {
        this.a = 0;
        this.c = i;
        this.b = "one.me.webapp.domain.jsbridge.SuccessResponse.Status";
        this.o = t75;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.c;
                usd[] usdArr = new usd[i];
                for (int i2 = 0; i2 < i; i2++) {
                    usdArr[i2] = f6e.f(this.b + '.' + ((t75) this.o).e[i2], hye.r, new usd[0]);
                }
                return usdArr;
            case 1:
                return p3a.s(this.b, this.c, (l72) ((b33) this.o).a);
            default:
                return p3a.s(this.b, this.c, (l72) ((b33) this.o).a);
        }
    }

    public /* synthetic */ s75(String str, int i, int i2, Object obj) {
        this.a = i2;
        this.b = str;
        this.c = i;
        this.o = obj;
    }
}
