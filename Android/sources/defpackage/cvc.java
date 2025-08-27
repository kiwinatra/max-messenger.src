package defpackage;

import java.io.Serializable;

/* renamed from: cvc  reason: default package */
public enum cvc implements Serializable {
    UNKNOWN(0),
    EMOJI(1),
    STICKER(2),
    GIF(3),
    ANIMOJI(4);
    
    public final int a;

    /* access modifiers changed from: public */
    cvc(int i) {
        this.a = i;
    }
}
