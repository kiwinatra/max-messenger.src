package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Random {
    public static final Default Default = new Default((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        public int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        public byte[] nextBytes(byte[] bArr) {
            return Random.defaultRandom.nextBytes(bArr);
        }

        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        private Default() {
        }

        public byte[] nextBytes(int i) {
            return Random.defaultRandom.nextBytes(i);
        }

        public double nextDouble(double d) {
            return Random.defaultRandom.nextDouble(d);
        }

        public int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        public long nextLong(long j) {
            return Random.defaultRandom.nextLong(j);
        }

        public byte[] nextBytes(byte[] bArr, int i, int i2) {
            return Random.defaultRandom.nextBytes(bArr, i, i2);
        }

        public double nextDouble(double d, double d2) {
            return Random.defaultRandom.nextDouble(d, d2);
        }

        public int nextInt(int i, int i2) {
            return Random.defaultRandom.nextInt(i, i2);
        }

        public long nextLong(long j, long j2) {
            return Random.defaultRandom.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return random.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            throw new IllegalArgumentException(tr1.k(a81.n("fromIndex (", i, ") or toIndex (", i2, ") are out of range: 0.."), bArr.length, '.').toString());
        } else if (i <= i2) {
            int i3 = (i2 - i) / 4;
            for (int i4 = 0; i4 < i3; i4++) {
                int nextInt = nextInt();
                bArr[i] = (byte) nextInt;
                bArr[i + 1] = (byte) (nextInt >>> 8);
                bArr[i + 2] = (byte) (nextInt >>> 16);
                bArr[i + 3] = (byte) (nextInt >>> 24);
                i += 4;
            }
            int i5 = i2 - i;
            int nextBits = nextBits(i5 * 8);
            for (int i6 = 0; i6 < i5; i6++) {
                bArr[i + i6] = (byte) (nextBits >>> (i6 * 8));
            }
            return bArr;
        } else {
            throw new IllegalArgumentException(a81.l("fromIndex (", i, ") must be not greater than toIndex (", i2, ").").toString());
        }
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    public double nextDouble(double d, double d2) {
        double d3;
        RandomKt.checkRangeBounds(d, d2);
        double d4 = d2 - d;
        if (!Double.isInfinite(d4) || Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
            d3 = d + (nextDouble() * d4);
        } else {
            double d5 = (double) 2;
            double nextDouble = ((d2 / d5) - (d / d5)) * nextDouble();
            d3 = d + nextDouble + nextDouble;
        }
        return d3 >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : d3;
    }

    public int nextInt(int i, int i2) {
        int i3;
        int nextInt;
        int i4;
        RandomKt.checkRangeBounds(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = nextBits(RandomKt.fastLog2(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i4 = nextInt % i5;
                } while ((i5 - 1) + (nextInt - i4) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i <= nextInt2 && nextInt2 < i2) {
                return nextInt2;
            }
        }
    }

    public long nextLong(long j, long j2) {
        long j3;
        long nextLong;
        long j4;
        int nextInt;
        RandomKt.checkRangeBounds(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(RandomKt.fastLog2(i));
                } else if (i2 == 1) {
                    nextInt = nextInt();
                } else {
                    j3 = (((long) nextBits(RandomKt.fastLog2(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                j3 = ((long) nextInt) & 4294967295L;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j4 = nextLong % j5;
                } while ((j5 - 1) + (nextLong - j4) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j <= nextLong2 && nextLong2 < j2) {
                return nextLong2;
            }
        }
    }

    public byte[] nextBytes(byte[] bArr) {
        return nextBytes(bArr, 0, bArr.length);
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
