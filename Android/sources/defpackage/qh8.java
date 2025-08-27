package defpackage;

/* renamed from: qh8  reason: default package */
public final class qh8 extends wv5 {
    public final /* synthetic */ int b;
    public final ti8[] c;

    public /* synthetic */ qh8(ti8[] ti8Arr, int i) {
        this.b = i;
        this.c = ti8Arr;
    }

    public final void g(pye pye) {
        switch (this.b) {
            case 0:
                ph8 ph8 = new ph8(pye, this.c);
                pye.e(ph8);
                ph8.d();
                return;
            default:
                ti8[] ti8Arr = this.c;
                int length = ti8Arr.length;
                ki8 ki8 = new ki8(pye, length, length <= wv5.a ? new li8(length) : new ji8());
                pye.e(ki8);
                fz fzVar = ki8.v;
                int length2 = ti8Arr.length;
                int i = 0;
                while (i < length2) {
                    ti8 ti8 = ti8Arr[i];
                    if (!ki8.x && fzVar.get() == null) {
                        ti8.a(ki8);
                        i++;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
