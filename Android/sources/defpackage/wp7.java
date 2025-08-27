package defpackage;

/* renamed from: wp7  reason: default package */
public enum wp7 {
    NOT_AVAILABLE(-1, (int) null),
    START_OBJECT(1, "{"),
    END_OBJECT(2, "}"),
    START_ARRAY(3, "["),
    END_ARRAY(4, "]"),
    FIELD_NAME(5, (int) null),
    VALUE_STRING(6, (int) null),
    VALUE_NUMBER_INT(7, (int) null),
    VALUE_NUMBER_FLOAT(8, (int) null),
    VALUE_TRUE(9, "true"),
    VALUE_FALSE(10, "false"),
    VALUE_NULL(11, "null");
    
    public final String a;
    public final char[] b;
    public final byte[] c;
    public final int o;
    public final boolean v;
    public final boolean w;

    /* access modifiers changed from: public */
    wp7(int i, String str) {
        boolean z = false;
        if (str == null) {
            this.a = null;
            this.b = null;
            this.c = null;
        } else {
            this.a = str;
            char[] charArray = str.toCharArray();
            this.b = charArray;
            int length = charArray.length;
            this.c = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.c[i2] = (byte) this.b[i2];
            }
        }
        this.o = i;
        if (i != 10) {
        }
        if (i != 7) {
        }
        this.v = i == 1 || i == 3;
        this.w = (i == 2 || i == 4) ? true : z;
    }
}
