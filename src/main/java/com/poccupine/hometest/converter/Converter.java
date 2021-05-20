package com.poccupine.hometest.converter;

import org.springframework.lang.Nullable;

/**
 * Convert the source object of type {@code S} to target type {@code T}.
 *
 * @param <S> the source object to convert
 * @param <T> the target object to convert
 */
public interface Converter<S, T> {

	/**
	 * Convert the source object of type {@code S} to target type {@code T}.
	 *
	 * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
	 * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
	 */
	@Nullable
	T convert(S source);
}
