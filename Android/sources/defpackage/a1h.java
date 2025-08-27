package defpackage;

import java.io.Serializable;

/* renamed from: a1h  reason: default package */
public enum a1h {
    VOID(Void.class, (int) null),
    INT(r6, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(c44.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(fzg.class, fzg.c),
    ENUM(r6, (int) null),
    MESSAGE(Object.class, (int) null);
    
    public final Object a;

    /* access modifiers changed from: public */
    a1h(Class cls, Serializable serializable) {
    }
}
