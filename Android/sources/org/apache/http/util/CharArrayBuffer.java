package org.apache.http.util;

import org.apache.http.protocol.HTTP;

@Deprecated
public final class CharArrayBuffer {
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i) {
        if (i >= 0) {
            this.buffer = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void expand(int i) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public void append(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                int i4 = this.len + i2;
                if (i4 > this.buffer.length) {
                    expand(i4);
                }
                System.arraycopy(cArr, i, this.buffer, this.len, i2);
                this.len = i4;
            }
        }
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    public char charAt(int i) {
        return this.buffer[i];
    }

    public void clear() {
        this.len = 0;
    }

    public void ensureCapacity(int i) {
        int length = this.buffer.length;
        int i2 = this.len;
        if (i > length - i2) {
            expand(i2 + i);
        }
    }

    public int indexOf(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.len;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.buffer[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    public int length() {
        return this.len;
    }

    public void setLength(int i) {
        if (i < 0 || i > this.buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        this.len = i;
    }

    public String substring(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.len) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.buffer, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String substringTrimmed(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.len) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && HTTP.isWhitespace(this.buffer[i])) {
                i++;
            }
            while (i2 > i && HTTP.isWhitespace(this.buffer[i2 - 1])) {
                i2--;
            }
            return new String(this.buffer, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public char[] toCharArray() {
        int i = this.len;
        char[] cArr = new char[i];
        if (i > 0) {
            System.arraycopy(this.buffer, 0, cArr, 0, i);
        }
        return cArr;
    }

    public String toString() {
        return new String(this.buffer, 0, this.len);
    }

    public int indexOf(int i) {
        return indexOf(i, 0, this.len);
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.len + length;
        if (i > this.buffer.length) {
            expand(i);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i, int i2) {
        if (charArrayBuffer != null) {
            append(charArrayBuffer.buffer, i, i2);
        }
    }

    public void append(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            append(charArrayBuffer.buffer, 0, charArrayBuffer.len);
        }
    }

    public void append(char c) {
        int i = this.len + 1;
        if (i > this.buffer.length) {
            expand(i);
        }
        this.buffer[this.len] = c;
        this.len = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void append(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            if (r5 < 0) goto L_0x0034
            int r0 = r4.length
            if (r5 > r0) goto L_0x0034
            if (r6 < 0) goto L_0x0034
            int r0 = r5 + r6
            if (r0 < 0) goto L_0x0034
            int r1 = r4.length
            if (r0 > r1) goto L_0x0034
            if (r6 != 0) goto L_0x0014
            return
        L_0x0014:
            int r0 = r3.len
            int r6 = r6 + r0
            char[] r1 = r3.buffer
            int r1 = r1.length
            if (r6 <= r1) goto L_0x001f
            r3.expand(r6)
        L_0x001f:
            if (r0 >= r6) goto L_0x0031
            byte r1 = r4[r5]
            if (r1 >= 0) goto L_0x0027
            int r1 = r1 + 256
        L_0x0027:
            char[] r2 = r3.buffer
            char r1 = (char) r1
            r2[r0] = r1
            int r5 = r5 + 1
            int r0 = r0 + 1
            goto L_0x001f
        L_0x0031:
            r3.len = r6
            return
        L_0x0034:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.CharArrayBuffer.append(byte[], int, int):void");
    }

    public void append(ByteArrayBuffer byteArrayBuffer, int i, int i2) {
        if (byteArrayBuffer != null) {
            append(byteArrayBuffer.buffer(), i, i2);
        }
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }
}
