package defpackage;

import android.media.MediaDrm;

/* renamed from: se6  reason: default package */
public final /* synthetic */ class se6 implements MediaDrm.OnEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ se6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        switch (this.a) {
            case 0:
                ((ve6) this.b).getClass();
                hy hyVar = ((oe4) ((u6h) this.c).b).y;
                hyVar.getClass();
                hyVar.obtainMessage(i, bArr).sendToTarget();
                return;
            default:
                ((ve6) this.b).getClass();
                hy hyVar2 = ((pe4) ((b8d) this.c).a).y;
                hyVar2.getClass();
                hyVar2.obtainMessage(i, bArr).sendToTarget();
                return;
        }
    }
}
