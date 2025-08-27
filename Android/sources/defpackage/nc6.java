package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.b;

/* renamed from: nc6  reason: default package */
public final /* synthetic */ class nc6 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ nc6(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.b.a.j();
                return;
            default:
                Intent intent = (Intent) obj;
                this.b.a.j();
                return;
        }
    }
}
