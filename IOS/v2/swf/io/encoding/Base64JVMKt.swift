package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\b\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\b\u001a%\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\b¨\u0006\u000e"}, d2 = {"platformCharsToBytes", "", "Lkotlin/io/encoding/Base64;", "source", "", "startIndex", "", "endIndex", "platformEncodeIntoByteArray", "destination", "destinationOffset", "platformEncodeToByteArray", "platformEncodeToString", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64JVMKt {
    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final byte[] platformCharsToBytes(Base64 base64, CharSequence charSequence, int i, int i2) {
        if (!(charSequence instanceof String)) {
            return base64.charsToBytesImpl$kotlin_stdlib(charSequence, i, i2);
        }
        base64.checkSourceBounds$kotlin_stdlib(((String) charSequence).length(), i, i2);
        return ((String) charSequence).substring(i, i2).getBytes(Charsets.ISO_8859_1);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final int platformEncodeIntoByteArray(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        return base64.encodeIntoByteArrayImpl$kotlin_stdlib(bArr, bArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final byte[] platformEncodeToByteArray(Base64 base64, byte[] bArr, int i, int i2) {
        return base64.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final String platformEncodeToString(Base64 base64, byte[] bArr, int i, int i2) {
        return new String(base64.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2), Charsets.ISO_8859_1);
    }
}
