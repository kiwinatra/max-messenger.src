package defpackage;

/* renamed from: tdb  reason: default package */
public final class tdb extends ibf {
    public String c;
    public int o;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        if (r8.equals("CALL_DELAY") == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 4
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            r9.getClass()
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1152399466: goto L_0x0054;
                case -1135546573: goto L_0x0049;
                case -1071441467: goto L_0x003e;
                case 110541305: goto L_0x0033;
                case 141498579: goto L_0x0028;
                case 1098377542: goto L_0x001d;
                case 1150097001: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            r9 = r5
            goto L_0x005e
        L_0x0012:
            java.lang.String r6 = "requestType"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x001b
            goto L_0x0010
        L_0x001b:
            r9 = 6
            goto L_0x005e
        L_0x001d:
            java.lang.String r6 = "retries"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0026
            goto L_0x0010
        L_0x0026:
            r9 = 5
            goto L_0x005e
        L_0x0028:
            java.lang.String r6 = "tokenType"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0031
            goto L_0x0010
        L_0x0031:
            r9 = r0
            goto L_0x005e
        L_0x0033:
            java.lang.String r6 = "token"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x003c
            goto L_0x0010
        L_0x003c:
            r9 = r1
            goto L_0x005e
        L_0x003e:
            java.lang.String r6 = "callDelay"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0047
            goto L_0x0010
        L_0x0047:
            r9 = r3
            goto L_0x005e
        L_0x0049:
            java.lang.String r6 = "codeLength"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0052
            goto L_0x0010
        L_0x0052:
            r9 = r4
            goto L_0x005e
        L_0x0054:
            java.lang.String r6 = "codeDelay"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x005d
            goto L_0x0010
        L_0x005d:
            r9 = r2
        L_0x005e:
            switch(r9) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00c0;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0066;
                default: goto L_0x0061;
            }
        L_0x0061:
            r8.A()
            goto L_0x00cd
        L_0x0066:
            java.lang.String r8 = defpackage.ryg.g0(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case -976824254: goto L_0x008c;
                case 82233: goto L_0x0081;
                case 2060894: goto L_0x0076;
                default: goto L_0x0074;
            }
        L_0x0074:
            r2 = r5
            goto L_0x0095
        L_0x0076:
            java.lang.String r9 = "CALL"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x007f
            goto L_0x0074
        L_0x007f:
            r2 = r3
            goto L_0x0095
        L_0x0081:
            java.lang.String r9 = "SMS"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x008a
            goto L_0x0074
        L_0x008a:
            r2 = r4
            goto L_0x0095
        L_0x008c:
            java.lang.String r9 = "CALL_DELAY"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0095
            goto L_0x0074
        L_0x0095:
            switch(r2) {
                case 0: goto L_0x009c;
                case 1: goto L_0x009a;
                case 2: goto L_0x009d;
                default: goto L_0x0098;
            }
        L_0x0098:
            r0 = r4
            goto L_0x009d
        L_0x009a:
            r0 = r3
            goto L_0x009d
        L_0x009c:
            r0 = r1
        L_0x009d:
            r7.z = r0
            goto L_0x00cd
        L_0x00a0:
            int r8 = defpackage.ryg.c0(r8)
            r7.o = r8
            goto L_0x00cd
        L_0x00a7:
            java.lang.String r8 = defpackage.ryg.g0(r8)
            int r8 = defpackage.i2a.v(r8)
            r7.y = r8
            goto L_0x00cd
        L_0x00b2:
            java.lang.String r8 = defpackage.ryg.g0(r8)
            r7.c = r8
            goto L_0x00cd
        L_0x00b9:
            int r8 = defpackage.ryg.c0(r8)
            r7.x = r8
            goto L_0x00cd
        L_0x00c0:
            int r8 = defpackage.ryg.c0(r8)
            r7.w = r8
            goto L_0x00cd
        L_0x00c7:
            int r8 = defpackage.ryg.c0(r8)
            r7.v = r8
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdb.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        String G = cvg.G(this.c);
        int i = this.o;
        int i2 = this.v;
        int i3 = this.w;
        int i4 = this.y;
        int i5 = this.x;
        int i6 = this.z;
        StringBuilder sb = new StringBuilder("{token='");
        sb.append(G);
        sb.append("', retries=");
        sb.append(i);
        sb.append(", codeDelay=");
        g63.o(sb, i2, ", codeLength=", i3, ", tokenType=");
        sb.append(i2a.r(i4));
        sb.append(", callDelay=");
        sb.append(i5);
        sb.append(", requestType=");
        sb.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "CALL" : "CALL_DELAY" : "SMS" : "UNKNOWN");
        sb.append("}");
        return sb.toString();
    }
}
