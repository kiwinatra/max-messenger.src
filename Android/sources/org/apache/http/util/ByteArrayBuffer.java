package org.apache.http.util;

@Deprecated
public final class ByteArrayBuffer {
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i) {
        if (i >= 0) {
            this.buffer = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void expand(int i) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public void append(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                int i4 = this.len + i2;
                if (i4 > this.buffer.length) {
                    expand(i4);
                }
                System.arraycopy(bArr, i, this.buffer, this.len, i2);
                this.len = i4;
            }
        }
    }

    public byte[] buffer() {
        return this.buffer;
    }

    public int byteAt(int i) {
        return this.buffer[i];
    }

    public int capacity() {
        return this.buffer.length;
    }

    public void clear() {
        this.len = 0;
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

    public byte[] toByteArray() {
        int i = this.len;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i);
        }
        return bArr;
    }

    public void append(int i) {
        int i2 = this.len + 1;
        if (i2 > this.buffer.length) {
            expand(i2);
        }
        this.buffer[this.len] = (byte) i;
        this.len = i2;
    }

    public void append(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                int i4 = this.len;
                int i5 = i2 + i4;
                if (i5 > this.buffer.length) {
                    expand(i5);
                }
                while (i4 < i5) {
                    this.buffer[i4] = (byte) cArr[i];
                    i++;
                    i4++;
                }
                this.len = i5;
            }
        }
    }

    public void append(CharArrayBuffer charArrayBuffer, int i, int i2) {
        if (charArrayBuffer != null) {
            append(charArrayBuffer.buffer(), i, i2);
        }
    }
}
