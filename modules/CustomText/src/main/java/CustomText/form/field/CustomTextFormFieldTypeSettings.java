package CustomText.form.field;

import com.liferay.dynamic.data.mapping.annotations.DDMForm;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayout;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.form.field.type.DefaultDDMFormFieldTypeSettings;
import com.liferay.dynamic.data.mapping.model.LocalizedValue;


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
                                "label", "required", "tip", "maxchars", "predefinedValue" , "indexType", "hidden", "prev"
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
	
	@DDMFormField(label = "%Hidden")
	public boolean hidden();
	
	@DDMFormField(label = "%Prev", predefinedValue = "true",
			visibilityExpression = "FALSE")
	public boolean prev();

	@DDMFormField(
			label = "%indexable",
			optionLabels = {
				"%px", "%em"
			},
			optionValues = {"px", "em"},
			predefinedValue = "keyword", type = "radio"
		)
		public String indexType();
	
	@DDMFormField(
			label = "%predefined-value",
			properties = {
				"placeholder=%enter-a-default-value",
				"tooltip=%enter-a-default-value-that-is-submitted-if-no-other-value-is-entered"
			},
			type = "text"
		)
		public LocalizedValue predefinedValue();
}
