import Component from 'metal-component';
import Soy from 'metal-soy';

import templates from './CustomText.soy';

/**
 * CustomText Component
 */
class CustomText extends Component {}

// Register component
Soy.register(CustomText, templates, 'render');

if (!window.DDMCustomText) {
	window.DDMCustomText = {

	};
}

window.DDMCustomText.render = CustomText;

export default CustomText;