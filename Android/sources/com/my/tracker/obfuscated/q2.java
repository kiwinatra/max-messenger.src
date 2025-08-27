package com.my.tracker.obfuscated;

public final class q2 {
    private final long a;
    private final e2 b;
    private final e2[] c;
    private final v[] d;

    public q2(long j, e2 e2Var, e2[] e2VarArr, v[] vVarArr) {
        this.a = j;
        this.b = e2Var;
        this.c = e2VarArr;
        this.d = vVarArr;
    }

    public e2 a() {
        return this.b;
    }

    public v[] b() {
        return this.d;
    }

    public long c() {
        return this.a;
    }

    public e2[] d() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b != null) {
            sb.append("|-----\n| ");
            sb.append(this.b);
            sb.append("\n");
        }
        e2[] e2VarArr = this.c;
        if (e2VarArr != null && e2VarArr.length > 0) {
            sb.append("|-----\n");
            for (e2 append : this.c) {
                sb.append("| ");
                sb.append(append);
                sb.append("\n");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        v[] vVarArr = this.d;
        if (vVarArr != null && vVarArr.length > 0) {
            sb2.append("|-----\n");
            for (v append2 : this.d) {
                sb2.append("| ");
                sb2.append(append2);
                sb2.append("\n");
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.a + "\n" + sb + sb2 + "[/TimeSpentTickDTO]\n";
    }
}
