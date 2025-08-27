package kotlin.uuid;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\tH\b\u001a\r\u0010\n\u001a\u00020\u000b*\u00020\u0001H\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\u000bH\b¨\u0006\r"}, d2 = {"secureRandomUuid", "Lkotlin/uuid/Uuid;", "getUuid", "Ljava/nio/ByteBuffer;", "index", "", "putUuid", "uuid", "reverseBytes", "", "toJavaUuid", "Ljava/util/UUID;", "toKotlinUuid", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,226:1\n226#1:227\n226#1:228\n226#1:229\n226#1:230\n226#1:231\n226#1:232\n226#1:233\n226#1:234\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n88#1:227\n89#1:228\n133#1:229\n134#1:230\n173#1:231\n174#1:232\n220#1:233\n221#1:234\n*E\n"})
class UuidKt__UuidJVMKt {
    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer) {
        if (byteBuffer.position() + 15 < byteBuffer.limit()) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            if (Intrinsics.areEqual((Object) byteBuffer.order(), (Object) ByteOrder.LITTLE_ENDIAN)) {
                j = Long.reverseBytes(j);
                j2 = Long.reverseBytes(j2);
            }
            return Uuid.Companion.fromLongs(j, j2);
        }
        throw new BufferUnderflowException();
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, Uuid uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        } else if (Intrinsics.areEqual((Object) byteBuffer.order(), (Object) ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            return byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            return byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
    }

    public static final long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    @ExperimentalUuidApi
    public static final Uuid secureRandomUuid() {
        byte[] bArr = new byte[16];
        SecureRandomHolder.INSTANCE.getInstance().nextBytes(bArr);
        return UuidKt__UuidKt.uuidFromRandomBytes(bArr);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final UUID toJavaUuid(Uuid uuid) {
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid toKotlinUuid(UUID uuid) {
        return Uuid.Companion.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(wj6.h(i, "Negative index: "));
        } else if (i + 15 < byteBuffer.limit()) {
            long j = byteBuffer.getLong(i);
            long j2 = byteBuffer.getLong(i + 8);
            if (Intrinsics.areEqual((Object) byteBuffer.order(), (Object) ByteOrder.LITTLE_ENDIAN)) {
                j = Long.reverseBytes(j);
                j2 = Long.reverseBytes(j2);
            }
            return Uuid.Companion.fromLongs(j, j2);
        } else {
            StringBuilder o = wj6.o(i, "Not enough bytes to read a uuid at index: ", ", with limit: ");
            o.append(byteBuffer.limit());
            o.append(' ');
            throw new IndexOutOfBoundsException(o.toString());
        }
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, int i, Uuid uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i < 0) {
            throw new IndexOutOfBoundsException(wj6.h(i, "Negative index: "));
        } else if (i + 15 >= byteBuffer.limit()) {
            StringBuilder o = wj6.o(i, "Not enough capacity to write a uuid at index: ", ", with limit: ");
            o.append(byteBuffer.limit());
            o.append(' ');
            throw new IndexOutOfBoundsException(o.toString());
        } else if (Intrinsics.areEqual((Object) byteBuffer.order(), (Object) ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(i, mostSignificantBits);
            return byteBuffer.putLong(i + 8, leastSignificantBits);
        } else {
            byteBuffer.putLong(i, Long.reverseBytes(mostSignificantBits));
            return byteBuffer.putLong(i + 8, Long.reverseBytes(leastSignificantBits));
        }
    }
}
