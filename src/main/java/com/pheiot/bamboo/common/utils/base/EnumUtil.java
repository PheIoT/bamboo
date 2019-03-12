package com.pheiot.bamboo.common.utils.base;

import org.apache.commons.lang3.EnumUtils;

import java.util.EnumSet;

/**
 * 枚举工具集
 *
 * @author Peter Li
 */
public class EnumUtil {

    /**
     * 将若干个枚举值转换为long，用于使用long保存多个选项的情况.
     */
    public static <E extends Enum<E>> long generateBits(final Class<E> enumClass, final Iterable<? extends E> values) {
        return EnumUtils.generateBitVector(enumClass, values);
    }

    /**
     * 将若干个枚举值转换为long，用于使用long保存多个选项的情况.
     */
    public static <E extends Enum<E>> long generateBits(final Class<E> enumClass, final E... values) {
        return EnumUtils.generateBitVector(enumClass, values);
    }

    /**
     * long重新解析为若干个枚举值，用于使用long保存多个选项的情况.
     */
    public static <E extends Enum<E>> EnumSet<E> processBits(final Class<E> enumClass, final long value) {
        return EnumUtils.processBitVector(enumClass, value);
    }

}
