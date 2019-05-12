package CustomText.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTemplateContextContributor;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldRenderingContext;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;


@Component(
	    immediate = true,
	    property = "ddm.form.field.type.name=CustomText",
	    service = {
	        DDMFormFieldTemplateContextContributor.class,
	        CustomTextDDMFormFieldTemplateContextContributor.class
	    }
	)
public class CustomTextDDMFormFieldTemplateContextContributor implements DDMFormFieldTemplateContextContributor {

	@Override
	public Map<String, Object> getParameters(DDMFormField ddmFormField,
			DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {
		Map<String, Object> params = new HashMap<>();	
		params.put("maxchars", (String) ddmFormField.getProperty("maxchars"));	
		params.put("hidden", (boolean) ddmFormField.getProperty("hidden"));
		//params.put("prev", (boolean) ddmFormField.getProperty("prev"));
		return params;
	}
	
	

}
