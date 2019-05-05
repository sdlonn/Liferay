package CustomText.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;

import org.osgi.service.component.annotations.Component;

/**
 * @author sdlon
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.description=CustomText-description",
		"ddm.form.field.type.display.order:Integer=10",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.js.class.name=Liferay.DDM.Field.CustomText",
		"ddm.form.field.type.js.module=CustomText-form-field",
		"ddm.form.field.type.label=CustomText-label",
		"ddm.form.field.type.name=CustomText"
	},
	service = DDMFormFieldType.class
)
public class CustomTextDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public Class<? extends DDMFormFieldTypeSettings> getDDMFormFieldTypeSettings() {
		return CustomTextFormFieldTypeSettings.class;
	}

	@Override
	public String getName() {
		return "CustomText";
	}

}