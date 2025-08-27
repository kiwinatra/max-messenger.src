package defpackage;

/* renamed from: xge  reason: default package */
public abstract class xge implements pp9 {
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
