;(function() {
	AUI().applyConfig(
		{  
			groups: {
				'field-CustomText': {
					base: MODULE_PATH + '/',
					combine: Liferay.AUI.getCombine(),
					filter: Liferay.AUI.getFilterConfig(),
					modules: {
						'CustomText-form-field': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'CustomText_field.js',
							requires: [
								'liferay-ddm-form-renderer-field'
							]
						}
					},
					root: MODULE_PATH + '/'
				}
			}
		}
	);
})();