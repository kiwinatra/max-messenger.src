package defpackage;

import android.view.Menu;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* renamed from: mag  reason: default package */
public final class mag implements Sequence {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mag(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new z69(1, (ViewGroup) this.b);
            case 1:
                return new rsf(new z69(1, (ViewGroup) this.b), m61.x0);
            default:
                return new z69(0, (Menu) this.b);
        }
    }
}
