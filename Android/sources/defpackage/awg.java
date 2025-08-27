package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;

/* renamed from: awg  reason: default package */
public final class awg extends lwg {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public awg(Intent intent, Activity activity, int i) {
        this.b = intent;
        this.o = activity;
        this.c = i;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                if (intent != null) {
                    ((Activity) this.o).startActivityForResult(intent, this.c);
                    return;
                }
                return;
            default:
                Intent intent2 = this.b;
                if (intent2 != null) {
                    ((a) this.o).S2(intent2, this.c, (Bundle) null);
                    return;
                }
                return;
        }
    }

    public awg(Intent intent, a aVar) {
        this.b = intent;
        this.o = aVar;
        this.c = 127;
    }
}
