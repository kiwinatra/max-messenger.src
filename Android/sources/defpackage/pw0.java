package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;

/* renamed from: pw0  reason: default package */
public final class pw0 extends FilterOutputStream {
    public final /* synthetic */ int a;
    public final OutputStream b;
    public ByteOrder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw0(OutputStream outputStream, ByteOrder byteOrder, int i) {
        super(outputStream);
        this.a = i;
        this.b = outputStream;
        this.c = byteOrder;
    }

    public void a(int i) {
        this.b.write(i);
    }

    public final void b(int i) {
        switch (this.a) {
            case 0:
                ByteOrder byteOrder = this.c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.b;
                if (byteOrder == byteOrder2) {
                    outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else {
                    return;
                }
            default:
                ByteOrder byteOrder3 = this.c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.b;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else {
                    return;
                }
        }
    }

    public final void d(short s) {
        switch (this.a) {
            case 0:
                ByteOrder byteOrder = this.c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.b;
                if (byteOrder == byteOrder2) {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write(s & 255);
                    return;
                } else {
                    return;
                }
            default:
                ByteOrder byteOrder3 = this.c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.b;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(s & 255);
                    outputStream2.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    return;
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream2.write(s & 255);
                    return;
                } else {
                    return;
                }
        }
    }

    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.b.write(bArr);
                return;
            default:
                this.b.write(bArr);
                return;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.write(bArr, i, i2);
                return;
            default:
                this.b.write(bArr, i, i2);
                return;
        }
    }
}
