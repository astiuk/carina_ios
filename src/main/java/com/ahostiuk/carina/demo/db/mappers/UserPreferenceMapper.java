package com.ahostiuk.carina.demo.db.mappers;

import com.ahostiuk.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
