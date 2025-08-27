package defpackage;

import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: hb9  reason: default package */
public enum hb9 {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);
    
    public static final hb9[] U0 = null;
    public final int a;

    static {
        hb9 hb9;
        U0 = new hb9[256];
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & ByteCompanionObject.MIN_VALUE) != 0) {
                byte b2 = b & -32;
                if (b2 != -32) {
                    if (b2 != -96) {
                        byte b3 = b & -16;
                        if (b3 != -112) {
                            if (b3 != Byte.MIN_VALUE) {
                                switch (b) {
                                    case -64:
                                        hb9 = NIL;
                                        break;
                                    case -62:
                                    case -61:
                                        hb9 = BOOLEAN;
                                        break;
                                    case -60:
                                        hb9 = BIN8;
                                        break;
                                    case -59:
                                        hb9 = BIN16;
                                        break;
                                    case -58:
                                        hb9 = BIN32;
                                        break;
                                    case -57:
                                        hb9 = EXT8;
                                        break;
                                    case -56:
                                        hb9 = EXT16;
                                        break;
                                    case -55:
                                        hb9 = EXT32;
                                        break;
                                    case -54:
                                        hb9 = FLOAT32;
                                        break;
                                    case -53:
                                        hb9 = FLOAT64;
                                        break;
                                    case -52:
                                        hb9 = UINT8;
                                        break;
                                    case -51:
                                        hb9 = UINT16;
                                        break;
                                    case -50:
                                        hb9 = UINT32;
                                        break;
                                    case -49:
                                        hb9 = UINT64;
                                        break;
                                    case -48:
                                        hb9 = INT8;
                                        break;
                                    case -47:
                                        hb9 = INT16;
                                        break;
                                    case -46:
                                        hb9 = INT32;
                                        break;
                                    case -45:
                                        hb9 = INT64;
                                        break;
                                    case -44:
                                        hb9 = FIXEXT1;
                                        break;
                                    case -43:
                                        hb9 = FIXEXT2;
                                        break;
                                    case -42:
                                        hb9 = FIXEXT4;
                                        break;
                                    case -41:
                                        hb9 = FIXEXT8;
                                        break;
                                    case -40:
                                        hb9 = FIXEXT16;
                                        break;
                                    case -39:
                                        hb9 = STR8;
                                        break;
                                    case -38:
                                        hb9 = STR16;
                                        break;
                                    case -37:
                                        hb9 = STR32;
                                        break;
                                    case -36:
                                        hb9 = ARRAY16;
                                        break;
                                    case -35:
                                        hb9 = ARRAY32;
                                        break;
                                    case -34:
                                        hb9 = MAP16;
                                        break;
                                    case -33:
                                        hb9 = MAP32;
                                        break;
                                    default:
                                        hb9 = NEVER_USED;
                                        break;
                                }
                            } else {
                                hb9 = FIXMAP;
                            }
                        } else {
                            hb9 = FIXARRAY;
                        }
                    } else {
                        hb9 = FIXSTR;
                    }
                } else {
                    hb9 = NEGFIXINT;
                }
            } else {
                hb9 = POSFIXINT;
            }
            U0[i] = hb9;
        }
    }

    /* access modifiers changed from: public */
    hb9(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new RuntimeException("Cannot convert NEVER_USED to ValueType");
    }
}
