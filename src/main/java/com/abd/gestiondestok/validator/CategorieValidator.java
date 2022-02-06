package com.abd.gestiondestok.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.abd.gestiondestok.dto.CategorieDTO;

public class CategorieValidator {

	public static List<String> validate(CategorieDTO categorieDTO){
		
		List<String> errors = new ArrayList<String>();
		
		if(!StringUtils.hasLength(categorieDTO.getCode())) {
			errors.add("Veuillez renseigner le code de la categorie");
		}
		return errors;
	}
}
