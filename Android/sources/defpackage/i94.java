package defpackage;

/* renamed from: i94  reason: default package */
public enum i94 {
    DISABLED(0),
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);
    
    public static final i94[] v = null;
    public final int a;

    static {
        v = values();
    }

    /* access modifiers changed from: public */
    i94(int i) {
        this.a = i;
    }

    public static i94 a(int i) {
        for (i94 i94 : v) {
            if (i94.a == i) {
                return i94;
            }
        }
        return DISABLED;
    }
}
