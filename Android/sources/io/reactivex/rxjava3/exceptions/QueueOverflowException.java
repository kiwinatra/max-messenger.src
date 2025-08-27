package io.reactivex.rxjava3.exceptions;

public final class QueueOverflowException extends RuntimeException {
    public QueueOverflowException() {
        super("Queue overflow due to illegal concurrent onNext calls or a bug in an operator");
    }
}
