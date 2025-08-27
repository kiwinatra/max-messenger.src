package org.webrtc;

public interface Predicate<T> {
    Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() {
            public boolean test(T t) {
                return Predicate.this.test(t) && predicate.test(t);
            }
        };
    }

    Predicate<T> negate() {
        return new Predicate<T>() {
            public boolean test(T t) {
                return !Predicate.this.test(t);
            }
        };
    }

    Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>() {
            public boolean test(T t) {
                return Predicate.this.test(t) || predicate.test(t);
            }
        };
    }

    boolean test(T t);
}
