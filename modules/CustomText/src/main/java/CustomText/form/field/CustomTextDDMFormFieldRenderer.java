package CustomText.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldRenderer;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldRenderer;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldRenderingContext;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateResource;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author sdlon
 */
@Component(
	immediate = true,
	property = "ddm.form.field.type.name=CustomText",
	service = DDMFormFieldRenderer.class
)
public class CustomTextDDMFormFieldRenderer extends BaseDDMFormFieldRenderer {
	
	@Reference
	protected CustomTextDDMFormFieldTemplateContextContributor customTextDDMFormFieldTemplateContextContributor;
	
	private TemplateResource _templateResource;

	@Override
	public String getTemplateLanguage() {
		return TemplateConstants.LANG_TYPE_SOY;
	}

	@Override
	public String getTemplateNamespace() {
		return "DDMCustomText.render";
	}

	@Override
	public TemplateResource getTemplateResource() {
		return _templateResource;
	}

	@Activate
	protected void activate(Map<String, Object> properties) {
		_templateResource = getTemplateResource(
			"/META-INF/resources/CustomText.soy");
	}

	@Override
	protected void populateOptionalContext(Template template, DDMFormField ddmFormField,
			DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {
		Map<String, Object> params = customTextDDMFormFieldTemplateContextContributor
				.getParameters(ddmFormField, ddmFormFieldRenderingContext);
		template.putAll(params);
	}
	
}