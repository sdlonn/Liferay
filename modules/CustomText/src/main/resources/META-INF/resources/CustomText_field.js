AUI.add(
	'CustomText-form-field',
	function(A) {
		var CustomTextField = A.Component.create(
			{
				ATTRS: {
					maxchars: {
						value: ''
					},
					hidden: {
						value: 'false'
					},
					prev: {
						value: 'false'
					},
					type: {
						value: 'CustomText-form-field'
					}
				},

				EXTENDS: Liferay.DDM.Renderer.Field,

				NAME: 'CustomText-form-field',

				prototype: {
					
				
					getTemplateContext: function() {
						var instance = this;

						return A.merge(
								CustomTextField.superclass.getTemplateContext.apply(instance, arguments), {
									maxchars: instance.get('maxchars'),
									hidden: instance.get('hidden')
								}
						);
						
					}
						
				}
			}
		);

		Liferay.namespace('DDM.Field').CustomText = CustomTextField;
	},
	'',
	{
		requires: ['liferay-ddm-form-renderer-field']
	}
);
AUI().use('event', 'CustomText-form-field', function(A) {
	var instance = this;
	var d = A.one('#xtr');
	var c = A.one('#help');
	console.log('logg: ');
	d.on('click', function(event){
		c.toggleView();
		   alert('hello');
		});
});