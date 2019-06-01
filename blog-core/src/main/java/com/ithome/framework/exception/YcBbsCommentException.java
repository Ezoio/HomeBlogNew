package com.ithome.framework.exception;

/**
 * @author Rick jiang (speedhero@126.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/4/16 16:26
 * @since 1.0
 */
public class YcBbsCommentException extends YcBbsException {
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public YcBbsCommentException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message
     *         the detail message. The detail message is saved for
     *         later retrieval by the {@link #getMessage()} method.
     */
    public YcBbsCommentException(String message) {
        super(message);
    }
}
