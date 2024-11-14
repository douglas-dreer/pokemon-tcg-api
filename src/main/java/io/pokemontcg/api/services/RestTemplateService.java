package io.pokemontcg.api.services;

import io.pokemontcg.api.enums.EndPointType;
import io.pokemontcg.api.models.Params;

public abstract class RestTemplateService {
    abstract public <T> T fetchData(EndPointType endPointType, Params params, Class<T> clazz);
}
