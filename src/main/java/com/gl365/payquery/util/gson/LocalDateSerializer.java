package com.gl365.payquery.util.gson;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.gl365.payquery.enums.system.DateFormatStyle;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateSerializer implements JsonSerializer<LocalDate> {
	@Override
	public JsonElement serialize(LocalDate localDate, Type type, JsonSerializationContext context) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateFormatStyle.SHORT.getValue());
		return new JsonPrimitive(formatter.format(localDate));
	}
}