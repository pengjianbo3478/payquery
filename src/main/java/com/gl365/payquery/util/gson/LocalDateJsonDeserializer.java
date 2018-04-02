package com.gl365.payquery.util.gson;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.gl365.payquery.enums.system.DateFormatStyle;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class LocalDateJsonDeserializer implements JsonDeserializer<LocalDate> {
	@Override
	public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		return LocalDate.parse(json.getAsString(), DateTimeFormatter.ofPattern(DateFormatStyle.SHORT.getValue()));
	}
}