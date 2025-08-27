package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* renamed from: jb2  reason: default package */
public final /* synthetic */ class jb2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ j29 c;
    public final /* synthetic */ kb2 o;

    public /* synthetic */ jb2(Function2 function2, j29 j29, kb2 kb2, int i) {
        this.a = i;
        this.b = function2;
        this.c = j29;
        this.o = kb2;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.o.a);
                return true;
            default:
                this.b.invoke(this.c, this.o.a);
                return true;
        }
    }
}
