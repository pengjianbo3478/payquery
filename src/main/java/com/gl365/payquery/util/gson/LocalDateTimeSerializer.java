package com.gl365.payquery.util.gson;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.gl365.payquery.enums.system.DateFormatStyle;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime> {
	@Override
	public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext context) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateFormatStyle.FULL.getValue());
		return new JsonPrimitive(formatter.format(localDateTime));
	}
}