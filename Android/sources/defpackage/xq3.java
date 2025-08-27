package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: xq3  reason: default package */
public final /* synthetic */ class xq3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq3 b;
    public final /* synthetic */ dl3 c;

    public /* synthetic */ xq3(zq3 zq3, dl3 dl3, int i) {
        this.a = i;
        this.b = zq3;
        this.c = dl3;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Function1 function1 = this.b.o;
                dl3 dl3 = this.c;
                function1.invoke(new pi9(dl3.k, dl3));
                return;
            default:
                Function1 function12 = this.b.o;
                dl3 dl32 = this.c;
                function12.invoke(new qi9(dl32.k, dl32));
                return;
        }
    }
}
