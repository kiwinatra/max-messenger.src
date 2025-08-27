package defpackage;

/* renamed from: cp5  reason: default package */
public final class cp5 {
    public long a;
    public long b;
    public boolean c = false;
    public final bp5 d;

    public cp5(bp5 bp5) {
        if (bp5 != null) {
            this.d = bp5;
        } else {
            this.d = new ci5(29);
        }
    }

    public static long a(String str) {
        String str2 = null;
        for (String str3 : str.split("\n")) {
            if (str3.startsWith("a=fingerprint")) {
                String[] split = str3.split(" ");
                if (split.length == 2) {
                    str2 = split[1];
                }
            }
        }
        if (str2 == null) {
            return -1;
        }
        String[] split2 = str2.split(":");
        long j = 0;
        for (int min = Math.min(7, split2.length - 1); min >= 0; min--) {
            j = (j << 8) | ((long) Integer.parseInt(split2[min], 16));
        }
        return j;
    }
}
