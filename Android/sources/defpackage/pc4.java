package defpackage;

import android.media.AudioTrack;

/* renamed from: pc4  reason: default package */
public final class pc4 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        uc5 uc5;
        sc4 sc4;
        e4 e4Var;
        vc5 vc5;
        switch (this.a) {
            case 0:
                o5h o5h = (o5h) this.b;
                y64.j(audioTrack == ((rc4) o5h.c).u);
                rc4 rc4 = (rc4) o5h.c;
                wie wie = rc4.r;
                if (wie != null && rc4.U && (uc5 = ((kn8) wie.b).Y1) != null) {
                    uc5.a.y.c(2);
                    return;
                }
                return;
            default:
                qc4 qc4 = (qc4) this.b;
                if (audioTrack.equals(qc4.c.w) && (e4Var = sc4.s) != null && (sc4 = qc4.c).Y && (vc5 = ((ln8) e4Var.b).P0) != null) {
                    vc5.a();
                    return;
                }
                return;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.a) {
            case 1:
                qc4 qc4 = (qc4) this.b;
                if (audioTrack.equals(qc4.c.w)) {
                    qc4.c.X = true;
                    return;
                }
                return;
            default:
                super.onPresentationEnded(audioTrack);
                return;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        uc5 uc5;
        sc4 sc4;
        e4 e4Var;
        vc5 vc5;
        switch (this.a) {
            case 0:
                o5h o5h = (o5h) this.b;
                y64.j(audioTrack == ((rc4) o5h.c).u);
                rc4 rc4 = (rc4) o5h.c;
                wie wie = rc4.r;
                if (wie != null && rc4.U && (uc5 = ((kn8) wie.b).Y1) != null) {
                    uc5.a.y.c(2);
                    return;
                }
                return;
            default:
                qc4 qc4 = (qc4) this.b;
                if (audioTrack.equals(qc4.c.w) && (e4Var = sc4.s) != null && (sc4 = qc4.c).Y && (vc5 = ((ln8) e4Var.b).P0) != null) {
                    vc5.a();
                    return;
                }
                return;
        }
    }
}
