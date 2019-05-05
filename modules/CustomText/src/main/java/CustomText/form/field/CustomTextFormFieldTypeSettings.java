package CustomText.form.field;

import com.liferay.dynamic.data.mapping.annotations.DDMForm;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayout;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.form.field.type.DefaultDDMFormFieldTypeSettings;

@DDMForm
@DDMFormLayout(
    paginationMode = com.liferay.dynamic.data.mapping.model.DDMFormLayout.TABBED_MODE,
    value = {
        @DDMFormLayoutPage(
            title = "%basic",
            value = {
                @DDMFormLayoutRow(
                    {
                        @DDMFormLayoutColumn(
                            size = 12,
                            value = {
                                "label", "required", "tip", "maxchars"
                            }
                        )
                    }
                )
            }
        ),
        @DDMFormLayoutPage(
            title = "%properties",
            value = {
                @DDMFormLayoutRow(
                    {
                        @DDMFormLayoutColumn(
                            size = 12,
                            value = {
                                "dataType", "name", "showLabel", "repeatable",
                                "type", "validation", "visibilityExpression"
                            }
                        )
                    }
                )
            }
        )
    }
)


public interface CustomTextFormFieldTypeSettings extends DefaultDDMFormFieldTypeSettings {
	
	
	@DDMFormField(label = "%Maxchars")
	public int maxchars();

}
